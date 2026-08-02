package defpackage;

/* loaded from: classes11.dex */
public final class xy91 implements ip60 {
    public static final xy91 a = new xy91();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;

    static {
        bf91 bf91Var = new bf91();
        bf91Var.a = 1;
        b = new lxq("imageFormat", x4e.u(uw51.n(sf91.class, bf91Var.a())));
        bf91 bf91Var2 = new bf91();
        bf91Var2.a = 2;
        c = new lxq("originalImageSize", x4e.u(uw51.n(sf91.class, bf91Var2.a())));
        bf91 bf91Var3 = new bf91();
        bf91Var3.a = 3;
        d = new lxq("compressedImageSize", x4e.u(uw51.n(sf91.class, bf91Var3.a())));
        bf91 bf91Var4 = new bf91();
        bf91Var4.a = 4;
        e = new lxq("isOdmlImage", x4e.u(uw51.n(sf91.class, bf91Var4.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        yna1 yna1Var = (yna1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, yna1Var.a);
        jp60Var.f(c, yna1Var.b);
        jp60Var.f(d, null);
        jp60Var.f(e, null);
    }
}
