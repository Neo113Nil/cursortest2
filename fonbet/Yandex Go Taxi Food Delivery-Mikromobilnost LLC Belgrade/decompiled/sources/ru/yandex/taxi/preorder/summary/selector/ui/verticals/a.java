package ru.yandex.taxi.preorder.summary.selector.ui.verticals;

import androidx.recyclerview.widget.x0;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import defpackage.elx0;
import defpackage.k6m;
import defpackage.rf31;
import defpackage.sgx0;
import defpackage.tje;
import defpackage.ux31;
import defpackage.v8e;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a;

/* loaded from: classes6.dex */
public final class a implements rf31 {
    public final /* synthetic */ DoubleTariffRibbonView a;

    public a(DoubleTariffRibbonView doubleTariffRibbonView) {
        this.a = doubleTariffRibbonView;
    }

    @Override // defpackage.rf31
    public final void g(int i) {
        int i2;
        DoubleTariffRibbonView doubleTariffRibbonView = this.a;
        i2 = doubleTariffRibbonView.targetSelectedPage;
        if (i == i2) {
            doubleTariffRibbonView.refreshBubbleState();
        }
    }

    @Override // defpackage.rf31
    public final void h(sgx0 sgx0Var, String str, boolean z) {
        a.InterfaceC0113a interfaceC0113a;
        a.InterfaceC0113a interfaceC0113a2;
        DoubleTariffRibbonView doubleTariffRibbonView = this.a;
        if (z) {
            interfaceC0113a2 = doubleTariffRibbonView.currentListener;
            if (interfaceC0113a2 != null) {
                interfaceC0113a2.u0(sgx0Var);
                return;
            }
            return;
        }
        interfaceC0113a = doubleTariffRibbonView.currentListener;
        if (interfaceC0113a != null) {
            interfaceC0113a.Xf(sgx0Var, str, false);
        }
    }

    @Override // defpackage.rf31
    public final void i(ux31 ux31Var) {
        a.InterfaceC0113a interfaceC0113a;
        interfaceC0113a = this.a.currentListener;
        if (interfaceC0113a != null) {
            interfaceC0113a.i(ux31Var);
        }
    }

    @Override // defpackage.rf31
    public final void j(String str) {
        k6m k6mVar;
        k6mVar = this.a.presenter;
        tje.N(k6mVar.Jg(), null, null, new DoubleTariffRibbonPresenter$onDeeplinkClicked$1(k6mVar, str, null), 3);
    }

    @Override // defpackage.rf31
    public final void k() {
        k6m k6mVar;
        k6mVar = this.a.presenter;
        k6mVar.G.a(YbScreenSource.SUMMARY, null, new v8e(24, k6mVar));
    }

    @Override // defpackage.rf31
    public final void l() {
        k6m k6mVar;
        k6mVar = this.a.presenter;
        tje.N(k6mVar.Jg(), null, null, new DoubleTariffRibbonPresenter$onMarketplaceAltClicked$1(k6mVar, null), 3);
    }

    @Override // defpackage.rf31
    public final void n(x0 x0Var, elx0 elx0Var) {
        a.InterfaceC0113a interfaceC0113a;
        interfaceC0113a = this.a.currentListener;
        if (interfaceC0113a != null) {
            interfaceC0113a.Z6(x0Var.E(), elx0Var);
        }
    }
}
