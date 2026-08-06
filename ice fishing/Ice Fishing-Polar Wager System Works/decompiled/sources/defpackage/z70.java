package defpackage;

/* loaded from: classes.dex */
public final class z70 extends defpackage.fj {
    public int EXtogiMhuM;
    public final /* synthetic */ defpackage.ej SH1y5HwkJhh;
    public final /* synthetic */ defpackage.k00 riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z70(defpackage.ej ejVar, defpackage.lj ljVar, defpackage.k00 k00Var, defpackage.ej ejVar2) {
        super(ejVar, ljVar);
        this.riuEU0zW4 = k00Var;
        this.SH1y5HwkJhh = ejVar2;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.EXtogiMhuM;
        if (i != 0) {
            if (i != 1) {
                defpackage.db.AARZUJiTa("This coroutine had already completed");
                return null;
            }
            this.EXtogiMhuM = 2;
            defpackage.f70.nBH8hAHy(obj);
            return obj;
        }
        this.EXtogiMhuM = 1;
        defpackage.f70.nBH8hAHy(obj);
        defpackage.k00 k00Var = this.riuEU0zW4;
        k00Var.getClass();
        defpackage.mj1.kNAkVymC(2, k00Var);
        return k00Var.adDC3e2L(this.SH1y5HwkJhh, this);
    }
}
