package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class FzsqRtM7 {
    public Object MdtA4re8;
    public int NCTxEWno;
    public int qoPGr6Ce;
    public int wxUZMvaN;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FzsqRtM7)) {
                return false;
            }
            FzsqRtM7 fzsqRtM7 = (FzsqRtM7) obj;
            int i = this.qoPGr6Ce;
            if (i != fzsqRtM7.qoPGr6Ce) {
                return false;
            }
            if (i != 8 || Math.abs(this.wxUZMvaN - this.NCTxEWno) != 1 || this.wxUZMvaN != fzsqRtM7.NCTxEWno || this.NCTxEWno != fzsqRtM7.wxUZMvaN) {
                if (this.wxUZMvaN != fzsqRtM7.wxUZMvaN || this.NCTxEWno != fzsqRtM7.NCTxEWno) {
                    return false;
                }
                Object obj2 = this.MdtA4re8;
                Object obj3 = fzsqRtM7.MdtA4re8;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.qoPGr6Ce * 31) + this.NCTxEWno) * 31) + this.wxUZMvaN;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.qoPGr6Ce;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.NCTxEWno);
        sb.append("c:");
        sb.append(this.wxUZMvaN);
        sb.append(",p:");
        sb.append(this.MdtA4re8);
        sb.append("]");
        return sb.toString();
    }
}
