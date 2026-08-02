package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

/* loaded from: classes11.dex */
public final class x5a1 implements ip60 {
    public static final x5a1 a = new x5a1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;
    public static final lxq g;
    public static final lxq h;
    public static final lxq i;
    public static final lxq j;
    public static final lxq k;

    static {
        pb91 pb91Var = new pb91();
        pb91Var.a = 1;
        b = new lxq("durationMs", x4e.u(uw51.m(nd91.class, pb91Var.a())));
        pb91 pb91Var2 = new pb91();
        pb91Var2.a = 2;
        c = new lxq(ErrorResponseData.JSON_ERROR_CODE, x4e.u(uw51.m(nd91.class, pb91Var2.a())));
        pb91 pb91Var3 = new pb91();
        pb91Var3.a = 3;
        d = new lxq("isColdCall", x4e.u(uw51.m(nd91.class, pb91Var3.a())));
        pb91 pb91Var4 = new pb91();
        pb91Var4.a = 4;
        e = new lxq("autoManageModelOnBackground", x4e.u(uw51.m(nd91.class, pb91Var4.a())));
        pb91 pb91Var5 = new pb91();
        pb91Var5.a = 5;
        f = new lxq("autoManageModelOnLowMemory", x4e.u(uw51.m(nd91.class, pb91Var5.a())));
        pb91 pb91Var6 = new pb91();
        pb91Var6.a = 6;
        g = new lxq("isNnApiEnabled", x4e.u(uw51.m(nd91.class, pb91Var6.a())));
        pb91 pb91Var7 = new pb91();
        pb91Var7.a = 7;
        h = new lxq("eventsCount", x4e.u(uw51.m(nd91.class, pb91Var7.a())));
        pb91 pb91Var8 = new pb91();
        pb91Var8.a = 8;
        i = new lxq("otherErrors", x4e.u(uw51.m(nd91.class, pb91Var8.a())));
        pb91 pb91Var9 = new pb91();
        pb91Var9.a = 9;
        j = new lxq("remoteConfigValueForAcceleration", x4e.u(uw51.m(nd91.class, pb91Var9.a())));
        pb91 pb91Var10 = new pb91();
        pb91Var10.a = 10;
        k = new lxq("isAccelerated", x4e.u(uw51.m(nd91.class, pb91Var10.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        y5b1 y5b1Var = (y5b1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, y5b1Var.a);
        jp60Var.f(c, y5b1Var.b);
        jp60Var.f(d, y5b1Var.c);
        jp60Var.f(e, null);
        jp60Var.f(f, null);
        jp60Var.f(g, null);
        jp60Var.f(h, null);
        jp60Var.f(i, null);
        jp60Var.f(j, null);
        jp60Var.f(k, null);
    }
}
