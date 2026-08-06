package defpackage;

/* loaded from: classes.dex */
public final class xi1 extends defpackage.NHJTzaLwkd {
    public int AARZUJiTa;
    public java.lang.Object[] EXtogiMhuM;
    public boolean riuEU0zW4;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public xi1(java.lang.Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.AARZUJiTa = i3;
        java.lang.Object[] objArr2 = new java.lang.Object[i3];
        this.EXtogiMhuM = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.riuEU0zW4 = r5;
        objArr2[0] = objArr;
        oh6vYeIP(i - r5, 1);
    }

    public final java.lang.Object IHQe1A4L2xu() {
        int i = this.adDC3e2L & 31;
        java.lang.Object obj = this.EXtogiMhuM[this.AARZUJiTa - 1];
        obj.getClass();
        return ((java.lang.Object[]) obj)[i];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        java.lang.Object IHQe1A4L2xu = IHQe1A4L2xu();
        int i = this.adDC3e2L + 1;
        this.adDC3e2L = i;
        if (i == this.xiZrDbcSW0) {
            this.riuEU0zW4 = true;
            return IHQe1A4L2xu;
        }
        r1MBDhnF(0);
        return IHQe1A4L2xu;
    }

    public final void oh6vYeIP(int i, int i2) {
        int i3 = (this.AARZUJiTa - i2) * 5;
        while (i2 < this.AARZUJiTa) {
            java.lang.Object[] objArr = this.EXtogiMhuM;
            java.lang.Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((java.lang.Object[]) obj)[defpackage.c80.kNAkVymC(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        this.adDC3e2L--;
        if (this.riuEU0zW4) {
            this.riuEU0zW4 = false;
            return IHQe1A4L2xu();
        }
        r1MBDhnF(31);
        return IHQe1A4L2xu();
    }

    public final void r1MBDhnF(int i) {
        int i2 = 0;
        while (defpackage.c80.kNAkVymC(this.adDC3e2L, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            oh6vYeIP(this.adDC3e2L, ((this.AARZUJiTa - 1) - (i2 / 5)) + 1);
        }
    }
}
