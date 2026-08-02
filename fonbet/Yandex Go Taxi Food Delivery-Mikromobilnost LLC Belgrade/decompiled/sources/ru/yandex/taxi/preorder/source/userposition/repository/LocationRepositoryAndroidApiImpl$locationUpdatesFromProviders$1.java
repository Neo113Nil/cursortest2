package ru.yandex.taxi.preorder.source.userposition.repository;

import android.location.LocationListener;
import android.location.LocationManager;
import defpackage.hst;
import defpackage.jst;
import defpackage.l2z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Landroid/location/Location;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.repository.LocationRepositoryAndroidApiImpl$locationUpdatesFromProviders$1", f = "LocationRepositoryAndroidApiImpl.kt", l = {130}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LocationRepositoryAndroidApiImpl$locationUpdatesFromProviders$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $turnOnGps;
    final /* synthetic */ boolean $turnOnNetwork;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRepositoryAndroidApiImpl$locationUpdatesFromProviders$1(boolean z, c cVar, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.$turnOnGps = z;
        this.this$0 = cVar;
        this.$turnOnNetwork = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocationRepositoryAndroidApiImpl$locationUpdatesFromProviders$1 locationRepositoryAndroidApiImpl$locationUpdatesFromProviders$1 = new LocationRepositoryAndroidApiImpl$locationUpdatesFromProviders$1(this.$turnOnGps, this.this$0, this.$turnOnNetwork, continuation);
        locationRepositoryAndroidApiImpl$locationUpdatesFromProviders$1.L$0 = obj;
        return locationRepositoryAndroidApiImpl$locationUpdatesFromProviders$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationRepositoryAndroidApiImpl$locationUpdatesFromProviders$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            LocationListener a = ru.yandex.taxi.preorder.source.userposition.misc.a.a(y6f0Var);
            if (this.$turnOnGps && this.this$0.b.isProviderEnabled("gps")) {
                c cVar = this.this$0;
                LocationManager locationManager = cVar.b;
                if (cVar.e.F().h()) {
                    hst hstVar = jst.e;
                    int i3 = this.this$0.e.F().c;
                    hstVar.getClass();
                    j2 = this.this$0.e.F().c;
                } else {
                    jst.e.getClass();
                    j2 = 5000;
                }
                locationManager.requestLocationUpdates("gps", j2, 10.0f, a);
            }
            if (this.$turnOnNetwork && this.this$0.b.isProviderEnabled("network")) {
                c cVar2 = this.this$0;
                LocationManager locationManager2 = cVar2.b;
                if (cVar2.e.F().h()) {
                    hst hstVar2 = jst.e;
                    int i4 = this.this$0.e.F().d;
                    hstVar2.getClass();
                    j = this.this$0.e.F().d;
                } else {
                    jst.e.getClass();
                    j = 15000;
                }
                locationManager2.requestLocationUpdates("network", j, 10.0f, a);
            }
            l2z l2zVar = new l2z(i2, this.this$0, a);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, l2zVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
