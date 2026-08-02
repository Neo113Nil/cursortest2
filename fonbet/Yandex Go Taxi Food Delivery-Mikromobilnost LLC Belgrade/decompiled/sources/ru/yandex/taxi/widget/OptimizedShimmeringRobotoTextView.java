package ru.yandex.taxi.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import defpackage.bdc;
import defpackage.kdc;
import defpackage.pd70;
import defpackage.s8o;
import defpackage.tje;
import defpackage.xby;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yso;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0016\u0018\u0000 Y2\u00020\u0001:\u0001ZB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010$J\u0019\u0010\"\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b\"\u0010'J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0007¢\u0006\u0004\b,\u0010\fJ\u000f\u0010-\u001a\u00020\nH\u0007¢\u0006\u0004\b-\u0010\fJ\u0017\u0010.\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b.\u0010#J\u0015\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\n2\b\b\u0001\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u0010$J\u0017\u00106\u001a\u00020\n2\b\b\u0001\u00105\u001a\u00020\u0006¢\u0006\u0004\b6\u0010$J\u0015\u00109\u001a\u00020\n2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010CR\u0016\u0010H\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010CR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010O\u001a\u0002072\u0006\u00108\u001a\u0002078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bO\u0010A\u001a\u0004\bO\u0010PR\u001c\u0010S\u001a\n R*\u0004\u0018\u00010Q0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010W¨\u0006["}, d2 = {"Lru/yandex/taxi/widget/OptimizedShimmeringRobotoTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateShimmering", "()V", "refreshTextColorsIfNeed", "updateShaderIfNeed", "calculateTextSizeIfNeed", "calculateLayoutSizeIfNeed", "", "left", "right", "newSizeReceived", "(FF)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lkdc;", "color", "setTextColor", "(Lkdc;)V", "(I)V", "Landroid/content/res/ColorStateList;", "colors", "(Landroid/content/res/ColorStateList;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "startAnimation", "stopAnimation", "updateShimmeringColor", "Landroid/view/animation/Interpolator;", "interpolator", "setAnimationInterpolator", "(Landroid/view/animation/Interpolator;)V", "durationMs", "setAnimationDuration", "delayMs", "setAnimationDelay", "", "value", "setAnimateFullWidth", "(Z)V", "defaultShimmeringColor", "Lkdc;", "currentShimmeringColor", "lastTextColor", CA20Status.STATUS_USER_I, "animateFullWidth", "Z", "gradientSize", "F", "Landroid/text/Layout;", "lastTextLayout", "Landroid/text/Layout;", "fromTranslationX", "toTranslationX", "Landroid/graphics/Matrix;", "shaderMatrix", "Landroid/graphics/Matrix;", "Landroid/graphics/Shader;", "shader", "Landroid/graphics/Shader;", "isAnimating", "()Z", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "gradientAnimator", "Landroid/animation/ValueAnimator;", "", "startTime", "J", "startDelay", "Companion", "pd70", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public class OptimizedShimmeringRobotoTextView extends RobotoTextView {
    public static final pd70 Companion = new pd70();
    public static final int DEFAULT_DELAY_MS = 600;
    public static final int DEFAULT_DURATION_MS = 800;
    private boolean animateFullWidth;
    private kdc currentShimmeringColor;
    private final kdc defaultShimmeringColor;
    private float fromTranslationX;
    private final ValueAnimator gradientAnimator;
    private float gradientSize;
    private boolean isAnimating;
    private int lastTextColor;
    private Layout lastTextLayout;
    private Shader shader;
    private Matrix shaderMatrix;
    private long startDelay;
    private long startTime;
    private float toTranslationX;

    public OptimizedShimmeringRobotoTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        bdc bdcVar = new bdc(xng0.shimmeringDefaultColor);
        this.defaultShimmeringColor = bdcVar;
        this.currentShimmeringColor = bdcVar;
        this.lastTextColor = getCurrentTextColor();
        this.gradientSize = 1.0f;
        this.shaderMatrix = new Matrix();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(800L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new yso(15, this));
        this.gradientAnimator = ofFloat;
        this.startTime = AnimationUtils.currentAnimationTimeMillis();
        this.startDelay = 600L;
    }

    private final void calculateLayoutSizeIfNeed() {
        if (this.animateFullWidth) {
            newSizeReceived(0.0f, getWidth());
        }
    }

    private final void calculateTextSizeIfNeed() {
        Layout layout = getLayout();
        if (this.animateFullWidth || layout == this.lastTextLayout) {
            return;
        }
        if (layout == null) {
            this.lastTextLayout = null;
            return;
        }
        float lineLeft = layout.getLineLeft(0);
        float lineRight = layout.getLineRight(0);
        if (lineRight - lineLeft < 1.0f) {
            return;
        }
        newSizeReceived(lineLeft, lineRight);
        this.lastTextLayout = layout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gradientAnimator$lambda$0$0(OptimizedShimmeringRobotoTextView optimizedShimmeringRobotoTextView, ValueAnimator valueAnimator) {
        optimizedShimmeringRobotoTextView.shaderMatrix.reset();
        optimizedShimmeringRobotoTextView.shaderMatrix.postScale(optimizedShimmeringRobotoTextView.gradientSize, 1.0f);
        optimizedShimmeringRobotoTextView.shaderMatrix.postTranslate(pd70.a(Companion, optimizedShimmeringRobotoTextView.fromTranslationX, optimizedShimmeringRobotoTextView.toTranslationX, ((Float) valueAnimator.getAnimatedValue()).floatValue()), 0.0f);
        Shader shader = optimizedShimmeringRobotoTextView.shader;
        if (shader != null) {
            shader.setLocalMatrix(optimizedShimmeringRobotoTextView.shaderMatrix);
        }
    }

    private final void newSizeReceived(float left, float right) {
        float max = Math.max(right - left, 1.0f);
        this.gradientSize = max;
        float f = left - max;
        float f2 = right + max;
        if (xw31.n(getContext())) {
            this.fromTranslationX = f2;
            this.toTranslationX = f;
        } else {
            this.fromTranslationX = f;
            this.toTranslationX = f2;
        }
    }

    private final void refreshTextColorsIfNeed() {
        if (this.lastTextColor != getCurrentTextColor()) {
            this.lastTextColor = getCurrentTextColor();
            updateShaderIfNeed();
        }
    }

    private final void updateShaderIfNeed() {
        if (this.isAnimating) {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{this.lastTextColor, s8o.m(this.currentShimmeringColor, getContext()), this.lastTextColor}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
            linearGradient.setLocalMatrix(this.shaderMatrix);
            this.shader = linearGradient;
            getPaint().setShader(this.shader);
        }
    }

    private final void updateShimmering() {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.startTime;
        long duration = this.gradientAnimator.getDuration();
        long j = this.startDelay;
        long j2 = duration + j;
        if (currentAnimationTimeMillis < j) {
            this.gradientAnimator.setCurrentPlayTime(0L);
        } else if (currentAnimationTimeMillis < j2) {
            this.gradientAnimator.setCurrentPlayTime(currentAnimationTimeMillis - j);
        } else {
            this.startTime = AnimationUtils.currentAnimationTimeMillis();
            this.gradientAnimator.setCurrentPlayTime(0L);
        }
    }

    @Override // ru.yandex.taxi.widget.RobotoTextView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        refreshTextColorsIfNeed();
        updateShaderIfNeed();
    }

    /* renamed from: isAnimating, reason: from getter */
    public final boolean getIsAnimating() {
        return this.isAnimating;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.isAnimating) {
            calculateTextSizeIfNeed();
            updateShimmering();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        calculateLayoutSizeIfNeed();
    }

    public final void setAnimateFullWidth(boolean value) {
        this.animateFullWidth = value;
        calculateLayoutSizeIfNeed();
    }

    public final void setAnimationDelay(int delayMs) {
        if (delayMs < 0) {
            xby.d.w(new IllegalStateException("Invalid duration."));
        } else {
            this.startDelay = delayMs;
        }
    }

    public final void setAnimationDuration(int durationMs) {
        if (durationMs < 0) {
            xby.d.w(new IllegalStateException("Invalid duration."));
        } else {
            this.gradientAnimator.setDuration(durationMs);
        }
    }

    public final void setAnimationInterpolator(Interpolator interpolator) {
        this.gradientAnimator.setInterpolator(interpolator);
    }

    @Override // ru.yandex.taxi.widget.RobotoTextView
    public void setTextColor(kdc color) {
        super.setTextColor(color);
        refreshTextColorsIfNeed();
    }

    public final void startAnimation() {
        if (tje.d(getContext()) || this.isAnimating) {
            return;
        }
        this.isAnimating = true;
        updateShaderIfNeed();
        invalidate();
    }

    public final void stopAnimation() {
        if (this.isAnimating) {
            this.isAnimating = false;
            getPaint().setShader(null);
            this.shader = null;
            invalidate();
        }
    }

    public final void updateShimmeringColor(kdc color) {
        if (color == null) {
            color = this.defaultShimmeringColor;
        }
        if (s8o.m(this.currentShimmeringColor, getContext()) == s8o.m(color, getContext())) {
            return;
        }
        this.currentShimmeringColor = color;
        updateShaderIfNeed();
    }

    @Override // ru.yandex.taxi.widget.RobotoTextView, android.widget.TextView
    public void setTextColor(int color) {
        super.setTextColor(color);
        refreshTextColorsIfNeed();
    }

    @Override // ru.yandex.taxi.widget.RobotoTextView, android.widget.TextView
    public void setTextColor(ColorStateList colors) {
        super.setTextColor(colors);
        refreshTextColorsIfNeed();
    }

    public OptimizedShimmeringRobotoTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OptimizedShimmeringRobotoTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ OptimizedShimmeringRobotoTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
