package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class wg1 {
    public static final wg1 Yi7zF1RB1;
    public final sg1 GWasM1elztuh;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            Yi7zF1RB1 = qg1.lv06NcmrQ;
        } else if (i >= 30) {
            Yi7zF1RB1 = og1.cilMamHF;
        } else {
            Yi7zF1RB1 = sg1.Yi7zF1RB1;
        }
    }

    public wg1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.GWasM1elztuh = new rg1(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.GWasM1elztuh = new qg1(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.GWasM1elztuh = new pg1(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.GWasM1elztuh = new og1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.GWasM1elztuh = new ng1(this, windowInsets);
        } else if (i >= 28) {
            this.GWasM1elztuh = new mg1(this, windowInsets);
        } else {
            this.GWasM1elztuh = new lg1(this, windowInsets);
        }
    }

    public static e20 GWasM1elztuh(e20 e20Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, e20Var.GWasM1elztuh - i);
        int max2 = Math.max(0, e20Var.Yi7zF1RB1 - i2);
        int max3 = Math.max(0, e20Var.X1lG3V04pd - i3);
        int max4 = Math.max(0, e20Var.xqGvceK5x - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? e20Var : e20.Yi7zF1RB1(max, max2, max3, max4);
    }

    public static wg1 X1lG3V04pd(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        wg1 wg1Var = new wg1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = ne1.GWasM1elztuh;
            wg1 GWasM1elztuh = je1.GWasM1elztuh(view);
            sg1 sg1Var = wg1Var.GWasM1elztuh;
            sg1Var.lv06NcmrQ(GWasM1elztuh);
            View rootView = view.getRootView();
            sg1Var.xqGvceK5x(rootView);
            sg1Var.iwATDS1i01k(rootView);
            sg1Var.WIEu4Ya2g8();
            sg1Var.WRKkgoJXwDn(view.getWindowSystemUiVisibility());
        }
        return wg1Var;
    }

    public final WindowInsets Yi7zF1RB1() {
        sg1 sg1Var = this.GWasM1elztuh;
        if (sg1Var instanceof kg1) {
            return ((kg1) sg1Var).X1lG3V04pd;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wg1) {
            return Objects.equals(this.GWasM1elztuh, ((wg1) obj).GWasM1elztuh);
        }
        return false;
    }

    public final int hashCode() {
        sg1 sg1Var = this.GWasM1elztuh;
        if (sg1Var == null) {
            return 0;
        }
        return sg1Var.hashCode();
    }

    public wg1() {
        this.GWasM1elztuh = new sg1(this);
    }
}
