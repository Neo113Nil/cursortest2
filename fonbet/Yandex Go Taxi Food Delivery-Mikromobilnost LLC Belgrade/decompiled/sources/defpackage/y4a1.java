package defpackage;

/* loaded from: classes11.dex */
public final class y4a1 implements ip60 {
    public static final y4a1 a = new y4a1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;

    static {
        pb91 pb91Var = new pb91();
        pb91Var.a = 1;
        b = new lxq("imageFormat", x4e.u(uw51.m(nd91.class, pb91Var.a())));
        pb91 pb91Var2 = new pb91();
        pb91Var2.a = 2;
        c = new lxq("originalImageSize", x4e.u(uw51.m(nd91.class, pb91Var2.a())));
        pb91 pb91Var3 = new pb91();
        pb91Var3.a = 3;
        d = new lxq("compressedImageSize", x4e.u(uw51.m(nd91.class, pb91Var3.a())));
        pb91 pb91Var4 = new pb91();
        pb91Var4.a = 4;
        e = new lxq("isOdmlImage", x4e.u(uw51.m(nd91.class, pb91Var4.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        z4b1 z4b1Var = (z4b1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, z4b1Var.a);
        jp60Var.f(c, z4b1Var.b);
        jp60Var.f(d, null);
        jp60Var.f(e, null);
    }
}
