package defpackage;

/* loaded from: classes.dex */
public final class hb1 {
    public final defpackage.g00 IHQe1A4L2xu;
    public boolean SH1y5HwkJhh;
    public int ez2rX8ReCYw;
    public java.lang.Object oh6vYeIP;
    public defpackage.fl0 r1MBDhnF;
    public int F7NU4MC0GW = -1;
    public final defpackage.nl0 adDC3e2L = defpackage.f70.EXtogiMhuM();
    public final defpackage.nl0 xiZrDbcSW0 = new defpackage.nl0();
    public final defpackage.ol0 AARZUJiTa = new defpackage.ol0();
    public final defpackage.xl0 EXtogiMhuM = new defpackage.xl0(new defpackage.yn[16]);
    public final defpackage.s10 riuEU0zW4 = new defpackage.s10(1, this);
    public final defpackage.nl0 JlrlGoKF = defpackage.f70.EXtogiMhuM();
    public final java.util.HashMap DFo87pBq1E5 = new java.util.HashMap();

    public hb1(defpackage.g00 g00Var) {
        this.IHQe1A4L2xu = g00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F7NU4MC0GW() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long j3;
        defpackage.nl0 nl0Var = this.xiZrDbcSW0;
        long[] jArr3 = nl0Var.IHQe1A4L2xu;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        java.lang.Object obj = nl0Var.oh6vYeIP[i6];
                        j2 = j5;
                        defpackage.fl0 fl0Var = (defpackage.fl0) nl0Var.r1MBDhnF[i6];
                        obj.getClass();
                        boolean fnWB2E7cs = ((defpackage.us0) obj).fnWB2E7cs();
                        if (!fnWB2E7cs) {
                            java.lang.Object[] objArr = fl0Var.oh6vYeIP;
                            int[] iArr = fl0Var.r1MBDhnF;
                            long[] jArr4 = fl0Var.IHQe1A4L2xu;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = fnWB2E7cs;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                java.lang.Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                r1MBDhnF(obj, obj2);
                                            } else {
                                                j3 = j6;
                                            }
                                            j6 = j3 >> i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    fnWB2E7cs = z;
                                    jArr4 = jArr5;
                                    i7 = 8;
                                }
                                if (!z) {
                                    nl0Var.JlrlGoKF(i6);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j4;
                        z = fnWB2E7cs;
                        if (!z) {
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean IHQe1A4L2xu(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb1.IHQe1A4L2xu(java.util.Set):boolean");
    }

    public final void oh6vYeIP(java.lang.Object obj, int i, java.lang.Object obj2, defpackage.fl0 fl0Var) {
        int i2;
        if (this.ez2rX8ReCYw > 0) {
            return;
        }
        int r1MBDhnF = fl0Var.r1MBDhnF(obj);
        if (r1MBDhnF < 0) {
            r1MBDhnF = ~r1MBDhnF;
            i2 = -1;
        } else {
            i2 = fl0Var.r1MBDhnF[r1MBDhnF];
        }
        fl0Var.oh6vYeIP[r1MBDhnF] = obj;
        fl0Var.r1MBDhnF[r1MBDhnF] = i;
        if ((obj instanceof defpackage.yn) && i2 != i) {
            defpackage.xn EXtogiMhuM = ((defpackage.yn) obj).EXtogiMhuM();
            this.DFo87pBq1E5.put(obj, EXtogiMhuM.xiZrDbcSW0);
            defpackage.fl0 fl0Var2 = EXtogiMhuM.adDC3e2L;
            defpackage.nl0 nl0Var = this.JlrlGoKF;
            defpackage.f70.NHJTzaLwkd(nl0Var, obj);
            java.lang.Object[] objArr = fl0Var2.oh6vYeIP;
            long[] jArr = fl0Var2.IHQe1A4L2xu;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                defpackage.kc1 kc1Var = (defpackage.kc1) objArr[(i3 << 3) + i5];
                                if (kc1Var instanceof defpackage.lc1) {
                                    ((defpackage.lc1) kc1Var).xiZrDbcSW0(2);
                                }
                                defpackage.f70.adDC3e2L(nl0Var, kc1Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof defpackage.lc1) {
                ((defpackage.lc1) obj).xiZrDbcSW0(2);
            }
            defpackage.f70.adDC3e2L(this.adDC3e2L, obj, obj2);
        }
    }

    public final void r1MBDhnF(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.nl0 nl0Var = this.adDC3e2L;
        defpackage.f70.abhbClRa(nl0Var, obj2, obj);
        if (!(obj2 instanceof defpackage.yn) || nl0Var.r1MBDhnF(obj2)) {
            return;
        }
        defpackage.f70.NHJTzaLwkd(this.JlrlGoKF, obj2);
        this.DFo87pBq1E5.remove(obj2);
    }
}
