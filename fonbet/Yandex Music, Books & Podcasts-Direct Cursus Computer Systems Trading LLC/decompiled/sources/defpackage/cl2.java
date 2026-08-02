package defpackage;

import android.os.Handler;

/* loaded from: classes6.dex */
public final class cl2 implements yk2 {
    public final yk2 a;
    public ybr b;
    public final bl2 c;

    public cl2(yk2 yk2Var) {
        yk2Var.getClass();
        this.a = yk2Var;
        this.c = new bl2(this);
    }

    @Override // defpackage.yk2
    public final long b() {
        return this.a.b();
    }

    @Override // defpackage.yk2
    public final t6t c() {
        return this.c;
    }

    @Override // defpackage.yk2
    public final long d() {
        return this.a.d();
    }

    @Override // defpackage.yk2
    public final void e(Handler handler, xk2 xk2Var) {
        handler.getClass();
        xk2Var.getClass();
        this.a.e(handler, xk2Var);
    }

    @Override // defpackage.yk2
    public final void f(xk2 xk2Var) {
        xk2Var.getClass();
        this.a.f(xk2Var);
    }
}
