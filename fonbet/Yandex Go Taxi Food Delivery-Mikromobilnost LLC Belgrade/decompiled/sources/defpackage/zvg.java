package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Looper;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.fragment.app.f;
import androidx.lifecycle.Lifecycle;
import androidx.media3.common.a;
import androidx.media3.exoplayer.drm.c;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.delivery.rental_duration_selector.requirement.DeliveryRentRequirementView;
import com.yandex.go.delivery.router.DeliveryCommonCameraModalViewKt$provideCameraModalView$1;
import com.yandex.go.models.SummaryRedirectActionModel;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.DiscountsAddPromoCodeModalView;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.b;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details.DiscountsPromoCodeDetailsModalView;
import com.yandex.go.splash.DefaultSplashView;
import com.yandex.go.taxi.order.cancel.popup.mvp.DetailedCancelPopupModalView;
import com.yandex.go.trusted_contacts.ui.dialog.DialogContentModalView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelLogsView;
import com.ybsdk.feature.savings.internal.views.diffrate.DiffRateCalendarView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView;
import ru.yandex.taxi.delivery.ui.setuprequierements.DeliverySetupRequirementsModalView;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPreloadManagerFactory;

/* loaded from: classes13.dex */
public final /* synthetic */ class zvg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zvg(ges gesVar, View view, Rect rect) {
        this.a = 8;
        this.b = view;
        this.c = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView logsRecyclerView;
        String queryParameter;
        mpi mpiVar;
        wls wlsVar;
        mpi mpiVar2;
        mi31 a;
        b bVar;
        String str = null;
        switch (this.a) {
            case 0:
                DebugPanelLogsView debugPanelLogsView = (DebugPanelLogsView) this.b;
                hlz hlzVar = (hlz) this.c;
                logsRecyclerView = debugPanelLogsView.getLogsRecyclerView();
                logsRecyclerView.scrollToPosition(hlzVar.b);
                return;
            case 1:
                com.yandex.div.core.view2.debugview.b bVar2 = (com.yandex.div.core.view2.debugview.b) this.b;
                if (jl40.l(bVar2.n.c, (wsu) this.c)) {
                    bVar2.d(h3u0.a(bVar2.n, false, false, null, null, null, 27));
                    return;
                }
                return;
            case 2:
                j0g j0gVar = (j0g) this.b;
                Lifecycle lifecycle = (Lifecycle) this.c;
                ViewGroup m = j0gVar.m();
                if (m != null) {
                    lifecycle.a(new yyg(j0gVar, m.getId()));
                    return;
                }
                return;
            case 3:
                ((bh3) this.b).onAudioTrackReleased((ah3) this.c);
                return;
            case 4:
                qah qahVar = (qah) this.b;
                a aVar = (a) this.c;
                c cVar = qahVar.w;
                if (cVar.p == 0 || qahVar.c) {
                    return;
                }
                Looper looper = cVar.t;
                looper.getClass();
                qahVar.b = cVar.a(looper, qahVar.a, aVar, false);
                cVar.n.add(qahVar);
                return;
            case 5:
                ((h00) this.b).dispatchAction((kr) this.c);
                return;
            case 6:
                androidx.media3.exoplayer.hls.playlist.a aVar2 = (androidx.media3.exoplayer.hls.playlist.a) this.b;
                Uri uri = (Uri) this.c;
                aVar2.B = false;
                aVar2.e(uri);
                return;
            case 7:
                DefaultPreloadManagerFactory.create$lambda$1((fyc) this.b, (sls) this.c);
                return;
            case 8:
                ges.j((View) this.b, (Rect) this.c);
                return;
            case 9:
                f fVar = (f) this.b;
                ViewGroup viewGroup = (ViewGroup) this.c;
                Iterator it = fVar.c.iterator();
                while (it.hasNext()) {
                    iot0 iot0Var = ((skh) it.next()).a;
                    View view = iot0Var.c.getView();
                    if (view != null) {
                        iot0Var.a.a(view, viewGroup);
                    }
                }
                return;
            case 10:
                DefaultSplashView.startAnimation$lambda$0((ag2) this.b, (DefaultSplashView) this.c);
                return;
            case 11:
                ((DefaultSurfaceProcessor) this.b).lambda$snapshot$6((z54) this.c);
                return;
            case 12:
                ((DefaultSurfaceProcessor) this.b).lambda$onOutputSurface$4((qnw0) this.c);
                return;
            case 13:
                ((DefaultSurfaceProcessor) this.b).lambda$onInputSurface$2((znw0) this.c);
                return;
            case 14:
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.b;
                String str2 = (String) this.c;
                Size size = DeferrableSurface.k;
                try {
                    deferrableSurface.e.get();
                    DeferrableSurface.n.decrementAndGet();
                    DeferrableSurface.m.get();
                    deferrableSurface.e();
                    return;
                } catch (Exception e) {
                    sgb1.d("DeferrableSurface", "Unexpected surface termination for " + deferrableSurface + "\nStack Trace:\n" + str2);
                    synchronized (deferrableSurface.a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.c), Integer.valueOf(deferrableSurface.b)), e);
                    }
                }
            case 15:
                Callable callable = (Callable) this.b;
                zgf zgfVar = (zgf) this.c;
                try {
                    zgfVar.k(callable.call());
                    return;
                } catch (Exception e2) {
                    zgfVar.l(e2);
                    return;
                }
            case 16:
                ((rvh) this.b).U.a(new jo((hki) this.c));
                return;
            case 17:
                ((DeliveryCommonCameraModalViewKt$provideCameraModalView$1) this.b).refreshNestedScrollView((FrameLayout) this.c);
                return;
            case 18:
                DeliveryContactsModalView.createDefaultContactsView$lambda$1((DeliveryContactsModalView) this.b, (bgq0) this.c);
                return;
            case 19:
                Uri uri2 = (Uri) this.b;
                k1i k1iVar = (k1i) this.c;
                h3y h3yVar = k1iVar.d;
                oep0 oep0Var = k1iVar.f;
                h3y h3yVar2 = k1iVar.c;
                String lastPathSegment = uri2.getLastPathSegment();
                if ("choose_profile".equals(lastPathSegment)) {
                    if (gtq0.u((m950) h3yVar2.get())) {
                        return;
                    }
                    oep0.b(oep0Var, (m950) h3yVar2.get());
                    return;
                }
                if (!"delivery_dashboard".equals(lastPathSegment)) {
                    if (!"mission_details".equals(lastPathSegment) || (queryParameter = uri2.getQueryParameter("mission_id")) == null || gtq0.u((m950) h3yVar.get())) {
                        return;
                    }
                    ((pep0) oep0Var).f((m950) h3yVar.get(), new mj20(queryParameter), hxx.a);
                    return;
                }
                String queryParameter2 = uri2.getQueryParameter("input_point");
                if (queryParameter2 != null && queryParameter2.length() != 0) {
                    str = queryParameter2;
                }
                oo2 oo2Var = k1iVar.e;
                ic00 ic00Var = ((kc00) ((jc00) ((h3y) oo2Var.a).get())).a;
                ic00Var.getClass();
                if (!(ic00Var instanceof hc00)) {
                    ((pep0) ((oep0) oo2Var.x)).f((k5i) ((yvf0) oo2Var.w).get(), new p4i(str), hxx.a);
                    return;
                }
                com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.b bVar3 = (com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.b) ((yvf0) oo2Var.c).get();
                oph ophVar = new oph(str);
                if (bVar3.V().u()) {
                    bVar3.V().Q(ophVar);
                    return;
                } else {
                    ((ra00) ((h3y) oo2Var.b).get()).c.e(bVar3, ophVar);
                    return;
                }
            case 20:
                DeliveryRentRequirementView.bindTrail$lambda$0((DeliveryRentRequirementView) this.b, (zli) this.c);
                return;
            case 21:
                ipi ipiVar = (ipi) this.b;
                gpi gpiVar = (gpi) this.c;
                yzh yzhVar = ipiVar.b;
                bpi bpiVar = gpiVar.c;
                mpiVar = ((DeliverySetupRequirementsModalView) yzhVar.a).presenter;
                ((b1) mpiVar.y.a).a.a("DeliveryDetailsRequirements.SelectorButton.Tapped", new HashMap(), 1, new HashMap());
                ((pep0) mpiVar.C).f((m950) mpiVar.z.get(), bpiVar, hxx.a);
                return;
            case 22:
                ipi ipiVar2 = (ipi) this.b;
                fpi fpiVar = (fpi) this.c;
                yzh yzhVar2 = ipiVar2.b;
                String str3 = fpiVar.a;
                boolean z = fpiVar.e;
                boolean z2 = !z;
                DeliverySetupRequirementsModalView deliverySetupRequirementsModalView = (DeliverySetupRequirementsModalView) yzhVar2.a;
                wlsVar = deliverySetupRequirementsModalView.requirementCallback;
                wlsVar.invoke(str3, Boolean.valueOf(z2));
                mpiVar2 = deliverySetupRequirementsModalView.presenter;
                mpiVar2.A.b(str3, z2);
                ((b1) mpiVar2.y.a).a.a("DeliveryDetailsRequirements.Switched", g8e.u("switch_name", str3, "switch_state", !z ? BackendConfig.Restrictions.ENABLED : BackendConfig.Restrictions.DISABLED), 1, new HashMap());
                return;
            case 23:
                ru.yandex.taxi.logistics.common.a aVar3 = (ru.yandex.taxi.logistics.common.a) this.b;
                SummaryRedirectActionModel summaryRedirectActionModel = (SummaryRedirectActionModel) this.c;
                String str4 = summaryRedirectActionModel.a;
                List list = summaryRedirectActionModel.i;
                if (new HashSet(aVar3.b.a.x).containsAll(list) || (a = aVar3.l.a(str4, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, null)) == null || !jl40.l(a.f, str4)) {
                    return;
                }
                kjx0 a2 = aVar3.o.a(a.a);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    a2.c((b580) it2.next(), false);
                }
                a2.a();
                return;
            case 24:
                DetailedCancelPopupModalView.render$lambda$0((j2j) this.b, (DetailedCancelPopupModalView) this.c);
                return;
            case 25:
                DialogContentModalView.setupButton$lambda$0((sls) this.b, (DialogContentModalView) this.c);
                return;
            case 26:
                apf apfVar = (apf) this.b;
                Runnable runnable = (Runnable) this.c;
                apfVar.f();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 27:
                DiffRateCalendarView.renderLoading$lambda$5((DiffRateCalendarView) this.b, (ArrayList) this.c);
                return;
            case 28:
                DiscountsAddPromoCodeModalView discountsAddPromoCodeModalView = (DiscountsAddPromoCodeModalView) this.b;
                lpj lpjVar = (lpj) this.c;
                bVar = discountsAddPromoCodeModalView.presenter;
                bVar.Lg(lpjVar.c.c);
                return;
            default:
                DiscountsPromoCodeDetailsModalView.bindActionButton$lambda$0((DiscountsPromoCodeDetailsModalView) this.b, (grj) this.c);
                return;
        }
    }

    public /* synthetic */ zvg(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
