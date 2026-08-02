package defpackage;

import ru.yandex.taxi.orderforanother.interactor.a;

/* loaded from: classes6.dex */
public final class wv70 implements v7p {
    public final /* synthetic */ int a;
    public final y0g b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ wv70(y0g y0gVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = y0gVar;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        y0g y0gVar = this.b;
        switch (i) {
            case 0:
                return new a((tse) y0gVar.get(), i5m.a(xvf0Var3), (z880) xvf0Var2.get(), (ro0) xvf0Var.get());
            default:
                return new com.yandex.go.taxi.summary.order_part.a((tse) y0gVar.get(), (d770) xvf0Var3.get(), (icv0) xvf0Var2.get(), (tt2) xvf0Var.get());
        }
    }
}
