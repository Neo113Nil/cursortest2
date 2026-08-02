package com.airbnb.lottie.utils;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class Transform3D {
    public static void apply3DRotations(Matrix matrix, float f, float f2, float f3, float f4, float f5) {
        if (f3 != RecyclerView.DECELERATION_RATE) {
            matrix.preRotate(f3);
        }
        if (f2 != RecyclerView.DECELERATION_RATE) {
            applyYRotation(matrix, f5);
        }
        if (f != RecyclerView.DECELERATION_RATE) {
            applyXRotation(matrix, f4);
        }
    }

    public static void applyTransform(Matrix matrix, PointF pointF, PointF pointF2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        matrix.reset();
        if (pointF2 != null) {
            float f8 = pointF2.x;
            if (f8 != RecyclerView.DECELERATION_RATE || pointF2.y != RecyclerView.DECELERATION_RATE) {
                matrix.preTranslate(f8, pointF2.y);
            }
        }
        if (f5 != RecyclerView.DECELERATION_RATE) {
            matrix.preRotate(f5);
        }
        if (f4 != RecyclerView.DECELERATION_RATE) {
            applyYRotation(matrix, f7);
        }
        if (f3 != RecyclerView.DECELERATION_RATE) {
            applyXRotation(matrix, f6);
        }
        if (f != 1.0f || f2 != 1.0f) {
            matrix.preScale(f, f2);
        }
        if (pointF != null) {
            float f9 = pointF.x;
            if (f9 == RecyclerView.DECELERATION_RATE && pointF.y == RecyclerView.DECELERATION_RATE) {
                return;
            }
            matrix.preTranslate(-f9, -pointF.y);
        }
    }

    private static void applyXRotation(Matrix matrix, float f) {
        matrix.preScale(1.0f, f);
    }

    private static void applyYRotation(Matrix matrix, float f) {
        matrix.preScale(f, 1.0f);
    }

    public static boolean has3DRotation(Float f, Float f2, Float f3) {
        if (f != null && f.floatValue() != RecyclerView.DECELERATION_RATE) {
            return true;
        }
        if (f2 == null || f2.floatValue() == RecyclerView.DECELERATION_RATE) {
            return (f3 == null || f3.floatValue() == RecyclerView.DECELERATION_RATE) ? false : true;
        }
        return true;
    }
}
