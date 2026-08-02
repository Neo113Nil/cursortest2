package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class rq3 implements ip60 {
    public static final rq3 a = new rq3();
    public static final lxq b = lxq.c("batteryLevel");
    public static final lxq c = lxq.c("batteryVelocity");
    public static final lxq d = lxq.c("proximityOn");
    public static final lxq e = lxq.c("orientation");
    public static final lxq f = lxq.c("ramUsed");
    public static final lxq g = lxq.c("diskUsed");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e.d.c cVar = (c3f.e.d.c) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, cVar.a());
        jp60Var.c(c, cVar.b());
        jp60Var.b(d, cVar.f());
        jp60Var.c(e, cVar.d());
        jp60Var.e(f, cVar.e());
        jp60Var.e(g, cVar.c());
    }
}
