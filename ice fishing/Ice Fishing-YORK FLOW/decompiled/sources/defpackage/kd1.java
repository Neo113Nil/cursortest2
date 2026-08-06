package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class kd1 implements defpackage.cr {
    public final defpackage.dd P05cfTpS5W5L;
    public final java.lang.Object QiMR8OkAhezm;
    public final defpackage.md1 WDYagTQQm9ns;
    public final long oh71FJcDz6S2;

    public kd1(defpackage.md1 md1Var, long j, java.lang.Object obj, defpackage.dd ddVar) {
        this.WDYagTQQm9ns = md1Var;
        this.oh71FJcDz6S2 = j;
        this.QiMR8OkAhezm = obj;
        this.P05cfTpS5W5L = ddVar;
    }

    @Override // defpackage.cr
    public final void ZpBGe2uQfcn8() {
        defpackage.md1 md1Var = this.WDYagTQQm9ns;
        synchronized (md1Var) {
            if (this.oh71FJcDz6S2 < md1Var.T1fB7bDYiVJQ()) {
                return;
            }
            java.lang.Object[] objArr = md1Var.fNwYGHIYeJcR;
            objArr.getClass();
            long j = this.oh71FJcDz6S2;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            defpackage.la0.e6mdH7fiFuta(objArr, j, defpackage.la0.UmgHb6n58gfG);
            md1Var.e6mdH7fiFuta();
        }
    }
}
