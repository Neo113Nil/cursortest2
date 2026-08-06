package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class bk0 {
    public java.lang.Object P05cfTpS5W5L;
    public int QiMR8OkAhezm;
    public int WDYagTQQm9ns;
    public int oh71FJcDz6S2;

    public bk0() {
        if (defpackage.l21.oh71FJcDz6S2 == null) {
            defpackage.l21.oh71FJcDz6S2 = new defpackage.l21(24);
        }
    }

    public int ZpBGe2uQfcn8(int i) {
        if (i < this.QiMR8OkAhezm) {
            return ((java.nio.ByteBuffer) this.P05cfTpS5W5L).getShort(this.oh71FJcDz6S2 + i);
        }
        return 0;
    }

    public void fWTAfUmVKrZq() {
        while (true) {
            int i = this.WDYagTQQm9ns;
            defpackage.ck0 ck0Var = (defpackage.ck0) this.P05cfTpS5W5L;
            if (i >= ck0Var.GE9mJIPrb8gP || ck0Var.QiMR8OkAhezm[i] >= 0) {
                return;
            } else {
                this.WDYagTQQm9ns = i + 1;
            }
        }
    }

    public void giKS3J6vZuNy() {
        if (((defpackage.ck0) this.P05cfTpS5W5L).fNwYGHIYeJcR != this.QiMR8OkAhezm) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        return this.WDYagTQQm9ns < ((defpackage.ck0) this.P05cfTpS5W5L).GE9mJIPrb8gP;
    }

    public void remove() {
        defpackage.ck0 ck0Var = (defpackage.ck0) this.P05cfTpS5W5L;
        giKS3J6vZuNy();
        if (this.oh71FJcDz6S2 == -1) {
            defpackage.h7.P05cfTpS5W5L("Call next() before removing element from the iterator.");
            return;
        }
        ck0Var.fWTAfUmVKrZq();
        ck0Var.Ns0WNyEWdPsk(this.oh71FJcDz6S2);
        this.oh71FJcDz6S2 = -1;
        this.QiMR8OkAhezm = ck0Var.fNwYGHIYeJcR;
    }
}
