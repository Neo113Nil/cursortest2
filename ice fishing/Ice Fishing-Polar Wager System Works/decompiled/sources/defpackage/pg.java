package defpackage;

/* loaded from: classes.dex */
public final class pg implements android.view.ScrollCaptureCallback {
    public final defpackage.v0 F7NU4MC0GW;
    public final defpackage.f71 IHQe1A4L2xu;
    public final defpackage.dj adDC3e2L;
    public final defpackage.e70 oh6vYeIP;
    public final defpackage.gd0 r1MBDhnF;
    public final defpackage.zz0 xiZrDbcSW0;

    public pg(defpackage.f71 f71Var, defpackage.e70 e70Var, defpackage.dj djVar, defpackage.gd0 gd0Var, defpackage.v0 v0Var) {
        this.IHQe1A4L2xu = f71Var;
        this.oh6vYeIP = e70Var;
        this.r1MBDhnF = gd0Var;
        this.F7NU4MC0GW = v0Var;
        this.adDC3e2L = new defpackage.dj(djVar.adDC3e2L.JlrlGoKF(defpackage.vp.xiZrDbcSW0));
        this.xiZrDbcSW0 = new defpackage.zz0(e70Var.F7NU4MC0GW - e70Var.oh6vYeIP, new defpackage.wg1(this, null));
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
    public static final java.lang.Object IHQe1A4L2xu(defpackage.pg pgVar, android.view.ScrollCaptureSession scrollCaptureSession, defpackage.e70 e70Var, defpackage.fj fjVar) {
        defpackage.og ogVar;
        int i;
        defpackage.vj vjVar;
        int i2;
        int i3;
        defpackage.q0 q0Var;
        defpackage.lj ljVar;
        android.view.ScrollCaptureSession scrollCaptureSession2;
        int i4;
        defpackage.e70 e70Var2;
        int i5;
        int JlrlGoKF;
        int JlrlGoKF2;
        android.view.Surface surface;
        android.view.Surface surface2;
        android.view.Surface surface3;
        if (fjVar instanceof defpackage.og) {
            ogVar = (defpackage.og) fjVar;
            int i6 = ogVar.SyNS6RMn;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                ogVar.SyNS6RMn = i6 - Integer.MIN_VALUE;
                java.lang.Object obj = ogVar.JlrlGoKF;
                i = ogVar.SyNS6RMn;
                vjVar = defpackage.vj.adDC3e2L;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    i2 = e70Var.oh6vYeIP;
                    i3 = e70Var.F7NU4MC0GW;
                    defpackage.zz0 zz0Var = pgVar.xiZrDbcSW0;
                    ogVar.EXtogiMhuM = scrollCaptureSession;
                    ogVar.riuEU0zW4 = e70Var;
                    ogVar.SH1y5HwkJhh = i2;
                    ogVar.ez2rX8ReCYw = i3;
                    ogVar.SyNS6RMn = 1;
                    int i7 = zz0Var.IHQe1A4L2xu;
                    if (i2 > i3) {
                        defpackage.db.adDC3e2L(defpackage.fx0.EXtogiMhuM(i2, i3, "Expected min=", " ≤ max="));
                        return null;
                    }
                    int i8 = i3 - i2;
                    if (i8 > i7) {
                        defpackage.db.adDC3e2L(defpackage.fx0.EXtogiMhuM(i8, i7, "Expected range (", ") to be ≤ viewportSize="));
                        return null;
                    }
                    float f = i2;
                    float f2 = zz0Var.r1MBDhnF;
                    java.lang.Object obj2 = defpackage.ok1.IHQe1A4L2xu;
                    if (f < f2 || i3 > i7 + f2) {
                        java.lang.Object IHQe1A4L2xu = zz0Var.IHQe1A4L2xu((((i8 / 2) + i2) - (i7 / 2)) - f2, ogVar);
                        if (IHQe1A4L2xu != vjVar) {
                            IHQe1A4L2xu = obj2;
                        }
                        if (IHQe1A4L2xu == vjVar) {
                            obj2 = IHQe1A4L2xu;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = ogVar.ez2rX8ReCYw;
                        i5 = ogVar.SH1y5HwkJhh;
                        e70Var2 = ogVar.riuEU0zW4;
                        scrollCaptureSession2 = defpackage.e1.SH1y5HwkJhh(ogVar.EXtogiMhuM);
                        defpackage.f70.nBH8hAHy(obj);
                        defpackage.zz0 zz0Var2 = pgVar.xiZrDbcSW0;
                        JlrlGoKF = defpackage.x80.JlrlGoKF(i5 - defpackage.ci0.TFRaUu83X3E(zz0Var2.r1MBDhnF), 0, zz0Var2.IHQe1A4L2xu);
                        defpackage.zz0 zz0Var3 = pgVar.xiZrDbcSW0;
                        JlrlGoKF2 = defpackage.x80.JlrlGoKF(i4 - defpackage.ci0.TFRaUu83X3E(zz0Var3.r1MBDhnF), 0, zz0Var3.IHQe1A4L2xu);
                        int i9 = e70Var2.IHQe1A4L2xu;
                        int i10 = e70Var2.r1MBDhnF;
                        if (JlrlGoKF != JlrlGoKF2) {
                            return defpackage.e70.adDC3e2L;
                        }
                        surface = scrollCaptureSession2.getSurface();
                        android.graphics.Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i9, -JlrlGoKF);
                            defpackage.e70 e70Var3 = pgVar.oh6vYeIP;
                            lockHardwareCanvas.translate(-e70Var3.IHQe1A4L2xu, -e70Var3.oh6vYeIP);
                            pgVar.F7NU4MC0GW.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int TFRaUu83X3E = defpackage.ci0.TFRaUu83X3E(pgVar.xiZrDbcSW0.r1MBDhnF);
                            return new defpackage.e70(i9, JlrlGoKF + TFRaUu83X3E, i10, JlrlGoKF2 + TFRaUu83X3E);
                        } catch (java.lang.Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i11 = ogVar.ez2rX8ReCYw;
                    int i12 = ogVar.SH1y5HwkJhh;
                    defpackage.e70 e70Var4 = ogVar.riuEU0zW4;
                    android.view.ScrollCaptureSession SH1y5HwkJhh = defpackage.e1.SH1y5HwkJhh(ogVar.EXtogiMhuM);
                    defpackage.f70.nBH8hAHy(obj);
                    i2 = i12;
                    e70Var = e70Var4;
                    i3 = i11;
                    scrollCaptureSession = SH1y5HwkJhh;
                }
                q0Var = defpackage.q0.JlrlGoKF;
                ogVar.EXtogiMhuM = scrollCaptureSession;
                ogVar.riuEU0zW4 = e70Var;
                ogVar.SH1y5HwkJhh = i2;
                ogVar.ez2rX8ReCYw = i3;
                ogVar.SyNS6RMn = 2;
                ljVar = ogVar.xiZrDbcSW0;
                ljVar.getClass();
                if (defpackage.x80.NHJTzaLwkd(ljVar).IHQe1A4L2xu(q0Var, ogVar) != vjVar) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    i4 = i3;
                    e70Var2 = e70Var;
                    i5 = i2;
                    defpackage.zz0 zz0Var22 = pgVar.xiZrDbcSW0;
                    JlrlGoKF = defpackage.x80.JlrlGoKF(i5 - defpackage.ci0.TFRaUu83X3E(zz0Var22.r1MBDhnF), 0, zz0Var22.IHQe1A4L2xu);
                    defpackage.zz0 zz0Var32 = pgVar.xiZrDbcSW0;
                    JlrlGoKF2 = defpackage.x80.JlrlGoKF(i4 - defpackage.ci0.TFRaUu83X3E(zz0Var32.r1MBDhnF), 0, zz0Var32.IHQe1A4L2xu);
                    int i92 = e70Var2.IHQe1A4L2xu;
                    int i102 = e70Var2.r1MBDhnF;
                    if (JlrlGoKF != JlrlGoKF2) {
                    }
                }
                return vjVar;
            }
        }
        ogVar = new defpackage.og(pgVar, fjVar);
        java.lang.Object obj3 = ogVar.JlrlGoKF;
        i = ogVar.SyNS6RMn;
        vjVar = defpackage.vj.adDC3e2L;
        if (i != 0) {
        }
        q0Var = defpackage.q0.JlrlGoKF;
        ogVar.EXtogiMhuM = scrollCaptureSession;
        ogVar.riuEU0zW4 = e70Var;
        ogVar.SH1y5HwkJhh = i2;
        ogVar.ez2rX8ReCYw = i3;
        ogVar.SyNS6RMn = 2;
        ljVar = ogVar.xiZrDbcSW0;
        ljVar.getClass();
        if (defpackage.x80.NHJTzaLwkd(ljVar).IHQe1A4L2xu(q0Var, ogVar) != vjVar) {
        }
        return vjVar;
    }

    public final void onScrollCaptureEnd(java.lang.Runnable runnable) {
        defpackage.fm.SiPhmbmu(this.adDC3e2L, defpackage.op0.xiZrDbcSW0, new defpackage.adDC3e2L(this, runnable, null, 9), 2);
    }

    public final void onScrollCaptureImageRequest(android.view.ScrollCaptureSession scrollCaptureSession, android.os.CancellationSignal cancellationSignal, android.graphics.Rect rect, java.util.function.Consumer consumer) {
        final defpackage.xb1 SiPhmbmu = defpackage.fm.SiPhmbmu(this.adDC3e2L, null, new defpackage.x3(this, scrollCaptureSession, rect, consumer, null, 1), 3);
        SiPhmbmu.kNAkVymC(new defpackage.s(6, cancellationSignal));
        cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: qg
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                defpackage.xb1.this.F7NU4MC0GW(null);
            }
        });
    }

    public final void onScrollCaptureSearch(android.os.CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        consumer.accept(defpackage.f70.v5iciZok(this.oh6vYeIP));
    }

    public final void onScrollCaptureStart(android.view.ScrollCaptureSession scrollCaptureSession, android.os.CancellationSignal cancellationSignal, java.lang.Runnable runnable) {
        this.xiZrDbcSW0.r1MBDhnF = 0.0f;
        this.r1MBDhnF.IHQe1A4L2xu.setValue(java.lang.Boolean.TRUE);
        runnable.run();
    }
}
