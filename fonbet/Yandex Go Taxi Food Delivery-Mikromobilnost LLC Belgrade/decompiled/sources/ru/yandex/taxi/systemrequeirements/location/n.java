package ru.yandex.taxi.systemrequeirements.location;

import android.app.Activity;
import android.content.Intent;
import android.location.LocationManager;
import defpackage.bvf0;
import defpackage.ffx;
import defpackage.k0b0;
import defpackage.ny61;
import defpackage.tst;
import defpackage.z9z;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes10.dex */
public final class n {
    public final LocationManager a;
    public final tst b;
    public final k0b0 c;
    public final z9z d;
    public final n0 e;
    public final n0 f;
    public final n0 g;
    public Activity h;

    public n(LocationManager locationManager, tst tstVar, k0b0 k0b0Var, z9z z9zVar) {
        this.a = locationManager;
        this.b = tstVar;
        this.c = k0b0Var;
        this.d = z9zVar;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.e = ffx.b(0, 1, bufferOverflow);
        this.f = ffx.b(0, 1, bufferOverflow);
        this.g = ffx.b(0, 1, bufferOverflow);
    }

    public final Object a(ContinuationImpl continuationImpl) {
        Object y;
        return (this.a.isLocationEnabled() || (y = kotlinx.coroutines.flow.e.y(this.f, continuationImpl)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? zy11.a : y;
    }

    public final boolean b() {
        return !this.c.g();
    }

    public final boolean c() {
        return !this.a.isLocationEnabled();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(2:17|18))(2:19|20))(3:23|(1:25)(1:(3:29|(1:31)|(0)(1:33))(2:34|35))|27)|21|18))|53|6|7|(0)(0)|21|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r10 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0054, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 2;
        r2 = r10.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007f, code lost:
    
        if ((r11 instanceof com.google.android.gms.common.api.ResolvableApiException) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
    
        r11.f(r2, 113);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        r10 = defpackage.bvf0.n(new ru.yandex.taxi.systemrequeirements.location.LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2(r10, null), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
    
        if (r10 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0097, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
    
        if (r10 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009e, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009f, code lost:
    
        throw r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r10v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        LocationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1 locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1;
        int i;
        if (continuationImpl instanceof LocationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1) {
            locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1 = (LocationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1) continuationImpl;
            int i2 = locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1.label;
                Object obj3 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Activity activity = this.h;
                    tst tstVar = this.b;
                    if (((ru.yandex.taxi.vendor_api.google.b) tstVar).b()) {
                        locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1.L$0 = null;
                        locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1.label = 1;
                        Object c = ((ru.yandex.taxi.vendor_api.google.b) tstVar).c(locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1);
                        this = c;
                    } else {
                        if (activity == null) {
                            LocationRequirementsException.Companion.getClass();
                            throw e.c();
                        }
                        activity.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 113);
                        locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1.L$0 = null;
                        locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1.label = 3;
                        Object n = bvf0.n(new LocationRequirementsResolverImpl$waitLocationServiceEnablingResult$2(this, null), locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1);
                        if (n == obj2) {
                            obj3 = n;
                        }
                        if (obj3 != obj2) {
                            return obj3;
                        }
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj3;
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                this = this;
                return obj3;
            }
        }
        locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1 = new LocationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1(this, continuationImpl);
        Object obj4 = locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationRequirementsResolverImpl$tryResolveLocationServiceAvailability$1.label;
        Object obj32 = zy11.a;
        if (i != 0) {
        }
        return obj32;
    }
}
