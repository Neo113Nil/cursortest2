package ru.yandex.taxi.preorder.summary.tariffpage.router;

import android.view.View;
import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.c;
import com.yandex.go.summary.analytics.SummaryAnalytics$LegacySummaryCardCloseMethod;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryCollapseReasonV2;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryExpandingState;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a7t0;
import defpackage.bkx0;
import defpackage.dkx0;
import defpackage.gfv0;
import defpackage.gyt0;
import defpackage.jn40;
import defpackage.jst;
import defpackage.mkx0;
import defpackage.nnm;
import defpackage.ooe;
import defpackage.pex0;
import defpackage.qht0;
import defpackage.qpt0;
import defpackage.rft0;
import defpackage.rgt0;
import defpackage.rpt0;
import defpackage.s5w0;
import defpackage.sgx0;
import defpackage.tuh;
import defpackage.xcv0;
import defpackage.z81;
import defpackage.zcv0;
import java.util.HashMap;
import java.util.Set;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class a implements gfv0 {
    public final /* synthetic */ mkx0 b;

    public a(mkx0 mkx0Var) {
        this.b = mkx0Var;
    }

    @Override // defpackage.act0
    public final void Y() {
        this.b.Q.c(SourcePicker.A_FROM_SUMMARY, ModalViewOrigin.SUMMARY);
    }

    @Override // defpackage.gfv0
    public final void a() {
        String str;
        jn40 jn40Var;
        mkx0 mkx0Var = this.b;
        if (mkx0Var.j0) {
            return;
        }
        dkx0 dkx0Var = mkx0Var.l0;
        if (dkx0Var != null) {
            xcv0 xcv0Var = dkx0Var.c;
            xcv0Var.f(SummaryAnalytics$LegacySummaryCardCloseMethod.Tap, ((a7t0) dkx0Var.b).a().b);
            k kVar = (k) dkx0Var.d;
            pex0 m = kVar.m();
            Set set = (m == null || (jn40Var = m.V) == null) ? null : jn40Var.f;
            SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV2 = SummaryAnalytics$SummaryCollapseReasonV2.ChevronDownTap;
            String h = kVar.h();
            pex0 m2 = kVar.m();
            if (m2 == null || (str = m2.b) == null) {
                str = "";
            }
            xcv0Var.b(summaryAnalytics$SummaryCollapseReasonV2, h, str, set != null ? kotlin.collections.a.J0(set) : null);
        }
        mkx0Var.c0.getClass();
        mkx0Var.j0 = true;
        mkx0Var.r(new bkx0(2));
    }

    @Override // defpackage.gfv0
    public final void b() {
        mkx0 mkx0Var = this.b;
        dkx0 dkx0Var = mkx0Var.l0;
        if (dkx0Var != null) {
            xcv0 xcv0Var = dkx0Var.c;
            xcv0Var.a.a("Summary.Payment", nnm.m(xcv0Var, "summary_state", ((a7t0) dkx0Var.b).a().b), 2, new HashMap());
        }
        ((rpt0) ((qpt0) mkx0Var.P.get())).b(null, null);
    }

    @Override // defpackage.gfv0
    public final void c() {
        AnchorBottomSheetBehavior<View> viewBottomSheetBehavior;
        mkx0 mkx0Var = this.b;
        TariffPagerModalView tariffPagerModalView = mkx0Var.i0;
        View focusedView = tariffPagerModalView != null ? tariffPagerModalView.getFocusedView() : null;
        TariffPagerModalView tariffPagerModalView2 = mkx0Var.i0;
        if (tariffPagerModalView2 == null || (viewBottomSheetBehavior = tariffPagerModalView2.getViewBottomSheetBehavior()) == null) {
            return;
        }
        viewBottomSheetBehavior.L(focusedView);
    }

    @Override // defpackage.gfv0
    public final void e(sgx0 sgx0Var) {
        mkx0 mkx0Var = this.b;
        c cVar = mkx0Var.M;
        Address g = cVar.g();
        mkx0Var.K.d(SelectionOrigin.USER, sgx0Var, "", false);
        if (!z81.a(g, cVar.g()) && ((k) mkx0Var.N).m() == null) {
            jst.e.x(new IllegalStateException("Selected tariff was gone"), "No selected tariff after tariffSelected call");
        } else {
            mkx0Var.O.b();
            mkx0Var.L.a();
        }
    }

    @Override // defpackage.gfv0
    public final void g(sgx0 sgx0Var) {
        dkx0 dkx0Var = this.b.l0;
        if (dkx0Var != null) {
            dkx0Var.c.k(sgx0Var.a, ((a7t0) dkx0Var.b).a().b);
        }
    }

    @Override // defpackage.gfv0
    public final void h(View view) {
        AnchorBottomSheetBehavior<View> viewBottomSheetBehavior;
        TariffPagerModalView tariffPagerModalView = this.b.i0;
        if (tariffPagerModalView == null || (viewBottomSheetBehavior = tariffPagerModalView.getViewBottomSheetBehavior()) == null) {
            return;
        }
        viewBottomSheetBehavior.L(view);
    }

    @Override // defpackage.act0
    public final void x0() {
        this.b.Q.b(SourcePicker.B_FROM_SUMMARY, ModalViewOrigin.SUMMARY, true);
    }

    @Override // defpackage.act0
    public final void y0() {
        mkx0 mkx0Var = this.b;
        mkx0Var.d0.a();
        xcv0 xcv0Var = mkx0Var.e0;
        SummaryAnalytics$SummaryExpandingState a = zcv0.a(mkx0Var.f0.a());
        k kVar = (k) mkx0Var.N;
        xcv0Var.a(a, kVar.h());
        Address g = mkx0Var.M.g();
        if (((ooe) mkx0Var.V).b(kVar.m()) && g != null) {
            mkx0Var.W.a(g);
            return;
        }
        ((tuh) mkx0Var.a0).a(new gyt0(26, g, mkx0Var));
    }

    @Override // defpackage.act0
    public final void z0() {
        mkx0 mkx0Var = this.b;
        rft0 rft0Var = mkx0Var.R;
        Address e = mkx0Var.S.e();
        ((qht0) rft0Var).e(e != null ? e.J1() : null, new TariffPagerRouter$onSourceTrailClicked$1(0, mkx0Var.T, rgt0.class, "hideNotifications", "hideNotifications()V", 0), new s5w0(13, mkx0Var));
    }
}
