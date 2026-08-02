package ru.yandex.taxi.masstransit.geopayment.modal;

import defpackage.fl10;
import defpackage.gci0;
import defpackage.jse;
import defpackage.n26;
import defpackage.nw8;
import defpackage.ol30;
import defpackage.t16;
import defpackage.tpr;
import defpackage.xl10;
import defpackage.yt11;

/* loaded from: classes6.dex */
public final class g implements yt11 {
    public final n26 a;
    public final nw8 b;
    public final tpr c;

    public g(n26 n26Var, fl10 fl10Var, xl10 xl10Var, ol30 ol30Var, nw8 nw8Var, jse jseVar) {
        this.a = n26Var;
        this.b = nw8Var;
        gci0 gci0Var = ol30Var.b;
        ru.yandex.taxi.masstransit.geopayment.adapter.a aVar = (ru.yandex.taxi.masstransit.geopayment.adapter.a) fl10Var.a;
        this.c = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.l(gci0Var, kotlinx.coroutines.flow.e.d(aVar.b), kotlinx.coroutines.flow.e.d(aVar.c), ((t16) xl10Var.a).a.d, ol30Var.d, new MtGeoPaymentModalUiStateInteractor$uiStateFlow$1(this, null))), jseVar);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.c;
    }
}
