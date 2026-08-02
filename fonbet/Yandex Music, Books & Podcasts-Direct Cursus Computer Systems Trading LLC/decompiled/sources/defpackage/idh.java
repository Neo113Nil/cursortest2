package defpackage;

import android.animation.TypeEvaluator;

/* loaded from: classes3.dex */
public final /* synthetic */ class idh implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        return new float[]{wm0.a(fArr[0], fArr2[0], f), wm0.a(fArr[1], fArr2[1], f), wm0.a(fArr[2], fArr2[2], f), wm0.a(fArr[3], fArr2[3], f), wm0.a(fArr[4], fArr2[4], f), wm0.a(fArr[5], fArr2[5], f), wm0.a(fArr[6], fArr2[6], f), wm0.a(fArr[7], fArr2[7], f)};
    }
}
