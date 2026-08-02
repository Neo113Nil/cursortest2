package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class lnq implements l63 {
    public final /* synthetic */ q63 a;

    public lnq() {
        l18 l18Var = l18.b;
        bdt I = hag.I(cc7.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        cc7 cc7Var = (cc7) qdcVar.C(I);
        bdt I2 = hag.I(frt.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        String str = ((frt) qdcVar2.C(I2)).c().a;
        str.getClass();
        this.a = new q63(cc7Var, str);
    }

    @Override // defpackage.l63
    public final Object a(wfm wfmVar, boolean z, Continuation continuation) {
        return this.a.a(wfmVar, z, continuation);
    }

    @Override // defpackage.l63
    public final Object b(wfm wfmVar, Continuation continuation) {
        return this.a.b(wfmVar, continuation);
    }
}
