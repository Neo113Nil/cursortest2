package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.color.MaterialColors;
import org.commonmark.node.Node;

/* loaded from: classes4.dex */
public final class LinearDrawingDelegate extends Node {
    public float adjustedWavelength;
    public int cachedWavelength;
    public float displayedAmplitude;
    public float displayedCornerRadius;
    public float displayedInnerCornerRadius;
    public float displayedTrackThickness;
    public boolean drawingDeterminateIndicator;
    public Pair endPoints;
    public float totalTrackLengthFraction;
    public float trackLength;

    @Override // org.commonmark.node.Node
    public final void adjustCanvas(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = (BaseProgressIndicatorSpec) this.parent;
        if (this.trackLength != rect.width()) {
            this.trackLength = rect.width();
            invalidateCachedPaths();
        }
        float preferredHeight = getPreferredHeight();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(RecyclerView.DECELERATION_RATE, (rect.height() - preferredHeight) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) baseProgressIndicatorSpec;
        if (linearProgressIndicatorSpec.drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.trackLength / 2.0f;
        float f3 = preferredHeight / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        this.displayedTrackThickness = linearProgressIndicatorSpec.trackThickness * f;
        this.displayedCornerRadius = Math.min(r10 / 2, linearProgressIndicatorSpec.getTrackCornerRadiusInPx()) * f;
        this.displayedAmplitude = linearProgressIndicatorSpec.waveAmplitude * f;
        this.displayedInnerCornerRadius = Math.min(linearProgressIndicatorSpec.trackThickness / 2.0f, linearProgressIndicatorSpec.getTrackInnerCornerRadiusInPx()) * f;
        if (z || z2) {
            if ((z && linearProgressIndicatorSpec.showAnimationBehavior == 2) || (z2 && linearProgressIndicatorSpec.hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && linearProgressIndicatorSpec.hideAnimationBehavior != 3)) {
                canvas.translate(RecyclerView.DECELERATION_RATE, ((1.0f - f) * linearProgressIndicatorSpec.trackThickness) / 2.0f);
            }
        }
        if (z2 && linearProgressIndicatorSpec.hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    public final void drawLine(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec;
        float f6;
        Canvas canvas2;
        Path path = (Path) this.lastChild;
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = (BaseProgressIndicatorSpec) this.parent;
        Pair pair = this.endPoints;
        float clamp = MathUtils.clamp(f, RecyclerView.DECELERATION_RATE, 1.0f);
        float clamp2 = MathUtils.clamp(f2, RecyclerView.DECELERATION_RATE, 1.0f);
        float lerp = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, clamp);
        float lerp2 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, clamp2);
        int clamp3 = (int) ((MathUtils.clamp(lerp, RecyclerView.DECELERATION_RATE, 0.01f) * i2) / 0.01f);
        int clamp4 = (int) (((1.0f - MathUtils.clamp(lerp2, 0.99f, 1.0f)) * i3) / 0.01f);
        float f7 = this.trackLength;
        int i4 = (int) ((lerp * f7) + clamp3);
        int i5 = (int) ((lerp2 * f7) - clamp4);
        float f8 = this.displayedCornerRadius;
        float f9 = this.displayedInnerCornerRadius;
        if (f8 != f9) {
            float max = Math.max(f8, f9);
            float f10 = this.trackLength;
            float f11 = max / f10;
            float lerp3 = com.google.android.material.math.MathUtils.lerp(this.displayedCornerRadius, this.displayedInnerCornerRadius, MathUtils.clamp(i4 / f10, RecyclerView.DECELERATION_RATE, f11) / f11);
            float f12 = this.displayedCornerRadius;
            float f13 = this.displayedInnerCornerRadius;
            float f14 = this.trackLength;
            f8 = com.google.android.material.math.MathUtils.lerp(f12, f13, MathUtils.clamp((f14 - i5) / f14, RecyclerView.DECELERATION_RATE, f11) / f11);
            f5 = lerp3;
        } else {
            f5 = f8;
        }
        float f15 = (-this.trackLength) / 2.0f;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec2 = (LinearProgressIndicatorSpec) baseProgressIndicatorSpec;
        boolean z2 = linearProgressIndicatorSpec2.hasWavyEffect(this.drawingDeterminateIndicator) && z && f3 > RecyclerView.DECELERATION_RATE;
        if (i4 <= i5) {
            float f16 = i4 + f5;
            float f17 = i5 - f8;
            float f18 = f5 * 2.0f;
            float f19 = f8 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            ((DrawingDelegate$PathPoint) pair.first).reset();
            ((DrawingDelegate$PathPoint) pair.second).reset();
            ((DrawingDelegate$PathPoint) pair.first).translate(f16 + f15);
            ((DrawingDelegate$PathPoint) pair.second).translate(f17 + f15);
            if (i4 == 0 && f17 + f8 < f16 + f5) {
                DrawingDelegate$PathPoint drawingDelegate$PathPoint = (DrawingDelegate$PathPoint) pair.first;
                float f20 = this.displayedTrackThickness;
                drawRoundedBlock(canvas, paint, drawingDelegate$PathPoint, f18, f20, f5, (DrawingDelegate$PathPoint) pair.second, f19, f20, f8, true);
                return;
            }
            float f21 = f5;
            float f22 = f8;
            if (f16 - f21 > f17 - f22) {
                DrawingDelegate$PathPoint drawingDelegate$PathPoint2 = (DrawingDelegate$PathPoint) pair.second;
                float f23 = this.displayedTrackThickness;
                drawRoundedBlock(canvas, paint, drawingDelegate$PathPoint2, f19, f23, f22, (DrawingDelegate$PathPoint) pair.first, f18, f23, f21, false);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(linearProgressIndicatorSpec2.useStrokeCap() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z2) {
                PathMeasure pathMeasure = (PathMeasure) this.prev;
                float f24 = this.trackLength;
                float f25 = f16 / f24;
                float f26 = f17 / f24;
                Matrix matrix = (Matrix) this.next;
                int i6 = this.drawingDeterminateIndicator ? linearProgressIndicatorSpec2.wavelengthDeterminate : linearProgressIndicatorSpec2.wavelengthIndeterminate;
                if (i6 != this.cachedWavelength) {
                    this.cachedWavelength = i6;
                    invalidateCachedPaths();
                }
                path.rewind();
                float f27 = (-this.trackLength) / 2.0f;
                boolean hasWavyEffect = linearProgressIndicatorSpec2.hasWavyEffect(this.drawingDeterminateIndicator);
                if (hasWavyEffect) {
                    float f28 = this.trackLength;
                    linearProgressIndicatorSpec = linearProgressIndicatorSpec2;
                    float f29 = this.adjustedWavelength;
                    float f30 = f28 / f29;
                    float f31 = f4 / f30;
                    float f32 = f30 / (f30 + 1.0f);
                    f25 = (f25 + f31) * f32;
                    f26 = (f26 + f31) * f32;
                    f27 -= f29 * f4;
                } else {
                    linearProgressIndicatorSpec = linearProgressIndicatorSpec2;
                }
                float length = pathMeasure.getLength() * f25;
                float length2 = pathMeasure.getLength() * f26;
                pathMeasure.getSegment(length, length2, path, true);
                DrawingDelegate$PathPoint drawingDelegate$PathPoint3 = (DrawingDelegate$PathPoint) pair.first;
                drawingDelegate$PathPoint3.reset();
                f6 = f18;
                pathMeasure.getPosTan(length, drawingDelegate$PathPoint3.posVec, drawingDelegate$PathPoint3.tanVec);
                DrawingDelegate$PathPoint drawingDelegate$PathPoint4 = (DrawingDelegate$PathPoint) pair.second;
                drawingDelegate$PathPoint4.reset();
                pathMeasure.getPosTan(length2, drawingDelegate$PathPoint4.posVec, drawingDelegate$PathPoint4.tanVec);
                matrix.reset();
                matrix.setTranslate(f27, RecyclerView.DECELERATION_RATE);
                drawingDelegate$PathPoint3.translate(f27);
                drawingDelegate$PathPoint4.translate(f27);
                if (hasWavyEffect) {
                    float f33 = this.displayedAmplitude * f3;
                    matrix.postScale(1.0f, f33);
                    drawingDelegate$PathPoint3.scale(f33);
                    drawingDelegate$PathPoint4.scale(f33);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                float[] fArr = ((DrawingDelegate$PathPoint) pair.first).posVec;
                float f34 = fArr[0];
                float f35 = fArr[1];
                float[] fArr2 = ((DrawingDelegate$PathPoint) pair.second).posVec;
                canvas.drawLine(f34, f35, fArr2[0], fArr2[1], paint);
                linearProgressIndicatorSpec = linearProgressIndicatorSpec2;
                f6 = f18;
                canvas2 = canvas;
            }
            if (linearProgressIndicatorSpec.useStrokeCap()) {
                return;
            }
            if (f16 > RecyclerView.DECELERATION_RATE && f21 > RecyclerView.DECELERATION_RATE) {
                drawRoundedBlock(canvas2, paint, (DrawingDelegate$PathPoint) pair.first, f6, this.displayedTrackThickness, f21, null, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, false);
            }
            if (f17 >= this.trackLength || f22 <= RecyclerView.DECELERATION_RATE) {
                return;
            }
            drawRoundedBlock(canvas, paint, (DrawingDelegate$PathPoint) pair.second, f19, this.displayedTrackThickness, f22, null, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, false);
        }
    }

    public final void drawRoundedBlock(Canvas canvas, Paint paint, DrawingDelegate$PathPoint drawingDelegate$PathPoint, float f, float f2, float f3, DrawingDelegate$PathPoint drawingDelegate$PathPoint2, float f4, float f5, float f6, boolean z) {
        float f7;
        float f8;
        float min = Math.min(f2, this.displayedTrackThickness);
        float f9 = (-f) / 2.0f;
        float f10 = (-min) / 2.0f;
        float f11 = f / 2.0f;
        float f12 = min / 2.0f;
        RectF rectF = new RectF(f9, f10, f11, f12);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (drawingDelegate$PathPoint2 != null) {
            float[] fArr = drawingDelegate$PathPoint2.tanVec;
            float[] fArr2 = drawingDelegate$PathPoint2.posVec;
            float min2 = Math.min(f5, this.displayedTrackThickness);
            float min3 = Math.min(f4 / 2.0f, (f6 * min2) / this.displayedTrackThickness);
            RectF rectF2 = new RectF();
            if (z) {
                float f13 = (fArr2[0] - min3) - (drawingDelegate$PathPoint.posVec[0] - f3);
                if (f13 > RecyclerView.DECELERATION_RATE) {
                    drawingDelegate$PathPoint2.translate((-f13) / 2.0f);
                    f8 = f4 + f13;
                } else {
                    f8 = f4;
                }
                rectF2.set(RecyclerView.DECELERATION_RATE, f10, f11, f12);
            } else {
                float f14 = (fArr2[0] + min3) - (drawingDelegate$PathPoint.posVec[0] + f3);
                if (f14 < RecyclerView.DECELERATION_RATE) {
                    drawingDelegate$PathPoint2.translate((-f14) / 2.0f);
                    f7 = f4 - f14;
                } else {
                    f7 = f4;
                }
                rectF2.set(f9, f10, RecyclerView.DECELERATION_RATE, f12);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-min2) / 2.0f, f8 / 2.0f, min2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(Node.vectorToCanvasRotation(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, min3, min3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-Node.vectorToCanvasRotation(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = drawingDelegate$PathPoint.posVec;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(Node.vectorToCanvasRotation(drawingDelegate$PathPoint.tanVec));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = drawingDelegate$PathPoint.posVec;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(Node.vectorToCanvasRotation(drawingDelegate$PathPoint.tanVec));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }

    @Override // org.commonmark.node.Node
    public final void drawStopIndicator(Canvas canvas, Paint paint, int i, int i2) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i, i2);
        this.drawingDeterminateIndicator = false;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) ((BaseProgressIndicatorSpec) this.parent);
        int min = Math.min(linearProgressIndicatorSpec.trackStopIndicatorSize, linearProgressIndicatorSpec.trackThickness);
        if (min <= 0 || compositeARGBWithAlpha == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(compositeARGBWithAlpha);
        Integer num = linearProgressIndicatorSpec.trackStopIndicatorPadding;
        float[] fArr = {(this.trackLength / 2.0f) - (num != null ? (linearProgressIndicatorSpec.trackStopIndicatorSize / 2.0f) + num.floatValue() : this.displayedTrackThickness / 2.0f), RecyclerView.DECELERATION_RATE};
        float f = min;
        drawRoundedBlock(canvas, paint, new DrawingDelegate$PathPoint(fArr, new float[]{1.0f, RecyclerView.DECELERATION_RATE}), f, f, (this.displayedCornerRadius * f) / this.displayedTrackThickness, null, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, false);
    }

    @Override // org.commonmark.node.Node
    public final void fillIndicator(Canvas canvas, Paint paint, DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator, int i) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(drawingDelegate$ActiveIndicator.color, i);
        this.drawingDeterminateIndicator = drawingDelegate$ActiveIndicator.isDeterminate;
        float f = drawingDelegate$ActiveIndicator.startFraction;
        float f2 = drawingDelegate$ActiveIndicator.endFraction;
        int i2 = drawingDelegate$ActiveIndicator.gapSize;
        drawLine(canvas, paint, f, f2, compositeARGBWithAlpha, i2, i2, drawingDelegate$ActiveIndicator.amplitudeFraction, drawingDelegate$ActiveIndicator.phaseFraction, true);
    }

    @Override // org.commonmark.node.Node
    public final void fillTrack(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i, i2);
        this.drawingDeterminateIndicator = false;
        drawLine(canvas, paint, f, f2, compositeARGBWithAlpha, i3, i3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, false);
    }

    @Override // org.commonmark.node.Node
    public final int getPreferredHeight() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = (BaseProgressIndicatorSpec) this.parent;
        return (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).waveAmplitude * 2) + ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackThickness;
    }

    @Override // org.commonmark.node.Node
    public final int getPreferredWidth() {
        return -1;
    }

    @Override // org.commonmark.node.Node
    public final void invalidateCachedPaths() {
        Matrix matrix = (Matrix) this.next;
        Path path = (Path) this.firstChild;
        path.rewind();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) ((BaseProgressIndicatorSpec) this.parent);
        if (linearProgressIndicatorSpec.hasWavyEffect(this.drawingDeterminateIndicator)) {
            int i = this.drawingDeterminateIndicator ? linearProgressIndicatorSpec.wavelengthDeterminate : linearProgressIndicatorSpec.wavelengthIndeterminate;
            float f = this.trackLength;
            int i2 = (int) (f / i);
            this.adjustedWavelength = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 * 2;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, RecyclerView.DECELERATION_RATE, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = f2 + 0.48f;
                float f4 = i4 + 2;
                path.cubicTo(f3, 1.0f, f4 - 0.48f, RecyclerView.DECELERATION_RATE, f4, RecyclerView.DECELERATION_RATE);
            }
            matrix.reset();
            matrix.setScale(this.adjustedWavelength / 2.0f, -2.0f);
            matrix.postTranslate(RecyclerView.DECELERATION_RATE, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.trackLength, RecyclerView.DECELERATION_RATE);
        }
        ((PathMeasure) this.prev).setPath(path, false);
    }
}
