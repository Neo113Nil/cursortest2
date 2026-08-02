package ru.yandex.taxi.preorder.source.userposition.repository;

import com.yandex.mapkit.location.LocationManager;
import com.yandex.mapkit.location.Purpose;
import com.yandex.mapkit.location.SubscriptionSettings;
import com.yandex.mapkit.location.UseInBackground;
import defpackage.dl00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t7j;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Landroid/location/Location;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.repository.LocationRepositoryMapKitImpl$getLocationChangeListener$1", f = "LocationRepositoryMapKitImpl.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class LocationRepositoryMapKitImpl$getLocationChangeListener$1 extends SuspendLambda implements wls {
    final /* synthetic */ LocationManager $locationManager;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationRepositoryMapKitImpl$getLocationChangeListener$1(LocationManager locationManager, f fVar, Continuation continuation) {
        super(2, continuation);
        this.$locationManager = locationManager;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocationRepositoryMapKitImpl$getLocationChangeListener$1 locationRepositoryMapKitImpl$getLocationChangeListener$1 = new LocationRepositoryMapKitImpl$getLocationChangeListener$1(this.$locationManager, this.this$0, continuation);
        locationRepositoryMapKitImpl$getLocationChangeListener$1.L$0 = obj;
        return locationRepositoryMapKitImpl$getLocationChangeListener$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationRepositoryMapKitImpl$getLocationChangeListener$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            dl00 dl00Var = new dl00(y6f0Var);
            this.$locationManager.subscribeForLocationUpdates(new SubscriptionSettings(UseInBackground.DISALLOW, Purpose.GENERAL), dl00Var);
            t7j t7jVar = new t7j(28, this.$locationManager, dl00Var, this.this$0);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, t7jVar, this) == coroutineSingletons) {
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
