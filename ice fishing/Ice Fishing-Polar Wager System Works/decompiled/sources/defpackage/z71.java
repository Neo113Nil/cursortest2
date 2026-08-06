package defpackage;

/* loaded from: classes.dex */
public final class z71 implements java.util.Iterator, defpackage.ej, defpackage.g90 {
    public defpackage.ej AARZUJiTa;
    public int adDC3e2L;
    public java.lang.Object xiZrDbcSW0;

    public final java.lang.RuntimeException IHQe1A4L2xu() {
        int i = this.adDC3e2L;
        if (i == 4) {
            return new java.util.NoSuchElementException();
        }
        if (i == 5) {
            return new java.lang.IllegalStateException("Iterator has failed.");
        }
        return new java.lang.IllegalStateException("Unexpected state of the iterator: " + this.adDC3e2L);
    }

    @Override // defpackage.ej
    public final void SH1y5HwkJhh(java.lang.Object obj) {
        defpackage.f70.nBH8hAHy(obj);
        this.adDC3e2L = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.adDC3e2L;
            if (i != 0) {
                break;
            }
            this.adDC3e2L = 5;
            defpackage.ej ejVar = this.AARZUJiTa;
            ejVar.getClass();
            this.AARZUJiTa = null;
            ejVar.SH1y5HwkJhh(defpackage.ok1.IHQe1A4L2xu);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw IHQe1A4L2xu();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.adDC3e2L;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        if (i == 2) {
            this.adDC3e2L = 1;
            throw null;
        }
        if (i != 3) {
            throw IHQe1A4L2xu();
        }
        this.adDC3e2L = 0;
        java.lang.Object obj = this.xiZrDbcSW0;
        this.xiZrDbcSW0 = null;
        return obj;
    }

    public final void oh6vYeIP(defpackage.ej ejVar, java.lang.Object obj) {
        this.xiZrDbcSW0 = obj;
        this.adDC3e2L = 3;
        this.AARZUJiTa = ejVar;
        ejVar.getClass();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.ej
    public final defpackage.lj xiZrDbcSW0() {
        return defpackage.lt.adDC3e2L;
    }
}
