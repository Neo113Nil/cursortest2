package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vk extends defpackage.mi1 implements defpackage.c20 {
    public /* synthetic */ java.lang.Object GE9mJIPrb8gP;
    public final /* synthetic */ defpackage.wk Ns0WNyEWdPsk;
    public int e6mdH7fiFuta;
    public final /* synthetic */ defpackage.qs1 fNwYGHIYeJcR;
    public final /* synthetic */ long gUjdnLbkVAaA;
    public final /* synthetic */ defpackage.qb h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(defpackage.wk wkVar, defpackage.qs1 qs1Var, defpackage.qb qbVar, long j, defpackage.kl klVar) {
        super(2, klVar);
        this.Ns0WNyEWdPsk = wkVar;
        this.fNwYGHIYeJcR = qs1Var;
        this.h3m55N1URyyK = qbVar;
        this.gUjdnLbkVAaA = j;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.vk) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sm) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.vk vkVar = new defpackage.vk(this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, this.h3m55N1URyyK, this.gUjdnLbkVAaA, klVar);
        vkVar.GE9mJIPrb8gP = obj;
        return vkVar;
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.wk wkVar = this.Ns0WNyEWdPsk;
        defpackage.gb gbVar = wkVar.IJ0hOnjhPOri;
        int i = this.e6mdH7fiFuta;
        try {
            try {
                if (i == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.cb0 w7APNrr0aGRc = defpackage.b80.w7APNrr0aGRc(((defpackage.sm) this.GE9mJIPrb8gP).QiMR8OkAhezm());
                    wkVar.dG7RjM6DqYVL = true;
                    defpackage.y91 y91Var = wkVar.ZVVdXbWmyCSK;
                    defpackage.jo0 jo0Var = defpackage.jo0.WDYagTQQm9ns;
                    defpackage.uk ukVar = new defpackage.uk(this.fNwYGHIYeJcR, wkVar, this.h3m55N1URyyK, this.gUjdnLbkVAaA, w7APNrr0aGRc, null);
                    this.e6mdH7fiFuta = 1;
                    java.lang.Object oh71FJcDz6S2 = y91Var.oh71FJcDz6S2(jo0Var, ukVar, this);
                    defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                    if (oh71FJcDz6S2 == tmVar) {
                        return tmVar;
                    }
                } else {
                    if (i != 1) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.b80.KrtOTfE6jiS2(obj);
                }
                gbVar.giKS3J6vZuNy();
                wkVar.dG7RjM6DqYVL = false;
                gbVar.ZpBGe2uQfcn8(null);
                wkVar.VFeft99leXEK = false;
                return defpackage.gs1.ZpBGe2uQfcn8;
            } catch (java.util.concurrent.CancellationException e) {
                throw e;
            }
        } catch (java.lang.Throwable th) {
            wkVar.dG7RjM6DqYVL = false;
            gbVar.ZpBGe2uQfcn8(null);
            wkVar.VFeft99leXEK = false;
            throw th;
        }
    }
}
