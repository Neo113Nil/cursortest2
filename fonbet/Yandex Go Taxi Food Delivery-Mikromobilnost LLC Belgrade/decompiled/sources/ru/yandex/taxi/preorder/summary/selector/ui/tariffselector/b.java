package ru.yandex.taxi.preorder.summary.selector.ui.tariffselector;

import defpackage.ad5;
import defpackage.b8r;
import defpackage.c4r0;
import defpackage.cne0;
import defpackage.elx0;
import defpackage.fk31;
import defpackage.hbp0;
import defpackage.hnx0;
import defpackage.i2s;
import defpackage.jst;
import defpackage.mi31;
import defpackage.orx0;
import defpackage.pe31;
import defpackage.pex0;
import defpackage.sgx0;
import defpackage.t49;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u49;
import defpackage.unr0;
import defpackage.unx0;
import defpackage.ux31;
import defpackage.wiq0;
import defpackage.y5s0;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class b extends ad5 implements a.InterfaceC0113a {
    public final ru.yandex.taxi.preorder.summary.selector.analytics.b A;
    public final unx0 B;
    public final i2s C;
    public final c4r0 D;
    public final t49 E;
    public final fk31 F;
    public final hnx0 G;
    public final pe31 H;
    public final b8r I;
    public final y5s0 J;
    public final hbp0 K;
    public final tt2 x;
    public final wiq0 y;
    public final orx0 z;

    /* JADX WARN: Multi-variable type inference failed */
    public b(tt2 tt2Var, wiq0 wiq0Var, orx0 orx0Var, ru.yandex.taxi.preorder.summary.selector.analytics.b bVar, unx0 unx0Var, i2s i2sVar, c4r0 c4r0Var, t49 t49Var, fk31 fk31Var, hnx0 hnx0Var, pe31 pe31Var, b8r b8rVar, y5s0 y5s0Var) {
        super(a.class);
        this.x = tt2Var;
        this.y = wiq0Var;
        this.z = orx0Var;
        this.A = bVar;
        this.B = unx0Var;
        this.C = i2sVar;
        this.D = c4r0Var;
        this.E = t49Var;
        this.F = fk31Var;
        this.G = hnx0Var;
        this.H = pe31Var;
        this.I = b8rVar;
        this.J = y5s0Var;
        this.K = new hbp0(new TariffsSelectorPresenter$resumeDelegate$1(0, tt2Var, tt2.class, "main", "main()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    }

    @Override // defpackage.zc5
    public final void Fg() {
        this.K.b();
        this.A.b.clear();
    }

    @Override // defpackage.zc5
    public final void Gg() {
        hbp0 hbp0Var = this.K;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new TariffsSelectorPresenter$onResume$1(this, null), 3);
        tje.N(hbp0Var.c(), null, null, new TariffsSelectorPresenter$onResume$2(this, null), 3);
    }

    @Override // ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a.InterfaceC0113a
    public final void Xf(sgx0 sgx0Var, String str, boolean z) {
        mi31 b = this.I.b(sgx0Var, str);
        if (b == null) {
            unr0.D(new Object[]{sgx0Var.a}, 1, "Tariff '%s' not found", jst.e, new IllegalStateException("Tariff not found"));
            return;
        }
        pex0 pex0Var = b.a;
        this.J.a(pex0Var);
        ((a) Dg()).z7();
        sgx0 sgx0Var2 = pex0Var.J0;
        this.D.d(SelectionOrigin.USER, sgx0Var2, b.b, true);
        if (z) {
            this.G.u0(sgx0Var2);
        }
    }

    @Override // ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a.InterfaceC0113a
    public final void Z6(int i, elx0 elx0Var) {
        String str = elx0Var.z;
        boolean z = elx0Var.u;
        u49 u49Var = (u49) this.E;
        u49Var.getClass();
        boolean z2 = false;
        if (z && str.length() > 0 && !((cne0) u49Var.a.b).g("ru.yandex.taxi.cashback.onboarding.CASHBACK_FOR_TRIP_SHOWED", false)) {
            z2 = true;
        }
        if (z2) {
            ((a) Dg()).jf(i, str);
        } else {
            ((a) Dg()).z7();
        }
    }

    @Override // ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a.InterfaceC0113a
    public final void i(ux31 ux31Var) {
        ((a) Dg()).a1(ux31Var);
    }

    @Override // ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a.InterfaceC0113a
    public final void u0(sgx0 sgx0Var) {
        mi31 b = this.I.b(sgx0Var, "");
        if (b != null) {
            this.G.u0(b.a.J0);
        } else {
            unr0.D(new Object[]{sgx0Var.a}, 1, "Tariff '%s' not found", jst.e, new IllegalStateException("Tariff not found"));
        }
    }
}
