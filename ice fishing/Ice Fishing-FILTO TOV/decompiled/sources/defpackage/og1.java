package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class og1 extends ng1 {
    public static final wg1 cilMamHF;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        cilMamHF = wg1.X1lG3V04pd(windowInsets, null);
    }

    public og1(wg1 wg1Var, WindowInsets windowInsets) {
        super(wg1Var, windowInsets);
    }

    @Override // defpackage.kg1, defpackage.sg1
    public e20 encWxUiV2(int i) {
        Insets insets;
        insets = this.X1lG3V04pd.getInsets(ug1.GWasM1elztuh(i));
        return e20.X1lG3V04pd(insets);
    }

    @Override // defpackage.kg1, defpackage.sg1
    public boolean jivtDDk9H(int i) {
        boolean isVisible;
        isVisible = this.X1lG3V04pd.isVisible(ug1.GWasM1elztuh(i));
        return isVisible;
    }

    @Override // defpackage.kg1, defpackage.sg1
    public e20 mOu10nynGul(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.X1lG3V04pd.getInsetsIgnoringVisibility(ug1.GWasM1elztuh(i));
        return e20.X1lG3V04pd(insetsIgnoringVisibility);
    }

    @Override // defpackage.kg1, defpackage.sg1
    public final void xqGvceK5x(View view) {
    }
}
