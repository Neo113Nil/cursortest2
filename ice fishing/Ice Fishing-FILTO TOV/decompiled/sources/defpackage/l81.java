package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class l81 {
    public final el AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final u3 GWasM1elztuh;
    public final long JFJ3QoxA;
    public final boolean OOA6hdeuvCS;
    public final List X1lG3V04pd;
    public final y81 Yi7zF1RB1;
    public final p50 encWxUiV2;
    public final yt mOu10nynGul;
    public final int xqGvceK5x;

    public l81(u3 u3Var, y81 y81Var, List list, int i, boolean z, int i2, el elVar, p50 p50Var, yt ytVar, long j) {
        this.GWasM1elztuh = u3Var;
        this.Yi7zF1RB1 = y81Var;
        this.X1lG3V04pd = list;
        this.xqGvceK5x = i;
        this.OOA6hdeuvCS = z;
        this.EljAMC1QTz = i2;
        this.AvO7iQsrTN = elVar;
        this.encWxUiV2 = p50Var;
        this.mOu10nynGul = ytVar;
        this.JFJ3QoxA = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l81)) {
            return false;
        }
        l81 l81Var = (l81) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, l81Var.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, l81Var.Yi7zF1RB1) && this.X1lG3V04pd.equals(l81Var.X1lG3V04pd) && this.xqGvceK5x == l81Var.xqGvceK5x && this.OOA6hdeuvCS == l81Var.OOA6hdeuvCS && this.EljAMC1QTz == l81Var.EljAMC1QTz && o30.rQPn8YBR(this.AvO7iQsrTN, l81Var.AvO7iQsrTN) && this.encWxUiV2 == l81Var.encWxUiV2 && o30.rQPn8YBR(this.mOu10nynGul, l81Var.mOu10nynGul) && eg.Yi7zF1RB1(this.JFJ3QoxA, l81Var.JFJ3QoxA);
    }

    public final int hashCode() {
        return Long.hashCode(this.JFJ3QoxA) + ((this.mOu10nynGul.hashCode() + ((this.encWxUiV2.hashCode() + ((this.AvO7iQsrTN.hashCode() + mr0.Yi7zF1RB1(this.EljAMC1QTz, mr0.xqGvceK5x((((this.X1lG3V04pd.hashCode() + mr0.OOA6hdeuvCS(this.Yi7zF1RB1, this.GWasM1elztuh.hashCode() * 31, 31)) * 31) + this.xqGvceK5x) * 31, 31, this.OOA6hdeuvCS), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.GWasM1elztuh);
        sb.append(", style=");
        sb.append(this.Yi7zF1RB1);
        sb.append(", placeholders=");
        sb.append(this.X1lG3V04pd);
        sb.append(", maxLines=");
        sb.append(this.xqGvceK5x);
        sb.append(", softWrap=");
        sb.append(this.OOA6hdeuvCS);
        sb.append(", overflow=");
        int i = this.EljAMC1QTz;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.AvO7iQsrTN);
        sb.append(", layoutDirection=");
        sb.append(this.encWxUiV2);
        sb.append(", fontFamilyResolver=");
        sb.append(this.mOu10nynGul);
        sb.append(", constraints=");
        sb.append((Object) eg.rQPn8YBR(this.JFJ3QoxA));
        sb.append(')');
        return sb.toString();
    }
}
