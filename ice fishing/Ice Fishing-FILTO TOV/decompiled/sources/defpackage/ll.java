package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ll extends u51 {
    public static final Object encWxUiV2 = new Object();
    public int AvO7iQsrTN;
    public Object EljAMC1QTz;
    public zf0 OOA6hdeuvCS;
    public long X1lG3V04pd;
    public int xqGvceK5x;

    public ll(long j) {
        super(j);
        zf0 zf0Var = pk0.GWasM1elztuh;
        zf0Var.getClass();
        this.OOA6hdeuvCS = zf0Var;
        this.EljAMC1QTz = encWxUiV2;
    }

    @Override // defpackage.u51
    public final void GWasM1elztuh(u51 u51Var) {
        u51Var.getClass();
        ll llVar = (ll) u51Var;
        this.OOA6hdeuvCS = llVar.OOA6hdeuvCS;
        this.EljAMC1QTz = llVar.EljAMC1QTz;
        this.AvO7iQsrTN = llVar.AvO7iQsrTN;
    }

    public final boolean X1lG3V04pd(ml mlVar, y31 y31Var) {
        boolean z;
        boolean z2;
        Object obj = e41.X1lG3V04pd;
        synchronized (obj) {
            z = true;
            if (this.X1lG3V04pd == y31Var.AvO7iQsrTN()) {
                if (this.xqGvceK5x == y31Var.encWxUiV2()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.EljAMC1QTz == encWxUiV2 || (z2 && this.AvO7iQsrTN != xqGvceK5x(mlVar, y31Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.X1lG3V04pd = y31Var.AvO7iQsrTN();
            this.xqGvceK5x = y31Var.encWxUiV2();
        }
        return z;
    }

    @Override // defpackage.u51
    public final u51 Yi7zF1RB1(long j) {
        return new ll(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [ll] */
    /* JADX WARN: Type inference failed for: r13v5, types: [u51] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, u51] */
    public final int xqGvceK5x(ml mlVar, y31 y31Var) {
        zf0 zf0Var;
        int i;
        long[] jArr;
        int i2;
        Object[] objArr;
        long[] jArr2;
        int i3;
        Object[] objArr2;
        long j;
        long j2;
        int i4;
        ?? mOu10nynGul;
        synchronized (e41.X1lG3V04pd) {
            zf0Var = this.OOA6hdeuvCS;
        }
        int i5 = 7;
        if (zf0Var.OOA6hdeuvCS == 0) {
            return 7;
        }
        rg0 uFEq9NpZ = z50.uFEq9NpZ();
        Object[] objArr3 = uFEq9NpZ.OOA6hdeuvCS;
        int i6 = uFEq9NpZ.AvO7iQsrTN;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((px) objArr3[i7]).Yi7zF1RB1();
        }
        try {
            Object[] objArr4 = zf0Var.Yi7zF1RB1;
            int[] iArr = zf0Var.X1lG3V04pd;
            long[] jArr3 = zf0Var.GWasM1elztuh;
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
                                s51 s51Var = (s51) objArr4[i12];
                                int i13 = i9;
                                if (iArr[i12] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i11;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (s51Var instanceof ml) {
                                        ml mlVar2 = (ml) s51Var;
                                        mOu10nynGul = mlVar2.AvO7iQsrTN((ll) e41.mOu10nynGul(mlVar2.encWxUiV2, y31Var), y31Var, z, mlVar2.EljAMC1QTz);
                                        zf0 zf0Var2 = mOu10nynGul.OOA6hdeuvCS;
                                        Object[] objArr5 = zf0Var2.Yi7zF1RB1;
                                        long[] jArr4 = zf0Var2.GWasM1elztuh;
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
                                                            i15 = (i15 * 31) + System.identityHashCode((s51) objArr5[(i14 << 3) + i17]);
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
                                        mOu10nynGul = e41.mOu10nynGul(s51Var.GWasM1elztuh(), y31Var);
                                    }
                                    i = (((i * 31) + System.identityHashCode(mOu10nynGul)) * 31) + Long.hashCode(mOu10nynGul.GWasM1elztuh);
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
            Object[] objArr6 = uFEq9NpZ.OOA6hdeuvCS;
            int i18 = uFEq9NpZ.AvO7iQsrTN;
            for (int i19 = 0; i19 < i18; i19++) {
                ((px) objArr6[i19]).GWasM1elztuh();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr7 = uFEq9NpZ.OOA6hdeuvCS;
            int i20 = uFEq9NpZ.AvO7iQsrTN;
            for (int i21 = 0; i21 < i20; i21++) {
                ((px) objArr7[i21]).GWasM1elztuh();
            }
            throw th;
        }
    }
}
