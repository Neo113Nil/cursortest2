package ru.rt.ebs.cryptosdk.presentation.customView;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.gqg0;
import defpackage.m810;
import defpackage.mxp0;
import defpackage.owg0;
import defpackage.tls;
import defpackage.u2v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 R*\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010)\u001a\u00020(2\u0006\u0010!\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u0010/\u001a\u00020(2\u0006\u0010!\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R*\u00102\u001a\u00020(2\u0006\u0010!\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010*\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R*\u00106\u001a\u0002052\u0006\u0010!\u001a\u0002058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010<\u001a\u00020(2\u0006\u0010!\u001a\u00020(8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b<\u0010*\"\u0004\b=\u0010.R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/TimerIndicatorView;", "Landroid/view/View;", "Lu2v;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "design", "applyDesign", "(Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;)V", "", RemoteBioParameters.TIME, "Lkotlin/Function1;", "Landroid/animation/Animator;", "onEndListener", "setTimerProgress", "(JLtls;)V", "stopTimerProgress", "()V", "value", "activeColor", CA20Status.STATUS_USER_I, "getActiveColor", "()I", "setActiveColor", "(I)V", "", "height", "F", "getHeight", "()F", "setHeight", "(F)V", "maxTimerIndicatorProgress", "getMaxTimerIndicatorProgress", "setMaxTimerIndicatorProgress", "timerIndicatorProgress", "getTimerIndicatorProgress", "setTimerIndicatorProgress", "", "cornersRounded", "Z", "getCornersRounded", "()Z", "setCornersRounded", "(Z)V", "radius", "setRadius", "Landroid/graphics/Paint;", "activePaint", "Landroid/graphics/Paint;", "nonActivePaint", "Landroid/animation/ValueAnimator;", "progressAnimator", "Landroid/animation/ValueAnimator;", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimerIndicatorView extends View implements u2v {
    private int activeColor;
    private final Paint activePaint;
    private boolean cornersRounded;
    private float height;
    private float maxTimerIndicatorProgress;
    private final Paint nonActivePaint;
    private ValueAnimator progressAnimator;
    private float radius;
    private float timerIndicatorProgress;

    public TimerIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.activeColor = context.getColor(gqg0.ebssdk_col_primary);
        this.height = getResources().getDimension(owg0.ebssdk_timer_height);
        this.maxTimerIndicatorProgress = 100.0f;
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        this.activePaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(context.getColor(gqg0.ebssdk_col_timer_default));
        this.nonActivePaint = paint2;
    }

    private final void setRadius(float f) {
        this.radius = f;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTimerProgress$lambda$3$lambda$2(TimerIndicatorView timerIndicatorView, ValueAnimator valueAnimator) {
        timerIndicatorView.setTimerIndicatorProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // defpackage.u2v
    public void applyDesign(CryptoSdkDesign design) {
    }

    public final int getActiveColor() {
        return this.activeColor;
    }

    public final boolean getCornersRounded() {
        return this.cornersRounded;
    }

    @Override // android.view.View
    public final float getHeight() {
        return this.height;
    }

    public final float getMaxTimerIndicatorProgress() {
        return this.maxTimerIndicatorProgress;
    }

    public final float getTimerIndicatorProgress() {
        return this.timerIndicatorProgress;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float f = this.height;
        float f2 = this.radius;
        canvas.drawRoundRect(0.0f, 0.0f, width, f, f2, f2, this.nonActivePaint);
        if (this.timerIndicatorProgress == 0.0f) {
            return;
        }
        float width2 = (this.timerIndicatorProgress / this.maxTimerIndicatorProgress) * getWidth();
        float f3 = this.height;
        float f4 = this.radius;
        canvas.drawRoundRect(0.0f, 0.0f, width2, f3, f4, f4, this.activePaint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int paddingBottom = getPaddingBottom() + getPaddingTop() + m810.b(this.height);
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size);
        } else if (mode != 0) {
            paddingBottom = size < 0 ? 0 : size;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), paddingBottom);
    }

    public final void setActiveColor(int i) {
        this.activeColor = i;
        this.activePaint.setColor(i);
    }

    public final void setCornersRounded(boolean z) {
        this.cornersRounded = z;
        setRadius(z ? getResources().getDimension(owg0.ebssdk_common_card_radius) : 0.0f);
    }

    public final void setHeight(float f) {
        this.height = f;
        invalidate();
    }

    public final void setMaxTimerIndicatorProgress(float f) {
        if (f > 0.0f) {
            this.maxTimerIndicatorProgress = f;
        }
    }

    public final void setTimerIndicatorProgress(float f) {
        if (0.0f <= f && f <= this.maxTimerIndicatorProgress) {
            this.timerIndicatorProgress = f;
        }
        invalidate();
    }

    public final void setTimerProgress(long time, final tls onEndListener) {
        setMaxTimerIndicatorProgress(time);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.maxTimerIndicatorProgress);
        ofFloat.setDuration(time);
        ofFloat.addUpdateListener(new mxp0(22, this));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.rt.ebs.cryptosdk.presentation.customView.TimerIndicatorView$setTimerProgress$lambda$3$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                tls.this.invoke(animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
        this.progressAnimator = ofFloat;
    }

    public final void stopTimerProgress() {
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.progressAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.progressAnimator = null;
    }

    public TimerIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TimerIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TimerIndicatorView(Context context) {
        this(context, null, 0, 6, null);
    }
}
