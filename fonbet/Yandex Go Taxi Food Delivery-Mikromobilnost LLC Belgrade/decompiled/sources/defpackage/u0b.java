package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.state.ChatAwareTaxiOnTheWayPresenter$onResume$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.order.state.o;
import com.yandex.go.taxi.order.superapp.orders.h;

/* loaded from: classes14.dex */
public abstract class u0b extends o {
    public final a3y0 R;
    public final fh70 S;
    public final tt T;
    public final xhm U;

    public u0b(n0g n0gVar, Class cls, ney neyVar) {
        super(n0gVar, cls, neyVar);
        this.R = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "SearchStateViewPresenter");
        this.S = (fh70) n0gVar.c.om.get();
        f0g f0gVar = n0gVar.e;
        this.T = f0gVar.a();
        this.U = f0gVar.N();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        tje.N(Kg(), null, null, new ChatAwareTaxiOnTheWayPresenter$onResume$$inlined$safeCollectIn$1(((h) this.S).d(this.A, OrderScreen.ORDER_DETAILS), null, this), 3);
    }
}
