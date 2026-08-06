package defpackage;

/* loaded from: classes.dex */
public final class cl0 {
    public int F7NU4MC0GW;
    public int adDC3e2L;
    public int r1MBDhnF;
    public long[] IHQe1A4L2xu = defpackage.z41.IHQe1A4L2xu;
    public long[] oh6vYeIP = defpackage.uf0.IHQe1A4L2xu;

    public cl0(int i) {
        if (i >= 0) {
            r1MBDhnF(defpackage.z41.F7NU4MC0GW(i));
        } else {
            defpackage.db.fnWB2E7cs("Capacity must be a positive value.");
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
    public final boolean IHQe1A4L2xu(long j) {
        int i;
        int hashCode = java.lang.Long.hashCode(j) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.r1MBDhnF;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.IHQe1A4L2xu;
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
                if (this.oh6vYeIP[i] == j) {
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
        if (!(obj instanceof defpackage.cl0)) {
            return false;
        }
        defpackage.cl0 cl0Var = (defpackage.cl0) obj;
        if (cl0Var.F7NU4MC0GW != this.F7NU4MC0GW) {
            return false;
        }
        long[] jArr = this.oh6vYeIP;
        long[] jArr2 = this.IHQe1A4L2xu;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !cl0Var.IHQe1A4L2xu(jArr[(i << 3) + i3])) {
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

    public final int hashCode() {
        long[] jArr = this.oh6vYeIP;
        long[] jArr2 = this.IHQe1A4L2xu;
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

    public final int oh6vYeIP(int i) {
        int i2 = this.r1MBDhnF;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.IHQe1A4L2xu;
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

    public final void r1MBDhnF(int i) {
        long[] jArr;
        int max = i > 0 ? java.lang.Math.max(7, defpackage.z41.r1MBDhnF(i)) : 0;
        this.r1MBDhnF = max;
        if (max == 0) {
            jArr = defpackage.z41.IHQe1A4L2xu;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            java.util.Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.IHQe1A4L2xu = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.adDC3e2L = defpackage.z41.IHQe1A4L2xu(this.r1MBDhnF) - this.F7NU4MC0GW;
        this.oh6vYeIP = new long[max];
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "[");
        long[] jArr = this.oh6vYeIP;
        long[] jArr2 = this.IHQe1A4L2xu;
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
