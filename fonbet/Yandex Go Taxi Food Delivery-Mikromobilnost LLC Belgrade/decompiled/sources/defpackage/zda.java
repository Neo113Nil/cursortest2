package defpackage;

import com.yandex.go.chargers.multiorder.domain.ChargersOrderTrackingSourceInteractor$listenOrders$$inlined$safeCollectIn$1;
import com.yandex.go.chargers.multiorder.domain.a;
import com.yandex.go.chargers.multiorder.domain.c;
import com.yandex.go.chargers.multiorder.domain.e;
import com.yandex.go.scooters.multiorder.proxy.ScootersOrderTrackingInteractor$listenOrders$$inlined$flatMapLatest$1;
import com.yandex.go.scooters.multiorder.proxy.ScootersOrderTrackingInteractor$listenOrders$$inlined$safeCollectIn$1;
import com.yandex.go.scooters.multiorder.proxy.b;
import com.yandex.go.scooters.multiorder.proxy.d;
import com.yandex.go.superapp.order.multi.old.provider.g;
import ru.yandex.taxi.scooters.utils.timers.h;

/* loaded from: classes.dex */
public final class zda implements q701 {
    public final /* synthetic */ int a = 0;
    public final tse b;
    public final g c;
    public final wmh d;
    public final Object e;
    public Object f;

    public zda(tse tseVar, g gVar, h hVar, s6o0 s6o0Var, wmh wmhVar) {
        this.b = tseVar;
        this.c = gVar;
        this.e = hVar;
        this.f = s6o0Var;
        this.d = wmhVar;
    }

    private final void a() {
    }

    @Override // defpackage.q701
    public final void start() {
        int i = this.a;
        wmh wmhVar = this.d;
        tse tseVar = this.b;
        g gVar = this.c;
        switch (i) {
            case 0:
                pzt0 pzt0Var = (pzt0) this.f;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                this.f = tje.N(tseVar, null, null, new ChargersOrderTrackingSourceInteractor$listenOrders$$inlined$safeCollectIn$1(new e(kotlinx.coroutines.flow.e.t(new c(gVar.h())), this), null, wmhVar), 3);
                break;
            default:
                tje.N(tseVar, null, null, new ScootersOrderTrackingInteractor$listenOrders$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.X(new d(kotlinx.coroutines.flow.e.t(new b(gVar.h())), this), new ScootersOrderTrackingInteractor$listenOrders$$inlined$flatMapLatest$1(3, null)), null, wmhVar), 3);
                break;
        }
    }

    @Override // defpackage.q701
    public final void stop() {
        switch (this.a) {
            case 0:
                pzt0 pzt0Var = (pzt0) this.f;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                this.f = null;
                break;
        }
    }

    public zda(tse tseVar, g gVar, a aVar, wmh wmhVar) {
        this.b = tseVar;
        this.c = gVar;
        this.e = aVar;
        this.d = wmhVar;
    }
}
