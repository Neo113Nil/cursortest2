package ru.yandex.taxi.due_selector.impl.domain.interactor.price;

import defpackage.cwm;
import defpackage.jqr;
import defpackage.mdh;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vwm;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.o;

/* loaded from: classes5.dex */
public final class e {
    public final com.yandex.go.taxi.tariffs.repository.a a;
    public final vwm b;
    public final cwm c;
    public final tt2 d;

    public e(com.yandex.go.taxi.tariffs.repository.a aVar, vwm vwmVar, cwm cwmVar, tt2 tt2Var) {
        this.a = aVar;
        this.b = vwmVar;
        this.c = cwmVar;
        this.d = tt2Var;
    }

    public final tpr a() {
        this.c.c.set(true);
        jqr jqrVar = new jqr(new o(new n(new d(new b(new rol0(new DuePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$1(this, null)), this)), new DuePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$4(2, null)), new DuePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$5(3, null)), new DuePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$6(this, null), 3);
        this.d.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(jqrVar, mdh.b);
    }
}
