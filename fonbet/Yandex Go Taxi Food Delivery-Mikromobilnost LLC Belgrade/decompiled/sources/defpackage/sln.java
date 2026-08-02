package defpackage;

import android.content.Context;
import android.os.Looper;
import ru.yandex.taxi.orderforanother.interactor.f;
import ru.yandex.taxi.orderforanother.repository.a;

/* loaded from: classes6.dex */
public final class sln implements v7p {
    public final /* synthetic */ int a = 0;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final eqh g;

    public sln(alx0 alx0Var, xvf0 xvf0Var, eqh eqhVar, eqh eqhVar2, eu0 eu0Var, xvf0 xvf0Var2) {
        this.b = alx0Var;
        this.c = xvf0Var;
        this.d = eqhVar;
        this.g = eqhVar2;
        this.e = eu0Var;
        this.f = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new rln((naz0) xvf0Var5.get(), (Looper) xvf0Var4.get(), (at2) xvf0Var3.get(), i5m.a(this.g), (n5t0) xvf0Var2.get(), (ks10) xvf0Var.get());
            default:
                return new ygi0((Context) xvf0Var5.get(), (w030) xvf0Var4.get(), (f) xvf0Var3.get(), (vz41) xvf0Var2.get(), (a) xvf0Var.get(), this.g);
        }
    }

    public sln(xvf0 xvf0Var, eqh eqhVar, y101 y101Var, y101 y101Var2, xvf0 xvf0Var2, eqh eqhVar2) {
        this.b = xvf0Var;
        this.c = eqhVar;
        this.d = y101Var;
        this.e = y101Var2;
        this.f = xvf0Var2;
        this.g = eqhVar2;
    }
}
