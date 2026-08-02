package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.navigator.driving.DrivingModeNotification;
import ru.yandex.taxi.surge.dialog.TextBlockView;

/* loaded from: classes14.dex */
public final /* synthetic */ class wd2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ wd2(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.requestLayout();
                break;
            case 1:
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                view.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                view.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 4:
                DrivingModeNotification.getItemOutOfScreenHorizontallyAnimator$lambda$0(view, valueAnimator);
                break;
            case 5:
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                view.setTranslationX((1.0f - valueAnimator.getAnimatedFraction()) * (-30.0f));
                break;
            case 7:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = intValue;
                view.setLayoutParams(layoutParams);
                break;
            case 8:
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(layoutParams2);
                break;
            case 9:
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 10:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                layoutParams3.width = intValue2;
                layoutParams3.height = intValue2;
                view.setLayoutParams(layoutParams3);
                break;
            case 11:
                view.setAlpha(0.0f);
                break;
            case 12:
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 13:
                view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue() * view.getWidth());
                break;
            default:
                TextBlockView.runRotationAnimation$lambda$0$0(view, valueAnimator);
                break;
        }
    }
}
