package defpackage;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ht {
    public TimeInterpolator MdtA4re8;
    public long NCTxEWno;
    public int VgvYg0wo;
    public long qoPGr6Ce;
    public int wxUZMvaN;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht)) {
            return false;
        }
        ht htVar = (ht) obj;
        if (this.qoPGr6Ce != htVar.qoPGr6Ce || this.NCTxEWno != htVar.NCTxEWno || this.wxUZMvaN != htVar.wxUZMvaN || this.VgvYg0wo != htVar.VgvYg0wo) {
            return false;
        }
        Object obj2 = this.MdtA4re8;
        if (obj2 == null) {
            obj2 = yoc1Y4KB.NCTxEWno;
        }
        Class<?> cls = obj2.getClass();
        Object obj3 = htVar.MdtA4re8;
        if (obj3 == null) {
            obj3 = yoc1Y4KB.NCTxEWno;
        }
        return cls.equals(obj3.getClass());
    }

    public final int hashCode() {
        long j = this.qoPGr6Ce;
        long j2 = this.NCTxEWno;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        Object obj = this.MdtA4re8;
        if (obj == null) {
            obj = yoc1Y4KB.NCTxEWno;
        }
        return ((((obj.getClass().hashCode() + i) * 31) + this.wxUZMvaN) * 31) + this.VgvYg0wo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(ht.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.qoPGr6Ce);
        sb.append(" duration: ");
        sb.append(this.NCTxEWno);
        sb.append(" interpolator: ");
        Object obj = this.MdtA4re8;
        if (obj == null) {
            obj = yoc1Y4KB.NCTxEWno;
        }
        sb.append(obj.getClass());
        sb.append(" repeatCount: ");
        sb.append(this.wxUZMvaN);
        sb.append(" repeatMode: ");
        sb.append(this.VgvYg0wo);
        sb.append("}\n");
        return sb.toString();
    }
}
