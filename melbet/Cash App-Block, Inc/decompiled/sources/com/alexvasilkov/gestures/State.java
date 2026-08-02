package com.alexvasilkov.gestures;

import android.graphics.Matrix;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class State {
    public float rotation;
    public float x;
    public float y;
    public final Matrix matrix = new Matrix();
    public final float[] matrixValues = new float[9];
    public float zoom = 1.0f;

    public static int compare(float f, float f2) {
        if (f > f2 + 0.001f) {
            return 1;
        }
        return f < f2 - 0.001f ? -1 : 0;
    }

    public static void nonNaN(float f) {
        if (Float.isNaN(f)) {
            a$$ExternalSyntheticBUOutline0.m$3("Provided float is NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && State.class == obj.getClass()) {
            State state = (State) obj;
            if (equals(state.x, this.x) && equals(state.y, this.y) && equals(state.zoom, this.zoom) && equals(state.rotation, this.rotation)) {
                return true;
            }
        }
        return false;
    }

    public final void get(Matrix matrix) {
        matrix.set(this.matrix);
    }

    public final int hashCode() {
        float f = this.x;
        int floatToIntBits = (f != RecyclerView.DECELERATION_RATE ? Float.floatToIntBits(f) : 0) * 31;
        float f2 = this.y;
        int floatToIntBits2 = (floatToIntBits + (f2 != RecyclerView.DECELERATION_RATE ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.zoom;
        int floatToIntBits3 = (floatToIntBits2 + (f3 != RecyclerView.DECELERATION_RATE ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.rotation;
        return floatToIntBits3 + (f4 != RecyclerView.DECELERATION_RATE ? Float.floatToIntBits(f4) : 0);
    }

    public final void set(float f, float f2, float f3, float f4) {
        while (f4 < -180.0f) {
            f4 += 360.0f;
        }
        while (f4 > 180.0f) {
            f4 -= 360.0f;
        }
        nonNaN(f);
        this.x = f;
        nonNaN(f2);
        this.y = f2;
        nonNaN(f3);
        this.zoom = f3;
        nonNaN(f4);
        this.rotation = f4;
        Matrix matrix = this.matrix;
        matrix.reset();
        if (f3 != 1.0f) {
            matrix.postScale(f3, f3);
        }
        if (f4 != RecyclerView.DECELERATION_RATE) {
            matrix.postRotate(f4);
        }
        matrix.postTranslate(f, f2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{x=");
        sb.append(this.x);
        sb.append(",y=");
        sb.append(this.y);
        sb.append(",zoom=");
        sb.append(this.zoom);
        sb.append(",rotation=");
        return Recorder$$ExternalSyntheticOutline1.m(this.rotation, "}", sb);
    }

    public final void translateTo(float f, float f2) {
        float f3 = -this.x;
        nonNaN(f);
        float f4 = f3 + f;
        float f5 = -this.y;
        nonNaN(f2);
        this.matrix.postTranslate(f4, f5 + f2);
        updateFromMatrix(false, false);
    }

    public final void updateFromMatrix(boolean z, boolean z2) {
        Matrix matrix = this.matrix;
        float[] fArr = this.matrixValues;
        matrix.getValues(fArr);
        float f = fArr[2];
        nonNaN(f);
        this.x = f;
        float f2 = fArr[5];
        nonNaN(f2);
        this.y = f2;
        if (z) {
            float hypot = (float) Math.hypot(fArr[1], fArr[4]);
            nonNaN(hypot);
            this.zoom = hypot;
        }
        if (z2) {
            float degrees = (float) Math.toDegrees(Math.atan2(fArr[3], fArr[4]));
            nonNaN(degrees);
            this.rotation = degrees;
        }
    }

    public final void zoomTo(float f, float f2, float f3) {
        nonNaN(f);
        float f4 = f / this.zoom;
        nonNaN(f2);
        nonNaN(f3);
        this.matrix.postScale(f4, f4, f2, f3);
        updateFromMatrix(true, false);
    }

    public static boolean equals(float f, float f2) {
        return f >= f2 - 0.001f && f <= f2 + 0.001f;
    }

    public final void set(State state) {
        this.x = state.x;
        this.y = state.y;
        this.zoom = state.zoom;
        this.rotation = state.rotation;
        this.matrix.set(state.matrix);
    }
}
