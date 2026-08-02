package defpackage;

import com.yandex.go.taxi.order.tariff_upgrade.ui.TariffUpgradeModalView;

/* loaded from: classes14.dex */
public final class qpx0 implements tpx0 {
    public final /* synthetic */ TariffUpgradeModalView a;

    public qpx0(TariffUpgradeModalView tariffUpgradeModalView) {
        this.a = tariffUpgradeModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        rpx0 binding;
        gqx0 gqx0Var = (gqx0) obj;
        TariffUpgradeModalView tariffUpgradeModalView = this.a;
        binding = tariffUpgradeModalView.getBinding();
        binding.g.setTitle(gqx0Var.a);
        binding.f.setTitle(gqx0Var.b);
        tariffUpgradeModalView.setImage(gqx0Var.c);
        tariffUpgradeModalView.updateDetailsButton(gqx0Var.d);
    }
}
