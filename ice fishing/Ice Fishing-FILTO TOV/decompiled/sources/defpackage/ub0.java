package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ub0 extends up0 implements dd0, ve0 {
    public wp0 E7jCp8Ls;
    public rb0 JFJ3QoxA;
    public hg0 Mjvvu5DE;
    public final vb0 WIEu4Ya2g8 = new vb0(0, this);
    public boolean XnEVoBF0td1l;
    public ai0 YmKjaVtbfp5Z;
    public boolean iwATDS1i01k;
    public hv rQPn8YBR;
    public boolean uFEq9NpZ;

    public static void j6IIN2O8eOU(bk0 bk0Var) {
        h60 h60Var;
        bk0 bk0Var2 = bk0Var.jivtDDk9H;
        g60 g60Var = bk0Var.mE4lRynR;
        if (!o30.rQPn8YBR(bk0Var2 != null ? bk0Var2.mE4lRynR : null, g60Var)) {
            g60Var.MZhzXH72.WIEu4Ya2g8.M3K9sHhK.EljAMC1QTz();
            return;
        }
        NsRGN7gRqWF lv06NcmrQ = g60Var.MZhzXH72.WIEu4Ya2g8.lv06NcmrQ();
        if (lv06NcmrQ == null || (h60Var = ((ad0) lv06NcmrQ).M3K9sHhK) == null) {
            return;
        }
        h60Var.EljAMC1QTz();
    }

    @Override // defpackage.ve0
    public final void E7jCp8Ls(boolean z) {
        ub0 hOpoc9RpANL = hOpoc9RpANL();
        g60 bCsSzSHkbaQ = hOpoc9RpANL != null ? hOpoc9RpANL.bCsSzSHkbaQ() : null;
        if (o30.rQPn8YBR(bCsSzSHkbaQ, bCsSzSHkbaQ())) {
            this.XnEVoBF0td1l = z;
            return;
        }
        if ((bCsSzSHkbaQ != null ? bCsSzSHkbaQ.MZhzXH72.xqGvceK5x : null) != c60.AvO7iQsrTN) {
            if ((bCsSzSHkbaQ != null ? bCsSzSHkbaQ.MZhzXH72.xqGvceK5x : null) != c60.encWxUiV2) {
                return;
            }
        }
        this.XnEVoBF0td1l = z;
    }

    public final rb0 FhVkB11j() {
        rb0 rb0Var = this.JFJ3QoxA;
        if (rb0Var != null) {
            return rb0Var;
        }
        rb0 rb0Var2 = new rb0(this);
        this.JFJ3QoxA = rb0Var2;
        return rb0Var2;
    }

    @Override // defpackage.dd0
    public final cd0 HFYAaqMd6(int i, int i2, Map map, hv hvVar, hv hvVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            t10.Yi7zF1RB1("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new tb0(i, i2, map, hvVar, hvVar2, this);
    }

    public final void UjhVk5crk(cd0 cd0Var) {
        long j;
        long j2;
        hg0 hg0Var = this.Mjvvu5DE;
        if (this.iwATDS1i01k) {
            return;
        }
        hv xqGvceK5x = cd0Var.xqGvceK5x();
        if (xqGvceK5x != null) {
            boolean z = this.rQPn8YBR != xqGvceK5x;
            if (z || !FhVkB11j().OOA6hdeuvCS) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                n50 vaTCmWUgXF = vaTCmWUgXF();
                long dqB83aoLBB = qj.dqB83aoLBB(vaTCmWUgXF.X1lG3V04pd(0L));
                long DmJncFq5 = vaTCmWUgXF.DmJncFq5();
                j2 = dqB83aoLBB;
                j = DmJncFq5;
                z = (u20.GWasM1elztuh(dqB83aoLBB, FhVkB11j().EljAMC1QTz) && b30.GWasM1elztuh(DmJncFq5, FhVkB11j().AvO7iQsrTN)) ? false : true;
            }
            if (z) {
                wp0 wp0Var = this.E7jCp8Ls;
                if (wp0Var != null) {
                    wp0Var.OOA6hdeuvCS = cd0Var;
                } else {
                    wp0Var = new wp0(cd0Var, this);
                    this.E7jCp8Ls = wp0Var;
                }
                oFzb77RX3H8t(wp0Var, j2, j);
                this.rQPn8YBR = cd0Var.xqGvceK5x();
                return;
            }
            return;
        }
        if (hg0Var != null) {
            Object[] objArr = hg0Var.X1lG3V04pd;
            long[] jArr = hg0Var.GWasM1elztuh;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                xtv4Xm13vGi((ig0) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            hg0Var.GWasM1elztuh();
        }
    }

    public abstract ub0 WkXHDbKiD();

    @Override // defpackage.k30
    public boolean XnEVoBF0td1l() {
        return false;
    }

    public abstract g60 bCsSzSHkbaQ();

    public abstract boolean cTIXpaxc();

    public abstract cd0 gHe2tSmr6w();

    public abstract void gqMuANyCes();

    public abstract ub0 hOpoc9RpANL();

    public abstract int iriv6doqetn(iK7aQfvhG ik7aqfvhg);

    public abstract long kbVzROOfKK();

    @Override // defpackage.up0
    public final int mqNvfisv7(iK7aQfvhG ik7aqfvhg) {
        int iriv6doqetn;
        if (!cTIXpaxc() || (iriv6doqetn = iriv6doqetn(ik7aqfvhg)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = ik7aqfvhg instanceof fe1;
        long j = this.mOu10nynGul;
        return iriv6doqetn + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void nXl1EmE5(g60 g60Var, sz szVar) {
        char c;
        long j;
        long j2;
        long j3;
        hg0 hg0Var;
        hg0 hg0Var2;
        Object AvO7iQsrTN;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        hg0 hg0Var3 = this.Mjvvu5DE;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (hg0Var3 != null) {
            Object[] objArr = hg0Var3.X1lG3V04pd;
            long[] jArr3 = hg0Var3.GWasM1elztuh;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                ig0 ig0Var = (ig0) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = ig0Var.Yi7zF1RB1;
                                long[] jArr4 = ig0Var.GWasM1elztuh;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    g60 g60Var2 = (g60) ((kf1) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (g60Var2 != null) {
                                                        boolean eUH21U3apd = g60Var2.eUH21U3apd();
                                                        i4 = i8;
                                                        if (eUH21U3apd) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    ig0Var.XnEVoBF0td1l(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
                hg0Var = this.Mjvvu5DE;
                if (hg0Var != null) {
                    long[] jArr5 = hg0Var.GWasM1elztuh;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr5[i15];
                            if ((((~j11) << c) & j11 & j) != j) {
                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j2) < j3) {
                                        int i18 = (i15 << 3) + i17;
                                        if (((ig0) hg0Var.X1lG3V04pd[i18]).AvO7iQsrTN()) {
                                            hg0Var.E7jCp8Ls(i18);
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                }
                            }
                            if (i15 == length3) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
                hg0Var2 = this.Mjvvu5DE;
                if (hg0Var2 == null) {
                    hg0Var2 = new hg0();
                    this.Mjvvu5DE = hg0Var2;
                }
                AvO7iQsrTN = hg0Var2.AvO7iQsrTN(szVar);
                if (AvO7iQsrTN == null) {
                    AvO7iQsrTN = new ig0();
                    hg0Var2.XnEVoBF0td1l(szVar, AvO7iQsrTN);
                }
                ((ig0) AvO7iQsrTN).rQPn8YBR(new kf1(g60Var));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        hg0Var = this.Mjvvu5DE;
        if (hg0Var != null) {
        }
        hg0Var2 = this.Mjvvu5DE;
        if (hg0Var2 == null) {
        }
        AvO7iQsrTN = hg0Var2.AvO7iQsrTN(szVar);
        if (AvO7iQsrTN == null) {
        }
        ((ig0) AvO7iQsrTN).rQPn8YBR(new kf1(g60Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void oFzb77RX3H8t(wp0 wp0Var, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        g60 g60Var;
        int i;
        char c2;
        long j6;
        ub0 hOpoc9RpANL;
        in0 snapshotObserver;
        hg0 hg0Var = this.Mjvvu5DE;
        ai0 ai0Var = this.YmKjaVtbfp5Z;
        if (ai0Var == null) {
            ai0Var = new ai0();
            this.YmKjaVtbfp5Z = ai0Var;
        }
        ai0 ai0Var2 = ai0Var;
        gn0 gn0Var = bCsSzSHkbaQ().Mjvvu5DE;
        if (gn0Var != null && (snapshotObserver = ((c) gn0Var).getSnapshotObserver()) != null) {
            snapshotObserver.GWasM1elztuh.X1lG3V04pd(wp0Var, XdwzlWIkSDqF.WdrkLMV3xh, new sb0(this, j, j2, wp0Var));
        }
        boolean XnEVoBF0td1l = XnEVoBF0td1l();
        ig0 ig0Var = (ig0) ai0Var2.OOA6hdeuvCS;
        ig0 ig0Var2 = (ig0) ai0Var2.EljAMC1QTz;
        int i2 = ai0Var2.GWasM1elztuh;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) ai0Var2.xqGvceK5x)[i3];
            if (b == 3) {
                sz szVar = ((sz[]) ai0Var2.Yi7zF1RB1)[i3];
                szVar.getClass();
                ig0Var2.rQPn8YBR(szVar);
            } else if (b != 0 && hg0Var != null) {
                sz szVar2 = ((sz[]) ai0Var2.Yi7zF1RB1)[i3];
                szVar2.getClass();
                ig0 ig0Var3 = (ig0) hg0Var.rQPn8YBR(szVar2);
                if (ig0Var3 != null) {
                    ig0Var.JFJ3QoxA(ig0Var3);
                }
            }
        }
        int i4 = ai0Var2.GWasM1elztuh;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) ai0Var2.xqGvceK5x;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                sz[] szVarArr = (sz[]) ai0Var2.Yi7zF1RB1;
                szVarArr[i6 - i5] = szVarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = ai0Var2.GWasM1elztuh;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((sz[]) ai0Var2.Yi7zF1RB1)[i8] = null;
        }
        ai0Var2.GWasM1elztuh -= i5;
        ub0 hOpoc9RpANL2 = hOpoc9RpANL();
        Object[] objArr = ig0Var2.Yi7zF1RB1;
        long[] jArr = ig0Var2.GWasM1elztuh;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            sz szVar3 = (sz) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            ub0 ub0Var = hOpoc9RpANL2 == null ? this : hOpoc9RpANL2;
                            i = i9;
                            ub0 ub0Var2 = ub0Var;
                            while (true) {
                                ai0 ai0Var3 = ub0Var2.YmKjaVtbfp5Z;
                                if ((ai0Var3 == null || d5.dcDmLGVhzWm((sz[]) ai0Var3.Yi7zF1RB1, szVar3) < 0) && (hOpoc9RpANL = ub0Var2.hOpoc9RpANL()) != null) {
                                    ub0Var2 = hOpoc9RpANL;
                                }
                            }
                            hg0 hg0Var2 = ub0Var2.Mjvvu5DE;
                            ig0 ig0Var4 = hg0Var2 != null ? (ig0) hg0Var2.rQPn8YBR(szVar3) : null;
                            if (ig0Var4 != null) {
                                ub0Var.xtv4Xm13vGi(ig0Var4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        ig0Var2.Yi7zF1RB1();
        Object[] objArr2 = ig0Var.Yi7zF1RB1;
        long[] jArr2 = ig0Var.GWasM1elztuh;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (g60Var = (g60) ((kf1) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (XnEVoBF0td1l) {
                                g60Var.CMh55RymNfS(false);
                            } else {
                                g60Var.J3Xc8BaqpN8(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        ig0Var.Yi7zF1RB1();
    }

    public abstract n50 vaTCmWUgXF();

    /* JADX WARN: Multi-variable type inference failed */
    public final void xtv4Xm13vGi(ig0 ig0Var) {
        g60 g60Var;
        Object[] objArr = ig0Var.Yi7zF1RB1;
        long[] jArr = ig0Var.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (g60Var = (g60) ((kf1) objArr[(i << 3) + i3]).get()) != null) {
                        if (XnEVoBF0td1l()) {
                            g60Var.CMh55RymNfS(false);
                        } else {
                            g60Var.J3Xc8BaqpN8(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
