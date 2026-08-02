package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ShapePath {
    public float currentShadowAngle;
    public float endShadowAngle;
    public float endX;
    public float endY;

    /* renamed from: operations, reason: collision with root package name */
    public final ArrayList f993operations = new ArrayList();
    public final ArrayList shadowCompatOperations = new ArrayList();
    public float startY;

    public final class ArcShadowOperation extends ShadowCompatOperation {

        /* renamed from: operation, reason: collision with root package name */
        public final PathArcOperation f994operation;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.f994operation = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public final void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            PathArcOperation pathArcOperation = this.f994operation;
            float f = pathArcOperation.startAngle;
            float f2 = pathArcOperation.sweepAngle;
            RectF rectF = new RectF(pathArcOperation.left, pathArcOperation.top, pathArcOperation.right, pathArcOperation.bottom);
            Paint paint = shadowRenderer.cornerShadowPaint;
            boolean z = f2 < RecyclerView.DECELERATION_RATE;
            Path path = shadowRenderer.scratch;
            int[] iArr = ShadowRenderer.cornerColors;
            if (z) {
                iArr[0] = 0;
                iArr[1] = shadowRenderer.shadowEndColor;
                iArr[2] = shadowRenderer.shadowMiddleColor;
                iArr[3] = shadowRenderer.shadowStartColor;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = -i;
                rectF.inset(f3, f3);
                iArr[0] = 0;
                iArr[1] = shadowRenderer.shadowStartColor;
                iArr[2] = shadowRenderer.shadowMiddleColor;
                iArr[3] = shadowRenderer.shadowEndColor;
            }
            float width = rectF.width() / 2.0f;
            if (width <= RecyclerView.DECELERATION_RATE) {
                return;
            }
            float f4 = 1.0f - (i / width);
            float m = Recorder$$ExternalSyntheticOutline2.m(1.0f, f4, 2.0f, f4);
            float[] fArr = ShadowRenderer.cornerPositions;
            fArr[1] = f4;
            fArr[2] = m;
            paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, shadowRenderer.transparentPaint);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }

    public final class LineShadowOperation extends ShadowCompatOperation {

        /* renamed from: operation, reason: collision with root package name */
        public final PathLineOperation f995operation;
        public final float startX;
        public final float startY;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f, float f2) {
            this.f995operation = pathLineOperation;
            this.startX = f;
            this.startY = f2;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public final void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas) {
            PathLineOperation pathLineOperation = this.f995operation;
            float f = pathLineOperation.y;
            float f2 = this.startY;
            float f3 = pathLineOperation.x;
            float f4 = this.startX;
            RectF rectF = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (float) Math.hypot(f - f2, f3 - f4), RecyclerView.DECELERATION_RATE);
            Matrix matrix2 = this.renderMatrix;
            matrix2.set(matrix);
            matrix2.preTranslate(f4, f2);
            matrix2.preRotate(getAngle());
            shadowRenderer.getClass();
            rectF.bottom += i;
            rectF.offset(RecyclerView.DECELERATION_RATE, -i);
            int i2 = shadowRenderer.shadowEndColor;
            int[] iArr = ShadowRenderer.edgeColors;
            iArr[0] = i2;
            iArr[1] = shadowRenderer.shadowMiddleColor;
            iArr[2] = shadowRenderer.shadowStartColor;
            Paint paint = shadowRenderer.edgeShadowPaint;
            float f5 = rectF.left;
            paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, ShadowRenderer.edgePositions, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float getAngle() {
            PathLineOperation pathLineOperation = this.f995operation;
            return (float) Math.toDegrees(Math.atan((pathLineOperation.y - this.startY) / (pathLineOperation.x - this.startX)));
        }
    }

    public final class PathArcOperation extends PathOperation {
        public static final RectF rectF = new RectF();
        public final float bottom;
        public final float left;
        public final float right;
        public float startAngle;
        public float sweepAngle;
        public final float top;

        public PathArcOperation(float f, float f2, float f3, float f4) {
            this.left = f;
            this.top = f2;
            this.right = f3;
            this.bottom = f4;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public final void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            float f = this.right;
            float f2 = this.bottom;
            RectF rectF2 = rectF;
            rectF2.set(this.left, this.top, f, f2);
            path.arcTo(rectF2, this.startAngle, this.sweepAngle, false);
            path.transform(matrix);
        }
    }

    public final class PathLineOperation extends PathOperation {
        public float x;
        public float y;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public final void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.x, this.y);
            path.transform(matrix);
        }
    }

    public abstract class PathOperation {
        public final Matrix matrix = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    public abstract class ShadowCompatOperation {
        public static final Matrix IDENTITY_MATRIX = new Matrix();
        public final Matrix renderMatrix = new Matrix();

        public abstract void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i, Canvas canvas);
    }

    public ShapePath() {
        reset(RecyclerView.DECELERATION_RATE, 270.0f, RecyclerView.DECELERATION_RATE);
    }

    public final void addArc(float f, float f2, float f3, float f4, float f5, float f6) {
        PathArcOperation pathArcOperation = new PathArcOperation(f, f2, f3, f4);
        pathArcOperation.startAngle = f5;
        pathArcOperation.sweepAngle = f6;
        this.f993operations.add(pathArcOperation);
        ArcShadowOperation arcShadowOperation = new ArcShadowOperation(pathArcOperation);
        float f7 = f5 + f6;
        boolean z = f6 < RecyclerView.DECELERATION_RATE;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        addConnectingShadowIfNecessary(f5);
        this.shadowCompatOperations.add(arcShadowOperation);
        this.currentShadowAngle = f8;
        double d = f7;
        this.endX = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.endY = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    public final void addConnectingShadowIfNecessary(float f) {
        float f2 = this.currentShadowAngle;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.endX;
        float f5 = this.endY;
        PathArcOperation pathArcOperation = new PathArcOperation(f4, f5, f4, f5);
        pathArcOperation.startAngle = this.currentShadowAngle;
        pathArcOperation.sweepAngle = f3;
        this.shadowCompatOperations.add(new ArcShadowOperation(pathArcOperation));
        this.currentShadowAngle = f;
    }

    public final void applyToPath(Matrix matrix, Path path) {
        ArrayList arrayList = this.f993operations;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((PathOperation) arrayList.get(i)).applyToPath(matrix, path);
        }
    }

    public final void lineTo(float f, float f2) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.x = f;
        pathLineOperation.y = f2;
        this.f993operations.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, this.endX, this.endY);
        float angle = lineShadowOperation.getAngle() + 270.0f;
        float angle2 = lineShadowOperation.getAngle() + 270.0f;
        addConnectingShadowIfNecessary(angle);
        this.shadowCompatOperations.add(lineShadowOperation);
        this.currentShadowAngle = angle2;
        this.endX = f;
        this.endY = f2;
    }

    public final void reset(float f, float f2, float f3) {
        this.startY = f;
        this.endX = RecyclerView.DECELERATION_RATE;
        this.endY = f;
        this.currentShadowAngle = f2;
        this.endShadowAngle = (f2 + f3) % 360.0f;
        this.f993operations.clear();
        this.shadowCompatOperations.clear();
    }
}
