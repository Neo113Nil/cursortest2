package ru.yandex.taxi.preorder.summary.selector.ui.tariffselector;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.bmq0;
import defpackage.fva0;
import defpackage.isx0;
import defpackage.jpe;
import defpackage.jsx0;
import defpackage.l7s0;
import defpackage.mqv0;
import defpackage.msx0;
import defpackage.n070;
import defpackage.nsx0;
import defpackage.pe31;
import defpackage.qr31;
import defpackage.tag;
import defpackage.tje;
import defpackage.w511;
import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.DoubleTariffRibbonView;
import ru.yandex.taxi.tooltips.CashbackTariffTooltipPopup;
import ru.yandex.taxi.widget.AnyTouchCatcherFrameLayout;

/* loaded from: classes6.dex */
public final class c {
    public final b a;
    public final jpe b;
    public final AnyTouchCatcherFrameLayout c;
    public final boolean d;
    public final fva0 e;
    public final mqv0 f;
    public final msx0 g = new msx0(this);
    public final jsx0 h;
    public final bmq0 i;
    public OneShotPreDrawListener j;
    public OneShotPreDrawListener k;
    public CashbackTariffTooltipPopup l;
    public TariffsRibbonView m;
    public DoubleTariffRibbonView n;
    public boolean o;
    public boolean p;
    public TariffsSelectorView$SelectorViewType q;
    public TariffsSelectorView$SelectorMargin r;

    public c(isx0 isx0Var, b bVar, jpe jpeVar, AnyTouchCatcherFrameLayout anyTouchCatcherFrameLayout, ru.yandex.taxi.preorder.summary.selector.model.vertical.a aVar, ru.yandex.taxi.preorder.summary.selector.appearance.a aVar2, pe31 pe31Var, boolean z, fva0 fva0Var, qr31 qr31Var, mqv0 mqv0Var, n070 n070Var) {
        this.a = bVar;
        this.b = jpeVar;
        this.c = anyTouchCatcherFrameLayout;
        this.d = z;
        this.e = fva0Var;
        this.f = mqv0Var;
        bmq0 bmq0Var = new bmq0();
        this.i = bmq0Var;
        this.q = TariffsSelectorView$SelectorViewType.USUAL;
        this.r = TariffsSelectorView$SelectorMargin.USUAL;
        this.h = (jsx0) new tag().a(isx0Var, anyTouchCatcherFrameLayout.getContext(), bVar, aVar, aVar2.b(), pe31Var, qr31Var, bmq0Var, n070Var, z).Q.get();
    }

    public final void a() {
        this.a.Bg(this.g);
        AnyTouchCatcherFrameLayout anyTouchCatcherFrameLayout = this.c;
        this.i.a = anyTouchCatcherFrameLayout.getHasAtLeastOneCaughtTouch();
        anyTouchCatcherFrameLayout.setAnyTouchCatcherListener(new l7s0(this));
    }

    public final void b() {
        this.a.Cg();
        this.c.setAnyTouchCatcherListener(null);
        CashbackTariffTooltipPopup cashbackTariffTooltipPopup = this.l;
        if (cashbackTariffTooltipPopup != null) {
            cashbackTariffTooltipPopup.detach();
        }
    }

    public final DoubleTariffRibbonView c() {
        DoubleTariffRibbonView doubleTariffRibbonView = this.n;
        if (doubleTariffRibbonView != null) {
            return doubleTariffRibbonView;
        }
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Inflate;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        fva0 fva0Var = this.e;
        fva0Var.e("DoubleTariffRibbonView", performanceAnalytics$Type, elapsedRealtime);
        DoubleTariffRibbonView doubleTariffRibbonView2 = (DoubleTariffRibbonView) this.h.b.get();
        this.n = doubleTariffRibbonView2;
        this.k = fva0.c(fva0Var, doubleTariffRibbonView2, "DoubleTariffRibbonView", performanceAnalytics$Type, 8);
        return doubleTariffRibbonView2;
    }

    public final void d() {
        this.a.pause();
        OneShotPreDrawListener oneShotPreDrawListener = this.j;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
        OneShotPreDrawListener oneShotPreDrawListener2 = this.k;
        if (oneShotPreDrawListener2 != null) {
            oneShotPreDrawListener2.removeListener();
        }
    }

    public final void e(TariffsSelectorView$SelectorViewType tariffsSelectorView$SelectorViewType) {
        View c;
        TariffsSelectorView$SelectorViewType tariffsSelectorView$SelectorViewType2 = this.q;
        AnyTouchCatcherFrameLayout anyTouchCatcherFrameLayout = this.c;
        if (tariffsSelectorView$SelectorViewType2 != tariffsSelectorView$SelectorViewType || anyTouchCatcherFrameLayout.getChildCount() == 0) {
            this.q = tariffsSelectorView$SelectorViewType;
            anyTouchCatcherFrameLayout.removeAllViews();
            int u = (this.f.c() == SummaryUiDelegate$TariffCardStyle.HIGH ? tje.u(151, anyTouchCatcherFrameLayout.getContext()) : tje.u(145, anyTouchCatcherFrameLayout.getContext())) + (tariffsSelectorView$SelectorViewType == TariffsSelectorView$SelectorViewType.DOUBLE_SELECTOR ? tje.u(48, anyTouchCatcherFrameLayout.getContext()) : 0);
            int i = nsx0.a[this.q.ordinal()];
            if (i == 1) {
                c = c();
                c.setMinimumHeight(u);
            } else if (i != 2) {
                w511.b();
                return;
            } else {
                c = f();
                c.setMinimumHeight(u);
            }
            anyTouchCatcherFrameLayout.addView(c, 0, new ViewGroup.LayoutParams(-1, -2));
            DoubleTariffRibbonView doubleTariffRibbonView = this.n;
            if (doubleTariffRibbonView != null) {
                doubleTariffRibbonView.setTopMargin(this.r == TariffsSelectorView$SelectorMargin.SMALL ? ru.yandex.taxi.design.utils.c.h(20, anyTouchCatcherFrameLayout) : ru.yandex.taxi.design.utils.c.h(32, anyTouchCatcherFrameLayout));
            }
        }
    }

    public final TariffsRibbonView f() {
        TariffsRibbonView tariffsRibbonView = this.m;
        if (tariffsRibbonView != null) {
            return tariffsRibbonView;
        }
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Inflate;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        fva0 fva0Var = this.e;
        fva0Var.e("TariffsRibbonView", performanceAnalytics$Type, elapsedRealtime);
        TariffsRibbonView tariffsRibbonView2 = (TariffsRibbonView) this.h.a.get();
        tariffsRibbonView2.setProcessVerticalFirstSelection(this.p);
        this.m = tariffsRibbonView2;
        this.j = fva0.c(fva0Var, tariffsRibbonView2, "TariffsRibbonView", performanceAnalytics$Type, 8);
        return tariffsRibbonView2;
    }
}
