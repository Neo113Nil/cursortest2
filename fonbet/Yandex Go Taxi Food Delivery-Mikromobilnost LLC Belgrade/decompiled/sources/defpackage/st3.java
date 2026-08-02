package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class st3 implements ip60 {
    public static final st3 a = new st3();
    public static final lxq b = lxq.c("appId");
    public static final lxq c = lxq.c("deviceModel");
    public static final lxq d = lxq.c("sessionSdkVersion");
    public static final lxq e = lxq.c("osVersion");
    public static final lxq f = lxq.c("logEnvironment");
    public static final lxq g = lxq.c("androidAppInfo");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        d03 d03Var = (d03) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, d03Var.a);
        jp60Var.f(c, Build.MODEL);
        jp60Var.f(d, "3.0.3");
        jp60Var.f(e, Build.VERSION.RELEASE);
        jp60Var.f(f, d03Var.b);
        jp60Var.f(g, d03Var.c);
    }
}
