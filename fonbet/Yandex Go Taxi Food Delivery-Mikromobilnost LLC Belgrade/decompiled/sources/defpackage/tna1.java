package defpackage;

/* loaded from: classes11.dex */
public final class tna1 implements ip60 {
    public static final tna1 a = new tna1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;

    static {
        nr91 nr91Var = new nr91();
        nr91Var.a = 1;
        b = new lxq("imageFormat", x4e.u(uw51.p(cs91.class, nr91Var.a())));
        nr91 nr91Var2 = new nr91();
        nr91Var2.a = 2;
        c = new lxq("originalImageSize", x4e.u(uw51.p(cs91.class, nr91Var2.a())));
        nr91 nr91Var3 = new nr91();
        nr91Var3.a = 3;
        d = new lxq("compressedImageSize", x4e.u(uw51.p(cs91.class, nr91Var3.a())));
        nr91 nr91Var4 = new nr91();
        nr91Var4.a = 4;
        e = new lxq("isOdmlImage", x4e.u(uw51.p(cs91.class, nr91Var4.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        mhb1 mhb1Var = (mhb1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, mhb1Var.a);
        jp60Var.f(c, mhb1Var.b);
        jp60Var.f(d, null);
        jp60Var.f(e, null);
    }
}
