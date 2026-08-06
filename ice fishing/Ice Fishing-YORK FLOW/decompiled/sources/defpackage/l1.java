package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class l1 {
    public final defpackage.pw0 JhCgjQRTAOCT;
    public long P05cfTpS5W5L;
    public long QiMR8OkAhezm;
    public final boolean WDYagTQQm9ns;
    public final defpackage.hp ZpBGe2uQfcn8;
    public final defpackage.xo e6mdH7fiFuta;
    public final defpackage.rt fWTAfUmVKrZq;
    public long giKS3J6vZuNy = 9205357640488583168L;
    public boolean oh71FJcDz6S2;

    public l1(android.content.Context context, defpackage.hp hpVar, long j, defpackage.wv0 wv0Var) {
        this.ZpBGe2uQfcn8 = hpVar;
        defpackage.rt rtVar = new defpackage.rt(context, defpackage.ok0.PS16moFv2oLu(j));
        this.fWTAfUmVKrZq = rtVar;
        this.JhCgjQRTAOCT = new defpackage.pw0(defpackage.gs1.ZpBGe2uQfcn8, defpackage.jVUAPb5NnIYW.z16KqenTjq8o);
        this.WDYagTQQm9ns = true;
        this.QiMR8OkAhezm = 0L;
        this.P05cfTpS5W5L = -1L;
        defpackage.k1 k1Var = new defpackage.k1(0, this);
        defpackage.vz0 vz0Var = defpackage.oi1.ZpBGe2uQfcn8;
        defpackage.si1 si1Var = new defpackage.si1(null, null, k1Var);
        this.e6mdH7fiFuta = android.os.Build.VERSION.SDK_INT >= 31 ? new defpackage.x30(si1Var, this, rtVar) : new defpackage.x30(si1Var, this, rtVar, wv0Var);
    }

    public final void JhCgjQRTAOCT() {
        if (this.WDYagTQQm9ns) {
            this.JhCgjQRTAOCT.setValue(defpackage.gs1.ZpBGe2uQfcn8);
        }
    }

    public final float P05cfTpS5W5L(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (fWTAfUmVKrZq() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.QiMR8OkAhezm & 4294967295L));
        android.widget.EdgeEffect WDYagTQQm9ns = this.fWTAfUmVKrZq.WDYagTQQm9ns();
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = defpackage.s6.JhCgjQRTAOCT(WDYagTQQm9ns, intBitsToFloat2, intBitsToFloat);
        } else {
            WDYagTQQm9ns.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i2 >= 31 ? defpackage.s6.fWTAfUmVKrZq(WDYagTQQm9ns) : 0.0f) == 0.0f ? java.lang.Float.intBitsToFloat((int) (this.QiMR8OkAhezm & 4294967295L)) * intBitsToFloat2 : java.lang.Float.intBitsToFloat(i);
    }

    public final float QiMR8OkAhezm(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (fWTAfUmVKrZq() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.QiMR8OkAhezm >> 32));
        android.widget.EdgeEffect JhCgjQRTAOCT = this.fWTAfUmVKrZq.JhCgjQRTAOCT();
        float f = -intBitsToFloat2;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = defpackage.s6.JhCgjQRTAOCT(JhCgjQRTAOCT, f, intBitsToFloat);
        } else {
            JhCgjQRTAOCT.onPull(f, intBitsToFloat);
        }
        return (i2 >= 31 ? defpackage.s6.fWTAfUmVKrZq(JhCgjQRTAOCT) : 0.0f) == 0.0f ? java.lang.Float.intBitsToFloat((int) (this.QiMR8OkAhezm >> 32)) * (-f) : java.lang.Float.intBitsToFloat(i);
    }

    public final float WDYagTQQm9ns(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (fWTAfUmVKrZq() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.QiMR8OkAhezm & 4294967295L));
        android.widget.EdgeEffect giKS3J6vZuNy = this.fWTAfUmVKrZq.giKS3J6vZuNy();
        float f = -intBitsToFloat2;
        float f2 = 1.0f - intBitsToFloat;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = defpackage.s6.JhCgjQRTAOCT(giKS3J6vZuNy, f, f2);
        } else {
            giKS3J6vZuNy.onPull(f, f2);
        }
        return (i2 >= 31 ? defpackage.s6.fWTAfUmVKrZq(giKS3J6vZuNy) : 0.0f) == 0.0f ? java.lang.Float.intBitsToFloat((int) (4294967295L & this.QiMR8OkAhezm)) * (-f) : java.lang.Float.intBitsToFloat(i);
    }

    public final void ZpBGe2uQfcn8() {
        boolean z;
        defpackage.rt rtVar = this.fWTAfUmVKrZq;
        android.widget.EdgeEffect edgeEffect = rtVar.JhCgjQRTAOCT;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        android.widget.EdgeEffect edgeEffect2 = rtVar.WDYagTQQm9ns;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        android.widget.EdgeEffect edgeEffect3 = rtVar.oh71FJcDz6S2;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        android.widget.EdgeEffect edgeEffect4 = rtVar.QiMR8OkAhezm;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            JhCgjQRTAOCT();
        }
    }

    public final void e6mdH7fiFuta(long j) {
        boolean ZpBGe2uQfcn8 = defpackage.ae1.ZpBGe2uQfcn8(this.QiMR8OkAhezm, 0L);
        boolean ZpBGe2uQfcn82 = defpackage.ae1.ZpBGe2uQfcn8(j, this.QiMR8OkAhezm);
        this.QiMR8OkAhezm = j;
        if (!ZpBGe2uQfcn82) {
            long CZa7MwI9IzLd = (defpackage.ok0.CZa7MwI9IzLd(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (defpackage.ok0.CZa7MwI9IzLd(java.lang.Float.intBitsToFloat((int) (j >> 32))) << 32);
            defpackage.rt rtVar = this.fWTAfUmVKrZq;
            rtVar.fWTAfUmVKrZq = CZa7MwI9IzLd;
            android.widget.EdgeEffect edgeEffect = rtVar.JhCgjQRTAOCT;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (CZa7MwI9IzLd >> 32), (int) (CZa7MwI9IzLd & 4294967295L));
            }
            android.widget.EdgeEffect edgeEffect2 = rtVar.WDYagTQQm9ns;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (CZa7MwI9IzLd >> 32), (int) (CZa7MwI9IzLd & 4294967295L));
            }
            android.widget.EdgeEffect edgeEffect3 = rtVar.oh71FJcDz6S2;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (CZa7MwI9IzLd & 4294967295L), (int) (CZa7MwI9IzLd >> 32));
            }
            android.widget.EdgeEffect edgeEffect4 = rtVar.QiMR8OkAhezm;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (CZa7MwI9IzLd & 4294967295L), (int) (CZa7MwI9IzLd >> 32));
            }
            android.widget.EdgeEffect edgeEffect5 = rtVar.P05cfTpS5W5L;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (CZa7MwI9IzLd >> 32), (int) (CZa7MwI9IzLd & 4294967295L));
            }
            android.widget.EdgeEffect edgeEffect6 = rtVar.e6mdH7fiFuta;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (CZa7MwI9IzLd >> 32), (int) (CZa7MwI9IzLd & 4294967295L));
            }
            android.widget.EdgeEffect edgeEffect7 = rtVar.GE9mJIPrb8gP;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (CZa7MwI9IzLd & 4294967295L), (int) (CZa7MwI9IzLd >> 32));
            }
            android.widget.EdgeEffect edgeEffect8 = rtVar.Ns0WNyEWdPsk;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & CZa7MwI9IzLd), (int) (CZa7MwI9IzLd >> 32));
            }
        }
        if (ZpBGe2uQfcn8 || ZpBGe2uQfcn82) {
            return;
        }
        ZpBGe2uQfcn8();
    }

    public final long fWTAfUmVKrZq() {
        long j = this.giKS3J6vZuNy;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = defpackage.v70.s0TASMVLSWD5(this.QiMR8OkAhezm);
        }
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / java.lang.Float.intBitsToFloat((int) (this.QiMR8OkAhezm >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (this.QiMR8OkAhezm & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0137, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object giKS3J6vZuNy(long j, defpackage.x91 x91Var, defpackage.ll llVar) {
        defpackage.i1 i1Var;
        int i;
        long JhCgjQRTAOCT;
        long JhCgjQRTAOCT2;
        if (llVar instanceof defpackage.i1) {
            i1Var = (defpackage.i1) llVar;
            int i2 = i1Var.Ns0WNyEWdPsk;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i1Var.Ns0WNyEWdPsk = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = i1Var.e6mdH7fiFuta;
                i = i1Var.Ns0WNyEWdPsk;
                defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                defpackage.rt rtVar = this.fWTAfUmVKrZq;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    boolean fWTAfUmVKrZq = defpackage.ae1.fWTAfUmVKrZq(this.QiMR8OkAhezm);
                    defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                    if (fWTAfUmVKrZq) {
                        i1Var.Ns0WNyEWdPsk = 1;
                        x91Var.getClass();
                        defpackage.x91 x91Var2 = new defpackage.x91(x91Var.fNwYGHIYeJcR, i1Var);
                        x91Var2.Ns0WNyEWdPsk = j;
                        if (x91Var2.s0TASMVLSWD5(gs1Var) != tmVar) {
                            return gs1Var;
                        }
                    } else {
                        boolean QiMR8OkAhezm = defpackage.rt.QiMR8OkAhezm(rtVar.oh71FJcDz6S2);
                        defpackage.hp hpVar = this.ZpBGe2uQfcn8;
                        long oh71FJcDz6S2 = defpackage.q70.oh71FJcDz6S2((!QiMR8OkAhezm || defpackage.jt1.giKS3J6vZuNy(j) >= 0.0f) ? (!defpackage.rt.QiMR8OkAhezm(rtVar.QiMR8OkAhezm) || defpackage.jt1.giKS3J6vZuNy(j) <= 0.0f) ? 0.0f : -defpackage.h0.gUjdnLbkVAaA(rtVar.JhCgjQRTAOCT(), -defpackage.jt1.giKS3J6vZuNy(j), java.lang.Float.intBitsToFloat((int) (this.QiMR8OkAhezm >> 32)), hpVar) : defpackage.h0.gUjdnLbkVAaA(rtVar.fWTAfUmVKrZq(), defpackage.jt1.giKS3J6vZuNy(j), java.lang.Float.intBitsToFloat((int) (this.QiMR8OkAhezm >> 32)), hpVar), (!defpackage.rt.QiMR8OkAhezm(rtVar.JhCgjQRTAOCT) || defpackage.jt1.fWTAfUmVKrZq(j) >= 0.0f) ? (!defpackage.rt.QiMR8OkAhezm(rtVar.WDYagTQQm9ns) || defpackage.jt1.fWTAfUmVKrZq(j) <= 0.0f) ? 0.0f : -defpackage.h0.gUjdnLbkVAaA(rtVar.giKS3J6vZuNy(), -defpackage.jt1.fWTAfUmVKrZq(j), java.lang.Float.intBitsToFloat((int) (this.QiMR8OkAhezm & 4294967295L)), hpVar) : defpackage.h0.gUjdnLbkVAaA(rtVar.WDYagTQQm9ns(), defpackage.jt1.fWTAfUmVKrZq(j), java.lang.Float.intBitsToFloat((int) (this.QiMR8OkAhezm & 4294967295L)), hpVar));
                        if (oh71FJcDz6S2 != 0) {
                            JhCgjQRTAOCT();
                        }
                        JhCgjQRTAOCT = defpackage.jt1.JhCgjQRTAOCT(j, oh71FJcDz6S2);
                        i1Var.P05cfTpS5W5L = JhCgjQRTAOCT;
                        i1Var.Ns0WNyEWdPsk = 2;
                        x91Var.getClass();
                        defpackage.x91 x91Var3 = new defpackage.x91(x91Var.fNwYGHIYeJcR, i1Var);
                        x91Var3.Ns0WNyEWdPsk = JhCgjQRTAOCT;
                        obj = x91Var3.s0TASMVLSWD5(gs1Var);
                    }
                    return tmVar;
                }
                if (i == 1) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    return gs1Var;
                }
                if (i != 2) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                JhCgjQRTAOCT = i1Var.P05cfTpS5W5L;
                defpackage.b80.KrtOTfE6jiS2(obj);
                JhCgjQRTAOCT2 = defpackage.jt1.JhCgjQRTAOCT(JhCgjQRTAOCT, ((defpackage.jt1) obj).ZpBGe2uQfcn8);
                this.oh71FJcDz6S2 = false;
                if (defpackage.jt1.giKS3J6vZuNy(JhCgjQRTAOCT2) <= 0.0f) {
                    android.widget.EdgeEffect fWTAfUmVKrZq2 = rtVar.fWTAfUmVKrZq();
                    int CZa7MwI9IzLd = defpackage.ok0.CZa7MwI9IzLd(defpackage.jt1.giKS3J6vZuNy(JhCgjQRTAOCT2));
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        fWTAfUmVKrZq2.onAbsorb(CZa7MwI9IzLd);
                    } else if (fWTAfUmVKrZq2.isFinished()) {
                        fWTAfUmVKrZq2.onAbsorb(CZa7MwI9IzLd);
                    }
                } else if (defpackage.jt1.giKS3J6vZuNy(JhCgjQRTAOCT2) < 0.0f) {
                    android.widget.EdgeEffect JhCgjQRTAOCT3 = rtVar.JhCgjQRTAOCT();
                    int i3 = -defpackage.ok0.CZa7MwI9IzLd(defpackage.jt1.giKS3J6vZuNy(JhCgjQRTAOCT2));
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        JhCgjQRTAOCT3.onAbsorb(i3);
                    } else if (JhCgjQRTAOCT3.isFinished()) {
                        JhCgjQRTAOCT3.onAbsorb(i3);
                    }
                }
                if (defpackage.jt1.fWTAfUmVKrZq(JhCgjQRTAOCT2) <= 0.0f) {
                    android.widget.EdgeEffect WDYagTQQm9ns = rtVar.WDYagTQQm9ns();
                    int CZa7MwI9IzLd2 = defpackage.ok0.CZa7MwI9IzLd(defpackage.jt1.fWTAfUmVKrZq(JhCgjQRTAOCT2));
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        WDYagTQQm9ns.onAbsorb(CZa7MwI9IzLd2);
                    } else if (WDYagTQQm9ns.isFinished()) {
                        WDYagTQQm9ns.onAbsorb(CZa7MwI9IzLd2);
                    }
                } else if (defpackage.jt1.fWTAfUmVKrZq(JhCgjQRTAOCT2) < 0.0f) {
                    android.widget.EdgeEffect giKS3J6vZuNy = rtVar.giKS3J6vZuNy();
                    int i4 = -defpackage.ok0.CZa7MwI9IzLd(defpackage.jt1.fWTAfUmVKrZq(JhCgjQRTAOCT2));
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        giKS3J6vZuNy.onAbsorb(i4);
                    } else if (giKS3J6vZuNy.isFinished()) {
                        giKS3J6vZuNy.onAbsorb(i4);
                    }
                }
                ZpBGe2uQfcn8();
                return gs1Var;
            }
        }
        i1Var = new defpackage.i1(this, llVar);
        java.lang.Object obj2 = i1Var.e6mdH7fiFuta;
        i = i1Var.Ns0WNyEWdPsk;
        defpackage.gs1 gs1Var2 = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.rt rtVar2 = this.fWTAfUmVKrZq;
        if (i != 0) {
        }
        JhCgjQRTAOCT2 = defpackage.jt1.JhCgjQRTAOCT(JhCgjQRTAOCT, ((defpackage.jt1) obj2).ZpBGe2uQfcn8);
        this.oh71FJcDz6S2 = false;
        if (defpackage.jt1.giKS3J6vZuNy(JhCgjQRTAOCT2) <= 0.0f) {
        }
        if (defpackage.jt1.fWTAfUmVKrZq(JhCgjQRTAOCT2) <= 0.0f) {
        }
        ZpBGe2uQfcn8();
        return gs1Var2;
    }

    public final float oh71FJcDz6S2(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (fWTAfUmVKrZq() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.QiMR8OkAhezm >> 32));
        android.widget.EdgeEffect fWTAfUmVKrZq = this.fWTAfUmVKrZq.fWTAfUmVKrZq();
        float f = 1.0f - intBitsToFloat;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = defpackage.s6.JhCgjQRTAOCT(fWTAfUmVKrZq, intBitsToFloat2, f);
        } else {
            fWTAfUmVKrZq.onPull(intBitsToFloat2, f);
        }
        return (i2 >= 31 ? defpackage.s6.fWTAfUmVKrZq(fWTAfUmVKrZq) : 0.0f) == 0.0f ? java.lang.Float.intBitsToFloat((int) (this.QiMR8OkAhezm >> 32)) * intBitsToFloat2 : java.lang.Float.intBitsToFloat(i);
    }
}
