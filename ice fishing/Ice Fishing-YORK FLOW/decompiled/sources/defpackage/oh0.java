package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class oh0 extends defpackage.xc1 {
    public final long JhCgjQRTAOCT;
    public final long WDYagTQQm9ns;
    public final java.util.List fWTAfUmVKrZq;

    public oh0(java.util.List list, long j, long j2) {
        this.fWTAfUmVKrZq = list;
        this.JhCgjQRTAOCT = j;
        this.WDYagTQQm9ns = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.oh0)) {
            return false;
        }
        defpackage.oh0 oh0Var = (defpackage.oh0) obj;
        return this.fWTAfUmVKrZq.equals(oh0Var.fWTAfUmVKrZq) && defpackage.ws0.giKS3J6vZuNy(this.JhCgjQRTAOCT, oh0Var.JhCgjQRTAOCT) && defpackage.ws0.giKS3J6vZuNy(this.WDYagTQQm9ns, oh0Var.WDYagTQQm9ns);
    }

    @Override // defpackage.xc1
    public final android.graphics.Shader giKS3J6vZuNy(long j) {
        int i;
        int[] iArr;
        int i2;
        float[] fArr;
        long j2 = this.JhCgjQRTAOCT;
        char c = ' ';
        int i3 = (int) (j2 >> 32);
        if (java.lang.Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat = java.lang.Float.intBitsToFloat(i3);
        long j3 = 4294967295L;
        int i4 = (int) (j2 & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i4);
        long j4 = this.WDYagTQQm9ns;
        int i5 = (int) (j4 >> 32);
        if (java.lang.Float.intBitsToFloat(i5) == Float.POSITIVE_INFINITY) {
            i5 = (int) (j >> 32);
        }
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat(i5);
        int i6 = (int) (j4 & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i6) == Float.POSITIVE_INFINITY) {
            i6 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat(i6);
        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (java.lang.Float.floatToRawIntBits(intBitsToFloat3) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        java.util.List list = this.fWTAfUmVKrZq;
        if (list.size() < 2) {
            defpackage.h7.w7APNrr0aGRc("colors must have length of at least 2 if colorStops is omitted.");
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            i = 0;
        } else {
            int size = list.size() - 1;
            int i7 = 1;
            i = 0;
            while (i7 < size) {
                char c2 = c;
                long j5 = j3;
                if (defpackage.pf.JhCgjQRTAOCT(((defpackage.pf) list.get(i7)).ZpBGe2uQfcn8) == 0.0f) {
                    i++;
                }
                i7++;
                c = c2;
                j3 = j5;
            }
        }
        char c3 = c;
        long j6 = j3;
        float intBitsToFloat5 = java.lang.Float.intBitsToFloat((int) (floatToRawIntBits >> c3));
        float intBitsToFloat6 = java.lang.Float.intBitsToFloat((int) (floatToRawIntBits & j6));
        float intBitsToFloat7 = java.lang.Float.intBitsToFloat((int) (floatToRawIntBits2 >> c3));
        float intBitsToFloat8 = java.lang.Float.intBitsToFloat((int) (floatToRawIntBits2 & j6));
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            int size2 = list.size();
            iArr = new int[size2];
            for (int i8 = 0; i8 < size2; i8++) {
                iArr[i8] = defpackage.ok0.PS16moFv2oLu(((defpackage.pf) list.get(i8)).ZpBGe2uQfcn8);
            }
        } else {
            iArr = new int[list.size() + i];
            int size3 = list.size() - 1;
            int size4 = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size4; i10++) {
                long j7 = ((defpackage.pf) list.get(i10)).ZpBGe2uQfcn8;
                if (defpackage.pf.JhCgjQRTAOCT(j7) == 0.0f) {
                    if (i10 == 0) {
                        i2 = i9 + 1;
                        iArr[i9] = defpackage.ok0.PS16moFv2oLu(defpackage.pf.giKS3J6vZuNy(((defpackage.pf) list.get(1)).ZpBGe2uQfcn8, 0.0f));
                    } else if (i10 == size3) {
                        i2 = i9 + 1;
                        iArr[i9] = defpackage.ok0.PS16moFv2oLu(defpackage.pf.giKS3J6vZuNy(((defpackage.pf) list.get(i10 - 1)).ZpBGe2uQfcn8, 0.0f));
                    } else {
                        int i11 = i9 + 1;
                        iArr[i9] = defpackage.ok0.PS16moFv2oLu(defpackage.pf.giKS3J6vZuNy(((defpackage.pf) list.get(i10 - 1)).ZpBGe2uQfcn8, 0.0f));
                        i9 += 2;
                        iArr[i11] = defpackage.ok0.PS16moFv2oLu(defpackage.pf.giKS3J6vZuNy(((defpackage.pf) list.get(i10 + 1)).ZpBGe2uQfcn8, 0.0f));
                    }
                    i9 = i2;
                } else {
                    iArr[i9] = defpackage.ok0.PS16moFv2oLu(j7);
                    i9++;
                }
            }
        }
        int[] iArr2 = iArr;
        if (i == 0) {
            fArr = null;
        } else {
            float[] fArr2 = new float[list.size() + i];
            fArr2[0] = 0.0f;
            int size5 = list.size() - 1;
            int i12 = 1;
            for (int i13 = 1; i13 < size5; i13++) {
                long j8 = ((defpackage.pf) list.get(i13)).ZpBGe2uQfcn8;
                float size6 = i13 / (list.size() - 1);
                int i14 = i12 + 1;
                fArr2[i12] = size6;
                if (defpackage.pf.JhCgjQRTAOCT(j8) == 0.0f) {
                    i12 += 2;
                    fArr2[i14] = size6;
                } else {
                    i12 = i14;
                }
            }
            fArr2[i12] = 1.0f;
            fArr = fArr2;
        }
        return new android.graphics.LinearGradient(intBitsToFloat5, intBitsToFloat6, intBitsToFloat7, intBitsToFloat8, iArr2, fArr, android.graphics.Shader.TileMode.CLAMP);
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(0) + defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(this.fWTAfUmVKrZq.hashCode() * 961, 31, this.JhCgjQRTAOCT), 31, this.WDYagTQQm9ns);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        long j = this.JhCgjQRTAOCT;
        java.lang.String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((java.lang.Object) defpackage.ws0.QiMR8OkAhezm(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.WDYagTQQm9ns;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((java.lang.Object) defpackage.ws0.QiMR8OkAhezm(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.fWTAfUmVKrZq + ", stops=null, " + str + str2 + "tileMode=" + ((java.lang.Object) "Clamp") + ')';
    }
}
