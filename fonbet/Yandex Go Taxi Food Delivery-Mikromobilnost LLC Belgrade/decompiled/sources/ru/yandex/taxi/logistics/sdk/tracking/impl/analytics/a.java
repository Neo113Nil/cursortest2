package ru.yandex.taxi.logistics.sdk.tracking.impl.analytics;

import defpackage.c301;
import defpackage.cjw0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.x701;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ cjw0 b;

    public a(vpr vprVar, cjw0 cjw0Var) {
        this.a = vprVar;
        this.b = cjw0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TrackingAnalyticsDataInteractor$special$$inlined$map$1$2$1 trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TrackingAnalyticsDataInteractor$special$$inlined$map$1$2$1) {
            trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1 = (TrackingAnalyticsDataInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    c301 u = this.b.u((x701) obj);
                    trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1.I$0 = 0;
                    trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(u, trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1 = new TrackingAnalyticsDataInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingAnalyticsDataInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
