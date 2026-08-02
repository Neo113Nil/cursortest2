package ru.yandex.taxi.superapp.address;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public b(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GeoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1 geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof GeoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1) {
            geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1 = (GeoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1) continuation;
            int i2 = geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (this.b.e == null) {
                        geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1.L$0 = null;
                        geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1.L$1 = null;
                        geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1.L$2 = null;
                        geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1.L$3 = null;
                        geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1 = new GeoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoPositionRepositoryImpl$lastGeoPositionFlow$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
