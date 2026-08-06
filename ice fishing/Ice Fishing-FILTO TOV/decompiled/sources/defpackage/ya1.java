package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ya1 extends WdrkLMV3xh {
    public int AvO7iQsrTN;
    public Object[] encWxUiV2;
    public boolean mOu10nynGul;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public ya1(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.AvO7iQsrTN = i3;
        Object[] objArr2 = new Object[i3];
        this.encWxUiV2 = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.mOu10nynGul = r5;
        objArr2[0] = objArr;
        Yi7zF1RB1(i - r5, 1);
    }

    public final Object GWasM1elztuh() {
        int i = this.OOA6hdeuvCS & 31;
        Object obj = this.encWxUiV2[this.AvO7iQsrTN - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void X1lG3V04pd(int i) {
        int i2 = 0;
        while (d70.cilMamHF(this.OOA6hdeuvCS, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            Yi7zF1RB1(this.OOA6hdeuvCS, ((this.AvO7iQsrTN - 1) - (i2 / 5)) + 1);
        }
    }

    public final void Yi7zF1RB1(int i, int i2) {
        int i3 = (this.AvO7iQsrTN - i2) * 5;
        while (i2 < this.AvO7iQsrTN) {
            Object[] objArr = this.encWxUiV2;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[d70.cilMamHF(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            o4.E7jCp8Ls();
            return null;
        }
        Object GWasM1elztuh = GWasM1elztuh();
        int i = this.OOA6hdeuvCS + 1;
        this.OOA6hdeuvCS = i;
        if (i == this.EljAMC1QTz) {
            this.mOu10nynGul = true;
            return GWasM1elztuh;
        }
        X1lG3V04pd(0);
        return GWasM1elztuh;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            o4.E7jCp8Ls();
            return null;
        }
        this.OOA6hdeuvCS--;
        if (this.mOu10nynGul) {
            this.mOu10nynGul = false;
            return GWasM1elztuh();
        }
        X1lG3V04pd(31);
        return GWasM1elztuh();
    }
}
