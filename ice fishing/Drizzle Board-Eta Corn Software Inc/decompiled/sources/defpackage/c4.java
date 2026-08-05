package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class c4 extends th0 {
    public final ArrayList k3x7lurq;
    public int ow5vqvCr;

    public c4(t8 t8Var, int i) {
        super(t8Var);
        t8 t8Var2;
        ArrayList arrayList = new ArrayList();
        this.k3x7lurq = arrayList;
        this.P7K7Inc8 = i;
        t8 t8Var3 = this.NCTxEWno;
        t8 k3x7lurq = t8Var3.k3x7lurq(i);
        while (true) {
            t8Var2 = t8Var3;
            t8Var3 = k3x7lurq;
            if (t8Var3 == null) {
                break;
            } else {
                k3x7lurq = t8Var3.k3x7lurq(this.P7K7Inc8);
            }
        }
        this.NCTxEWno = t8Var2;
        int i2 = this.P7K7Inc8;
        arrayList.add(i2 == 0 ? t8Var2.wxUZMvaN : i2 == 1 ? t8Var2.VgvYg0wo : null);
        t8 eVhOlqcC = t8Var2.eVhOlqcC(this.P7K7Inc8);
        while (eVhOlqcC != null) {
            int i3 = this.P7K7Inc8;
            arrayList.add(i3 == 0 ? eVhOlqcC.wxUZMvaN : i3 == 1 ? eVhOlqcC.VgvYg0wo : null);
            eVhOlqcC = eVhOlqcC.eVhOlqcC(this.P7K7Inc8);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            th0 th0Var = (th0) obj;
            int i5 = this.P7K7Inc8;
            if (i5 == 0) {
                th0Var.NCTxEWno.NCTxEWno = this;
            } else if (i5 == 1) {
                th0Var.NCTxEWno.MdtA4re8 = this;
            }
        }
        if (this.P7K7Inc8 == 0 && this.NCTxEWno.HdOGZAzC.D4B4MtvK && arrayList.size() > 1) {
            this.NCTxEWno = ((th0) arrayList.get(arrayList.size() - 1)).NCTxEWno;
        }
        int i6 = this.P7K7Inc8;
        t8 t8Var4 = this.NCTxEWno;
        this.ow5vqvCr = i6 == 0 ? t8Var4.Wi7iiXC4 : t8Var4.QT4Tf9Dt;
    }

    public final t8 OnDfzHZD() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k3x7lurq;
            if (i >= arrayList.size()) {
                return null;
            }
            t8 t8Var = ((th0) arrayList.get(i)).NCTxEWno;
            if (t8Var.LvHlPNBd != 8) {
                return t8Var;
            }
            i++;
        }
    }

    @Override // defpackage.th0
    public final void P7K7Inc8() {
        this.MdtA4re8 = null;
        ArrayList arrayList = this.k3x7lurq;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((th0) obj).P7K7Inc8();
        }
    }

    @Override // defpackage.th0
    public final void VgvYg0wo() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k3x7lurq;
            if (i >= arrayList.size()) {
                return;
            }
            ((th0) arrayList.get(i)).VgvYg0wo();
            i++;
        }
    }

    @Override // defpackage.th0
    public final long eVhOlqcC() {
        ArrayList arrayList = this.k3x7lurq;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.jb9XjC4I.P7K7Inc8 + ((th0) arrayList.get(i)).eVhOlqcC() + j + r4.Qr9iLBAD.P7K7Inc8;
        }
        return j;
    }

    @Override // defpackage.th0
    public final boolean k3x7lurq() {
        ArrayList arrayList = this.k3x7lurq;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((th0) arrayList.get(i)).k3x7lurq()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x038c, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    @Override // defpackage.yb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void qoPGr6Ce(yb ybVar) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        ac acVar = this.Qr9iLBAD;
        if (acVar.eVhOlqcC) {
            ac acVar2 = this.jb9XjC4I;
            if (acVar2.eVhOlqcC) {
                u8 u8Var = this.NCTxEWno.HdOGZAzC;
                boolean z3 = u8Var != null ? u8Var.D4B4MtvK : false;
                int i14 = acVar2.b2ZJblxo - acVar.b2ZJblxo;
                ArrayList arrayList = this.k3x7lurq;
                int size = arrayList.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    } else if (((th0) arrayList.get(i15)).NCTxEWno.LvHlPNBd != 8) {
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = size - 1;
                int i17 = i16;
                while (true) {
                    if (i17 < 0) {
                        break;
                    }
                    if (((th0) arrayList.get(i17)).NCTxEWno.LvHlPNBd != 8) {
                        i = i17;
                        break;
                    }
                    i17--;
                }
                int i18 = 0;
                while (i18 < 2) {
                    f = 0.0f;
                    int i19 = 0;
                    i5 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    while (i19 < size) {
                        th0 th0Var = (th0) arrayList.get(i19);
                        t8 t8Var = th0Var.NCTxEWno;
                        boolean z4 = z3;
                        if (t8Var.LvHlPNBd == i2) {
                            i12 = i18;
                        } else {
                            i21++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += th0Var.Qr9iLBAD.P7K7Inc8;
                            }
                            zc zcVar = th0Var.VgvYg0wo;
                            int i22 = zcVar.b2ZJblxo;
                            i12 = i18;
                            boolean z5 = th0Var.wxUZMvaN != 3;
                            if (z5) {
                                int i23 = this.P7K7Inc8;
                                if (i23 == 0 && !t8Var.wxUZMvaN.VgvYg0wo.eVhOlqcC) {
                                    return;
                                }
                                if (i23 == 1 && !t8Var.VgvYg0wo.VgvYg0wo.eVhOlqcC) {
                                    return;
                                } else {
                                    z2 = z5;
                                }
                            } else {
                                z2 = z5;
                                if (th0Var.qoPGr6Ce == 1 && i12 == 0) {
                                    i13 = zcVar.OnDfzHZD;
                                    i20++;
                                } else if (zcVar.eVhOlqcC) {
                                    i13 = i22;
                                }
                                z2 = true;
                                if (z2) {
                                    i20++;
                                    float f3 = t8Var.orhfF2Ya[this.P7K7Inc8];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i13;
                                }
                                if (i19 < i16 && i19 < i) {
                                    i5 += -th0Var.jb9XjC4I.P7K7Inc8;
                                }
                            }
                            i13 = i22;
                            if (z2) {
                            }
                            if (i19 < i16) {
                                i5 += -th0Var.jb9XjC4I.P7K7Inc8;
                            }
                        }
                        i19++;
                        z3 = z4;
                        i18 = i12;
                        i2 = 8;
                    }
                    z = z3;
                    int i24 = i18;
                    if (i5 < i14 || i20 == 0) {
                        i3 = i20;
                        i4 = i21;
                        break;
                    } else {
                        i18 = i24 + 1;
                        z3 = z;
                        i2 = 8;
                    }
                }
                z = z3;
                f = 0.0f;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                int i25 = acVar.b2ZJblxo;
                if (z) {
                    i25 = acVar2.b2ZJblxo;
                }
                float f4 = 0.5f;
                if (i5 > i14) {
                    i25 = z ? i25 + ((int) (((i5 - i14) / 2.0f) + 0.5f)) : i25 - ((int) (((i5 - i14) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i14 - i5;
                    int i26 = (int) ((f5 / i3) + 0.5f);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < size) {
                        float f6 = f4;
                        th0 th0Var2 = (th0) arrayList.get(i27);
                        int i29 = i25;
                        t8 t8Var2 = th0Var2.NCTxEWno;
                        int i30 = i3;
                        zc zcVar2 = th0Var2.VgvYg0wo;
                        float f7 = f5;
                        int i31 = i26;
                        if (t8Var2.LvHlPNBd == 8 || th0Var2.wxUZMvaN != 3 || zcVar2.eVhOlqcC) {
                            i11 = i27;
                        } else {
                            int i32 = f > 0.0f ? (int) (((t8Var2.orhfF2Ya[this.P7K7Inc8] * f7) / f) + f6) : i31;
                            if (this.P7K7Inc8 == 0) {
                                i9 = t8Var2.RXQxj5Oe;
                                i10 = t8Var2.I5GHvsYW;
                            } else {
                                i9 = t8Var2.WYNAV5pd;
                                i10 = t8Var2.gjV1z5T1;
                            }
                            i11 = i27;
                            int max = Math.max(i10, th0Var2.qoPGr6Ce == 1 ? Math.min(i32, zcVar2.OnDfzHZD) : i32);
                            if (i9 > 0) {
                                max = Math.min(i9, max);
                            }
                            if (max != i32) {
                                i28++;
                                i32 = max;
                            }
                            zcVar2.wxUZMvaN(i32);
                        }
                        i27 = i11 + 1;
                        i25 = i29;
                        f4 = f6;
                        i3 = i30;
                        f5 = f7;
                        i26 = i31;
                    }
                    i6 = i25;
                    f2 = f4;
                    int i33 = i3;
                    if (i28 > 0) {
                        i3 = i33 - i28;
                        i5 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            th0 th0Var3 = (th0) arrayList.get(i34);
                            if (th0Var3.NCTxEWno.LvHlPNBd != 8) {
                                if (i34 > 0 && i34 >= i15) {
                                    i5 += th0Var3.Qr9iLBAD.P7K7Inc8;
                                }
                                i5 += th0Var3.VgvYg0wo.b2ZJblxo;
                                if (i34 < i16 && i34 < i) {
                                    i5 += -th0Var3.jb9XjC4I.P7K7Inc8;
                                }
                            }
                        }
                    } else {
                        i3 = i33;
                    }
                    i8 = 2;
                    if (this.ow5vqvCr == 2 && i28 == 0) {
                        i7 = 0;
                        this.ow5vqvCr = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i25;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i14) {
                    this.ow5vqvCr = i8;
                }
                if (i4 > 0 && i3 == 0 && i15 == i) {
                    this.ow5vqvCr = i8;
                }
                int i35 = this.ow5vqvCr;
                if (i35 == 1) {
                    int i36 = i4 > 1 ? (i14 - i5) / (i4 - 1) : i4 == 1 ? (i14 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        th0 th0Var4 = (th0) arrayList.get(z ? size - (i38 + 1) : i38);
                        t8 t8Var3 = th0Var4.NCTxEWno;
                        ac acVar3 = th0Var4.jb9XjC4I;
                        ac acVar4 = th0Var4.Qr9iLBAD;
                        if (t8Var3.LvHlPNBd == 8) {
                            acVar4.wxUZMvaN(i37);
                            acVar3.wxUZMvaN(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i15) {
                                i37 = z ? i37 - acVar4.P7K7Inc8 : i37 + acVar4.P7K7Inc8;
                            }
                            if (z) {
                                acVar3.wxUZMvaN(i37);
                            } else {
                                acVar4.wxUZMvaN(i37);
                            }
                            zc zcVar3 = th0Var4.VgvYg0wo;
                            int i39 = zcVar3.b2ZJblxo;
                            if (th0Var4.wxUZMvaN == 3 && th0Var4.qoPGr6Ce == 1) {
                                i39 = zcVar3.OnDfzHZD;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                acVar4.wxUZMvaN(i37);
                            } else {
                                acVar3.wxUZMvaN(i37);
                            }
                            th0Var4.b2ZJblxo = true;
                            if (i38 < i16 && i38 < i) {
                                i37 = z ? i37 - (-acVar3.P7K7Inc8) : i37 + (-acVar3.P7K7Inc8);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i14 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        th0 th0Var5 = (th0) arrayList.get(z ? size - (i42 + 1) : i42);
                        t8 t8Var4 = th0Var5.NCTxEWno;
                        ac acVar5 = th0Var5.jb9XjC4I;
                        ac acVar6 = th0Var5.Qr9iLBAD;
                        if (t8Var4.LvHlPNBd == 8) {
                            acVar6.wxUZMvaN(i41);
                            acVar5.wxUZMvaN(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i15) {
                                i43 = z ? i43 - acVar6.P7K7Inc8 : i43 + acVar6.P7K7Inc8;
                            }
                            if (z) {
                                acVar5.wxUZMvaN(i43);
                            } else {
                                acVar6.wxUZMvaN(i43);
                            }
                            zc zcVar4 = th0Var5.VgvYg0wo;
                            int i44 = zcVar4.b2ZJblxo;
                            if (th0Var5.wxUZMvaN == 3 && th0Var5.qoPGr6Ce == 1) {
                                i44 = Math.min(i44, zcVar4.OnDfzHZD);
                            }
                            i41 = z ? i43 - i44 : i43 + i44;
                            if (z) {
                                acVar6.wxUZMvaN(i41);
                            } else {
                                acVar5.wxUZMvaN(i41);
                            }
                            if (i42 < i16 && i42 < i) {
                                i41 = z ? i41 - (-acVar5.P7K7Inc8) : i41 + (-acVar5.P7K7Inc8);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    int i45 = this.P7K7Inc8;
                    t8 t8Var5 = this.NCTxEWno;
                    float f8 = i45 == 0 ? t8Var5.pP9Y2m6O : t8Var5.tef3qNMP;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i46 = (int) (((i14 - i5) * f8) + f2);
                    if (i46 < 0 || i3 > 0) {
                        i46 = i7;
                    }
                    int i47 = z ? i6 - i46 : i6 + i46;
                    for (int i48 = i7; i48 < size; i48++) {
                        th0 th0Var6 = (th0) arrayList.get(z ? size - (i48 + 1) : i48);
                        t8 t8Var6 = th0Var6.NCTxEWno;
                        ac acVar7 = th0Var6.jb9XjC4I;
                        ac acVar8 = th0Var6.Qr9iLBAD;
                        if (t8Var6.LvHlPNBd == 8) {
                            acVar8.wxUZMvaN(i47);
                            acVar7.wxUZMvaN(i47);
                        } else {
                            if (i48 > 0 && i48 >= i15) {
                                i47 = z ? i47 - acVar8.P7K7Inc8 : i47 + acVar8.P7K7Inc8;
                            }
                            if (z) {
                                acVar7.wxUZMvaN(i47);
                            } else {
                                acVar8.wxUZMvaN(i47);
                            }
                            zc zcVar5 = th0Var6.VgvYg0wo;
                            int i49 = zcVar5.b2ZJblxo;
                            if (th0Var6.wxUZMvaN == 3 && th0Var6.qoPGr6Ce == 1) {
                                i49 = zcVar5.OnDfzHZD;
                            }
                            i47 += i49;
                            if (z) {
                                acVar8.wxUZMvaN(i47);
                            } else {
                                acVar7.wxUZMvaN(i47);
                            }
                            if (i48 < i16 && i48 < i) {
                                i47 = z ? i47 - (-acVar7.P7K7Inc8) : i47 + (-acVar7.P7K7Inc8);
                            }
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.P7K7Inc8 == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.k3x7lurq;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((th0) obj);
            sb.append("> ");
        }
        return sb.toString();
    }

    @Override // defpackage.th0
    public final void wxUZMvaN() {
        ArrayList arrayList = this.k3x7lurq;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((th0) obj).wxUZMvaN();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        t8 t8Var = ((th0) arrayList.get(0)).NCTxEWno;
        t8 t8Var2 = ((th0) arrayList.get(size2 - 1)).NCTxEWno;
        int i2 = this.P7K7Inc8;
        ac acVar = this.jb9XjC4I;
        ac acVar2 = this.Qr9iLBAD;
        if (i2 == 0) {
            e8 e8Var = t8Var.eIA6dogk;
            e8 e8Var2 = t8Var2.VhgXwMj9;
            ac jb9XjC4I = th0.jb9XjC4I(e8Var, 0);
            int wxUZMvaN = e8Var.wxUZMvaN();
            t8 OnDfzHZD = OnDfzHZD();
            if (OnDfzHZD != null) {
                wxUZMvaN = OnDfzHZD.eIA6dogk.wxUZMvaN();
            }
            if (jb9XjC4I != null) {
                th0.NCTxEWno(acVar2, jb9XjC4I, wxUZMvaN);
            }
            ac jb9XjC4I2 = th0.jb9XjC4I(e8Var2, 0);
            int wxUZMvaN2 = e8Var2.wxUZMvaN();
            t8 ygLcUYwZ = ygLcUYwZ();
            if (ygLcUYwZ != null) {
                wxUZMvaN2 = ygLcUYwZ.VhgXwMj9.wxUZMvaN();
            }
            if (jb9XjC4I2 != null) {
                th0.NCTxEWno(acVar, jb9XjC4I2, -wxUZMvaN2);
            }
        } else {
            e8 e8Var3 = t8Var.pRiPUEwG;
            e8 e8Var4 = t8Var2.aZz0PFXp;
            ac jb9XjC4I3 = th0.jb9XjC4I(e8Var3, 1);
            int wxUZMvaN3 = e8Var3.wxUZMvaN();
            t8 OnDfzHZD2 = OnDfzHZD();
            if (OnDfzHZD2 != null) {
                wxUZMvaN3 = OnDfzHZD2.pRiPUEwG.wxUZMvaN();
            }
            if (jb9XjC4I3 != null) {
                th0.NCTxEWno(acVar2, jb9XjC4I3, wxUZMvaN3);
            }
            ac jb9XjC4I4 = th0.jb9XjC4I(e8Var4, 1);
            int wxUZMvaN4 = e8Var4.wxUZMvaN();
            t8 ygLcUYwZ2 = ygLcUYwZ();
            if (ygLcUYwZ2 != null) {
                wxUZMvaN4 = ygLcUYwZ2.aZz0PFXp.wxUZMvaN();
            }
            if (jb9XjC4I4 != null) {
                th0.NCTxEWno(acVar, jb9XjC4I4, -wxUZMvaN4);
            }
        }
        acVar2.qoPGr6Ce = this;
        acVar.qoPGr6Ce = this;
    }

    public final t8 ygLcUYwZ() {
        ArrayList arrayList = this.k3x7lurq;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t8 t8Var = ((th0) arrayList.get(size)).NCTxEWno;
            if (t8Var.LvHlPNBd != 8) {
                return t8Var;
            }
        }
        return null;
    }
}
