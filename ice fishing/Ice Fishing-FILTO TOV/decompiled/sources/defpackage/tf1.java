package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class tf1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ bg1 GWasM1elztuh;
    public final /* synthetic */ View OOA6hdeuvCS;
    public final /* synthetic */ wg1 X1lG3V04pd;
    public final /* synthetic */ wg1 Yi7zF1RB1;
    public final /* synthetic */ int xqGvceK5x;

    public tf1(bg1 bg1Var, wg1 wg1Var, wg1 wg1Var2, int i, View view) {
        this.GWasM1elztuh = bg1Var;
        this.Yi7zF1RB1 = wg1Var;
        this.X1lG3V04pd = wg1Var2;
        this.xqGvceK5x = i;
        this.OOA6hdeuvCS = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        bg1 bg1Var = this.GWasM1elztuh;
        ag1 ag1Var = bg1Var.GWasM1elztuh;
        ag1Var.OOA6hdeuvCS(animatedFraction);
        float X1lG3V04pd = ag1Var.X1lG3V04pd();
        PathInterpolator pathInterpolator = xf1.OOA6hdeuvCS;
        int i = Build.VERSION.SDK_INT;
        wg1 wg1Var = this.Yi7zF1RB1;
        jg1 ig1Var = i >= 36 ? new ig1(wg1Var) : i >= 35 ? new hg1(wg1Var) : i >= 34 ? new gg1(wg1Var) : i >= 31 ? new fg1(wg1Var) : i >= 30 ? new eg1(wg1Var) : i >= 29 ? new dg1(wg1Var) : new cg1(wg1Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.xqGvceK5x & i2;
            sg1 sg1Var = wg1Var.GWasM1elztuh;
            if (i3 == 0) {
                ig1Var.xqGvceK5x(i2, sg1Var.encWxUiV2(i2));
            } else {
                e20 encWxUiV2 = sg1Var.encWxUiV2(i2);
                e20 encWxUiV22 = this.X1lG3V04pd.GWasM1elztuh.encWxUiV2(i2);
                float f = 1.0f - X1lG3V04pd;
                ig1Var.xqGvceK5x(i2, wg1.GWasM1elztuh(encWxUiV2, (int) (((encWxUiV2.GWasM1elztuh - encWxUiV22.GWasM1elztuh) * f) + 0.5d), (int) (((encWxUiV2.Yi7zF1RB1 - encWxUiV22.Yi7zF1RB1) * f) + 0.5d), (int) (((encWxUiV2.X1lG3V04pd - encWxUiV22.X1lG3V04pd) * f) + 0.5d), (int) (((encWxUiV2.xqGvceK5x - encWxUiV22.xqGvceK5x) * f) + 0.5d)));
            }
        }
        xf1.encWxUiV2(this.OOA6hdeuvCS, ig1Var.Yi7zF1RB1(), Collections.singletonList(bg1Var));
    }
}
