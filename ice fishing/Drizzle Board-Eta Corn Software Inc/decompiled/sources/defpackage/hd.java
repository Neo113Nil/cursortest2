package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class hd {
    public final int MdtA4re8;
    public final int NCTxEWno;
    public final String qoPGr6Ce;

    public hd(String str, int i, int i2) {
        this.qoPGr6Ce = str;
        this.NCTxEWno = i;
        this.MdtA4re8 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd)) {
            return false;
        }
        hd hdVar = (hd) obj;
        return this.qoPGr6Ce.equals(hdVar.qoPGr6Ce) && this.NCTxEWno == hdVar.NCTxEWno && this.MdtA4re8 == hdVar.MdtA4re8;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.NCTxEWno);
        Integer valueOf2 = Integer.valueOf(this.MdtA4re8);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.qoPGr6Ce, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        return "DisplayShapeCompat{ spec=" + Integer.valueOf(this.qoPGr6Ce.hashCode()) + " displayWidth=" + this.NCTxEWno + " displayHeight=" + this.MdtA4re8 + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
