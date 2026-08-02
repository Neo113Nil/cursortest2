package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.cars.preorder.source.CarsOnMapPresenter$subscribeToPointChanges$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.cars.preorder.source.j;
import com.yandex.go.taxi.order.models.api.response.NearestDrivers;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class upe0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ upe0(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        zzs ad;
        switch (this.a) {
            case 0:
                j jVar = this.b;
                n0 n0Var = jVar.A;
                Address g = jVar.F.g();
                if (g == null || (ad = g.B()) == null) {
                    ad = ((xz8) jVar.Dg()).ad();
                }
                n0Var.g(ad);
                break;
            case 1:
                this.b.E.a.i0 = (NearestDrivers) obj;
                break;
            default:
                hk50 hk50Var = (hk50) obj;
                j jVar2 = this.b;
                pzt0 pzt0Var = jVar2.B;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                jVar2.B = tje.N(jVar2.Jg(), null, null, new CarsOnMapPresenter$subscribeToPointChanges$$inlined$safeCollectIn$1(jVar2.A, null, jVar2, hk50Var), 3);
                break;
        }
        return zy11.a;
    }
}
