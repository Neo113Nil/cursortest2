package defpackage;

/* loaded from: classes.dex */
public final class xx7 extends per {
    public static final Object h = new Object();
    public long c;
    public int d;
    public cpi e;
    public Object f;
    public int g;

    public xx7(long j) {
        super(j);
        cpi cpiVar = uhj.a;
        cpiVar.getClass();
        this.e = cpiVar;
        this.f = h;
    }

    @Override // defpackage.per
    public final void a(per perVar) {
        perVar.getClass();
        xx7 xx7Var = (xx7) perVar;
        this.e = xx7Var.e;
        this.f = xx7Var.f;
        this.g = xx7Var.g;
    }

    @Override // defpackage.per
    public final per b(long j) {
        return new xx7(j);
    }

    public final boolean c(zx7 zx7Var, b2r b2rVar) {
        boolean z;
        boolean z2;
        Object obj = g2r.b;
        synchronized (obj) {
            z = true;
            if (this.c == b2rVar.g()) {
                if (this.d == b2rVar.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.f == h || (z2 && this.g != d(zx7Var, b2rVar))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = b2rVar.g();
            this.d = b2rVar.h();
        }
        return z;
    }

    public final int d(zx7 zx7Var, b2r b2rVar) {
        cpi cpiVar;
        int i;
        long[] jArr;
        int i2;
        long[] jArr2;
        int i3;
        int i4;
        per h2;
        synchronized (g2r.b) {
            cpiVar = this.e;
        }
        int i5 = 7;
        if (cpiVar.e == 0) {
            return 7;
        }
        eqi S = szf.S();
        Object[] objArr = S.a;
        int i6 = S.c;
        for (int i7 = 0; i7 < i6; i7++) {
            ((nq5) objArr[i7]).b();
        }
        try {
            Object[] objArr2 = cpiVar.b;
            int[] iArr = cpiVar.c;
            long[] jArr3 = cpiVar.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i8 = 0;
                while (true) {
                    long j = jArr3[i8];
                    if ((((~j) << i5) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                Object obj = objArr2[i12];
                                i3 = i5;
                                int i13 = iArr[i12];
                                i4 = i9;
                                mer merVar = (mer) obj;
                                if (i13 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (merVar instanceof zx7) {
                                        try {
                                            zx7 zx7Var2 = (zx7) merVar;
                                            h2 = zx7Var2.h((xx7) g2r.j(zx7Var2.d, b2rVar), b2rVar, false, zx7Var2.b);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = S.a;
                                            int i14 = S.c;
                                            for (int i15 = 0; i15 < i14; i15++) {
                                                ((nq5) objArr3[i15]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        h2 = g2r.j(merVar.g(), b2rVar);
                                    }
                                    jArr2 = jArr3;
                                    i = (((i * 31) + System.identityHashCode(h2)) * 31) + Long.hashCode(h2.a);
                                }
                            } else {
                                jArr2 = jArr3;
                                i3 = i5;
                                i4 = i9;
                            }
                            j >>= i4;
                            i11++;
                            i5 = i3;
                            jArr3 = jArr2;
                            i9 = i4;
                        }
                        jArr = jArr3;
                        i2 = i5;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i5;
                    }
                    if (i8 == length) {
                        i5 = i;
                        break;
                    }
                    i8++;
                    i5 = i2;
                    jArr3 = jArr;
                }
            }
            i = i5;
            Object[] objArr4 = S.a;
            int i16 = S.c;
            for (int i17 = 0; i17 < i16; i17++) {
                ((nq5) objArr4[i17]).a();
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
