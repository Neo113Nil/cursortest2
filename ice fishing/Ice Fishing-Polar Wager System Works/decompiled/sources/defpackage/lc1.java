package defpackage;

/* loaded from: classes.dex */
public abstract class lc1 implements defpackage.kc1 {
    public final defpackage.y6 adDC3e2L = new defpackage.y6(0);

    public final boolean adDC3e2L(int i) {
        return (this.adDC3e2L.get() & i) != 0;
    }

    public final void xiZrDbcSW0(int i) {
        defpackage.y6 y6Var;
        int i2;
        do {
            y6Var = this.adDC3e2L;
            i2 = y6Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!y6Var.compareAndSet(i2, i2 | i));
    }
}
