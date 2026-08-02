package ru.yandex.taxi.maas.impl.ride.exitchoice;

import defpackage.h100;
import defpackage.l8x;
import defpackage.lmo;
import defpackage.ptw;
import defpackage.qu;
import defpackage.ssd0;
import defpackage.tje;
import defpackage.zzs;
import ru.yandex.taxi.maas.impl.ride.exitchoice.MaasExitChooseModalView;

/* loaded from: classes5.dex */
public final class a implements MaasExitChooseModalView.a {
    public final /* synthetic */ MaasExitChooseFragment a;
    public final /* synthetic */ MaasExitChooseModalView b;

    public a(MaasExitChooseFragment maasExitChooseFragment, MaasExitChooseModalView maasExitChooseModalView) {
        this.a = maasExitChooseFragment;
        this.b = maasExitChooseModalView;
    }

    @Override // ru.yandex.taxi.maas.impl.ride.exitchoice.MaasExitChooseModalView.a
    public final void onBackClick() {
        this.b.dismiss();
        ((h100) this.a.requireCallback()).b.r(new qu(9));
    }

    @Override // ru.yandex.taxi.maas.impl.ride.exitchoice.MaasExitChooseModalView.a
    public final void q0() {
        this.b.dismiss();
        h100 h100Var = (h100) this.a.requireCallback();
        h100Var.b.r(new ptw(28, h100Var));
    }

    @Override // ru.yandex.taxi.maas.impl.ride.exitchoice.MaasExitChooseModalView.a
    public final void s(lmo lmoVar) {
        l8x l8xVar;
        MaasExitChooseFragment maasExitChooseFragment = this.a;
        maasExitChooseFragment.getExitOverlay().h0.l(lmoVar);
        this.b.anchor();
        ssd0 ssd0Var = lmoVar.b.a;
        zzs zzsVar = new zzs(ssd0Var.a, ssd0Var.b, 0, null, null, 28);
        l8xVar = maasExitChooseFragment.pointAddressJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        maasExitChooseFragment.pointAddressJob = tje.N(maasExitChooseFragment.getLifecycleScope(), null, null, new MaasExitChooseFragment$onViewCreated$1$onExitSelected$1(maasExitChooseFragment, zzsVar, null), 3);
    }
}
