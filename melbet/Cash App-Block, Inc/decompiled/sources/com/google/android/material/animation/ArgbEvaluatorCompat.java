package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes4.dex */
public final class ArgbEvaluatorCompat implements TypeEvaluator {
    public static final ArgbEvaluatorCompat instance = new ArgbEvaluatorCompat();

    public static Integer evaluate(Integer num, Integer num2, float f) {
        int intValue = num.intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float f3 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float m = CameraState$Type$EnumUnboxingLocalUtility.m(f3, f2, f, f2);
        float m2 = CameraState$Type$EnumUnboxingLocalUtility.m(pow4, pow, f, pow);
        float m3 = CameraState$Type$EnumUnboxingLocalUtility.m(pow5, pow2, f, pow2);
        float m4 = CameraState$Type$EnumUnboxingLocalUtility.m(pow6, pow3, f, pow3);
        float pow7 = ((float) Math.pow(m2, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(m3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(m4, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(m * 255.0f) << 24) | (Math.round(pow8) << 8));
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate((Integer) obj, (Integer) obj2, f);
    }
}
