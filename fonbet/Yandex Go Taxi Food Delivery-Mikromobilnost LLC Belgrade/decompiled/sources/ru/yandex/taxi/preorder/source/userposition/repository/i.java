package ru.yandex.taxi.preorder.source.userposition.repository;

import defpackage.adz;
import defpackage.hcz;
import defpackage.mth;
import defpackage.ny61;
import defpackage.o9z;
import defpackage.tpr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class i implements hcz {
    public final adz a;
    public final hcz b;

    public i(adz adzVar, hcz hczVar) {
        this.a = adzVar;
        this.b = hczVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.hcz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LocationSdkWithFallbackLocationRepository$requestLocationUpdates$1 locationSdkWithFallbackLocationRepository$requestLocationUpdates$1;
        Object obj;
        int i;
        if (continuationImpl instanceof LocationSdkWithFallbackLocationRepository$requestLocationUpdates$1) {
            locationSdkWithFallbackLocationRepository$requestLocationUpdates$1 = (LocationSdkWithFallbackLocationRepository$requestLocationUpdates$1) continuationImpl;
            int i2 = locationSdkWithFallbackLocationRepository$requestLocationUpdates$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationSdkWithFallbackLocationRepository$requestLocationUpdates$1.label = i2 - Integer.MIN_VALUE;
                obj = locationSdkWithFallbackLocationRepository$requestLocationUpdates$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationSdkWithFallbackLocationRepository$requestLocationUpdates$1.label;
                int i3 = 6;
                adz adzVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationSdkWithFallbackLocationRepository$requestLocationUpdates$1.label = 1;
                    obj = ((com.yandex.go.g) adzVar).j(locationSdkWithFallbackLocationRepository$requestLocationUpdates$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return kotlinx.coroutines.flow.e.K(new h((tpr) obj, this), new com.yandex.go.d(new mth(((com.yandex.go.g) adzVar).i, i3)));
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return new com.yandex.go.d(new mth(((com.yandex.go.g) adzVar).i, i3));
                }
                locationSdkWithFallbackLocationRepository$requestLocationUpdates$1.label = 2;
                obj = this.b.a(locationSdkWithFallbackLocationRepository$requestLocationUpdates$1);
            }
        }
        locationSdkWithFallbackLocationRepository$requestLocationUpdates$1 = new LocationSdkWithFallbackLocationRepository$requestLocationUpdates$1(this, continuationImpl);
        obj = locationSdkWithFallbackLocationRepository$requestLocationUpdates$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationSdkWithFallbackLocationRepository$requestLocationUpdates$1.label;
        int i32 = 6;
        adz adzVar2 = this.a;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0052, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.hcz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        LocationSdkWithFallbackLocationRepository$getLocationImmediately$1 locationSdkWithFallbackLocationRepository$getLocationImmediately$1;
        int i;
        o9z o9zVar;
        if (continuationImpl instanceof LocationSdkWithFallbackLocationRepository$getLocationImmediately$1) {
            locationSdkWithFallbackLocationRepository$getLocationImmediately$1 = (LocationSdkWithFallbackLocationRepository$getLocationImmediately$1) continuationImpl;
            int i2 = locationSdkWithFallbackLocationRepository$getLocationImmediately$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationSdkWithFallbackLocationRepository$getLocationImmediately$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationSdkWithFallbackLocationRepository$getLocationImmediately$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationSdkWithFallbackLocationRepository$getLocationImmediately$1.label;
                adz adzVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationSdkWithFallbackLocationRepository$getLocationImmediately$1.label = 1;
                    obj = ((com.yandex.go.g) adzVar).d(locationSdkWithFallbackLocationRepository$getLocationImmediately$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        kotlin.b.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            throw new LocationRepository$LocationUnknownException();
                        }
                        locationSdkWithFallbackLocationRepository$getLocationImmediately$1.L$0 = null;
                        locationSdkWithFallbackLocationRepository$getLocationImmediately$1.label = 3;
                        Object b = this.b.b(locationSdkWithFallbackLocationRepository$getLocationImmediately$1);
                        return b == coroutineSingletons ? coroutineSingletons : b;
                    }
                    kotlin.b.b(obj);
                }
                o9zVar = (o9z) obj;
                if (o9zVar == null) {
                    return o9zVar.a;
                }
                locationSdkWithFallbackLocationRepository$getLocationImmediately$1.L$0 = null;
                locationSdkWithFallbackLocationRepository$getLocationImmediately$1.label = 2;
                obj = ((com.yandex.go.g) adzVar).j(locationSdkWithFallbackLocationRepository$getLocationImmediately$1);
            }
        }
        locationSdkWithFallbackLocationRepository$getLocationImmediately$1 = new LocationSdkWithFallbackLocationRepository$getLocationImmediately$1(this, continuationImpl);
        Object obj2 = locationSdkWithFallbackLocationRepository$getLocationImmediately$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationSdkWithFallbackLocationRepository$getLocationImmediately$1.label;
        adz adzVar2 = this.a;
        if (i != 0) {
        }
        o9zVar = (o9z) obj2;
        if (o9zVar == null) {
        }
    }
}
