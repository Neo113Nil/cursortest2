package defpackage;

/* loaded from: classes.dex */
public final class tt3 implements ip60 {
    public static final tt3 a = new tt3();
    public static final lxq b = lxq.c("performance");
    public static final lxq c = lxq.c("crashlytics");
    public static final lxq d = lxq.c("sessionSamplingRate");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        wng wngVar = (wng) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, wngVar.a);
        jp60Var.f(c, wngVar.b);
        jp60Var.d(d, wngVar.c);
    }
}
