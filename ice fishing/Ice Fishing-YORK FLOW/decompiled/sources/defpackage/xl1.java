package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xl1 extends defpackage.mi1 implements defpackage.y10 {
    public final /* synthetic */ defpackage.em1 GE9mJIPrb8gP;
    public int e6mdH7fiFuta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl1(defpackage.em1 em1Var, defpackage.kl klVar) {
        super(1, klVar);
        this.GE9mJIPrb8gP = em1Var;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        return new defpackage.xl1(this.GE9mJIPrb8gP, (defpackage.kl) obj).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r13 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0028, code lost:
    
        if (r5.BHfvd2J71qpO(r13) == r6) goto L28;
     */
    @Override // defpackage.m9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        java.lang.Object obj2;
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.em1 em1Var = this.GE9mJIPrb8gP;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            this.e6mdH7fiFuta = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.b80.KrtOTfE6jiS2(obj);
                em1Var.OcTWLQzke1i2 = true;
                return gs1Var;
            }
            defpackage.b80.KrtOTfE6jiS2(obj);
        }
        defpackage.bw0 ZpBGe2uQfcn8 = defpackage.em1.ZpBGe2uQfcn8(em1Var);
        if (ZpBGe2uQfcn8 != null) {
            java.lang.String str = (java.lang.String) ZpBGe2uQfcn8.WDYagTQQm9ns;
            long j = ((defpackage.in1) ZpBGe2uQfcn8.oh71FJcDz6S2).ZpBGe2uQfcn8;
            defpackage.lz0 lz0Var = em1Var.e6mdH7fiFuta;
            if (lz0Var != null) {
                this.e6mdH7fiFuta = 2;
                if (str.length() == 0 || defpackage.in1.fWTAfUmVKrZq(j)) {
                    obj2 = gs1Var;
                } else {
                    obj2 = defpackage.ok0.fhbmYuu9J3cT(lz0Var.ZpBGe2uQfcn8, new defpackage.e2(lz0Var, new defpackage.QiMR8OkAhezm(j, null, lz0Var, str), null), this);
                }
                if (obj2 != tmVar) {
                    obj2 = gs1Var;
                }
            }
        }
        em1Var.OcTWLQzke1i2 = true;
        return gs1Var;
    }
}
