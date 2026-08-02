package defpackage;

/* loaded from: classes.dex */
public final class wt3 implements ip60 {
    public static final wt3 a = new wt3();
    public static final lxq b = lxq.c("sessionId");
    public static final lxq c = lxq.c("firstSessionId");
    public static final lxq d = lxq.c("sessionIndex");
    public static final lxq e = lxq.c("eventTimestampUs");
    public static final lxq f = lxq.c("dataCollectionStatus");
    public static final lxq g = lxq.c("firebaseInstallationId");
    public static final lxq h = lxq.c("firebaseAuthenticationToken");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        uzq0 uzq0Var = (uzq0) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, uzq0Var.a);
        jp60Var.f(c, uzq0Var.b);
        jp60Var.c(d, uzq0Var.c);
        jp60Var.e(e, uzq0Var.d);
        jp60Var.f(f, uzq0Var.e);
        jp60Var.f(g, uzq0Var.f);
        jp60Var.f(h, uzq0Var.g);
    }
}
