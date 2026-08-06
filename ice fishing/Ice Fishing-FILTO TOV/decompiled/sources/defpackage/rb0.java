package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rb0 implements el {
    public boolean OOA6hdeuvCS;
    public final /* synthetic */ ub0 encWxUiV2;
    public long EljAMC1QTz = 9223372034707292159L;
    public long AvO7iQsrTN = 0;

    public rb0(ub0 ub0Var) {
        this.encWxUiV2 = ub0Var;
    }

    public final void GWasM1elztuh(sz szVar, float f) {
        ub0 ub0Var = this.encWxUiV2;
        ai0 ai0Var = ub0Var.YmKjaVtbfp5Z;
        if (ai0Var == null) {
            ai0Var = new ai0();
            ub0Var.YmKjaVtbfp5Z = ai0Var;
        }
        int dcDmLGVhzWm = d5.dcDmLGVhzWm((sz[]) ai0Var.Yi7zF1RB1, szVar);
        if (dcDmLGVhzWm >= 0) {
            float[] fArr = (float[]) ai0Var.X1lG3V04pd;
            if (fArr[dcDmLGVhzWm] != f) {
                fArr[dcDmLGVhzWm] = f;
                ((byte[]) ai0Var.xqGvceK5x)[dcDmLGVhzWm] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) ai0Var.xqGvceK5x;
                if (bArr[dcDmLGVhzWm] == 2) {
                    bArr[dcDmLGVhzWm] = 0;
                    return;
                }
                return;
            }
        }
        int i = ai0Var.GWasM1elztuh;
        sz[] szVarArr = (sz[]) ai0Var.Yi7zF1RB1;
        if (i == szVarArr.length) {
            int i2 = i * 2;
            ai0Var.Yi7zF1RB1 = (sz[]) Arrays.copyOf(szVarArr, i2);
            ai0Var.X1lG3V04pd = Arrays.copyOf((float[]) ai0Var.X1lG3V04pd, i2);
            ai0Var.xqGvceK5x = Arrays.copyOf((byte[]) ai0Var.xqGvceK5x, i2);
        }
        ((sz[]) ai0Var.Yi7zF1RB1)[i] = szVar;
        ((byte[]) ai0Var.xqGvceK5x)[i] = 3;
        ((float[]) ai0Var.X1lG3V04pd)[i] = f;
        ai0Var.GWasM1elztuh++;
    }

    @Override // defpackage.el
    public final float Yi7zF1RB1() {
        return this.encWxUiV2.Yi7zF1RB1();
    }

    @Override // defpackage.el
    public final float mOu10nynGul() {
        return this.encWxUiV2.mOu10nynGul();
    }
}
