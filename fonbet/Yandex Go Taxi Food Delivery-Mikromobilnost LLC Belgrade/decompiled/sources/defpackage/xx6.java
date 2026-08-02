package defpackage;

import com.yandex.messaging.core.net.entities.DepartmentSearchData;
import com.yandex.messaging.core.net.entities.OrganizationSearchData;
import com.yandex.messaging.core.net.entities.Ranking;
import com.yandex.messaging.core.net.entities.SearchData;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class xx6 {
    public final kse a;
    public final lqo b;
    public final k020 c;
    public final j3u d;
    public final lwi e;
    public final doc f;
    public final h3y g;

    public xx6(to3 to3Var, kse kseVar, lqo lqoVar, k020 k020Var, j3u j3uVar, lwi lwiVar, doc docVar, h3y h3yVar) {
        this.a = kseVar;
        this.b = lqoVar;
        this.c = k020Var;
        this.d = j3uVar;
        this.e = lwiVar;
        this.f = docVar;
        this.g = h3yVar;
        Ranking.Companion companion = Ranking.INSTANCE;
        l4o l4oVar = tz10.a;
        companion.getClass();
        new Ranking("messenger_search_ranking", "");
    }

    public static final List a(xx6 xx6Var, SearchData.UsersGroupsDepartments usersGroupsDepartments, l020 l020Var) {
        ArrayList<SearchData.CommonSearchEntity> arrayList;
        ReducedUserInfo reducedUserInfo;
        UserData.EmployeeInfo[] employeeInfoArr;
        UserData.DepartmentInfo departmentInfo;
        xx6Var.getClass();
        SearchData.CommonSearchEntity[] commonSearchEntityArr = usersGroupsDepartments.items;
        if (commonSearchEntityArr != null) {
            arrayList = new ArrayList();
            for (SearchData.CommonSearchEntity commonSearchEntity : commonSearchEntityArr) {
                if (jl40.l(commonSearchEntity.entity, "user")) {
                    arrayList.add(commonSearchEntity);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return EmptyList.a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (SearchData.CommonSearchEntity commonSearchEntity2 : arrayList) {
            SearchData.CommonSearchData commonSearchData = commonSearchEntity2.data;
            String str = commonSearchData.guid;
            String str2 = commonSearchData.displayName;
            String str3 = commonSearchData.avatarId;
            String str4 = commonSearchData.phoneId;
            Long l = commonSearchData.version;
            if (str == null || l == null) {
                z83.i();
                reducedUserInfo = null;
            } else {
                reducedUserInfo = new ReducedUserInfo(str3, str2, str, str4, l.longValue(), null, null, null, null, null, false, null, 4064, null);
            }
            if (reducedUserInfo != null) {
                arrayList2.add(new sjt(reducedUserInfo.userId));
                OrganizationSearchData[] organizationSearchDataArr = commonSearchEntity2.data.employeesInfo;
                if (organizationSearchDataArr == null) {
                    employeeInfoArr = new UserData.EmployeeInfo[0];
                } else {
                    ArrayList arrayList3 = new ArrayList(organizationSearchDataArr.length);
                    for (OrganizationSearchData organizationSearchData : organizationSearchDataArr) {
                        UserData.EmployeeInfo employeeInfo = new UserData.EmployeeInfo();
                        employeeInfo.organizationId = organizationSearchData.getId();
                        employeeInfo.organizationName = organizationSearchData.getOrganizationName();
                        employeeInfo.position = organizationSearchData.getPosition();
                        DepartmentSearchData department = organizationSearchData.getDepartment();
                        if (department != null) {
                            departmentInfo = new UserData.DepartmentInfo();
                            departmentInfo.name = department.getName();
                        } else {
                            departmentInfo = null;
                        }
                        employeeInfo.department = departmentInfo;
                        if (xx6Var.b.a(tz10.L)) {
                            employeeInfo.isGuest = organizationSearchData.isGuest();
                            employeeInfo.guestOrganizationName = organizationSearchData.getGuestName();
                            employeeInfo.deleted = organizationSearchData.getDeleted();
                        }
                        employeeInfo.displayName = organizationSearchData.getDisplayName();
                        arrayList3.add(employeeInfo);
                    }
                    employeeInfoArr = (UserData.EmployeeInfo[]) arrayList3.toArray(new UserData.EmployeeInfo[0]);
                }
                nu21.d(l020Var.C, reducedUserInfo, employeeInfoArr, null, 4);
            }
        }
        return arrayList2;
    }
}
