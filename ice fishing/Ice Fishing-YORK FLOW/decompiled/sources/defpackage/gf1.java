package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gf1 {
    public boolean GE9mJIPrb8gP;
    public int Ns0WNyEWdPsk;
    public final defpackage.y10 ZpBGe2uQfcn8;
    public defpackage.on0 fWTAfUmVKrZq;
    public java.lang.Object giKS3J6vZuNy;
    public int JhCgjQRTAOCT = -1;
    public final defpackage.yn0 WDYagTQQm9ns = defpackage.j80.ZVVdXbWmyCSK();
    public final defpackage.yn0 oh71FJcDz6S2 = new defpackage.yn0();
    public final defpackage.zn0 QiMR8OkAhezm = new defpackage.zn0();
    public final defpackage.ho0 P05cfTpS5W5L = new defpackage.ho0(new defpackage.qp[16]);
    public final defpackage.d30 e6mdH7fiFuta = new defpackage.d30(1, this);
    public final defpackage.yn0 fNwYGHIYeJcR = defpackage.j80.ZVVdXbWmyCSK();
    public final java.util.HashMap h3m55N1URyyK = new java.util.HashMap();

    public gf1(defpackage.y10 y10Var) {
        this.ZpBGe2uQfcn8 = y10Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void JhCgjQRTAOCT() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long j3;
        defpackage.yn0 yn0Var = this.oh71FJcDz6S2;
        long[] jArr3 = yn0Var.ZpBGe2uQfcn8;
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
                        java.lang.Object obj = yn0Var.giKS3J6vZuNy[i6];
                        j2 = j5;
                        defpackage.on0 on0Var = (defpackage.on0) yn0Var.fWTAfUmVKrZq[i6];
                        obj.getClass();
                        boolean OcTWLQzke1i2 = ((defpackage.pv0) obj).OcTWLQzke1i2();
                        if (!OcTWLQzke1i2) {
                            java.lang.Object[] objArr = on0Var.giKS3J6vZuNy;
                            int[] iArr = on0Var.fWTAfUmVKrZq;
                            long[] jArr4 = on0Var.ZpBGe2uQfcn8;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = OcTWLQzke1i2;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                java.lang.Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                fWTAfUmVKrZq(obj, obj2);
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
                                    OcTWLQzke1i2 = z;
                                    jArr4 = jArr5;
                                    i7 = 8;
                                }
                                if (!z) {
                                    yn0Var.fNwYGHIYeJcR(i6);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j4;
                        z = OcTWLQzke1i2;
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
    public final boolean ZpBGe2uQfcn8(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf1.ZpBGe2uQfcn8(java.util.Set):boolean");
    }

    public final void fWTAfUmVKrZq(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.yn0 yn0Var = this.WDYagTQQm9ns;
        defpackage.j80.frSwwKIlbUhK(yn0Var, obj2, obj);
        if (!(obj2 instanceof defpackage.qp) || yn0Var.fWTAfUmVKrZq(obj2)) {
            return;
        }
        defpackage.j80.KrtOTfE6jiS2(this.fNwYGHIYeJcR, obj2);
        this.h3m55N1URyyK.remove(obj2);
    }

    public final void giKS3J6vZuNy(java.lang.Object obj, int i, java.lang.Object obj2, defpackage.on0 on0Var) {
        int i2;
        if (this.Ns0WNyEWdPsk > 0) {
            return;
        }
        int fWTAfUmVKrZq = on0Var.fWTAfUmVKrZq(obj);
        if (fWTAfUmVKrZq < 0) {
            fWTAfUmVKrZq = ~fWTAfUmVKrZq;
            i2 = -1;
        } else {
            i2 = on0Var.fWTAfUmVKrZq[fWTAfUmVKrZq];
        }
        on0Var.giKS3J6vZuNy[fWTAfUmVKrZq] = obj;
        on0Var.fWTAfUmVKrZq[fWTAfUmVKrZq] = i;
        if ((obj instanceof defpackage.qp) && i2 != i) {
            defpackage.pp e6mdH7fiFuta = ((defpackage.qp) obj).e6mdH7fiFuta();
            this.h3m55N1URyyK.put(obj, e6mdH7fiFuta.oh71FJcDz6S2);
            defpackage.on0 on0Var2 = e6mdH7fiFuta.WDYagTQQm9ns;
            defpackage.yn0 yn0Var = this.fNwYGHIYeJcR;
            defpackage.j80.KrtOTfE6jiS2(yn0Var, obj);
            java.lang.Object[] objArr = on0Var2.giKS3J6vZuNy;
            long[] jArr = on0Var2.ZpBGe2uQfcn8;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                defpackage.jg1 jg1Var = (defpackage.jg1) objArr[(i3 << 3) + i5];
                                if (jg1Var instanceof defpackage.kg1) {
                                    ((defpackage.kg1) jg1Var).QiMR8OkAhezm(2);
                                }
                                defpackage.j80.oh71FJcDz6S2(yn0Var, jg1Var, obj);
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
            if (obj instanceof defpackage.kg1) {
                ((defpackage.kg1) obj).QiMR8OkAhezm(2);
            }
            defpackage.j80.oh71FJcDz6S2(this.WDYagTQQm9ns, obj, obj2);
        }
    }
}
