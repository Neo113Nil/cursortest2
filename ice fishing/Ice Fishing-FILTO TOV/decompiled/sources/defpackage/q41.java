package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q41 {
    public final hv GWasM1elztuh;
    public boolean JFJ3QoxA;
    public zf0 X1lG3V04pd;
    public Object Yi7zF1RB1;
    public int rQPn8YBR;
    public int xqGvceK5x = -1;
    public final hg0 OOA6hdeuvCS = b70.WIEu4Ya2g8();
    public final hg0 EljAMC1QTz = new hg0();
    public final ig0 AvO7iQsrTN = new ig0();
    public final rg0 encWxUiV2 = new rg0(new ml[16]);
    public final px mOu10nynGul = new px(1, this);
    public final hg0 E7jCp8Ls = b70.WIEu4Ya2g8();
    public final HashMap XnEVoBF0td1l = new HashMap();

    public q41(hv hvVar) {
        this.GWasM1elztuh = hvVar;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean GWasM1elztuh(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q41.GWasM1elztuh(java.util.Set):boolean");
    }

    public final void X1lG3V04pd(Object obj, Object obj2) {
        hg0 hg0Var = this.OOA6hdeuvCS;
        b70.ozMwhSAI(hg0Var, obj2, obj);
        if (!(obj2 instanceof ml) || hg0Var.X1lG3V04pd(obj2)) {
            return;
        }
        b70.AEn1Rrio(this.E7jCp8Ls, obj2);
        this.XnEVoBF0td1l.remove(obj2);
    }

    public final void Yi7zF1RB1(Object obj, int i, Object obj2, zf0 zf0Var) {
        int i2;
        if (this.rQPn8YBR > 0) {
            return;
        }
        int X1lG3V04pd = zf0Var.X1lG3V04pd(obj);
        if (X1lG3V04pd < 0) {
            X1lG3V04pd = ~X1lG3V04pd;
            i2 = -1;
        } else {
            i2 = zf0Var.X1lG3V04pd[X1lG3V04pd];
        }
        zf0Var.Yi7zF1RB1[X1lG3V04pd] = obj;
        zf0Var.X1lG3V04pd[X1lG3V04pd] = i;
        if ((obj instanceof ml) && i2 != i) {
            ll encWxUiV2 = ((ml) obj).encWxUiV2();
            this.XnEVoBF0td1l.put(obj, encWxUiV2.EljAMC1QTz);
            zf0 zf0Var2 = encWxUiV2.OOA6hdeuvCS;
            hg0 hg0Var = this.E7jCp8Ls;
            b70.AEn1Rrio(hg0Var, obj);
            Object[] objArr = zf0Var2.Yi7zF1RB1;
            long[] jArr = zf0Var2.GWasM1elztuh;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                s51 s51Var = (s51) objArr[(i3 << 3) + i5];
                                if (s51Var instanceof t51) {
                                    ((t51) s51Var).EljAMC1QTz(2);
                                }
                                b70.E7jCp8Ls(hg0Var, s51Var, obj);
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
            if (obj instanceof t51) {
                ((t51) obj).EljAMC1QTz(2);
            }
            b70.E7jCp8Ls(this.OOA6hdeuvCS, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void xqGvceK5x() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long j3;
        hg0 hg0Var = this.EljAMC1QTz;
        long[] jArr3 = hg0Var.GWasM1elztuh;
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
                        Object obj = hg0Var.Yi7zF1RB1[i6];
                        j2 = j5;
                        zf0 zf0Var = (zf0) hg0Var.X1lG3V04pd[i6];
                        obj.getClass();
                        boolean Y6hRI1cF8 = ((hn0) obj).Y6hRI1cF8();
                        if (!Y6hRI1cF8) {
                            Object[] objArr = zf0Var.Yi7zF1RB1;
                            int[] iArr = zf0Var.X1lG3V04pd;
                            long[] jArr4 = zf0Var.GWasM1elztuh;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = Y6hRI1cF8;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                X1lG3V04pd(obj, obj2);
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
                                    Y6hRI1cF8 = z;
                                    jArr4 = jArr5;
                                    i7 = 8;
                                }
                                if (!z) {
                                    hg0Var.E7jCp8Ls(i6);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j4;
                        z = Y6hRI1cF8;
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
}
