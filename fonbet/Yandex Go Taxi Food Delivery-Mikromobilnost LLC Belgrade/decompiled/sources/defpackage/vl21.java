package defpackage;

import com.yandex.messaging.core.net.entities.UserData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class vl21 {
    public abstract int a(String str);

    public abstract List b(long j, String str);

    public abstract List c(String str);

    public abstract List d(String str);

    public abstract void e(ArrayList arrayList);

    public final void f(String str, UserData.EmployeeInfo[] employeeInfoArr) {
        a(str);
        if (employeeInfoArr != null) {
            ArrayList arrayList = new ArrayList(employeeInfoArr.length);
            for (UserData.EmployeeInfo employeeInfo : employeeInfoArr) {
                long j = employeeInfo.organizationId;
                String str2 = employeeInfo.organizationName;
                UserData.DepartmentInfo departmentInfo = employeeInfo.department;
                arrayList.add(new xl21(str, j, str2, departmentInfo != null ? departmentInfo.name : null, employeeInfo.position, employeeInfo.isGuest, employeeInfo.deleted, employeeInfo.guestOrganizationName, employeeInfo.displayName));
            }
            e(arrayList);
        }
    }
}
