package ru.yandex.taxi.preorder.summary.solid;

import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryAction;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryExpandingState;
import defpackage.bdv0;
import defpackage.eit0;
import defpackage.fcj0;
import defpackage.fit0;
import defpackage.i4u;
import defpackage.o6t0;
import defpackage.qht0;
import defpackage.rft0;
import defpackage.rgt0;
import defpackage.yvf0;

/* loaded from: classes6.dex */
public final class o {
    public final /* synthetic */ SolidSummaryView a;

    public o(SolidSummaryView solidSummaryView) {
        this.a = solidSummaryView;
    }

    public final void a(String str) {
        l lVar;
        lVar = this.a.presenter;
        ((qht0) lVar.V2).e(str, new SolidSummaryPresenter$showPorchSelector$1(0, lVar.y2, rgt0.class, "hideNotifications", "hideNotifications()V", 0), new o6t0(lVar, 1));
    }

    public final void b() {
        bdv0 bdv0Var;
        SummaryAnalytics$SummaryExpandingState analyticsSummaryExpandingState;
        l lVar;
        rft0 rft0Var;
        rft0 rft0Var2;
        eit0 eit0Var;
        yvf0 yvf0Var;
        SolidSummaryView solidSummaryView = this.a;
        bdv0Var = solidSummaryView.summaryAnalyticsReporter;
        analyticsSummaryExpandingState = solidSummaryView.analyticsSummaryExpandingState();
        bdv0Var.a.c(analyticsSummaryExpandingState, bdv0Var.a(analyticsSummaryExpandingState), SummaryAnalytics$SummaryAction.StopsList);
        lVar = solidSummaryView.presenter;
        if (!lVar.v4.isEnabled()) {
            rft0Var = solidSummaryView.sourcePointFragmentNavigator;
            ((qht0) rft0Var).f(solidSummaryView.addressOnTop());
            return;
        }
        i4u i4uVar = new i4u(new Object());
        rft0Var2 = solidSummaryView.sourcePointFragmentNavigator;
        boolean addressOnTop = solidSummaryView.addressOnTop();
        eit0Var = solidSummaryView.sourcePointRouteStopsV2MapInteractorFactory;
        fcj0 a = ((fit0) eit0Var).a(i4uVar);
        yvf0Var = solidSummaryView.routeStopsV2RouteInteractor;
        ((qht0) rft0Var2).g(addressOnTop, a, (com.yandex.go.taxi.summary.routestops.e) yvf0Var.get());
    }
}
