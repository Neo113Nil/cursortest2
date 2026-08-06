package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class jg1 {
    public final wg1 GWasM1elztuh;
    public final Rect[][] X1lG3V04pd;
    public e20[] Yi7zF1RB1;
    public final Rect[][] xqGvceK5x;

    public jg1(wg1 wg1Var) {
        this.X1lG3V04pd = new Rect[10][];
        this.xqGvceK5x = new Rect[10][];
        this.GWasM1elztuh = wg1Var;
        X1lG3V04pd(wg1Var);
    }

    public abstract void EljAMC1QTz(e20 e20Var);

    public final void GWasM1elztuh() {
        e20[] e20VarArr = this.Yi7zF1RB1;
        if (e20VarArr != null) {
            e20 e20Var = e20VarArr[0];
            e20 e20Var2 = e20VarArr[1];
            wg1 wg1Var = this.GWasM1elztuh;
            if (e20Var2 == null) {
                e20Var2 = wg1Var.GWasM1elztuh.encWxUiV2(2);
            }
            if (e20Var == null) {
                e20Var = wg1Var.GWasM1elztuh.encWxUiV2(1);
            }
            encWxUiV2(e20.GWasM1elztuh(e20Var, e20Var2));
            e20 e20Var3 = this.Yi7zF1RB1[w60.WIEu4Ya2g8(16)];
            if (e20Var3 != null) {
                AvO7iQsrTN(e20Var3);
            }
            e20 e20Var4 = this.Yi7zF1RB1[w60.WIEu4Ya2g8(32)];
            if (e20Var4 != null) {
                OOA6hdeuvCS(e20Var4);
            }
            e20 e20Var5 = this.Yi7zF1RB1[w60.WIEu4Ya2g8(64)];
            if (e20Var5 != null) {
                mOu10nynGul(e20Var5);
            }
        }
    }

    public void X1lG3V04pd(wg1 wg1Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> OOA6hdeuvCS = wg1Var.GWasM1elztuh.OOA6hdeuvCS(i);
            int WIEu4Ya2g8 = w60.WIEu4Ya2g8(i);
            this.X1lG3V04pd[WIEu4Ya2g8] = (Rect[]) OOA6hdeuvCS.toArray(new Rect[OOA6hdeuvCS.size()]);
            if (i != 8) {
                List<Rect> EljAMC1QTz = wg1Var.GWasM1elztuh.EljAMC1QTz(i);
                this.xqGvceK5x[WIEu4Ya2g8] = (Rect[]) EljAMC1QTz.toArray(new Rect[EljAMC1QTz.size()]);
            }
        }
    }

    public abstract wg1 Yi7zF1RB1();

    public abstract void encWxUiV2(e20 e20Var);

    public void xqGvceK5x(int i, e20 e20Var) {
        if (this.Yi7zF1RB1 == null) {
            this.Yi7zF1RB1 = new e20[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.Yi7zF1RB1[w60.WIEu4Ya2g8(i2)] = e20Var;
            }
        }
    }

    public jg1() {
        this(new wg1());
    }

    public void AvO7iQsrTN(e20 e20Var) {
    }

    public void OOA6hdeuvCS(e20 e20Var) {
    }

    public void mOu10nynGul(e20 e20Var) {
    }
}
