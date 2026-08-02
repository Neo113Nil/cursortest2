package com.google.android.filament;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public abstract class Colors {
    public static float[] cct() {
        float[] fArr = new float[3];
        nCct(7500.0f, fArr);
        return fArr;
    }

    private static native void nCct(float f, float[] fArr);

    public static void toLinear(float[] fArr) {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(1);
        int i = 0;
        if (ordinal == 0) {
            while (i < 3) {
                float f = fArr[i];
                fArr[i] = f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
                i++;
            }
            return;
        }
        if (ordinal != 1) {
            return;
        }
        while (i < 3) {
            fArr[i] = (float) Math.sqrt(fArr[i]);
            i++;
        }
    }
}
