package defpackage;

import android.graphics.Shader;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class t41 extends qj {
    public final long Mjvvu5DE;

    public t41(long j) {
        this.Mjvvu5DE = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t41) {
            return yb.X1lG3V04pd(this.Mjvvu5DE, ((t41) obj).Mjvvu5DE);
        }
        return false;
    }

    public final int hashCode() {
        int i = yb.encWxUiV2;
        return Long.hashCode(this.Mjvvu5DE);
    }

    @Override // defpackage.qj
    public final void mOu10nynGul(float f, long j, a1 a1Var) {
        a1Var.X1lG3V04pd(1.0f);
        long j2 = this.Mjvvu5DE;
        if (f != 1.0f) {
            j2 = yb.Yi7zF1RB1(yb.xqGvceK5x(j2) * f, j2);
        }
        a1Var.OOA6hdeuvCS(j2);
        if (((Shader) a1Var.X1lG3V04pd) != null) {
            a1Var.encWxUiV2(null);
        }
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) yb.mOu10nynGul(this.Mjvvu5DE)) + ')';
    }
}
