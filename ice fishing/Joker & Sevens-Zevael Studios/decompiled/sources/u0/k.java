package u0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f6680a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f6681b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f6682c;

    public k(int i10, long[] jArr, Object[] objArr) {
        this.f6680a = i10;
        this.f6681b = jArr;
        this.f6682c = objArr;
    }

    public final int a(long j3) {
        int i10 = this.f6680a - 1;
        if (i10 != -1) {
            long[] jArr = this.f6681b;
            int i11 = 0;
            if (i10 != 0) {
                while (i11 <= i10) {
                    int i12 = (i11 + i10) >>> 1;
                    long j6 = jArr[i12] - j3;
                    if (j6 < 0) {
                        i11 = i12 + 1;
                    } else {
                        if (j6 <= 0) {
                            return i12;
                        }
                        i10 = i12 - 1;
                    }
                }
                return -(i11 + 1);
            }
            long j10 = jArr[0];
            if (j10 == j3) {
                return 0;
            }
            if (j10 > j3) {
                return -2;
            }
        }
        return -1;
    }

    public final k b(long j3, Object obj) {
        long[] jArr;
        int i10;
        Object[] objArr = this.f6682c;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr2 = new long[i13];
        Object[] objArr2 = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                jArr = this.f6681b;
                i10 = this.f6680a;
                if (i11 >= i13 || i14 >= i10) {
                    break;
                }
                long j6 = jArr[i14];
                Object obj3 = objArr[i14];
                if (j6 > j3) {
                    jArr2[i11] = j3;
                    objArr2[i11] = obj;
                    i11++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i11] = j6;
                    objArr2[i11] = obj3;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr2[i12] = j3;
                objArr2[i12] = obj;
            } else {
                while (i11 < i13) {
                    long j10 = jArr[i14];
                    Object obj4 = objArr[i14];
                    if (obj4 != null) {
                        jArr2[i11] = j10;
                        objArr2[i11] = obj4;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr2[0] = j3;
            objArr2[0] = obj;
        }
        return new k(i13, jArr2, objArr2);
    }
}
