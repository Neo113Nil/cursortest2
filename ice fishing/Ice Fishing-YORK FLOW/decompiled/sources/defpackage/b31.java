package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class b31 extends defpackage.me1 {
    public final defpackage.y10 WDYagTQQm9ns;
    public int oh71FJcDz6S2;

    public b31(long j, defpackage.re1 re1Var, defpackage.y10 y10Var) {
        super(j, re1Var);
        this.WDYagTQQm9ns = y10Var;
        this.oh71FJcDz6S2 = 1;
    }

    @Override // defpackage.me1
    public final void Ns0WNyEWdPsk() {
        this.oh71FJcDz6S2++;
    }

    @Override // defpackage.me1
    public final defpackage.y10 WDYagTQQm9ns() {
        return this.WDYagTQQm9ns;
    }

    @Override // defpackage.me1
    public final defpackage.y10 e6mdH7fiFuta() {
        return null;
    }

    @Override // defpackage.me1
    public final void fNwYGHIYeJcR() {
        int i = this.oh71FJcDz6S2 - 1;
        this.oh71FJcDz6S2 = i;
        if (i == 0) {
            ZpBGe2uQfcn8();
        }
    }

    @Override // defpackage.me1
    public final void fWTAfUmVKrZq() {
        if (this.fWTAfUmVKrZq) {
            return;
        }
        fNwYGHIYeJcR();
        this.fWTAfUmVKrZq = true;
        synchronized (defpackage.te1.fWTAfUmVKrZq) {
            T1fB7bDYiVJQ();
        }
    }

    @Override // defpackage.me1
    public final void gUjdnLbkVAaA(defpackage.jg1 jg1Var) {
        defpackage.g81 g81Var = defpackage.te1.ZpBGe2uQfcn8;
        throw new java.lang.IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.me1
    public final boolean oh71FJcDz6S2() {
        return true;
    }

    @Override // defpackage.me1
    public final defpackage.me1 w7APNrr0aGRc(defpackage.y10 y10Var) {
        defpackage.te1.fWTAfUmVKrZq(this);
        return new defpackage.cr0(this.giKS3J6vZuNy, this.ZpBGe2uQfcn8, defpackage.te1.Ns0WNyEWdPsk(y10Var, this.WDYagTQQm9ns, true), this);
    }

    @Override // defpackage.me1
    public final void h3m55N1URyyK() {
    }
}
