package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bl implements Iterator, q40 {
    public int AvO7iQsrTN;
    public int EljAMC1QTz;
    public final Object JFJ3QoxA;
    public final /* synthetic */ int OOA6hdeuvCS;
    public int encWxUiV2;
    public Object mOu10nynGul;

    public bl(cl clVar) {
        this.OOA6hdeuvCS = 0;
        this.JFJ3QoxA = clVar;
        this.EljAMC1QTz = -1;
        int encWxUiV2 = o50.encWxUiV2(0, 0, ((String) clVar.Yi7zF1RB1).length());
        this.AvO7iQsrTN = encWxUiV2;
        this.encWxUiV2 = encWxUiV2;
    }

    public void GWasM1elztuh() {
        cl clVar = (cl) this.JFJ3QoxA;
        String str = (String) clVar.Yi7zF1RB1;
        int i = this.encWxUiV2;
        if (i < 0) {
            this.EljAMC1QTz = 0;
            this.mOu10nynGul = null;
            return;
        }
        if (i > str.length()) {
            this.mOu10nynGul = new x20(this.AvO7iQsrTN, str.length() - 1, 1);
            this.encWxUiV2 = -1;
        } else {
            rn0 rn0Var = (rn0) ((lv) clVar.X1lG3V04pd).EljAMC1QTz(str, Integer.valueOf(this.encWxUiV2));
            if (rn0Var == null) {
                this.mOu10nynGul = new x20(this.AvO7iQsrTN, str.length() - 1, 1);
                this.encWxUiV2 = -1;
            } else {
                int intValue = ((Number) rn0Var.OOA6hdeuvCS).intValue();
                int intValue2 = ((Number) rn0Var.EljAMC1QTz).intValue();
                this.mOu10nynGul = o50.MZhzXH72(this.AvO7iQsrTN, intValue);
                int i2 = intValue + intValue2;
                this.AvO7iQsrTN = i2;
                this.encWxUiV2 = i2 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.EljAMC1QTz = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                if (this.EljAMC1QTz == -1) {
                    GWasM1elztuh();
                }
                return this.EljAMC1QTz == 1;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                if (this.EljAMC1QTz == -1) {
                    GWasM1elztuh();
                }
                if (this.EljAMC1QTz == 0) {
                    o4.E7jCp8Ls();
                    return null;
                }
                x20 x20Var = (x20) this.mOu10nynGul;
                x20Var.getClass();
                this.mOu10nynGul = null;
                this.EljAMC1QTz = -1;
                return x20Var;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.OOA6hdeuvCS) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public bl(z21 z21Var, int i, sx sxVar, w60 w60Var) {
        this.OOA6hdeuvCS = 1;
        this.mOu10nynGul = z21Var;
        this.EljAMC1QTz = i;
        this.JFJ3QoxA = w60Var;
        this.AvO7iQsrTN = z21Var.E7jCp8Ls;
    }
}
