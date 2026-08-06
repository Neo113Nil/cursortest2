package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class qg1 extends pg1 {
    public static final wg1 lv06NcmrQ;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        lv06NcmrQ = wg1.X1lG3V04pd(windowInsets, null);
    }

    public qg1(wg1 wg1Var, WindowInsets windowInsets) {
        super(wg1Var, windowInsets);
    }

    @Override // defpackage.og1, defpackage.kg1, defpackage.sg1
    public e20 encWxUiV2(int i) {
        Insets insets;
        insets = this.X1lG3V04pd.getInsets(vg1.GWasM1elztuh(i));
        return e20.X1lG3V04pd(insets);
    }

    @Override // defpackage.og1, defpackage.kg1, defpackage.sg1
    public boolean jivtDDk9H(int i) {
        boolean isVisible;
        isVisible = this.X1lG3V04pd.isVisible(vg1.GWasM1elztuh(i));
        return isVisible;
    }

    @Override // defpackage.og1, defpackage.kg1, defpackage.sg1
    public e20 mOu10nynGul(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.X1lG3V04pd.getInsetsIgnoringVisibility(vg1.GWasM1elztuh(i));
        return e20.X1lG3V04pd(insetsIgnoringVisibility);
    }

    @Override // defpackage.kg1, defpackage.sg1
    public void iwATDS1i01k(View view) {
    }
}
