package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class hx implements Serializable {
    public final Object MdtA4re8;
    public final Object NCTxEWno;

    public hx(Object obj, Object obj2) {
        this.NCTxEWno = obj;
        this.MdtA4re8 = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx)) {
            return false;
        }
        hx hxVar = (hx) obj;
        return fn.qoPGr6Ce(this.NCTxEWno, hxVar.NCTxEWno) && fn.qoPGr6Ce(this.MdtA4re8, hxVar.MdtA4re8);
    }

    public final int hashCode() {
        Object obj = this.NCTxEWno;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.MdtA4re8;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.NCTxEWno + ", " + this.MdtA4re8 + ')';
    }
}
