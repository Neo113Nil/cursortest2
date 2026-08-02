package ru.yandex.taxi.scooters.presentation.ontheway;

import defpackage.sls;
import defpackage.tje;
import defpackage.tmm0;
import defpackage.zuo0;
import defpackage.zy11;
import ru.yandex.taxi.scooters.presentation.detailed_order.ScootersOrderLifecycleAnalytics$OrderCloseReason;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ zuo0 c;
    public final /* synthetic */ sls w;

    public /* synthetic */ a(sls slsVar, zuo0 zuo0Var, f fVar) {
        this.a = 2;
        this.w = slsVar;
        this.b = fVar;
        this.c = zuo0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        sls slsVar = this.w;
        zuo0 zuo0Var = this.c;
        f fVar = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ScootersOrderLifecycleAnalytics$OrderCloseReason scootersOrderLifecycleAnalytics$OrderCloseReason = ScootersOrderLifecycleAnalytics$OrderCloseReason.CANCEL_RIDING;
                f fVar2 = this.b;
                tje.N(fVar2.Jg(), null, null, new ScootersOnTheWayPresenter$cancelOrFinishOrder$1(fVar2, this.c, scootersOrderLifecycleAnalytics$OrderCloseReason, this.w, null), 3);
                break;
            case 1:
                ScootersOrderLifecycleAnalytics$OrderCloseReason scootersOrderLifecycleAnalytics$OrderCloseReason2 = ScootersOrderLifecycleAnalytics$OrderCloseReason.NORMAL;
                f fVar3 = this.b;
                tje.N(fVar3.Jg(), null, null, new ScootersOnTheWayPresenter$cancelOrFinishOrder$1(fVar3, this.c, scootersOrderLifecycleAnalytics$OrderCloseReason2, this.w, null), 3);
                break;
            case 2:
                slsVar.invoke();
                tje.N(fVar.Jg(), null, null, new ScootersOnTheWayPresenter$findNearestParking$1(fVar, zuo0Var, null), 3);
                break;
            default:
                tje.N(fVar.Jg(), null, null, new ScootersOnTheWayPresenter$tryFinishOrder$1((tmm0) slsVar, zuo0Var, null, fVar), 3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ a(f fVar, zuo0 zuo0Var, sls slsVar, int i) {
        this.a = i;
        this.b = fVar;
        this.c = zuo0Var;
        this.w = slsVar;
    }
}
