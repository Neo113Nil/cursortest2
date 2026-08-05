package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class uq implements Map.Entry, xn {
    public final int MdtA4re8;
    public final wq NCTxEWno;
    public final int wxUZMvaN;

    public uq(wq wqVar, int i) {
        this.NCTxEWno = wqVar;
        this.MdtA4re8 = i;
        this.wxUZMvaN = wqVar.jb9XjC4I;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return fn.qoPGr6Ce(entry.getKey(), getKey()) && fn.qoPGr6Ce(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        qoPGr6Ce();
        return this.NCTxEWno.NCTxEWno[this.MdtA4re8];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        qoPGr6Ce();
        Object[] objArr = this.NCTxEWno.MdtA4re8;
        objArr.getClass();
        return objArr[this.MdtA4re8];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    public final void qoPGr6Ce() {
        if (this.NCTxEWno.jb9XjC4I != this.wxUZMvaN) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        qoPGr6Ce();
        wq wqVar = this.NCTxEWno;
        wqVar.MdtA4re8();
        Object[] objArr = wqVar.MdtA4re8;
        if (objArr == null) {
            int length = wqVar.NCTxEWno.length;
            if (length < 0) {
                m1.sjUBp5pO("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            wqVar.MdtA4re8 = objArr;
        }
        int i = this.MdtA4re8;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
