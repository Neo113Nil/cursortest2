package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.google.android.material.button.MaterialButton;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class jz7 extends y2x {
    public final /* synthetic */ int j;

    public /* synthetic */ jz7(int i) {
        this.j = i;
    }

    @Override // defpackage.y2x
    public final float A(Object obj) {
        float displayedWidthIncrease;
        switch (this.j) {
            case 0:
                return ((kz7) obj).q.b * 10000.0f;
            default:
                displayedWidthIncrease = ((MaterialButton) obj).getDisplayedWidthIncrease();
                return displayedWidthIncrease;
        }
    }

    @Override // defpackage.y2x
    public final void Y(Object obj, float f) {
        switch (this.j) {
            case 0:
                kz7 kz7Var = (kz7) obj;
                kz7Var.q.b = f / 10000.0f;
                kz7Var.invalidateSelf();
                int i = (int) f;
                if (kz7Var.b.c(true)) {
                    Context context = kz7Var.a;
                    if (kz7Var.u == null) {
                        LinearInterpolator linearInterpolator = wm0.a;
                        kz7Var.w = szf.q0(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        kz7Var.x = szf.q0(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        kz7Var.u = valueAnimator;
                        valueAnimator.setDuration(500L);
                        kz7Var.u.setFloatValues(0.0f, 1.0f);
                        kz7Var.u.setInterpolator(null);
                        kz7Var.u.addUpdateListener(new hr2(5, kz7Var));
                    }
                    float f2 = i;
                    float f3 = (f2 < 1000.0f || f2 > 9000.0f) ? 0.0f : 1.0f;
                    float f4 = kz7Var.r;
                    ValueAnimator valueAnimator2 = kz7Var.u;
                    if (f3 == f4) {
                        if (!valueAnimator2.isRunning()) {
                            kz7Var.q.e = f3;
                            kz7Var.invalidateSelf();
                            break;
                        }
                    } else {
                        if (valueAnimator2.isRunning()) {
                            kz7Var.u.cancel();
                        }
                        kz7Var.r = f3;
                        if (f3 != 1.0f) {
                            kz7Var.v = kz7Var.x;
                            kz7Var.u.reverse();
                            break;
                        } else {
                            kz7Var.v = kz7Var.w;
                            kz7Var.u.start();
                            break;
                        }
                    }
                }
                break;
            default:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f);
                break;
        }
    }
}
