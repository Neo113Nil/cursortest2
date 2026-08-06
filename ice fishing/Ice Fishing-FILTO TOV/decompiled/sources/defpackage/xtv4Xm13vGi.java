package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class xtv4Xm13vGi implements uv, Serializable {
    public final String AvO7iQsrTN;
    public final Class EljAMC1QTz;
    public final int JFJ3QoxA;
    public final Object OOA6hdeuvCS;
    public final String encWxUiV2;
    public final boolean mOu10nynGul = false;
    public final int rQPn8YBR;

    public xtv4Xm13vGi(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.OOA6hdeuvCS = obj;
        this.EljAMC1QTz = cls;
        this.AvO7iQsrTN = str;
        this.encWxUiV2 = str2;
        this.JFJ3QoxA = i;
        this.rQPn8YBR = i2 >> 1;
    }

    @Override // defpackage.uv
    public final int Yi7zF1RB1() {
        return this.JFJ3QoxA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtv4Xm13vGi)) {
            return false;
        }
        xtv4Xm13vGi xtv4xm13vgi = (xtv4Xm13vGi) obj;
        return this.mOu10nynGul == xtv4xm13vgi.mOu10nynGul && this.JFJ3QoxA == xtv4xm13vgi.JFJ3QoxA && this.rQPn8YBR == xtv4xm13vgi.rQPn8YBR && this.OOA6hdeuvCS.equals(xtv4xm13vgi.OOA6hdeuvCS) && this.EljAMC1QTz.equals(xtv4xm13vgi.EljAMC1QTz) && this.AvO7iQsrTN.equals(xtv4xm13vgi.AvO7iQsrTN) && this.encWxUiV2.equals(xtv4xm13vgi.encWxUiV2);
    }

    public final int hashCode() {
        return ((((((this.encWxUiV2.hashCode() + ((this.AvO7iQsrTN.hashCode() + ((this.EljAMC1QTz.hashCode() + (this.OOA6hdeuvCS.hashCode() * 31)) * 31)) * 31)) * 31) + (this.mOu10nynGul ? 1231 : 1237)) * 31) + this.JFJ3QoxA) * 31) + this.rQPn8YBR;
    }

    public final String toString() {
        st0.GWasM1elztuh.getClass();
        return tt0.GWasM1elztuh(this);
    }
}
