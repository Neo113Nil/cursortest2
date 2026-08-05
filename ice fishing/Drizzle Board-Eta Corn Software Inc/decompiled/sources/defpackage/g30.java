package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class g30 {
    public final Resources.Theme NCTxEWno;
    public final Resources qoPGr6Ce;

    public g30(Resources resources, Resources.Theme theme) {
        this.qoPGr6Ce = resources;
        this.NCTxEWno = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g30.class == obj.getClass()) {
            g30 g30Var = (g30) obj;
            if (this.qoPGr6Ce.equals(g30Var.qoPGr6Ce) && Objects.equals(this.NCTxEWno, g30Var.NCTxEWno)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.qoPGr6Ce, this.NCTxEWno);
    }
}
