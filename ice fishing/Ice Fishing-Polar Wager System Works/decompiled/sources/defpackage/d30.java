package defpackage;

/* loaded from: classes.dex */
public final class d30 implements java.lang.Runnable {
    public final defpackage.nj AARZUJiTa;
    public final /* synthetic */ int adDC3e2L;
    public java.lang.Runnable xiZrDbcSW0;

    public d30(defpackage.bb bbVar, defpackage.e30 e30Var) {
        this.adDC3e2L = 0;
        this.xiZrDbcSW0 = bbVar;
        this.AARZUJiTa = e30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.adDC3e2L;
        defpackage.nj njVar = this.AARZUJiTa;
        switch (i) {
            case 0:
                ((defpackage.bb) this.xiZrDbcSW0).p4kuH6PDtgom((defpackage.e30) njVar);
                break;
            case 1:
                defpackage.de0 de0Var = (defpackage.de0) njVar;
                defpackage.nj njVar2 = de0Var.EXtogiMhuM;
                int i2 = 0;
                while (true) {
                    try {
                        this.xiZrDbcSW0.run();
                    } catch (java.lang.Throwable th) {
                        defpackage.gq1.kNAkVymC(defpackage.lt.adDC3e2L, th);
                    }
                    java.lang.Runnable p4kuH6PDtgom = de0Var.p4kuH6PDtgom();
                    if (p4kuH6PDtgom != null) {
                        this.xiZrDbcSW0 = p4kuH6PDtgom;
                        i2++;
                        if (i2 >= 16 && njVar2.frpfPPIgqM9O(de0Var)) {
                            njVar2.v5iciZok(de0Var, this);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
            default:
                ((defpackage.bb) this.xiZrDbcSW0).p4kuH6PDtgom((defpackage.ru) njVar);
                break;
        }
    }

    public /* synthetic */ d30(defpackage.nj njVar, java.lang.Runnable runnable, int i) {
        this.adDC3e2L = i;
        this.AARZUJiTa = njVar;
        this.xiZrDbcSW0 = runnable;
    }
}
