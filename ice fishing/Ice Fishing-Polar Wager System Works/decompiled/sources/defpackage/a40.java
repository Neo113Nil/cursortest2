package defpackage;

/* loaded from: classes.dex */
public final class a40 {
    public boolean F7NU4MC0GW;
    public final defpackage.v90 IHQe1A4L2xu;
    public boolean adDC3e2L;
    public boolean oh6vYeIP;
    public boolean r1MBDhnF;
    public final defpackage.gl0 xiZrDbcSW0 = new defpackage.gl0();
    public final defpackage.np0 AARZUJiTa = new defpackage.np0();
    public final defpackage.bl0 EXtogiMhuM = new defpackage.bl0(10);

    public a40(defpackage.v90 v90Var) {
        this.IHQe1A4L2xu = v90Var;
    }

    public final void F7NU4MC0GW(defpackage.lj0 lj0Var) {
        if (this.oh6vYeIP) {
            this.adDC3e2L = true;
            this.xiZrDbcSW0.IHQe1A4L2xu(lj0Var);
            return;
        }
        defpackage.np0 np0Var = this.AARZUJiTa;
        defpackage.gl0 gl0Var = np0Var.oh6vYeIP;
        gl0Var.F7NU4MC0GW();
        gl0Var.IHQe1A4L2xu(np0Var);
        while (gl0Var.riuEU0zW4()) {
            defpackage.np0 np0Var2 = (defpackage.np0) gl0Var.ez2rX8ReCYw(gl0Var.oh6vYeIP - 1);
            int i = 0;
            while (true) {
                defpackage.xl0 xl0Var = np0Var2.IHQe1A4L2xu;
                if (i < xl0Var.AARZUJiTa) {
                    defpackage.bp0 bp0Var = (defpackage.bp0) xl0Var.adDC3e2L[i];
                    if (defpackage.x70.QoRHpC4k(bp0Var.r1MBDhnF, lj0Var)) {
                        np0Var2.IHQe1A4L2xu.SH1y5HwkJhh(bp0Var);
                        bp0Var.r1MBDhnF();
                    } else {
                        gl0Var.IHQe1A4L2xu(bp0Var);
                        i++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    public final void IHQe1A4L2xu(long j, java.util.List list, boolean z) {
        defpackage.bl0 bl0Var;
        long[] jArr;
        long[] jArr2;
        int i;
        defpackage.bp0 bp0Var;
        defpackage.bp0 bp0Var2;
        int size = list.size();
        defpackage.np0 np0Var = this.AARZUJiTa;
        defpackage.np0 np0Var2 = np0Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            bl0Var = this.EXtogiMhuM;
            if (i2 >= size) {
                break;
            }
            defpackage.lj0 lj0Var = (defpackage.lj0) list.get(i2);
            if (lj0Var.kd6TUFXn) {
                lj0Var.G3OKOH3wZRC = new defpackage.o0(5, this, lj0Var);
                if (z2) {
                    defpackage.xl0 xl0Var = np0Var2.IHQe1A4L2xu;
                    ?? r14 = xl0Var.adDC3e2L;
                    int i3 = xl0Var.AARZUJiTa;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            bp0Var2 = 0;
                            break;
                        }
                        bp0Var2 = r14[i4];
                        if (defpackage.x70.QoRHpC4k(((defpackage.bp0) bp0Var2).r1MBDhnF, lj0Var)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    bp0Var = bp0Var2;
                    if (bp0Var != null) {
                        bp0Var.riuEU0zW4 = true;
                        bp0Var.F7NU4MC0GW.IHQe1A4L2xu(j);
                        if (z) {
                            java.lang.Object F7NU4MC0GW = bl0Var.F7NU4MC0GW(j);
                            if (F7NU4MC0GW == null) {
                                F7NU4MC0GW = new defpackage.gl0();
                                bl0Var.xiZrDbcSW0(j, F7NU4MC0GW);
                            }
                            ((defpackage.gl0) F7NU4MC0GW).IHQe1A4L2xu(bp0Var);
                        }
                        np0Var2 = bp0Var;
                    } else {
                        z2 = false;
                    }
                }
                bp0Var = new defpackage.bp0(lj0Var);
                bp0Var.F7NU4MC0GW.IHQe1A4L2xu(j);
                if (z) {
                    java.lang.Object F7NU4MC0GW2 = bl0Var.F7NU4MC0GW(j);
                    if (F7NU4MC0GW2 == null) {
                        F7NU4MC0GW2 = new defpackage.gl0();
                        bl0Var.xiZrDbcSW0(j, F7NU4MC0GW2);
                    }
                    ((defpackage.gl0) F7NU4MC0GW2).IHQe1A4L2xu(bp0Var);
                }
                np0Var2.IHQe1A4L2xu.oh6vYeIP(bp0Var);
                np0Var2 = bp0Var;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = bl0Var.oh6vYeIP;
            java.lang.Object[] objArr = bl0Var.r1MBDhnF;
            long[] jArr4 = bl0Var.IHQe1A4L2xu;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                defpackage.gl0 gl0Var = (defpackage.gl0) objArr[i9];
                                defpackage.xl0 xl0Var2 = np0Var.IHQe1A4L2xu;
                                i = i6;
                                java.lang.Object[] objArr2 = xl0Var2.adDC3e2L;
                                int i10 = xl0Var2.AARZUJiTa;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((defpackage.bp0) objArr2[i11]).xiZrDbcSW0(j3, gl0Var);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        bl0Var.IHQe1A4L2xu();
    }

    public final boolean oh6vYeIP(defpackage.F7NU4MC0GW f7nu4mc0gw, boolean z) {
        defpackage.vf0 vf0Var = (defpackage.vf0) f7nu4mc0gw.xiZrDbcSW0;
        defpackage.v90 v90Var = this.IHQe1A4L2xu;
        defpackage.np0 np0Var = this.AARZUJiTa;
        boolean IHQe1A4L2xu = np0Var.IHQe1A4L2xu(vf0Var, v90Var, f7nu4mc0gw, z);
        defpackage.xl0 xl0Var = np0Var.IHQe1A4L2xu;
        if (!IHQe1A4L2xu) {
            return false;
        }
        boolean z2 = true;
        this.oh6vYeIP = true;
        java.lang.Object[] objArr = xl0Var.adDC3e2L;
        int i = xl0Var.AARZUJiTa;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((defpackage.bp0) objArr[i2]).adDC3e2L(f7nu4mc0gw, z) || z3;
        }
        java.lang.Object[] objArr2 = xl0Var.adDC3e2L;
        int i3 = xl0Var.AARZUJiTa;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((defpackage.bp0) objArr2[i4]).F7NU4MC0GW(f7nu4mc0gw) || z4;
        }
        np0Var.oh6vYeIP(f7nu4mc0gw);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.oh6vYeIP = false;
        if (this.adDC3e2L) {
            this.adDC3e2L = false;
            defpackage.gl0 gl0Var = this.xiZrDbcSW0;
            int i5 = gl0Var.oh6vYeIP;
            for (int i6 = 0; i6 < i5; i6++) {
                F7NU4MC0GW((defpackage.lj0) gl0Var.xiZrDbcSW0(i6));
            }
            gl0Var.F7NU4MC0GW();
        }
        if (this.r1MBDhnF) {
            this.r1MBDhnF = false;
            r1MBDhnF();
        }
        if (this.F7NU4MC0GW) {
            this.F7NU4MC0GW = false;
            np0Var.IHQe1A4L2xu.AARZUJiTa();
        }
        return z2;
    }

    public final void r1MBDhnF() {
        if (this.oh6vYeIP) {
            this.r1MBDhnF = true;
            return;
        }
        defpackage.np0 np0Var = this.AARZUJiTa;
        defpackage.xl0 xl0Var = np0Var.IHQe1A4L2xu;
        java.lang.Object[] objArr = xl0Var.adDC3e2L;
        int i = xl0Var.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.bp0) objArr[i2]).r1MBDhnF();
        }
        if (this.F7NU4MC0GW) {
            this.F7NU4MC0GW = true;
        } else {
            np0Var.IHQe1A4L2xu.AARZUJiTa();
        }
    }
}
