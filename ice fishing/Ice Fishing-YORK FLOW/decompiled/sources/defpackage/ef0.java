package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ef0 extends defpackage.mi1 implements defpackage.c20 {
    public final /* synthetic */ defpackage.ff0 GE9mJIPrb8gP;
    public final /* synthetic */ int Ns0WNyEWdPsk;
    public int e6mdH7fiFuta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef0(defpackage.ff0 ff0Var, int i, defpackage.kl klVar) {
        super(2, klVar);
        this.GE9mJIPrb8gP = ff0Var;
        this.Ns0WNyEWdPsk = i;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ef0) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sm) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        return new defpackage.ef0(this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, klVar);
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        if (i != 0) {
            if (i == 1) {
                defpackage.b80.KrtOTfE6jiS2(obj);
                return gs1Var;
            }
            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        defpackage.b80.KrtOTfE6jiS2(obj);
        defpackage.af0 af0Var = this.GE9mJIPrb8gP.ZVVdXbWmyCSK;
        this.e6mdH7fiFuta = 1;
        defpackage.tf0 tf0Var = af0Var.giKS3J6vZuNy;
        defpackage.n80 n80Var = defpackage.tf0.VFeft99leXEK;
        tf0Var.getClass();
        java.lang.Object JhCgjQRTAOCT = tf0Var.JhCgjQRTAOCT(defpackage.jo0.WDYagTQQm9ns, new defpackage.x6(tf0Var, this.Ns0WNyEWdPsk, (defpackage.kl) null), this);
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        if (JhCgjQRTAOCT != tmVar) {
            JhCgjQRTAOCT = gs1Var;
        }
        if (JhCgjQRTAOCT != tmVar) {
            JhCgjQRTAOCT = gs1Var;
        }
        return JhCgjQRTAOCT == tmVar ? tmVar : gs1Var;
    }
}
