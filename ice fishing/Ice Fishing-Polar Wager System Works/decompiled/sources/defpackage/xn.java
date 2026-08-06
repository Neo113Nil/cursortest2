package defpackage;

/* loaded from: classes.dex */
public final class xn extends defpackage.mc1 {
    public static final java.lang.Object EXtogiMhuM = new java.lang.Object();
    public int AARZUJiTa;
    public int F7NU4MC0GW;
    public defpackage.fl0 adDC3e2L;
    public long r1MBDhnF;
    public java.lang.Object xiZrDbcSW0;

    public xn(long j) {
        super(j);
        defpackage.fl0 fl0Var = defpackage.up0.IHQe1A4L2xu;
        fl0Var.getClass();
        this.adDC3e2L = fl0Var;
        this.xiZrDbcSW0 = EXtogiMhuM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [xn] */
    /* JADX WARN: Type inference failed for: r13v5, types: [mc1] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, mc1] */
    public final int F7NU4MC0GW(defpackage.yn ynVar, defpackage.oa1 oa1Var) {
        defpackage.fl0 fl0Var;
        int i;
        long[] jArr;
        int i2;
        java.lang.Object[] objArr;
        long[] jArr2;
        int i3;
        java.lang.Object[] objArr2;
        long j;
        long j2;
        int i4;
        ?? riuEU0zW4;
        synchronized (defpackage.wa1.r1MBDhnF) {
            fl0Var = this.adDC3e2L;
        }
        int i5 = 7;
        if (fl0Var.adDC3e2L == 0) {
            return 7;
        }
        defpackage.xl0 cnag84Bm = defpackage.c80.cnag84Bm();
        java.lang.Object[] objArr3 = cnag84Bm.adDC3e2L;
        int i6 = cnag84Bm.AARZUJiTa;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((defpackage.s10) objArr3[i7]).oh6vYeIP();
        }
        try {
            java.lang.Object[] objArr4 = fl0Var.oh6vYeIP;
            int[] iArr = fl0Var.r1MBDhnF;
            long[] jArr3 = fl0Var.IHQe1A4L2xu;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i2 = i5;
                        int i11 = z ? 1 : 0;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                j2 = j4;
                                defpackage.kc1 kc1Var = (defpackage.kc1) objArr4[i12];
                                int i13 = i9;
                                if (iArr[i12] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i11;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (kc1Var instanceof defpackage.yn) {
                                        defpackage.yn ynVar2 = (defpackage.yn) kc1Var;
                                        riuEU0zW4 = ynVar2.AARZUJiTa((defpackage.xn) defpackage.wa1.riuEU0zW4(ynVar2.EXtogiMhuM, oa1Var), oa1Var, z, ynVar2.xiZrDbcSW0);
                                        defpackage.fl0 fl0Var2 = riuEU0zW4.adDC3e2L;
                                        java.lang.Object[] objArr5 = fl0Var2.oh6vYeIP;
                                        long[] jArr4 = fl0Var2.IHQe1A4L2xu;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i14 = 0;
                                            while (true) {
                                                long j5 = jArr4[i14];
                                                j = j3;
                                                int i15 = i;
                                                if ((((~j5) << i2) & j5 & j2) != j2) {
                                                    int i16 = 8 - ((~(i14 - length2)) >>> 31);
                                                    for (int i17 = 0; i17 < i16; i17++) {
                                                        if ((j5 & 255) < 128) {
                                                            i15 = (i15 * 31) + java.lang.System.identityHashCode((defpackage.kc1) objArr5[(i14 << 3) + i17]);
                                                        }
                                                        j5 >>= i13;
                                                    }
                                                    if (i16 != i13) {
                                                        i = i15;
                                                        break;
                                                    }
                                                }
                                                i = i15;
                                                if (i14 == length2) {
                                                    break;
                                                }
                                                i14++;
                                                j3 = j;
                                                i13 = 8;
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        j = j3;
                                        riuEU0zW4 = defpackage.wa1.riuEU0zW4(kc1Var.IHQe1A4L2xu(), oa1Var);
                                    }
                                    i = (((i * 31) + java.lang.System.identityHashCode(riuEU0zW4)) * 31) + java.lang.Long.hashCode(riuEU0zW4.IHQe1A4L2xu);
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                i3 = i11;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i4 = i9;
                            }
                            j3 = j >> i4;
                            i9 = i4;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            i11 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i5;
                        objArr = objArr4;
                    }
                    if (i8 == length) {
                        i5 = i;
                        break;
                    }
                    i8++;
                    i5 = i2;
                    jArr3 = jArr;
                    objArr4 = objArr;
                    z = false;
                }
            }
            i = i5;
            java.lang.Object[] objArr6 = cnag84Bm.adDC3e2L;
            int i18 = cnag84Bm.AARZUJiTa;
            for (int i19 = 0; i19 < i18; i19++) {
                ((defpackage.s10) objArr6[i19]).IHQe1A4L2xu();
            }
            return i;
        } catch (java.lang.Throwable th) {
            java.lang.Object[] objArr7 = cnag84Bm.adDC3e2L;
            int i20 = cnag84Bm.AARZUJiTa;
            for (int i21 = 0; i21 < i20; i21++) {
                ((defpackage.s10) objArr7[i21]).IHQe1A4L2xu();
            }
            throw th;
        }
    }

    @Override // defpackage.mc1
    public final void IHQe1A4L2xu(defpackage.mc1 mc1Var) {
        mc1Var.getClass();
        defpackage.xn xnVar = (defpackage.xn) mc1Var;
        this.adDC3e2L = xnVar.adDC3e2L;
        this.xiZrDbcSW0 = xnVar.xiZrDbcSW0;
        this.AARZUJiTa = xnVar.AARZUJiTa;
    }

    @Override // defpackage.mc1
    public final defpackage.mc1 oh6vYeIP(long j) {
        return new defpackage.xn(j);
    }

    public final boolean r1MBDhnF(defpackage.yn ynVar, defpackage.oa1 oa1Var) {
        boolean z;
        boolean z2;
        java.lang.Object obj = defpackage.wa1.r1MBDhnF;
        synchronized (obj) {
            z = true;
            if (this.r1MBDhnF == oa1Var.AARZUJiTa()) {
                if (this.F7NU4MC0GW == oa1Var.EXtogiMhuM()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.xiZrDbcSW0 == EXtogiMhuM || (z2 && this.AARZUJiTa != F7NU4MC0GW(ynVar, oa1Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.r1MBDhnF = oa1Var.AARZUJiTa();
            this.F7NU4MC0GW = oa1Var.EXtogiMhuM();
        }
        return z;
    }
}
