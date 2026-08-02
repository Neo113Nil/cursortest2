package ru.yandex.taxi.locationsdk.locationprovider.android.gms;

import com.google.android.gms.location.LocationRequest;
import defpackage.ab2;
import defpackage.eqs;
import defpackage.hya1;
import defpackage.kut;
import defpackage.lut;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.rcz;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.ykj;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.locationprovider.android.gms.GoogleMobileServicesClientAdapter$requestLocationUpdates$$inlined$flatMapLatest$1", f = "GoogleMobileServicesClientAdapter.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class GoogleMobileServicesClientAdapter$requestLocationUpdates$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ ab2 $request$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleMobileServicesClientAdapter$requestLocationUpdates$$inlined$flatMapLatest$1(Continuation continuation, ab2 ab2Var, a aVar) {
        super(3, continuation);
        this.$request$inlined = ab2Var;
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GoogleMobileServicesClientAdapter$requestLocationUpdates$$inlined$flatMapLatest$1 googleMobileServicesClientAdapter$requestLocationUpdates$$inlined$flatMapLatest$1 = new GoogleMobileServicesClientAdapter$requestLocationUpdates$$inlined$flatMapLatest$1((Continuation) obj3, this.$request$inlined, this.this$0);
        googleMobileServicesClientAdapter$requestLocationUpdates$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        googleMobileServicesClientAdapter$requestLocationUpdates$$inlined$flatMapLatest$1.L$1 = obj2;
        return googleMobileServicesClientAdapter$requestLocationUpdates$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            eqs eqsVar = (eqs) this.L$1;
            Pair pair = new Pair("request", this.$request$inlined.toString());
            a aVar = this.this$0;
            tpr tprVar = pvn.a;
            if (eqsVar == null) {
                ((rcz) aVar.b).b("GoogleMobileServicesClientAdapter", new RuntimeException("FusedClient not available"), new Pair[0]);
            } else {
                try {
                    failure = hya1.a(this.$request$inlined);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    ((rcz) this.this$0.b).b("GoogleMobileServicesClientAdapter", a, pair);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                LocationRequest locationRequest = (LocationRequest) failure;
                if (locationRequest != null) {
                    ykj ykjVar = ykj.c;
                    a aVar2 = this.this$0;
                    tprVar = e.g(new GoogleMobileServicesClientAdapterKt$requestLocationUpdates$5(eqsVar, locationRequest, ykjVar, new kut(aVar2, pair, 0), new lut(aVar2, pair, 0), new lut(aVar2, pair, 1), new kut(aVar2, pair, 1), null));
                }
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(tprVar, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
