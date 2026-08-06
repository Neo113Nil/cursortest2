package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bg1 extends defpackage.mi1 implements defpackage.d20 {
    public /* synthetic */ defpackage.ux GE9mJIPrb8gP;
    public /* synthetic */ int Ns0WNyEWdPsk;
    public int e6mdH7fiFuta;
    public final /* synthetic */ defpackage.cg1 fNwYGHIYeJcR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg1(defpackage.cg1 cg1Var, defpackage.kl klVar) {
        super(3, klVar);
        this.fNwYGHIYeJcR = cg1Var;
    }

    @Override // defpackage.d20
    public final java.lang.Object JhCgjQRTAOCT(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj2).intValue();
        defpackage.bg1 bg1Var = new defpackage.bg1(this.fNwYGHIYeJcR, (defpackage.kl) obj3);
        bg1Var.GE9mJIPrb8gP = (defpackage.ux) obj;
        bg1Var.Ns0WNyEWdPsk = intValue;
        return bg1Var.s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if (r0.fNwYGHIYeJcR(defpackage.od1.QiMR8OkAhezm, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (defpackage.nn.GE9mJIPrb8gP(Long.MAX_VALUE, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r0.fNwYGHIYeJcR(defpackage.od1.oh71FJcDz6S2, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r0.fNwYGHIYeJcR(defpackage.od1.WDYagTQQm9ns, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (defpackage.nn.GE9mJIPrb8gP(0, r8) == r7) goto L32;
     */
    @Override // defpackage.m9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.ux uxVar;
        int i = this.e6mdH7fiFuta;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            uxVar = this.GE9mJIPrb8gP;
            if (this.Ns0WNyEWdPsk > 0) {
                this.e6mdH7fiFuta = 1;
            } else {
                this.GE9mJIPrb8gP = uxVar;
                this.e6mdH7fiFuta = 2;
            }
            return tmVar;
        }
        if (i != 1) {
            if (i == 2) {
                uxVar = this.GE9mJIPrb8gP;
                defpackage.b80.KrtOTfE6jiS2(obj);
                this.GE9mJIPrb8gP = uxVar;
                this.e6mdH7fiFuta = 3;
            } else if (i == 3) {
                uxVar = this.GE9mJIPrb8gP;
                defpackage.b80.KrtOTfE6jiS2(obj);
                this.GE9mJIPrb8gP = uxVar;
                this.e6mdH7fiFuta = 4;
            } else if (i == 4) {
                uxVar = this.GE9mJIPrb8gP;
                defpackage.b80.KrtOTfE6jiS2(obj);
                this.GE9mJIPrb8gP = null;
                this.e6mdH7fiFuta = 5;
            } else if (i != 5) {
                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        defpackage.b80.KrtOTfE6jiS2(obj);
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
