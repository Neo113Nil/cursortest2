package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class sc1 extends defpackage.dG7RjM6DqYVL implements java.io.Serializable {
    public static final defpackage.sc1 oh71FJcDz6S2 = new defpackage.sc1(defpackage.ck0.s0TASMVLSWD5);
    public final defpackage.ck0 WDYagTQQm9ns;

    public sc1() {
        this.WDYagTQQm9ns = new defpackage.ck0();
    }

    @Override // defpackage.dG7RjM6DqYVL
    public final int ZpBGe2uQfcn8() {
        return this.WDYagTQQm9ns.h3m55N1URyyK;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        return this.WDYagTQQm9ns.ZpBGe2uQfcn8(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        collection.getClass();
        this.WDYagTQQm9ns.fWTAfUmVKrZq();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.WDYagTQQm9ns.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.WDYagTQQm9ns.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.WDYagTQQm9ns.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        defpackage.ck0 ck0Var = this.WDYagTQQm9ns;
        ck0Var.getClass();
        return new defpackage.zj0(ck0Var, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        defpackage.ck0 ck0Var = this.WDYagTQQm9ns;
        ck0Var.fWTAfUmVKrZq();
        int QiMR8OkAhezm = ck0Var.QiMR8OkAhezm(obj);
        if (QiMR8OkAhezm < 0) {
            return false;
        }
        ck0Var.Ns0WNyEWdPsk(QiMR8OkAhezm);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        this.WDYagTQQm9ns.fWTAfUmVKrZq();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        this.WDYagTQQm9ns.fWTAfUmVKrZq();
        return super.retainAll(collection);
    }

    public sc1(defpackage.ck0 ck0Var) {
        ck0Var.getClass();
        this.WDYagTQQm9ns = ck0Var;
    }
}
