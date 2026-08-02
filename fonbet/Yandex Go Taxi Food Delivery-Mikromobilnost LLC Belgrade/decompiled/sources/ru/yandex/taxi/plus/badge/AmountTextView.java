package ru.yandex.taxi.plus.badge;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.eja1;
import defpackage.eo1;
import defpackage.f02;
import defpackage.f4i0;
import defpackage.n;
import defpackage.nsy0;
import defpackage.tje;
import defpackage.up11;
import defpackage.v19;
import defpackage.zy11;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.animation.OneShotAnimatorListener;
import ru.yandex.taxi.plus.badge.AmountTextView;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0014¢\u0006\u0004\b%\u0010\fR\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010<R*\u0010C\u001a\u00020A2\u0006\u0010B\u001a\u00020A8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR.\u0010I\u001a\u0004\u0018\u00010\u000f2\b\u0010B\u001a\u0004\u0018\u00010\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010JR\u0011\u0010Q\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bP\u0010FR$\u0010V\u001a\u0002062\u0006\u0010B\u001a\u0002068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lru/yandex/taxi/plus/badge/AmountTextView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "cancelAnimation", "()V", "measureText", "initAnimations", "", "current", "future", "updateAmount", "(DD)V", "Landroid/graphics/Typeface;", "t", "setTypeface", "(Landroid/graphics/Typeface;)V", "textColor", "setTextColor", "(I)V", CaretView.ALPHA_PROPERTY, "setTextAlpha", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "Landroid/animation/AnimatorSet;", "animatorSet", "Landroid/animation/AnimatorSet;", "Landroid/animation/ValueAnimator;", "fromCenterToTopAnimation", "Landroid/animation/ValueAnimator;", "fromBottomToCenterAnimation", "Landroid/text/TextPaint;", "paint", "Landroid/text/TextPaint;", "Lnsy0;", "textRollerAnimationController", "Lnsy0;", "Lv19;", "amountFormat", "Lv19;", "", "textHeight", "F", "textWidth", "", "amountMode", "Z", "additionalSpace", "lowercaseCorrection", CA20Status.STATUS_USER_I, "isInLowerCase", "", "value", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "amount", "Ljava/lang/Double;", "getAmount", "()Ljava/lang/Double;", "setAmount", "(Ljava/lang/Double;)V", "futureAmount", "getCurrentAmountText", "currentAmountText", "getTextSize", "()F", "setTextSize", "(F)V", "textSize", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AmountTextView extends View {
    private final float additionalSpace;
    private Double amount;
    private final v19 amountFormat;
    private boolean amountMode;
    private AnimatorSet animatorSet;
    private ValueAnimator fromBottomToCenterAnimation;
    private ValueAnimator fromCenterToTopAnimation;
    private Double futureAmount;
    private boolean isInLowerCase;
    private final int lowercaseCorrection;
    private final TextPaint paint;
    private String text;
    private float textHeight;
    private final nsy0 textRollerAnimationController;
    private float textWidth;

    public AmountTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = 1;
        TextPaint textPaint = new TextPaint(1);
        this.paint = textPaint;
        this.amountFormat = new v19(Locale.getDefault());
        this.additionalSpace = tje.x(getContext(), 1.0f);
        this.lowercaseCorrection = (int) tje.x(getContext(), 2.6f);
        this.text = "";
        textPaint.setTextAlign(Paint.Align.LEFT);
        int[] iArr = up11.a;
        textPaint.setTypeface(eja1.w(3, 0));
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, f4i0.AmountTextView, i, 0);
        try {
            setTextSize(obtainStyledAttributes.getDimension(f4i0.AmountTextView_textSize, tje.b0(getContext(), 14.0f)));
            textPaint.setColor(obtainStyledAttributes.getColor(f4i0.AmountTextView_textColor, getContext().getColor(R.color.white)));
            obtainStyledAttributes.recycle();
            nsy0 nsy0Var = new nsy0(new f02(i2, this));
            this.textRollerAnimationController = nsy0Var;
            nsy0Var.c();
            if (isInEditMode()) {
                setAmount(Double.valueOf(777.0d));
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect _init_$lambda$0(AmountTextView amountTextView) {
        return new Rect(amountTextView.getPaddingStart(), amountTextView.getPaddingTop(), amountTextView.getWidth() - amountTextView.getPaddingEnd(), amountTextView.getHeight());
    }

    private final void cancelAnimation() {
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.animatorSet;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
        this.animatorSet = null;
        ValueAnimator valueAnimator = this.fromCenterToTopAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.fromCenterToTopAnimation;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        this.fromCenterToTopAnimation = null;
        ValueAnimator valueAnimator3 = this.fromBottomToCenterAnimation;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.fromBottomToCenterAnimation;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllListeners();
        }
        this.fromBottomToCenterAnimation = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAnimations$lambda$0(AmountTextView amountTextView, ValueAnimator valueAnimator) {
        amountTextView.textRollerAnimationController.b.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        amountTextView.postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAnimations$lambda$1(AmountTextView amountTextView, ValueAnimator valueAnimator) {
        amountTextView.textRollerAnimationController.b.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        amountTextView.postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initAnimations$lambda$2(AmountTextView amountTextView, Animator animator) {
        amountTextView.setAmount(amountTextView.futureAmount);
        amountTextView.futureAmount = null;
        amountTextView.textRollerAnimationController.b.b = 1.0f;
        return zy11.a;
    }

    private final void measureText() {
        String currentAmountText = getCurrentAmountText();
        Paint.FontMetrics fontMetrics = this.paint.getFontMetrics();
        float f = fontMetrics.descent - fontMetrics.ascent;
        float measureText = this.paint.measureText(currentAmountText);
        if (f != this.textHeight || measureText != this.textWidth) {
            this.textHeight = f;
            this.textWidth = measureText;
            requestLayout();
        }
        invalidate();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        float a = n.a(((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.textHeight, this.paint.getFontMetrics().descent, 2.0f, getPaddingTop());
        if (this.amountMode) {
            this.textRollerAnimationController.a(canvas, this.paint, 0.0f, 0.0f, (a + this.textHeight) - this.additionalSpace);
        } else {
            canvas.drawText(this.text, 0.0f, (a + this.textHeight) - (this.isInLowerCase ? this.lowercaseCorrection : 0), this.paint);
        }
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getCurrentAmountText() {
        String str;
        if (this.amountMode) {
            Double d = this.futureAmount;
            if (d == null) {
                d = this.amount;
            }
            if (d != null) {
                double doubleValue = d.doubleValue();
                str = this.amountFormat.a.format(Double.valueOf(doubleValue));
            } else {
                str = null;
            }
        } else {
            str = this.text;
        }
        return str == null ? this.text : str;
    }

    public final String getText() {
        return this.text;
    }

    public final float getTextSize() {
        return this.paint.getTextSize();
    }

    public final void initAnimations() {
        this.animatorSet = new AnimatorSet();
        this.fromCenterToTopAnimation = ValueAnimator.ofFloat(0.0f, 0.5f).setDuration(400L);
        this.fromBottomToCenterAnimation = ValueAnimator.ofFloat(0.5f, 1.0f).setDuration(400L);
        ValueAnimator valueAnimator = this.fromCenterToTopAnimation;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator2 = this.fromBottomToCenterAnimation;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator3 = this.fromCenterToTopAnimation;
        final int i = 0;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e22
                public final /* synthetic */ AmountTextView b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    int i2 = i;
                    AmountTextView amountTextView = this.b;
                    switch (i2) {
                        case 0:
                            AmountTextView.initAnimations$lambda$0(amountTextView, valueAnimator4);
                            break;
                        default:
                            AmountTextView.initAnimations$lambda$1(amountTextView, valueAnimator4);
                            break;
                    }
                }
            });
        }
        ValueAnimator valueAnimator4 = this.fromBottomToCenterAnimation;
        final int i2 = 1;
        if (valueAnimator4 != null) {
            valueAnimator4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: e22
                public final /* synthetic */ AmountTextView b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator42) {
                    int i22 = i2;
                    AmountTextView amountTextView = this.b;
                    switch (i22) {
                        case 0:
                            AmountTextView.initAnimations$lambda$0(amountTextView, valueAnimator42);
                            break;
                        default:
                            AmountTextView.initAnimations$lambda$1(amountTextView, valueAnimator42);
                            break;
                    }
                }
            });
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.addListener(new OneShotAnimatorListener(null, new eo1(5, this), null, null, 13, null));
        }
        AnimatorSet animatorSet2 = this.animatorSet;
        if (animatorSet2 != null) {
            animatorSet2.playSequentially(this.fromCenterToTopAnimation, this.fromBottomToCenterAnimation);
        }
        AnimatorSet animatorSet3 = this.animatorSet;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelAnimation();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        float size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        float paddingStart = this.textWidth + getPaddingStart() + getPaddingEnd();
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, paddingStart);
        } else if (mode != 1073741824) {
            size = paddingStart;
        }
        Paint.FontMetricsInt fontMetricsInt = this.paint.getFontMetricsInt();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + (this.amountMode ? Float.valueOf(this.textHeight) : Integer.valueOf((fontMetricsInt.bottom - fontMetricsInt.top) + fontMetricsInt.leading)).intValue();
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, paddingBottom);
        } else if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension((int) size, size2);
    }

    public final void setAmount(Double d) {
        cancelAnimation();
        this.amount = d;
        this.amountMode = true;
        measureText();
    }

    public final void setText(String str) {
        cancelAnimation();
        this.text = str;
        this.amountMode = false;
        this.isInLowerCase = str.toLowerCase(Locale.ROOT).equals(this.text);
        measureText();
    }

    public final void setTextAlpha(int alpha) {
        this.paint.setAlpha(alpha);
        this.textRollerAnimationController.c();
        invalidate();
    }

    public final void setTextColor(int textColor) {
        this.paint.setColor(getContext().getColor(textColor));
        this.textRollerAnimationController.c();
        invalidate();
    }

    public final void setTextSize(float f) {
        cancelAnimation();
        this.paint.setTextSize(f);
        measureText();
    }

    public final void setTypeface(Typeface t) {
        this.paint.setTypeface(t);
        this.textRollerAnimationController.c();
        measureText();
    }

    public final void updateAmount(double current, double future) {
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet == null || !animatorSet.isRunning()) {
            this.futureAmount = Double.valueOf(future);
            setAmount(Double.valueOf(current));
            nsy0 nsy0Var = this.textRollerAnimationController;
            if (current == future) {
                nsy0Var.b(current, future);
                this.textRollerAnimationController.b.b = 1.0f;
            } else {
                nsy0Var.b(current, future);
                initAnimations();
            }
        }
    }

    public AmountTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AmountTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AmountTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
