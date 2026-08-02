package ru.yandex.taxi.widgets;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.yandex.go.splash.BaseSplashView;
import defpackage.hqg0;
import defpackage.mrt;
import defpackage.qje;
import defpackage.qke;
import defpackage.qqt0;
import defpackage.tje;
import defpackage.vng;
import defpackage.vyg0;
import defpackage.xng0;
import defpackage.yd2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 32\u00020\u0001:\u00014B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001a\u0010\"\u001a\u00020!8\u0014X\u0094D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001fR\u0014\u00102\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u001f¨\u00065"}, d2 = {"Lru/yandex/taxi/widgets/GoSplashView;", "Lcom/yandex/go/splash/BaseSplashView;", "Landroid/content/Context;", "context", "Lqqt0;", "hapticPreferences", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Lqqt0;Landroid/util/AttributeSet;I)V", "Lzy11;", "animateScale", "()V", "Ljava/lang/Runnable;", "detachFromParent", "animateBackground", "(Ljava/lang/Runnable;)V", "animateFade", "hide", "width", "height", "recalculateBounds", "(II)V", "Landroid/animation/ValueAnimator;", "animation", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "Lqqt0;", "logoWidth", CA20Status.STATUS_USER_I, "logoHeight", "", "inDuration", "J", "getInDuration", "()J", "Landroid/view/animation/AccelerateInterpolator;", "interpolator", "Landroid/view/animation/AccelerateInterpolator;", "getInterpolator", "()Landroid/view/animation/AccelerateInterpolator;", "Landroid/graphics/drawable/AnimatedVectorDrawable;", "logoDrawable", "Landroid/graphics/drawable/AnimatedVectorDrawable;", "Landroid/view/View;", "logoView", "Landroid/view/View;", "startColor", "endColor", "Companion", "mrt", TariffOrderFlow.ORDER_FLOW_TAXI_KEY}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GoSplashView extends BaseSplashView {
    private static final mrt Companion = new mrt();
    private static final long FADE_COLOR_DURATION = 350;
    private static final long FADE_DELAY = 500;
    private static final long FADE_DURATION = 500;
    private static final long SCALE_DURATION = 600;
    private final int endColor;
    private final qqt0 hapticPreferences;
    private final long inDuration;
    private final AccelerateInterpolator interpolator;
    private final AnimatedVectorDrawable logoDrawable;
    private final int logoHeight;
    private final View logoView;
    private final int logoWidth;
    private final int startColor;

    public GoSplashView(Context context, qqt0 qqt0Var, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.hapticPreferences = qqt0Var;
        int u = tje.u(470, getContext());
        this.logoWidth = u;
        int u2 = tje.u(1020, getContext());
        this.logoHeight = u2;
        this.interpolator = new AccelerateInterpolator();
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) vng.t(vyg0.splash_animation, getContext());
        this.logoDrawable = animatedVectorDrawable;
        View view = new View(context);
        this.logoView = view;
        int color = getContext().getColor(hqg0.go_brand);
        this.startColor = color;
        this.endColor = qje.t(xng0.bgMain, getContext());
        setBackgroundColor(color);
        view.setBackground(animatedVectorDrawable);
        addView(view, new FrameLayout.LayoutParams(u, u2, 17));
    }

    private final void animateBackground(final Runnable detachFromParent) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.startColor), Integer.valueOf(this.endColor));
        ofObject.setDuration(FADE_COLOR_DURATION);
        ofObject.setStartDelay(500L);
        ofObject.addUpdateListener(new yd2(1, this));
        ofObject.addListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.widgets.GoSplashView$animateBackground$lambda$0$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                GoSplashView.this.animateFade(detachFromParent);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofObject.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateBackground$lambda$0$0(GoSplashView goSplashView, ValueAnimator valueAnimator) {
        goSplashView.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateFade(Runnable detachFromParent) {
        animate().alpha(0.0f).setDuration(500L).withEndAction(detachFromParent).start();
    }

    private final void animateScale() {
        float max = Math.max(getWidth() / this.logoWidth, getHeight() / this.logoHeight);
        if (max > 1.0f) {
            this.logoView.animate().scaleX(max).scaleY(max).setInterpolator(getInterpolator()).setDuration(600L).start();
        }
    }

    @Override // com.yandex.go.splash.BaseSplashView
    public long getInDuration() {
        return this.inDuration;
    }

    @Override // com.yandex.go.splash.BaseSplashView
    public void hide(Runnable detachFromParent) {
        animateScale();
        this.logoDrawable.start();
        animateBackground(detachFromParent);
        if (this.hapticPreferences.a()) {
            qke.w(getContext(), HapticController$Effect.GO_SPLASH, false, false);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator animation) {
    }

    @Override // com.yandex.go.splash.BaseSplashView
    public void recalculateBounds(int width, int height) {
    }

    @Override // com.yandex.go.splash.BaseSplashView
    public AccelerateInterpolator getInterpolator() {
        return this.interpolator;
    }

    public GoSplashView(Context context, qqt0 qqt0Var, AttributeSet attributeSet) {
        this(context, qqt0Var, attributeSet, 0, 8, null);
    }

    public GoSplashView(Context context, qqt0 qqt0Var) {
        this(context, qqt0Var, null, 0, 12, null);
    }

    public /* synthetic */ GoSplashView(Context context, qqt0 qqt0Var, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, qqt0Var, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }
}
