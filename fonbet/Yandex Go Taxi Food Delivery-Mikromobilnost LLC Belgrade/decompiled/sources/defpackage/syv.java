package defpackage;

import ru.yandex.taxi.preorder.source.mode.interactor.e;

/* loaded from: classes14.dex */
public final class syv implements v7p {
    public final /* synthetic */ int a = 1;
    public final eqh b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public syv(eqh eqhVar, xvf0 xvf0Var, eqh eqhVar2, eqh eqhVar3) {
        this.b = eqhVar;
        this.c = xvf0Var;
        this.d = eqhVar2;
        this.e = eqhVar3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        eqh eqhVar = this.b;
        switch (i) {
            case 0:
                return new ryv(i5m.a(xvf0Var3), i5m.a(xvf0Var2), i5m.a(eqhVar), i5m.a(xvf0Var));
            default:
                return new wjt0((xvw) eqhVar.get(), (uq40) xvf0Var3.get(), (pd61) xvf0Var2.get(), (e) xvf0Var.get());
        }
    }

    public syv(xvf0 xvf0Var, eqh eqhVar, eqh eqhVar2, wrh wrhVar) {
        this.c = xvf0Var;
        this.d = eqhVar;
        this.b = eqhVar2;
        this.e = wrhVar;
    }
}
