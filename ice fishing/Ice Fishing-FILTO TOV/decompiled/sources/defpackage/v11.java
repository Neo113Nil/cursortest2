package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class v11 extends qj {
    public ha1 Mjvvu5DE;
    public long mE4lRynR = 9205357640488583168L;

    public abstract Shader MjxSquD6Av(long j);

    @Override // defpackage.qj
    public final void mOu10nynGul(float f, long j, a1 a1Var) {
        Paint paint = (Paint) a1Var.Yi7zF1RB1;
        ha1 ha1Var = this.Mjvvu5DE;
        if (ha1Var == null || !t21.GWasM1elztuh(this.mE4lRynR, j)) {
            if (t21.X1lG3V04pd(j)) {
                this.Mjvvu5DE = null;
                this.mE4lRynR = 9205357640488583168L;
                ha1Var = null;
            } else {
                ha1Var = this.Mjvvu5DE;
                if (ha1Var == null) {
                    ha1Var = new ha1(0);
                    this.Mjvvu5DE = ha1Var;
                }
                ha1Var.EljAMC1QTz = MjxSquD6Av(j);
                this.Mjvvu5DE = ha1Var;
                this.mE4lRynR = j;
            }
        }
        long X1lG3V04pd = ki1.X1lG3V04pd(paint.getColor());
        long j2 = yb.Yi7zF1RB1;
        if (!yb.X1lG3V04pd(X1lG3V04pd, j2)) {
            a1Var.OOA6hdeuvCS(j2);
        }
        if (!o30.rQPn8YBR((Shader) a1Var.X1lG3V04pd, ha1Var != null ? (Shader) ha1Var.EljAMC1QTz : null)) {
            a1Var.encWxUiV2(ha1Var != null ? (Shader) ha1Var.EljAMC1QTz : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        a1Var.X1lG3V04pd(f);
    }
}
