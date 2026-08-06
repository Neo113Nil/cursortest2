package defpackage;

/* loaded from: classes.dex */
public final class V7bD7b8KA extends defpackage.kNAkVymC implements java.util.ListIterator {
    public final /* synthetic */ defpackage.abhbClRa EXtogiMhuM;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V7bD7b8KA(defpackage.abhbClRa abhbclra, int i) {
        super(0, abhbclra);
        this.EXtogiMhuM = abhbclra;
        int IHQe1A4L2xu = abhbclra.IHQe1A4L2xu();
        if (i < 0 || i > IHQe1A4L2xu) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, IHQe1A4L2xu, "index: ", ", size: "));
            throw null;
        }
        this.xiZrDbcSW0 = i;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.xiZrDbcSW0 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.xiZrDbcSW0;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            defpackage.db.DFo87pBq1E5();
            return null;
        }
        int i = this.xiZrDbcSW0 - 1;
        this.xiZrDbcSW0 = i;
        return this.EXtogiMhuM.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.xiZrDbcSW0 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
