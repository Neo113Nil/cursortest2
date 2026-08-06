package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zl1 extends defpackage.mi1 implements defpackage.c20 {
    public final /* synthetic */ defpackage.em1 GE9mJIPrb8gP;
    public final /* synthetic */ boolean Ns0WNyEWdPsk;
    public int e6mdH7fiFuta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl1(defpackage.em1 em1Var, boolean z, defpackage.kl klVar) {
        super(2, klVar);
        this.GE9mJIPrb8gP = em1Var;
        this.Ns0WNyEWdPsk = z;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.zl1) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sm) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        return new defpackage.zl1(this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, klVar);
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.ye yeVar;
        int i = this.e6mdH7fiFuta;
        defpackage.l6 l6Var = null;
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
        defpackage.em1 em1Var = this.GE9mJIPrb8gP;
        if (!defpackage.in1.fWTAfUmVKrZq(em1Var.gUjdnLbkVAaA().giKS3J6vZuNy)) {
            l6Var = defpackage.v70.maCixPsq4ml2(em1Var.gUjdnLbkVAaA());
            if (this.Ns0WNyEWdPsk) {
                int WDYagTQQm9ns = defpackage.in1.WDYagTQQm9ns(em1Var.gUjdnLbkVAaA().giKS3J6vZuNy);
                em1Var.fWTAfUmVKrZq.P05cfTpS5W5L(defpackage.em1.WDYagTQQm9ns(em1Var.gUjdnLbkVAaA().ZpBGe2uQfcn8, defpackage.j80.JhCgjQRTAOCT(WDYagTQQm9ns, WDYagTQQm9ns)));
                em1Var.WmetiUbpKU9I(defpackage.q40.WDYagTQQm9ns);
            }
        }
        if (l6Var != null && (yeVar = em1Var.QiMR8OkAhezm) != null) {
            defpackage.xe qjMheFZ0l9kA = defpackage.nn.qjMheFZ0l9kA(l6Var);
            this.e6mdH7fiFuta = 1;
            ((defpackage.b) yeVar).ZpBGe2uQfcn8(qjMheFZ0l9kA);
            defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
            if (gs1Var == tmVar) {
                return tmVar;
            }
        }
        return gs1Var;
    }
}
