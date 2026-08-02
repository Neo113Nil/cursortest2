package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes11.dex */
public final class sda1 implements ip60 {
    public static final sda1 a = new sda1();
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
        bf91 bf91Var = new bf91();
        bf91Var.a = 1;
        b = new lxq("appId", x4e.u(uw51.n(sf91.class, bf91Var.a())));
        bf91 bf91Var2 = new bf91();
        bf91Var2.a = 2;
        c = new lxq("appVersion", x4e.u(uw51.n(sf91.class, bf91Var2.a())));
        bf91 bf91Var3 = new bf91();
        bf91Var3.a = 3;
        d = new lxq("firebaseProjectId", x4e.u(uw51.n(sf91.class, bf91Var3.a())));
        bf91 bf91Var4 = new bf91();
        bf91Var4.a = 4;
        e = new lxq("mlSdkVersion", x4e.u(uw51.n(sf91.class, bf91Var4.a())));
        bf91 bf91Var5 = new bf91();
        bf91Var5.a = 5;
        f = new lxq("tfliteSchemaVersion", x4e.u(uw51.n(sf91.class, bf91Var5.a())));
        bf91 bf91Var6 = new bf91();
        bf91Var6.a = 6;
        g = new lxq("gcmSenderId", x4e.u(uw51.n(sf91.class, bf91Var6.a())));
        bf91 bf91Var7 = new bf91();
        bf91Var7.a = 7;
        h = new lxq(Constants.KEY_API_KEY, x4e.u(uw51.n(sf91.class, bf91Var7.a())));
        bf91 bf91Var8 = new bf91();
        bf91Var8.a = 8;
        i = new lxq("languages", x4e.u(uw51.n(sf91.class, bf91Var8.a())));
        bf91 bf91Var9 = new bf91();
        bf91Var9.a = 9;
        j = new lxq("mlSdkInstanceId", x4e.u(uw51.n(sf91.class, bf91Var9.a())));
        bf91 bf91Var10 = new bf91();
        bf91Var10.a = 10;
        k = new lxq("isClearcutClient", x4e.u(uw51.n(sf91.class, bf91Var10.a())));
        bf91 bf91Var11 = new bf91();
        bf91Var11.a = 11;
        l = new lxq("isStandaloneMlkit", x4e.u(uw51.n(sf91.class, bf91Var11.a())));
        bf91 bf91Var12 = new bf91();
        bf91Var12.a = 12;
        m = new lxq("isJsonLogging", x4e.u(uw51.n(sf91.class, bf91Var12.a())));
        bf91 bf91Var13 = new bf91();
        bf91Var13.a = 13;
        n = new lxq("buildLevel", x4e.u(uw51.n(sf91.class, bf91Var13.a())));
        bf91 bf91Var14 = new bf91();
        bf91Var14.a = 14;
        o = new lxq("optionalModuleVersion", x4e.u(uw51.n(sf91.class, bf91Var14.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c2b1 c2b1Var = (c2b1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, c2b1Var.a);
        jp60Var.f(c, c2b1Var.b);
        jp60Var.f(d, null);
        jp60Var.f(e, c2b1Var.c);
        jp60Var.f(f, c2b1Var.d);
        jp60Var.f(g, null);
        jp60Var.f(h, null);
        jp60Var.f(i, c2b1Var.e);
        jp60Var.f(j, c2b1Var.f);
        jp60Var.f(k, c2b1Var.g);
        jp60Var.f(l, c2b1Var.h);
        jp60Var.f(m, c2b1Var.i);
        jp60Var.f(n, c2b1Var.j);
        jp60Var.f(o, c2b1Var.k);
    }
}
