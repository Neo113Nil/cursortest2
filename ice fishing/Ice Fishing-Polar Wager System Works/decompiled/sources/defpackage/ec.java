package defpackage;

/* loaded from: classes.dex */
public final class ec extends defpackage.t61 {
    public final defpackage.x9 AARZUJiTa;
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray EXtogiMhuM;

    public ec(long j, defpackage.ec ecVar, defpackage.x9 x9Var, int i) {
        super(j, ecVar, i);
        this.AARZUJiTa = x9Var;
        this.EXtogiMhuM = new java.util.concurrent.atomic.AtomicReferenceArray(defpackage.z9.oh6vYeIP * 2);
    }

    public final void EgCjBq0SZwJ(int i, java.lang.Object obj) {
        this.EXtogiMhuM.set((i * 2) + 1, obj);
    }

    public final void G3OKOH3wZRC(int i, boolean z) {
        if (z) {
            defpackage.x9 x9Var = this.AARZUJiTa;
            x9Var.getClass();
            x9Var.hkbnNdmy((this.adDC3e2L * defpackage.z9.oh6vYeIP) + i);
        }
        DFo87pBq1E5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        kd6TUFXn(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // defpackage.t61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void JlrlGoKF(int i, defpackage.lj ljVar) {
        int i2 = defpackage.z9.oh6vYeIP;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.EXtogiMhuM.get(i * 2);
        while (true) {
            java.lang.Object QoRHpC4k = QoRHpC4k(i);
            boolean z2 = QoRHpC4k instanceof defpackage.fn1;
            defpackage.x9 x9Var = this.AARZUJiTa;
            if (z2 || (QoRHpC4k instanceof defpackage.gn1)) {
                if (cnag84Bm(i, QoRHpC4k, z ? defpackage.z9.SH1y5HwkJhh : defpackage.z9.ez2rX8ReCYw)) {
                    kd6TUFXn(i, null);
                    G3OKOH3wZRC(i, !z);
                    if (z) {
                        x9Var.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (QoRHpC4k == defpackage.z9.SH1y5HwkJhh || QoRHpC4k == defpackage.z9.ez2rX8ReCYw) {
                    break;
                }
                if (QoRHpC4k != defpackage.z9.AARZUJiTa && QoRHpC4k != defpackage.z9.xiZrDbcSW0) {
                    if (QoRHpC4k == defpackage.z9.riuEU0zW4 || QoRHpC4k == defpackage.z9.F7NU4MC0GW || QoRHpC4k == defpackage.z9.JlrlGoKF) {
                        return;
                    }
                    defpackage.db.xiZrDbcSW0(QoRHpC4k, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final java.lang.Object QoRHpC4k(int i) {
        return this.EXtogiMhuM.get((i * 2) + 1);
    }

    public final boolean cnag84Bm(int i, java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.EXtogiMhuM;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    @Override // defpackage.t61
    public final int ez2rX8ReCYw() {
        return defpackage.z9.oh6vYeIP;
    }

    public final void kd6TUFXn(int i, java.lang.Object obj) {
        this.EXtogiMhuM.set(i * 2, obj);
    }
}
