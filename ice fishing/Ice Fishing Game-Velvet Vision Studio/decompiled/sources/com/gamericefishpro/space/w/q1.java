package com.gamericefishpro.space.w;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        char c;
        int i;
        com.gamericefishpro.space.u4.f[] fVarArr;
        char c2;
        boolean z;
        float[][] fArr = {new float[2], new float[2]};
        boolean z2 = false;
        int i2 = new int[2][0];
        char c3 = 3;
        int i3 = 1;
        if (i2 == 0) {
            c = 3;
        } else if (i2 == 1) {
            c = 1;
        } else if (i2 == 2 || i2 == 3) {
            c = 2;
        } else if (i2 == 4) {
            c = 4;
        } else if (i2 != 5) {
            c = 1;
        } else {
            c = 5;
        }
        float[] fArr2 = fArr[0];
        float[] fArr3 = fArr[1];
        int length = (fArr2.length % 2) + (fArr2.length / 2);
        com.gamericefishpro.space.u4.f[] fVarArr2 = new com.gamericefishpro.space.u4.f[length];
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 * 2;
            float f = fArr2[i5];
            int i6 = i5 + 1;
            float f2 = fArr2[i6];
            float f3 = fArr3[i5];
            float f4 = fArr3[i6];
            com.gamericefishpro.space.u4.f fVar = new com.gamericefishpro.space.u4.f();
            float f5 = f3 - f;
            float f6 = f4 - f2;
            float[] fArr4 = new float[101];
            if (c != c3 && Math.abs(f5) >= 0.001f && Math.abs(f6) >= 0.001f) {
                float f7 = f2 - f4;
                float[] fArr5 = c.i;
                int i7 = 90;
                float f8 = 90;
                i = i3;
                float f9 = f7;
                float fHypot = 0.0f;
                float f10 = 0.0f;
                while (true) {
                    fVarArr = fVarArr2;
                    c2 = c;
                    double radians = (float) Math.toRadians((((double) i3) * 90.0d) / ((double) i7));
                    float fSin = ((float) Math.sin(radians)) * f5;
                    float fCos = ((float) Math.cos(radians)) * f7;
                    float f11 = f7;
                    float f12 = fCos - f9;
                    f9 = fCos;
                    fHypot += (float) Math.hypot(fSin - f10, f12);
                    fArr5[i3] = fHypot;
                    if (i3 == 90) {
                        break;
                    }
                    i3++;
                    i7 = 90;
                    f10 = fSin;
                    f7 = f11;
                    c = c2;
                    fVarArr2 = fVarArr;
                }
                int i8 = i;
                while (true) {
                    fArr5[i8] = fArr5[i8] / fHypot;
                    if (i8 == 90) {
                        break;
                    } else {
                        i8++;
                    }
                }
                for (int i9 = 0; i9 < 101; i9++) {
                    float f13 = i9 / 100.0f;
                    Intrinsics.checkNotNullParameter(fArr5, "<this>");
                    int iBinarySearch = Arrays.binarySearch(fArr5, 0, 91, f13);
                    if (iBinarySearch >= 0) {
                        fArr4[i9] = iBinarySearch / f8;
                    } else if (iBinarySearch == -1) {
                        fArr4[i9] = 0.0f;
                    } else {
                        int i10 = -iBinarySearch;
                        int i11 = i10 - 2;
                        float f14 = i11;
                        float f15 = fArr5[i11];
                        fArr4[i9] = (((f13 - f15) / (fArr5[i10 - 1] - f15)) + f14) / f8;
                    }
                }
                z = false;
            } else {
                fVarArr = fVarArr2;
                c2 = c;
                i = i3;
                z = z2;
                Math.hypot(f6, f5);
            }
            fVarArr[i4] = fVar;
            i4++;
            z2 = z;
            i3 = i;
            c = c2;
            fVarArr2 = fVarArr;
            c3 = 3;
        }
    }
}
