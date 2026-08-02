package defpackage;

/* loaded from: classes11.dex */
public final class z9a1 implements ip60 {
    public static final z9a1 a = new z9a1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;

    static {
        pf91 pf91Var = new pf91();
        pf91Var.a = 1;
        b = new lxq("imageFormat", x4e.u(uw51.o(dg91.class, pf91Var.a())));
        pf91 pf91Var2 = new pf91();
        pf91Var2.a = 2;
        c = new lxq("originalImageSize", x4e.u(uw51.o(dg91.class, pf91Var2.a())));
        pf91 pf91Var3 = new pf91();
        pf91Var3.a = 3;
        d = new lxq("compressedImageSize", x4e.u(uw51.o(dg91.class, pf91Var3.a())));
        pf91 pf91Var4 = new pf91();
        pf91Var4.a = 4;
        e = new lxq("isOdmlImage", x4e.u(uw51.o(dg91.class, pf91Var4.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        o8b1 o8b1Var = (o8b1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, o8b1Var.a);
        jp60Var.f(c, o8b1Var.b);
        jp60Var.f(d, null);
        jp60Var.f(e, null);
    }
}
