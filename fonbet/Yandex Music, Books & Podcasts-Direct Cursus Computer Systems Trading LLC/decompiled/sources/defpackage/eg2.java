package defpackage;

/* loaded from: classes3.dex */
public final class eg2 {
    public final e00 a;

    public eg2(fg2 fg2Var) {
        this.a = new e00(fg2Var);
    }

    public final mg2 a(jfu jfuVar) {
        jfuVar.getClass();
        e00 e00Var = this.a;
        e00Var.getClass();
        ri1 ri1Var = new ri1(23, e00Var);
        lm4 a = ern.a(og2.class);
        wz wzVar = new wz(8, ri1Var);
        gs6 gs6Var = gs6.b;
        gs6Var.getClass();
        bjt bjtVar = new bjt(jfuVar, wzVar, gs6Var);
        String f = a.f();
        if (f != null) {
            return new mg2((og2) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f)));
        }
        xq0.x("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
