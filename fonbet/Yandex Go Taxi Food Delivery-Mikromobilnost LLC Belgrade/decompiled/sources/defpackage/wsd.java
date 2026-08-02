package defpackage;

import com.yandex.go.address.search.common.presenter.a;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.address.experiment.e;

/* loaded from: classes12.dex */
public final class wsd implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ bjd b;
    public final /* synthetic */ a c;

    public wsd(a aVar, bjd bjdVar) {
        this.a = 0;
        this.c = aVar;
        this.b = bjdVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.c;
        bjd bjdVar = this.b;
        switch (i) {
            case 0:
                e eVar = (e) obj;
                aVar.getClass();
                if (eVar == null) {
                    bjdVar.d9();
                    break;
                } else {
                    bjdVar.p4(eVar);
                    break;
                }
            case 1:
                a81 a81Var = (a81) obj;
                bjdVar.U4(a81Var.c);
                bjdVar.Vc(a81Var.b);
                ((tsd) aVar.S.getValue()).Rb(a81Var.a);
                break;
            default:
                a81 a81Var2 = (a81) obj;
                bjdVar.j1(a81Var2.c);
                aVar.yh().Rb(a81Var2.a);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ wsd(bjd bjdVar, a aVar, int i) {
        this.a = i;
        this.b = bjdVar;
        this.c = aVar;
    }
}
