package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class na0 extends defpackage.e51 {
    public final /* synthetic */ defpackage.kl P05cfTpS5W5L;
    public final /* synthetic */ defpackage.c20 QiMR8OkAhezm;
    public int oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na0(defpackage.kl klVar, defpackage.kl klVar2, defpackage.c20 c20Var) {
        super(klVar);
        this.QiMR8OkAhezm = c20Var;
        this.P05cfTpS5W5L = klVar2;
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.oh71FJcDz6S2;
        if (i != 0) {
            if (i != 1) {
                defpackage.h7.P05cfTpS5W5L("This coroutine had already completed");
                return null;
            }
            this.oh71FJcDz6S2 = 2;
            defpackage.b80.KrtOTfE6jiS2(obj);
            return obj;
        }
        this.oh71FJcDz6S2 = 1;
        defpackage.b80.KrtOTfE6jiS2(obj);
        defpackage.c20 c20Var = this.QiMR8OkAhezm;
        c20Var.getClass();
        defpackage.nq1.IJ0hOnjhPOri(2, c20Var);
        return c20Var.QiMR8OkAhezm(this.P05cfTpS5W5L, this);
    }
}
