package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class y2 implements defpackage.sm {
    public final java.util.concurrent.atomic.AtomicReference P05cfTpS5W5L = new java.util.concurrent.atomic.AtomicReference(null);
    public final defpackage.sm QiMR8OkAhezm;
    public final android.view.View WDYagTQQm9ns;
    public final defpackage.sm1 oh71FJcDz6S2;

    public y2(android.view.View view, defpackage.sm1 sm1Var, defpackage.sm smVar) {
        this.WDYagTQQm9ns = view;
        this.oh71FJcDz6S2 = sm1Var;
        this.QiMR8OkAhezm = smVar;
    }

    @Override // defpackage.sm
    public final defpackage.jm QiMR8OkAhezm() {
        return this.QiMR8OkAhezm.QiMR8OkAhezm();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ZpBGe2uQfcn8(defpackage.ig0 ig0Var, defpackage.ll llVar) {
        defpackage.v2 v2Var;
        int i;
        if (llVar instanceof defpackage.v2) {
            v2Var = (defpackage.v2) llVar;
            int i2 = v2Var.GE9mJIPrb8gP;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v2Var.GE9mJIPrb8gP = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = v2Var.P05cfTpS5W5L;
                i = v2Var.GE9mJIPrb8gP;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.x2 x2Var = new defpackage.x2(0, ig0Var, this);
                    defpackage.kl klVar = null;
                    defpackage.JhCgjQRTAOCT jhCgjQRTAOCT = new defpackage.JhCgjQRTAOCT(this, klVar, 3);
                    v2Var.GE9mJIPrb8gP = 1;
                    if (defpackage.ok0.IJ0hOnjhPOri(new defpackage.e2(x2Var, this.P05cfTpS5W5L, jhCgjQRTAOCT, klVar, 8), v2Var) == defpackage.tm.WDYagTQQm9ns) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    defpackage.b80.KrtOTfE6jiS2(obj);
                }
                defpackage.h7.JhCgjQRTAOCT();
            }
        }
        v2Var = new defpackage.v2(this, llVar);
        java.lang.Object obj2 = v2Var.P05cfTpS5W5L;
        i = v2Var.GE9mJIPrb8gP;
        if (i != 0) {
        }
        defpackage.h7.JhCgjQRTAOCT();
    }
}
