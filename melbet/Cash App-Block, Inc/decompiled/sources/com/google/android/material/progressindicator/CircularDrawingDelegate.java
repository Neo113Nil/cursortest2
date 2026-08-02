package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.math.MathUtils;
import java.util.ArrayList;
import org.commonmark.node.Node;

/* loaded from: classes4.dex */
public final class CircularDrawingDelegate extends Node {
    public float adjustedRadius;
    public float adjustedWavelength;
    public final RectF arcBounds;
    public float cachedAmplitude;
    public float cachedRadius;
    public int cachedWavelength;
    public float displayedAmplitude;
    public float displayedCornerRadius;
    public float displayedTrackThickness;
    public boolean drawingDeterminateIndicator;
    public final Pair endPoints;
    public float totalTrackLengthFraction;

    public CircularDrawingDelegate(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.arcBounds = new RectF();
        this.endPoints = new Pair(new DrawingDelegate$PathPoint(), new DrawingDelegate$PathPoint());
    }

    @Override // org.commonmark.node.Node
    public final void adjustCanvas(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        float width = rect.width() / getSize();
        float height = rect.height() / getSize();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) ((BaseProgressIndicatorSpec) this.parent);
        float f2 = (circularProgressIndicatorSpec.indicatorSize / 2.0f) + circularProgressIndicatorSpec.indicatorInset;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (circularProgressIndicatorSpec.indicatorDirection != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.displayedTrackThickness = circularProgressIndicatorSpec.trackThickness * f;
        this.displayedCornerRadius = Math.min(r9 / 2, circularProgressIndicatorSpec.getTrackCornerRadiusInPx()) * f;
        this.displayedAmplitude = circularProgressIndicatorSpec.waveAmplitude * f;
        int i = circularProgressIndicatorSpec.indicatorSize;
        int i2 = circularProgressIndicatorSpec.trackThickness;
        float f4 = (i - i2) / 2.0f;
        this.adjustedRadius = f4;
        if (z || z2) {
            float f5 = ((1.0f - f) * i2) / 2.0f;
            if ((z && circularProgressIndicatorSpec.showAnimationBehavior == 2) || (z2 && circularProgressIndicatorSpec.hideAnimationBehavior == 1)) {
                this.adjustedRadius = f4 + f5;
            } else if ((z && circularProgressIndicatorSpec.showAnimationBehavior == 1) || (z2 && circularProgressIndicatorSpec.hideAnimationBehavior == 2)) {
                this.adjustedRadius = f4 - f5;
            }
        }
        if (z2 && circularProgressIndicatorSpec.hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    public final void drawArc(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        Canvas canvas2;
        Path path = (Path) this.lastChild;
        PathMeasure pathMeasure = (PathMeasure) this.prev;
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = (BaseProgressIndicatorSpec) this.parent;
        float f7 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f8 = f % 1.0f;
        if (f8 < RecyclerView.DECELERATION_RATE) {
            f8 += 1.0f;
        }
        if (this.totalTrackLengthFraction < 1.0f) {
            float f9 = f8 + f7;
            if (f9 > 1.0f) {
                drawArc(canvas, paint, f8, 1.0f, i, i2, 0, f3, f4, z);
                drawArc(canvas, paint, 1.0f, f9, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.displayedCornerRadius / this.adjustedRadius);
        float f10 = f7 - 0.99f;
        if (f10 >= RecyclerView.DECELERATION_RATE) {
            float f11 = ((f10 * degrees) / 180.0f) / 0.01f;
            f7 += f11;
            if (!z) {
                f8 -= f11 / 2.0f;
            }
        }
        float lerp = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, f8);
        float lerp2 = MathUtils.lerp(RecyclerView.DECELERATION_RATE, this.totalTrackLengthFraction, f7);
        float degrees2 = (float) Math.toDegrees(i2 / this.adjustedRadius);
        float degrees3 = ((lerp2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.adjustedRadius));
        float f12 = (lerp * 360.0f) + degrees2;
        if (degrees3 <= RecyclerView.DECELERATION_RATE) {
            return;
        }
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) baseProgressIndicatorSpec;
        boolean z2 = circularProgressIndicatorSpec.hasWavyEffect(this.drawingDeterminateIndicator) && z && f3 > RecyclerView.DECELERATION_RATE;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f13 = this.displayedCornerRadius * 2.0f;
        float f14 = degrees * 2.0f;
        if (degrees3 < f14) {
            float f15 = degrees3 / f14;
            float f16 = (degrees * f15) + f12;
            DrawingDelegate$PathPoint drawingDelegate$PathPoint = new DrawingDelegate$PathPoint();
            if (z2) {
                float length = (pathMeasure.getLength() * (f16 / 360.0f)) / 2.0f;
                float f17 = this.displayedAmplitude * f3;
                float f18 = this.adjustedRadius;
                if (f18 != this.cachedRadius || f17 != this.cachedAmplitude) {
                    this.cachedAmplitude = f17;
                    this.cachedRadius = f18;
                    invalidateCachedPaths();
                }
                pathMeasure.getPosTan(length, drawingDelegate$PathPoint.posVec, drawingDelegate$PathPoint.tanVec);
            } else {
                drawingDelegate$PathPoint.rotate(f16 + 90.0f);
                drawingDelegate$PathPoint.moveAcross(-this.adjustedRadius);
            }
            paint.setStyle(Paint.Style.FILL);
            drawRoundedBlock(canvas, paint, drawingDelegate$PathPoint, f13, this.displayedTrackThickness, f15);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(circularProgressIndicatorSpec.useStrokeCap() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f19 = f12 + degrees;
        float f20 = degrees3 - f14;
        Pair pair = this.endPoints;
        ((DrawingDelegate$PathPoint) pair.first).reset();
        ((DrawingDelegate$PathPoint) pair.second).reset();
        if (z2) {
            float f21 = f19 / 360.0f;
            float f22 = f20 / 360.0f;
            Matrix matrix = (Matrix) this.next;
            float f23 = this.displayedAmplitude * f3;
            int i4 = this.drawingDeterminateIndicator ? circularProgressIndicatorSpec.wavelengthDeterminate : circularProgressIndicatorSpec.wavelengthIndeterminate;
            float f24 = this.adjustedRadius;
            if (f24 != this.cachedRadius || f23 != this.cachedAmplitude || i4 != this.cachedWavelength) {
                this.cachedAmplitude = f23;
                this.cachedWavelength = i4;
                this.cachedRadius = f24;
                invalidateCachedPaths();
            }
            path.rewind();
            float clamp = androidx.core.math.MathUtils.clamp(f22, RecyclerView.DECELERATION_RATE, 1.0f);
            if (circularProgressIndicatorSpec.hasWavyEffect(this.drawingDeterminateIndicator)) {
                f5 = 1.0f;
                float f25 = f4 / ((float) ((this.adjustedRadius * 6.283185307179586d) / this.adjustedWavelength));
                f21 += f25;
                f6 = RecyclerView.DECELERATION_RATE - (f25 * 360.0f);
            } else {
                f5 = 1.0f;
                f6 = 0.0f;
            }
            float f26 = f21 % f5;
            float length2 = (pathMeasure.getLength() * f26) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f26 + clamp)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            DrawingDelegate$PathPoint drawingDelegate$PathPoint2 = (DrawingDelegate$PathPoint) pair.first;
            drawingDelegate$PathPoint2.reset();
            pathMeasure.getPosTan(length2, drawingDelegate$PathPoint2.posVec, drawingDelegate$PathPoint2.tanVec);
            DrawingDelegate$PathPoint drawingDelegate$PathPoint3 = (DrawingDelegate$PathPoint) pair.second;
            drawingDelegate$PathPoint3.reset();
            pathMeasure.getPosTan(length3, drawingDelegate$PathPoint3.posVec, drawingDelegate$PathPoint3.tanVec);
            matrix.reset();
            matrix.setRotate(f6);
            drawingDelegate$PathPoint2.rotate(f6);
            drawingDelegate$PathPoint3.rotate(f6);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((DrawingDelegate$PathPoint) pair.first).rotate(f19 + 90.0f);
            ((DrawingDelegate$PathPoint) pair.first).moveAcross(-this.adjustedRadius);
            ((DrawingDelegate$PathPoint) pair.second).rotate(f19 + f20 + 90.0f);
            ((DrawingDelegate$PathPoint) pair.second).moveAcross(-this.adjustedRadius);
            float f27 = this.adjustedRadius;
            float f28 = -f27;
            RectF rectF = this.arcBounds;
            rectF.set(f28, f28, f27, f27);
            canvas.drawArc(rectF, f19, f20, false, paint);
            canvas2 = canvas;
        }
        if (circularProgressIndicatorSpec.useStrokeCap() || this.displayedCornerRadius <= RecyclerView.DECELERATION_RATE) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        drawRoundedBlock(canvas2, paint, (DrawingDelegate$PathPoint) pair.first, f13, this.displayedTrackThickness, 1.0f);
        drawRoundedBlock(canvas, paint, (DrawingDelegate$PathPoint) pair.second, f13, this.displayedTrackThickness, 1.0f);
    }

    public final void drawRoundedBlock(Canvas canvas, Paint paint, DrawingDelegate$PathPoint drawingDelegate$PathPoint, float f, float f2, float f3) {
        float min = Math.min(f2, this.displayedTrackThickness);
        float f4 = f / 2.0f;
        float min2 = Math.min(f4, (this.displayedCornerRadius * min) / this.displayedTrackThickness);
        RectF rectF = new RectF((-f) / 2.0f, (-min) / 2.0f, f4, min / 2.0f);
        canvas.save();
        float[] fArr = drawingDelegate$PathPoint.posVec;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(Node.vectorToCanvasRotation(drawingDelegate$PathPoint.tanVec));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    @Override // org.commonmark.node.Node
    public final void drawStopIndicator(Canvas canvas, Paint paint, int i, int i2) {
    }

    @Override // org.commonmark.node.Node
    public final void fillIndicator(Canvas canvas, Paint paint, DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator, int i) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(drawingDelegate$ActiveIndicator.color, i);
        canvas.save();
        canvas.rotate(drawingDelegate$ActiveIndicator.rotationDegree);
        this.drawingDeterminateIndicator = drawingDelegate$ActiveIndicator.isDeterminate;
        float f = drawingDelegate$ActiveIndicator.startFraction;
        float f2 = drawingDelegate$ActiveIndicator.endFraction;
        int i2 = drawingDelegate$ActiveIndicator.gapSize;
        drawArc(canvas, paint, f, f2, compositeARGBWithAlpha, i2, i2, drawingDelegate$ActiveIndicator.amplitudeFraction, drawingDelegate$ActiveIndicator.phaseFraction, true);
        canvas.restore();
    }

    @Override // org.commonmark.node.Node
    public final void fillTrack(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i, i2);
        this.drawingDeterminateIndicator = false;
        drawArc(canvas, paint, f, f2, compositeARGBWithAlpha, i3, i3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, false);
    }

    @Override // org.commonmark.node.Node
    public final int getPreferredHeight() {
        return getSize();
    }

    @Override // org.commonmark.node.Node
    public final int getPreferredWidth() {
        return getSize();
    }

    public final int getSize() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = (BaseProgressIndicatorSpec) this.parent;
        return (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorInset * 2) + ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.commonmark.node.Node
    public final void invalidateCachedPaths() {
        int i;
        CircularDrawingDelegate circularDrawingDelegate = this;
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = (BaseProgressIndicatorSpec) circularDrawingDelegate.parent;
        PathMeasure pathMeasure = (PathMeasure) circularDrawingDelegate.prev;
        Matrix matrix = (Matrix) circularDrawingDelegate.next;
        Path path = (Path) circularDrawingDelegate.firstChild;
        path.rewind();
        path.moveTo(1.0f, RecyclerView.DECELERATION_RATE);
        boolean z = false;
        z = false;
        int i2 = 0;
        while (true) {
            i = 2;
            if (i2 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, RecyclerView.DECELERATION_RATE, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, RecyclerView.DECELERATION_RATE);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, RecyclerView.DECELERATION_RATE, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, RecyclerView.DECELERATION_RATE);
            i2++;
        }
        matrix.reset();
        float f = circularDrawingDelegate.adjustedRadius;
        matrix.setScale(f, f);
        path.transform(matrix);
        if (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).hasWavyEffect(circularDrawingDelegate.drawingDeterminateIndicator)) {
            pathMeasure.setPath(path, false);
            float f2 = circularDrawingDelegate.cachedAmplitude;
            path.rewind();
            float length = pathMeasure.getLength();
            float f3 = 2.0f;
            int max = Math.max(3, (int) ((length / (circularDrawingDelegate.drawingDeterminateIndicator ? r1.wavelengthDeterminate : r1.wavelengthIndeterminate)) / 2.0f)) * 2;
            circularDrawingDelegate.adjustedWavelength = length / max;
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < max; i3++) {
                DrawingDelegate$PathPoint drawingDelegate$PathPoint = new DrawingDelegate$PathPoint();
                float f4 = i3;
                pathMeasure.getPosTan(circularDrawingDelegate.adjustedWavelength * f4, drawingDelegate$PathPoint.posVec, drawingDelegate$PathPoint.tanVec);
                DrawingDelegate$PathPoint drawingDelegate$PathPoint2 = new DrawingDelegate$PathPoint();
                float f5 = circularDrawingDelegate.adjustedWavelength;
                pathMeasure.getPosTan((f5 / 2.0f) + (f4 * f5), drawingDelegate$PathPoint2.posVec, drawingDelegate$PathPoint2.tanVec);
                arrayList.add(drawingDelegate$PathPoint);
                drawingDelegate$PathPoint2.moveAcross(f2 * 2.0f);
                arrayList.add(drawingDelegate$PathPoint2);
            }
            arrayList.add((DrawingDelegate$PathPoint) arrayList.get(0));
            DrawingDelegate$PathPoint drawingDelegate$PathPoint3 = (DrawingDelegate$PathPoint) arrayList.get(0);
            float[] fArr = drawingDelegate$PathPoint3.posVec;
            path.moveTo(fArr[0], fArr[1]);
            int i4 = 1;
            while (i4 < arrayList.size()) {
                DrawingDelegate$PathPoint drawingDelegate$PathPoint4 = (DrawingDelegate$PathPoint) arrayList.get(i4);
                float f6 = (circularDrawingDelegate.adjustedWavelength / f3) * 0.48f;
                float[] fArr2 = drawingDelegate$PathPoint3.posVec;
                float[] fArr3 = drawingDelegate$PathPoint3.tanVec;
                float[] fArr4 = new float[i];
                float[] fArr5 = new float[i];
                System.arraycopy(fArr2, z ? 1 : 0, fArr4, z ? 1 : 0, i);
                System.arraycopy(fArr3, z ? 1 : 0, fArr5, z ? 1 : 0, i);
                new Matrix();
                float[] fArr6 = drawingDelegate$PathPoint4.posVec;
                float[] fArr7 = new float[i];
                System.arraycopy(fArr6, z ? 1 : 0, fArr7, z ? 1 : 0, i);
                System.arraycopy(drawingDelegate$PathPoint4.tanVec, z ? 1 : 0, new float[i], z ? 1 : 0, i);
                new Matrix();
                double d = fArr5[1];
                float f7 = fArr5[z ? 1 : 0];
                Object[] objArr = z ? 1 : 0;
                Path path2 = path;
                float atan2 = (float) Math.atan2(d, f7);
                double d2 = f6;
                double d3 = atan2;
                fArr4[objArr == true ? 1 : 0] = (float) ((Math.cos(d3) * d2) + fArr4[objArr == true ? 1 : 0]);
                fArr4[1] = (float) ((Math.sin(d3) * d2) + fArr4[1]);
                float atan22 = (float) Math.atan2(r12[1], r12[objArr == true ? 1 : 0]);
                double d4 = -f6;
                double d5 = atan22;
                fArr7[objArr == true ? 1 : 0] = (float) ((Math.cos(d5) * d4) + fArr7[objArr == true ? 1 : 0]);
                float sin = (float) ((Math.sin(d5) * d4) + fArr7[1]);
                fArr7[1] = sin;
                float f8 = fArr4[objArr == true ? 1 : 0];
                float f9 = fArr4[1];
                float f10 = fArr7[objArr == true ? 1 : 0];
                float[] fArr8 = drawingDelegate$PathPoint4.posVec;
                float f11 = fArr8[objArr == true ? 1 : 0];
                float f12 = fArr8[1];
                path = path2;
                path.cubicTo(f8, f9, f10, sin, f11, f12);
                i4++;
                drawingDelegate$PathPoint3 = drawingDelegate$PathPoint4;
                arrayList = arrayList;
                z = objArr == true ? 1 : 0;
                f3 = 2.0f;
                i = 2;
                circularDrawingDelegate = this;
            }
        }
        pathMeasure.setPath(path, z);
    }
}
