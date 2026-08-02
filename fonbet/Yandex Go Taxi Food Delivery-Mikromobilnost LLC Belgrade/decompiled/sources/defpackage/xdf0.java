package defpackage;

/* loaded from: classes15.dex */
public final class xdf0 implements tse {
    public final qhw0 a;
    public final fse b;

    public xdf0(kse kseVar, wff0 wff0Var) {
        qhw0 a = jl40.a();
        this.a = a;
        this.b = kseVar.e.plus(a);
        wff0Var.a(new fn3(12, this));
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.b;
    }
}
