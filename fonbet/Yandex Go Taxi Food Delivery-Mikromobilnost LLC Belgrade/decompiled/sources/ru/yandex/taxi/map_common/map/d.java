package ru.yandex.taxi.map_common.map;

import com.yandex.mapkit.location.LocationManager;
import defpackage.el00;
import defpackage.g050;
import defpackage.g6u;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class d {
    public final el00 a;
    public final tt2 b;
    public LocationManager c;
    public final kotlinx.coroutines.sync.a d = gtq0.a();

    public d(el00 el00Var, tt2 tt2Var) {
        this.a = el00Var;
        this.b = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (defpackage.tje.k0(r2, r4, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005f, code lost:
    
        if (r8.a(r0) != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0052, code lost:
    
        if (r7.a.a(r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v7, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LocationManagerRepositoryImpl$getLocationManager$1 locationManagerRepositoryImpl$getLocationManager$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        LocationManager locationManager;
        if (continuationImpl instanceof LocationManagerRepositoryImpl$getLocationManager$1) {
            locationManagerRepositoryImpl$getLocationManager$1 = (LocationManagerRepositoryImpl$getLocationManager$1) continuationImpl;
            int i2 = locationManagerRepositoryImpl$getLocationManager$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationManagerRepositoryImpl$getLocationManager$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationManagerRepositoryImpl$getLocationManager$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationManagerRepositoryImpl$getLocationManager$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationManagerRepositoryImpl$getLocationManager$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) locationManagerRepositoryImpl$getLocationManager$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                locationManager = this.c;
                                if (locationManager == null) {
                                    locationManager = null;
                                }
                                g050Var.d(null);
                                return locationManager;
                            } catch (Throwable th) {
                                th = th;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) locationManagerRepositoryImpl$getLocationManager$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                        try {
                            if (this.c == null) {
                                this.b.getClass();
                                sjh sjhVar = uyj.a;
                                g6u g6uVar = o400.a;
                                LocationManagerRepositoryImpl$getLocationManager$2$1 locationManagerRepositoryImpl$getLocationManager$2$1 = new LocationManagerRepositoryImpl$getLocationManager$2$1(this, null);
                                locationManagerRepositoryImpl$getLocationManager$1.L$0 = aVar;
                                locationManagerRepositoryImpl$getLocationManager$1.label = 3;
                            }
                            g050Var = aVar;
                            locationManager = this.c;
                            if (locationManager == null) {
                            }
                            g050Var.d(null);
                            return locationManager;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var = aVar;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    kotlin.b.b(obj);
                }
                aVar = this.d;
                locationManagerRepositoryImpl$getLocationManager$1.L$0 = aVar;
                locationManagerRepositoryImpl$getLocationManager$1.label = 2;
            }
        }
        locationManagerRepositoryImpl$getLocationManager$1 = new LocationManagerRepositoryImpl$getLocationManager$1(this, continuationImpl);
        Object obj2 = locationManagerRepositoryImpl$getLocationManager$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationManagerRepositoryImpl$getLocationManager$1.label;
        if (i != 0) {
        }
        aVar = this.d;
        locationManagerRepositoryImpl$getLocationManager$1.L$0 = aVar;
        locationManagerRepositoryImpl$getLocationManager$1.label = 2;
    }
}
