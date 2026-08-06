package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class v91 extends defpackage.mi1 implements defpackage.c20 {
    public defpackage.y31 GE9mJIPrb8gP;
    public long Ns0WNyEWdPsk;
    public final /* synthetic */ defpackage.y31 T1fB7bDYiVJQ;
    public final /* synthetic */ long XntWc4eZSQ8j;
    public defpackage.y91 e6mdH7fiFuta;
    public int fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.y91 gUjdnLbkVAaA;
    public /* synthetic */ java.lang.Object h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v91(defpackage.y91 y91Var, defpackage.y31 y31Var, long j, defpackage.kl klVar) {
        super(2, klVar);
        this.gUjdnLbkVAaA = y91Var;
        this.T1fB7bDYiVJQ = y31Var;
        this.XntWc4eZSQ8j = j;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.v91) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.w91) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.v91 v91Var = new defpackage.v91(this.gUjdnLbkVAaA, this.T1fB7bDYiVJQ, this.XntWc4eZSQ8j, klVar);
        v91Var.h3m55N1URyyK = obj;
        return v91Var;
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.y91 y91Var;
        defpackage.y31 y31Var;
        defpackage.y91 y91Var2;
        long j;
        int i = this.fNwYGHIYeJcR;
        defpackage.fv0 fv0Var = defpackage.fv0.oh71FJcDz6S2;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            defpackage.w91 w91Var = (defpackage.w91) this.h3m55N1URyyK;
            y91Var = this.gUjdnLbkVAaA;
            defpackage.u91 u91Var = new defpackage.u91(y91Var, w91Var);
            defpackage.xn xnVar = y91Var.fWTAfUmVKrZq;
            y31Var = this.T1fB7bDYiVJQ;
            long j2 = y31Var.WDYagTQQm9ns;
            defpackage.fv0 fv0Var2 = y91Var.JhCgjQRTAOCT;
            long j3 = this.XntWc4eZSQ8j;
            float JhCgjQRTAOCT = y91Var.JhCgjQRTAOCT(fv0Var2 == fv0Var ? defpackage.jt1.giKS3J6vZuNy(j3) : defpackage.jt1.fWTAfUmVKrZq(j3));
            this.h3m55N1URyyK = y91Var;
            this.e6mdH7fiFuta = y91Var;
            this.GE9mJIPrb8gP = y31Var;
            this.Ns0WNyEWdPsk = j2;
            this.fNwYGHIYeJcR = 1;
            xnVar.getClass();
            obj = defpackage.ok0.fhbmYuu9J3cT(xnVar.giKS3J6vZuNy, new defpackage.wn(JhCgjQRTAOCT, xnVar, u91Var, null), this);
            defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
            if (obj == tmVar) {
                return tmVar;
            }
            y91Var2 = y91Var;
            j = j2;
        } else {
            if (i != 1) {
                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.Ns0WNyEWdPsk;
            y31Var = this.GE9mJIPrb8gP;
            y91Var = this.e6mdH7fiFuta;
            y91Var2 = (defpackage.y91) this.h3m55N1URyyK;
            defpackage.b80.KrtOTfE6jiS2(obj);
        }
        float JhCgjQRTAOCT2 = y91Var2.JhCgjQRTAOCT(((java.lang.Number) obj).floatValue());
        y31Var.WDYagTQQm9ns = y91Var.JhCgjQRTAOCT == fv0Var ? defpackage.jt1.ZpBGe2uQfcn8(j, JhCgjQRTAOCT2, 0.0f, 2) : defpackage.jt1.ZpBGe2uQfcn8(j, 0.0f, JhCgjQRTAOCT2, 1);
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
