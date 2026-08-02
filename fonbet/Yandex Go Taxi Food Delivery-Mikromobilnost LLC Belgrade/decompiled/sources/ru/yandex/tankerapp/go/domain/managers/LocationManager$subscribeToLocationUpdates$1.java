package ru.yandex.tankerapp.go.domain.managers;

import defpackage.esa0;
import defpackage.icx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.yeo;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.tankerapp.go.sdk.location.CartechPosition;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/tankerapp/go/sdk/location/CartechPosition;", "it", "Lzy11;", "<anonymous>", "(Lru/yandex/tankerapp/go/sdk/location/CartechPosition;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.tankerapp.go.domain.managers.LocationManager$subscribeToLocationUpdates$1", f = "LocationManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class LocationManager$subscribeToLocationUpdates$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationManager$subscribeToLocationUpdates$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocationManager$subscribeToLocationUpdates$1 locationManager$subscribeToLocationUpdates$1 = new LocationManager$subscribeToLocationUpdates$1(this.this$0, continuation);
        locationManager$subscribeToLocationUpdates$1.L$0 = obj;
        return locationManager$subscribeToLocationUpdates$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LocationManager$subscribeToLocationUpdates$1 locationManager$subscribeToLocationUpdates$1 = (LocationManager$subscribeToLocationUpdates$1) create((CartechPosition) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        locationManager$subscribeToLocationUpdates$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CartechPosition cartechPosition = (CartechPosition) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        esa0 esa0Var = this.this$0.w;
        if (esa0Var != null) {
            Map map = (Map) icx.a().c(Map.class, icx.a().h(cartechPosition));
            yeo yeoVar = esa0Var.b;
            if (yeoVar != null) {
                yeoVar.success(map);
            } else {
                esa0Var.a = map;
            }
        }
        return zy11.a;
    }
}
