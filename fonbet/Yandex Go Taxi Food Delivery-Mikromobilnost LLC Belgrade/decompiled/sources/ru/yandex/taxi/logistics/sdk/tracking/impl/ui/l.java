package ru.yandex.taxi.logistics.sdk.tracking.impl.ui;

import defpackage.b801;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ b801 b;

    public l(vpr vprVar, b801 b801Var) {
        this.a = vprVar;
        this.b = b801Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TrackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1 trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TrackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1) {
            trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1 = (TrackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = new Pair(this.b.getKey(), (List) obj);
                    trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1.I$0 = 0;
                    trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1 = new TrackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingWidgetModelProvider$widgetsFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
