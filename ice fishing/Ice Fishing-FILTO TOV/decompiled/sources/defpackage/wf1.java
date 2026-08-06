package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.combinations.level.experts.R;
import java.util.Objects;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class wf1 implements View.OnApplyWindowInsetsListener {
    public final mb GWasM1elztuh;
    public wg1 Yi7zF1RB1;

    public wf1(View view, mb mbVar) {
        wg1 wg1Var;
        this.GWasM1elztuh = mbVar;
        int i = ne1.GWasM1elztuh;
        wg1 GWasM1elztuh = je1.GWasM1elztuh(view);
        if (GWasM1elztuh != null) {
            int i2 = Build.VERSION.SDK_INT;
            wg1Var = (i2 >= 36 ? new ig1(GWasM1elztuh) : i2 >= 35 ? new hg1(GWasM1elztuh) : i2 >= 34 ? new gg1(GWasM1elztuh) : i2 >= 31 ? new fg1(GWasM1elztuh) : i2 >= 30 ? new eg1(GWasM1elztuh) : i2 >= 29 ? new dg1(GWasM1elztuh) : new cg1(GWasM1elztuh)).Yi7zF1RB1();
        } else {
            wg1Var = null;
        }
        this.Yi7zF1RB1 = wg1Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.Yi7zF1RB1 = wg1.X1lG3V04pd(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        wg1 X1lG3V04pd = wg1.X1lG3V04pd(windowInsets, view);
        sg1 sg1Var = X1lG3V04pd.GWasM1elztuh;
        if (this.Yi7zF1RB1 == null) {
            int i = ne1.GWasM1elztuh;
            this.Yi7zF1RB1 = je1.GWasM1elztuh(view);
        }
        if (this.Yi7zF1RB1 == null) {
            this.Yi7zF1RB1 = X1lG3V04pd;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            mb JFJ3QoxA = xf1.JFJ3QoxA(view);
            if (JFJ3QoxA == null || !Objects.equals((wg1) JFJ3QoxA.EljAMC1QTz, X1lG3V04pd)) {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                wg1 wg1Var = this.Yi7zF1RB1;
                int i2 = 1;
                while (i2 <= 512) {
                    e20 encWxUiV2 = sg1Var.encWxUiV2(i2);
                    e20 encWxUiV22 = wg1Var.GWasM1elztuh.encWxUiV2(i2);
                    int i3 = encWxUiV2.GWasM1elztuh;
                    int i4 = encWxUiV2.xqGvceK5x;
                    int i5 = encWxUiV2.X1lG3V04pd;
                    int i6 = encWxUiV2.Yi7zF1RB1;
                    int i7 = encWxUiV22.GWasM1elztuh;
                    int i8 = encWxUiV22.xqGvceK5x;
                    int[] iArr4 = iArr2;
                    int i9 = encWxUiV22.X1lG3V04pd;
                    int i10 = encWxUiV22.Yi7zF1RB1;
                    if (i3 > i7 || i6 > i10 || i5 > i9 || i4 > i8) {
                        iArr = iArr3;
                        z = true;
                    } else {
                        iArr = iArr3;
                        z = false;
                    }
                    if (z != (i3 < i7 || i6 < i10 || i5 < i9 || i4 < i8)) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i2;
                        } else {
                            iArr[0] = iArr[0] | i2;
                        }
                    }
                    i2 <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i11 = iArr2[0];
                int i12 = iArr3[0];
                int i13 = i11 | i12;
                if (i13 == 0) {
                    this.Yi7zF1RB1 = X1lG3V04pd;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    wg1 wg1Var2 = this.Yi7zF1RB1;
                    bg1 bg1Var = new bg1(i13, (i11 & 8) != 0 ? xf1.OOA6hdeuvCS : (i12 & 8) != 0 ? xf1.EljAMC1QTz : (i11 & 519) != 0 ? xf1.AvO7iQsrTN : (i12 & 519) != 0 ? xf1.encWxUiV2 : null, (i13 & 8) != 0 ? 160L : 250L);
                    bg1Var.GWasM1elztuh.OOA6hdeuvCS(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(bg1Var.GWasM1elztuh.Yi7zF1RB1());
                    e20 encWxUiV23 = sg1Var.encWxUiV2(i13);
                    e20 encWxUiV24 = wg1Var2.GWasM1elztuh.encWxUiV2(i13);
                    int min = Math.min(encWxUiV23.GWasM1elztuh, encWxUiV24.GWasM1elztuh);
                    int i14 = encWxUiV23.Yi7zF1RB1;
                    int i15 = encWxUiV24.Yi7zF1RB1;
                    int min2 = Math.min(i14, i15);
                    int i16 = encWxUiV23.X1lG3V04pd;
                    int i17 = encWxUiV24.X1lG3V04pd;
                    int min3 = Math.min(i16, i17);
                    int i18 = encWxUiV23.xqGvceK5x;
                    int i19 = encWxUiV24.xqGvceK5x;
                    d dVar = new d(23, e20.Yi7zF1RB1(min, min2, min3, Math.min(i18, i19)), e20.Yi7zF1RB1(Math.max(encWxUiV23.GWasM1elztuh, encWxUiV24.GWasM1elztuh), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)));
                    xf1.AvO7iQsrTN(view, bg1Var, X1lG3V04pd, false);
                    duration.addUpdateListener(new tf1(bg1Var, X1lG3V04pd, wg1Var2, i13, view));
                    duration.addListener(new uf1(bg1Var, view));
                    ll0 ll0Var = new ll0(view, new vf1(view, bg1Var, dVar, duration));
                    view.getViewTreeObserver().addOnPreDrawListener(ll0Var);
                    view.addOnAttachStateChangeListener(ll0Var);
                    this.Yi7zF1RB1 = X1lG3V04pd;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
