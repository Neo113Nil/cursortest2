package defpackage;

/* loaded from: classes11.dex */
public final class zn91 implements ip60 {
    public static final zn91 a = new zn91();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;
    public static final lxq g;
    public static final lxq h;

    static {
        x491 x491Var = new x491();
        x491Var.a = 1;
        b = new lxq("durationMs", x4e.u(uw51.l(t591.class, x491Var.a())));
        x491 x491Var2 = new x491();
        x491Var2.a = 2;
        c = new lxq("imageSource", x4e.u(uw51.l(t591.class, x491Var2.a())));
        x491 x491Var3 = new x491();
        x491Var3.a = 3;
        d = new lxq("imageFormat", x4e.u(uw51.l(t591.class, x491Var3.a())));
        x491 x491Var4 = new x491();
        x491Var4.a = 4;
        e = new lxq("imageByteSize", x4e.u(uw51.l(t591.class, x491Var4.a())));
        x491 x491Var5 = new x491();
        x491Var5.a = 5;
        f = new lxq("imageWidth", x4e.u(uw51.l(t591.class, x491Var5.a())));
        x491 x491Var6 = new x491();
        x491Var6.a = 6;
        g = new lxq("imageHeight", x4e.u(uw51.l(t591.class, x491Var6.a())));
        x491 x491Var7 = new x491();
        x491Var7.a = 7;
        h = new lxq("rotationDegrees", x4e.u(uw51.l(t591.class, x491Var7.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        xda1 xda1Var = (xda1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, xda1Var.a);
        jp60Var.f(c, xda1Var.b);
        jp60Var.f(d, xda1Var.c);
        jp60Var.f(e, xda1Var.d);
        jp60Var.f(f, xda1Var.e);
        jp60Var.f(g, xda1Var.f);
        jp60Var.f(h, xda1Var.g);
    }
}
