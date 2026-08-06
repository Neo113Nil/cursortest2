package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rl1 extends defpackage.mi1 implements defpackage.d20 {
    public /* synthetic */ defpackage.s11 GE9mJIPrb8gP;
    public /* synthetic */ long Ns0WNyEWdPsk;
    public int e6mdH7fiFuta;
    public final /* synthetic */ defpackage.sm fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.in0 gUjdnLbkVAaA;
    public final /* synthetic */ defpackage.fo0 h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl1(defpackage.sm smVar, defpackage.fo0 fo0Var, defpackage.in0 in0Var, defpackage.kl klVar) {
        super(3, klVar);
        this.fNwYGHIYeJcR = smVar;
        this.h3m55N1URyyK = fo0Var;
        this.gUjdnLbkVAaA = in0Var;
    }

    @Override // defpackage.d20
    public final java.lang.Object JhCgjQRTAOCT(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j = ((defpackage.ws0) obj2).ZpBGe2uQfcn8;
        defpackage.fo0 fo0Var = this.h3m55N1URyyK;
        defpackage.in0 in0Var = this.gUjdnLbkVAaA;
        defpackage.rl1 rl1Var = new defpackage.rl1(this.fNwYGHIYeJcR, fo0Var, in0Var, (defpackage.kl) obj3);
        rl1Var.GE9mJIPrb8gP = (defpackage.s11) obj;
        rl1Var.Ns0WNyEWdPsk = j;
        return rl1Var.s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.sm smVar = this.fNwYGHIYeJcR;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            defpackage.s11 s11Var = this.GE9mJIPrb8gP;
            defpackage.ok0.zJPqDeoF0Os1(smVar, null, new defpackage.QiMR8OkAhezm(this.h3m55N1URyyK, this.Ns0WNyEWdPsk, this.gUjdnLbkVAaA, (defpackage.kl) null, 4), 3);
            this.e6mdH7fiFuta = 1;
            obj = s11Var.oh71FJcDz6S2(this);
            defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
            if (obj == tmVar) {
                return tmVar;
            }
        } else {
            if (i != 1) {
                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            defpackage.b80.KrtOTfE6jiS2(obj);
        }
        defpackage.ok0.zJPqDeoF0Os1(smVar, null, new defpackage.ql1(this.h3m55N1URyyK, ((java.lang.Boolean) obj).booleanValue(), this.gUjdnLbkVAaA, null), 3);
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
