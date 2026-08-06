package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hh0 {
    public final Bundle AvO7iQsrTN;
    public final m71 E7jCp8Ls;
    public final String EljAMC1QTz;
    public final fh0 GWasM1elztuh;
    public final w90 JFJ3QoxA;
    public final qh0 OOA6hdeuvCS;
    public final Bundle X1lG3V04pd;
    public final xh0 Yi7zF1RB1;
    public final d encWxUiV2;
    public boolean mOu10nynGul;
    public m90 rQPn8YBR;
    public m90 xqGvceK5x;

    public hh0(fh0 fh0Var) {
        this.GWasM1elztuh = fh0Var;
        this.Yi7zF1RB1 = fh0Var.EljAMC1QTz;
        this.X1lG3V04pd = fh0Var.AvO7iQsrTN;
        this.xqGvceK5x = fh0Var.encWxUiV2;
        this.OOA6hdeuvCS = fh0Var.mOu10nynGul;
        this.EljAMC1QTz = fh0Var.JFJ3QoxA;
        this.AvO7iQsrTN = fh0Var.rQPn8YBR;
        this.encWxUiV2 = new d(new xw0(fh0Var, new o1(13, fh0Var)), 18);
        m71 m71Var = new m71(new sb9fmtV8A(25));
        this.JFJ3QoxA = new w90(fh0Var, true);
        this.rQPn8YBR = m90.EljAMC1QTz;
        this.E7jCp8Ls = new m71(new sb9fmtV8A(26));
    }

    public final Bundle GWasM1elztuh() {
        Bundle bundle = this.X1lG3V04pd;
        if (bundle == null) {
            return null;
        }
        Bundle jivtDDk9H = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
        jivtDDk9H.putAll(bundle);
        return jivtDDk9H;
    }

    public final void Yi7zF1RB1() {
        if (!this.mOu10nynGul) {
            d dVar = this.encWxUiV2;
            ((xw0) dVar.EljAMC1QTz).GWasM1elztuh();
            this.mOu10nynGul = true;
            if (this.OOA6hdeuvCS != null) {
                fb1.lv06NcmrQ(this.GWasM1elztuh);
            }
            dVar.Mjvvu5DE(this.AvO7iQsrTN);
        }
        int ordinal = this.xqGvceK5x.ordinal();
        int ordinal2 = this.rQPn8YBR.ordinal();
        w90 w90Var = this.JFJ3QoxA;
        if (ordinal < ordinal2) {
            m90 m90Var = this.xqGvceK5x;
            w90Var.getClass();
            m90Var.getClass();
            w90Var.X1lG3V04pd("setCurrentState");
            w90Var.OOA6hdeuvCS(m90Var);
            return;
        }
        m90 m90Var2 = this.rQPn8YBR;
        w90Var.getClass();
        m90Var2.getClass();
        w90Var.X1lG3V04pd("setCurrentState");
        w90Var.OOA6hdeuvCS(m90Var2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(st0.GWasM1elztuh(fh0.class).Yi7zF1RB1());
        sb.append("(" + this.EljAMC1QTz + ')');
        sb.append(" destination=");
        sb.append(this.Yi7zF1RB1);
        return sb.toString();
    }
}
