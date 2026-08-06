package defpackage;

/* loaded from: classes.dex */
public final class s9 extends defpackage.NHJTzaLwkd {
    public final /* synthetic */ int AARZUJiTa = 1;
    public final java.lang.Object EXtogiMhuM;

    public s9(java.lang.Object[] objArr, int i, int i2) {
        super(i, i2);
        this.EXtogiMhuM = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        int i = this.AARZUJiTa;
        java.lang.Object obj = this.EXtogiMhuM;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    defpackage.db.DFo87pBq1E5();
                    break;
                } else {
                    int i2 = this.adDC3e2L;
                    this.adDC3e2L = i2 + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    defpackage.db.DFo87pBq1E5();
                    break;
                } else {
                    this.adDC3e2L++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        int i = this.AARZUJiTa;
        java.lang.Object obj = this.EXtogiMhuM;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    defpackage.db.DFo87pBq1E5();
                    break;
                } else {
                    int i2 = this.adDC3e2L - 1;
                    this.adDC3e2L = i2;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    defpackage.db.DFo87pBq1E5();
                    break;
                } else {
                    this.adDC3e2L--;
                    break;
                }
        }
        return null;
    }

    public s9(int i, java.lang.Object obj) {
        super(i, 1);
        this.EXtogiMhuM = obj;
    }
}
