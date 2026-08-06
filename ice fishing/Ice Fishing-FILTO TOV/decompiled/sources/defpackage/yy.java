package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class yy extends id1 {
    public boolean AvO7iQsrTN;
    public float E7jCp8Ls;
    public List EljAMC1QTz;
    public final NWXxPwoOUSX9 JFJ3QoxA;
    public float XnEVoBF0td1l;
    public float[] Yi7zF1RB1;
    public h1 encWxUiV2;
    public hv mOu10nynGul;
    public String rQPn8YBR;
    public boolean uFEq9NpZ;
    public final ArrayList X1lG3V04pd = new ArrayList();
    public boolean xqGvceK5x = true;
    public long OOA6hdeuvCS = yb.AvO7iQsrTN;

    public yy() {
        int i = pd1.GWasM1elztuh;
        this.EljAMC1QTz = xp.OOA6hdeuvCS;
        this.AvO7iQsrTN = true;
        this.JFJ3QoxA = new NWXxPwoOUSX9(14, this);
        this.rQPn8YBR = "";
        this.E7jCp8Ls = 1.0f;
        this.XnEVoBF0td1l = 1.0f;
        this.uFEq9NpZ = true;
    }

    public final void AvO7iQsrTN(id1 id1Var) {
        if (id1Var instanceof io0) {
            t41 t41Var = ((io0) id1Var).Yi7zF1RB1;
            if (this.xqGvceK5x && t41Var != null) {
                EljAMC1QTz(t41Var.Mjvvu5DE);
                return;
            }
            return;
        }
        if (id1Var instanceof yy) {
            yy yyVar = (yy) id1Var;
            if (yyVar.xqGvceK5x && this.xqGvceK5x) {
                EljAMC1QTz(yyVar.OOA6hdeuvCS);
            } else {
                this.xqGvceK5x = false;
                this.OOA6hdeuvCS = yb.AvO7iQsrTN;
            }
        }
    }

    public final void EljAMC1QTz(long j) {
        if (this.xqGvceK5x && j != 16) {
            long j2 = this.OOA6hdeuvCS;
            if (j2 == 16) {
                this.OOA6hdeuvCS = j;
                return;
            }
            int i = pd1.GWasM1elztuh;
            if (yb.encWxUiV2(j2) == yb.encWxUiV2(j) && yb.AvO7iQsrTN(j2) == yb.AvO7iQsrTN(j) && yb.OOA6hdeuvCS(j2) == yb.OOA6hdeuvCS(j)) {
                return;
            }
            this.xqGvceK5x = false;
            this.OOA6hdeuvCS = yb.AvO7iQsrTN;
        }
    }

    @Override // defpackage.id1
    public final void GWasM1elztuh(ho hoVar) {
        if (this.uFEq9NpZ) {
            float[] fArr = this.Yi7zF1RB1;
            if (fArr == null) {
                fArr = z50.rQPn8YBR();
                this.Yi7zF1RB1 = fArr;
            } else {
                z50.M3K9sHhK(fArr);
            }
            z50.EXrPz3p7hFb(fArr, 0.0f, 0.0f);
            if (fArr.length >= 16) {
                float sin = (float) Math.sin(0.0d);
                float cos = (float) Math.cos(0.0d);
                float f = fArr[0];
                float f2 = fArr[4];
                float f3 = (sin * f2) + (cos * f);
                float f4 = -sin;
                float f5 = (f2 * cos) + (f * f4);
                float f6 = fArr[1];
                float f7 = fArr[5];
                float f8 = (sin * f7) + (cos * f6);
                float f9 = (f7 * cos) + (f6 * f4);
                float f10 = fArr[2];
                float f11 = fArr[6];
                float f12 = (sin * f11) + (cos * f10);
                float f13 = (f11 * cos) + (f10 * f4);
                float f14 = fArr[3];
                float f15 = fArr[7];
                float f16 = (sin * f15) + (cos * f14);
                fArr[0] = f3;
                fArr[1] = f8;
                fArr[2] = f12;
                fArr[3] = f16;
                fArr[4] = f5;
                fArr[5] = f9;
                fArr[6] = f13;
                fArr[7] = (cos * f15) + (f4 * f14);
            }
            float f17 = this.E7jCp8Ls;
            float f18 = this.XnEVoBF0td1l;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f17;
                fArr[1] = fArr[1] * f17;
                fArr[2] = fArr[2] * f17;
                fArr[3] = fArr[3] * f17;
                fArr[4] = fArr[4] * f18;
                fArr[5] = fArr[5] * f18;
                fArr[6] = fArr[6] * f18;
                fArr[7] = fArr[7] * f18;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            z50.EXrPz3p7hFb(fArr, -0.0f, -0.0f);
            this.uFEq9NpZ = false;
        }
        if (this.AvO7iQsrTN) {
            if (!this.EljAMC1QTz.isEmpty()) {
                h1 h1Var = this.encWxUiV2;
                if (h1Var == null) {
                    h1Var = j1.GWasM1elztuh();
                    this.encWxUiV2 = h1Var;
                }
                b70.TpUsjqg3bxO(this.EljAMC1QTz, h1Var);
            }
            this.AvO7iQsrTN = false;
        }
        f4 arNh8D4Z5gB = hoVar.arNh8D4Z5gB();
        long mOu10nynGul = arNh8D4Z5gB.mOu10nynGul();
        arNh8D4Z5gB.EljAMC1QTz().E7jCp8Ls();
        try {
            f4 f4Var = (f4) ((j6IIN2O8eOU) arNh8D4Z5gB.Yi7zF1RB1).EljAMC1QTz;
            float[] fArr2 = this.Yi7zF1RB1;
            if (fArr2 != null) {
                f4Var.EljAMC1QTz().WIEu4Ya2g8(fArr2);
            }
            h1 h1Var2 = this.encWxUiV2;
            if (!this.EljAMC1QTz.isEmpty() && h1Var2 != null) {
                f4Var.EljAMC1QTz().Mjvvu5DE(h1Var2);
            }
            ArrayList arrayList = this.X1lG3V04pd;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((id1) arrayList.get(i)).GWasM1elztuh(hoVar);
            }
        } finally {
            arNh8D4Z5gB.EljAMC1QTz().JFJ3QoxA();
            arNh8D4Z5gB.jivtDDk9H(mOu10nynGul);
        }
    }

    public final void OOA6hdeuvCS(int i, id1 id1Var) {
        ArrayList arrayList = this.X1lG3V04pd;
        if (i < arrayList.size()) {
            arrayList.set(i, id1Var);
        } else {
            arrayList.add(id1Var);
        }
        AvO7iQsrTN(id1Var);
        id1Var.xqGvceK5x(this.JFJ3QoxA);
        X1lG3V04pd();
    }

    @Override // defpackage.id1
    public final hv Yi7zF1RB1() {
        return this.mOu10nynGul;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.rQPn8YBR);
        ArrayList arrayList = this.X1lG3V04pd;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            id1 id1Var = (id1) arrayList.get(i);
            sb.append("\t");
            sb.append(id1Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // defpackage.id1
    public final void xqGvceK5x(NWXxPwoOUSX9 nWXxPwoOUSX9) {
        this.mOu10nynGul = nWXxPwoOUSX9;
    }
}
