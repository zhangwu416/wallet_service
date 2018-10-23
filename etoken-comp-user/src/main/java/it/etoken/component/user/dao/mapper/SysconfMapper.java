package it.etoken.component.user.dao.mapper;

import it.etoken.base.model.user.entity.Sysconf;
import it.etoken.base.model.user.entity.SysconfExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface SysconfMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sysconf
	 * @mbg.generated  Thu Oct 18 19:43:29 CST 2018
	 */
	@SelectProvider(type = SysconfSqlProvider.class, method = "countByExample")
	long countByExample(SysconfExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sysconf
	 * @mbg.generated  Thu Oct 18 19:43:29 CST 2018
	 */
	@DeleteProvider(type = SysconfSqlProvider.class, method = "deleteByExample")
	int deleteByExample(SysconfExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sysconf
	 * @mbg.generated  Thu Oct 18 19:43:29 CST 2018
	 */
	@Delete({ "delete from sysconf", "where id = #{id,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sysconf
	 * @mbg.generated  Thu Oct 18 19:43:29 CST 2018
	 */
	@Insert({ "insert into sysconf (id, name, ", "description, value, ", "createdate, modifydate)",
			"values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
			"#{description,jdbcType=VARCHAR}, #{value,jdbcType=VARCHAR}, ",
			"#{createdate,jdbcType=TIMESTAMP}, #{modifydate,jdbcType=TIMESTAMP})" })
	int insert(Sysconf record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sysconf
	 * @mbg.generated  Thu Oct 18 19:43:29 CST 2018
	 */
	@InsertProvider(type = SysconfSqlProvider.class, method = "insertSelective")
	int insertSelective(Sysconf record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sysconf
	 * @mbg.generated  Thu Oct 18 19:43:29 CST 2018
	 */
	@SelectProvider(type = SysconfSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
			@Result(column = "value", property = "value", jdbcType = JdbcType.VARCHAR),
			@Result(column = "createdate", property = "createdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "modifydate", property = "modifydate", jdbcType = JdbcType.TIMESTAMP) })
	List<Sysconf> selectByExample(SysconfExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sysconf
	 * @mbg.generated  Thu Oct 18 19:43:29 CST 2018
	 */
	@Select({ "select", "id, name, description, value, createdate, modifydate", "from sysconf",
			"where id = #{id,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
			@Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR),
			@Result(column = "value", property = "value", jdbcType = JdbcType.VARCHAR),
			@Result(column = "createdate", property = "createdate", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "modifydate", property = "modifydate", jdbcType = JdbcType.TIMESTAMP) })
	Sysconf selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sysconf
	 * @mbg.generated  Thu Oct 18 19:43:29 CST 2018
	 */
	@UpdateProvider(type = SysconfSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") Sysconf record, @Param("example") SysconfExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sysconf
	 * @mbg.generated  Thu Oct 18 19:43:29 CST 2018
	 */
	@UpdateProvider(type = SysconfSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") Sysconf record, @Param("example") SysconfExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sysconf
	 * @mbg.generated  Thu Oct 18 19:43:29 CST 2018
	 */
	@UpdateProvider(type = SysconfSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Sysconf record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sysconf
	 * @mbg.generated  Thu Oct 18 19:43:29 CST 2018
	 */
	@Update({ "update sysconf", "set name = #{name,jdbcType=VARCHAR},",
			"description = #{description,jdbcType=VARCHAR},", "value = #{value,jdbcType=VARCHAR},",
			"createdate = #{createdate,jdbcType=TIMESTAMP},", "modifydate = #{modifydate,jdbcType=TIMESTAMP}",
			"where id = #{id,jdbcType=INTEGER}" })
	int updateByPrimaryKey(Sysconf record);
}