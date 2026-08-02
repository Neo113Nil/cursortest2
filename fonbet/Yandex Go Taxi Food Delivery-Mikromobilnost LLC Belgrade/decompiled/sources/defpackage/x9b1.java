package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes11.dex */
public final class x9b1 implements ip60 {
    public static final x9b1 a = new x9b1();
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
    public static final lxq l;
    public static final lxq m;
    public static final lxq n;
    public static final lxq o;

    static {
        nr91 nr91Var = new nr91();
        nr91Var.a = 1;
        b = new lxq("appId", x4e.u(uw51.p(cs91.class, nr91Var.a())));
        nr91 nr91Var2 = new nr91();
        nr91Var2.a = 2;
        c = new lxq("appVersion", x4e.u(uw51.p(cs91.class, nr91Var2.a())));
        nr91 nr91Var3 = new nr91();
        nr91Var3.a = 3;
        d = new lxq("firebaseProjectId", x4e.u(uw51.p(cs91.class, nr91Var3.a())));
        nr91 nr91Var4 = new nr91();
        nr91Var4.a = 4;
        e = new lxq("mlSdkVersion", x4e.u(uw51.p(cs91.class, nr91Var4.a())));
        nr91 nr91Var5 = new nr91();
        nr91Var5.a = 5;
        f = new lxq("tfliteSchemaVersion", x4e.u(uw51.p(cs91.class, nr91Var5.a())));
        nr91 nr91Var6 = new nr91();
        nr91Var6.a = 6;
        g = new lxq("gcmSenderId", x4e.u(uw51.p(cs91.class, nr91Var6.a())));
        nr91 nr91Var7 = new nr91();
        nr91Var7.a = 7;
        h = new lxq(Constants.KEY_API_KEY, x4e.u(uw51.p(cs91.class, nr91Var7.a())));
        nr91 nr91Var8 = new nr91();
        nr91Var8.a = 8;
        i = new lxq("languages", x4e.u(uw51.p(cs91.class, nr91Var8.a())));
        nr91 nr91Var9 = new nr91();
        nr91Var9.a = 9;
        j = new lxq("mlSdkInstanceId", x4e.u(uw51.p(cs91.class, nr91Var9.a())));
        nr91 nr91Var10 = new nr91();
        nr91Var10.a = 10;
        k = new lxq("isClearcutClient", x4e.u(uw51.p(cs91.class, nr91Var10.a())));
        nr91 nr91Var11 = new nr91();
        nr91Var11.a = 11;
        l = new lxq("isStandaloneMlkit", x4e.u(uw51.p(cs91.class, nr91Var11.a())));
        nr91 nr91Var12 = new nr91();
        nr91Var12.a = 12;
        m = new lxq("isJsonLogging", x4e.u(uw51.p(cs91.class, nr91Var12.a())));
        nr91 nr91Var13 = new nr91();
        nr91Var13.a = 13;
        n = new lxq("buildLevel", x4e.u(uw51.p(cs91.class, nr91Var13.a())));
        nr91 nr91Var14 = new nr91();
        nr91Var14.a = 14;
        o = new lxq("optionalModuleVersion", x4e.u(uw51.p(cs91.class, nr91Var14.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        fub1 fub1Var = (fub1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, fub1Var.a);
        jp60Var.f(c, fub1Var.b);
        jp60Var.f(d, null);
        jp60Var.f(e, fub1Var.c);
        jp60Var.f(f, fub1Var.d);
        jp60Var.f(g, null);
        jp60Var.f(h, null);
        jp60Var.f(i, fub1Var.e);
        jp60Var.f(j, fub1Var.f);
        jp60Var.f(k, fub1Var.g);
        jp60Var.f(l, fub1Var.h);
        jp60Var.f(m, fub1Var.i);
        jp60Var.f(n, fub1Var.j);
        jp60Var.f(o, fub1Var.k);
    }
}
