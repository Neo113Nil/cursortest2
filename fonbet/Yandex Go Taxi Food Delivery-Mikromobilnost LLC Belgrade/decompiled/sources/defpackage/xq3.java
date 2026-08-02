package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class xq3 implements ip60 {
    public static final xq3 a = new xq3();
    public static final lxq b = lxq.c("platform");
    public static final lxq c = lxq.c("version");
    public static final lxq d = lxq.c("buildVersion");
    public static final lxq e = lxq.c("jailbroken");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e.AbstractC0027e abstractC0027e = (c3f.e.AbstractC0027e) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.c(b, abstractC0027e.b());
        jp60Var.f(c, abstractC0027e.c());
        jp60Var.f(d, abstractC0027e.a());
        jp60Var.b(e, abstractC0027e.d());
    }
}
