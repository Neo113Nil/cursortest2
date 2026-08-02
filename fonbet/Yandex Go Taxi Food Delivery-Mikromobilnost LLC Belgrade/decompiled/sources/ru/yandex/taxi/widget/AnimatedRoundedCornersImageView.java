package ru.yandex.taxi.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import defpackage.jl40;
import defpackage.lhc;
import defpackage.sls;
import defpackage.vf2;
import defpackage.wf2;
import defpackage.xf2;
import defpackage.xng0;
import defpackage.yf2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.AnimatedRoundedCornersImageView;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\u00020\u0001:\u0004\u001e*\r+B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lru/yandex/taxi/widget/AnimatedRoundedCornersImageView;", "Lru/yandex/taxi/widget/RoundedCornersImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "stopAnimation", "()V", "Lwf2;", "circle", "maxRadius", "updateCircle", "(Lwf2;I)V", "Landroid/graphics/Shader;", "updateGradient", "(Lwf2;)Landroid/graphics/Shader;", "Lkotlin/Function0;", "onStart", "Landroid/animation/Animator$AnimatorListener;", "createAnimatorListener", "(Lsls;)Landroid/animation/Animator$AnimatorListener;", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lxf2;", "model", "onAnimationStarted", "updateAnimation", "(Lxf2;Lsls;)V", "Lru/yandex/taxi/widget/AnimatedRoundedCornersImageView$a;", "animationState", "Lru/yandex/taxi/widget/AnimatedRoundedCornersImageView$a;", "", "circles", "Ljava/util/List;", "Companion", "a", "yf2", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimatedRoundedCornersImageView extends RoundedCornersImageView {
    public static final int $stable = 8;
    private static final float ALPHA_ANIMATION_COEF = 2.0f;
    private static final float CIRCLE_MIN_RADIUS = 0.1f;
    public static final yf2 Companion = new yf2();
    private final a animationState;
    private final List<wf2> circles;

    public static final class a {
        public String a;
        public boolean b;
    }

    public AnimatedRoundedCornersImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.animationState = new a();
        this.circles = new ArrayList();
    }

    private final Animator.AnimatorListener createAnimatorListener(final sls onStart) {
        return new Animator.AnimatorListener() { // from class: ru.yandex.taxi.widget.AnimatedRoundedCornersImageView$createAnimatorListener$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                AnimatedRoundedCornersImageView.a aVar;
                aVar = this.animationState;
                aVar.b = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                AnimatedRoundedCornersImageView.a aVar;
                aVar = this.animationState;
                aVar.b = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                AnimatedRoundedCornersImageView.a aVar;
                sls.this.invoke();
                aVar = this.animationState;
                aVar.b = true;
            }
        };
    }

    private final void stopAnimation() {
        for (wf2 wf2Var : this.circles) {
            ValueAnimator valueAnimator = wf2Var.c;
            ValueAnimator valueAnimator2 = wf2Var.c;
            valueAnimator.removeAllUpdateListeners();
            valueAnimator2.removeAllListeners();
            valueAnimator2.cancel();
            this.animationState.b = false;
        }
        this.circles.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateAnimation$lambda$0(wf2 wf2Var, AnimatedRoundedCornersImageView animatedRoundedCornersImageView, ValueAnimator valueAnimator) {
        wf2Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        animatedRoundedCornersImageView.invalidate();
    }

    private final void updateCircle(wf2 circle, int maxRadius) {
        float f = circle.f;
        float f2 = 1.0f - (2.0f * f);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        circle.g = f2;
        float f3 = maxRadius * f;
        if (f3 < 0.1f) {
            f3 = 0.1f;
        }
        circle.h = f3;
        circle.e.setShader(updateGradient(circle));
    }

    private final Shader updateGradient(wf2 circle) {
        return new RadialGradient(circle.a, circle.b, circle.h, new int[]{0, lhc.f(circle.d, Math.abs((int) (255.0f * circle.g)) & 255)}, new float[]{0.1f, 1.0f}, Shader.TileMode.CLAMP);
    }

    @Override // ru.yandex.taxi.widget.RoundedCornersImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int max = Math.max(getWidth(), getHeight()) * 2;
        for (wf2 wf2Var : this.circles) {
            updateCircle(wf2Var, max);
            canvas.drawCircle(wf2Var.a, wf2Var.b, wf2Var.h, wf2Var.e);
        }
    }

    public final void updateAnimation(xf2 model, sls onAnimationStarted) {
        a aVar = this.animationState;
        if (aVar.b && jl40.l(aVar.a, model.a)) {
            return;
        }
        stopAnimation();
        this.animationState.a = model.a;
        int i = model.h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            wf2 wf2Var = new wf2(model.b, model.c, ofFloat, model.d);
            ofFloat.setStartDelay((model.g * i3) + model.e);
            ofFloat.setDuration(model.f);
            if (i3 == 0) {
                ofFloat.addListener(createAnimatorListener(onAnimationStarted));
            }
            ofFloat.addUpdateListener(new vf2(i2, wf2Var, this));
            ofFloat.setInterpolator(new FastOutSlowInInterpolator());
            this.circles.add(wf2Var);
            ofFloat.start();
        }
    }

    public AnimatedRoundedCornersImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AnimatedRoundedCornersImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AnimatedRoundedCornersImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.roundedCornersImageViewStyle : i);
    }
}
