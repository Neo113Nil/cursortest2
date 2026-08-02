package defpackage;

import com.yandex.go.chargers.debt.domain.ChargersDebtPaymentStatusPollingInteractor$startObserving$$inlined$collectIn$1;
import com.yandex.go.chargers.debt.domain.ChargersDebtPaymentStatusPollingInteractor$startObserving$$inlined$collectLatestIn$1;
import com.yandex.go.chargers.debt.domain.c;
import com.yandex.go.safety.center.instruction.h;
import com.yandex.go.safety.center.j;
import com.yandex.go.taxi.order.chat.ui.chat.TaxiOrderChatModalView;
import com.yandex.go.taxi.order.chat.ui.chat.a;
import com.yandex.go.ui.CameraModalView;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.linked_order.map.b;
import ru.yandex.taxi.order.view.FeedbackView;
import ru.yandex.taxi.order.view.OrderView;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;
import ru.yandex.taxi.search.view.BaseAddressSearchView;

/* loaded from: classes12.dex */
public final class vb3 extends jey {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vb3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jey, defpackage.iey
    public void onDestroy() {
        switch (this.a) {
            case 0:
                bc bcVar = (bc) this.b;
                pzt0 pzt0Var = (pzt0) bcVar.x;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                ((ney) bcVar.c).d(bcVar);
                break;
        }
    }

    @Override // defpackage.jey, defpackage.iey
    public void onPause() {
        a aVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                ((BaseAddressSearchView) obj).onPause();
                break;
            case 3:
                ((oqd0) ((a46) obj).K).a();
                break;
            case 5:
                ((FeedbackView) obj).getPresenter().pause();
                break;
            case 6:
                ((b) obj).c.pause();
                break;
            case 7:
                ((ru.yandex.taxi.search.overlay.legacy.animations.a) obj).b(false);
                break;
            case 8:
                ((OrderView) obj).getOrderPresenter().pause();
                break;
            case 9:
                ((oqd0) ((a46) obj).J).a();
                break;
            case 10:
                ((oqd0) ((xus) obj).I).a();
                break;
            case 14:
                ((SolidSummaryView) obj).onPause();
                break;
            case 15:
                aVar = ((TaxiOrderChatModalView) obj).presenter;
                aVar.pause();
                break;
        }
    }

    @Override // defpackage.jey, defpackage.iey
    public void onResume() {
        a aVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                ((BaseAddressSearchView) obj).onResume();
                break;
            case 5:
                ((FeedbackView) obj).getPresenter().resume();
                break;
            case 6:
                ((b) obj).c.resume();
                break;
            case 7:
                ru.yandex.taxi.search.overlay.legacy.animations.a aVar2 = (ru.yandex.taxi.search.overlay.legacy.animations.a) obj;
                o2y0 o2y0Var = aVar2.c;
                if (o2y0Var != null) {
                    aVar2.a(o2y0Var);
                    break;
                }
                break;
            case 8:
                ((OrderView) obj).getOrderPresenter().resume();
                break;
            case 12:
                h hVar = (h) obj;
                if (hVar.O) {
                    hVar.O = false;
                    csl0 csl0Var = (csl0) hVar.K.b;
                    csl0Var.A(csl0Var.K.a(new hrl0()), zy11.a, sy60.Q2);
                    break;
                }
                break;
            case 14:
                ((SolidSummaryView) obj).onResume();
                break;
            case 15:
                aVar = ((TaxiOrderChatModalView) obj).presenter;
                aVar.resume();
                break;
        }
    }

    @Override // defpackage.jey, defpackage.iey
    public void onStart() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                ((CameraModalView) obj).startCamera();
                break;
            case 4:
                c cVar = (c) obj;
                hbp0 hbp0Var = cVar.g;
                hbp0Var.a();
                vp9 vp9Var = cVar.e;
                tje.N(hbp0Var.c(), null, null, new ChargersDebtPaymentStatusPollingInteractor$startObserving$$inlined$collectLatestIn$1(vp9Var.a, null, cVar), 3);
                tje.N(hbp0Var.c(), null, null, new ChargersDebtPaymentStatusPollingInteractor$startObserving$$inlined$collectIn$1(e.t(new com.yandex.go.chargers.debt.domain.b(cVar.c.a())), null, vp9Var), 3);
                break;
            case 11:
                ru.yandex.taxi.settings.domain.a aVar = (ru.yandex.taxi.settings.domain.a) obj;
                r0 r0Var = aVar.e;
                Boolean valueOf = Boolean.valueOf(aVar.a.b());
                r0Var.getClass();
                r0Var.m(null, valueOf);
                break;
        }
    }

    @Override // defpackage.jey, defpackage.iey
    public void onStop() {
        er7 er7Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                er7Var = ((CameraModalView) obj).cameraLifecycleOwner;
                er7Var.c();
                break;
            case 4:
                ((c) obj).g.b();
                break;
            case 13:
                hkr0 hkr0Var = (hkr0) obj;
                j jVar = hkr0Var.x;
                ntl0 ntl0Var = (ntl0) jVar.y.get(hkr0Var.y);
                if (hkr0Var.Eg() && ntl0Var != null) {
                    ntl0Var.c.g(zy11.a);
                    break;
                }
                break;
            case 16:
                com.yandex.go.taxi.order.superapp.orders.ui.b bVar = (com.yandex.go.taxi.order.superapp.orders.ui.b) obj;
                bVar.I0 = false;
                bVar.s0.stopWithoutAnimation();
                bVar.G0.b();
                ((jqz) bVar.f0).a();
                break;
        }
    }
}
