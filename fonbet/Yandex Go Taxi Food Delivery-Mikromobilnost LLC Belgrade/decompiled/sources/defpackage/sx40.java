package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class sx40 {
    public final long[] a;
    public final float[] b;
    public final int c;

    public sx40(int i) {
        long[] jArr = cmm0.a;
        this.a = jArr;
        this.b = oor.a;
        if (i < 0) {
            xva1.b("Capacity must be a positive value.");
            throw null;
        }
        int e = cmm0.e(i);
        int max = e > 0 ? Math.max(7, cmm0.d(e)) : 0;
        this.c = max;
        if (max != 0) {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.b = new float[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        if (((r2 & ((~r2) << 6)) & r19) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        long[] jArr;
        int i;
        boolean z2;
        long[] jArr2;
        ?? r17;
        int i2;
        char c;
        long j;
        int i3;
        sx40 sx40Var = this;
        boolean z3 = true;
        if (obj == sx40Var) {
            return true;
        }
        int i4 = 0;
        if (!(obj instanceof sx40)) {
            return false;
        }
        sx40 sx40Var2 = (sx40) obj;
        long[] jArr3 = sx40Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return true;
        }
        int i5 = 0;
        while (true) {
            long j2 = jArr3[i5];
            char c2 = 7;
            long j3 = -9187201950435737472L;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = i4;
                while (i8 < i7) {
                    if ((255 & j2) < 128) {
                        z2 = z3;
                        float f = sx40Var.b[(i5 << 3) + i8];
                        int hashCode = Float.hashCode(f) * (-862048943);
                        int i9 = hashCode ^ (hashCode << 16);
                        r17 = i4;
                        int i10 = i9 & HProv.PP_VERSION_TIMESTAMP;
                        c = c2;
                        int i11 = sx40Var2.c;
                        int i12 = (i9 >>> 7) & i11;
                        j = j3;
                        int i13 = r17 == true ? 1 : 0;
                        while (true) {
                            long[] jArr4 = sx40Var2.a;
                            int i14 = i12 >> 3;
                            i2 = i6;
                            int i15 = (i12 & 7) << 3;
                            float f2 = f;
                            jArr2 = jArr3;
                            long j4 = (jArr4[i14] >>> i15) | (((-i15) >> 63) & (jArr4[i14 + 1] << (64 - i15)));
                            long j5 = (i10 * 72340172838076673L) ^ j4;
                            long j6 = (j5 - 72340172838076673L) & (~j5) & j;
                            while (true) {
                                if (j6 == 0) {
                                    break;
                                }
                                i3 = ((Long.numberOfTrailingZeros(j6) >> 3) + i12) & i11;
                                if (sx40Var2.b[i3] == f2) {
                                    break;
                                }
                                j6 &= j6 - 1;
                            }
                            i13 += 8;
                            i12 = (i12 + i13) & i11;
                            jArr3 = jArr2;
                            i6 = i2;
                            f = f2;
                        }
                        if (i3 < 0) {
                            return r17;
                        }
                    } else {
                        z2 = z3;
                        jArr2 = jArr3;
                        r17 = i4;
                        i2 = i6;
                        c = c2;
                        j = j3;
                    }
                    j2 >>= i2;
                    i8++;
                    sx40Var = this;
                    c2 = c;
                    z3 = z2;
                    i4 = r17;
                    j3 = j;
                    jArr3 = jArr2;
                    i6 = i2;
                }
                z = z3;
                jArr = jArr3;
                i = i4;
                if (i7 != i6) {
                    return z;
                }
            } else {
                z = z3;
                jArr = jArr3;
                i = i4;
            }
            if (i5 == length) {
                return z;
            }
            i5++;
            sx40Var = this;
            z3 = z;
            i4 = i;
            jArr3 = jArr;
        }
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        i2 = Float.hashCode(this.b[(i << 3) + i4]) + i2;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            if (i3 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j) < 128) {
                                float f = this.b[(i << 3) + i4];
                                if (i2 != 0) {
                                    sb.append((CharSequence) Extension.FIX_SPACE);
                                }
                                if (i2 == -1) {
                                    sb.append((CharSequence) "...");
                                    break loop0;
                                }
                                sb.append(f);
                                i2++;
                            }
                            j >>= 8;
                            i4++;
                        }
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public sx40() {
        this(6);
    }
}
