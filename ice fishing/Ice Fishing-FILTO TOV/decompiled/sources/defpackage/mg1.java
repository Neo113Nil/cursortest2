package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class mg1 extends lg1 {
    public mg1(wg1 wg1Var, WindowInsets windowInsets) {
        super(wg1Var, windowInsets);
    }

    @Override // defpackage.sg1
    public om AvO7iQsrTN() {
        DisplayCutout displayCutout;
        displayCutout = this.X1lG3V04pd.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new om(displayCutout);
    }

    @Override // defpackage.sg1
    public wg1 GWasM1elztuh() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.X1lG3V04pd.consumeDisplayCutout();
        return wg1.X1lG3V04pd(consumeDisplayCutout, null);
    }

    @Override // defpackage.kg1, defpackage.sg1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg1)) {
            return false;
        }
        mg1 mg1Var = (mg1) obj;
        return Objects.equals(this.X1lG3V04pd, mg1Var.X1lG3V04pd) && Objects.equals(this.AvO7iQsrTN, mg1Var.AvO7iQsrTN) && kg1.HFYAaqMd6(this.encWxUiV2, mg1Var.encWxUiV2);
    }

    @Override // defpackage.sg1
    public int hashCode() {
        return this.X1lG3V04pd.hashCode();
    }
}
