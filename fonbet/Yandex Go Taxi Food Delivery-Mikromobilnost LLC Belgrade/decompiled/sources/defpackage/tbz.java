package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

/* loaded from: classes.dex */
public final class tbz {
    public final Context a;

    public tbz(Context context) {
        cvw.l(context);
        Context applicationContext = context.getApplicationContext();
        cvw.l(applicationContext);
        this.a = applicationContext;
    }

    public int a(String str) {
        try {
            return qke.h(this.a, str);
        } catch (Exception e) {
            jgz jgzVar = jgz.a;
            jgz.d(e, "Failed to check permission ".concat(str), new Object[0]);
            return -1;
        }
    }

    public ApplicationInfo b(int i, String str) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo c(int i, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public boolean d() {
        return a("android.permission.ACCESS_FINE_LOCATION") == 0 && a("android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public boolean e() {
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.a;
        if (callingUid == myUid) {
            return q3w.a(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}
