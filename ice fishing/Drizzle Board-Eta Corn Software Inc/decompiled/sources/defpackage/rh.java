package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class rh {
    public List MdtA4re8;
    public String NCTxEWno;
    public String qoPGr6Ce;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh)) {
            return false;
        }
        rh rhVar = (rh) obj;
        return Objects.equals(this.qoPGr6Ce, rhVar.qoPGr6Ce) && Objects.equals(this.NCTxEWno, rhVar.NCTxEWno) && Objects.equals(this.MdtA4re8, rhVar.MdtA4re8);
    }

    public final int hashCode() {
        return Objects.hash(this.qoPGr6Ce, this.NCTxEWno, this.MdtA4re8);
    }
}
