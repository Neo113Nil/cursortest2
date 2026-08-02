package defpackage;

/* loaded from: classes8.dex */
public final class yef0 implements tse {
    public final qhw0 a;
    public final fse b;

    public yef0(kse kseVar, wff0 wff0Var) {
        qhw0 a = jl40.a();
        this.a = a;
        this.b = kseVar.b.plus(a);
        wff0Var.a(new vff0() { // from class: xef0
            @Override // defpackage.vff0
            public final void b() {
                yef0.this.a.a(null);
            }
        });
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.b;
    }
}
