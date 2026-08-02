package ru.yandex.taxi.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.state.db.StateEntry;
import defpackage.eo1;
import defpackage.tls;
import defpackage.uh6;
import defpackage.v5;
import defpackage.we2;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0010J7\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0003\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$J'\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b(\u0010)J7\u0010-\u001a\u00020'2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f\u0018\u00010,H\u0002¢\u0006\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00107R\u0016\u0010;\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00107R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0011\u0010?\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lru/yandex/taxi/widget/AnimatedCircularHoleFogView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "()V", "Ljava/lang/Runnable;", "onEnd", "showStaticFogAnimated", "(Ljava/lang/Runnable;)V", "hideStaticFogAnimated", "Landroid/graphics/Point;", IssuingDistributionPointExtension.POINT, "", "duration", "", "radius", "", "setPointAnimated", "(Landroid/graphics/Point;JFLjava/lang/Runnable;)Z", "movePointTo", "(Landroid/graphics/Point;)V", "unsetPointAnimated", "(JLjava/lang/Runnable;)V", "isPointVisible", "(Landroid/graphics/Point;)Z", "startRadius", "endRadius", "Landroid/animation/ValueAnimator;", "getRadiusAnimator", "(FFJ)Landroid/animation/ValueAnimator;", "startValue", "stopValue", "Lkotlin/Function1;", "getStaticFogAnimator", "(FFLtls;)Landroid/animation/ValueAnimator;", "staticFogAnimator", "Landroid/animation/ValueAnimator;", "currentAnimator", "currentRadius", "F", "currentPoint", "Landroid/graphics/Point;", "isUnsetting", "Z", "currentAlpha", CA20Status.STATUS_USER_I, "isStaticFogShown", "hideAnimationRunning", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "Landroid/graphics/Path;", "isStaticFogAnimationGoing", "()Z", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimatedCircularHoleFogView extends View {
    public static final int $stable = 8;
    private int currentAlpha;
    private ValueAnimator currentAnimator;
    private Point currentPoint;
    private float currentRadius;
    private boolean hideAnimationRunning;
    private boolean isStaticFogShown;
    private boolean isUnsetting;
    private final Path path;
    private ValueAnimator staticFogAnimator;

    public AnimatedCircularHoleFogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.currentRadius = -1.0f;
        this.path = new Path();
    }

    private final ValueAnimator getRadiusAnimator(float startRadius, float endRadius, long duration) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(startRadius, endRadius);
        ofFloat.setDuration(duration);
        ofFloat.addUpdateListener(new we2(this, 0));
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRadiusAnimator$lambda$0(AnimatedCircularHoleFogView animatedCircularHoleFogView, ValueAnimator valueAnimator) {
        animatedCircularHoleFogView.currentRadius = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        animatedCircularHoleFogView.invalidate();
    }

    private final ValueAnimator getStaticFogAnimator(float startValue, float stopValue, final tls onEnd) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(startValue, stopValue);
        ofFloat.setDuration(400L);
        ofFloat.addUpdateListener(new we2(this, 1));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.widget.AnimatedCircularHoleFogView$getStaticFogAnimator$1$2
            private boolean isCancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                this.isCancelled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                AnimatedCircularHoleFogView.this.staticFogAnimator = null;
                tls tlsVar = onEnd;
                if (tlsVar != null) {
                    tlsVar.invoke(Boolean.valueOf(this.isCancelled));
                }
            }
        });
        return ofFloat;
    }

    public static /* synthetic */ ValueAnimator getStaticFogAnimator$default(AnimatedCircularHoleFogView animatedCircularHoleFogView, float f, float f2, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = null;
        }
        return animatedCircularHoleFogView.getStaticFogAnimator(f, f2, tlsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getStaticFogAnimator$lambda$0$0(AnimatedCircularHoleFogView animatedCircularHoleFogView, ValueAnimator valueAnimator) {
        animatedCircularHoleFogView.currentAlpha = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 76.0f);
        animatedCircularHoleFogView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 hideStaticFogAnimated$lambda$0(AnimatedCircularHoleFogView animatedCircularHoleFogView, boolean z) {
        animatedCircularHoleFogView.isStaticFogShown = z;
        animatedCircularHoleFogView.hideAnimationRunning = false;
        return zy11.a;
    }

    private final boolean isPointVisible(Point point) {
        int width = getWidth();
        int i = point.x;
        if (i < 0 || i > width) {
            return false;
        }
        int height = getHeight();
        int i2 = point.y;
        return i2 >= 0 && i2 <= height;
    }

    public static /* synthetic */ boolean setPointAnimated$default(AnimatedCircularHoleFogView animatedCircularHoleFogView, Point point, long j, float f, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 1000;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            f = uh6.p(animatedCircularHoleFogView.getContext(), 49.0f);
        }
        float f2 = f;
        if ((i & 8) != 0) {
            runnable = null;
        }
        return animatedCircularHoleFogView.setPointAnimated(point, j2, f2, runnable);
    }

    public static /* synthetic */ void showStaticFogAnimated$default(AnimatedCircularHoleFogView animatedCircularHoleFogView, Runnable runnable, int i, Object obj) {
        if ((i & 1) != 0) {
            runnable = null;
        }
        animatedCircularHoleFogView.showStaticFogAnimated(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showStaticFogAnimated$lambda$0(AnimatedCircularHoleFogView animatedCircularHoleFogView, Runnable runnable, boolean z) {
        animatedCircularHoleFogView.isStaticFogShown = !z;
        if (!z && runnable != null) {
            runnable.run();
        }
        return zy11.a;
    }

    public static /* synthetic */ void unsetPointAnimated$default(AnimatedCircularHoleFogView animatedCircularHoleFogView, long j, Runnable runnable, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        if ((i & 2) != 0) {
            runnable = null;
        }
        animatedCircularHoleFogView.unsetPointAnimated(j, runnable);
    }

    public final void hideStaticFogAnimated() {
        if (isStaticFogAnimationGoing() || this.isStaticFogShown) {
            ValueAnimator valueAnimator = this.staticFogAnimator;
            Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
            Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
            float floatValue = f != null ? f.floatValue() : 1.0f;
            ValueAnimator valueAnimator2 = this.staticFogAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.hideAnimationRunning = true;
            ValueAnimator staticFogAnimator = getStaticFogAnimator(floatValue, 0.0f, new eo1(7, this));
            this.staticFogAnimator = staticFogAnimator;
            if (staticFogAnimator != null) {
                staticFogAnimator.setDuration((long) (floatValue * 400.0f));
            }
            ValueAnimator valueAnimator3 = this.staticFogAnimator;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        }
    }

    public final boolean isStaticFogAnimationGoing() {
        return this.staticFogAnimator != null;
    }

    public final void movePointTo(Point point) {
        if (this.currentPoint == null) {
            return;
        }
        this.currentPoint = point;
        invalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.currentAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentAnimator = null;
        this.currentPoint = null;
        this.currentRadius = -1.0f;
        this.currentAlpha = 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Point point = this.currentPoint;
        if (this.currentRadius != -1.0f && point != null) {
            this.path.rewind();
            this.path.addCircle(point.x, point.y, this.currentRadius, Path.Direction.CW);
            canvas.clipPath(this.path, Region.Op.DIFFERENCE);
        }
        if (!(this.currentRadius == -1.0f || this.currentPoint == null) || isStaticFogAnimationGoing() || this.isStaticFogShown) {
            canvas.drawARGB(this.currentAlpha, 92, 90, 87);
        }
    }

    public final boolean setPointAnimated(Point point, long duration, final float radius, final Runnable onEnd) {
        float f;
        if (!isPointVisible(point)) {
            return false;
        }
        ValueAnimator valueAnimator = this.currentAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentPoint = point;
        if (isStaticFogAnimationGoing() || this.isStaticFogShown) {
            f = 0.0f;
        } else {
            this.currentAlpha = 76;
            f = (float) Math.hypot(getWidth(), getHeight());
        }
        ValueAnimator radiusAnimator = getRadiusAnimator(f, radius, duration);
        radiusAnimator.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.widget.AnimatedCircularHoleFogView$setPointAnimated$1
            private boolean isCancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                this.isCancelled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                if (!this.isCancelled) {
                    Runnable runnable = onEnd;
                    if (runnable != null) {
                        runnable.run();
                    }
                    this.currentRadius = radius;
                }
                this.currentAnimator = null;
                this.isStaticFogShown = false;
            }
        });
        this.currentAnimator = radiusAnimator;
        radiusAnimator.start();
        return true;
    }

    public final void showStaticFogAnimated(Runnable onEnd) {
        if (this.currentPoint == null) {
            if (!this.isStaticFogShown || this.hideAnimationRunning) {
                ValueAnimator valueAnimator = this.staticFogAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator staticFogAnimator = getStaticFogAnimator(0.0f, 1.0f, new v5(15, this, onEnd));
                this.staticFogAnimator = staticFogAnimator;
                if (staticFogAnimator != null) {
                    staticFogAnimator.start();
                }
            }
        }
    }

    public final void unsetPointAnimated(long duration, final Runnable onEnd) {
        if (this.currentRadius == -1.0f || this.isUnsetting) {
            return;
        }
        ValueAnimator valueAnimator = this.currentAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator radiusAnimator = getRadiusAnimator(this.currentRadius, (float) Math.hypot(getWidth(), getHeight()), duration);
        radiusAnimator.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.widget.AnimatedCircularHoleFogView$unsetPointAnimated$1
            private boolean isCancelled;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                this.isCancelled = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Runnable runnable;
                if (!this.isCancelled && (runnable = onEnd) != null) {
                    runnable.run();
                }
                AnimatedCircularHoleFogView.this.isUnsetting = false;
                AnimatedCircularHoleFogView.this.currentRadius = -1.0f;
                AnimatedCircularHoleFogView.this.currentAnimator = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                AnimatedCircularHoleFogView.this.isUnsetting = true;
            }
        });
        this.currentAnimator = radiusAnimator;
        radiusAnimator.start();
    }

    public AnimatedCircularHoleFogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AnimatedCircularHoleFogView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AnimatedCircularHoleFogView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void showStaticFogAnimated() {
        showStaticFogAnimated$default(this, null, 1, null);
    }

    public final void unsetPointAnimated(long j) {
        unsetPointAnimated$default(this, j, null, 2, null);
    }

    public final void unsetPointAnimated() {
        unsetPointAnimated$default(this, 0L, null, 3, null);
    }

    public final boolean setPointAnimated(Point point, long j) {
        return setPointAnimated$default(this, point, j, 0.0f, null, 12, null);
    }

    public final boolean setPointAnimated(Point point, long j, float f) {
        return setPointAnimated$default(this, point, j, f, null, 8, null);
    }

    public final boolean setPointAnimated(Point point) {
        return setPointAnimated$default(this, point, 0L, 0.0f, null, 14, null);
    }
}
