package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class x91 extends defpackage.mi1 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public /* synthetic */ long Ns0WNyEWdPsk;
    public long e6mdH7fiFuta;
    public final /* synthetic */ defpackage.y91 fNwYGHIYeJcR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x91(defpackage.y91 y91Var, defpackage.kl klVar) {
        super(2, klVar);
        this.fNwYGHIYeJcR = y91Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        long j = ((defpackage.jt1) obj).ZpBGe2uQfcn8;
        defpackage.x91 x91Var = new defpackage.x91(this.fNwYGHIYeJcR, (defpackage.kl) obj2);
        x91Var.Ns0WNyEWdPsk = j;
        return x91Var.s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.x91 x91Var = new defpackage.x91(this.fNwYGHIYeJcR, klVar);
        x91Var.Ns0WNyEWdPsk = ((defpackage.jt1) obj).ZpBGe2uQfcn8;
        return x91Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // defpackage.m9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.GE9mJIPrb8gP;
        defpackage.y91 y91Var = this.fNwYGHIYeJcR;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            j = this.Ns0WNyEWdPsk;
            defpackage.s81 s81Var = y91Var.oh71FJcDz6S2;
            this.Ns0WNyEWdPsk = j;
            this.GE9mJIPrb8gP = 1;
            obj = s81Var.e6mdH7fiFuta(j, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = this.e6mdH7fiFuta;
                    j3 = this.Ns0WNyEWdPsk;
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    return new defpackage.jt1(defpackage.jt1.JhCgjQRTAOCT(j3, defpackage.jt1.JhCgjQRTAOCT(j4, ((defpackage.jt1) obj).ZpBGe2uQfcn8)));
                }
                j2 = this.e6mdH7fiFuta;
                j = this.Ns0WNyEWdPsk;
                defpackage.b80.KrtOTfE6jiS2(obj);
                long j5 = ((defpackage.jt1) obj).ZpBGe2uQfcn8;
                defpackage.s81 s81Var2 = y91Var.oh71FJcDz6S2;
                long JhCgjQRTAOCT = defpackage.jt1.JhCgjQRTAOCT(j2, j5);
                this.Ns0WNyEWdPsk = j;
                this.e6mdH7fiFuta = j5;
                this.GE9mJIPrb8gP = 3;
                obj = s81Var2.P05cfTpS5W5L(JhCgjQRTAOCT, j5, this);
                if (obj != tmVar) {
                    j3 = j;
                    j4 = j5;
                    return new defpackage.jt1(defpackage.jt1.JhCgjQRTAOCT(j3, defpackage.jt1.JhCgjQRTAOCT(j4, ((defpackage.jt1) obj).ZpBGe2uQfcn8)));
                }
                return tmVar;
            }
            j = this.Ns0WNyEWdPsk;
            defpackage.b80.KrtOTfE6jiS2(obj);
        }
        long JhCgjQRTAOCT2 = defpackage.jt1.JhCgjQRTAOCT(j, ((defpackage.jt1) obj).ZpBGe2uQfcn8);
        this.Ns0WNyEWdPsk = j;
        this.e6mdH7fiFuta = JhCgjQRTAOCT2;
        this.GE9mJIPrb8gP = 2;
        obj = y91Var.ZpBGe2uQfcn8(JhCgjQRTAOCT2, this);
        if (obj != tmVar) {
            j2 = JhCgjQRTAOCT2;
            long j52 = ((defpackage.jt1) obj).ZpBGe2uQfcn8;
            defpackage.s81 s81Var22 = y91Var.oh71FJcDz6S2;
            long JhCgjQRTAOCT3 = defpackage.jt1.JhCgjQRTAOCT(j2, j52);
            this.Ns0WNyEWdPsk = j;
            this.e6mdH7fiFuta = j52;
            this.GE9mJIPrb8gP = 3;
            obj = s81Var22.P05cfTpS5W5L(JhCgjQRTAOCT3, j52, this);
            if (obj != tmVar) {
            }
        }
        return tmVar;
    }
}
