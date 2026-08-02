package com.google.android.material.motion;

import android.animation.TypeEvaluator;
import com.google.android.material.animation.AnimationUtils;

/* loaded from: classes4.dex */
public final /* synthetic */ class MaterialMainContainerBackHelper$$ExternalSyntheticLambda0 implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        return new float[]{AnimationUtils.lerp(fArr[0], fArr2[0], f), AnimationUtils.lerp(fArr[1], fArr2[1], f), AnimationUtils.lerp(fArr[2], fArr2[2], f), AnimationUtils.lerp(fArr[3], fArr2[3], f), AnimationUtils.lerp(fArr[4], fArr2[4], f), AnimationUtils.lerp(fArr[5], fArr2[5], f), AnimationUtils.lerp(fArr[6], fArr2[6], f), AnimationUtils.lerp(fArr[7], fArr2[7], f)};
    }
}
