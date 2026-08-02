package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.SystemClock;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigator.address.NavigatorRouteStopsSearchView;
import com.yandex.go.navigator.navigation.e;
import com.yandex.go.taxi.order.cancel.v2.mvp.OrderCancelModalView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.ybsdk.navigation.NavigationFragment;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.yandex.taxi.logistics.ndd_route_selector.view.NddRouteSelectorModalView;
import ru.yandex.taxi.masstransit.detailedroute.ui.MtDetailedRouteModalView;
import ru.yandex.taxi.masstransit.detailedroute.ui.c;
import ru.yandex.taxi.masstransit.geopayment.stopselector.MtStopSelectorModalView;
import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;
import ru.yandex.taxi.masstransit.ui.discovery.MtDiscoveryModalView;
import ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalView;
import ru.yandex.taxi.masstransit.ui.route.modal.expanded.MtExpandedRoutesView;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.order.overlay.OrderBubblesOverlay;
import ru.yandex.taxi.search.address.view.NoInternetConnectionModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class sf30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sf30(e100 e100Var, hsb1 hsb1Var) {
        this.a = 16;
        this.b = e100Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MtDetailedRouteModalView.backButton$onBackPressed((c) this.b);
                return;
            case 1:
                ((MtDiscoveryModalView) this.b).onBackPressed();
                return;
            case 2:
                MtExpandedRoutesView.lambda$0$backClicked((lj30) this.b);
                return;
            case 3:
                MtMainFlexModalView.lambda$0$onGeoTap((lo30) this.b);
                return;
            case 4:
                MtRoutesModalView.onAttachedToWindow$lambda$0((MtRoutesModalView) this.b);
                return;
            case 5:
                ((vx30) this.b).T();
                return;
            case 6:
                ((ys0) this.b).invoke();
                return;
            case 7:
                ((MtStopSelectorModalView) this.b).onBackPressed();
                return;
            case 8:
                NavigationFragment.exitFromRoot$lambda$24((NavigationFragment) this.b);
                return;
            case 9:
                ((d710) this.b).a(true);
                return;
            case 10:
                ((NavigatorRouteStopsSearchView) this.b).onDismiss();
                return;
            case 11:
                ((e) this.b).i();
                return;
            case 12:
                af50 af50Var = (af50) this.b;
                hst hstVar = jst.e;
                af50Var.x.getClass();
                xby.l(hstVar, "NAVIGATOR_SERVICE:DATA_SYNC_TIMEOUT", null, null, qv10.k(SystemClock.uptimeMillis() - af50Var.D, "NavigatorService was created ", "ms ago as data sync service and should be stopped"), 6);
                af50Var.Kg();
                return;
            case 13:
                NddRouteSelectorModalView._init_$onLocationClicked((yi50) this.b);
                return;
            case 14:
                ((tj50) this.b).Kg();
                return;
            case 15:
                ((k9v) this.b).d();
                return;
            case 16:
                throw null;
            case 17:
                xv10 xv10Var = (xv10) this.b;
                long currentTimeMillis = System.currentTimeMillis();
                AtomicBoolean atomicBoolean = (AtomicBoolean) xv10Var.w;
                atomicBoolean.set(true);
                long j = currentTimeMillis;
                while (atomicBoolean.get() && j - currentTimeMillis < 500) {
                    j = System.currentTimeMillis();
                }
                if (j - currentTimeMillis >= 500) {
                    ((Handler) xv10Var.x).post(new sf30(18, (ht10) xv10Var.b));
                }
                atomicBoolean.set(false);
                return;
            case 18:
                ht10 ht10Var = (ht10) this.b;
                if (((oju0) ht10Var.b).a instanceof z2m) {
                    ((lb7) ((rzl) ht10Var.c)).z(gzl.a);
                    return;
                }
                return;
            case 19:
                b260 b260Var = (b260) this.b;
                u6h u6hVar = (u6h) b260Var.a.get();
                if (u6hVar != null) {
                    int b = b260Var.c.b();
                    v6h v6hVar = u6hVar.a;
                    synchronized (v6hVar) {
                        int i = v6hVar.n;
                        if (i == 0 || v6hVar.e) {
                            if (i != b || v6hVar.o == null) {
                                v6hVar.n = b;
                                if (b != 1 && b != 0 && b != 8) {
                                    if (v6hVar.o == null) {
                                        v6hVar.o = tw21.y(v6hVar.a);
                                    }
                                    v6hVar.l = v6hVar.a(b);
                                    v6hVar.d.getClass();
                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                    int i2 = v6hVar.g > 0 ? (int) (elapsedRealtime - v6hVar.h) : 0;
                                    long j2 = v6hVar.i;
                                    long j3 = v6hVar.l;
                                    if (i2 != 0 || j2 != 0 || j3 != v6hVar.m) {
                                        v6hVar.m = j3;
                                        v6hVar.c.b(i2, j2, j3);
                                    }
                                    v6hVar.h = elapsedRealtime;
                                    v6hVar.i = 0L;
                                    v6hVar.k = 0L;
                                    v6hVar.j = 0L;
                                    vps0 vps0Var = v6hVar.f;
                                    vps0Var.b.clear();
                                    vps0Var.d = -1;
                                    vps0Var.e = 0;
                                    vps0Var.f = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 20:
                WebView webView = (WebView) this.b;
                try {
                    webView.stopLoading();
                } catch (Throwable unused) {
                }
                try {
                    webView.removeAllViews();
                } catch (Throwable unused2) {
                }
                try {
                    webView.destroy();
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 21:
                NoInternetConnectionModalView.onAttachedToWindow$lambda$0((NoInternetConnectionModalView) this.b);
                return;
            case 22:
                ((ValueAnimator) this.b).cancel();
                return;
            case 23:
                ((OrderBubblesOverlay) this.b).removeAnimatedBubbles();
                return;
            case 24:
                ((xw8) this.b).invoke();
                return;
            case 25:
                OrderCancelModalView.synchronizeButtonsSize$lambda$0((fl70) this.b);
                return;
            case 26:
                ((OrderCancelModalView) this.b).onBackPressed();
                return;
            case 27:
                f fVar = (f) this.b;
                OrderFragment orderFragment = fVar.p1;
                if (orderFragment == null || !fVar.getLifecycle().w.a(Lifecycle.State.STARTED)) {
                    return;
                }
                orderFragment.modalViewCoordinator().h();
                return;
            case 28:
                h2r h2rVar = (h2r) this.b;
                f fVar2 = (f) h2rVar.b;
                o2y0 o2y0Var = (o2y0) h2rVar.c;
                fVar2.x0(o2y0Var);
                if (o2y0Var.b().G()) {
                    return;
                }
                fVar2.d0(o2y0Var).i("cancelImpossible.OK");
                return;
            default:
                at20 at20Var = (at20) this.b;
                o2y0 o2y0Var2 = (o2y0) at20Var.a;
                Preorder W = o2y0Var2.b().W();
                W.i(lv90.f);
                f fVar3 = (f) at20Var.b;
                o2y0Var2.g(com.yandex.go.taxi.order.models.api.f.b(TaxiOrder.Companion, W, null, null, 0L, 30));
                fVar3.d0(o2y0Var2).h(fVar3.e0(o2y0Var2));
                return;
        }
    }

    public /* synthetic */ sf30(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
