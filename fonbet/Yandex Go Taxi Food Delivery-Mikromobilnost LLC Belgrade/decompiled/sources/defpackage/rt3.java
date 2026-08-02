package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class rt3 implements ip60 {
    public static final rt3 a = new rt3();
    public static final lxq b = lxq.c("packageName");
    public static final lxq c = lxq.c("versionName");
    public static final lxq d = lxq.c("appBuildVersion");
    public static final lxq e = lxq.c("deviceManufacturer");
    public static final lxq f = lxq.c("currentProcessDetails");
    public static final lxq g = lxq.c("appProcessDetails");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        n72 n72Var = (n72) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, n72Var.a);
        jp60Var.f(c, n72Var.b);
        jp60Var.f(d, n72Var.c);
        jp60Var.f(e, Build.MANUFACTURER);
        jp60Var.f(f, n72Var.d);
        jp60Var.f(g, n72Var.e);
    }
}
