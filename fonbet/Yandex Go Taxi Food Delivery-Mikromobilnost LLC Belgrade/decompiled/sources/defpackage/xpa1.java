package defpackage;

/* loaded from: classes11.dex */
public final class xpa1 implements ip60 {
    public static final xpa1 a = new xpa1();
    public static final lxq b;
    public static final lxq c;
    public static final lxq d;
    public static final lxq e;
    public static final lxq f;

    static {
        pb91 pb91Var = new pb91();
        pb91Var.a = 1;
        b = new lxq("inferenceCommonLogEvent", x4e.u(uw51.m(nd91.class, pb91Var.a())));
        pb91 pb91Var2 = new pb91();
        pb91Var2.a = 2;
        c = new lxq("imageInfo", x4e.u(uw51.m(nd91.class, pb91Var2.a())));
        pb91 pb91Var3 = new pb91();
        pb91Var3.a = 3;
        d = new lxq("subjectSegmenterOptions", x4e.u(uw51.m(nd91.class, pb91Var3.a())));
        pb91 pb91Var4 = new pb91();
        pb91Var4.a = 4;
        e = new lxq("subjectInfos", x4e.u(uw51.m(nd91.class, pb91Var4.a())));
        pb91 pb91Var5 = new pb91();
        pb91Var5.a = 5;
        f = new lxq("qualityScores", x4e.u(uw51.m(nd91.class, pb91Var5.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        dkb1 dkb1Var = (dkb1) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, dkb1Var.a);
        jp60Var.f(c, dkb1Var.b);
        jp60Var.f(d, dkb1Var.c);
        jp60Var.f(e, dkb1Var.d);
        jp60Var.f(f, dkb1Var.e);
    }
}
