package defpackage;

/* loaded from: classes.dex */
public final class vt3 implements ip60 {
    public static final vt3 a = new vt3();
    public static final lxq b = lxq.c("eventType");
    public static final lxq c = lxq.c("sessionData");
    public static final lxq d = lxq.c("applicationInfo");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        jzq0 jzq0Var = (jzq0) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, jzq0Var.a);
        jp60Var.f(c, jzq0Var.b);
        jp60Var.f(d, jzq0Var.c);
    }
}
