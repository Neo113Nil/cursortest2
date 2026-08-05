package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class m40 implements Map.Entry {
    public final Object MdtA4re8;
    public final Object NCTxEWno;
    public m40 VgvYg0wo;
    public m40 wxUZMvaN;

    public m40(Object obj, Object obj2) {
        this.NCTxEWno = obj;
        this.MdtA4re8 = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m40)) {
            return false;
        }
        m40 m40Var = (m40) obj;
        return this.NCTxEWno.equals(m40Var.NCTxEWno) && this.MdtA4re8.equals(m40Var.MdtA4re8);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.NCTxEWno;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.MdtA4re8;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.MdtA4re8.hashCode() ^ this.NCTxEWno.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.NCTxEWno + "=" + this.MdtA4re8;
    }
}
