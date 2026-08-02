package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class ns5 extends ito {
    public final uq5 a;
    public final uq5 b;
    public final uq5 c;
    public final ps5 d;
    public volatile boolean e;

    public ns5(ps5 ps5Var) {
        this.d = ps5Var;
        uq5 uq5Var = new uq5(1);
        this.a = uq5Var;
        uq5 uq5Var2 = new uq5(0);
        this.b = uq5Var2;
        uq5 uq5Var3 = new uq5(1);
        this.c = uq5Var3;
        uq5Var3.b(uq5Var);
        uq5Var3.b(uq5Var2);
    }

    @Override // defpackage.ka8
    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.c.a();
    }

    @Override // defpackage.ito
    public final ka8 b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.e ? t4b.a : this.d.e(runnable, j, timeUnit, this.b);
    }

    @Override // defpackage.ito
    public final void d(qij qijVar) {
        if (this.e) {
            return;
        }
        this.d.e(qijVar, 0L, TimeUnit.MILLISECONDS, this.a);
    }
}
