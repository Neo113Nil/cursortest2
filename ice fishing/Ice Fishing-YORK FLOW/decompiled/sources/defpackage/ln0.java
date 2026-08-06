package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ln0 {
    public int JhCgjQRTAOCT;
    public int WDYagTQQm9ns;
    public int fWTAfUmVKrZq;
    public long[] ZpBGe2uQfcn8 = defpackage.m81.ZpBGe2uQfcn8;
    public long[] giKS3J6vZuNy = defpackage.fj0.ZpBGe2uQfcn8;

    public ln0(int i) {
        if (i >= 0) {
            fWTAfUmVKrZq(defpackage.m81.JhCgjQRTAOCT(i));
        } else {
            defpackage.h7.w7APNrr0aGRc("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ZpBGe2uQfcn8(long j) {
        int i;
        int hashCode = java.lang.Long.hashCode(j) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.fWTAfUmVKrZq;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.ZpBGe2uQfcn8;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((java.lang.Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.giKS3J6vZuNy[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ln0)) {
            return false;
        }
        defpackage.ln0 ln0Var = (defpackage.ln0) obj;
        if (ln0Var.JhCgjQRTAOCT != this.JhCgjQRTAOCT) {
            return false;
        }
        long[] jArr = this.giKS3J6vZuNy;
        long[] jArr2 = this.ZpBGe2uQfcn8;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !ln0Var.ZpBGe2uQfcn8(jArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final void fWTAfUmVKrZq(int i) {
        long[] jArr;
        int max = i > 0 ? java.lang.Math.max(7, defpackage.m81.fWTAfUmVKrZq(i)) : 0;
        this.fWTAfUmVKrZq = max;
        if (max == 0) {
            jArr = defpackage.m81.ZpBGe2uQfcn8;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            java.util.Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.ZpBGe2uQfcn8 = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.WDYagTQQm9ns = defpackage.m81.ZpBGe2uQfcn8(this.fWTAfUmVKrZq) - this.JhCgjQRTAOCT;
        this.giKS3J6vZuNy = new long[max];
    }

    public final int giKS3J6vZuNy(int i) {
        int i2 = this.fWTAfUmVKrZq;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.ZpBGe2uQfcn8;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (java.lang.Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int hashCode() {
        long[] jArr = this.giKS3J6vZuNy;
        long[] jArr2 = this.ZpBGe2uQfcn8;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        i2 = java.lang.Long.hashCode(jArr[(i << 3) + i4]) + i2;
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "[");
        long[] jArr = this.giKS3J6vZuNy;
        long[] jArr2 = this.ZpBGe2uQfcn8;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((java.lang.CharSequence) ", ");
                            }
                            sb.append(j2);
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((java.lang.CharSequence) "]");
        return sb.toString();
    }
}
