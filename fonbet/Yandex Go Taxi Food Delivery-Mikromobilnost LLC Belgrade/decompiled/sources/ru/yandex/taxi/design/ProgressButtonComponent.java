package ru.yandex.taxi.design;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import defpackage.bdc;
import defpackage.c4i0;
import defpackage.cdc;
import defpackage.kdc;
import defpackage.pif0;
import defpackage.qif0;
import defpackage.qje;
import defpackage.s8o;
import defpackage.w0d;
import defpackage.xby;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y6i0;
import defpackage.yso;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\t*\u0001N\u0018\u00002\u00020\u0001:\u0001)B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\n2\b\b\u0001\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\n2\b\b\u0001\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\n2\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\n2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J#\u0010-\u001a\u00020\n2\b\b\u0001\u0010\"\u001a\u00020\u000f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\n¢\u0006\u0004\b/\u0010!J\r\u00100\u001a\u00020\u001d¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\nH\u0014¢\u0006\u0004\b4\u0010!J\u0017\u00107\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010A\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010DR\u0014\u0010I\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0016\u0010J\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010=R\u0018\u0010L\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR*\u0010R\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010\u0015\"\u0004\bU\u0010$¨\u0006V"}, d2 = {"Lru/yandex/taxi/design/ProgressButtonComponent;", "Lru/yandex/taxi/design/ButtonComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "applyAttributes", "(Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", "position", "drawProgressTrack", "(Landroid/graphics/Canvas;F)V", "drawProgressFill", "getProgressPosition", "()F", "progressFillColor", "setProgressFillColor", "(I)V", "Lkdc;", "(Lkdc;)V", "progressTrackColor", "setProgressTrackColor", "", "showRippleEffect", "(Z)V", "invalidateComponent", "()V", "progress", "setProgressValue", "(F)V", "", "durationMs", "setProgressAnimationDuration", "(J)V", "Lpif0;", "animatorEndListener", "startProgressAnimation", "(Lpif0;)V", "resumeProgressAnimation", "(FLpif0;)V", "stopProgressAnimation", "isProgressAnimationRunning", "()Z", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/animation/ValueAnimator;", "progressValueAnimator", "Landroid/animation/ValueAnimator;", "isRtl", "Z", "fillColorAttr", CA20Status.STATUS_USER_I, "trackColorLightThemeAttr", "trackColorNightThemeAttr", "Landroid/graphics/Paint;", "progressFillPaint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "progressFillRect", "Landroid/graphics/RectF;", "progressTrackPaint", "progressTrackRect", "animationDuration", "J", "externalAnimationListener", "Lpif0;", "ru/yandex/taxi/design/ProgressButtonComponent$internalAnimationListener$1", "internalAnimationListener", "Lru/yandex/taxi/design/ProgressButtonComponent$internalAnimationListener$1;", "value", "currentProgress", "F", "getCurrentProgress", "setCurrentProgress", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProgressButtonComponent extends ButtonComponent {
    private long animationDuration;
    private float currentProgress;
    private pif0 externalAnimationListener;
    private final int fillColorAttr;
    private final ProgressButtonComponent$internalAnimationListener$1 internalAnimationListener;
    private final boolean isRtl;
    private final Paint progressFillPaint;
    private final RectF progressFillRect;
    private final Paint progressTrackPaint;
    private final RectF progressTrackRect;
    private ValueAnimator progressValueAnimator;
    private boolean showRippleEffect;
    private final int trackColorLightThemeAttr;
    private final int trackColorNightThemeAttr;

    /* JADX WARN: Type inference failed for: r6v11, types: [ru.yandex.taxi.design.ProgressButtonComponent$internalAnimationListener$1] */
    public ProgressButtonComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0, 4, null);
        this.progressValueAnimator = new ValueAnimator();
        this.isRtl = xw31.n(context);
        this.fillColorAttr = xng0.controlMain;
        this.trackColorLightThemeAttr = xng0.controlMinor;
        this.trackColorNightThemeAttr = xng0.textMain;
        this.progressFillPaint = new Paint(1);
        this.progressFillRect = new RectF();
        this.progressTrackPaint = new Paint(1);
        this.progressTrackRect = new RectF();
        this.animationDuration = 10000L;
        this.internalAnimationListener = new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.design.ProgressButtonComponent$internalAnimationListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                if (ProgressButtonComponent.this.getCurrentProgress() > 0.0f) {
                    return;
                }
                ProgressButtonComponent.access$getExternalAnimationListener$p(ProgressButtonComponent.this);
            }
        };
        this.currentProgress = 1.0f;
        applyAttributes(attributeSet, i);
    }

    public static final /* synthetic */ pif0 access$getExternalAnimationListener$p(ProgressButtonComponent progressButtonComponent) {
        progressButtonComponent.getClass();
        return null;
    }

    private final void applyAttributes(AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.ProgressButtonComponent, defStyleAttr, 0);
        if (attrs != null) {
            boolean s = qje.s(xng0.themeDarkMode, getContext());
            try {
                kdc T = qje.T(attrs, obtainStyledAttributes, "component_progress_button_fill_color", c4i0.ProgressButtonComponent_component_progress_button_fill_color, Integer.valueOf(this.fillColorAttr));
                if (T == null) {
                    T = new bdc(this.fillColorAttr);
                }
                setProgressFillColor(T);
                kdc T2 = qje.T(attrs, obtainStyledAttributes, "component_progress_button_track_color", c4i0.ProgressButtonComponent_component_progress_button_track_color, null);
                if (T2 == null) {
                    T2 = new bdc(s ? this.trackColorNightThemeAttr : this.trackColorLightThemeAttr);
                }
                setProgressTrackColor(T2);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    private final void drawProgressFill(Canvas canvas, float position) {
        canvas.save();
        boolean z = this.isRtl;
        float f = z ? position : 0.0f;
        if (z) {
            position = getWidth();
        }
        canvas.clipRect(f, 0.0f, position, getHeight());
        this.progressFillRect.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.progressFillRect, getRoundedCornersRadius(), getRoundedCornersRadius(), this.progressFillPaint);
        canvas.restore();
    }

    private final void drawProgressTrack(Canvas canvas, float position) {
        canvas.save();
        boolean z = this.isRtl;
        float f = z ? 0.0f : position;
        if (!z) {
            position = getWidth();
        }
        canvas.clipRect(f, 0.0f, position, getHeight());
        this.progressTrackRect.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.progressTrackRect, getRoundedCornersRadius(), getRoundedCornersRadius(), this.progressTrackPaint);
        canvas.restore();
    }

    private final float getProgressPosition() {
        float f = this.currentProgress;
        return this.isRtl ? getWidth() - (getWidth() * f) : getWidth() * f;
    }

    public static /* synthetic */ void resumeProgressAnimation$default(ProgressButtonComponent progressButtonComponent, float f, pif0 pif0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            pif0Var = null;
        }
        progressButtonComponent.resumeProgressAnimation(f, pif0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resumeProgressAnimation$lambda$0$0(ProgressButtonComponent progressButtonComponent, ValueAnimator valueAnimator) {
        progressButtonComponent.setCurrentProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void setCurrentProgress(float f) {
        this.currentProgress = y6i0.c(f, 0.0f, 1.0f);
        invalidate();
    }

    public static /* synthetic */ void startProgressAnimation$default(ProgressButtonComponent progressButtonComponent, pif0 pif0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            pif0Var = null;
        }
        progressButtonComponent.startProgressAnimation(pif0Var);
    }

    @Override // ru.yandex.taxi.design.ButtonComponent, ru.yandex.taxi.widget.ShimmeringRobotoTextView, ru.yandex.taxi.widget.RobotoTextView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        int i = qif0.a[themeType.ordinal()];
        if (i == 1) {
            setProgressTrackColor(qje.t(this.trackColorNightThemeAttr, getContext()));
        } else {
            if (i != 2) {
                return;
            }
            setProgressTrackColor(qje.t(this.trackColorLightThemeAttr, getContext()));
        }
    }

    public final float getCurrentProgress() {
        return this.currentProgress;
    }

    @Override // ru.yandex.taxi.design.ButtonComponent
    public void invalidateComponent() {
        super.invalidateComponent();
        Drawable drawable = null;
        setBackground(null);
        if (this.showRippleEffect) {
            float roundedCornersRadius = getRoundedCorners() ? getRoundedCornersRadius() : 0.0f;
            kdc rippleBackgroundColor = getRippleBackgroundColor();
            Integer valueOf = rippleBackgroundColor != null ? Integer.valueOf(s8o.m(rippleBackgroundColor, getContext())) : null;
            w0d w0dVar = new w0d();
            w0dVar.h = roundedCornersRadius;
            w0dVar.g = true;
            w0dVar.e = valueOf;
            drawable = w0dVar.a();
        }
        setForeground(drawable);
    }

    public final boolean isProgressAnimationRunning() {
        return this.progressValueAnimator.isRunning();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopProgressAnimation();
    }

    @Override // ru.yandex.taxi.widget.ShimmeringRobotoTextView, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        float progressPosition = getProgressPosition();
        drawProgressTrack(canvas, progressPosition);
        drawProgressFill(canvas, progressPosition);
        super.onDraw(canvas);
    }

    public final void resumeProgressAnimation(float progress, pif0 animatorEndListener) {
        stopProgressAnimation();
        setCurrentProgress(progress);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.currentProgress, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(this.animationDuration);
        ofFloat.addUpdateListener(new yso(21, this));
        ofFloat.addListener(this.internalAnimationListener);
        ofFloat.start();
        this.progressValueAnimator = ofFloat;
    }

    public final void setProgressAnimationDuration(long durationMs) {
        if (durationMs < 0) {
            xby.d.w(new IllegalStateException("Invalid duration"));
        } else {
            this.animationDuration = durationMs;
        }
    }

    public final void setProgressFillColor(kdc progressFillColor) {
        this.progressFillPaint.setColor(s8o.m(progressFillColor, getContext()));
        invalidate();
    }

    public final void setProgressTrackColor(kdc progressTrackColor) {
        this.progressTrackPaint.setColor(s8o.m(progressTrackColor, getContext()));
        invalidate();
    }

    public final void setProgressValue(float progress) {
        stopProgressAnimation();
        setCurrentProgress(progress);
    }

    public final void showRippleEffect(boolean showRippleEffect) {
        this.showRippleEffect = showRippleEffect;
        invalidateComponent();
    }

    public final void startProgressAnimation(pif0 animatorEndListener) {
        resumeProgressAnimation(1.0f, animatorEndListener);
    }

    public final void stopProgressAnimation() {
        this.progressValueAnimator.cancel();
        this.progressValueAnimator.removeAllListeners();
    }

    public final void setProgressFillColor(int progressFillColor) {
        setProgressFillColor(new cdc(progressFillColor));
    }

    public final void setProgressTrackColor(int progressTrackColor) {
        setProgressTrackColor(new cdc(progressTrackColor));
    }

    public ProgressButtonComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ProgressButtonComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ProgressButtonComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.progressButtonComponentStyle : i);
    }
}
