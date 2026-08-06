package defpackage;

/* loaded from: classes.dex */
public final class de0 extends defpackage.nj implements defpackage.jn {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater JlrlGoKF = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(defpackage.de0.class, "runningWorkers$volatile");
    public final /* synthetic */ defpackage.jn AARZUJiTa;
    public final defpackage.nj EXtogiMhuM;
    public final defpackage.kf0 SH1y5HwkJhh;
    public final java.lang.Object ez2rX8ReCYw;
    public final int riuEU0zW4;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public de0(defpackage.nj njVar, int i) {
        defpackage.jn jnVar = njVar instanceof defpackage.jn ? (defpackage.jn) njVar : null;
        this.AARZUJiTa = jnVar == null ? defpackage.om.IHQe1A4L2xu : jnVar;
        this.EXtogiMhuM = njVar;
        this.riuEU0zW4 = i;
        this.SH1y5HwkJhh = new defpackage.kf0();
        this.ez2rX8ReCYw = new java.lang.Object();
    }

    @Override // defpackage.jn
    public final defpackage.kq AARZUJiTa(long j, defpackage.zg1 zg1Var, defpackage.lj ljVar) {
        return this.AARZUJiTa.AARZUJiTa(j, zg1Var, ljVar);
    }

    @Override // defpackage.nj
    public final void D2vUnMij(defpackage.lj ljVar, java.lang.Runnable runnable) {
        java.lang.Runnable p4kuH6PDtgom;
        this.SH1y5HwkJhh.IHQe1A4L2xu(runnable);
        if (JlrlGoKF.get(this) >= this.riuEU0zW4 || !yIx6ChFVk() || (p4kuH6PDtgom = p4kuH6PDtgom()) == null) {
            return;
        }
        this.EXtogiMhuM.D2vUnMij(this, new defpackage.d30(this, p4kuH6PDtgom, 1));
    }

    public final java.lang.Runnable p4kuH6PDtgom() {
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.SH1y5HwkJhh.F7NU4MC0GW();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.ez2rX8ReCYw) {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = JlrlGoKF;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.SH1y5HwkJhh.r1MBDhnF() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.jn
    public final void riuEU0zW4(long j, defpackage.bb bbVar) {
        this.AARZUJiTa.riuEU0zW4(j, bbVar);
    }

    @Override // defpackage.nj
    public final java.lang.String toString() {
        return this.EXtogiMhuM + ".limitedParallelism(" + this.riuEU0zW4 + ')';
    }

    @Override // defpackage.nj
    public final void v5iciZok(defpackage.lj ljVar, java.lang.Runnable runnable) {
        java.lang.Runnable p4kuH6PDtgom;
        this.SH1y5HwkJhh.IHQe1A4L2xu(runnable);
        if (JlrlGoKF.get(this) >= this.riuEU0zW4 || !yIx6ChFVk() || (p4kuH6PDtgom = p4kuH6PDtgom()) == null) {
            return;
        }
        this.EXtogiMhuM.v5iciZok(this, new defpackage.d30(this, p4kuH6PDtgom, 1));
    }

    public final boolean yIx6ChFVk() {
        synchronized (this.ez2rX8ReCYw) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = JlrlGoKF;
            if (atomicIntegerFieldUpdater.get(this) >= this.riuEU0zW4) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
