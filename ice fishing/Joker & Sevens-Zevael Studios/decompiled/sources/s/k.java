package s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6295a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f6296b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f6297c;

    /* renamed from: d, reason: collision with root package name */
    public int f6298d;

    /* renamed from: e, reason: collision with root package name */
    public int f6299e;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i10) {
        int i11;
        int hashCode = Integer.hashCode(i10) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f6298d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f6295a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j3 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j6 = (i13 * 72340172838076673L) ^ j3;
            long j10 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i11 = ((Long.numberOfTrailingZeros(j10) >> 3) + i15) & i14;
                if (this.f6296b[i11] == i10) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        return i11 >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i10) {
        int i11;
        int hashCode = Integer.hashCode(i10) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 & 127;
        int i14 = this.f6298d;
        int i15 = (i12 >>> 7) & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f6295a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j3 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j6 = (i13 * 72340172838076673L) ^ j3;
            long j10 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j10 == 0) {
                    break;
                }
                i11 = ((Long.numberOfTrailingZeros(j10) >> 3) + i15) & i14;
                if (this.f6296b[i11] == i10) {
                    break loop0;
                }
                j10 &= j10 - 1;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
        if (i11 >= 0) {
            return this.f6297c[i11];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f6299e != this.f6299e) {
            return false;
        }
        int[] iArr = this.f6296b;
        Object[] objArr = this.f6297c;
        long[] jArr = this.f6295a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            loop0: while (true) {
                long j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j3) < 128) {
                            int i13 = (i10 << 3) + i12;
                            int i14 = iArr[i13];
                            Object obj2 = objArr[i13];
                            if (obj2 == null) {
                                if (kVar.b(i14) != null || !kVar.a(i14)) {
                                    break loop0;
                                }
                            } else if (!obj2.equals(kVar.b(i14))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.f6296b;
        Object[] objArr = this.f6297c;
        long[] jArr = this.f6295a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j3 = jArr[i10];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j3) < 128) {
                        int i14 = (i10 << 3) + i13;
                        int i15 = iArr[i14];
                        Object obj = objArr[i14];
                        i11 += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i15);
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
        if (this.f6299e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f6296b;
        Object[] objArr = this.f6297c;
        long[] jArr = this.f6295a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j3 = jArr[i10];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j3) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr[i14];
                            Object obj = objArr[i14];
                            sb.append(i15);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i11++;
                            if (i11 < this.f6299e) {
                                sb.append(", ");
                            }
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
        sb.append('}');
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }
}
