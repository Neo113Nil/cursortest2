package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ep0 implements Iterator, q40 {
    public boolean AvO7iQsrTN = true;
    public int EljAMC1QTz;
    public final ab1[] OOA6hdeuvCS;

    public ep0(za1 za1Var, ab1[] ab1VarArr) {
        this.OOA6hdeuvCS = ab1VarArr;
        ab1VarArr[0].GWasM1elztuh(za1Var.xqGvceK5x, Integer.bitCount(za1Var.GWasM1elztuh) * 2, 0);
        this.EljAMC1QTz = 0;
        GWasM1elztuh();
    }

    public final void GWasM1elztuh() {
        int i = this.EljAMC1QTz;
        ab1[] ab1VarArr = this.OOA6hdeuvCS;
        ab1 ab1Var = ab1VarArr[i];
        if (ab1Var.AvO7iQsrTN < ab1Var.EljAMC1QTz) {
            return;
        }
        while (-1 < i) {
            int Yi7zF1RB1 = Yi7zF1RB1(i);
            if (Yi7zF1RB1 == -1) {
                ab1 ab1Var2 = ab1VarArr[i];
                int i2 = ab1Var2.AvO7iQsrTN;
                Object[] objArr = ab1Var2.OOA6hdeuvCS;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    ab1Var2.AvO7iQsrTN = i2 + 1;
                    Yi7zF1RB1 = Yi7zF1RB1(i);
                }
            }
            if (Yi7zF1RB1 != -1) {
                this.EljAMC1QTz = Yi7zF1RB1;
                return;
            }
            if (i > 0) {
                ab1 ab1Var3 = ab1VarArr[i - 1];
                int i3 = ab1Var3.AvO7iQsrTN;
                int length2 = ab1Var3.OOA6hdeuvCS.length;
                ab1Var3.AvO7iQsrTN = i3 + 1;
            }
            ab1VarArr[i].GWasM1elztuh(za1.OOA6hdeuvCS.xqGvceK5x, 0, 0);
            i--;
        }
        this.AvO7iQsrTN = false;
    }

    public final int Yi7zF1RB1(int i) {
        ab1[] ab1VarArr = this.OOA6hdeuvCS;
        ab1 ab1Var = ab1VarArr[i];
        int i2 = ab1Var.AvO7iQsrTN;
        if (i2 < ab1Var.EljAMC1QTz) {
            return i;
        }
        Object[] objArr = ab1Var.OOA6hdeuvCS;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        za1 za1Var = (za1) obj;
        if (i == 6) {
            ab1 ab1Var2 = ab1VarArr[i + 1];
            Object[] objArr2 = za1Var.xqGvceK5x;
            ab1Var2.GWasM1elztuh(objArr2, objArr2.length, 0);
        } else {
            ab1VarArr[i + 1].GWasM1elztuh(za1Var.xqGvceK5x, Integer.bitCount(za1Var.GWasM1elztuh) * 2, 0);
        }
        return Yi7zF1RB1(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.AvO7iQsrTN;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.AvO7iQsrTN) {
            o4.E7jCp8Ls();
            return null;
        }
        Object next = this.OOA6hdeuvCS[this.EljAMC1QTz].next();
        GWasM1elztuh();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
