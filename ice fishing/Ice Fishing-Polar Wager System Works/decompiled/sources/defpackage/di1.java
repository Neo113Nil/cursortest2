package defpackage;

/* loaded from: classes.dex */
public final class di1 implements java.util.Iterator, defpackage.g90 {
    public final java.util.Iterator adDC3e2L;
    public final /* synthetic */ defpackage.ue1 xiZrDbcSW0;

    public di1(defpackage.ue1 ue1Var) {
        this.xiZrDbcSW0 = ue1Var;
        this.adDC3e2L = ue1Var.oh6vYeIP.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.adDC3e2L.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return this.xiZrDbcSW0.r1MBDhnF.AARZUJiTa(this.adDC3e2L.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
