package defpackage;

/* loaded from: classes.dex */
public abstract class zi1 implements java.util.Iterator, defpackage.g90 {
    public int AARZUJiTa;
    public java.lang.Object[] adDC3e2L = defpackage.yi1.adDC3e2L.F7NU4MC0GW;
    public int xiZrDbcSW0;

    public final void IHQe1A4L2xu(java.lang.Object[] objArr, int i, int i2) {
        this.adDC3e2L = objArr;
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.AARZUJiTa < this.xiZrDbcSW0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
