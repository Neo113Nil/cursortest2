package ru.yandex.taxi.preorder.summary.solid.sourcedestination;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.yandex.go.address.models.Address;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryAction;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryExpandingState;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.bdv0;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.cpv0;
import defpackage.dia0;
import defpackage.fva0;
import defpackage.hbp0;
import defpackage.k0l0;
import defpackage.lcv0;
import defpackage.msb1;
import defpackage.o81;
import defpackage.ooe;
import defpackage.p81;
import defpackage.pav;
import defpackage.q81;
import defpackage.qe30;
import defpackage.qgu0;
import defpackage.sb2;
import defpackage.sho;
import defpackage.suh;
import defpackage.tje;
import defpackage.tse0;
import defpackage.tuh;
import defpackage.u0c0;
import defpackage.uov0;
import defpackage.vev0;
import defpackage.vov0;
import defpackage.w511;
import defpackage.wdt0;
import defpackage.wiq0;
import defpackage.xcv0;
import defpackage.xlp0;
import defpackage.zcv0;
import defpackage.zyg0;
import defpackage.zzi;
import java.util.HashMap;
import kotlin.text.Regex;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.address.design.SourceDestinationComponentV2;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.analytics.Events$Summary$SummaryState;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;
import ru.yandex.taxi.preorder.summary.solid.l;
import ru.yandex.taxi.preorder.summary.solid.o;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes6.dex */
public final class b {
    public final FrameLayout a;
    public final o b;
    public final wdt0 c;
    public final zzi d;
    public final lcv0 e;
    public final fva0 f;
    public final cpv0 g;
    public final qgu0 h;
    public final pav i;
    public final vev0 j;
    public final xcv0 k;
    public final wiq0 l;
    public final SummaryStateTracker m;
    public SourceDestinationComponent n;
    public SourceDestinationComponentV2 o;
    public View p;
    public ViewPropertyAnimator q;
    public final k0l0 r;
    public final qe30 s = new qe30(2, this);
    public final vov0 t = new vov0(this);
    public int u;
    public u0c0 v;

    public b(FrameLayout frameLayout, o oVar, wdt0 wdt0Var, zzi zziVar, lcv0 lcv0Var, fva0 fva0Var, cpv0 cpv0Var, qgu0 qgu0Var, pav pavVar, vev0 vev0Var, xcv0 xcv0Var, wiq0 wiq0Var, SummaryStateTracker summaryStateTracker) {
        this.a = frameLayout;
        this.b = oVar;
        this.c = wdt0Var;
        this.d = zziVar;
        this.e = lcv0Var;
        this.f = fva0Var;
        this.g = cpv0Var;
        this.h = qgu0Var;
        this.i = pavVar;
        this.j = vev0Var;
        this.k = xcv0Var;
        this.l = wiq0Var;
        this.m = summaryStateTracker;
        int i = 1;
        this.r = new k0l0(i, this);
        q81 q81Var = vev0Var.a;
        if (q81Var.equals(msb1.c) || (q81Var instanceof p81)) {
            return;
        }
        if (!(q81Var instanceof o81)) {
            w511.b();
            throw null;
        }
        int i2 = 8;
        if (((o81) q81Var).a) {
            PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Creating;
            a aVar = new a(this);
            dia0 dia0Var = new dia0(i2);
            fva0Var.getClass();
            fva0.f(fva0Var, "Summary.SourceDestinationComponentV2.Create", performanceAnalytics$Type, 0L, 4);
            aVar.invoke();
            fva0Var.a("Summary.SourceDestinationComponentV2.Create", performanceAnalytics$Type, dia0Var);
            return;
        }
        PerformanceAnalytics$Type performanceAnalytics$Type2 = PerformanceAnalytics$Type.Creating;
        uov0 uov0Var = new uov0(this, i);
        dia0 dia0Var2 = new dia0(i2);
        fva0Var.getClass();
        fva0.f(fva0Var, "Summary.SourceDestinationComponent.Create", performanceAnalytics$Type2, 0L, 4);
        uov0Var.invoke();
        fva0Var.a("Summary.SourceDestinationComponent.Create", performanceAnalytics$Type2, dia0Var2);
    }

    public final void a(SourceDestinationComponent sourceDestinationComponent) {
        u0c0 u0c0Var = this.v;
        sourceDestinationComponent.applyDrawables(this.j.a instanceof p81 ? ru.yandex.taxi.design.utils.c.k(zyg0.ic_summary_source_point_on_top, sourceDestinationComponent) : this.c.c(u0c0Var != null ? u0c0Var.a.c : null), this.d.c(u0c0Var != null ? u0c0Var.b.c : null));
    }

    public final void b() {
        cpv0 cpv0Var = this.g;
        cpv0Var.A = this;
        hbp0 hbp0Var = cpv0Var.v;
        hbp0Var.a();
        cpv0Var.w.a();
        tje.N(hbp0Var.c(), null, null, new SummarySourceDestinationViewHolderDelegate$attach$1(cpv0Var, null), 3);
        tje.N(hbp0Var.c(), null, null, new SummarySourceDestinationViewHolderDelegate$attach$2(cpv0Var, this, null), 3);
        tje.N(hbp0Var.c(), null, null, new SummarySourceDestinationViewHolderDelegate$attach$3(cpv0Var, null), 3);
    }

    public final void c() {
        boolean isHidden;
        View view = this.p;
        if (view != null && view.getVisibility() == 0) {
            int top = view.getTop();
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            float height = (view2 != null ? view2.getHeight() : 0) - top;
            isHidden = this.b.a.isHidden();
            if (isHidden) {
                view.setTranslationY(height);
                view.setVisibility(8);
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.q;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            ViewPropertyAnimator withEndAction = cma1.h(height, view).setInterpolator(new AccelerateInterpolator()).withEndAction(new ce0(view, 20));
            this.q = withEndAction;
            if (withEndAction != null) {
                withEndAction.start();
            }
        }
    }

    public final void d() {
        l lVar;
        bdv0 bdv0Var;
        SummaryAnalytics$SummaryExpandingState analyticsSummaryExpandingState;
        l lVar2;
        suh suhVar;
        this.e.a();
        this.k.a(zcv0.a(this.m.a()), ((k) this.l).h());
        Address g = this.g.m.g();
        SourcePicker sourcePicker = SourcePicker.ADDITIONAL_FROM_SUMMARY;
        o oVar = this.b;
        SolidSummaryView solidSummaryView = oVar.a;
        lVar = solidSummaryView.presenter;
        if (lVar.v4.isEnabled()) {
            oVar.b();
            return;
        }
        bdv0Var = solidSummaryView.summaryAnalyticsReporter;
        analyticsSummaryExpandingState = solidSummaryView.analyticsSummaryExpandingState();
        bdv0Var.a.c(analyticsSummaryExpandingState, bdv0Var.a(analyticsSummaryExpandingState), SummaryAnalytics$SummaryAction.AddressSuggest);
        lVar2 = solidSummaryView.presenter;
        if (((ooe) lVar2.C1).b(((k) lVar2.x).m()) && g != null) {
            lVar2.B1.a(g);
            return;
        }
        suhVar = solidSummaryView.deliveryAddStopPointHandler;
        ((tuh) suhVar).a(new xlp0(11, g, solidSummaryView, sourcePicker));
    }

    public final void e() {
        boolean isExpandedToPager;
        lcv0 lcv0Var;
        bdv0 bdv0Var;
        SummaryAnalytics$SummaryExpandingState analyticsSummaryExpandingState;
        l lVar;
        int size = this.g.m.c().b.size();
        o oVar = this.b;
        if (size > 1) {
            xcv0 xcv0Var = this.e.a;
            HashMap q = tse0.q(xcv0Var);
            HashMap hashMap = new HashMap();
            Regex regex = sho.a;
            xcv0Var.a.a(sb2.q("Summary.ManageRouteStops", q), q, 1, hashMap);
            this.k.d(zcv0.a(this.m.a()));
            oVar.b();
            return;
        }
        SourcePicker sourcePicker = SourcePicker.B_FROM_SUMMARY;
        SolidSummaryView solidSummaryView = oVar.a;
        isExpandedToPager = solidSummaryView.isExpandedToPager();
        Events$Summary$SummaryState events$Summary$SummaryState = isExpandedToPager ? Events$Summary$SummaryState.EXPANDED : Events$Summary$SummaryState.COLLAPSED;
        lcv0Var = solidSummaryView.summaryAddressAnalytics;
        xcv0 xcv0Var2 = lcv0Var.a;
        String value = events$Summary$SummaryState != null ? events$Summary$SummaryState.getValue() : null;
        HashMap q2 = tse0.q(xcv0Var2);
        if (value != null) {
            q2.put("summary_expanding_state", value);
        }
        HashMap hashMap2 = new HashMap();
        Regex regex2 = sho.a;
        xcv0Var2.a.a(sb2.q("Summary.Destination", q2), q2, 1, hashMap2);
        bdv0Var = solidSummaryView.summaryAnalyticsReporter;
        analyticsSummaryExpandingState = solidSummaryView.analyticsSummaryExpandingState();
        bdv0Var.a.c(analyticsSummaryExpandingState, bdv0Var.a(analyticsSummaryExpandingState), SummaryAnalytics$SummaryAction.AddressSuggest);
        lVar = solidSummaryView.presenter;
        lVar.x2.b(sourcePicker, ModalViewOrigin.SUMMARY, true);
    }

    public final void f() {
        boolean isExpandedToPager;
        lcv0 lcv0Var;
        bdv0 bdv0Var;
        SummaryAnalytics$SummaryExpandingState analyticsSummaryExpandingState;
        l lVar;
        SourcePicker sourcePicker = SourcePicker.A_FROM_SUMMARY;
        SolidSummaryView solidSummaryView = this.b.a;
        isExpandedToPager = solidSummaryView.isExpandedToPager();
        Events$Summary$SummaryState events$Summary$SummaryState = isExpandedToPager ? Events$Summary$SummaryState.EXPANDED : Events$Summary$SummaryState.COLLAPSED;
        lcv0Var = solidSummaryView.summaryAddressAnalytics;
        lcv0Var.b(events$Summary$SummaryState);
        bdv0Var = solidSummaryView.summaryAnalyticsReporter;
        analyticsSummaryExpandingState = solidSummaryView.analyticsSummaryExpandingState();
        bdv0Var.a.e(analyticsSummaryExpandingState, bdv0Var.a(analyticsSummaryExpandingState));
        lVar = solidSummaryView.presenter;
        lVar.x2.c(sourcePicker, ModalViewOrigin.SUMMARY);
    }
}
