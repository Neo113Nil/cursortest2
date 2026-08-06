package defpackage;

/* loaded from: classes.dex */
public final class pa implements java.util.Iterator {
    public final /* synthetic */ defpackage.ra AARZUJiTa;
    public int adDC3e2L = 0;
    public final int xiZrDbcSW0;

    public pa(defpackage.ra raVar) {
        this.AARZUJiTa = raVar;
        this.xiZrDbcSW0 = raVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.adDC3e2L < this.xiZrDbcSW0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.adDC3e2L;
        if (i < this.xiZrDbcSW0) {
            this.adDC3e2L = i + 1;
            return java.lang.Byte.valueOf(this.AARZUJiTa.AARZUJiTa(i));
        }
        defpackage.db.DFo87pBq1E5();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
