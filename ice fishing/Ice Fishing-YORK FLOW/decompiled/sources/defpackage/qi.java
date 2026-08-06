package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qi implements android.view.ScrollCaptureCallback {
    public final defpackage.u JhCgjQRTAOCT;
    public final defpackage.jl WDYagTQQm9ns;
    public final defpackage.jb1 ZpBGe2uQfcn8;
    public final defpackage.k0 fWTAfUmVKrZq;
    public final defpackage.q90 giKS3J6vZuNy;
    public final defpackage.m50 oh71FJcDz6S2;

    public qi(defpackage.jb1 jb1Var, defpackage.q90 q90Var, defpackage.jl jlVar, defpackage.k0 k0Var, defpackage.u uVar) {
        this.ZpBGe2uQfcn8 = jb1Var;
        this.giKS3J6vZuNy = q90Var;
        this.fWTAfUmVKrZq = k0Var;
        this.JhCgjQRTAOCT = uVar;
        this.WDYagTQQm9ns = new defpackage.jl(jlVar.WDYagTQQm9ns.fNwYGHIYeJcR(defpackage.nq.oh71FJcDz6S2));
        this.oh71FJcDz6S2 = new defpackage.m50(q90Var.giKS3J6vZuNy(), new defpackage.pi(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        if (r9 == r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object ZpBGe2uQfcn8(defpackage.qi qiVar, android.view.ScrollCaptureSession scrollCaptureSession, defpackage.q90 q90Var, defpackage.ll llVar) {
        defpackage.oi oiVar;
        int i;
        defpackage.tm tmVar;
        int i2;
        int i3;
        defpackage.n nVar;
        defpackage.jm jmVar;
        android.view.ScrollCaptureSession scrollCaptureSession2;
        int i4;
        defpackage.q90 q90Var2;
        int i5;
        int T1fB7bDYiVJQ;
        int T1fB7bDYiVJQ2;
        android.view.Surface surface;
        android.view.Surface surface2;
        android.view.Surface surface3;
        if (llVar instanceof defpackage.oi) {
            oiVar = (defpackage.oi) llVar;
            int i6 = oiVar.gUjdnLbkVAaA;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                oiVar.gUjdnLbkVAaA = i6 - Integer.MIN_VALUE;
                java.lang.Object obj = oiVar.fNwYGHIYeJcR;
                i = oiVar.gUjdnLbkVAaA;
                tmVar = defpackage.tm.WDYagTQQm9ns;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    i2 = q90Var.giKS3J6vZuNy;
                    i3 = q90Var.JhCgjQRTAOCT;
                    defpackage.m50 m50Var = qiVar.oh71FJcDz6S2;
                    oiVar.P05cfTpS5W5L = scrollCaptureSession;
                    oiVar.e6mdH7fiFuta = q90Var;
                    oiVar.GE9mJIPrb8gP = i2;
                    oiVar.Ns0WNyEWdPsk = i3;
                    oiVar.gUjdnLbkVAaA = 1;
                    int i7 = m50Var.ZpBGe2uQfcn8;
                    if (i2 > i3) {
                        defpackage.h7.WDYagTQQm9ns(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i2, i3, "Expected min=", " ≤ max="));
                        return null;
                    }
                    int i8 = i3 - i2;
                    if (i8 > i7) {
                        defpackage.h7.WDYagTQQm9ns(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i8, i7, "Expected range (", ") to be ≤ viewportSize="));
                        return null;
                    }
                    float f = i2;
                    float f2 = m50Var.giKS3J6vZuNy;
                    java.lang.Object obj2 = defpackage.gs1.ZpBGe2uQfcn8;
                    if (f < f2 || i3 > i7 + f2) {
                        java.lang.Object giKS3J6vZuNy = m50Var.giKS3J6vZuNy((((i8 / 2) + i2) - (i7 / 2)) - f2, oiVar);
                        if (giKS3J6vZuNy != tmVar) {
                            giKS3J6vZuNy = obj2;
                        }
                        if (giKS3J6vZuNy == tmVar) {
                            obj2 = giKS3J6vZuNy;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = oiVar.Ns0WNyEWdPsk;
                        i5 = oiVar.GE9mJIPrb8gP;
                        q90Var2 = oiVar.e6mdH7fiFuta;
                        scrollCaptureSession2 = defpackage.d0.e6mdH7fiFuta(oiVar.P05cfTpS5W5L);
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        defpackage.m50 m50Var2 = qiVar.oh71FJcDz6S2;
                        T1fB7bDYiVJQ = defpackage.j80.T1fB7bDYiVJQ(i5 - defpackage.ok0.CZa7MwI9IzLd(m50Var2.giKS3J6vZuNy), 0, m50Var2.ZpBGe2uQfcn8);
                        defpackage.m50 m50Var3 = qiVar.oh71FJcDz6S2;
                        T1fB7bDYiVJQ2 = defpackage.j80.T1fB7bDYiVJQ(i4 - defpackage.ok0.CZa7MwI9IzLd(m50Var3.giKS3J6vZuNy), 0, m50Var3.ZpBGe2uQfcn8);
                        int i9 = q90Var2.ZpBGe2uQfcn8;
                        int i10 = q90Var2.fWTAfUmVKrZq;
                        if (T1fB7bDYiVJQ != T1fB7bDYiVJQ2) {
                            return defpackage.q90.WDYagTQQm9ns;
                        }
                        surface = scrollCaptureSession2.getSurface();
                        android.graphics.Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i9, -T1fB7bDYiVJQ);
                            defpackage.q90 q90Var3 = qiVar.giKS3J6vZuNy;
                            lockHardwareCanvas.translate(-q90Var3.ZpBGe2uQfcn8, -q90Var3.giKS3J6vZuNy);
                            qiVar.JhCgjQRTAOCT.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int CZa7MwI9IzLd = defpackage.ok0.CZa7MwI9IzLd(qiVar.oh71FJcDz6S2.giKS3J6vZuNy);
                            return new defpackage.q90(i9, T1fB7bDYiVJQ + CZa7MwI9IzLd, i10, T1fB7bDYiVJQ2 + CZa7MwI9IzLd);
                        } catch (java.lang.Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i11 = oiVar.Ns0WNyEWdPsk;
                    int i12 = oiVar.GE9mJIPrb8gP;
                    defpackage.q90 q90Var4 = oiVar.e6mdH7fiFuta;
                    android.view.ScrollCaptureSession e6mdH7fiFuta = defpackage.d0.e6mdH7fiFuta(oiVar.P05cfTpS5W5L);
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    i2 = i12;
                    q90Var = q90Var4;
                    i3 = i11;
                    scrollCaptureSession = e6mdH7fiFuta;
                }
                nVar = defpackage.n.WmetiUbpKU9I;
                oiVar.P05cfTpS5W5L = scrollCaptureSession;
                oiVar.e6mdH7fiFuta = q90Var;
                oiVar.GE9mJIPrb8gP = i2;
                oiVar.Ns0WNyEWdPsk = i3;
                oiVar.gUjdnLbkVAaA = 2;
                jmVar = oiVar.oh71FJcDz6S2;
                jmVar.getClass();
                if (defpackage.j80.VFeft99leXEK(jmVar).ZpBGe2uQfcn8(oiVar, nVar) != tmVar) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    i4 = i3;
                    q90Var2 = q90Var;
                    i5 = i2;
                    defpackage.m50 m50Var22 = qiVar.oh71FJcDz6S2;
                    T1fB7bDYiVJQ = defpackage.j80.T1fB7bDYiVJQ(i5 - defpackage.ok0.CZa7MwI9IzLd(m50Var22.giKS3J6vZuNy), 0, m50Var22.ZpBGe2uQfcn8);
                    defpackage.m50 m50Var32 = qiVar.oh71FJcDz6S2;
                    T1fB7bDYiVJQ2 = defpackage.j80.T1fB7bDYiVJQ(i4 - defpackage.ok0.CZa7MwI9IzLd(m50Var32.giKS3J6vZuNy), 0, m50Var32.ZpBGe2uQfcn8);
                    int i92 = q90Var2.ZpBGe2uQfcn8;
                    int i102 = q90Var2.fWTAfUmVKrZq;
                    if (T1fB7bDYiVJQ != T1fB7bDYiVJQ2) {
                    }
                }
                return tmVar;
            }
        }
        oiVar = new defpackage.oi(qiVar, llVar);
        java.lang.Object obj3 = oiVar.fNwYGHIYeJcR;
        i = oiVar.gUjdnLbkVAaA;
        tmVar = defpackage.tm.WDYagTQQm9ns;
        if (i != 0) {
        }
        nVar = defpackage.n.WmetiUbpKU9I;
        oiVar.P05cfTpS5W5L = scrollCaptureSession;
        oiVar.e6mdH7fiFuta = q90Var;
        oiVar.GE9mJIPrb8gP = i2;
        oiVar.Ns0WNyEWdPsk = i3;
        oiVar.gUjdnLbkVAaA = 2;
        jmVar = oiVar.oh71FJcDz6S2;
        jmVar.getClass();
        if (defpackage.j80.VFeft99leXEK(jmVar).ZpBGe2uQfcn8(oiVar, nVar) != tmVar) {
        }
        return tmVar;
    }

    public final void onScrollCaptureEnd(java.lang.Runnable runnable) {
        defpackage.ok0.zJPqDeoF0Os1(this.WDYagTQQm9ns, defpackage.yr0.oh71FJcDz6S2, new defpackage.JhCgjQRTAOCT(this, runnable, null, 9), 2);
    }

    public final void onScrollCaptureImageRequest(android.view.ScrollCaptureSession scrollCaptureSession, android.os.CancellationSignal cancellationSignal, android.graphics.Rect rect, java.util.function.Consumer consumer) {
        defpackage.yf1 zJPqDeoF0Os1 = defpackage.ok0.zJPqDeoF0Os1(this.WDYagTQQm9ns, null, new defpackage.e2(this, scrollCaptureSession, rect, consumer, null, 2), 3);
        zJPqDeoF0Os1.ZVVdXbWmyCSK(new defpackage.YjS0G3zEDWNX(8, cancellationSignal));
        cancellationSignal.setOnCancelListener(new defpackage.ri(0, zJPqDeoF0Os1));
    }

    public final void onScrollCaptureSearch(android.os.CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        consumer.accept(defpackage.w60.Wc0TdmRSwbbi(this.giKS3J6vZuNy));
    }

    public final void onScrollCaptureStart(android.view.ScrollCaptureSession scrollCaptureSession, android.os.CancellationSignal cancellationSignal, java.lang.Runnable runnable) {
        this.oh71FJcDz6S2.giKS3J6vZuNy = 0.0f;
        ((defpackage.pw0) this.fWTAfUmVKrZq.oh71FJcDz6S2).setValue(java.lang.Boolean.TRUE);
        runnable.run();
    }
}
