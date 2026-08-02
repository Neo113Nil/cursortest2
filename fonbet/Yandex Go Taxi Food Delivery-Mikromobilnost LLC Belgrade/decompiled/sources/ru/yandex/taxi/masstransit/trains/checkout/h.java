package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.ph40;
import defpackage.rh40;
import defpackage.tje;

/* loaded from: classes6.dex */
public final class h implements rh40 {
    public final /* synthetic */ i a;

    public h(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.sy60
    public final void a() {
    }

    public final void n1(String str, ph40 ph40Var) {
        if (str == null || ph40Var == null) {
            return;
        }
        i iVar = this.a;
        tje.N(iVar.o(), null, null, new MtTrainCheckoutModalRouter$InnerNavigator$navigateToTariff$1$onTariffSelected$1(iVar, str, ph40Var, null), 3);
    }
}
