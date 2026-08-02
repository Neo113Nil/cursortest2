package ru.yandex.taxi.masstransit.trains.schedule;

import defpackage.ix41;
import defpackage.sy60;
import defpackage.tje;

/* loaded from: classes6.dex */
public final class b implements sy60 {
    public final /* synthetic */ e a;
    public final /* synthetic */ ix41 b;

    public b(e eVar, ix41 ix41Var) {
        this.a = eVar;
        this.b = ix41Var;
    }

    @Override // defpackage.sy60
    public final void a() {
    }

    public final void n1(int i) {
        e eVar = this.a;
        tje.N(eVar.o(), null, null, new MtTrainScheduleModalRouter$InnerNavigator$launchWheelDatePicker$1$selectedItem$1(eVar, this.b, i, null), 3);
    }
}
