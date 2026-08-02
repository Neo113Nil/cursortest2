package com.google.android.material.progressindicator;

import android.graphics.Matrix;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class DrawingDelegate$PathPoint {
    public final float[] posVec;
    public final float[] tanVec;
    public final Matrix transform;

    public DrawingDelegate$PathPoint(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[2];
        this.posVec = fArr3;
        float[] fArr4 = new float[2];
        this.tanVec = fArr4;
        System.arraycopy(fArr, 0, fArr3, 0, 2);
        System.arraycopy(fArr2, 0, fArr4, 0, 2);
        this.transform = new Matrix();
    }

    public final void moveAcross(float f) {
        float[] fArr = this.tanVec;
        float atan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
        float[] fArr2 = this.posVec;
        double d = f;
        double d2 = atan2;
        fArr2[0] = (float) ((Math.cos(d2) * d) + fArr2[0]);
        fArr2[1] = (float) ((Math.sin(d2) * d) + fArr2[1]);
    }

    public final void reset() {
        Arrays.fill(this.posVec, RecyclerView.DECELERATION_RATE);
        float[] fArr = this.tanVec;
        Arrays.fill(fArr, RecyclerView.DECELERATION_RATE);
        fArr[0] = 1.0f;
        this.transform.reset();
    }

    public final void rotate(float f) {
        Matrix matrix = this.transform;
        matrix.reset();
        matrix.setRotate(f);
        matrix.mapPoints(this.posVec);
        matrix.mapPoints(this.tanVec);
    }

    public final void scale(float f) {
        float[] fArr = this.posVec;
        fArr[0] = fArr[0] * 1.0f;
        fArr[1] = fArr[1] * f;
        float[] fArr2 = this.tanVec;
        fArr2[0] = fArr2[0] * 1.0f;
        fArr2[1] = fArr2[1] * f;
    }

    public final void translate(float f) {
        float[] fArr = this.posVec;
        fArr[0] = fArr[0] + f;
        fArr[1] = fArr[1] + RecyclerView.DECELERATION_RATE;
    }

    public DrawingDelegate$PathPoint() {
        this.posVec = new float[2];
        this.tanVec = new float[]{1.0f, 0.0f};
        this.transform = new Matrix();
    }
}
