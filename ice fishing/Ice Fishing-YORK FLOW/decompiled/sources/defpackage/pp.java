package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pp extends defpackage.lg1 {
    public static final java.lang.Object P05cfTpS5W5L = new java.lang.Object();
    public int JhCgjQRTAOCT;
    public int QiMR8OkAhezm;
    public defpackage.on0 WDYagTQQm9ns;
    public long fWTAfUmVKrZq;
    public java.lang.Object oh71FJcDz6S2;

    public pp(long j) {
        super(j);
        defpackage.on0 on0Var = defpackage.ms0.ZpBGe2uQfcn8;
        on0Var.getClass();
        this.WDYagTQQm9ns = on0Var;
        this.oh71FJcDz6S2 = P05cfTpS5W5L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [pp] */
    /* JADX WARN: Type inference failed for: r13v5, types: [lg1] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, lg1] */
    public final int JhCgjQRTAOCT(defpackage.qp qpVar, defpackage.me1 me1Var) {
        defpackage.on0 on0Var;
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
        ?? e6mdH7fiFuta;
        synchronized (defpackage.te1.fWTAfUmVKrZq) {
            on0Var = this.WDYagTQQm9ns;
        }
        int i5 = 7;
        if (on0Var.WDYagTQQm9ns == 0) {
            return 7;
        }
        defpackage.ho0 XntWc4eZSQ8j = defpackage.w60.XntWc4eZSQ8j();
        java.lang.Object[] objArr3 = XntWc4eZSQ8j.WDYagTQQm9ns;
        int i6 = XntWc4eZSQ8j.QiMR8OkAhezm;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((defpackage.d30) objArr3[i7]).giKS3J6vZuNy();
        }
        try {
            java.lang.Object[] objArr4 = on0Var.giKS3J6vZuNy;
            int[] iArr = on0Var.fWTAfUmVKrZq;
            long[] jArr3 = on0Var.ZpBGe2uQfcn8;
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
                                defpackage.jg1 jg1Var = (defpackage.jg1) objArr4[i12];
                                int i13 = i9;
                                if (iArr[i12] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i11;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (jg1Var instanceof defpackage.qp) {
                                        defpackage.qp qpVar2 = (defpackage.qp) jg1Var;
                                        e6mdH7fiFuta = qpVar2.P05cfTpS5W5L((defpackage.pp) defpackage.te1.e6mdH7fiFuta(qpVar2.P05cfTpS5W5L, me1Var), me1Var, z, qpVar2.oh71FJcDz6S2);
                                        defpackage.on0 on0Var2 = e6mdH7fiFuta.WDYagTQQm9ns;
                                        java.lang.Object[] objArr5 = on0Var2.giKS3J6vZuNy;
                                        long[] jArr4 = on0Var2.ZpBGe2uQfcn8;
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
                                                            i15 = (i15 * 31) + java.lang.System.identityHashCode((defpackage.jg1) objArr5[(i14 << 3) + i17]);
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
                                        e6mdH7fiFuta = defpackage.te1.e6mdH7fiFuta(jg1Var.ZpBGe2uQfcn8(), me1Var);
                                    }
                                    i = (((i * 31) + java.lang.System.identityHashCode(e6mdH7fiFuta)) * 31) + java.lang.Long.hashCode(e6mdH7fiFuta.ZpBGe2uQfcn8);
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
            java.lang.Object[] objArr6 = XntWc4eZSQ8j.WDYagTQQm9ns;
            int i18 = XntWc4eZSQ8j.QiMR8OkAhezm;
            for (int i19 = 0; i19 < i18; i19++) {
                ((defpackage.d30) objArr6[i19]).ZpBGe2uQfcn8();
            }
            return i;
        } catch (java.lang.Throwable th) {
            java.lang.Object[] objArr7 = XntWc4eZSQ8j.WDYagTQQm9ns;
            int i20 = XntWc4eZSQ8j.QiMR8OkAhezm;
            for (int i21 = 0; i21 < i20; i21++) {
                ((defpackage.d30) objArr7[i21]).ZpBGe2uQfcn8();
            }
            throw th;
        }
    }

    @Override // defpackage.lg1
    public final void ZpBGe2uQfcn8(defpackage.lg1 lg1Var) {
        lg1Var.getClass();
        defpackage.pp ppVar = (defpackage.pp) lg1Var;
        this.WDYagTQQm9ns = ppVar.WDYagTQQm9ns;
        this.oh71FJcDz6S2 = ppVar.oh71FJcDz6S2;
        this.QiMR8OkAhezm = ppVar.QiMR8OkAhezm;
    }

    public final boolean fWTAfUmVKrZq(defpackage.qp qpVar, defpackage.me1 me1Var) {
        boolean z;
        boolean z2;
        java.lang.Object obj = defpackage.te1.fWTAfUmVKrZq;
        synchronized (obj) {
            z = true;
            if (this.fWTAfUmVKrZq == me1Var.QiMR8OkAhezm()) {
                if (this.JhCgjQRTAOCT == me1Var.P05cfTpS5W5L()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.oh71FJcDz6S2 == P05cfTpS5W5L || (z2 && this.QiMR8OkAhezm != JhCgjQRTAOCT(qpVar, me1Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.fWTAfUmVKrZq = me1Var.QiMR8OkAhezm();
            this.JhCgjQRTAOCT = me1Var.P05cfTpS5W5L();
        }
        return z;
    }

    @Override // defpackage.lg1
    public final defpackage.lg1 giKS3J6vZuNy(long j) {
        return new defpackage.pp(j);
    }
}
