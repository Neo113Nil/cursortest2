package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class st {
    public final int qoPGr6Ce;
    public xu NCTxEWno = null;
    public Bundle MdtA4re8 = null;

    public st(int i) {
        this.qoPGr6Ce = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st)) {
            return false;
        }
        st stVar = (st) obj;
        if (this.qoPGr6Ce != stVar.qoPGr6Ce || !fn.qoPGr6Ce(this.NCTxEWno, stVar.NCTxEWno)) {
            return false;
        }
        Bundle bundle = this.MdtA4re8;
        Bundle bundle2 = stVar.MdtA4re8;
        if (fn.qoPGr6Ce(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !e50.MdtA4re8(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.qoPGr6Ce) * 31;
        xu xuVar = this.NCTxEWno;
        int hashCode2 = hashCode + (xuVar != null ? xuVar.hashCode() : 0);
        Bundle bundle = this.MdtA4re8;
        if (bundle != null) {
            return e50.wxUZMvaN(bundle) + (hashCode2 * 31);
        }
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(st.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.qoPGr6Ce));
        sb.append(")");
        if (this.NCTxEWno != null) {
            sb.append(" navOptions=");
            sb.append(this.NCTxEWno);
        }
        return sb.toString();
    }
}
