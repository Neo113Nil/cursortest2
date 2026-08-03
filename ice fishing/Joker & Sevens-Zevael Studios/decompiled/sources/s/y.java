package s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6357a = o0.f6312a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f6358b = n.f6306a;

    /* renamed from: c, reason: collision with root package name */
    public int f6359c;

    /* renamed from: d, reason: collision with root package name */
    public int f6360d;

    /* renamed from: e, reason: collision with root package name */
    public int f6361e;

    public y(int i10) {
        if (i10 >= 0) {
            c(o0.d(i10));
        } else {
            t.a.c("Capacity must be a positive value.");
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
    public final boolean a(long j3) {
        int i10;
        int hashCode = Long.hashCode(j3) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f6359c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f6357a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j6 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (i12 * 72340172838076673L) ^ j6;
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i10 = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f6358b[i10] == j3) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        return i10 >= 0;
    }

    public final int b(int i10) {
        int i11 = this.f6359c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f6357a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j3 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j6 = j3 & ((~j3) << 7) & (-9187201950435737472L);
            if (j6 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j6) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final void c(int i10) {
        long[] jArr;
        int max = i10 > 0 ? Math.max(7, o0.c(i10)) : 0;
        this.f6359c = max;
        if (max == 0) {
            jArr = o0.f6312a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            bc.l.W(jArr, -9187201950435737472L);
        }
        this.f6357a = jArr;
        int i11 = max >> 3;
        long j3 = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j3)) | j3;
        this.f6361e = o0.a(this.f6359c) - this.f6360d;
        this.f6358b = new long[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (yVar.f6360d != this.f6360d) {
            return false;
        }
        long[] jArr = this.f6358b;
        long[] jArr2 = this.f6357a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j3 = jArr2[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128 && !yVar.a(jArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j3 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.f6358b;
        long[] jArr2 = this.f6357a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j3 = jArr2[i10];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j3) < 128) {
                        i11 = Long.hashCode(jArr[(i10 << 3) + i13]) + i11;
                    }
                    j3 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f6358b;
        long[] jArr2 = this.f6357a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                long j3 = jArr2[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j3) < 128) {
                            long j6 = jArr[(i10 << 3) + i13];
                            if (i11 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i11 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(j6);
                            i11++;
                        }
                        j3 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }
}
