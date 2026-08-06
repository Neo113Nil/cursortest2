package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class o51 extends defpackage.oCu53ZX2v4Ju {
    public final java.util.List WDYagTQQm9ns;

    public o51(java.util.List list) {
        list.getClass();
        this.WDYagTQQm9ns = list;
    }

    @Override // defpackage.oCu53ZX2v4Ju
    public final int ZpBGe2uQfcn8() {
        return this.WDYagTQQm9ns.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns.add(defpackage.hf.NkfcFfdaVTox(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.WDYagTQQm9ns.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        return this.WDYagTQQm9ns.get(defpackage.hf.z16KqenTjq8o(i, this));
    }

    @Override // defpackage.oCu53ZX2v4Ju
    public final java.lang.Object giKS3J6vZuNy(int i) {
        return this.WDYagTQQm9ns.remove(defpackage.hf.z16KqenTjq8o(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return new defpackage.n51(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
        return new defpackage.n51(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        return this.WDYagTQQm9ns.set(defpackage.hf.z16KqenTjq8o(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new defpackage.n51(this, i);
    }
}
