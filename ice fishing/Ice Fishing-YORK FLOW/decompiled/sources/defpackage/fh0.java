package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fh0 extends defpackage.lm implements defpackage.uo {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater fNwYGHIYeJcR = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.fh0.class, "runningWorkers$volatile");
    public final defpackage.ti0 GE9mJIPrb8gP;
    public final java.lang.Object Ns0WNyEWdPsk;
    public final defpackage.lm P05cfTpS5W5L;
    public final /* synthetic */ defpackage.uo QiMR8OkAhezm;
    public final int e6mdH7fiFuta;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public fh0(defpackage.lm lmVar, int i) {
        defpackage.uo uoVar = lmVar instanceof defpackage.uo ? (defpackage.uo) lmVar : null;
        this.QiMR8OkAhezm = uoVar == null ? defpackage.vn.ZpBGe2uQfcn8 : uoVar;
        this.P05cfTpS5W5L = lmVar;
        this.e6mdH7fiFuta = i;
        this.GE9mJIPrb8gP = new defpackage.ti0();
        this.Ns0WNyEWdPsk = new java.lang.Object();
    }

    public final boolean BXaznwstz2U0() {
        synchronized (this.Ns0WNyEWdPsk) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = fNwYGHIYeJcR;
            if (atomicIntegerFieldUpdater.get(this) >= this.e6mdH7fiFuta) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    public final java.lang.Runnable IBvW5fLsPuHy() {
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.GE9mJIPrb8gP.JhCgjQRTAOCT();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.Ns0WNyEWdPsk) {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = fNwYGHIYeJcR;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.GE9mJIPrb8gP.fWTAfUmVKrZq() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.lm
    public final void Mearx7yMn90V(defpackage.jm jmVar, java.lang.Runnable runnable) {
        java.lang.Runnable IBvW5fLsPuHy;
        this.GE9mJIPrb8gP.ZpBGe2uQfcn8(runnable);
        if (fNwYGHIYeJcR.get(this) >= this.e6mdH7fiFuta || !BXaznwstz2U0() || (IBvW5fLsPuHy = IBvW5fLsPuHy()) == null) {
            return;
        }
        this.P05cfTpS5W5L.Mearx7yMn90V(this, new defpackage.vc(this, IBvW5fLsPuHy));
    }

    @Override // defpackage.uo
    public final defpackage.cr QiMR8OkAhezm(long j, defpackage.ho1 ho1Var, defpackage.jm jmVar) {
        return this.QiMR8OkAhezm.QiMR8OkAhezm(j, ho1Var, jmVar);
    }

    @Override // defpackage.uo
    public final void e6mdH7fiFuta(long j, defpackage.dd ddVar) {
        this.QiMR8OkAhezm.e6mdH7fiFuta(j, ddVar);
    }

    @Override // defpackage.lm
    public final void jjTN4uUnoyEn(defpackage.jm jmVar, java.lang.Runnable runnable) {
        java.lang.Runnable IBvW5fLsPuHy;
        this.GE9mJIPrb8gP.ZpBGe2uQfcn8(runnable);
        if (fNwYGHIYeJcR.get(this) >= this.e6mdH7fiFuta || !BXaznwstz2U0() || (IBvW5fLsPuHy = IBvW5fLsPuHy()) == null) {
            return;
        }
        this.P05cfTpS5W5L.jjTN4uUnoyEn(this, new defpackage.vc(this, IBvW5fLsPuHy));
    }

    @Override // defpackage.lm
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.P05cfTpS5W5L);
        sb.append(".limitedParallelism(");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.e6mdH7fiFuta, ')');
    }
}
