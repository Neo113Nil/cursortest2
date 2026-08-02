package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class slp {
    public static final slp a = new slp();
    public static final cib b;

    static {
        r4f r4fVar = new r4f();
        r4fVar.a(rlp.class, ma2.a);
        r4fVar.a(dmp.class, na2.a);
        r4fVar.a(z97.class, ka2.a);
        r4fVar.a(iw0.class, ja2.a);
        r4fVar.a(mb0.class, ia2.a);
        r4fVar.a(zsm.class, la2.a);
        r4fVar.d = true;
        b = new cib(8, r4fVar);
    }

    public static iw0 a(aec aecVar) {
        Object obj;
        aecVar.a();
        Context context = aecVar.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        aecVar.a();
        String str = aecVar.c.b;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        packageName.getClass();
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = valueOf;
        }
        Build.MANUFACTURER.getClass();
        aecVar.a();
        int myPid = Process.myPid();
        Iterator it = rb.o(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((zsm) obj).b == myPid) {
                break;
            }
        }
        zsm zsmVar = (zsm) obj;
        if (zsmVar == null) {
            zsmVar = new zsm(rb.y(), false, myPid, 0);
        }
        aecVar.a();
        return new iw0(str, new mb0(packageName, str2, valueOf, zsmVar, rb.o(context)));
    }
}
