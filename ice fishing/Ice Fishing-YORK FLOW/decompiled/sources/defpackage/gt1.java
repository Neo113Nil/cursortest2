package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class gt1 {
    public static final /* synthetic */ int ZpBGe2uQfcn8 = 0;

    static {
        char c;
        int i;
        defpackage.pa1[] pa1VarArr;
        char c2;
        boolean z;
        float[][] fArr = {new float[2], new float[2]};
        int i2 = new int[2][0];
        char c3 = 3;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    c = 2;
                } else if (i2 == 4) {
                    c = 4;
                } else if (i2 == 5) {
                    c = 5;
                }
            }
            c = 1;
        } else {
            c = 3;
        }
        float[] fArr2 = fArr[0];
        float[] fArr3 = fArr[1];
        int length = (fArr2.length % 2) + (fArr2.length / 2);
        defpackage.pa1[] pa1VarArr2 = new defpackage.pa1[length];
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 * 2;
            float f = fArr2[i5];
            int i6 = i5 + 1;
            float f2 = fArr2[i6];
            float f3 = fArr3[i5];
            float f4 = fArr3[i6];
            defpackage.pa1 pa1Var = new defpackage.pa1(15);
            float f5 = f3 - f;
            float f6 = f4 - f2;
            float[] fArr4 = new float[101];
            if (c != c3 && java.lang.Math.abs(f5) >= 0.001f && java.lang.Math.abs(f6) >= 0.001f) {
                float f7 = f2 - f4;
                float[] fArr5 = defpackage.i61.ZpBGe2uQfcn8;
                int i7 = i3;
                i = i7;
                float f8 = f7;
                float f9 = 0.0f;
                float f10 = 0.0f;
                while (true) {
                    double d = (float) (((i7 * 90.0d) / 90.0d) * 0.017453292519943295d);
                    float f11 = f7;
                    float sin = ((float) java.lang.Math.sin(d)) * f5;
                    float cos = f11 * ((float) java.lang.Math.cos(d));
                    float f12 = cos - f8;
                    pa1VarArr = pa1VarArr2;
                    c2 = c;
                    f9 += (float) java.lang.Math.hypot(sin - f10, f12);
                    fArr5[i7] = f9;
                    if (i7 == 90) {
                        break;
                    }
                    i7++;
                    f10 = sin;
                    c = c2;
                    pa1VarArr2 = pa1VarArr;
                    f8 = cos;
                    f7 = f11;
                }
                int i8 = i;
                while (true) {
                    fArr5[i8] = fArr5[i8] / f9;
                    if (i8 == 90) {
                        break;
                    } else {
                        i8++;
                    }
                }
                for (int i9 = 0; i9 < 101; i9++) {
                    float f13 = i9 / 100.0f;
                    int binarySearch = java.util.Arrays.binarySearch(fArr5, 0, 91, f13);
                    if (binarySearch >= 0) {
                        fArr4[i9] = binarySearch / 90.0f;
                    } else if (binarySearch == -1) {
                        fArr4[i9] = 0.0f;
                    } else {
                        int i10 = -binarySearch;
                        int i11 = i10 - 2;
                        float f14 = i11;
                        float f15 = fArr5[i11];
                        fArr4[i9] = (((f13 - f15) / (fArr5[i10 - 1] - f15)) + f14) / 90.0f;
                    }
                }
                z = false;
            } else {
                pa1VarArr = pa1VarArr2;
                c2 = c;
                i = i3;
                z = false;
                java.lang.Math.hypot(f6, f5);
            }
            pa1VarArr[i4] = pa1Var;
            i4++;
            c = c2;
            i3 = i;
            pa1VarArr2 = pa1VarArr;
            c3 = 3;
        }
    }
}
