package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class v0 implements Iterator, Map.Entry {
    public int MdtA4re8 = -1;
    public int NCTxEWno;
    public final /* synthetic */ x0 VgvYg0wo;
    public boolean wxUZMvaN;

    public v0(x0 x0Var) {
        this.VgvYg0wo = x0Var;
        this.NCTxEWno = x0Var.wxUZMvaN - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.wxUZMvaN) {
            m1.Ey6iv0m0("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.MdtA4re8;
            x0 x0Var = this.VgvYg0wo;
            if (fn.qoPGr6Ce(key, x0Var.P7K7Inc8(i)) && fn.qoPGr6Ce(entry.getValue(), x0Var.jb9XjC4I(this.MdtA4re8))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.wxUZMvaN) {
            return this.VgvYg0wo.P7K7Inc8(this.MdtA4re8);
        }
        m1.Ey6iv0m0("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.wxUZMvaN) {
            return this.VgvYg0wo.jb9XjC4I(this.MdtA4re8);
        }
        m1.Ey6iv0m0("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.MdtA4re8 < this.NCTxEWno;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.wxUZMvaN) {
            m1.Ey6iv0m0("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.MdtA4re8;
        x0 x0Var = this.VgvYg0wo;
        Object P7K7Inc8 = x0Var.P7K7Inc8(i);
        Object jb9XjC4I = x0Var.jb9XjC4I(this.MdtA4re8);
        return (P7K7Inc8 == null ? 0 : P7K7Inc8.hashCode()) ^ (jb9XjC4I != null ? jb9XjC4I.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.MdtA4re8++;
        this.wxUZMvaN = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.wxUZMvaN) {
            throw new IllegalStateException();
        }
        this.VgvYg0wo.b2ZJblxo(this.MdtA4re8);
        this.MdtA4re8--;
        this.NCTxEWno--;
        this.wxUZMvaN = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.wxUZMvaN) {
            return this.VgvYg0wo.Qr9iLBAD(this.MdtA4re8, obj);
        }
        m1.Ey6iv0m0("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
