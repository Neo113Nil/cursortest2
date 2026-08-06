package defpackage;

/* loaded from: classes.dex */
public final class y70 extends defpackage.n11 {
    public final /* synthetic */ defpackage.k00 AARZUJiTa;
    public final /* synthetic */ defpackage.ej EXtogiMhuM;
    public int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(defpackage.ej ejVar, defpackage.ej ejVar2, defpackage.k00 k00Var) {
        super(ejVar);
        this.AARZUJiTa = k00Var;
        this.EXtogiMhuM = ejVar2;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.xiZrDbcSW0;
        if (i != 0) {
            if (i != 1) {
                defpackage.db.AARZUJiTa("This coroutine had already completed");
                return null;
            }
            this.xiZrDbcSW0 = 2;
            defpackage.f70.nBH8hAHy(obj);
            return obj;
        }
        this.xiZrDbcSW0 = 1;
        defpackage.f70.nBH8hAHy(obj);
        defpackage.k00 k00Var = this.AARZUJiTa;
        k00Var.getClass();
        defpackage.mj1.kNAkVymC(2, k00Var);
        return k00Var.adDC3e2L(this.EXtogiMhuM, this);
    }
}
