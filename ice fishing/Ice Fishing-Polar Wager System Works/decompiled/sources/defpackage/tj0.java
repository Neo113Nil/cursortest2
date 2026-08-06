package defpackage;

/* loaded from: classes.dex */
public final class tj0 implements defpackage.sj0 {
    public final defpackage.mt0 AARZUJiTa = new defpackage.mt0(1.0f);
    public defpackage.xb1 EXtogiMhuM;
    public final android.content.Context adDC3e2L;
    public defpackage.dj xiZrDbcSW0;

    public tj0(android.content.Context context) {
        this.adDC3e2L = context;
    }

    @Override // defpackage.lj
    public final java.lang.Object EgCjBq0SZwJ(defpackage.k00 k00Var, java.lang.Object obj) {
        return k00Var.adDC3e2L(obj, this);
    }

    @Override // defpackage.lj
    public final defpackage.lj JlrlGoKF(defpackage.lj ljVar) {
        return defpackage.ci0.hkbnNdmy(this, ljVar);
    }

    @Override // defpackage.sj0
    public final float PAEGRtP0bX() {
        defpackage.ej ejVar;
        defpackage.fc1 fc1Var;
        if (this.EXtogiMhuM == null) {
            android.content.Context context = this.adDC3e2L;
            defpackage.nl0 nl0Var = defpackage.np1.IHQe1A4L2xu;
            synchronized (nl0Var) {
                try {
                    java.lang.Object AARZUJiTa = nl0Var.AARZUJiTa(context);
                    ejVar = null;
                    if (AARZUJiTa == null) {
                        android.content.ContentResolver contentResolver = context.getContentResolver();
                        android.net.Uri uriFor = android.provider.Settings.Global.getUriFor("animator_duration_scale");
                        defpackage.x9 oh6vYeIP = defpackage.w70.oh6vYeIP(-1, 6, null);
                        defpackage.pl plVar = new defpackage.pl(2, new defpackage.lp1(contentResolver, uriFor, new defpackage.mp1(oh6vYeIP, defpackage.gq1.QoRHpC4k(android.os.Looper.getMainLooper())), oh6vYeIP, context, null));
                        defpackage.ld1 SH1y5HwkJhh = defpackage.c80.SH1y5HwkJhh();
                        defpackage.bn bnVar = defpackage.bq.IHQe1A4L2xu;
                        AARZUJiTa = defpackage.gq1.frpfPPIgqM9O(plVar, new defpackage.dj(defpackage.ci0.hkbnNdmy(SH1y5HwkJhh, defpackage.jg0.IHQe1A4L2xu)), new defpackage.cc1(0L, Long.MAX_VALUE), java.lang.Float.valueOf(android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        nl0Var.DFo87pBq1E5(context, AARZUJiTa);
                    }
                    fc1Var = (defpackage.fc1) AARZUJiTa;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            this.AARZUJiTa.EXtogiMhuM(((java.lang.Number) fc1Var.getValue()).floatValue());
            defpackage.dj djVar = this.xiZrDbcSW0;
            if (djVar == null) {
                defpackage.db.AARZUJiTa("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.EXtogiMhuM = defpackage.fm.SiPhmbmu(djVar, null, new defpackage.adDC3e2L(fc1Var, this, ejVar, 23), 3);
        }
        return this.AARZUJiTa.AARZUJiTa();
    }

    @Override // defpackage.lj
    public final defpackage.lj V7bD7b8KA(defpackage.kj kjVar) {
        return defpackage.ci0.XZx205DYe(this, kjVar);
    }

    @Override // defpackage.lj
    public final defpackage.jj cnag84Bm(defpackage.kj kjVar) {
        return defpackage.ci0.NHJTzaLwkd(this, kjVar);
    }
}
