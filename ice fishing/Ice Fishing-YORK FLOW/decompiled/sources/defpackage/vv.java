package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class vv extends defpackage.lm {
    public static final /* synthetic */ int GE9mJIPrb8gP = 0;
    public boolean P05cfTpS5W5L;
    public long QiMR8OkAhezm;
    public defpackage.p7 e6mdH7fiFuta;

    public final void BXaznwstz2U0(defpackage.qq qqVar) {
        defpackage.p7 p7Var = this.e6mdH7fiFuta;
        if (p7Var == null) {
            p7Var = new defpackage.p7();
            this.e6mdH7fiFuta = p7Var;
        }
        p7Var.addLast(qqVar);
    }

    public abstract long GcLuU6pT9wO9();

    public final void IBvW5fLsPuHy(boolean z) {
        long j = this.QiMR8OkAhezm - (z ? 4294967296L : 1L);
        this.QiMR8OkAhezm = j;
        if (j <= 0 && this.P05cfTpS5W5L) {
            shutdown();
        }
    }

    public final void hH0RRJrNssvh(boolean z) {
        this.QiMR8OkAhezm = (z ? 4294967296L : 1L) + this.QiMR8OkAhezm;
        if (z) {
            return;
        }
        this.P05cfTpS5W5L = true;
    }

    public abstract void shutdown();

    public final boolean xahdJg25P1Bv() {
        defpackage.p7 p7Var = this.e6mdH7fiFuta;
        if (p7Var == null) {
            return false;
        }
        defpackage.qq qqVar = (defpackage.qq) (p7Var.isEmpty() ? null : p7Var.removeFirst());
        if (qqVar == null) {
            return false;
        }
        qqVar.run();
        return true;
    }
}
