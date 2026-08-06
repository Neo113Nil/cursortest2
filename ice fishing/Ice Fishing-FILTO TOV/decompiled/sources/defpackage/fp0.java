package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class fp0 extends ep0 {
    public boolean JFJ3QoxA;
    public final bp0 encWxUiV2;
    public Object mOu10nynGul;
    public int rQPn8YBR;

    public fp0(bp0 bp0Var, ab1[] ab1VarArr) {
        super(bp0Var.EljAMC1QTz, ab1VarArr);
        this.encWxUiV2 = bp0Var;
        this.rQPn8YBR = bp0Var.encWxUiV2;
    }

    public final void X1lG3V04pd(int i, za1 za1Var, Object obj, int i2) {
        int i3 = i2 * 5;
        ab1[] ab1VarArr = this.OOA6hdeuvCS;
        if (i3 <= 30) {
            int WRKkgoJXwDn = 1 << b70.WRKkgoJXwDn(i, i3);
            if (za1Var.encWxUiV2(WRKkgoJXwDn)) {
                ab1VarArr[i2].GWasM1elztuh(za1Var.xqGvceK5x, Integer.bitCount(za1Var.GWasM1elztuh) * 2, za1Var.EljAMC1QTz(WRKkgoJXwDn));
                this.EljAMC1QTz = i2;
                return;
            } else {
                int jivtDDk9H = za1Var.jivtDDk9H(WRKkgoJXwDn);
                za1 mE4lRynR = za1Var.mE4lRynR(jivtDDk9H);
                ab1VarArr[i2].GWasM1elztuh(za1Var.xqGvceK5x, Integer.bitCount(za1Var.GWasM1elztuh) * 2, jivtDDk9H);
                X1lG3V04pd(i, mE4lRynR, obj, i2 + 1);
                return;
            }
        }
        ab1 ab1Var = ab1VarArr[i2];
        Object[] objArr = za1Var.xqGvceK5x;
        ab1Var.GWasM1elztuh(objArr, objArr.length, 0);
        while (true) {
            ab1 ab1Var2 = ab1VarArr[i2];
            if (o30.rQPn8YBR(ab1Var2.OOA6hdeuvCS[ab1Var2.AvO7iQsrTN], obj)) {
                this.EljAMC1QTz = i2;
                return;
            } else {
                ab1VarArr[i2].AvO7iQsrTN += 2;
            }
        }
    }

    @Override // defpackage.ep0, java.util.Iterator
    public final Object next() {
        if (this.encWxUiV2.encWxUiV2 != this.rQPn8YBR) {
            throw new ConcurrentModificationException();
        }
        if (!this.AvO7iQsrTN) {
            o4.E7jCp8Ls();
            return null;
        }
        ab1 ab1Var = this.OOA6hdeuvCS[this.EljAMC1QTz];
        this.mOu10nynGul = ab1Var.OOA6hdeuvCS[ab1Var.AvO7iQsrTN];
        this.JFJ3QoxA = true;
        return super.next();
    }

    @Override // defpackage.ep0, java.util.Iterator
    public final void remove() {
        if (!this.JFJ3QoxA) {
            throw new IllegalStateException();
        }
        boolean z = this.AvO7iQsrTN;
        bp0 bp0Var = this.encWxUiV2;
        if (!z) {
            fb1.rQPn8YBR(bp0Var).remove(this.mOu10nynGul);
        } else {
            if (!z) {
                o4.E7jCp8Ls();
                return;
            }
            ab1 ab1Var = this.OOA6hdeuvCS[this.EljAMC1QTz];
            Object obj = ab1Var.OOA6hdeuvCS[ab1Var.AvO7iQsrTN];
            fb1.rQPn8YBR(bp0Var).remove(this.mOu10nynGul);
            X1lG3V04pd(obj != null ? obj.hashCode() : 0, bp0Var.EljAMC1QTz, obj, 0);
        }
        this.mOu10nynGul = null;
        this.JFJ3QoxA = false;
        this.rQPn8YBR = bp0Var.encWxUiV2;
    }
}
