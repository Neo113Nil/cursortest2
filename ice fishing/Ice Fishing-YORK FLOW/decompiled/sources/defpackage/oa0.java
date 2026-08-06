package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class oa0 extends defpackage.ll {
    public final /* synthetic */ defpackage.kl GE9mJIPrb8gP;
    public int P05cfTpS5W5L;
    public final /* synthetic */ defpackage.c20 e6mdH7fiFuta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(defpackage.kl klVar, defpackage.jm jmVar, defpackage.c20 c20Var, defpackage.kl klVar2) {
        super(klVar, jmVar);
        this.e6mdH7fiFuta = c20Var;
        this.GE9mJIPrb8gP = klVar2;
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.P05cfTpS5W5L;
        if (i != 0) {
            if (i != 1) {
                defpackage.h7.P05cfTpS5W5L("This coroutine had already completed");
                return null;
            }
            this.P05cfTpS5W5L = 2;
            defpackage.b80.KrtOTfE6jiS2(obj);
            return obj;
        }
        this.P05cfTpS5W5L = 1;
        defpackage.b80.KrtOTfE6jiS2(obj);
        defpackage.c20 c20Var = this.e6mdH7fiFuta;
        c20Var.getClass();
        defpackage.nq1.IJ0hOnjhPOri(2, c20Var);
        return c20Var.QiMR8OkAhezm(this.GE9mJIPrb8gP, this);
    }
}
