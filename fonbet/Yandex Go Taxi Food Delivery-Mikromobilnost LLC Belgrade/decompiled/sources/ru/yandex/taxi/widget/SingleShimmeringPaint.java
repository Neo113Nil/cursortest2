package ru.yandex.taxi.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import defpackage.eis0;
import defpackage.mxp0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001c\u0018\u0000 I2\u00020\u0001:\u0001JB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\bJ\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\bJ\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\bJ\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\bR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u00102\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b3\u00104\"\u0004\b5\u0010\rR\"\u00106\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\"\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010;\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\"\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b>\u00108R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R$\u0010A\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u00104\"\u0004\bC\u0010\rR$\u0010D\u001a\u00020/2\u0006\u0010D\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lru/yandex/taxi/widget/SingleShimmeringPaint;", "Landroid/graphics/Paint;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "updateGradient", "()V", "setAnimatorValues", "", "value", "drawShimmeringValue", "(F)V", "", "centerColor", "edgeColor", "setColors", "(II)V", "Landroid/view/View;", "view", "updateOffset", "(Landroid/view/View;)V", "updateShimmering", "restartShimmering", "enableShimmering", "disableShimmering", "Landroid/graphics/Matrix;", "matrix", "Landroid/graphics/Matrix;", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "width", CA20Status.STATUS_USER_I, "height", "", "colors", "[I", "", "positions", "[F", "Landroid/graphics/LinearGradient;", "linearGradient", "Landroid/graphics/LinearGradient;", "animatorStartValue", "F", "", "startTime", "J", "angle", "getAngle", "()F", "setAngle", "startOffset", "getStartOffset", "()I", "setStartOffset", "(I)V", "gradientWidth", "getGradientWidth", "setGradientWidth", "getEdgeColor", "getCenterColor", "setCenterColor", "centerOffset", "getCenterOffset", "setCenterOffset", "duration", "getDuration", "()J", "setDuration", "(J)V", "Companion", "eis0", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SingleShimmeringPaint extends Paint {
    public static final eis0 Companion = new eis0();
    public static final int DEFAULT_ANIMATION_DURATION = 1500;
    public static final int DEFAULT_EDGE_COLOR = 16777215;
    private float angle;
    private final ValueAnimator animator;
    private float animatorStartValue;
    private final int[] colors;
    private int gradientWidth;
    private int height;
    private LinearGradient linearGradient;
    private final Matrix matrix = new Matrix();
    private final float[] positions;
    private int startOffset;
    private long startTime;
    private int width;

    public SingleShimmeringPaint(Context context) {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.animator = valueAnimator;
        this.colors = new int[]{16777215, qje.t(xng0.shimmeringDefaultColor, context), 16777215};
        this.positions = new float[]{0.0f, 0.5f, 1.0f};
        this.startTime = AnimationUtils.currentAnimationTimeMillis();
        updateGradient();
        enableShimmering();
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setDuration(1500L);
        setAnimatorValues();
    }

    private final void drawShimmeringValue(float value) {
        this.matrix.setTranslate(value, 0.0f);
        this.matrix.postRotate(this.angle);
        LinearGradient linearGradient = this.linearGradient;
        if (linearGradient == null) {
            linearGradient = null;
        }
        linearGradient.setLocalMatrix(this.matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableShimmering$lambda$0(SingleShimmeringPaint singleShimmeringPaint, ValueAnimator valueAnimator) {
        singleShimmeringPaint.drawShimmeringValue(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void setAnimatorValues() {
        float cos;
        int i;
        int i2;
        float f = this.angle;
        if (f > 90.0f) {
            f %= 90.0f;
        }
        float atan = (float) Math.atan(this.height / this.width);
        int i3 = this.gradientWidth;
        if (f <= atan) {
            cos = (float) Math.cos(Math.toRadians(f));
            i = this.startOffset;
            this.animatorStartValue = (-i3) - i;
            i2 = this.width;
        } else {
            cos = (float) Math.cos(Math.toRadians(90.0f - f));
            i = this.startOffset;
            this.animatorStartValue = (-i3) - i;
            i2 = this.height;
        }
        this.animator.setFloatValues(this.animatorStartValue, (i2 - i) / cos);
    }

    private final void updateGradient() {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.gradientWidth, 0.0f, this.colors, this.positions, Shader.TileMode.CLAMP);
        this.linearGradient = linearGradient;
        linearGradient.setLocalMatrix(this.matrix);
        LinearGradient linearGradient2 = this.linearGradient;
        if (linearGradient2 == null) {
            linearGradient2 = null;
        }
        setShader(linearGradient2);
    }

    public final void disableShimmering() {
        this.animator.removeAllUpdateListeners();
        drawShimmeringValue(this.animatorStartValue);
    }

    public final void enableShimmering() {
        this.animator.addUpdateListener(new mxp0(14, this));
    }

    public final float getAngle() {
        return this.angle;
    }

    public final int getCenterColor() {
        return this.colors[1];
    }

    public final float getCenterOffset() {
        return this.positions[1];
    }

    public final long getDuration() {
        return this.animator.getDuration();
    }

    public final int getEdgeColor() {
        return this.colors[0];
    }

    public final int getGradientWidth() {
        return this.gradientWidth;
    }

    public final int getStartOffset() {
        return this.startOffset;
    }

    public final void restartShimmering() {
        this.startTime = AnimationUtils.currentAnimationTimeMillis();
        updateShimmering();
    }

    public final void setAngle(float f) {
        this.angle = f;
    }

    public final void setCenterColor(int i) {
        this.colors[1] = i;
        updateGradient();
    }

    public final void setCenterOffset(float f) {
        this.positions[1] = f;
        updateGradient();
    }

    public final void setColors(int centerColor, int edgeColor) {
        int[] iArr = this.colors;
        iArr[2] = edgeColor;
        iArr[0] = edgeColor;
        iArr[1] = centerColor;
        updateGradient();
    }

    public final void setDuration(long j) {
        this.animator.setDuration(j);
    }

    public final void setGradientWidth(int i) {
        this.gradientWidth = i;
        updateGradient();
        setAnimatorValues();
    }

    public final void setStartOffset(int i) {
        this.startOffset = i;
    }

    public final void updateOffset(View view) {
        if (this.width == 0 || this.height == 0) {
            this.width = view.getWidth();
            this.height = view.getHeight();
            if (this.gradientWidth == 0) {
                setGradientWidth(tje.u(60, view.getContext()));
                updateGradient();
            }
        }
        setAnimatorValues();
    }

    public final void updateShimmering() {
        this.animator.setCurrentPlayTime(AnimationUtils.currentAnimationTimeMillis() - this.startTime);
    }
}
