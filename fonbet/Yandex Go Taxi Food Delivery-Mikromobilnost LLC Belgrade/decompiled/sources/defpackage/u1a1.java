package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes11.dex */
public final class u1a1 implements ip60 {
    public static final u1a1 a = new u1a1();
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
        x491 x491Var = new x491();
        x491Var.a = 1;
        b = new lxq("appId", x4e.u(uw51.l(t591.class, x491Var.a())));
        x491 x491Var2 = new x491();
        x491Var2.a = 2;
        c = new lxq("appVersion", x4e.u(uw51.l(t591.class, x491Var2.a())));
        x491 x491Var3 = new x491();
        x491Var3.a = 3;
        d = new lxq("firebaseProjectId", x4e.u(uw51.l(t591.class, x491Var3.a())));
        x491 x491Var4 = new x491();
        x491Var4.a = 4;
        e = new lxq("mlSdkVersion", x4e.u(uw51.l(t591.class, x491Var4.a())));
        x491 x491Var5 = new x491();
        x491Var5.a = 5;
        f = new lxq("tfliteSchemaVersion", x4e.u(uw51.l(t591.class, x491Var5.a())));
        x491 x491Var6 = new x491();
        x491Var6.a = 6;
        g = new lxq("gcmSenderId", x4e.u(uw51.l(t591.class, x491Var6.a())));
        x491 x491Var7 = new x491();
        x491Var7.a = 7;
        h = new lxq(Constants.KEY_API_KEY, x4e.u(uw51.l(t591.class, x491Var7.a())));
        x491 x491Var8 = new x491();
        x491Var8.a = 8;
        i = new lxq("languages", x4e.u(uw51.l(t591.class, x491Var8.a())));
        x491 x491Var9 = new x491();
        x491Var9.a = 9;
        j = new lxq("mlSdkInstanceId", x4e.u(uw51.l(t591.class, x491Var9.a())));
        x491 x491Var10 = new x491();
        x491Var10.a = 10;
        k = new lxq("isClearcutClient", x4e.u(uw51.l(t591.class, x491Var10.a())));
        x491 x491Var11 = new x491();
        x491Var11.a = 11;
        l = new lxq("isStandaloneMlkit", x4e.u(uw51.l(t591.class, x491Var11.a())));
        x491 x491Var12 = new x491();
        x491Var12.a = 12;
        m = new lxq("isJsonLogging", x4e.u(uw51.l(t591.class, x491Var12.a())));
        x491 x491Var13 = new x491();
        x491Var13.a = 13;
        n = new lxq("buildLevel", x4e.u(uw51.l(t591.class, x491Var13.a())));
        x491 x491Var14 = new x491();
        x491Var14.a = 14;
        o = new lxq("optionalModuleVersion", x4e.u(uw51.l(t591.class, x491Var14.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        isa1 isa1Var = (isa1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, isa1Var.a);
        jp60Var.f(c, isa1Var.b);
        jp60Var.f(d, null);
        jp60Var.f(e, isa1Var.c);
        jp60Var.f(f, isa1Var.d);
        jp60Var.f(g, null);
        jp60Var.f(h, null);
        jp60Var.f(i, isa1Var.e);
        jp60Var.f(j, isa1Var.f);
        jp60Var.f(k, isa1Var.g);
        jp60Var.f(l, isa1Var.h);
        jp60Var.f(m, isa1Var.i);
        jp60Var.f(n, isa1Var.j);
        jp60Var.f(o, isa1Var.k);
    }
}
