package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dn extends defpackage.mi1 implements defpackage.c20 {
    public /* synthetic */ java.lang.Object GE9mJIPrb8gP;
    public final /* synthetic */ java.lang.Object Ns0WNyEWdPsk;
    public final /* synthetic */ int e6mdH7fiFuta = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(defpackage.kl klVar, defpackage.y10 y10Var) {
        super(2, klVar);
        this.Ns0WNyEWdPsk = y10Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        switch (i) {
            case 0:
                return ((defpackage.dn) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sm) obj)).s0TASMVLSWD5(gs1Var);
            default:
                return ((defpackage.dn) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sw0) obj)).s0TASMVLSWD5(gs1Var);
        }
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        switch (this.e6mdH7fiFuta) {
            case 0:
                defpackage.dn dnVar = new defpackage.dn((defpackage.en) this.Ns0WNyEWdPsk, klVar);
                dnVar.GE9mJIPrb8gP = obj;
                return dnVar;
            default:
                defpackage.dn dnVar2 = new defpackage.dn(klVar, (defpackage.y10) this.Ns0WNyEWdPsk);
                dnVar2.GE9mJIPrb8gP = obj;
                return dnVar2;
        }
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        boolean z;
        int i = this.e6mdH7fiFuta;
        java.lang.Object obj2 = this.Ns0WNyEWdPsk;
        switch (i) {
            case 0:
                defpackage.b80.KrtOTfE6jiS2(obj);
                defpackage.sm smVar = (defpackage.sm) this.GE9mJIPrb8gP;
                defpackage.en enVar = (defpackage.en) obj2;
                defpackage.cb0 cb0Var = (defpackage.cb0) enVar.giKS3J6vZuNy.getAndSet(null);
                java.util.concurrent.atomic.AtomicReference atomicReference = enVar.giKS3J6vZuNy;
                defpackage.yf1 zJPqDeoF0Os1 = defpackage.ok0.zJPqDeoF0Os1(smVar, null, new defpackage.JhCgjQRTAOCT(cb0Var, enVar, null, 13), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, zJPqDeoF0Os1)) {
                        z = true;
                    } else if (atomicReference.get() != null) {
                        z = false;
                    }
                }
                return java.lang.Boolean.valueOf(z);
            default:
                defpackage.b80.KrtOTfE6jiS2(obj);
                defpackage.sw0 sw0Var = (defpackage.sw0) this.GE9mJIPrb8gP;
                sw0Var.getClass();
                return ((defpackage.y10) obj2).P05cfTpS5W5L(sw0Var.giKS3J6vZuNy());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(defpackage.en enVar, defpackage.kl klVar) {
        super(2, klVar);
        this.Ns0WNyEWdPsk = enVar;
    }
}
