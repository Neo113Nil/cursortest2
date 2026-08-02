package ru.yandex.taxi.preorder.source.userposition.repository;

import defpackage.adz;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public g(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LocationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1 locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1;
        Object obj2;
        int i;
        vpr vprVar;
        if (continuation instanceof LocationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1) {
            locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1 = (LocationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1) continuation;
            int i2 = locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                obj2 = locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    adz adzVar = this.b.a;
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.L$0 = null;
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.L$1 = null;
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.L$2 = obj;
                    vprVar = this.a;
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.L$3 = vprVar;
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.L$4 = null;
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.L$5 = null;
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.label = 1;
                    obj2 = ((com.yandex.go.g) adzVar).d(locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.L$3;
                    obj = locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.L$2;
                    kotlin.b.b(obj2);
                }
                if (obj2 == null) {
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.L$0 = null;
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.L$1 = null;
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.L$2 = null;
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.L$3 = null;
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.L$4 = null;
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.L$5 = null;
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.label = 2;
                }
                return zy11.a;
            }
        }
        locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1 = new LocationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1(this, continuation);
        obj2 = locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationSdkWithFallbackLocationRepository$requestLocationUpdates$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        if (obj2 == null) {
        }
        return zy11.a;
    }
}
