package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bb1 extends defpackage.mi1 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public final /* synthetic */ long Ns0WNyEWdPsk;
    public final /* synthetic */ int e6mdH7fiFuta = 1;
    public final /* synthetic */ java.lang.Object fNwYGHIYeJcR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb1(long j, defpackage.ri1 ri1Var, defpackage.kl klVar) {
        super(2, klVar);
        this.Ns0WNyEWdPsk = j;
        this.fNwYGHIYeJcR = ri1Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.sm smVar = (defpackage.sm) obj;
        defpackage.kl klVar = (defpackage.kl) obj2;
        switch (i) {
        }
        return ((defpackage.bb1) XntWc4eZSQ8j(klVar, smVar)).s0TASMVLSWD5(gs1Var);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        java.lang.Object obj2 = this.fNwYGHIYeJcR;
        long j = this.Ns0WNyEWdPsk;
        switch (i) {
            case 0:
                return new defpackage.bb1((defpackage.z4) obj2, j, klVar);
            default:
                return new defpackage.bb1(j, (defpackage.ri1) obj2, klVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (defpackage.nn.GE9mJIPrb8gP(8, r13) == r7) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (defpackage.nn.GE9mJIPrb8gP(r8 - 8, r13) == r7) goto L16;
     */
    @Override // defpackage.m9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj2 = this.fNwYGHIYeJcR;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        long j = this.Ns0WNyEWdPsk;
        switch (i) {
            case 0:
                int i2 = this.GE9mJIPrb8gP;
                if (i2 != 0) {
                    if (i2 == 1) {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        return gs1Var;
                    }
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.b80.KrtOTfE6jiS2(obj);
                defpackage.z4 z4Var = (defpackage.z4) obj2;
                defpackage.ws0 ws0Var = new defpackage.ws0(j);
                defpackage.vf1 vf1Var = defpackage.cb1.JhCgjQRTAOCT;
                this.GE9mJIPrb8gP = 1;
                return defpackage.z4.fWTAfUmVKrZq(z4Var, ws0Var, vf1Var, null, this, 12) == tmVar ? tmVar : gs1Var;
            default:
                int i3 = this.GE9mJIPrb8gP;
                if (i3 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    this.GE9mJIPrb8gP = 1;
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        defpackage.dd ddVar = ((defpackage.ri1) obj2).QiMR8OkAhezm;
                        if (ddVar == null) {
                            return gs1Var;
                        }
                        ddVar.e6mdH7fiFuta(new defpackage.g51(new defpackage.xz0(j)));
                        return gs1Var;
                    }
                    defpackage.b80.KrtOTfE6jiS2(obj);
                }
                this.GE9mJIPrb8gP = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb1(defpackage.z4 z4Var, long j, defpackage.kl klVar) {
        super(2, klVar);
        this.fNwYGHIYeJcR = z4Var;
        this.Ns0WNyEWdPsk = j;
    }
}
