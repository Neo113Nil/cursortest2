package ru.yandex.taxi.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import defpackage.od70;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.yso;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 R2\u00020\u0001:\u0001SB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011J!\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u000e2\b\b\u0001\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0019J5\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u000e2\b\b\u0001\u0010\u0018\u001a\u00020\u000e2\b\b\u0001\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b \u0010\bJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010\u0011J\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\bJ\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\bJ\r\u0010%\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\bR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010/R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010!\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010/R\"\u0010<\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\rR\u0016\u0010A\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010=R\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010/R\u0011\u0010\u0015\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\bF\u00101R$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u00101\"\u0004\bH\u0010\u0011R$\u0010I\u001a\u00020\n2\u0006\u0010I\u001a\u00020\n8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010?\"\u0004\bK\u0010\rR$\u0010M\u001a\u00020L2\u0006\u0010M\u001a\u00020L8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lru/yandex/taxi/widget/OptimizedShimmeringPaint;", "Landroid/graphics/Paint;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "updateGradient", "()V", "setAnimatorValues", "", "value", "drawShimmeringValue", "(F)V", "", "gradientWidth", "setGradientWidth", "(I)V", "count", "setRepeatCount", "centerColor", "edgeColor", "setColors", "(II)V", "edgeColor2", "(III)V", "edgeColor3", "(IIII)V", "Landroid/view/View;", "view", "updateOffset", "(Landroid/view/View;)V", "updateShimmering", "startOffset", "setStartOffset", "restartShimmering", "enableShimmering", "disableShimmering", "Landroid/graphics/Matrix;", "matrix", "Landroid/graphics/Matrix;", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "screenWidth", CA20Status.STATUS_USER_I, "getGradientWidth", "()I", "", "colors", "[I", "", "positions", "[F", "centerPosition", "Landroid/graphics/LinearGradient;", "linearGradient", "Landroid/graphics/LinearGradient;", "angle", "F", "getAngle", "()F", "setAngle", "animatorStartValue", "", "isRtl", "Z", "absolutePosition", "getEdgeColor", "getCenterColor", "setCenterColor", "centerOffset", "getCenterOffset", "setCenterOffset", "", "duration", "getDuration", "()J", "setDuration", "(J)V", "Companion", "od70", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OptimizedShimmeringPaint extends Paint {
    public static final int DEFAULT_ANIMATION_DURATION = 1500;
    public static final int DEFAULT_EDGE_COLOR = 16777215;
    private int absolutePosition;
    private float angle;
    private final ValueAnimator animator;
    private float animatorStartValue;
    private int[] colors;
    private int gradientWidth;
    private boolean isRtl;
    private LinearGradient linearGradient;
    private int screenWidth;
    private int startOffset;
    public static final od70 Companion = new od70();
    private static long startTime = AnimationUtils.currentAnimationTimeMillis();
    private final Matrix matrix = new Matrix();
    private float[] positions = {0.0f, 0.5f, 1.0f};
    private int centerPosition = 1;

    public OptimizedShimmeringPaint(Context context) {
        setColors(qje.t(xng0.shimmeringDefaultColor, context), 16777215);
        updateGradient();
        ValueAnimator valueAnimator = new ValueAnimator();
        this.animator = valueAnimator;
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
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(this.matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableShimmering$lambda$0(OptimizedShimmeringPaint optimizedShimmeringPaint, ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        optimizedShimmeringPaint.drawShimmeringValue((f != null ? f.floatValue() : 0.0f) - optimizedShimmeringPaint.absolutePosition);
    }

    private final void setAnimatorValues() {
        if (this.isRtl) {
            float f = this.screenWidth - this.startOffset;
            this.animatorStartValue = f;
            this.animator.setFloatValues(f, (-this.gradientWidth) - r4);
            return;
        }
        float f2 = (-this.gradientWidth) - this.startOffset;
        this.animatorStartValue = f2;
        this.animator.setFloatValues(f2, this.screenWidth - r4);
    }

    private final void updateGradient() {
        float f = this.gradientWidth;
        int[] iArr = this.colors;
        if (iArr == null) {
            iArr = null;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f, 0.0f, iArr, this.positions, Shader.TileMode.CLAMP);
        this.linearGradient = linearGradient;
        linearGradient.setLocalMatrix(this.matrix);
        setShader(this.linearGradient);
    }

    public final void disableShimmering() {
        this.animator.removeAllUpdateListeners();
        drawShimmeringValue(this.animatorStartValue);
    }

    public final void enableShimmering() {
        this.animator.removeAllUpdateListeners();
        this.animator.addUpdateListener(new yso(14, this));
    }

    public final float getAngle() {
        return this.angle;
    }

    public final ValueAnimator getAnimator() {
        return this.animator;
    }

    public final int getCenterColor() {
        int[] iArr = this.colors;
        if (iArr == null) {
            iArr = null;
        }
        return iArr[this.centerPosition];
    }

    public final float getCenterOffset() {
        return this.positions[this.centerPosition];
    }

    public final long getDuration() {
        return this.animator.getDuration();
    }

    public final int getEdgeColor() {
        int[] iArr = this.colors;
        if (iArr == null) {
            iArr = null;
        }
        return iArr[0];
    }

    public final int getGradientWidth() {
        return this.gradientWidth;
    }

    public final void restartShimmering() {
        startTime = AnimationUtils.currentAnimationTimeMillis();
        updateShimmering();
    }

    public final void setAngle(float f) {
        this.angle = f;
    }

    public final void setCenterColor(int i) {
        int[] iArr = this.colors;
        if (iArr == null) {
            iArr = null;
        }
        iArr[this.centerPosition] = i;
        updateGradient();
    }

    public final void setCenterOffset(float f) {
        this.positions[this.centerPosition] = f;
        updateGradient();
    }

    public final void setColors(int centerColor, int edgeColor, int edgeColor2, int edgeColor3) {
        this.positions = new float[]{0.0f, 0.2f, 0.35f, 0.5f, 0.65f, 0.8f, 1.0f};
        this.colors = new int[]{edgeColor, edgeColor2, edgeColor3, centerColor, edgeColor3, edgeColor2, edgeColor};
        this.centerPosition = 3;
        updateGradient();
    }

    public final void setDuration(long j) {
        this.animator.setDuration(j);
    }

    public final void setGradientWidth(int gradientWidth) {
        this.gradientWidth = gradientWidth;
        updateGradient();
        setAnimatorValues();
    }

    public final void setRepeatCount(int count) {
        this.animator.setRepeatCount(count);
    }

    public final void setStartOffset(int startOffset) {
        this.startOffset = startOffset;
    }

    public final void updateOffset(View view) {
        if (this.screenWidth == 0) {
            this.screenWidth = view.getRootView().getWidth();
            if (this.gradientWidth == 0) {
                this.gradientWidth = tje.u(60, view.getContext());
                updateGradient();
            }
        }
        this.isRtl = xw31.n(view.getContext());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.absolutePosition = iArr[0];
        setAnimatorValues();
    }

    public final void updateShimmering(View view) {
        Rect rect = xw31.a;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.absolutePosition = iArr[0];
        updateShimmering();
    }

    public final void updateShimmering() {
        this.animator.setCurrentPlayTime(AnimationUtils.currentAnimationTimeMillis() - startTime);
    }

    public final void setColors(int centerColor, int edgeColor, int edgeColor2) {
        this.positions = new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
        this.colors = new int[]{edgeColor, edgeColor2, centerColor, edgeColor2, edgeColor};
        this.centerPosition = 2;
        updateGradient();
    }

    public final void setColors(int centerColor, int edgeColor) {
        this.positions = new float[]{0.0f, 0.5f, 1.0f};
        this.colors = new int[]{edgeColor, centerColor, edgeColor};
        this.centerPosition = 1;
        updateGradient();
    }
}
