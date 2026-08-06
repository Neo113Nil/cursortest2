package defpackage;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class io0 extends id1 {
    public final h1 AvO7iQsrTN;
    public boolean EljAMC1QTz;
    public final z60 JFJ3QoxA;
    public boolean OOA6hdeuvCS;
    public List X1lG3V04pd;
    public t41 Yi7zF1RB1;
    public h1 encWxUiV2;
    public h1 mOu10nynGul;
    public float xqGvceK5x;

    public io0() {
        int i = pd1.GWasM1elztuh;
        this.X1lG3V04pd = xp.OOA6hdeuvCS;
        this.xqGvceK5x = 1.0f;
        this.OOA6hdeuvCS = true;
        h1 GWasM1elztuh = j1.GWasM1elztuh();
        this.AvO7iQsrTN = GWasM1elztuh;
        this.encWxUiV2 = GWasM1elztuh;
        this.JFJ3QoxA = d70.arNh8D4Z5gB(a90.OOA6hdeuvCS, hf.uFEq9NpZ);
    }

    @Override // defpackage.id1
    public final void GWasM1elztuh(ho hoVar) {
        if (this.OOA6hdeuvCS) {
            b70.TpUsjqg3bxO(this.X1lG3V04pd, this.AvO7iQsrTN);
            OOA6hdeuvCS();
        } else if (this.EljAMC1QTz) {
            OOA6hdeuvCS();
        }
        this.OOA6hdeuvCS = false;
        this.EljAMC1QTz = false;
        t41 t41Var = this.Yi7zF1RB1;
        if (t41Var != null) {
            ho.YTyqgZhdF(hoVar, this.encWxUiV2, t41Var, 1.0f, null, 56);
        }
    }

    public final void OOA6hdeuvCS() {
        float f = this.xqGvceK5x;
        h1 h1Var = this.AvO7iQsrTN;
        if (f == 1.0f) {
            this.encWxUiV2 = h1Var;
            return;
        }
        if (o30.rQPn8YBR(this.encWxUiV2, h1Var)) {
            this.encWxUiV2 = j1.GWasM1elztuh();
        } else {
            Path.FillType fillType = this.encWxUiV2.GWasM1elztuh.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.encWxUiV2.GWasM1elztuh.rewind();
            Path path = this.encWxUiV2.GWasM1elztuh;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        z60 z60Var = this.JFJ3QoxA;
        ((i1) z60Var.getValue()).GWasM1elztuh.setPath(h1Var != null ? h1Var.GWasM1elztuh : null, false);
        float length = ((i1) z60Var.getValue()).GWasM1elztuh.getLength();
        float f2 = 0.0f * length;
        float f3 = ((this.xqGvceK5x + 0.0f) % 1.0f) * length;
        if (f2 <= f3) {
            ((i1) z60Var.getValue()).GWasM1elztuh(f2, f3, this.encWxUiV2);
            return;
        }
        h1 h1Var2 = this.mOu10nynGul;
        if (h1Var2 == null) {
            h1Var2 = j1.GWasM1elztuh();
            this.mOu10nynGul = h1Var2;
        }
        h1Var2.OOA6hdeuvCS();
        ((i1) z60Var.getValue()).GWasM1elztuh(f2, length, h1Var2);
        h1.GWasM1elztuh(this.encWxUiV2, h1Var2);
        h1Var2.OOA6hdeuvCS();
        ((i1) z60Var.getValue()).GWasM1elztuh(0.0f, f3, h1Var2);
        h1.GWasM1elztuh(this.encWxUiV2, h1Var2);
    }

    public final String toString() {
        return this.AvO7iQsrTN.toString();
    }
}
