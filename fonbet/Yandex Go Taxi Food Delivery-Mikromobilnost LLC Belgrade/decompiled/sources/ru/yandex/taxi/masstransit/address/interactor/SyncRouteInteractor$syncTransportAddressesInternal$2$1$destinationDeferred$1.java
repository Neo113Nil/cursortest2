package ru.yandex.taxi.masstransit.address.interactor;

import defpackage.bvf0;
import defpackage.d0l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uu30;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/go/address/models/Address;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.address.interactor.SyncRouteInteractor$syncTransportAddressesInternal$2$1$destinationDeferred$1", f = "SyncRouteInteractor.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SyncRouteInteractor$syncTransportAddressesInternal$2$1$destinationDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ uu30 $route;
    final /* synthetic */ d0l0 $taxiRoute;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncRouteInteractor$syncTransportAddressesInternal$2$1$destinationDeferred$1(uu30 uu30Var, d0l0 d0l0Var, Continuation continuation, i iVar) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$route = uu30Var;
        this.$taxiRoute = d0l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SyncRouteInteractor$syncTransportAddressesInternal$2$1$destinationDeferred$1(this.$route, this.$taxiRoute, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SyncRouteInteractor$syncTransportAddressesInternal$2$1$destinationDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        i iVar = this.this$0;
        List list = this.$route.b;
        List list2 = this.$taxiRoute.b;
        RoutePointType routePointType = RoutePointType.TRANSPORT_B;
        this.label = 1;
        iVar.getClass();
        Object n = bvf0.n(new SyncRouteInteractor$updateDestinations$2(list2, list, iVar, routePointType, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
