package ru.yandex.taxi.masstransit.trains.schedule;

import defpackage.jc01;
import defpackage.tje;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleEntryPointSource;

/* loaded from: classes6.dex */
public final class c implements jc01 {
    public final /* synthetic */ e a;

    public c(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.sy60
    public final void a() {
    }

    @Override // defpackage.jc01
    public final void y(String str, String str2) {
        e eVar = this.a;
        eVar.P.a = TransportRouteAnalytics$ScheduleEntryPointSource.StationSearch;
        tje.N(eVar.o(), null, null, new MtTrainScheduleModalRouter$InnerNavigator$navigateToSelectStationScreen$1$stationsChosen$1(eVar, str, str2, null), 3);
    }
}
