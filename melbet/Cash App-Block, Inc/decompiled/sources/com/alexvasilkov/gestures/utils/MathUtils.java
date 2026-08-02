package com.alexvasilkov.gestures.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.alexvasilkov.gestures.State;

/* loaded from: classes3.dex */
public abstract class MathUtils {
    public static final Matrix tmpMatrix = new Matrix();
    public static final Matrix tmpMatrixInverse = new Matrix();
    public static final RectF tmpRect = new RectF();

    public static void interpolate(State state, State state2, float f, float f2, State state3, float f3, float f4, float f5) {
        float interpolate;
        state.set(state2);
        Matrix matrix = state.matrix;
        if (!State.equals(state2.zoom, state3.zoom)) {
            state.zoomTo(interpolate(state2.zoom, state3.zoom, f5), f, f2);
        }
        float f6 = state2.rotation;
        float f7 = state3.rotation;
        if (Math.abs(f6 - f7) <= 180.0f) {
            if (!State.equals(f6, f7)) {
                interpolate = interpolate(f6, f7, f5);
            }
            interpolate = Float.NaN;
        } else {
            if (f6 < RecyclerView.DECELERATION_RATE) {
                f6 += 360.0f;
            }
            if (f7 < RecyclerView.DECELERATION_RATE) {
                f7 += 360.0f;
            }
            if (!State.equals(f6, f7)) {
                interpolate = interpolate(f6, f7, f5);
            }
            interpolate = Float.NaN;
        }
        if (!Float.isNaN(interpolate)) {
            float f8 = -state.rotation;
            State.nonNaN(interpolate);
            State.nonNaN(f);
            State.nonNaN(f2);
            matrix.postRotate(f8 + interpolate, f, f2);
            state.updateFromMatrix(false, true);
        }
        float interpolate2 = interpolate(RecyclerView.DECELERATION_RATE, f3 - f, f5);
        float interpolate3 = interpolate(RecyclerView.DECELERATION_RATE, f4 - f2, f5);
        State.nonNaN(interpolate2);
        State.nonNaN(interpolate3);
        matrix.postTranslate(interpolate2, interpolate3);
        state.updateFromMatrix(false, false);
    }

    public static void mapIntRect(Matrix matrix, Rect rect) {
        RectF rectF = tmpRect;
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public static float interpolate(float f, float f2, float f3) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(f2, f, f3, f);
    }
}
