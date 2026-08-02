package defpackage;

import android.animation.ValueAnimator;
import com.adjust.sdk.Constants;
import com.adjust.sdk.network.ErrorCodes;
import ru.yandex.taxi.eatskit.widget.placeholder.grocery.GrocerySplashView;

/* loaded from: classes5.dex */
public final /* synthetic */ class xcu0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zcu0 b;

    public /* synthetic */ xcu0(zcu0 zcu0Var, int i) {
        this.a = i;
        this.b = zcu0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        zcu0 zcu0Var = this.b;
        switch (i) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                float f = intValue % 400.0f;
                int i2 = intValue / Constants.MINIMAL_ERROR_STATUS_CODE;
                if (i2 < zcu0Var.c.size() && i2 >= 0) {
                    acu0 acu0Var = (acu0) zcu0Var.c.get(i2);
                    float f2 = f < 300.0f ? f / 300.0f : 1.0f;
                    int b = m810.b(255.0f * f2);
                    acu0Var.d.setAlpha(b);
                    acu0Var.c.setAlpha(b);
                    if (f2 >= 1.0f) {
                        acu0Var.f = 1.0f;
                    } else {
                        acu0Var.f = 1.2f - (f2 * 0.2f);
                    }
                }
                GrocerySplashView grocerySplashView = zcu0Var.b;
                if (grocerySplashView != null) {
                    grocerySplashView.invalidate();
                    break;
                }
                break;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int c = (1100 > intValue2 || intValue2 >= 1901) ? (300 > intValue2 || intValue2 >= 1101) ? 0 : x4e.c(intValue2, 300, 200, 1) : x4e.c(intValue2, ErrorCodes.THROWABLE, 100, 5);
                if (c < zcu0Var.c.size() && c >= 0) {
                    acu0 acu0Var2 = (acu0) zcu0Var.c.get(c);
                    acu0Var2.d.setAlpha(0);
                    acu0Var2.c.setAlpha(0);
                }
                GrocerySplashView grocerySplashView2 = zcu0Var.b;
                if (grocerySplashView2 != null) {
                    grocerySplashView2.invalidate();
                    break;
                }
                break;
        }
    }
}
