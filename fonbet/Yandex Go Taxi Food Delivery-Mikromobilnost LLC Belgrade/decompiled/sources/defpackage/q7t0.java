package defpackage;

import android.view.View;
import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.c;
import com.yandex.go.summary.analytics.SummaryAnalytics$LegacySummaryCardCloseMethod;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryCollapseReasonV2;
import com.yandex.go.tariffcard.common.a;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.HashMap;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;
import ru.yandex.taxi.preorder.summary.solid.l;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class q7t0 implements gfv0 {
    public final /* synthetic */ SolidSummaryView b;

    public q7t0(SolidSummaryView solidSummaryView) {
        this.b = solidSummaryView;
    }

    @Override // defpackage.act0
    public final void Y() {
        this.b.onSourceAddressClicked();
    }

    @Override // defpackage.gfv0
    public final void a() {
        l lVar;
        SolidSummaryView solidSummaryView = this.b;
        lVar = solidSummaryView.presenter;
        e6t0 e6t0Var = lVar.V;
        e6t0Var.getClass();
        e6t0Var.a(SummaryAnalytics$LegacySummaryCardCloseMethod.Tap);
        e6t0Var.b(SummaryAnalytics$SummaryCollapseReasonV2.ChevronDownTap);
        lVar.X1.getClass();
        solidSummaryView.collapseToSummary(true);
    }

    @Override // defpackage.gfv0
    public final void b() {
        l lVar;
        lVar = this.b.presenter;
        e6t0 e6t0Var = lVar.V;
        xcv0 xcv0Var = e6t0Var.b;
        xcv0Var.a.a("Summary.Payment", nnm.m(xcv0Var, "summary_state", ((a7t0) e6t0Var.a).a().b), 2, new HashMap());
        ((rpt0) lVar.X2).b(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r2 = r2.expandedSummaryViewsHolder;
     */
    @Override // defpackage.gfv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        boolean isCollapsedToSummary;
        boolean isExpandedToPager;
        a aVar;
        a aVar2;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior;
        SolidSummaryView solidSummaryView = this.b;
        isCollapsedToSummary = solidSummaryView.isCollapsedToSummary();
        if (isCollapsedToSummary) {
            anchorBottomSheetBehavior = solidSummaryView.summaryAnchorBehavior;
            anchorBottomSheetBehavior.M = null;
            return;
        }
        isExpandedToPager = solidSummaryView.isExpandedToPager();
        if (isExpandedToPager) {
            aVar = solidSummaryView.expandedSummaryViewsHolder;
            if (aVar == null || aVar2 == null) {
                return;
            }
            AnchorBottomSheetBehavior anchorBottomSheetBehavior2 = aVar2.e;
            efv0 efv0Var = aVar2.m;
            anchorBottomSheetBehavior2.L(efv0Var != null ? efv0Var.getFocusedView() : null);
        }
    }

    @Override // defpackage.gfv0
    public final void e(sgx0 sgx0Var) {
        l lVar;
        lVar = this.b.presenter;
        c cVar = lVar.I0;
        Address g = cVar.g();
        lVar.D.d(SelectionOrigin.USER, sgx0Var, "", false);
        if (!z81.a(g, cVar.g()) && ((k) lVar.x).m() == null) {
            jst.e.x(new IllegalStateException("Selected tariff was gone"), "No selected tariff after tariffSelected call");
        } else {
            lVar.C2.b();
            lVar.S0.a();
        }
    }

    @Override // defpackage.gfv0
    public final void g(sgx0 sgx0Var) {
        l lVar;
        lVar = this.b.presenter;
        String str = sgx0Var.a;
        e6t0 e6t0Var = lVar.V;
        e6t0Var.b.k(str, ((a7t0) e6t0Var.a).a().b);
    }

    @Override // defpackage.gfv0
    public final void h(View view) {
        boolean isCollapsedToSummary;
        boolean isExpandedToPager;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior2;
        SolidSummaryView solidSummaryView = this.b;
        isCollapsedToSummary = solidSummaryView.isCollapsedToSummary();
        if (isCollapsedToSummary) {
            anchorBottomSheetBehavior2 = solidSummaryView.summaryAnchorBehavior;
            anchorBottomSheetBehavior2.M = null;
            return;
        }
        isExpandedToPager = solidSummaryView.isExpandedToPager();
        if (isExpandedToPager) {
            anchorBottomSheetBehavior = solidSummaryView.summaryAnchorBehavior;
            anchorBottomSheetBehavior.L(view);
        }
    }

    @Override // defpackage.act0
    public final void x0() {
        this.b.onDestinationAddressClicked();
    }

    @Override // defpackage.act0
    public final void y0() {
        this.b.onAddDestinationClicked();
    }

    @Override // defpackage.act0
    public final void z0() {
        this.b.onSourceTrailClicked();
    }
}
