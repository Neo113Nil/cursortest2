package ru.yandex.taxi.locationsdk.locationprovider.android.gms;

import com.google.android.gms.location.LocationRequest;
import defpackage.eqs;
import defpackage.jo0;
import defpackage.k991;
import defpackage.mvg;
import defpackage.nut;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Landroid/location/Location;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.locationprovider.android.gms.GoogleMobileServicesClientAdapterKt$requestLocationUpdates$5", f = "GoogleMobileServicesClientAdapter.kt", l = {HProv.PP_EXPORT_CSP}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class GoogleMobileServicesClientAdapterKt$requestLocationUpdates$5 extends SuspendLambda implements wls {
    final /* synthetic */ Executor $executor;
    final /* synthetic */ sls $onLocationUpdatesRemoved;
    final /* synthetic */ sls $onLocationUpdatesRequested;
    final /* synthetic */ tls $onRemoveLocationUpdatesFailure;
    final /* synthetic */ tls $onRequestLocationUpdatesFailureClose;
    final /* synthetic */ LocationRequest $request;
    final /* synthetic */ eqs $this_requestLocationUpdates;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleMobileServicesClientAdapterKt$requestLocationUpdates$5(eqs eqsVar, LocationRequest locationRequest, Executor executor, sls slsVar, tls tlsVar, tls tlsVar2, sls slsVar2, Continuation continuation) {
        super(2, continuation);
        this.$this_requestLocationUpdates = eqsVar;
        this.$request = locationRequest;
        this.$executor = executor;
        this.$onLocationUpdatesRequested = slsVar;
        this.$onRequestLocationUpdatesFailureClose = tlsVar;
        this.$onRemoveLocationUpdatesFailure = tlsVar2;
        this.$onLocationUpdatesRemoved = slsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GoogleMobileServicesClientAdapterKt$requestLocationUpdates$5 googleMobileServicesClientAdapterKt$requestLocationUpdates$5 = new GoogleMobileServicesClientAdapterKt$requestLocationUpdates$5(this.$this_requestLocationUpdates, this.$request, this.$executor, this.$onLocationUpdatesRequested, this.$onRequestLocationUpdatesFailureClose, this.$onRemoveLocationUpdatesFailure, this.$onLocationUpdatesRemoved, continuation);
        googleMobileServicesClientAdapterKt$requestLocationUpdates$5.L$0 = obj;
        return googleMobileServicesClientAdapterKt$requestLocationUpdates$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GoogleMobileServicesClientAdapterKt$requestLocationUpdates$5) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
            b.b(obj);
            return zy11Var;
        }
        b.b(obj);
        eqs eqsVar = this.$this_requestLocationUpdates;
        nut nutVar = new nut(new GoogleMobileServicesClientAdapterKt$requestLocationUpdates$5$listener$1(1, y6f0Var, kotlinx.coroutines.channels.b.class, "trySendBlocking", "trySendBlocking(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Ljava/lang/Object;", 9));
        LocationRequest locationRequest = this.$request;
        Executor executor = this.$executor;
        sls slsVar = this.$onLocationUpdatesRequested;
        try {
            ((k991) eqsVar).h(locationRequest, executor, nutVar);
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
        jo0 jo0Var = new jo0(y6f0Var, this.$onRemoveLocationUpdatesFailure, eqsVar, nutVar, this.$onLocationUpdatesRemoved);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        return kotlinx.coroutines.channels.b.a(y6f0Var, jo0Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
