package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class w7APNrr0aGRc extends defpackage.ZVVdXbWmyCSK implements java.util.ListIterator {
    public final /* synthetic */ defpackage.IJ0hOnjhPOri P05cfTpS5W5L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7APNrr0aGRc(defpackage.IJ0hOnjhPOri iJ0hOnjhPOri, int i) {
        super(0, iJ0hOnjhPOri);
        this.P05cfTpS5W5L = iJ0hOnjhPOri;
        int ZpBGe2uQfcn8 = iJ0hOnjhPOri.ZpBGe2uQfcn8();
        if (i < 0 || i > ZpBGe2uQfcn8) {
            defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, ZpBGe2uQfcn8, "index: ", ", size: "));
            throw null;
        }
        this.oh71FJcDz6S2 = i;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.oh71FJcDz6S2 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.oh71FJcDz6S2;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        int i = this.oh71FJcDz6S2 - 1;
        this.oh71FJcDz6S2 = i;
        return this.P05cfTpS5W5L.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.oh71FJcDz6S2 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
