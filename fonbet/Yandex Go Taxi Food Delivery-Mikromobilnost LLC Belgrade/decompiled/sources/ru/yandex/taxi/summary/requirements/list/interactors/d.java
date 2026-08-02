package ru.yandex.taxi.summary.requirements.list.interactors;

import com.yandex.go.copter.experiment.CopterOrderFlowExperiment;
import defpackage.g580;
import defpackage.h3y;
import defpackage.kwb;
import defpackage.lwb;
import defpackage.mwb;
import defpackage.sdd;
import defpackage.wiq0;
import defpackage.ye;
import defpackage.zy11;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes6.dex */
public final class d {
    public final h3y a;
    public final wiq0 b;
    public final g580 c;

    public d(h3y h3yVar, wiq0 wiq0Var, g580 g580Var) {
        this.a = h3yVar;
        this.b = wiq0Var;
        this.c = g580Var;
    }

    public final Object a(SuspendLambda suspendLambda) {
        CopterOrderFlowExperiment.CityTourSettings cityTourSettings;
        String str;
        String str2;
        h3y h3yVar = this.a;
        CopterOrderFlowExperiment a = ((mwb) ((lwb) h3yVar.get())).b.a();
        kwb kwbVar = (!a.b || (cityTourSettings = a.f) == null || (str = cityTourSettings.a) == null || (str2 = cityTourSettings.b) == null) ? null : new kwb(str, str2);
        return kwbVar == null ? zy11.a : new kotlinx.coroutines.flow.m0(kotlinx.coroutines.flow.e.s(new c(((com.yandex.go.taxi.tariffs.internal.repository.k) this.b).j.b()), new sdd(28)), kotlinx.coroutines.flow.e.t(new com.yandex.go.copter.city_tour.domain.b(((mwb) ((lwb) h3yVar.get())).a.b)), new CopterCityTourRequirementInteractor$subscribeCityTourSelectionChanges$2(3, null)).collect(new ye(5, kwbVar.a, this, kwbVar.b), suspendLambda);
    }
}
