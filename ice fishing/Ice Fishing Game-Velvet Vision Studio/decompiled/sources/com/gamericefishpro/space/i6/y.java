package com.gamericefishpro.space.i6;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class y extends com.gamericefishpro.space.d9.h {
    public static boolean i = true;
    public static boolean j = true;
    public static boolean k = true;
    public static boolean l = true;

    @Override // com.gamericefishpro.space.d9.h
    public void O(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.O(view, i2);
        } else if (l) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                l = false;
            }
        }
    }

    public void T(View view, int i2, int i3, int i4, int i5) {
        if (k) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }

    public void U(View view, Matrix matrix) {
        if (i) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    public void V(View view, Matrix matrix) {
        if (j) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
    }
}
