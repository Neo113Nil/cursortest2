package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class uq3 implements ip60 {
    public static final uq3 a = new uq3();
    public static final lxq b = lxq.c("rolloutVariant");
    public static final lxq c = lxq.c("parameterKey");
    public static final lxq d = lxq.c("parameterValue");
    public static final lxq e = lxq.c("templateVersion");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e.d.AbstractC0026e abstractC0026e = (c3f.e.d.AbstractC0026e) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, abstractC0026e.c());
        jp60Var.f(c, abstractC0026e.a());
        jp60Var.f(d, abstractC0026e.b());
        jp60Var.e(e, abstractC0026e.d());
    }
}
