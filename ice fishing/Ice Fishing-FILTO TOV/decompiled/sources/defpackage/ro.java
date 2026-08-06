package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ro {
    public EdgeEffect AvO7iQsrTN;
    public EdgeEffect EljAMC1QTz;
    public final Context GWasM1elztuh;
    public EdgeEffect JFJ3QoxA;
    public EdgeEffect OOA6hdeuvCS;
    public long X1lG3V04pd = 0;
    public final int Yi7zF1RB1;
    public EdgeEffect encWxUiV2;
    public EdgeEffect mOu10nynGul;
    public EdgeEffect rQPn8YBR;
    public EdgeEffect xqGvceK5x;

    public ro(Context context, int i) {
        this.GWasM1elztuh = context;
        this.Yi7zF1RB1 = i;
    }

    public static boolean AvO7iQsrTN(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? d4.X1lG3V04pd(edgeEffect) : 0.0f) == 0.0f);
    }

    public static boolean EljAMC1QTz(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final EdgeEffect GWasM1elztuh(xm0 xm0Var) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.GWasM1elztuh;
        EdgeEffect GWasM1elztuh = i >= 31 ? d4.GWasM1elztuh(context) : new ly(context);
        GWasM1elztuh.setColor(this.Yi7zF1RB1);
        if (!b30.GWasM1elztuh(this.X1lG3V04pd, 0L)) {
            long j = this.X1lG3V04pd;
            if (xm0Var == xm0.OOA6hdeuvCS) {
                GWasM1elztuh.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return GWasM1elztuh;
            }
            GWasM1elztuh.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return GWasM1elztuh;
    }

    public final EdgeEffect OOA6hdeuvCS() {
        EdgeEffect edgeEffect = this.xqGvceK5x;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect GWasM1elztuh = GWasM1elztuh(xm0.OOA6hdeuvCS);
        this.xqGvceK5x = GWasM1elztuh;
        return GWasM1elztuh;
    }

    public final EdgeEffect X1lG3V04pd() {
        EdgeEffect edgeEffect = this.EljAMC1QTz;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect GWasM1elztuh = GWasM1elztuh(xm0.EljAMC1QTz);
        this.EljAMC1QTz = GWasM1elztuh;
        return GWasM1elztuh;
    }

    public final EdgeEffect Yi7zF1RB1() {
        EdgeEffect edgeEffect = this.OOA6hdeuvCS;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect GWasM1elztuh = GWasM1elztuh(xm0.OOA6hdeuvCS);
        this.OOA6hdeuvCS = GWasM1elztuh;
        return GWasM1elztuh;
    }

    public final EdgeEffect xqGvceK5x() {
        EdgeEffect edgeEffect = this.AvO7iQsrTN;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect GWasM1elztuh = GWasM1elztuh(xm0.EljAMC1QTz);
        this.AvO7iQsrTN = GWasM1elztuh;
        return GWasM1elztuh;
    }
}
