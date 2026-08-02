package ru.yandex.taxi.cashback;

import android.app.Activity;
import android.net.Uri;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import defpackage.d0h;
import defpackage.d49;
import defpackage.dke;
import defpackage.e0h;
import defpackage.evu0;
import defpackage.f0h;
import defpackage.g0h;
import defpackage.h3y;
import defpackage.h55;
import defpackage.i130;
import defpackage.jl40;
import defpackage.jst;
import defpackage.m950;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.tse;
import defpackage.v2d0;
import defpackage.w030;
import defpackage.w2d0;
import defpackage.w511;
import defpackage.xby;
import defpackage.z0j;
import ru.yandex.taxi.cashback.analytics.CashbackCardContext;
import ru.yandex.taxi.cashback.sdk.OpenPlusSubscriptionAction;
import ru.yandex.taxi.modal.LoadingModalView;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;

/* loaded from: classes5.dex */
public final class f extends h55 implements m950 {
    public final h3y D;
    public final Activity E;
    public final tse F;
    public final ru.yandex.taxi.cashback.interactors.i G;
    public final z0j H;
    public final i130 I;
    public pzt0 J;

    public f(h3y h3yVar, Activity activity, tse tseVar, ru.yandex.taxi.cashback.interactors.i iVar, z0j z0jVar, i130 i130Var) {
        super(null);
        this.D = h3yVar;
        this.E = activity;
        this.F = tseVar;
        this.G = iVar;
        this.H = z0jVar;
        this.I = i130Var;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        f0h f0hVar = (f0h) obj;
        int i = 9;
        if (f0hVar instanceof d0h) {
            d49 d49Var = (d49) this.D.get();
            Uri uri = ((d0h) f0hVar).a;
            d49Var.getClass();
            String value = CashbackCardContext.DEEPLINK.getValue();
            String queryParameter = uri.getQueryParameter("open_reason");
            if (queryParameter != null && !evu0.J(queryParameter)) {
                value = queryParameter;
            }
            d49Var.b.b(MainMenuProcessor$MenuEntry.PLUS_BURNS, value);
            r(new qu(i));
            return;
        }
        if (!(f0hVar instanceof e0h)) {
            w511.b();
            return;
        }
        w030 a = this.I.a();
        w2d0 w2d0Var = ((e0h) f0hVar).a;
        if (jl40.l(a, w030.a)) {
            xby.l(jst.e, "DEEPLINK:PLUS_HOME:NO_FRAGMENT_ATTACHED", null, null, "There are no ModalViewCoordinator attached to open plus card", 6);
            r(new qu(i));
            return;
        }
        g0h g0hVar = new g0h(this);
        pzt0 pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        if (!jl40.l(((com.yandex.go.payments.paymentlist.data.c) this.G.a).g.b.g(), PaymentMethods.x)) {
            P(w2d0Var, g0hVar);
            return;
        }
        LoadingModalView loadingModalView = new LoadingModalView(this.E);
        loadingModalView.setAnimateOnAppearing(false);
        a.s(loadingModalView, true);
        pzt0 g = com.yandex.go.coroutines.b.g(this.F, null, null, new DeeplinkCashbackRouterImpl$openPlusCard$1(this, w2d0Var, g0hVar, null), 3);
        this.J = g;
        g.w(new dke(18, a, loadingModalView));
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        pzt0 pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.J = null;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.H.c(this);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.H.a(this);
    }

    public final void P(w2d0 w2d0Var, g0h g0hVar) {
        boolean z = w2d0Var.b;
        OpenPlusSubscriptionAction openPlusSubscriptionAction = w2d0Var.a;
        boolean z2 = z && openPlusSubscriptionAction != OpenPlusSubscriptionAction.BUY_SUBSCRIPTION;
        v2d0 v2d0Var = new v2d0();
        v2d0Var.a = openPlusSubscriptionAction;
        v2d0Var.c = w2d0Var.c;
        v2d0Var.e = w2d0Var.e;
        v2d0Var.d = w2d0Var.d;
        v2d0Var.b = z2;
        w2d0 a = v2d0Var.a();
        d49 d49Var = (d49) this.D.get();
        d49Var.getClass();
        d49Var.c(CashbackCardContext.DEEPLINK, a, g0hVar);
    }
}
