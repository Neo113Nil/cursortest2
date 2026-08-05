package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class sf0 extends th0 {
    public ac k3x7lurq;
    public d2 ow5vqvCr;

    public final void OnDfzHZD() {
        this.b2ZJblxo = false;
        ac acVar = this.Qr9iLBAD;
        acVar.MdtA4re8();
        acVar.eVhOlqcC = false;
        ac acVar2 = this.jb9XjC4I;
        acVar2.MdtA4re8();
        acVar2.eVhOlqcC = false;
        ac acVar3 = this.k3x7lurq;
        acVar3.MdtA4re8();
        acVar3.eVhOlqcC = false;
        this.VgvYg0wo.eVhOlqcC = false;
    }

    @Override // defpackage.th0
    public final void P7K7Inc8() {
        this.MdtA4re8 = null;
        this.Qr9iLBAD.MdtA4re8();
        this.jb9XjC4I.MdtA4re8();
        this.k3x7lurq.MdtA4re8();
        this.VgvYg0wo.MdtA4re8();
        this.b2ZJblxo = false;
    }

    @Override // defpackage.th0
    public final void VgvYg0wo() {
        ac acVar = this.Qr9iLBAD;
        if (acVar.eVhOlqcC) {
            this.NCTxEWno.g2aRJUAd = acVar.b2ZJblxo;
        }
    }

    @Override // defpackage.th0
    public final boolean k3x7lurq() {
        return this.wxUZMvaN != 3 || this.NCTxEWno.KlHjfFWx == 0;
    }

    @Override // defpackage.yb
    public final void qoPGr6Ce(yb ybVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (q70.k3x7lurq(this.eVhOlqcC) == 3) {
            t8 t8Var = this.NCTxEWno;
            ow5vqvCr(t8Var.pRiPUEwG, t8Var.aZz0PFXp, 1);
            return;
        }
        zc zcVar = this.VgvYg0wo;
        if (zcVar.MdtA4re8 && !zcVar.eVhOlqcC && this.wxUZMvaN == 3) {
            t8 t8Var2 = this.NCTxEWno;
            int i2 = t8Var2.KlHjfFWx;
            if (i2 == 2) {
                u8 u8Var = t8Var2.HdOGZAzC;
                if (u8Var != null) {
                    if (u8Var.VgvYg0wo.VgvYg0wo.eVhOlqcC) {
                        zcVar.wxUZMvaN((int) ((r5.b2ZJblxo * t8Var2.DK9slbsy) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                zc zcVar2 = t8Var2.wxUZMvaN.VgvYg0wo;
                if (zcVar2.eVhOlqcC) {
                    int i3 = t8Var2.gmkaJpmS;
                    if (i3 == -1) {
                        f = zcVar2.b2ZJblxo;
                        f2 = t8Var2.KRabZ4CU;
                    } else if (i3 == 0) {
                        f3 = zcVar2.b2ZJblxo * t8Var2.KRabZ4CU;
                        i = (int) (f3 + 0.5f);
                        zcVar.wxUZMvaN(i);
                    } else if (i3 != 1) {
                        i = 0;
                        zcVar.wxUZMvaN(i);
                    } else {
                        f = zcVar2.b2ZJblxo;
                        f2 = t8Var2.KRabZ4CU;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    zcVar.wxUZMvaN(i);
                }
            }
        }
        ac acVar = this.Qr9iLBAD;
        boolean z = acVar.MdtA4re8;
        ArrayList arrayList = acVar.ow5vqvCr;
        if (z) {
            ac acVar2 = this.jb9XjC4I;
            boolean z2 = acVar2.MdtA4re8;
            ArrayList arrayList2 = acVar2.ow5vqvCr;
            if (z2) {
                if (acVar.eVhOlqcC && acVar2.eVhOlqcC && zcVar.eVhOlqcC) {
                    return;
                }
                if (!zcVar.eVhOlqcC && this.wxUZMvaN == 3) {
                    t8 t8Var3 = this.NCTxEWno;
                    if (t8Var3.amk52bBQ == 0 && !t8Var3.FySoLYna()) {
                        ac acVar3 = (ac) arrayList.get(0);
                        ac acVar4 = (ac) arrayList2.get(0);
                        int i4 = acVar3.b2ZJblxo + acVar.P7K7Inc8;
                        int i5 = acVar4.b2ZJblxo + acVar2.P7K7Inc8;
                        acVar.wxUZMvaN(i4);
                        acVar2.wxUZMvaN(i5);
                        zcVar.wxUZMvaN(i5 - i4);
                        return;
                    }
                }
                if (!zcVar.eVhOlqcC && this.wxUZMvaN == 3 && this.qoPGr6Ce == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    ac acVar5 = (ac) arrayList.get(0);
                    int i6 = (((ac) arrayList2.get(0)).b2ZJblxo + acVar2.P7K7Inc8) - (acVar5.b2ZJblxo + acVar.P7K7Inc8);
                    int i7 = zcVar.OnDfzHZD;
                    if (i6 < i7) {
                        zcVar.wxUZMvaN(i6);
                    } else {
                        zcVar.wxUZMvaN(i7);
                    }
                }
                if (zcVar.eVhOlqcC && arrayList.size() > 0 && arrayList2.size() > 0) {
                    ac acVar6 = (ac) arrayList.get(0);
                    ac acVar7 = (ac) arrayList2.get(0);
                    int i8 = acVar6.b2ZJblxo;
                    int i9 = acVar.P7K7Inc8 + i8;
                    int i10 = acVar7.b2ZJblxo;
                    int i11 = acVar2.P7K7Inc8 + i10;
                    float f4 = this.NCTxEWno.tef3qNMP;
                    if (acVar6 == acVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    acVar.wxUZMvaN((int) ((((i10 - i8) - zcVar.b2ZJblxo) * f4) + i8 + 0.5f));
                    acVar2.wxUZMvaN(acVar.b2ZJblxo + zcVar.b2ZJblxo);
                }
            }
        }
    }

    public final String toString() {
        return "VerticalRun " + this.NCTxEWno.hGvurcGl;
    }

    @Override // defpackage.th0
    public final void wxUZMvaN() {
        t8 t8Var;
        u8 u8Var;
        u8 u8Var2;
        u8 u8Var3;
        ac acVar = this.k3x7lurq;
        t8 t8Var2 = this.NCTxEWno;
        boolean z = t8Var2.qoPGr6Ce;
        zc zcVar = this.VgvYg0wo;
        if (z) {
            zcVar.wxUZMvaN(t8Var2.jb9XjC4I());
        }
        boolean z2 = zcVar.eVhOlqcC;
        ArrayList arrayList = zcVar.k3x7lurq;
        ArrayList arrayList2 = zcVar.ow5vqvCr;
        ac acVar2 = this.jb9XjC4I;
        ac acVar3 = this.Qr9iLBAD;
        if (!z2) {
            t8 t8Var3 = this.NCTxEWno;
            this.wxUZMvaN = t8Var3.N2kLh4D5[1];
            if (t8Var3.euDDoUNr) {
                this.ow5vqvCr = new d2(this);
            }
            int i = this.wxUZMvaN;
            if (i != 3) {
                if (i == 4 && (u8Var3 = this.NCTxEWno.HdOGZAzC) != null && u8Var3.N2kLh4D5[1] == 1) {
                    int jb9XjC4I = (u8Var3.jb9XjC4I() - this.NCTxEWno.pRiPUEwG.wxUZMvaN()) - this.NCTxEWno.aZz0PFXp.wxUZMvaN();
                    th0.NCTxEWno(acVar3, u8Var3.VgvYg0wo.Qr9iLBAD, this.NCTxEWno.pRiPUEwG.wxUZMvaN());
                    th0.NCTxEWno(acVar2, u8Var3.VgvYg0wo.jb9XjC4I, -this.NCTxEWno.aZz0PFXp.wxUZMvaN());
                    zcVar.wxUZMvaN(jb9XjC4I);
                    return;
                }
                if (i == 1) {
                    zcVar.wxUZMvaN(this.NCTxEWno.jb9XjC4I());
                }
            }
        } else if (this.wxUZMvaN == 4 && (u8Var = (t8Var = this.NCTxEWno).HdOGZAzC) != null && u8Var.N2kLh4D5[1] == 1) {
            th0.NCTxEWno(acVar3, u8Var.VgvYg0wo.Qr9iLBAD, t8Var.pRiPUEwG.wxUZMvaN());
            th0.NCTxEWno(acVar2, u8Var.VgvYg0wo.jb9XjC4I, -this.NCTxEWno.aZz0PFXp.wxUZMvaN());
            return;
        }
        boolean z3 = zcVar.eVhOlqcC;
        if (z3) {
            t8 t8Var4 = this.NCTxEWno;
            if (t8Var4.qoPGr6Ce) {
                e8[] e8VarArr = t8Var4.FXJmAAN1;
                e8 e8Var = e8VarArr[2];
                e8 e8Var2 = e8Var.P7K7Inc8;
                if (e8Var2 != null && e8VarArr[3].P7K7Inc8 != null) {
                    boolean FySoLYna = t8Var4.FySoLYna();
                    t8 t8Var5 = this.NCTxEWno;
                    if (FySoLYna) {
                        acVar3.P7K7Inc8 = t8Var5.FXJmAAN1[2].wxUZMvaN();
                        acVar2.P7K7Inc8 = -this.NCTxEWno.FXJmAAN1[3].wxUZMvaN();
                    } else {
                        ac Qr9iLBAD = th0.Qr9iLBAD(t8Var5.FXJmAAN1[2]);
                        if (Qr9iLBAD != null) {
                            th0.NCTxEWno(acVar3, Qr9iLBAD, this.NCTxEWno.FXJmAAN1[2].wxUZMvaN());
                        }
                        ac Qr9iLBAD2 = th0.Qr9iLBAD(this.NCTxEWno.FXJmAAN1[3]);
                        if (Qr9iLBAD2 != null) {
                            th0.NCTxEWno(acVar2, Qr9iLBAD2, -this.NCTxEWno.FXJmAAN1[3].wxUZMvaN());
                        }
                        acVar3.NCTxEWno = true;
                        acVar2.NCTxEWno = true;
                    }
                    t8 t8Var6 = this.NCTxEWno;
                    if (t8Var6.euDDoUNr) {
                        th0.NCTxEWno(acVar, acVar3, t8Var6.ESscZ9M1);
                        return;
                    }
                    return;
                }
                if (e8Var2 != null) {
                    ac Qr9iLBAD3 = th0.Qr9iLBAD(e8Var);
                    if (Qr9iLBAD3 != null) {
                        th0.NCTxEWno(acVar3, Qr9iLBAD3, this.NCTxEWno.FXJmAAN1[2].wxUZMvaN());
                        th0.NCTxEWno(acVar2, acVar3, zcVar.b2ZJblxo);
                        t8 t8Var7 = this.NCTxEWno;
                        if (t8Var7.euDDoUNr) {
                            th0.NCTxEWno(acVar, acVar3, t8Var7.ESscZ9M1);
                            return;
                        }
                        return;
                    }
                    return;
                }
                e8 e8Var3 = e8VarArr[3];
                if (e8Var3.P7K7Inc8 != null) {
                    ac Qr9iLBAD4 = th0.Qr9iLBAD(e8Var3);
                    if (Qr9iLBAD4 != null) {
                        th0.NCTxEWno(acVar2, Qr9iLBAD4, -this.NCTxEWno.FXJmAAN1[3].wxUZMvaN());
                        th0.NCTxEWno(acVar3, acVar2, -zcVar.b2ZJblxo);
                    }
                    t8 t8Var8 = this.NCTxEWno;
                    if (t8Var8.euDDoUNr) {
                        th0.NCTxEWno(acVar, acVar3, t8Var8.ESscZ9M1);
                        return;
                    }
                    return;
                }
                e8 e8Var4 = e8VarArr[4];
                if (e8Var4.P7K7Inc8 != null) {
                    ac Qr9iLBAD5 = th0.Qr9iLBAD(e8Var4);
                    if (Qr9iLBAD5 != null) {
                        th0.NCTxEWno(acVar, Qr9iLBAD5, 0);
                        th0.NCTxEWno(acVar3, acVar, -this.NCTxEWno.ESscZ9M1);
                        th0.NCTxEWno(acVar2, acVar3, zcVar.b2ZJblxo);
                        return;
                    }
                    return;
                }
                if ((t8Var4 instanceof y1) || t8Var4.HdOGZAzC == null || t8Var4.b2ZJblxo(7).P7K7Inc8 != null) {
                    return;
                }
                t8 t8Var9 = this.NCTxEWno;
                th0.NCTxEWno(acVar3, t8Var9.HdOGZAzC.VgvYg0wo.Qr9iLBAD, t8Var9.OxcuoDLp());
                th0.NCTxEWno(acVar2, acVar3, zcVar.b2ZJblxo);
                t8 t8Var10 = this.NCTxEWno;
                if (t8Var10.euDDoUNr) {
                    th0.NCTxEWno(acVar, acVar3, t8Var10.ESscZ9M1);
                    return;
                }
                return;
            }
        }
        if (z3 || this.wxUZMvaN != 3) {
            zcVar.NCTxEWno(this);
        } else {
            t8 t8Var11 = this.NCTxEWno;
            int i2 = t8Var11.KlHjfFWx;
            if (i2 == 2) {
                u8 u8Var4 = t8Var11.HdOGZAzC;
                if (u8Var4 != null) {
                    zc zcVar2 = u8Var4.VgvYg0wo.VgvYg0wo;
                    arrayList2.add(zcVar2);
                    zcVar2.k3x7lurq.add(zcVar);
                    zcVar.NCTxEWno = true;
                    arrayList.add(acVar3);
                    arrayList.add(acVar2);
                }
            } else if (i2 == 3 && !t8Var11.FySoLYna()) {
                t8 t8Var12 = this.NCTxEWno;
                if (t8Var12.amk52bBQ != 3) {
                    zc zcVar3 = t8Var12.wxUZMvaN.VgvYg0wo;
                    arrayList2.add(zcVar3);
                    zcVar3.k3x7lurq.add(zcVar);
                    zcVar.NCTxEWno = true;
                    arrayList.add(acVar3);
                    arrayList.add(acVar2);
                }
            }
        }
        t8 t8Var13 = this.NCTxEWno;
        e8[] e8VarArr2 = t8Var13.FXJmAAN1;
        e8 e8Var5 = e8VarArr2[2];
        e8 e8Var6 = e8Var5.P7K7Inc8;
        if (e8Var6 != null && e8VarArr2[3].P7K7Inc8 != null) {
            boolean FySoLYna2 = t8Var13.FySoLYna();
            t8 t8Var14 = this.NCTxEWno;
            if (FySoLYna2) {
                acVar3.P7K7Inc8 = t8Var14.FXJmAAN1[2].wxUZMvaN();
                acVar2.P7K7Inc8 = -this.NCTxEWno.FXJmAAN1[3].wxUZMvaN();
            } else {
                ac Qr9iLBAD6 = th0.Qr9iLBAD(t8Var14.FXJmAAN1[2]);
                ac Qr9iLBAD7 = th0.Qr9iLBAD(this.NCTxEWno.FXJmAAN1[3]);
                if (Qr9iLBAD6 != null) {
                    Qr9iLBAD6.NCTxEWno(this);
                }
                if (Qr9iLBAD7 != null) {
                    Qr9iLBAD7.NCTxEWno(this);
                }
                this.eVhOlqcC = 4;
            }
            if (this.NCTxEWno.euDDoUNr) {
                MdtA4re8(acVar, acVar3, 1, this.ow5vqvCr);
            }
        } else if (e8Var6 != null) {
            ac Qr9iLBAD8 = th0.Qr9iLBAD(e8Var5);
            if (Qr9iLBAD8 != null) {
                th0.NCTxEWno(acVar3, Qr9iLBAD8, this.NCTxEWno.FXJmAAN1[2].wxUZMvaN());
                MdtA4re8(acVar2, acVar3, 1, zcVar);
                if (this.NCTxEWno.euDDoUNr) {
                    MdtA4re8(acVar, acVar3, 1, this.ow5vqvCr);
                }
                if (this.wxUZMvaN == 3) {
                    t8 t8Var15 = this.NCTxEWno;
                    if (t8Var15.KRabZ4CU > 0.0f) {
                        lm lmVar = t8Var15.wxUZMvaN;
                        if (lmVar.wxUZMvaN == 3) {
                            lmVar.VgvYg0wo.k3x7lurq.add(zcVar);
                            arrayList2.add(this.NCTxEWno.wxUZMvaN.VgvYg0wo);
                            zcVar.qoPGr6Ce = this;
                        }
                    }
                }
            }
        } else {
            e8 e8Var7 = e8VarArr2[3];
            if (e8Var7.P7K7Inc8 != null) {
                ac Qr9iLBAD9 = th0.Qr9iLBAD(e8Var7);
                if (Qr9iLBAD9 != null) {
                    th0.NCTxEWno(acVar2, Qr9iLBAD9, -this.NCTxEWno.FXJmAAN1[3].wxUZMvaN());
                    MdtA4re8(acVar3, acVar2, -1, zcVar);
                    if (this.NCTxEWno.euDDoUNr) {
                        MdtA4re8(acVar, acVar3, 1, this.ow5vqvCr);
                    }
                }
            } else {
                e8 e8Var8 = e8VarArr2[4];
                if (e8Var8.P7K7Inc8 != null) {
                    ac Qr9iLBAD10 = th0.Qr9iLBAD(e8Var8);
                    if (Qr9iLBAD10 != null) {
                        th0.NCTxEWno(acVar, Qr9iLBAD10, 0);
                        MdtA4re8(acVar3, acVar, -1, this.ow5vqvCr);
                        MdtA4re8(acVar2, acVar3, 1, zcVar);
                    }
                } else if (!(t8Var13 instanceof y1) && (u8Var2 = t8Var13.HdOGZAzC) != null) {
                    th0.NCTxEWno(acVar3, u8Var2.VgvYg0wo.Qr9iLBAD, t8Var13.OxcuoDLp());
                    MdtA4re8(acVar2, acVar3, 1, zcVar);
                    if (this.NCTxEWno.euDDoUNr) {
                        MdtA4re8(acVar, acVar3, 1, this.ow5vqvCr);
                    }
                    if (this.wxUZMvaN == 3) {
                        t8 t8Var16 = this.NCTxEWno;
                        if (t8Var16.KRabZ4CU > 0.0f) {
                            lm lmVar2 = t8Var16.wxUZMvaN;
                            if (lmVar2.wxUZMvaN == 3) {
                                lmVar2.VgvYg0wo.k3x7lurq.add(zcVar);
                                arrayList2.add(this.NCTxEWno.wxUZMvaN.VgvYg0wo);
                                zcVar.qoPGr6Ce = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            zcVar.MdtA4re8 = true;
        }
    }
}
