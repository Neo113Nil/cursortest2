package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class yn0 implements s3 {
    public final int AvO7iQsrTN;
    public final ja0 EljAMC1QTz;
    public final int GWasM1elztuh;
    public final bq0 OOA6hdeuvCS;
    public final long X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final int encWxUiV2;
    public final q81 mOu10nynGul;
    public final f81 xqGvceK5x;

    public yn0(int i, int i2, long j, f81 f81Var, bq0 bq0Var, ja0 ja0Var, int i3, int i4, q81 q81Var) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = i2;
        this.X1lG3V04pd = j;
        this.xqGvceK5x = f81Var;
        this.OOA6hdeuvCS = bq0Var;
        this.EljAMC1QTz = ja0Var;
        this.AvO7iQsrTN = i3;
        this.encWxUiV2 = i4;
        this.mOu10nynGul = q81Var;
        if (a91.GWasM1elztuh(j, a91.X1lG3V04pd) || a91.X1lG3V04pd(j) >= 0.0f) {
            return;
        }
        u10.Yi7zF1RB1("lineHeight can't be negative (" + a91.X1lG3V04pd(j) + ')');
    }

    public final yn0 GWasM1elztuh(yn0 yn0Var) {
        return yn0Var == null ? this : zn0.GWasM1elztuh(this, yn0Var.GWasM1elztuh, yn0Var.Yi7zF1RB1, yn0Var.X1lG3V04pd, yn0Var.xqGvceK5x, yn0Var.OOA6hdeuvCS, yn0Var.EljAMC1QTz, yn0Var.AvO7iQsrTN, yn0Var.encWxUiV2, yn0Var.mOu10nynGul);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn0)) {
            return false;
        }
        yn0 yn0Var = (yn0) obj;
        return this.GWasM1elztuh == yn0Var.GWasM1elztuh && this.Yi7zF1RB1 == yn0Var.Yi7zF1RB1 && a91.GWasM1elztuh(this.X1lG3V04pd, yn0Var.X1lG3V04pd) && o30.rQPn8YBR(this.xqGvceK5x, yn0Var.xqGvceK5x) && o30.rQPn8YBR(this.OOA6hdeuvCS, yn0Var.OOA6hdeuvCS) && o30.rQPn8YBR(this.EljAMC1QTz, yn0Var.EljAMC1QTz) && this.AvO7iQsrTN == yn0Var.AvO7iQsrTN && this.encWxUiV2 == yn0Var.encWxUiV2 && o30.rQPn8YBR(this.mOu10nynGul, yn0Var.mOu10nynGul);
    }

    public final int hashCode() {
        int Yi7zF1RB1 = mr0.Yi7zF1RB1(this.Yi7zF1RB1, Integer.hashCode(this.GWasM1elztuh) * 31, 31);
        b91[] b91VarArr = a91.Yi7zF1RB1;
        int X1lG3V04pd = mr0.X1lG3V04pd(Yi7zF1RB1, 31, this.X1lG3V04pd);
        f81 f81Var = this.xqGvceK5x;
        int hashCode = (X1lG3V04pd + (f81Var != null ? f81Var.hashCode() : 0)) * 31;
        bq0 bq0Var = this.OOA6hdeuvCS;
        int hashCode2 = (hashCode + (bq0Var != null ? bq0Var.hashCode() : 0)) * 31;
        ja0 ja0Var = this.EljAMC1QTz;
        int Yi7zF1RB12 = mr0.Yi7zF1RB1(this.encWxUiV2, mr0.Yi7zF1RB1(this.AvO7iQsrTN, (hashCode2 + (ja0Var != null ? ja0Var.hashCode() : 0)) * 31, 31), 31);
        q81 q81Var = this.mOu10nynGul;
        return Yi7zF1RB12 + (q81Var != null ? q81Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) x71.GWasM1elztuh(this.GWasM1elztuh)) + ", textDirection=" + ((Object) c81.GWasM1elztuh(this.Yi7zF1RB1)) + ", lineHeight=" + ((Object) a91.xqGvceK5x(this.X1lG3V04pd)) + ", textIndent=" + this.xqGvceK5x + ", platformStyle=" + this.OOA6hdeuvCS + ", lineHeightStyle=" + this.EljAMC1QTz + ", lineBreak=" + ((Object) ea0.GWasM1elztuh(this.AvO7iQsrTN)) + ", hyphens=" + ((Object) a00.GWasM1elztuh(this.encWxUiV2)) + ", textMotion=" + this.mOu10nynGul + ')';
    }
}
