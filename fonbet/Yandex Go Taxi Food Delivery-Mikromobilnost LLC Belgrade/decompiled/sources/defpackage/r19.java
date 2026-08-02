package defpackage;

/* loaded from: classes6.dex */
public final class r19 {
    public static float[][] a(float[][] fArr, float[][] fArr2) {
        int length = fArr.length;
        int length2 = fArr[0].length;
        int length3 = fArr2.length;
        int length4 = fArr2[0].length;
        if (length2 != length3) {
            ny61.g("Matrices cannot be multiplied due to incompatible dimensions.");
            return null;
        }
        float[][] fArr3 = new float[length][];
        for (int i = 0; i < length; i++) {
            fArr3[i] = new float[length4];
        }
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < length4; i3++) {
                for (int i4 = 0; i4 < length2; i4++) {
                    float[] fArr4 = fArr3[i2];
                    fArr4[i3] = (fArr[i2][i4] * fArr2[i4][i3]) + fArr4[i3];
                }
            }
        }
        return fArr3;
    }
}
