package defpackage;

/* loaded from: classes.dex */
public class kNAkVymC implements java.util.Iterator, defpackage.g90 {
    public final java.lang.Object AARZUJiTa;
    public final /* synthetic */ int adDC3e2L;
    public int xiZrDbcSW0;

    public /* synthetic */ kNAkVymC(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.AARZUJiTa = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.AARZUJiTa;
        switch (i) {
            case 0:
                if (this.xiZrDbcSW0 < ((defpackage.abhbClRa) obj).IHQe1A4L2xu()) {
                    break;
                }
                break;
            case 1:
                if (this.xiZrDbcSW0 < ((java.lang.Object[]) obj).length) {
                    break;
                }
                break;
            default:
                if (this.xiZrDbcSW0 < ((defpackage.qb1) obj).adDC3e2L()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.adDC3e2L;
        java.lang.Object obj = this.AARZUJiTa;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    defpackage.db.DFo87pBq1E5();
                    return null;
                }
                int i2 = this.xiZrDbcSW0;
                this.xiZrDbcSW0 = i2 + 1;
                return ((defpackage.abhbClRa) obj).get(i2);
            case 1:
                try {
                    int i3 = this.xiZrDbcSW0;
                    this.xiZrDbcSW0 = i3 + 1;
                    return ((java.lang.Object[]) obj)[i3];
                } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                    this.xiZrDbcSW0--;
                    throw new java.util.NoSuchElementException(e.getMessage());
                }
            default:
                int i4 = this.xiZrDbcSW0;
                this.xiZrDbcSW0 = i4 + 1;
                return ((defpackage.qb1) obj).xiZrDbcSW0(i4);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.adDC3e2L) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
