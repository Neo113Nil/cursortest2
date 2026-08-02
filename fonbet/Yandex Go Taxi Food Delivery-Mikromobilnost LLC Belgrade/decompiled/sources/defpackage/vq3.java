package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class vq3 implements ip60 {
    public static final vq3 a = new vq3();
    public static final lxq b = lxq.c("rolloutId");
    public static final lxq c = lxq.c("variantId");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.e.d.AbstractC0026e.b bVar = (c3f.e.d.AbstractC0026e.b) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, bVar.a());
        jp60Var.f(c, bVar.b());
    }
}
