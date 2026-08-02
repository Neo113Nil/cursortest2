package defpackage;

/* loaded from: classes11.dex */
public final class w8b1 implements ip60 {
    public static final w8b1 a = new w8b1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;

    static {
        nr91 nr91Var = new nr91();
        nr91Var.a = 1;
        b = new lxq("xMin", x4e.u(uw51.p(cs91.class, nr91Var.a())));
        nr91 nr91Var2 = new nr91();
        nr91Var2.a = 2;
        c = new lxq("yMin", x4e.u(uw51.p(cs91.class, nr91Var2.a())));
        nr91 nr91Var3 = new nr91();
        nr91Var3.a = 3;
        d = new lxq("xMax", x4e.u(uw51.p(cs91.class, nr91Var3.a())));
        nr91 nr91Var4 = new nr91();
        nr91Var4.a = 4;
        e = new lxq("yMax", x4e.u(uw51.p(cs91.class, nr91Var4.a())));
        nr91 nr91Var5 = new nr91();
        nr91Var5.a = 5;
        f = new lxq("confidenceScore", x4e.u(uw51.p(cs91.class, nr91Var5.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        jp60 jp60Var = (jp60) obj2;
        ((rtb1) obj).getClass();
        jp60Var.f(b, null);
        jp60Var.f(c, null);
        jp60Var.f(d, null);
        jp60Var.f(e, null);
        jp60Var.f(f, null);
    }
}
