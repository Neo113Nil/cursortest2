package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pi extends defpackage.mi1 implements defpackage.c20 {
    public /* synthetic */ float GE9mJIPrb8gP;
    public final /* synthetic */ defpackage.qi Ns0WNyEWdPsk;
    public int e6mdH7fiFuta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(defpackage.qi qiVar, defpackage.kl klVar) {
        super(2, klVar);
        this.Ns0WNyEWdPsk = qiVar;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.pi) XntWc4eZSQ8j((defpackage.kl) obj2, java.lang.Float.valueOf(((java.lang.Number) obj).floatValue()))).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.pi piVar = new defpackage.pi(this.Ns0WNyEWdPsk, klVar);
        piVar.GE9mJIPrb8gP = ((java.lang.Number) obj).floatValue();
        return piVar;
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            float f = this.GE9mJIPrb8gP;
            defpackage.qi qiVar = this.Ns0WNyEWdPsk;
            java.lang.Object QiMR8OkAhezm = qiVar.ZpBGe2uQfcn8.JhCgjQRTAOCT.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.eb1.WDYagTQQm9ns);
            defpackage.c20 c20Var = (defpackage.c20) (QiMR8OkAhezm != null ? QiMR8OkAhezm : null);
            if (c20Var == null) {
                throw defpackage.pVQOaWB9QMo4.oh71FJcDz6S2("Required value was null.");
            }
            defpackage.ws0 ws0Var = new defpackage.ws0((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
            this.e6mdH7fiFuta = 1;
            obj = c20Var.QiMR8OkAhezm(ws0Var, this);
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
        return new java.lang.Float(java.lang.Float.intBitsToFloat((int) (((defpackage.ws0) obj).ZpBGe2uQfcn8 & 4294967295L)));
    }
}
