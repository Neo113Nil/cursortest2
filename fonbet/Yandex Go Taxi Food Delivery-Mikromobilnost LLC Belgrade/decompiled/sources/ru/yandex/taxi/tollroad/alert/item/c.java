package ru.yandex.taxi.tollroad.alert.item;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.avj0;
import defpackage.kyh0;
import defpackage.loz0;
import defpackage.ny61;
import defpackage.zuj0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class c {
    public final zuj0 a;

    public c(zuj0 zuj0Var, ru.yandex.taxi.widget.c cVar) {
        this.a = zuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final loz0 a(OrderStatusInfo.TollRoads tollRoads, ContinuationImpl continuationImpl) {
        TollRoadInfoMapper$getAlertViewModel$1 tollRoadInfoMapper$getAlertViewModel$1;
        int i;
        String h;
        if (continuationImpl instanceof TollRoadInfoMapper$getAlertViewModel$1) {
            tollRoadInfoMapper$getAlertViewModel$1 = (TollRoadInfoMapper$getAlertViewModel$1) continuationImpl;
            int i2 = tollRoadInfoMapper$getAlertViewModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tollRoadInfoMapper$getAlertViewModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tollRoadInfoMapper$getAlertViewModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tollRoadInfoMapper$getAlertViewModel$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str = (String) tollRoadInfoMapper$getAlertViewModel$1.L$3;
                    String str2 = (String) tollRoadInfoMapper$getAlertViewModel$1.L$1;
                    kotlin.b.b(obj);
                    return new loz0((CharSequence) obj, str2, str);
                }
                kotlin.b.b(obj);
                boolean z = tollRoads.c;
                zuj0 zuj0Var = this.a;
                if (z) {
                    h = ((avj0) zuj0Var).h(kyh0.toll_road_info_toll_road_alert_auto_payment_message);
                } else {
                    h = ((avj0) zuj0Var).h(kyh0.toll_road_info_toll_road_alert_manual_payment_message);
                }
                avj0 avj0Var = (avj0) zuj0Var;
                return new loz0(h, avj0Var.h(kyh0.toll_road_info_toll_road_alert_title), avj0Var.h(kyh0.toll_road_info_toll_road_alert_understand));
            }
        }
        tollRoadInfoMapper$getAlertViewModel$1 = new TollRoadInfoMapper$getAlertViewModel$1(this, continuationImpl);
        Object obj2 = tollRoadInfoMapper$getAlertViewModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tollRoadInfoMapper$getAlertViewModel$1.label;
        if (i == 0) {
        }
    }
}
