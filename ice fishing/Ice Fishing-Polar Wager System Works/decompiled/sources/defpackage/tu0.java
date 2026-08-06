package defpackage;

/* loaded from: classes.dex */
public final class tu0 extends defpackage.NHJTzaLwkd {
    public final java.lang.Object[] AARZUJiTa;
    public final defpackage.xi1 EXtogiMhuM;

    public tu0(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.AARZUJiTa = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.EXtogiMhuM = new defpackage.xi1(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        defpackage.xi1 xi1Var = this.EXtogiMhuM;
        if (xi1Var.hasNext()) {
            this.adDC3e2L++;
            return xi1Var.next();
        }
        int i = this.adDC3e2L;
        this.adDC3e2L = i + 1;
        return this.AARZUJiTa[i - xi1Var.xiZrDbcSW0];
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        int i = this.adDC3e2L;
        defpackage.xi1 xi1Var = this.EXtogiMhuM;
        int i2 = xi1Var.xiZrDbcSW0;
        if (i <= i2) {
            this.adDC3e2L = i - 1;
            return xi1Var.previous();
        }
        int i3 = i - 1;
        this.adDC3e2L = i3;
        return this.AARZUJiTa[i3 - i2];
    }
}
