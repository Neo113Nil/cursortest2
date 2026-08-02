package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class jq2 implements q86 {
    public final r96 a;

    public jq2(r96 r96Var) {
        r96Var.getClass();
        this.a = r96Var;
    }

    @Override // defpackage.q86
    public final boolean a(t4w t4wVar) {
        return c(t4wVar) && e(this.a.b());
    }

    @Override // defpackage.q86
    public final ss3 b(fa6 fa6Var) {
        fa6Var.getClass();
        return zsd.I(new cs1(this, (Continuation) null, 6));
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
