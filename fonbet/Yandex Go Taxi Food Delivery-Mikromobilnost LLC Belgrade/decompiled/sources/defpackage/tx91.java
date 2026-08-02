package defpackage;

/* loaded from: classes11.dex */
public final class tx91 implements ip60 {
    public static final tx91 a = new tx91();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;
    public static final lxq g;

    static {
        bf91 bf91Var = new bf91();
        bf91Var.a = 1;
        b = new lxq("maxMs", x4e.u(uw51.n(sf91.class, bf91Var.a())));
        bf91 bf91Var2 = new bf91();
        bf91Var2.a = 2;
        c = new lxq("minMs", x4e.u(uw51.n(sf91.class, bf91Var2.a())));
        bf91 bf91Var3 = new bf91();
        bf91Var3.a = 3;
        d = new lxq("avgMs", x4e.u(uw51.n(sf91.class, bf91Var3.a())));
        bf91 bf91Var4 = new bf91();
        bf91Var4.a = 4;
        e = new lxq("firstQuartileMs", x4e.u(uw51.n(sf91.class, bf91Var4.a())));
        bf91 bf91Var5 = new bf91();
        bf91Var5.a = 5;
        f = new lxq("medianMs", x4e.u(uw51.n(sf91.class, bf91Var5.a())));
        bf91 bf91Var6 = new bf91();
        bf91Var6.a = 6;
        g = new lxq("thirdQuartileMs", x4e.u(uw51.n(sf91.class, bf91Var6.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        fla1 fla1Var = (fla1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, fla1Var.a);
        jp60Var.f(c, fla1Var.b);
        jp60Var.f(d, fla1Var.c);
        jp60Var.f(e, fla1Var.d);
        jp60Var.f(f, fla1Var.e);
        jp60Var.f(g, fla1Var.f);
    }
}
