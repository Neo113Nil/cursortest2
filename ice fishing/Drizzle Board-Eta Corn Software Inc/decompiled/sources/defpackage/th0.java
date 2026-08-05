package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class th0 implements yb {
    public e40 MdtA4re8;
    public t8 NCTxEWno;
    public int qoPGr6Ce;
    public int wxUZMvaN;
    public final zc VgvYg0wo = new zc(this);
    public int P7K7Inc8 = 0;
    public boolean b2ZJblxo = false;
    public final ac Qr9iLBAD = new ac(this);
    public final ac jb9XjC4I = new ac(this);
    public int eVhOlqcC = 1;

    public th0(t8 t8Var) {
        this.NCTxEWno = t8Var;
    }

    public static void NCTxEWno(ac acVar, ac acVar2, int i) {
        acVar.ow5vqvCr.add(acVar2);
        acVar.P7K7Inc8 = i;
        acVar2.k3x7lurq.add(acVar);
    }

    public static ac Qr9iLBAD(e8 e8Var) {
        e8 e8Var2 = e8Var.P7K7Inc8;
        if (e8Var2 == null) {
            return null;
        }
        t8 t8Var = e8Var2.wxUZMvaN;
        int k3x7lurq = q70.k3x7lurq(e8Var2.VgvYg0wo);
        if (k3x7lurq == 1) {
            return t8Var.wxUZMvaN.Qr9iLBAD;
        }
        if (k3x7lurq == 2) {
            return t8Var.VgvYg0wo.Qr9iLBAD;
        }
        if (k3x7lurq == 3) {
            return t8Var.wxUZMvaN.jb9XjC4I;
        }
        if (k3x7lurq == 4) {
            return t8Var.VgvYg0wo.jb9XjC4I;
        }
        if (k3x7lurq != 5) {
            return null;
        }
        return t8Var.VgvYg0wo.k3x7lurq;
    }

    public static ac jb9XjC4I(e8 e8Var, int i) {
        e8 e8Var2 = e8Var.P7K7Inc8;
        if (e8Var2 == null) {
            return null;
        }
        t8 t8Var = e8Var2.wxUZMvaN;
        th0 th0Var = i == 0 ? t8Var.wxUZMvaN : t8Var.VgvYg0wo;
        int k3x7lurq = q70.k3x7lurq(e8Var2.VgvYg0wo);
        if (k3x7lurq == 1 || k3x7lurq == 2) {
            return th0Var.Qr9iLBAD;
        }
        if (k3x7lurq == 3 || k3x7lurq == 4) {
            return th0Var.jb9XjC4I;
        }
        return null;
    }

    public final void MdtA4re8(ac acVar, ac acVar2, int i, zc zcVar) {
        acVar.ow5vqvCr.add(acVar2);
        acVar.ow5vqvCr.add(this.VgvYg0wo);
        acVar.Qr9iLBAD = i;
        acVar.jb9XjC4I = zcVar;
        acVar2.k3x7lurq.add(acVar);
        zcVar.k3x7lurq.add(acVar);
    }

    public abstract void P7K7Inc8();

    public abstract void VgvYg0wo();

    public final int b2ZJblxo(int i, int i2) {
        t8 t8Var = this.NCTxEWno;
        if (i2 == 0) {
            int i3 = t8Var.RXQxj5Oe;
            int max = Math.max(t8Var.I5GHvsYW, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = t8Var.WYNAV5pd;
            int max2 = Math.max(t8Var.gjV1z5T1, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long eVhOlqcC() {
        if (this.VgvYg0wo.eVhOlqcC) {
            return r2.b2ZJblxo;
        }
        return 0L;
    }

    public abstract boolean k3x7lurq();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.qoPGr6Ce == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ow5vqvCr(e8 e8Var, e8 e8Var2, int i) {
        ac Qr9iLBAD = Qr9iLBAD(e8Var);
        ac Qr9iLBAD2 = Qr9iLBAD(e8Var2);
        if (Qr9iLBAD.eVhOlqcC && Qr9iLBAD2.eVhOlqcC) {
            int wxUZMvaN = e8Var.wxUZMvaN() + Qr9iLBAD.b2ZJblxo;
            int wxUZMvaN2 = Qr9iLBAD2.b2ZJblxo - e8Var2.wxUZMvaN();
            int i2 = wxUZMvaN2 - wxUZMvaN;
            zc zcVar = this.VgvYg0wo;
            if (!zcVar.eVhOlqcC && this.wxUZMvaN == 3) {
                int i3 = this.qoPGr6Ce;
                if (i3 == 0) {
                    zcVar.wxUZMvaN(b2ZJblxo(i2, i));
                } else if (i3 == 1) {
                    zcVar.wxUZMvaN(Math.min(b2ZJblxo(zcVar.OnDfzHZD, i), i2));
                } else if (i3 == 2) {
                    t8 t8Var = this.NCTxEWno;
                    u8 u8Var = t8Var.HdOGZAzC;
                    if (u8Var != null) {
                        if ((i == 0 ? u8Var.wxUZMvaN : u8Var.VgvYg0wo).VgvYg0wo.eVhOlqcC) {
                            zcVar.wxUZMvaN(b2ZJblxo((int) ((r6.b2ZJblxo * (i == 0 ? t8Var.FySoLYna : t8Var.DK9slbsy)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    t8 t8Var2 = this.NCTxEWno;
                    th0 th0Var = t8Var2.wxUZMvaN;
                    if (th0Var.wxUZMvaN == 3 && th0Var.qoPGr6Ce == 3) {
                        sf0 sf0Var = t8Var2.VgvYg0wo;
                        if (sf0Var.wxUZMvaN == 3) {
                        }
                    }
                    if (i == 0) {
                        th0Var = t8Var2.VgvYg0wo;
                    }
                    zc zcVar2 = th0Var.VgvYg0wo;
                    if (zcVar2.eVhOlqcC) {
                        float f = t8Var2.KRabZ4CU;
                        int i4 = zcVar2.b2ZJblxo;
                        zcVar.wxUZMvaN(i == 1 ? (int) ((i4 / f) + 0.5f) : (int) ((f * i4) + 0.5f));
                    }
                }
            }
            if (zcVar.eVhOlqcC) {
                int i5 = zcVar.b2ZJblxo;
                ac acVar = this.jb9XjC4I;
                ac acVar2 = this.Qr9iLBAD;
                if (i5 == i2) {
                    acVar2.wxUZMvaN(wxUZMvaN);
                    acVar.wxUZMvaN(wxUZMvaN2);
                    return;
                }
                t8 t8Var3 = this.NCTxEWno;
                float f2 = i == 0 ? t8Var3.pP9Y2m6O : t8Var3.tef3qNMP;
                if (Qr9iLBAD == Qr9iLBAD2) {
                    wxUZMvaN = Qr9iLBAD.b2ZJblxo;
                    wxUZMvaN2 = Qr9iLBAD2.b2ZJblxo;
                    f2 = 0.5f;
                }
                acVar2.wxUZMvaN((int) ((((wxUZMvaN2 - wxUZMvaN) - i5) * f2) + wxUZMvaN + 0.5f));
                acVar.wxUZMvaN(acVar2.b2ZJblxo + zcVar.b2ZJblxo);
            }
        }
    }

    public abstract void wxUZMvaN();
}
