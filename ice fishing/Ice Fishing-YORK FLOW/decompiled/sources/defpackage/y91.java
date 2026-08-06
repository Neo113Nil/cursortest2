package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class y91 {
    public defpackage.fv0 JhCgjQRTAOCT;
    public final defpackage.l91 P05cfTpS5W5L;
    public final defpackage.q91 QiMR8OkAhezm;
    public boolean WDYagTQQm9ns;
    public defpackage.r91 ZpBGe2uQfcn8;
    public boolean e6mdH7fiFuta;
    public defpackage.xn fWTAfUmVKrZq;
    public defpackage.l1 giKS3J6vZuNy;
    public defpackage.s81 oh71FJcDz6S2;
    public int GE9mJIPrb8gP = 1;
    public defpackage.a91 Ns0WNyEWdPsk = defpackage.j91.giKS3J6vZuNy;
    public final defpackage.w91 fNwYGHIYeJcR = new defpackage.w91(this);
    public final defpackage.fNwYGHIYeJcR h3m55N1URyyK = new defpackage.fNwYGHIYeJcR(28, this);

    public y91(defpackage.r91 r91Var, defpackage.l1 l1Var, defpackage.xn xnVar, defpackage.fv0 fv0Var, boolean z, defpackage.s81 s81Var, defpackage.q91 q91Var, defpackage.l91 l91Var) {
        this.ZpBGe2uQfcn8 = r91Var;
        this.giKS3J6vZuNy = l1Var;
        this.fWTAfUmVKrZq = xnVar;
        this.JhCgjQRTAOCT = fv0Var;
        this.WDYagTQQm9ns = z;
        this.oh71FJcDz6S2 = s81Var;
        this.QiMR8OkAhezm = q91Var;
        this.P05cfTpS5W5L = l91Var;
    }

    public final float JhCgjQRTAOCT(float f) {
        return this.WDYagTQQm9ns ? f * (-1.0f) : f;
    }

    public final long P05cfTpS5W5L(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.JhCgjQRTAOCT == defpackage.fv0.oh71FJcDz6S2) {
            return (java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (java.lang.Float.floatToRawIntBits(f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float QiMR8OkAhezm(long j) {
        return java.lang.Float.intBitsToFloat((int) (this.JhCgjQRTAOCT == defpackage.fv0.oh71FJcDz6S2 ? j >> 32 : j & 4294967295L));
    }

    public final long WDYagTQQm9ns(long j) {
        return this.WDYagTQQm9ns ? defpackage.ws0.oh71FJcDz6S2(j, -1.0f) : j;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object ZpBGe2uQfcn8(long j, defpackage.ll llVar) {
        defpackage.t91 t91Var;
        int i;
        defpackage.y91 y91Var;
        java.lang.Throwable th;
        defpackage.y31 y31Var;
        if (llVar instanceof defpackage.t91) {
            t91Var = (defpackage.t91) llVar;
            int i2 = t91Var.Ns0WNyEWdPsk;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t91Var.Ns0WNyEWdPsk = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = t91Var.e6mdH7fiFuta;
                i = t91Var.Ns0WNyEWdPsk;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.y31 y31Var2 = new defpackage.y31();
                    y31Var2.WDYagTQQm9ns = j;
                    this.e6mdH7fiFuta = true;
                    try {
                        defpackage.jo0 jo0Var = defpackage.jo0.WDYagTQQm9ns;
                        y91Var = this;
                        try {
                            defpackage.v91 v91Var = new defpackage.v91(y91Var, y31Var2, j, null);
                            t91Var.P05cfTpS5W5L = y31Var2;
                            t91Var.Ns0WNyEWdPsk = 1;
                            java.lang.Object oh71FJcDz6S2 = y91Var.oh71FJcDz6S2(jo0Var, v91Var, t91Var);
                            defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                            if (oh71FJcDz6S2 == tmVar) {
                                return tmVar;
                            }
                            y31Var = y31Var2;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            th = th;
                            y91Var.e6mdH7fiFuta = false;
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        y91Var = this;
                    }
                } else {
                    if (i != 1) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y31Var = t91Var.P05cfTpS5W5L;
                    try {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        y91Var = this;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        y91Var = this;
                        y91Var.e6mdH7fiFuta = false;
                        throw th;
                    }
                }
                y91Var.e6mdH7fiFuta = false;
                return new defpackage.jt1(y31Var.WDYagTQQm9ns);
            }
        }
        t91Var = new defpackage.t91(this, llVar);
        java.lang.Object obj2 = t91Var.e6mdH7fiFuta;
        i = t91Var.Ns0WNyEWdPsk;
        if (i != 0) {
        }
        y91Var.e6mdH7fiFuta = false;
        return new defpackage.jt1(y31Var.WDYagTQQm9ns);
    }

    public final float e6mdH7fiFuta(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double atan2 = (float) java.lang.Math.atan2(java.lang.Math.abs(java.lang.Float.intBitsToFloat(i)), java.lang.Math.abs(java.lang.Float.intBitsToFloat(i2)));
        defpackage.fv0 fv0Var = this.JhCgjQRTAOCT;
        if (atan2 >= 0.7853981633974483d) {
            if (fv0Var == defpackage.fv0.WDYagTQQm9ns) {
                return java.lang.Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (fv0Var == defpackage.fv0.oh71FJcDz6S2) {
            return java.lang.Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }

    public final long fWTAfUmVKrZq(defpackage.a91 a91Var, long j, int i) {
        defpackage.hr0 hr0Var = (defpackage.hr0) this.oh71FJcDz6S2.WDYagTQQm9ns;
        defpackage.hr0 xbkEJUK1coRZ = hr0Var != null ? hr0Var.xbkEJUK1coRZ() : null;
        long iYH9ueRbBBFm = xbkEJUK1coRZ != null ? xbkEJUK1coRZ.iYH9ueRbBBFm(i, j) : 0L;
        long JhCgjQRTAOCT = defpackage.ws0.JhCgjQRTAOCT(j, iYH9ueRbBBFm);
        long WDYagTQQm9ns = WDYagTQQm9ns(P05cfTpS5W5L(a91Var.ZpBGe2uQfcn8(QiMR8OkAhezm(WDYagTQQm9ns(this.JhCgjQRTAOCT == defpackage.fv0.oh71FJcDz6S2 ? defpackage.ws0.ZpBGe2uQfcn8(JhCgjQRTAOCT, 0.0f, 1) : defpackage.ws0.ZpBGe2uQfcn8(JhCgjQRTAOCT, 0.0f, 2))))));
        defpackage.q91 q91Var = this.QiMR8OkAhezm;
        if (q91Var.s0TASMVLSWD5) {
            android.view.ViewTreeObserver viewTreeObserver = ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(q91Var)).getViewTreeObserver();
            try {
                if (defpackage.u.rB0K1rYXS4Nc == null) {
                    java.lang.reflect.Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    defpackage.u.rB0K1rYXS4Nc = declaredMethod;
                }
                java.lang.reflect.Method method = defpackage.u.rB0K1rYXS4Nc;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        long JhCgjQRTAOCT2 = defpackage.ws0.JhCgjQRTAOCT(JhCgjQRTAOCT, WDYagTQQm9ns);
        defpackage.hr0 hr0Var2 = (defpackage.hr0) this.oh71FJcDz6S2.WDYagTQQm9ns;
        defpackage.hr0 xbkEJUK1coRZ2 = hr0Var2 != null ? hr0Var2.xbkEJUK1coRZ() : null;
        return defpackage.ws0.WDYagTQQm9ns(defpackage.ws0.WDYagTQQm9ns(iYH9ueRbBBFm, WDYagTQQm9ns), xbkEJUK1coRZ2 != null ? xbkEJUK1coRZ2.jVUAPb5NnIYW(i, WDYagTQQm9ns, JhCgjQRTAOCT2) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if ((r7 instanceof defpackage.xn) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object giKS3J6vZuNy(long j, boolean z, defpackage.mi1 mi1Var) {
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        if (z) {
            defpackage.xn xnVar = this.fWTAfUmVKrZq;
            defpackage.g81 g81Var = defpackage.j91.ZpBGe2uQfcn8;
        }
        long ZpBGe2uQfcn8 = defpackage.jt1.ZpBGe2uQfcn8(j, 0.0f, 0.0f, this.JhCgjQRTAOCT == defpackage.fv0.oh71FJcDz6S2 ? 1 : 2);
        defpackage.x91 x91Var = new defpackage.x91(this, null);
        defpackage.l1 l1Var = this.giKS3J6vZuNy;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        if (l1Var == null || !(this.ZpBGe2uQfcn8.fWTAfUmVKrZq() || this.ZpBGe2uQfcn8.ZpBGe2uQfcn8())) {
            defpackage.x91 x91Var2 = new defpackage.x91(this, mi1Var);
            x91Var2.Ns0WNyEWdPsk = ZpBGe2uQfcn8;
            java.lang.Object s0TASMVLSWD5 = x91Var2.s0TASMVLSWD5(gs1Var);
            if (s0TASMVLSWD5 == tmVar) {
                return s0TASMVLSWD5;
            }
        } else {
            java.lang.Object giKS3J6vZuNy = l1Var.giKS3J6vZuNy(ZpBGe2uQfcn8, x91Var, mi1Var);
            if (giKS3J6vZuNy == tmVar) {
                return giKS3J6vZuNy;
            }
        }
        return gs1Var;
    }

    public final java.lang.Object oh71FJcDz6S2(defpackage.jo0 jo0Var, defpackage.c20 c20Var, defpackage.ll llVar) {
        java.lang.Object JhCgjQRTAOCT = this.ZpBGe2uQfcn8.JhCgjQRTAOCT(jo0Var, new defpackage.oh71FJcDz6S2(this, c20Var, null, 15), llVar);
        return JhCgjQRTAOCT == defpackage.tm.WDYagTQQm9ns ? JhCgjQRTAOCT : defpackage.gs1.ZpBGe2uQfcn8;
    }
}
