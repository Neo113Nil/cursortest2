package defpackage;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class r1b implements x08 {
    public static final /* synthetic */ kgx[] b;
    public final op3 a;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("userDataRequest", 0, "getUserDataRequest()Lcom/yandex/messaging/Cancelable;", r1b.class);
        qoi0.a.getClass();
        b = new kgx[]{mutablePropertyReference1Impl};
    }

    public r1b(u1b u1bVar, String str) {
        op3 op3Var = new op3();
        this.a = op3Var;
        w1b w1bVar = u1bVar.y;
        xo3 c = w1bVar.f.c(new md6(24, w1bVar, u1bVar), str);
        kgx kgxVar = b[0];
        op3Var.b(c);
    }

    @Override // defpackage.x08
    public final void cancel() {
        kgx kgxVar = b[0];
        this.a.b(null);
    }
}
