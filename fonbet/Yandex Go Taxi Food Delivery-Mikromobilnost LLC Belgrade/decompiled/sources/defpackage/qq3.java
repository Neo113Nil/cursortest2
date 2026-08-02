package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class qq3 implements ip60 {
    public static final qq3 a = new qq3();
    public static final lxq b = lxq.c("processName");
    public static final lxq c = lxq.c("pid");
    public static final lxq d = lxq.c("importance");
    public static final lxq e = lxq.c("defaultProcess");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e.d.a.c cVar = (c3f.e.d.a.c) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, cVar.c());
        jp60Var.c(c, cVar.b());
        jp60Var.c(d, cVar.a());
        jp60Var.b(e, cVar.d());
    }
}
