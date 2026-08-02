package defpackage;

import ru.yandex.taxi.delivery.impl.paid_insurance.e;
import ru.yandex.taxi.delivery.router.primary.a;

/* loaded from: classes12.dex */
public final class tu8 implements czh {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ tu8(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.czh
    public final void b(izh izhVar, omy0 omy0Var) {
        int i = this.a;
        int i2 = 2;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                vu8 vu8Var = (vu8) h55Var;
                vu8Var.E((m950) ((yvf0) vu8Var.F).get(), izhVar, new d0i(omy0Var, new su8(vu8Var, 1)), hxx.a);
                break;
            case 1:
                m640 m640Var = (m640) h55Var;
                m640Var.A((zzh) ((i3y) m640Var.I).getValue(), izhVar, new d0i(omy0Var, new aei(m640Var, i2)));
                break;
            case 2:
                e eVar = (e) h55Var;
                eVar.A((zzh) eVar.F.getValue(), izhVar, new d0i(omy0Var, new ehi(eVar, i2)));
                break;
            default:
                a aVar = (a) h55Var;
                aVar.A((zzh) aVar.W.getValue(), izhVar, new d0i(omy0Var, new bgc(12)));
                break;
        }
    }

    @Override // defpackage.czh
    public final void dismiss() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((vu8) h55Var).i();
                break;
            case 1:
                m640 m640Var = (m640) h55Var;
                ((zzh) ((i3y) m640Var.I).getValue()).i();
                m640Var.i();
                break;
            case 2:
                e eVar = (e) h55Var;
                ((zzh) eVar.F.getValue()).i();
                eVar.r(new wth(22));
                break;
            default:
                a aVar = (a) h55Var;
                aVar.j(new epb((zzh) aVar.W.getValue()));
                break;
        }
    }
}
