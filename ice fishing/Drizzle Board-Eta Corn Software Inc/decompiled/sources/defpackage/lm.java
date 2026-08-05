package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class lm extends th0 {
    public static final int[] k3x7lurq = new int[2];

    public static void OnDfzHZD(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.th0
    public final void P7K7Inc8() {
        this.MdtA4re8 = null;
        this.Qr9iLBAD.MdtA4re8();
        this.jb9XjC4I.MdtA4re8();
        this.VgvYg0wo.MdtA4re8();
        this.b2ZJblxo = false;
    }

    @Override // defpackage.th0
    public final void VgvYg0wo() {
        ac acVar = this.Qr9iLBAD;
        if (acVar.eVhOlqcC) {
            this.NCTxEWno.TrssYQ34 = acVar.b2ZJblxo;
        }
    }

    @Override // defpackage.th0
    public final boolean k3x7lurq() {
        return this.wxUZMvaN != 3 || this.NCTxEWno.amk52bBQ == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r5 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02aa  */
    @Override // defpackage.yb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void qoPGr6Ce(yb ybVar) {
        float f;
        boolean z;
        float f2;
        float f3;
        float f4;
        int i;
        if (q70.k3x7lurq(this.eVhOlqcC) == 3) {
            t8 t8Var = this.NCTxEWno;
            ow5vqvCr(t8Var.eIA6dogk, t8Var.VhgXwMj9, 0);
            return;
        }
        zc zcVar = this.VgvYg0wo;
        boolean z2 = zcVar.eVhOlqcC;
        ac acVar = this.Qr9iLBAD;
        ac acVar2 = this.jb9XjC4I;
        if (!z2 && this.wxUZMvaN == 3) {
            t8 t8Var2 = this.NCTxEWno;
            int i2 = t8Var2.amk52bBQ;
            if (i2 == 2) {
                f = 0.5f;
                u8 u8Var = t8Var2.HdOGZAzC;
                if (u8Var != null) {
                    if (u8Var.wxUZMvaN.VgvYg0wo.eVhOlqcC) {
                        zcVar.wxUZMvaN((int) ((r5.b2ZJblxo * t8Var2.FySoLYna) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = t8Var2.KlHjfFWx;
                if (i3 == 0 || i3 == 3) {
                    sf0 sf0Var = t8Var2.VgvYg0wo;
                    ac acVar3 = sf0Var.Qr9iLBAD;
                    ac acVar4 = sf0Var.jb9XjC4I;
                    boolean z3 = t8Var2.eIA6dogk.P7K7Inc8 != null;
                    boolean z4 = t8Var2.pRiPUEwG.P7K7Inc8 != null;
                    boolean z5 = t8Var2.VhgXwMj9.P7K7Inc8 != null;
                    boolean z6 = t8Var2.aZz0PFXp.P7K7Inc8 != null;
                    f = 0.5f;
                    int i4 = t8Var2.gmkaJpmS;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = t8Var2.KRabZ4CU;
                        boolean z7 = acVar3.eVhOlqcC;
                        ArrayList arrayList = acVar3.ow5vqvCr;
                        int[] iArr = k3x7lurq;
                        if (z7 && acVar4.eVhOlqcC) {
                            if (acVar.MdtA4re8 && acVar2.MdtA4re8) {
                                OnDfzHZD(iArr, ((ac) acVar.ow5vqvCr.get(0)).b2ZJblxo + acVar.P7K7Inc8, ((ac) acVar2.ow5vqvCr.get(0)).b2ZJblxo - acVar2.P7K7Inc8, acVar3.b2ZJblxo + acVar3.P7K7Inc8, acVar4.b2ZJblxo - acVar4.P7K7Inc8, f5, i4);
                                zcVar.wxUZMvaN(iArr[0]);
                                this.NCTxEWno.VgvYg0wo.VgvYg0wo.wxUZMvaN(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (acVar.eVhOlqcC && acVar2.eVhOlqcC) {
                            if (!acVar3.MdtA4re8 || !acVar4.MdtA4re8) {
                                return;
                            }
                            OnDfzHZD(iArr, acVar.b2ZJblxo + acVar.P7K7Inc8, acVar2.b2ZJblxo - acVar2.P7K7Inc8, ((ac) arrayList.get(0)).b2ZJblxo + acVar3.P7K7Inc8, ((ac) acVar4.ow5vqvCr.get(0)).b2ZJblxo - acVar4.P7K7Inc8, f5, i4);
                            zcVar.wxUZMvaN(iArr[0]);
                            this.NCTxEWno.VgvYg0wo.VgvYg0wo.wxUZMvaN(iArr[1]);
                        }
                        if (!acVar.MdtA4re8 || !acVar2.MdtA4re8 || !acVar3.MdtA4re8 || !acVar4.MdtA4re8) {
                            return;
                        }
                        OnDfzHZD(iArr, ((ac) acVar.ow5vqvCr.get(0)).b2ZJblxo + acVar.P7K7Inc8, ((ac) acVar2.ow5vqvCr.get(0)).b2ZJblxo - acVar2.P7K7Inc8, ((ac) arrayList.get(0)).b2ZJblxo + acVar3.P7K7Inc8, ((ac) acVar4.ow5vqvCr.get(0)).b2ZJblxo - acVar4.P7K7Inc8, f5, i4);
                        zcVar.wxUZMvaN(iArr[0]);
                        this.NCTxEWno.VgvYg0wo.VgvYg0wo.wxUZMvaN(iArr[1]);
                    } else if (z3 && z5) {
                        if (!acVar.MdtA4re8 || !acVar2.MdtA4re8) {
                            return;
                        }
                        float f6 = t8Var2.KRabZ4CU;
                        int i5 = ((ac) acVar.ow5vqvCr.get(0)).b2ZJblxo + acVar.P7K7Inc8;
                        int i6 = ((ac) acVar2.ow5vqvCr.get(0)).b2ZJblxo - acVar2.P7K7Inc8;
                        if (i4 == -1 || i4 == 0) {
                            int b2ZJblxo = b2ZJblxo(i6 - i5, 0);
                            int i7 = (int) ((b2ZJblxo * f6) + 0.5f);
                            int b2ZJblxo2 = b2ZJblxo(i7, 1);
                            if (i7 != b2ZJblxo2) {
                                b2ZJblxo = (int) ((b2ZJblxo2 / f6) + 0.5f);
                            }
                            zcVar.wxUZMvaN(b2ZJblxo);
                            this.NCTxEWno.VgvYg0wo.VgvYg0wo.wxUZMvaN(b2ZJblxo2);
                        } else if (i4 == 1) {
                            int b2ZJblxo3 = b2ZJblxo(i6 - i5, 0);
                            int i8 = (int) ((b2ZJblxo3 / f6) + 0.5f);
                            int b2ZJblxo4 = b2ZJblxo(i8, 1);
                            if (i8 != b2ZJblxo4) {
                                b2ZJblxo3 = (int) ((b2ZJblxo4 * f6) + 0.5f);
                            }
                            zcVar.wxUZMvaN(b2ZJblxo3);
                            this.NCTxEWno.VgvYg0wo.VgvYg0wo.wxUZMvaN(b2ZJblxo4);
                        }
                    } else if (z4 && z6) {
                        if (!acVar3.MdtA4re8 || !acVar4.MdtA4re8) {
                            return;
                        }
                        float f7 = t8Var2.KRabZ4CU;
                        int i9 = ((ac) acVar3.ow5vqvCr.get(0)).b2ZJblxo + acVar3.P7K7Inc8;
                        int i10 = ((ac) acVar4.ow5vqvCr.get(0)).b2ZJblxo - acVar4.P7K7Inc8;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int b2ZJblxo5 = b2ZJblxo(i10 - i9, 1);
                                int i11 = (int) ((b2ZJblxo5 * f7) + 0.5f);
                                int b2ZJblxo6 = b2ZJblxo(i11, 0);
                                if (i11 != b2ZJblxo6) {
                                    b2ZJblxo5 = (int) ((b2ZJblxo6 / f7) + 0.5f);
                                }
                                zcVar.wxUZMvaN(b2ZJblxo6);
                                this.NCTxEWno.VgvYg0wo.VgvYg0wo.wxUZMvaN(b2ZJblxo5);
                            }
                        }
                        int b2ZJblxo7 = b2ZJblxo(i10 - i9, 1);
                        int i12 = (int) ((b2ZJblxo7 / f7) + 0.5f);
                        int b2ZJblxo8 = b2ZJblxo(i12, 0);
                        if (i12 != b2ZJblxo8) {
                            b2ZJblxo7 = (int) ((b2ZJblxo8 * f7) + 0.5f);
                        }
                        zcVar.wxUZMvaN(b2ZJblxo8);
                        this.NCTxEWno.VgvYg0wo.VgvYg0wo.wxUZMvaN(b2ZJblxo7);
                    }
                } else {
                    int i13 = t8Var2.gmkaJpmS;
                    if (i13 == -1) {
                        f2 = t8Var2.VgvYg0wo.VgvYg0wo.b2ZJblxo;
                        f3 = t8Var2.KRabZ4CU;
                    } else if (i13 == 0) {
                        f4 = t8Var2.VgvYg0wo.VgvYg0wo.b2ZJblxo / t8Var2.KRabZ4CU;
                        i = (int) (f4 + 0.5f);
                        zcVar.wxUZMvaN(i);
                    } else if (i13 != 1) {
                        i = 0;
                        zcVar.wxUZMvaN(i);
                    } else {
                        f2 = t8Var2.VgvYg0wo.VgvYg0wo.b2ZJblxo;
                        f3 = t8Var2.KRabZ4CU;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    zcVar.wxUZMvaN(i);
                }
            }
            z = acVar.MdtA4re8;
            ArrayList arrayList2 = acVar.ow5vqvCr;
            if (z) {
                return;
            }
            boolean z8 = acVar2.MdtA4re8;
            ArrayList arrayList3 = acVar2.ow5vqvCr;
            if (z8) {
                if (acVar.eVhOlqcC && acVar2.eVhOlqcC && zcVar.eVhOlqcC) {
                    return;
                }
                if (!zcVar.eVhOlqcC && this.wxUZMvaN == 3) {
                    t8 t8Var3 = this.NCTxEWno;
                    if (t8Var3.amk52bBQ == 0 && !t8Var3.RXQxj5Oe()) {
                        ac acVar5 = (ac) arrayList2.get(0);
                        ac acVar6 = (ac) arrayList3.get(0);
                        int i14 = acVar5.b2ZJblxo + acVar.P7K7Inc8;
                        int i15 = acVar6.b2ZJblxo + acVar2.P7K7Inc8;
                        acVar.wxUZMvaN(i14);
                        acVar2.wxUZMvaN(i15);
                        zcVar.wxUZMvaN(i15 - i14);
                        return;
                    }
                }
                if (!zcVar.eVhOlqcC && this.wxUZMvaN == 3 && this.qoPGr6Ce == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((ac) arrayList3.get(0)).b2ZJblxo + acVar2.P7K7Inc8) - (((ac) arrayList2.get(0)).b2ZJblxo + acVar.P7K7Inc8), zcVar.OnDfzHZD);
                    t8 t8Var4 = this.NCTxEWno;
                    int i16 = t8Var4.RXQxj5Oe;
                    int max = Math.max(t8Var4.I5GHvsYW, min);
                    if (i16 > 0) {
                        max = Math.min(i16, max);
                    }
                    zcVar.wxUZMvaN(max);
                }
                if (zcVar.eVhOlqcC) {
                    ac acVar7 = (ac) arrayList2.get(0);
                    ac acVar8 = (ac) arrayList3.get(0);
                    int i17 = acVar7.b2ZJblxo;
                    int i18 = acVar.P7K7Inc8 + i17;
                    int i19 = acVar8.b2ZJblxo;
                    int i20 = acVar2.P7K7Inc8 + i19;
                    float f8 = this.NCTxEWno.pP9Y2m6O;
                    if (acVar7 == acVar8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    acVar.wxUZMvaN((int) ((((i19 - i17) - zcVar.b2ZJblxo) * f8) + i17 + f));
                    acVar2.wxUZMvaN(acVar.b2ZJblxo + zcVar.b2ZJblxo);
                    return;
                }
                return;
            }
            return;
        }
        f = 0.5f;
        z = acVar.MdtA4re8;
        ArrayList arrayList22 = acVar.ow5vqvCr;
        if (z) {
        }
    }

    public final String toString() {
        return "HorizontalRun " + this.NCTxEWno.hGvurcGl;
    }

    @Override // defpackage.th0
    public final void wxUZMvaN() {
        t8 t8Var;
        u8 u8Var;
        int i;
        u8 u8Var2;
        u8 u8Var3;
        int i2;
        t8 t8Var2 = this.NCTxEWno;
        boolean z = t8Var2.qoPGr6Ce;
        zc zcVar = this.VgvYg0wo;
        if (z) {
            zcVar.wxUZMvaN(t8Var2.lDXGDhIF());
        }
        boolean z2 = zcVar.eVhOlqcC;
        ArrayList arrayList = zcVar.k3x7lurq;
        ArrayList arrayList2 = zcVar.ow5vqvCr;
        ac acVar = this.jb9XjC4I;
        ac acVar2 = this.Qr9iLBAD;
        if (!z2) {
            t8 t8Var3 = this.NCTxEWno;
            int i3 = t8Var3.N2kLh4D5[0];
            this.wxUZMvaN = i3;
            if (i3 != 3) {
                if (i3 == 4 && (u8Var3 = t8Var3.HdOGZAzC) != null && ((i2 = u8Var3.N2kLh4D5[0]) == 1 || i2 == 4)) {
                    int lDXGDhIF = (u8Var3.lDXGDhIF() - this.NCTxEWno.eIA6dogk.wxUZMvaN()) - this.NCTxEWno.VhgXwMj9.wxUZMvaN();
                    th0.NCTxEWno(acVar2, u8Var3.wxUZMvaN.Qr9iLBAD, this.NCTxEWno.eIA6dogk.wxUZMvaN());
                    th0.NCTxEWno(acVar, u8Var3.wxUZMvaN.jb9XjC4I, -this.NCTxEWno.VhgXwMj9.wxUZMvaN());
                    zcVar.wxUZMvaN(lDXGDhIF);
                    return;
                }
                if (i3 == 1) {
                    zcVar.wxUZMvaN(t8Var3.lDXGDhIF());
                }
            }
        } else if (this.wxUZMvaN == 4 && (u8Var = (t8Var = this.NCTxEWno).HdOGZAzC) != null && ((i = u8Var.N2kLh4D5[0]) == 1 || i == 4)) {
            th0.NCTxEWno(acVar2, u8Var.wxUZMvaN.Qr9iLBAD, t8Var.eIA6dogk.wxUZMvaN());
            th0.NCTxEWno(acVar, u8Var.wxUZMvaN.jb9XjC4I, -this.NCTxEWno.VhgXwMj9.wxUZMvaN());
            return;
        }
        if (zcVar.eVhOlqcC) {
            t8 t8Var4 = this.NCTxEWno;
            if (t8Var4.qoPGr6Ce) {
                e8[] e8VarArr = t8Var4.FXJmAAN1;
                e8 e8Var = e8VarArr[0];
                e8 e8Var2 = e8Var.P7K7Inc8;
                if (e8Var2 != null && e8VarArr[1].P7K7Inc8 != null) {
                    boolean RXQxj5Oe = t8Var4.RXQxj5Oe();
                    t8 t8Var5 = this.NCTxEWno;
                    if (RXQxj5Oe) {
                        acVar2.P7K7Inc8 = t8Var5.FXJmAAN1[0].wxUZMvaN();
                        acVar.P7K7Inc8 = -this.NCTxEWno.FXJmAAN1[1].wxUZMvaN();
                        return;
                    }
                    ac Qr9iLBAD = th0.Qr9iLBAD(t8Var5.FXJmAAN1[0]);
                    if (Qr9iLBAD != null) {
                        th0.NCTxEWno(acVar2, Qr9iLBAD, this.NCTxEWno.FXJmAAN1[0].wxUZMvaN());
                    }
                    ac Qr9iLBAD2 = th0.Qr9iLBAD(this.NCTxEWno.FXJmAAN1[1]);
                    if (Qr9iLBAD2 != null) {
                        th0.NCTxEWno(acVar, Qr9iLBAD2, -this.NCTxEWno.FXJmAAN1[1].wxUZMvaN());
                    }
                    acVar2.NCTxEWno = true;
                    acVar.NCTxEWno = true;
                    return;
                }
                if (e8Var2 != null) {
                    ac Qr9iLBAD3 = th0.Qr9iLBAD(e8Var);
                    if (Qr9iLBAD3 != null) {
                        th0.NCTxEWno(acVar2, Qr9iLBAD3, this.NCTxEWno.FXJmAAN1[0].wxUZMvaN());
                        th0.NCTxEWno(acVar, acVar2, zcVar.b2ZJblxo);
                        return;
                    }
                    return;
                }
                e8 e8Var3 = e8VarArr[1];
                if (e8Var3.P7K7Inc8 != null) {
                    ac Qr9iLBAD4 = th0.Qr9iLBAD(e8Var3);
                    if (Qr9iLBAD4 != null) {
                        th0.NCTxEWno(acVar, Qr9iLBAD4, -this.NCTxEWno.FXJmAAN1[1].wxUZMvaN());
                        th0.NCTxEWno(acVar2, acVar, -zcVar.b2ZJblxo);
                        return;
                    }
                    return;
                }
                if ((t8Var4 instanceof y1) || t8Var4.HdOGZAzC == null || t8Var4.b2ZJblxo(7).P7K7Inc8 != null) {
                    return;
                }
                t8 t8Var6 = this.NCTxEWno;
                th0.NCTxEWno(acVar2, t8Var6.HdOGZAzC.wxUZMvaN.Qr9iLBAD, t8Var6.sjUBp5pO());
                th0.NCTxEWno(acVar, acVar2, zcVar.b2ZJblxo);
                return;
            }
        }
        if (this.wxUZMvaN == 3) {
            t8 t8Var7 = this.NCTxEWno;
            int i4 = t8Var7.amk52bBQ;
            if (i4 == 2) {
                u8 u8Var4 = t8Var7.HdOGZAzC;
                if (u8Var4 != null) {
                    zc zcVar2 = u8Var4.VgvYg0wo.VgvYg0wo;
                    arrayList2.add(zcVar2);
                    zcVar2.k3x7lurq.add(zcVar);
                    zcVar.NCTxEWno = true;
                    arrayList.add(acVar2);
                    arrayList.add(acVar);
                }
            } else if (i4 == 3) {
                if (t8Var7.KlHjfFWx == 3) {
                    acVar2.qoPGr6Ce = this;
                    acVar.qoPGr6Ce = this;
                    sf0 sf0Var = t8Var7.VgvYg0wo;
                    sf0Var.Qr9iLBAD.qoPGr6Ce = this;
                    sf0Var.jb9XjC4I.qoPGr6Ce = this;
                    zcVar.qoPGr6Ce = this;
                    if (t8Var7.FySoLYna()) {
                        arrayList2.add(this.NCTxEWno.VgvYg0wo.VgvYg0wo);
                        this.NCTxEWno.VgvYg0wo.VgvYg0wo.k3x7lurq.add(zcVar);
                        sf0 sf0Var2 = this.NCTxEWno.VgvYg0wo;
                        sf0Var2.VgvYg0wo.qoPGr6Ce = this;
                        arrayList2.add(sf0Var2.Qr9iLBAD);
                        arrayList2.add(this.NCTxEWno.VgvYg0wo.jb9XjC4I);
                        this.NCTxEWno.VgvYg0wo.Qr9iLBAD.k3x7lurq.add(zcVar);
                        this.NCTxEWno.VgvYg0wo.jb9XjC4I.k3x7lurq.add(zcVar);
                    } else {
                        boolean RXQxj5Oe2 = this.NCTxEWno.RXQxj5Oe();
                        t8 t8Var8 = this.NCTxEWno;
                        if (RXQxj5Oe2) {
                            t8Var8.VgvYg0wo.VgvYg0wo.ow5vqvCr.add(zcVar);
                            arrayList.add(this.NCTxEWno.VgvYg0wo.VgvYg0wo);
                        } else {
                            t8Var8.VgvYg0wo.VgvYg0wo.ow5vqvCr.add(zcVar);
                        }
                    }
                } else {
                    zc zcVar3 = t8Var7.VgvYg0wo.VgvYg0wo;
                    arrayList2.add(zcVar3);
                    zcVar3.k3x7lurq.add(zcVar);
                    this.NCTxEWno.VgvYg0wo.Qr9iLBAD.k3x7lurq.add(zcVar);
                    this.NCTxEWno.VgvYg0wo.jb9XjC4I.k3x7lurq.add(zcVar);
                    zcVar.NCTxEWno = true;
                    arrayList.add(acVar2);
                    arrayList.add(acVar);
                    acVar2.ow5vqvCr.add(zcVar);
                    acVar.ow5vqvCr.add(zcVar);
                }
            }
        }
        t8 t8Var9 = this.NCTxEWno;
        e8[] e8VarArr2 = t8Var9.FXJmAAN1;
        e8 e8Var4 = e8VarArr2[0];
        e8 e8Var5 = e8Var4.P7K7Inc8;
        if (e8Var5 != null && e8VarArr2[1].P7K7Inc8 != null) {
            boolean RXQxj5Oe3 = t8Var9.RXQxj5Oe();
            t8 t8Var10 = this.NCTxEWno;
            if (RXQxj5Oe3) {
                acVar2.P7K7Inc8 = t8Var10.FXJmAAN1[0].wxUZMvaN();
                acVar.P7K7Inc8 = -this.NCTxEWno.FXJmAAN1[1].wxUZMvaN();
                return;
            }
            ac Qr9iLBAD5 = th0.Qr9iLBAD(t8Var10.FXJmAAN1[0]);
            ac Qr9iLBAD6 = th0.Qr9iLBAD(this.NCTxEWno.FXJmAAN1[1]);
            if (Qr9iLBAD5 != null) {
                Qr9iLBAD5.NCTxEWno(this);
            }
            if (Qr9iLBAD6 != null) {
                Qr9iLBAD6.NCTxEWno(this);
            }
            this.eVhOlqcC = 4;
            return;
        }
        if (e8Var5 != null) {
            ac Qr9iLBAD7 = th0.Qr9iLBAD(e8Var4);
            if (Qr9iLBAD7 != null) {
                th0.NCTxEWno(acVar2, Qr9iLBAD7, this.NCTxEWno.FXJmAAN1[0].wxUZMvaN());
                MdtA4re8(acVar, acVar2, 1, zcVar);
                return;
            }
            return;
        }
        e8 e8Var6 = e8VarArr2[1];
        if (e8Var6.P7K7Inc8 != null) {
            ac Qr9iLBAD8 = th0.Qr9iLBAD(e8Var6);
            if (Qr9iLBAD8 != null) {
                th0.NCTxEWno(acVar, Qr9iLBAD8, -this.NCTxEWno.FXJmAAN1[1].wxUZMvaN());
                MdtA4re8(acVar2, acVar, -1, zcVar);
                return;
            }
            return;
        }
        if ((t8Var9 instanceof y1) || (u8Var2 = t8Var9.HdOGZAzC) == null) {
            return;
        }
        th0.NCTxEWno(acVar2, u8Var2.wxUZMvaN.Qr9iLBAD, t8Var9.sjUBp5pO());
        MdtA4re8(acVar, acVar2, 1, zcVar);
    }

    public final void ygLcUYwZ() {
        this.b2ZJblxo = false;
        ac acVar = this.Qr9iLBAD;
        acVar.MdtA4re8();
        acVar.eVhOlqcC = false;
        ac acVar2 = this.jb9XjC4I;
        acVar2.MdtA4re8();
        acVar2.eVhOlqcC = false;
        this.VgvYg0wo.eVhOlqcC = false;
    }
}
