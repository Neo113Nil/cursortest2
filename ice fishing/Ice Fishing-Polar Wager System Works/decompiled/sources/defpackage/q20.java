package defpackage;

/* loaded from: classes.dex */
public final class q20 {
    public defpackage.y2 DFo87pBq1E5;
    public boolean EgCjBq0SZwJ;
    public int G3OKOH3wZRC;
    public final defpackage.s20 IHQe1A4L2xu;
    public defpackage.y2 JlrlGoKF;
    public boolean PAEGRtP0bX;
    public defpackage.r2 QoRHpC4k;
    public float SH1y5HwkJhh;
    public boolean SyNS6RMn;
    public long V7bD7b8KA;
    public android.graphics.RectF abhbClRa;
    public defpackage.jb cnag84Bm;
    public defpackage.e90 ez2rX8ReCYw;
    public long fnWB2E7cs;
    public long kNAkVymC;
    public android.graphics.Outline xiZrDbcSW0;
    public defpackage.qn oh6vYeIP = defpackage.x70.oh6vYeIP;
    public defpackage.w90 r1MBDhnF = defpackage.w90.adDC3e2L;
    public defpackage.g00 F7NU4MC0GW = defpackage.q0.abhbClRa;
    public final defpackage.s adDC3e2L = new defpackage.s(14, this);
    public boolean AARZUJiTa = true;
    public long EXtogiMhuM = 0;
    public long riuEU0zW4 = 9205357640488583168L;
    public final defpackage.kc kd6TUFXn = new defpackage.kc();

    static {
        java.lang.String lowerCase = android.os.Build.FINGERPRINT.toLowerCase(java.util.Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public q20(defpackage.s20 s20Var) {
        this.IHQe1A4L2xu = s20Var;
        s20Var.kNAkVymC(false);
        this.fnWB2E7cs = 0L;
        this.kNAkVymC = 0L;
        this.V7bD7b8KA = 9205357640488583168L;
    }

    public final defpackage.e90 F7NU4MC0GW() {
        defpackage.e90 ns0Var;
        defpackage.e90 e90Var = this.ez2rX8ReCYw;
        defpackage.y2 y2Var = this.JlrlGoKF;
        if (e90Var != null) {
            return e90Var;
        }
        if (y2Var != null) {
            defpackage.ms0 ms0Var = new defpackage.ms0(y2Var);
            this.ez2rX8ReCYw = ms0Var;
            return ms0Var;
        }
        long frpfPPIgqM9O = defpackage.j70.frpfPPIgqM9O(this.kNAkVymC);
        long j = this.EXtogiMhuM;
        long j2 = this.riuEU0zW4;
        if (j2 != 9205357640488583168L) {
            frpfPPIgqM9O = j2;
        }
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (frpfPPIgqM9O >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (frpfPPIgqM9O & 4294967295L)) + intBitsToFloat2;
        if (this.SH1y5HwkJhh > 0.0f) {
            ns0Var = new defpackage.os0(defpackage.c80.riuEU0zW4(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (java.lang.Float.floatToRawIntBits(r0) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(r0))));
        } else {
            ns0Var = new defpackage.ns0(new defpackage.kz0(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.ez2rX8ReCYw = ns0Var;
        return ns0Var;
    }

    public final void IHQe1A4L2xu() {
        android.graphics.Outline outline;
        if (this.AARZUJiTa) {
            boolean z = this.PAEGRtP0bX;
            android.graphics.Outline outline2 = null;
            defpackage.s20 s20Var = this.IHQe1A4L2xu;
            if (z || s20Var.p4kuH6PDtgom() > 0.0f) {
                defpackage.y2 y2Var = this.JlrlGoKF;
                if (y2Var != null) {
                    android.graphics.RectF rectF = this.abhbClRa;
                    if (rectF == null) {
                        rectF = new android.graphics.RectF();
                        this.abhbClRa = rectF;
                    }
                    boolean z2 = y2Var instanceof defpackage.y2;
                    if (!z2) {
                        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    android.graphics.Path path = y2Var.IHQe1A4L2xu;
                    path.computeBounds(rectF, false);
                    int i = android.os.Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.xiZrDbcSW0;
                        if (outline == null) {
                            outline = new android.graphics.Outline();
                            this.xiZrDbcSW0 = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(path);
                        }
                        this.SyNS6RMn = !outline.canClip();
                    } else {
                        android.graphics.Outline outline3 = this.xiZrDbcSW0;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.SyNS6RMn = true;
                        outline = null;
                    }
                    this.JlrlGoKF = y2Var;
                    if (outline != null) {
                        outline.setAlpha(s20Var.oh6vYeIP());
                        outline2 = outline;
                    }
                    s20Var.JlrlGoKF(outline2, (4294967295L & java.lang.Math.round(rectF.height())) | (java.lang.Math.round(rectF.width()) << 32));
                    if (this.SyNS6RMn && this.PAEGRtP0bX) {
                        s20Var.kNAkVymC(false);
                        s20Var.G3OKOH3wZRC();
                    } else {
                        s20Var.kNAkVymC(this.PAEGRtP0bX);
                    }
                } else {
                    s20Var.kNAkVymC(this.PAEGRtP0bX);
                    android.graphics.Outline outline4 = this.xiZrDbcSW0;
                    if (outline4 == null) {
                        outline4 = new android.graphics.Outline();
                        this.xiZrDbcSW0 = outline4;
                    }
                    android.graphics.Outline outline5 = outline4;
                    long frpfPPIgqM9O = defpackage.j70.frpfPPIgqM9O(this.kNAkVymC);
                    long j = this.EXtogiMhuM;
                    long j2 = this.riuEU0zW4;
                    if (j2 != 9205357640488583168L) {
                        frpfPPIgqM9O = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (frpfPPIgqM9O >> 32);
                    outline5.setRoundRect(java.lang.Math.round(java.lang.Float.intBitsToFloat(i2)), java.lang.Math.round(java.lang.Float.intBitsToFloat(i3)), java.lang.Math.round(java.lang.Float.intBitsToFloat(i4) + java.lang.Float.intBitsToFloat(i2)), java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (frpfPPIgqM9O & 4294967295L)) + java.lang.Float.intBitsToFloat(i3)), this.SH1y5HwkJhh);
                    outline5.setAlpha(s20Var.oh6vYeIP());
                    s20Var.JlrlGoKF(outline5, (4294967295L & java.lang.Math.round(java.lang.Float.intBitsToFloat(r15))) | (java.lang.Math.round(java.lang.Float.intBitsToFloat(i4)) << 32));
                }
            } else {
                s20Var.kNAkVymC(false);
                s20Var.JlrlGoKF(null, 0L);
            }
        }
        this.AARZUJiTa = false;
    }

    public final void adDC3e2L(long j, long j2, float f) {
        if (defpackage.gq0.oh6vYeIP(this.EXtogiMhuM, j) && defpackage.z91.IHQe1A4L2xu(this.riuEU0zW4, j2) && this.SH1y5HwkJhh == f && this.JlrlGoKF == null) {
            return;
        }
        this.ez2rX8ReCYw = null;
        this.JlrlGoKF = null;
        this.AARZUJiTa = true;
        this.SyNS6RMn = false;
        this.EXtogiMhuM = j;
        this.riuEU0zW4 = j2;
        this.SH1y5HwkJhh = f;
        IHQe1A4L2xu();
    }

    public final void oh6vYeIP() {
        if (this.EgCjBq0SZwJ && this.G3OKOH3wZRC == 0) {
            defpackage.kc kcVar = this.kd6TUFXn;
            defpackage.q20 q20Var = (defpackage.q20) kcVar.oh6vYeIP;
            if (q20Var != null) {
                q20Var.G3OKOH3wZRC--;
                q20Var.oh6vYeIP();
                kcVar.oh6vYeIP = null;
            }
            defpackage.ol0 ol0Var = (defpackage.ol0) kcVar.F7NU4MC0GW;
            if (ol0Var != null) {
                java.lang.Object[] objArr = ol0Var.oh6vYeIP;
                long[] jArr = ol0Var.IHQe1A4L2xu;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.G3OKOH3wZRC--;
                                    ((defpackage.q20) objArr[(i << 3) + i3]).oh6vYeIP();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                ol0Var.oh6vYeIP();
            }
            this.IHQe1A4L2xu.G3OKOH3wZRC();
        }
    }

    public final void r1MBDhnF(defpackage.xr xrVar) {
        defpackage.kc kcVar = this.kd6TUFXn;
        kcVar.r1MBDhnF = (defpackage.q20) kcVar.oh6vYeIP;
        defpackage.ol0 ol0Var = (defpackage.ol0) kcVar.F7NU4MC0GW;
        if (ol0Var != null && ol0Var.EXtogiMhuM()) {
            defpackage.ol0 ol0Var2 = (defpackage.ol0) kcVar.adDC3e2L;
            if (ol0Var2 == null) {
                defpackage.ol0 ol0Var3 = defpackage.a51.IHQe1A4L2xu;
                ol0Var2 = new defpackage.ol0();
                kcVar.adDC3e2L = ol0Var2;
            }
            ol0Var2.SH1y5HwkJhh(ol0Var);
            ol0Var.oh6vYeIP();
        }
        kcVar.IHQe1A4L2xu = true;
        this.F7NU4MC0GW.AARZUJiTa(xrVar);
        kcVar.IHQe1A4L2xu = false;
        defpackage.q20 q20Var = (defpackage.q20) kcVar.r1MBDhnF;
        if (q20Var != null) {
            q20Var.G3OKOH3wZRC--;
            q20Var.oh6vYeIP();
        }
        defpackage.ol0 ol0Var4 = (defpackage.ol0) kcVar.adDC3e2L;
        if (ol0Var4 == null || !ol0Var4.EXtogiMhuM()) {
            return;
        }
        java.lang.Object[] objArr = ol0Var4.oh6vYeIP;
        long[] jArr = ol0Var4.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r9.G3OKOH3wZRC--;
                            ((defpackage.q20) objArr[(i << 3) + i3]).oh6vYeIP();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        ol0Var4.oh6vYeIP();
    }
}
