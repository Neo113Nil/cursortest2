package ru.yandex.taxi.widget.progress;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.g8e;
import defpackage.na90;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010%R\u0014\u00101\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010%R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010%R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010%R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010%R\u0017\u00106\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010:\u001a\u0002058\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u0014\u0010<\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lru/yandex/taxi/widget/progress/GradientLinearSegmentedProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "", "numberOfSegments", "currentProgress", "dashWidth", "dashHeight", "segmentHeight", "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "Lna90;", "gradient", "defaultColor", "<init>", "(Landroid/content/Context;IIIIIFLna90;I)V", "Landroid/graphics/Shader;", "createShader", "()Landroid/graphics/Shader;", "Lzy11;", "calculateCarPosition", "()V", "updateSegmentPosition", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Rect;", "rect", "drawOverlayRect", "(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V", "drawUnderlyingFigures", "(Landroid/graphics/Canvas;)V", "onDraw", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", CA20Status.STATUS_USER_I, "F", "", "personalGradientColors", "[I", "", "personalGradientPositions", "[F", "Landroid/graphics/drawable/Drawable;", "carDrawable", "Landroid/graphics/drawable/Drawable;", "carWidth", "carHeight", "width", "height", "segmentWidth", "Landroid/graphics/Paint;", "overlayPaint", "Landroid/graphics/Paint;", "getOverlayPaint", "()Landroid/graphics/Paint;", "underlyingPaint", "getUnderlyingPaint", "overlayRect", "Landroid/graphics/Rect;", "carPosition", "Landroid/graphics/RectF;", "segmentPosition", "Landroid/graphics/RectF;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GradientLinearSegmentedProgressView extends View {
    public static final int $stable = 8;
    private final Drawable carDrawable;
    private final int carHeight;
    private final Rect carPosition;
    private final int carWidth;
    private final float cornerRadius;
    private final int currentProgress;
    private final int dashHeight;
    private final int dashWidth;
    private int height;
    private final int numberOfSegments;
    private final Paint overlayPaint;
    private final Rect overlayRect;
    private final int[] personalGradientColors;
    private final float[] personalGradientPositions;
    private final int segmentHeight;
    private final RectF segmentPosition;
    private int segmentWidth;
    private final Paint underlyingPaint;
    private int width;

    public GradientLinearSegmentedProgressView(Context context, int i, int i2, int i3, int i4, int i5, float f, na90 na90Var, int i6) {
        super(context);
        this.numberOfSegments = i;
        this.currentProgress = i2;
        this.dashWidth = i3;
        this.dashHeight = i4;
        this.segmentHeight = i5;
        this.cornerRadius = f;
        throw null;
    }

    private final void calculateCarPosition() {
        int i = this.currentProgress;
        Rect rect = this.carPosition;
        if (i == 0) {
            rect.set(0, 0, this.carWidth, this.carHeight);
            return;
        }
        int i2 = this.segmentWidth;
        int i3 = this.dashWidth;
        rect.set((((i - 1) * i3) + (i * i2)) - this.carWidth, 0, g8e.d(i, 1, i3, i2 * i), this.carHeight);
    }

    private final Shader createShader() {
        return new LinearGradient(0.0f, 0.0f, this.width, this.height, this.personalGradientColors, this.personalGradientPositions, Shader.TileMode.CLAMP);
    }

    private final void drawOverlayRect(Canvas canvas, Rect rect) {
        canvas.drawRect(rect, this.overlayPaint);
    }

    private final void drawUnderlyingFigures(Canvas canvas) {
        this.carDrawable.draw(canvas);
        int i = this.numberOfSegments;
        for (int i2 = 0; i2 < i; i2++) {
            RectF rectF = this.segmentPosition;
            float f = this.cornerRadius;
            canvas.drawRoundRect(rectF, f, f, this.underlyingPaint);
            updateSegmentPosition();
        }
    }

    private final void updateSegmentPosition() {
        RectF rectF = this.segmentPosition;
        float f = rectF.left;
        int i = this.segmentWidth;
        int i2 = this.dashWidth;
        rectF.left = f + i + i2;
        rectF.right += i + i2;
    }

    public final Paint getOverlayPaint() {
        return this.overlayPaint;
    }

    public final Paint getUnderlyingPaint() {
        return this.underlyingPaint;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawUnderlyingFigures(canvas);
        if (this.currentProgress != 0) {
            this.overlayRect.set(0, 0, this.carPosition.right, this.height);
            drawOverlayRect(canvas, this.overlayRect);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        this.width = measuredWidth;
        int i = this.numberOfSegments;
        this.segmentWidth = (measuredWidth - ((i - 1) * this.dashWidth)) / i;
        this.height = this.carHeight + this.dashHeight + this.segmentHeight;
        calculateCarPosition();
        RectF rectF = this.segmentPosition;
        int i2 = this.carHeight;
        int i3 = this.dashHeight;
        rectF.set(0.0f, i2 + i3, this.segmentWidth, i2 + i3 + this.segmentHeight);
        this.overlayPaint.setShader(createShader());
        Drawable drawable = this.carDrawable;
        Rect rect = this.carPosition;
        drawable.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        setMeasuredDimension(this.width, this.height);
    }
}
