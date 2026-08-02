package defpackage;

/* loaded from: classes11.dex */
public final class so91 implements ip60 {
    public static final so91 a = new so91();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;

    static {
        bf91 bf91Var = new bf91();
        bf91Var.a = 1;
        b = new lxq("logEventKey", x4e.u(uw51.n(sf91.class, bf91Var.a())));
        bf91 bf91Var2 = new bf91();
        bf91Var2.a = 2;
        c = new lxq("eventCount", x4e.u(uw51.n(sf91.class, bf91Var2.a())));
        bf91 bf91Var3 = new bf91();
        bf91Var3.a = 3;
        d = new lxq("inferenceDurationStats", x4e.u(uw51.n(sf91.class, bf91Var3.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        sj91 sj91Var = (sj91) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, sj91Var.a);
        jp60Var.f(c, sj91Var.b);
        jp60Var.f(d, sj91Var.c);
    }
}
