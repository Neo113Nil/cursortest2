package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

/* loaded from: classes11.dex */
public final class roa1 implements ip60 {
    public static final roa1 a = new roa1();
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
        nr91 nr91Var = new nr91();
        nr91Var.a = 1;
        b = new lxq("durationMs", x4e.u(uw51.p(cs91.class, nr91Var.a())));
        nr91 nr91Var2 = new nr91();
        nr91Var2.a = 2;
        c = new lxq(ErrorResponseData.JSON_ERROR_CODE, x4e.u(uw51.p(cs91.class, nr91Var2.a())));
        nr91 nr91Var3 = new nr91();
        nr91Var3.a = 3;
        d = new lxq("isColdCall", x4e.u(uw51.p(cs91.class, nr91Var3.a())));
        nr91 nr91Var4 = new nr91();
        nr91Var4.a = 4;
        e = new lxq("autoManageModelOnBackground", x4e.u(uw51.p(cs91.class, nr91Var4.a())));
        nr91 nr91Var5 = new nr91();
        nr91Var5.a = 5;
        f = new lxq("autoManageModelOnLowMemory", x4e.u(uw51.p(cs91.class, nr91Var5.a())));
        nr91 nr91Var6 = new nr91();
        nr91Var6.a = 6;
        g = new lxq("isNnApiEnabled", x4e.u(uw51.p(cs91.class, nr91Var6.a())));
        nr91 nr91Var7 = new nr91();
        nr91Var7.a = 7;
        h = new lxq("eventsCount", x4e.u(uw51.p(cs91.class, nr91Var7.a())));
        nr91 nr91Var8 = new nr91();
        nr91Var8.a = 8;
        i = new lxq("otherErrors", x4e.u(uw51.p(cs91.class, nr91Var8.a())));
        nr91 nr91Var9 = new nr91();
        nr91Var9.a = 9;
        j = new lxq("remoteConfigValueForAcceleration", x4e.u(uw51.p(cs91.class, nr91Var9.a())));
        nr91 nr91Var10 = new nr91();
        nr91Var10.a = 10;
        k = new lxq("isAccelerated", x4e.u(uw51.p(cs91.class, nr91Var10.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        hib1 hib1Var = (hib1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, hib1Var.a);
        jp60Var.f(c, hib1Var.b);
        jp60Var.f(d, hib1Var.c);
        jp60Var.f(e, hib1Var.d);
        jp60Var.f(f, hib1Var.e);
        jp60Var.f(g, null);
        jp60Var.f(h, null);
        jp60Var.f(i, null);
        jp60Var.f(j, null);
        jp60Var.f(k, null);
    }
}
