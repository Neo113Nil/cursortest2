package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes11.dex */
public final class uua1 implements ip60 {
    public static final uua1 a = new uua1();
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
        pb91 pb91Var = new pb91();
        pb91Var.a = 1;
        b = new lxq("appId", x4e.u(uw51.m(nd91.class, pb91Var.a())));
        pb91 pb91Var2 = new pb91();
        pb91Var2.a = 2;
        c = new lxq("appVersion", x4e.u(uw51.m(nd91.class, pb91Var2.a())));
        pb91 pb91Var3 = new pb91();
        pb91Var3.a = 3;
        d = new lxq("firebaseProjectId", x4e.u(uw51.m(nd91.class, pb91Var3.a())));
        pb91 pb91Var4 = new pb91();
        pb91Var4.a = 4;
        e = new lxq("mlSdkVersion", x4e.u(uw51.m(nd91.class, pb91Var4.a())));
        pb91 pb91Var5 = new pb91();
        pb91Var5.a = 5;
        f = new lxq("tfliteSchemaVersion", x4e.u(uw51.m(nd91.class, pb91Var5.a())));
        pb91 pb91Var6 = new pb91();
        pb91Var6.a = 6;
        g = new lxq("gcmSenderId", x4e.u(uw51.m(nd91.class, pb91Var6.a())));
        pb91 pb91Var7 = new pb91();
        pb91Var7.a = 7;
        h = new lxq(Constants.KEY_API_KEY, x4e.u(uw51.m(nd91.class, pb91Var7.a())));
        pb91 pb91Var8 = new pb91();
        pb91Var8.a = 8;
        i = new lxq("languages", x4e.u(uw51.m(nd91.class, pb91Var8.a())));
        pb91 pb91Var9 = new pb91();
        pb91Var9.a = 9;
        j = new lxq("mlSdkInstanceId", x4e.u(uw51.m(nd91.class, pb91Var9.a())));
        pb91 pb91Var10 = new pb91();
        pb91Var10.a = 10;
        k = new lxq("isClearcutClient", x4e.u(uw51.m(nd91.class, pb91Var10.a())));
        pb91 pb91Var11 = new pb91();
        pb91Var11.a = 11;
        l = new lxq("isStandaloneMlkit", x4e.u(uw51.m(nd91.class, pb91Var11.a())));
        pb91 pb91Var12 = new pb91();
        pb91Var12.a = 12;
        m = new lxq("isJsonLogging", x4e.u(uw51.m(nd91.class, pb91Var12.a())));
        pb91 pb91Var13 = new pb91();
        pb91Var13.a = 13;
        n = new lxq("buildLevel", x4e.u(uw51.m(nd91.class, pb91Var13.a())));
        pb91 pb91Var14 = new pb91();
        pb91Var14.a = 14;
        o = new lxq("optionalModuleVersion", x4e.u(uw51.m(nd91.class, pb91Var14.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        onb1 onb1Var = (onb1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, onb1Var.a);
        jp60Var.f(c, onb1Var.b);
        jp60Var.f(d, null);
        jp60Var.f(e, onb1Var.c);
        jp60Var.f(f, onb1Var.d);
        jp60Var.f(g, null);
        jp60Var.f(h, null);
        jp60Var.f(i, onb1Var.e);
        jp60Var.f(j, onb1Var.f);
        jp60Var.f(k, onb1Var.g);
        jp60Var.f(l, onb1Var.h);
        jp60Var.f(m, onb1Var.i);
        jp60Var.f(n, onb1Var.j);
        jp60Var.f(o, onb1Var.k);
    }
}
