package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ga1 extends defpackage.mi1 implements defpackage.y10 {
    public final /* synthetic */ java.lang.Object GE9mJIPrb8gP;
    public final /* synthetic */ java.lang.Object Ns0WNyEWdPsk;
    public int e6mdH7fiFuta;
    public final /* synthetic */ defpackage.ja1 fNwYGHIYeJcR;
    public final /* synthetic */ float gUjdnLbkVAaA;
    public final /* synthetic */ defpackage.jp1 h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga1(java.lang.Object obj, java.lang.Object obj2, defpackage.ja1 ja1Var, defpackage.jp1 jp1Var, float f, defpackage.kl klVar) {
        super(1, klVar);
        this.GE9mJIPrb8gP = obj;
        this.Ns0WNyEWdPsk = obj2;
        this.fNwYGHIYeJcR = ja1Var;
        this.h3m55N1URyyK = jp1Var;
        this.gUjdnLbkVAaA = f;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        defpackage.jp1 jp1Var = this.h3m55N1URyyK;
        float f = this.gUjdnLbkVAaA;
        return new defpackage.ga1(this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, jp1Var, f, (defpackage.kl) obj).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            defpackage.fa1 fa1Var = new defpackage.fa1(this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, this.h3m55N1URyyK, this.gUjdnLbkVAaA, null);
            this.e6mdH7fiFuta = 1;
            java.lang.Object IJ0hOnjhPOri = defpackage.ok0.IJ0hOnjhPOri(fa1Var, this);
            defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
            if (IJ0hOnjhPOri == tmVar) {
                return tmVar;
            }
        } else {
            if (i != 1) {
                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            defpackage.b80.KrtOTfE6jiS2(obj);
        }
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
