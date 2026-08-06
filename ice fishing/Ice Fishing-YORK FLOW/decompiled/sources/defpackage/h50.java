package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class h50 {
    public boolean JhCgjQRTAOCT;
    public boolean WDYagTQQm9ns;
    public final defpackage.rc0 ZpBGe2uQfcn8;
    public boolean fWTAfUmVKrZq;
    public boolean giKS3J6vZuNy;
    public final defpackage.sn0 oh71FJcDz6S2 = new defpackage.sn0();
    public final defpackage.xr0 QiMR8OkAhezm = new defpackage.xr0();
    public final defpackage.kn0 P05cfTpS5W5L = new defpackage.kn0(10);

    public h50(defpackage.rc0 rc0Var) {
        this.ZpBGe2uQfcn8 = rc0Var;
    }

    public final void JhCgjQRTAOCT(defpackage.ul0 ul0Var) {
        if (this.giKS3J6vZuNy) {
            this.WDYagTQQm9ns = true;
            this.oh71FJcDz6S2.ZpBGe2uQfcn8(ul0Var);
            return;
        }
        defpackage.xr0 xr0Var = this.QiMR8OkAhezm;
        defpackage.sn0 sn0Var = xr0Var.giKS3J6vZuNy;
        sn0Var.JhCgjQRTAOCT();
        sn0Var.ZpBGe2uQfcn8(xr0Var);
        while (sn0Var.e6mdH7fiFuta()) {
            defpackage.xr0 xr0Var2 = (defpackage.xr0) sn0Var.Ns0WNyEWdPsk(sn0Var.giKS3J6vZuNy - 1);
            int i = 0;
            while (true) {
                defpackage.ho0 ho0Var = xr0Var2.ZpBGe2uQfcn8;
                if (i < ho0Var.QiMR8OkAhezm) {
                    defpackage.lr0 lr0Var = (defpackage.lr0) ho0Var.WDYagTQQm9ns[i];
                    if (defpackage.ma0.QiMR8OkAhezm(lr0Var.fWTAfUmVKrZq, ul0Var)) {
                        xr0Var2.ZpBGe2uQfcn8.GE9mJIPrb8gP(lr0Var);
                        lr0Var.fWTAfUmVKrZq();
                    } else {
                        sn0Var.ZpBGe2uQfcn8(lr0Var);
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
    public final void ZpBGe2uQfcn8(long j, java.util.List list, boolean z) {
        defpackage.kn0 kn0Var;
        long[] jArr;
        long[] jArr2;
        int i;
        defpackage.lr0 lr0Var;
        defpackage.lr0 lr0Var2;
        int size = list.size();
        defpackage.xr0 xr0Var = this.QiMR8OkAhezm;
        defpackage.xr0 xr0Var2 = xr0Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            kn0Var = this.P05cfTpS5W5L;
            if (i2 >= size) {
                break;
            }
            defpackage.ul0 ul0Var = (defpackage.ul0) list.get(i2);
            if (ul0Var.s0TASMVLSWD5) {
                ul0Var.WmetiUbpKU9I = new defpackage.l(5, this, ul0Var);
                if (z2) {
                    defpackage.ho0 ho0Var = xr0Var2.ZpBGe2uQfcn8;
                    ?? r14 = ho0Var.WDYagTQQm9ns;
                    int i3 = ho0Var.QiMR8OkAhezm;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            lr0Var2 = 0;
                            break;
                        }
                        lr0Var2 = r14[i4];
                        if (defpackage.ma0.QiMR8OkAhezm(((defpackage.lr0) lr0Var2).fWTAfUmVKrZq, ul0Var)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    lr0Var = lr0Var2;
                    if (lr0Var != null) {
                        lr0Var.e6mdH7fiFuta = true;
                        lr0Var.JhCgjQRTAOCT.ZpBGe2uQfcn8(j);
                        if (z) {
                            java.lang.Object JhCgjQRTAOCT = kn0Var.JhCgjQRTAOCT(j);
                            if (JhCgjQRTAOCT == null) {
                                JhCgjQRTAOCT = new defpackage.sn0();
                                kn0Var.oh71FJcDz6S2(j, JhCgjQRTAOCT);
                            }
                            ((defpackage.sn0) JhCgjQRTAOCT).ZpBGe2uQfcn8(lr0Var);
                        }
                        xr0Var2 = lr0Var;
                    } else {
                        z2 = false;
                    }
                }
                lr0Var = new defpackage.lr0(ul0Var);
                lr0Var.JhCgjQRTAOCT.ZpBGe2uQfcn8(j);
                if (z) {
                    java.lang.Object JhCgjQRTAOCT2 = kn0Var.JhCgjQRTAOCT(j);
                    if (JhCgjQRTAOCT2 == null) {
                        JhCgjQRTAOCT2 = new defpackage.sn0();
                        kn0Var.oh71FJcDz6S2(j, JhCgjQRTAOCT2);
                    }
                    ((defpackage.sn0) JhCgjQRTAOCT2).ZpBGe2uQfcn8(lr0Var);
                }
                xr0Var2.ZpBGe2uQfcn8.giKS3J6vZuNy(lr0Var);
                xr0Var2 = lr0Var;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = kn0Var.giKS3J6vZuNy;
            java.lang.Object[] objArr = kn0Var.fWTAfUmVKrZq;
            long[] jArr4 = kn0Var.ZpBGe2uQfcn8;
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
                                defpackage.sn0 sn0Var = (defpackage.sn0) objArr[i9];
                                defpackage.ho0 ho0Var2 = xr0Var.ZpBGe2uQfcn8;
                                i = i6;
                                java.lang.Object[] objArr2 = ho0Var2.WDYagTQQm9ns;
                                int i10 = ho0Var2.QiMR8OkAhezm;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((defpackage.lr0) objArr2[i11]).oh71FJcDz6S2(j3, sn0Var);
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
        kn0Var.ZpBGe2uQfcn8();
    }

    public final void fWTAfUmVKrZq() {
        if (this.giKS3J6vZuNy) {
            this.fWTAfUmVKrZq = true;
            return;
        }
        defpackage.xr0 xr0Var = this.QiMR8OkAhezm;
        defpackage.ho0 ho0Var = xr0Var.ZpBGe2uQfcn8;
        java.lang.Object[] objArr = ho0Var.WDYagTQQm9ns;
        int i = ho0Var.QiMR8OkAhezm;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.lr0) objArr[i2]).fWTAfUmVKrZq();
        }
        if (this.JhCgjQRTAOCT) {
            this.JhCgjQRTAOCT = true;
        } else {
            xr0Var.ZpBGe2uQfcn8.QiMR8OkAhezm();
        }
    }

    public final boolean giKS3J6vZuNy(defpackage.n80 n80Var, boolean z) {
        defpackage.gj0 gj0Var = (defpackage.gj0) n80Var.oh71FJcDz6S2;
        defpackage.rc0 rc0Var = this.ZpBGe2uQfcn8;
        defpackage.xr0 xr0Var = this.QiMR8OkAhezm;
        boolean ZpBGe2uQfcn8 = xr0Var.ZpBGe2uQfcn8(gj0Var, rc0Var, n80Var, z);
        defpackage.ho0 ho0Var = xr0Var.ZpBGe2uQfcn8;
        if (!ZpBGe2uQfcn8) {
            return false;
        }
        boolean z2 = true;
        this.giKS3J6vZuNy = true;
        java.lang.Object[] objArr = ho0Var.WDYagTQQm9ns;
        int i = ho0Var.QiMR8OkAhezm;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((defpackage.lr0) objArr[i2]).WDYagTQQm9ns(n80Var, z) || z3;
        }
        java.lang.Object[] objArr2 = ho0Var.WDYagTQQm9ns;
        int i3 = ho0Var.QiMR8OkAhezm;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((defpackage.lr0) objArr2[i4]).JhCgjQRTAOCT(n80Var) || z4;
        }
        xr0Var.giKS3J6vZuNy(n80Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.giKS3J6vZuNy = false;
        if (this.WDYagTQQm9ns) {
            this.WDYagTQQm9ns = false;
            defpackage.sn0 sn0Var = this.oh71FJcDz6S2;
            int i5 = sn0Var.giKS3J6vZuNy;
            for (int i6 = 0; i6 < i5; i6++) {
                JhCgjQRTAOCT((defpackage.ul0) sn0Var.oh71FJcDz6S2(i6));
            }
            sn0Var.JhCgjQRTAOCT();
        }
        if (this.fWTAfUmVKrZq) {
            this.fWTAfUmVKrZq = false;
            fWTAfUmVKrZq();
        }
        if (this.JhCgjQRTAOCT) {
            this.JhCgjQRTAOCT = false;
            xr0Var.ZpBGe2uQfcn8.QiMR8OkAhezm();
        }
        return z2;
    }
}
