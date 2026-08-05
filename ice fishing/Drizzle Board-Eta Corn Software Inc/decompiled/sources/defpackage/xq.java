package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xq extends OxcuoDLp {
    public final wq MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ xq(wq wqVar, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = wqVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.NCTxEWno) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.NCTxEWno;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.NCTxEWno;
        wq wqVar = this.MdtA4re8;
        switch (i) {
            case 0:
                wqVar.clear();
                break;
            default:
                wqVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.NCTxEWno;
        wq wqVar = this.MdtA4re8;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int b2ZJblxo = wqVar.b2ZJblxo(entry.getKey());
                if (b2ZJblxo < 0) {
                    return false;
                }
                Object[] objArr = wqVar.MdtA4re8;
                objArr.getClass();
                return fn.qoPGr6Ce(objArr[b2ZJblxo], entry.getValue());
            default:
                return wqVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.NCTxEWno) {
            case 0:
                collection.getClass();
                return this.MdtA4re8.VgvYg0wo(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.NCTxEWno;
        wq wqVar = this.MdtA4re8;
        switch (i) {
        }
        return wqVar.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.NCTxEWno;
        wq wqVar = this.MdtA4re8;
        switch (i) {
            case 0:
                return new tq(wqVar, 0);
            default:
                return new tq(wqVar, 1);
        }
    }

    @Override // defpackage.OxcuoDLp
    public final int qoPGr6Ce() {
        int i = this.NCTxEWno;
        wq wqVar = this.MdtA4re8;
        switch (i) {
        }
        return wqVar.eVhOlqcC;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.NCTxEWno;
        wq wqVar = this.MdtA4re8;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    wqVar.MdtA4re8();
                    int b2ZJblxo = wqVar.b2ZJblxo(entry.getKey());
                    if (b2ZJblxo >= 0) {
                        Object[] objArr = wqVar.MdtA4re8;
                        objArr.getClass();
                        if (fn.qoPGr6Ce(objArr[b2ZJblxo], entry.getValue())) {
                            wqVar.k3x7lurq(b2ZJblxo);
                            break;
                        }
                    }
                }
                break;
            default:
                wqVar.MdtA4re8();
                int b2ZJblxo2 = wqVar.b2ZJblxo(obj);
                if (b2ZJblxo2 >= 0) {
                    wqVar.k3x7lurq(b2ZJblxo2);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.NCTxEWno;
        wq wqVar = this.MdtA4re8;
        collection.getClass();
        switch (i) {
            case 0:
                wqVar.MdtA4re8();
                break;
            default:
                wqVar.MdtA4re8();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.NCTxEWno;
        wq wqVar = this.MdtA4re8;
        collection.getClass();
        switch (i) {
            case 0:
                wqVar.MdtA4re8();
                break;
            default:
                wqVar.MdtA4re8();
                break;
        }
        return super.retainAll(collection);
    }
}
