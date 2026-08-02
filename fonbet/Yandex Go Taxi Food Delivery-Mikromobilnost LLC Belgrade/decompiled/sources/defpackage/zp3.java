package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class zp3 implements ip60 {
    public static final zp3 a = new zp3();
    public static final lxq b = lxq.c("arch");
    public static final lxq c = lxq.c("libraryName");
    public static final lxq d = lxq.c("buildId");

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        c3f.a.AbstractC0010a abstractC0010a = (c3f.a.AbstractC0010a) obj;
        jp60 jp60Var = (jp60) obj2;
        jp60Var.f(b, abstractC0010a.a());
        jp60Var.f(c, abstractC0010a.c());
        jp60Var.f(d, abstractC0010a.b());
    }
}
