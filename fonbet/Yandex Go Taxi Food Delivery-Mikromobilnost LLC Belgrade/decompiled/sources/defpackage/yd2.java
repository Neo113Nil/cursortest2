package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.airbnb.lottie.LottieDrawable;
import com.yandex.passport.common.ui.view.CommonSpinner;
import java.util.function.Consumer;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.widget.ShimmeringPaint;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;
import ru.yandex.taxi.widgets.GoSplashView;

/* loaded from: classes9.dex */
public final /* synthetic */ class yd2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yd2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Consumer) obj).accept((Integer) valueAnimator.getAnimatedValue());
                break;
            case 1:
                GoSplashView.animateBackground$lambda$0$0((GoSplashView) obj, valueAnimator);
                break;
            case 2:
                ((LottieDrawable) obj).lambda$new$0(valueAnimator);
                break;
            case 3:
                NotificationStackComponent.hideInternal$lambda$0((NotificationStackComponent) obj, valueAnimator);
                break;
            case 4:
                ((View) obj).setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                ShimmeringPaint.enableShimmering$lambda$0((ShimmeringPaint) obj, valueAnimator);
                break;
            case 6:
                ShimmeringRobotoTextView.gradientAnimator$lambda$0$0((ShimmeringRobotoTextView) obj, valueAnimator);
                break;
            case 7:
                SwitchComponent.animatorUpdateListener$lambda$0((SwitchComponent) obj, valueAnimator);
                break;
            default:
                CommonSpinner.startAnimation$lambda$2$lambda$1((CommonSpinner) obj, valueAnimator);
                break;
        }
    }
}
