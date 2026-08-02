package defpackage;

/* loaded from: classes11.dex */
public final class t8b1 implements ip60 {
    public static final t8b1 a = new t8b1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;
    public static final lxq g;

    static {
        nr91 nr91Var = new nr91();
        nr91Var.a = 1;
        b = new lxq("appName", x4e.u(uw51.p(cs91.class, nr91Var.a())));
        nr91 nr91Var2 = new nr91();
        nr91Var2.a = 2;
        c = new lxq("sessionId", x4e.u(uw51.p(cs91.class, nr91Var2.a())));
        nr91 nr91Var3 = new nr91();
        nr91Var3.a = 3;
        d = new lxq("startZoomLevel", x4e.u(uw51.p(cs91.class, nr91Var3.a())));
        nr91 nr91Var4 = new nr91();
        nr91Var4.a = 4;
        e = new lxq("endZoomLevel", x4e.u(uw51.p(cs91.class, nr91Var4.a())));
        nr91 nr91Var5 = new nr91();
        nr91Var5.a = 5;
        f = new lxq("durationMs", x4e.u(uw51.p(cs91.class, nr91Var5.a())));
        nr91 nr91Var6 = new nr91();
        nr91Var6.a = 6;
        g = new lxq("predictedArea", x4e.u(uw51.p(cs91.class, nr91Var6.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        jp60 jp60Var = (jp60) obj2;
        ((stb1) obj).getClass();
        jp60Var.f(b, null);
        jp60Var.f(c, null);
        jp60Var.f(d, null);
        jp60Var.f(e, null);
        jp60Var.f(f, null);
        jp60Var.f(g, null);
    }
}
