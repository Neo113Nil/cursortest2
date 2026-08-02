package ru.yandex.taxi.tollroad.alert.item;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.avj0;
import defpackage.kyh0;
import defpackage.lqz0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public d(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1 tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1;
        int i;
        String h;
        lqz0 lqz0Var;
        if (continuation instanceof TollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1) {
            tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1 = (TollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    OrderStatusInfo.TollRoads tollRoads = (OrderStatusInfo.TollRoads) obj;
                    zuj0 zuj0Var = this.b.a;
                    if (tollRoads.a()) {
                        if (tollRoads.c) {
                            h = ((avj0) zuj0Var).h(kyh0.toll_road_info_toll_road_auto_payment_subtitle);
                        } else {
                            h = ((avj0) zuj0Var).h(kyh0.toll_road_info_toll_road_manual_payment_subtitle);
                        }
                        lqz0Var = new lqz0(((avj0) zuj0Var).h(kyh0.toll_road_info_toll_road_title), h, true);
                    } else {
                        lqz0Var = lqz0.d;
                    }
                    tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                    tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                    tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                    tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                    tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(lqz0Var, tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1 = new TollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tollRoadRideInfoPresenter$attachView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
