package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class p91 extends defpackage.mi1 implements defpackage.c20 {
    public final /* synthetic */ defpackage.q91 GE9mJIPrb8gP;
    public final /* synthetic */ float Ns0WNyEWdPsk;
    public int e6mdH7fiFuta;
    public final /* synthetic */ float fNwYGHIYeJcR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p91(defpackage.q91 q91Var, float f, float f2, defpackage.kl klVar) {
        super(2, klVar);
        this.GE9mJIPrb8gP = q91Var;
        this.Ns0WNyEWdPsk = f;
        this.fNwYGHIYeJcR = f2;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.p91) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sm) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        return new defpackage.p91(this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, klVar);
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            this.e6mdH7fiFuta = 1;
            java.lang.Object ZpBGe2uQfcn8 = defpackage.j91.ZpBGe2uQfcn8(this.GE9mJIPrb8gP.Jkfc0NcwyPL8, (java.lang.Float.floatToRawIntBits(this.Ns0WNyEWdPsk) << 32) | (java.lang.Float.floatToRawIntBits(this.fNwYGHIYeJcR) & 4294967295L), this);
            defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
            if (ZpBGe2uQfcn8 == tmVar) {
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
