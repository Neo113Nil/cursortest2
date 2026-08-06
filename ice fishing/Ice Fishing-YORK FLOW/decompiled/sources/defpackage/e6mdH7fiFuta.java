package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class e6mdH7fiFuta extends defpackage.mi1 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public final /* synthetic */ defpackage.in0 Ns0WNyEWdPsk;
    public final /* synthetic */ int e6mdH7fiFuta;
    public final /* synthetic */ defpackage.u11 fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.ve h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6mdH7fiFuta(defpackage.in0 in0Var, defpackage.u11 u11Var, defpackage.ve veVar, defpackage.kl klVar, int i) {
        super(2, klVar);
        this.e6mdH7fiFuta = i;
        this.Ns0WNyEWdPsk = in0Var;
        this.fNwYGHIYeJcR = u11Var;
        this.h3m55N1URyyK = veVar;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.sm smVar = (defpackage.sm) obj;
        defpackage.kl klVar = (defpackage.kl) obj2;
        switch (i) {
        }
        return ((defpackage.e6mdH7fiFuta) XntWc4eZSQ8j(klVar, smVar)).s0TASMVLSWD5(gs1Var);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        switch (this.e6mdH7fiFuta) {
            case 0:
                return new defpackage.e6mdH7fiFuta(this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, this.h3m55N1URyyK, klVar, 0);
            default:
                return new defpackage.e6mdH7fiFuta(this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, this.h3m55N1URyyK, klVar, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.ZpBGe2uQfcn8(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (defpackage.nn.GE9mJIPrb8gP(r4, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r3.ZpBGe2uQfcn8(r9, r10) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if (defpackage.nn.GE9mJIPrb8gP(r4, r10) == r6) goto L31;
     */
    @Override // defpackage.m9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.ve veVar = this.h3m55N1URyyK;
        defpackage.in0 in0Var = this.Ns0WNyEWdPsk;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        defpackage.u11 u11Var = this.fNwYGHIYeJcR;
        switch (i) {
            case 0:
                int i2 = this.GE9mJIPrb8gP;
                if (i2 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    long j = defpackage.we.ZpBGe2uQfcn8;
                    this.GE9mJIPrb8gP = 1;
                    break;
                } else if (i2 == 1) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                } else if (i2 != 2) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    veVar.IBvW5fLsPuHy = u11Var;
                    break;
                }
                this.GE9mJIPrb8gP = 2;
                break;
            default:
                int i3 = this.GE9mJIPrb8gP;
                if (i3 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    long j2 = defpackage.we.ZpBGe2uQfcn8;
                    this.GE9mJIPrb8gP = 1;
                    break;
                } else if (i3 == 1) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                } else if (i3 != 2) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    veVar.jjTN4uUnoyEn = u11Var;
                    break;
                }
                this.GE9mJIPrb8gP = 2;
                break;
        }
        return gs1Var;
    }
}
