package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dy extends defpackage.mi1 implements defpackage.d20 {
    public int GE9mJIPrb8gP;
    public /* synthetic */ defpackage.ux Ns0WNyEWdPsk;
    public final /* synthetic */ int e6mdH7fiFuta;
    public /* synthetic */ java.lang.Object fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.k20 h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(defpackage.kl klVar, defpackage.ai0 ai0Var) {
        super(3, klVar);
        this.e6mdH7fiFuta = 1;
        this.h3m55N1URyyK = ai0Var;
    }

    @Override // defpackage.d20
    public final java.lang.Object JhCgjQRTAOCT(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.k20 k20Var = this.h3m55N1URyyK;
        defpackage.ux uxVar = (defpackage.ux) obj;
        switch (i) {
            case 0:
                defpackage.dy dyVar = new defpackage.dy((defpackage.c20) k20Var, (defpackage.kl) obj3, 0);
                dyVar.Ns0WNyEWdPsk = uxVar;
                dyVar.fNwYGHIYeJcR = obj2;
                return dyVar.s0TASMVLSWD5(gs1Var);
            case 1:
                defpackage.dy dyVar2 = new defpackage.dy((defpackage.kl) obj3, (defpackage.ai0) k20Var);
                dyVar2.Ns0WNyEWdPsk = uxVar;
                dyVar2.fNwYGHIYeJcR = (java.lang.Object[]) obj2;
                return dyVar2.s0TASMVLSWD5(gs1Var);
            default:
                defpackage.dy dyVar3 = new defpackage.dy((defpackage.q71) k20Var, (defpackage.kl) obj3, 2);
                dyVar3.Ns0WNyEWdPsk = uxVar;
                dyVar3.fNwYGHIYeJcR = (java.lang.Object[]) obj2;
                return dyVar3.s0TASMVLSWD5(gs1Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r10 == r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (r10 == r5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        if (r10 == r5) goto L44;
     */
    @Override // defpackage.m9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.ux uxVar;
        defpackage.ux uxVar2;
        defpackage.ux uxVar3;
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.k20 k20Var = this.h3m55N1URyyK;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        switch (i) {
            case 0:
                int i2 = this.GE9mJIPrb8gP;
                if (i2 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    uxVar = this.Ns0WNyEWdPsk;
                    java.lang.Object obj2 = this.fNwYGHIYeJcR;
                    this.Ns0WNyEWdPsk = uxVar;
                    this.GE9mJIPrb8gP = 1;
                    obj = ((defpackage.c20) k20Var).QiMR8OkAhezm(obj2, this);
                    break;
                } else if (i2 == 1) {
                    uxVar = this.Ns0WNyEWdPsk;
                    defpackage.b80.KrtOTfE6jiS2(obj);
                } else if (i2 != 2) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    break;
                }
                this.Ns0WNyEWdPsk = null;
                this.GE9mJIPrb8gP = 2;
                if (uxVar.fNwYGHIYeJcR(obj, this) != tmVar) {
                }
                break;
            case 1:
                int i3 = this.GE9mJIPrb8gP;
                if (i3 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    uxVar2 = this.Ns0WNyEWdPsk;
                    java.lang.Object[] objArr = (java.lang.Object[]) this.fNwYGHIYeJcR;
                    java.lang.Object obj3 = objArr[0];
                    java.lang.Object obj4 = objArr[1];
                    java.lang.Object obj5 = objArr[2];
                    this.Ns0WNyEWdPsk = uxVar2;
                    this.GE9mJIPrb8gP = 1;
                    obj = ((defpackage.ai0) k20Var).h3m55N1URyyK(obj3, obj4, obj5, this);
                    break;
                } else if (i3 == 1) {
                    uxVar2 = this.Ns0WNyEWdPsk;
                    defpackage.b80.KrtOTfE6jiS2(obj);
                } else if (i3 != 2) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    break;
                }
                this.Ns0WNyEWdPsk = null;
                this.GE9mJIPrb8gP = 2;
                if (uxVar2.fNwYGHIYeJcR(obj, this) != tmVar) {
                }
                break;
            default:
                int i4 = this.GE9mJIPrb8gP;
                if (i4 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    uxVar3 = this.Ns0WNyEWdPsk;
                    java.lang.Object[] objArr2 = (java.lang.Object[]) this.fNwYGHIYeJcR;
                    java.lang.Object obj6 = objArr2[0];
                    java.lang.Object obj7 = objArr2[1];
                    this.Ns0WNyEWdPsk = uxVar3;
                    this.GE9mJIPrb8gP = 1;
                    obj = ((defpackage.q71) k20Var).JhCgjQRTAOCT(obj6, obj7, this);
                    break;
                } else if (i4 == 1) {
                    uxVar3 = this.Ns0WNyEWdPsk;
                    defpackage.b80.KrtOTfE6jiS2(obj);
                } else if (i4 != 2) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    break;
                }
                this.Ns0WNyEWdPsk = null;
                this.GE9mJIPrb8gP = 2;
                if (uxVar3.fNwYGHIYeJcR(obj, this) != tmVar) {
                }
                break;
        }
        return tmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dy(defpackage.k20 k20Var, defpackage.kl klVar, int i) {
        super(3, klVar);
        this.e6mdH7fiFuta = i;
        this.h3m55N1URyyK = k20Var;
    }
}
