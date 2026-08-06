package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class x7 {
    public final rg0 GWasM1elztuh;

    public x7(int i) {
        switch (i) {
            case 1:
                this.GWasM1elztuh = new rg0(new e70[16]);
                break;
            default:
                this.GWasM1elztuh = new rg0(new lg[16]);
                break;
        }
    }

    public void GWasM1elztuh(CancellationException cancellationException) {
        rg0 rg0Var = this.GWasM1elztuh;
        int i = rg0Var.AvO7iQsrTN;
        l9[] l9VarArr = new l9[i];
        for (int i2 = 0; i2 < i; i2++) {
            l9VarArr[i2] = ((lg) rg0Var.OOA6hdeuvCS[i2]).Yi7zF1RB1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            l9VarArr[i3].rQPn8YBR(cancellationException);
        }
        if (rg0Var.AvO7iQsrTN == 0) {
            return;
        }
        w10.X1lG3V04pd("uncancelled requests present");
    }

    public void Yi7zF1RB1() {
        rg0 rg0Var = this.GWasM1elztuh;
        x20 MZhzXH72 = o50.MZhzXH72(0, rg0Var.AvO7iQsrTN);
        int i = MZhzXH72.OOA6hdeuvCS;
        int i2 = MZhzXH72.EljAMC1QTz;
        if (i <= i2) {
            while (true) {
                ((lg) rg0Var.OOA6hdeuvCS[i]).Yi7zF1RB1.AvO7iQsrTN(kc1.GWasM1elztuh);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        rg0Var.AvO7iQsrTN();
    }
}
