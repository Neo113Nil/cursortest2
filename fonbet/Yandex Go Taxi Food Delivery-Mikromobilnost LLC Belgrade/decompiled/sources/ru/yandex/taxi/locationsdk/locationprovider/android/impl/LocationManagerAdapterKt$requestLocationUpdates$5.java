package ru.yandex.taxi.locationsdk.locationprovider.android.impl;

import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import androidx.core.location.LocationListenerCompat;
import androidx.core.location.j;
import defpackage.hn2;
import defpackage.mcz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Landroid/location/Location;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.locationprovider.android.impl.LocationManagerAdapterKt$requestLocationUpdates$5", f = "LocationManagerAdapter.kt", l = {252}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class LocationManagerAdapterKt$requestLocationUpdates$5 extends SuspendLambda implements wls {
    final /* synthetic */ Executor $executor;
    final /* synthetic */ sls $onLocationUpdatesRemoved;
    final /* synthetic */ sls $onLocationUpdatesRequested;
    final /* synthetic */ tls $onRemoveLocationUpdatesFailure;
    final /* synthetic */ tls $onRequestLocationUpdatesFailureClose;
    final /* synthetic */ String $provider;
    final /* synthetic */ mcz $request;
    final /* synthetic */ LocationManager $this_requestLocationUpdates;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationManagerAdapterKt$requestLocationUpdates$5(LocationManager locationManager, String str, mcz mczVar, Executor executor, sls slsVar, tls tlsVar, tls tlsVar2, sls slsVar2, Continuation continuation) {
        super(2, continuation);
        this.$this_requestLocationUpdates = locationManager;
        this.$provider = str;
        this.$request = mczVar;
        this.$executor = executor;
        this.$onLocationUpdatesRequested = slsVar;
        this.$onRequestLocationUpdatesFailureClose = tlsVar;
        this.$onRemoveLocationUpdatesFailure = tlsVar2;
        this.$onLocationUpdatesRemoved = slsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocationManagerAdapterKt$requestLocationUpdates$5 locationManagerAdapterKt$requestLocationUpdates$5 = new LocationManagerAdapterKt$requestLocationUpdates$5(this.$this_requestLocationUpdates, this.$provider, this.$request, this.$executor, this.$onLocationUpdatesRequested, this.$onRequestLocationUpdatesFailureClose, this.$onRemoveLocationUpdatesFailure, this.$onLocationUpdatesRemoved, continuation);
        locationManagerAdapterKt$requestLocationUpdates$5.L$0 = obj;
        return locationManagerAdapterKt$requestLocationUpdates$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationManagerAdapterKt$requestLocationUpdates$5) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        LocationManager locationManager = this.$this_requestLocationUpdates;
        final LocationManagerAdapterKt$requestLocationUpdates$5$listener$1 locationManagerAdapterKt$requestLocationUpdates$5$listener$1 = new LocationManagerAdapterKt$requestLocationUpdates$5$listener$1(1, y6f0Var, kotlinx.coroutines.channels.b.class, "trySendBlocking", "trySendBlocking(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Ljava/lang/Object;", 9);
        LocationListenerCompat locationListenerCompat = new LocationListenerCompat() { // from class: ru.yandex.taxi.locationsdk.locationprovider.android.impl.LocationManagerAdapterKt$sam$androidx_core_location_LocationListenerCompat$0
            @Override // androidx.core.location.LocationListenerCompat, android.location.LocationListener
            public /* bridge */ /* synthetic */ void onFlushComplete(int i2) {
                super.onFlushComplete(i2);
            }

            @Override // android.location.LocationListener
            public final /* synthetic */ void onLocationChanged(Location location) {
                tls.this.invoke(location);
            }

            @Override // androidx.core.location.LocationListenerCompat, android.location.LocationListener
            public /* bridge */ /* synthetic */ void onProviderDisabled(String str) {
                super.onProviderDisabled(str);
            }

            @Override // androidx.core.location.LocationListenerCompat, android.location.LocationListener
            public /* bridge */ /* synthetic */ void onProviderEnabled(String str) {
                super.onProviderEnabled(str);
            }

            @Override // androidx.core.location.LocationListenerCompat, android.location.LocationListener
            public /* bridge */ /* synthetic */ void onStatusChanged(String str, int i2, Bundle bundle) {
                super.onStatusChanged(str, i2, bundle);
            }

            @Override // androidx.core.location.LocationListenerCompat, android.location.LocationListener
            public /* bridge */ /* synthetic */ void onLocationChanged(List list) {
                super.onLocationChanged((List<Location>) list);
            }
        };
        String str = this.$provider;
        mcz mczVar = this.$request;
        Executor executor = this.$executor;
        sls slsVar = this.$onLocationUpdatesRequested;
        try {
            j.c(locationManager, str, mczVar, executor, locationListenerCompat);
            slsVar.invoke();
            failure = zy11Var;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        tls tlsVar = this.$onRequestLocationUpdatesFailureClose;
        Throwable a = Result.a(failure);
        if (a != null && ((Boolean) tlsVar.invoke(a)).booleanValue()) {
            x6f0 x6f0Var = (x6f0) y6f0Var;
            x6f0Var.getClass();
            x6f0Var.l(a);
        }
        hn2 hn2Var = new hn2(y6f0Var, this.$onRemoveLocationUpdatesFailure, locationManager, locationListenerCompat, this.$onLocationUpdatesRemoved);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        return kotlinx.coroutines.channels.b.a(y6f0Var, hn2Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
