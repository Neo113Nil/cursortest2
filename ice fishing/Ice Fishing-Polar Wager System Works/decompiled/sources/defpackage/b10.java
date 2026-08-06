package defpackage;

/* loaded from: classes.dex */
public final class b10 {
    public final defpackage.le1 F7NU4MC0GW;
    public final android.content.Context IHQe1A4L2xu;
    public final defpackage.xy0 oh6vYeIP;
    public final defpackage.le1 r1MBDhnF;

    public b10(android.content.Context context, defpackage.uj ujVar, defpackage.t81 t81Var) {
        ujVar.getClass();
        t81Var.getClass();
        this.IHQe1A4L2xu = context;
        this.oh6vYeIP = defpackage.gq1.frpfPPIgqM9O(t81Var.IHQe1A4L2xu(), ujVar, defpackage.p91.IHQe1A4L2xu, new defpackage.m10(true, true, defpackage.jg1.xiZrDbcSW0));
        this.r1MBDhnF = new defpackage.le1(new defpackage.g(9));
        this.F7NU4MC0GW = new defpackage.le1(new defpackage.e3(4, this));
    }

    public final void IHQe1A4L2xu(int i, int i2, long j) {
        android.os.VibrationEffect createOneShot;
        defpackage.m10 m10Var = (defpackage.m10) this.oh6vYeIP.adDC3e2L.getValue();
        if (m10Var.IHQe1A4L2xu) {
            try {
                android.media.ToneGenerator toneGenerator = (android.media.ToneGenerator) this.r1MBDhnF.getValue();
                if (toneGenerator != null) {
                    toneGenerator.startTone(i, i2);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        if (m10Var.oh6vYeIP) {
            try {
                int i3 = android.os.Build.VERSION.SDK_INT;
                defpackage.le1 le1Var = this.F7NU4MC0GW;
                if (i3 >= 26) {
                    android.os.Vibrator vibrator = (android.os.Vibrator) le1Var.getValue();
                    if (vibrator != null) {
                        createOneShot = android.os.VibrationEffect.createOneShot(j, -1);
                        vibrator.vibrate(createOneShot);
                    }
                } else {
                    android.os.Vibrator vibrator2 = (android.os.Vibrator) le1Var.getValue();
                    if (vibrator2 != null) {
                        vibrator2.vibrate(j);
                    }
                }
            } catch (java.lang.Throwable unused2) {
            }
        }
    }
}
