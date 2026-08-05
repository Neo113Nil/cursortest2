package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class o60 extends OxcuoDLp implements Serializable {
    public static final o60 MdtA4re8 = new o60(wq.lDXGDhIF);
    public final wq NCTxEWno;

    public o60() {
        this.NCTxEWno = new wq();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.NCTxEWno.qoPGr6Ce(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        this.NCTxEWno.MdtA4re8();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.NCTxEWno.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.NCTxEWno.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.NCTxEWno.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new tq(this.NCTxEWno, 1);
    }

    @Override // defpackage.OxcuoDLp
    public final int qoPGr6Ce() {
        return this.NCTxEWno.eVhOlqcC;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        wq wqVar = this.NCTxEWno;
        wqVar.MdtA4re8();
        int b2ZJblxo = wqVar.b2ZJblxo(obj);
        if (b2ZJblxo < 0) {
            return false;
        }
        wqVar.k3x7lurq(b2ZJblxo);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.NCTxEWno.MdtA4re8();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.NCTxEWno.MdtA4re8();
        return super.retainAll(collection);
    }

    public o60(wq wqVar) {
        wqVar.getClass();
        this.NCTxEWno = wqVar;
    }
}
