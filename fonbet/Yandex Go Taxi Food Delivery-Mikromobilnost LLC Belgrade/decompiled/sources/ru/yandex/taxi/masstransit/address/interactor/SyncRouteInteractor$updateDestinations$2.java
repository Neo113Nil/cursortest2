package ru.yandex.taxi.masstransit.address.interactor;

import com.yandex.go.address.models.Address;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/go/address/models/Address;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.address.interactor.SyncRouteInteractor$updateDestinations$2", f = "SyncRouteInteractor.kt", l = {227}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SyncRouteInteractor$updateDestinations$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<Address> $currentDestinations;
    final /* synthetic */ List<Address> $targetDestinations;
    final /* synthetic */ RoutePointType $type;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncRouteInteractor$updateDestinations$2(List list, List list2, i iVar, RoutePointType routePointType, Continuation continuation) {
        super(2, continuation);
        this.$targetDestinations = list;
        this.$currentDestinations = list2;
        this.this$0 = iVar;
        this.$type = routePointType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SyncRouteInteractor$updateDestinations$2 syncRouteInteractor$updateDestinations$2 = new SyncRouteInteractor$updateDestinations$2(this.$targetDestinations, this.$currentDestinations, this.this$0, this.$type, continuation);
        syncRouteInteractor$updateDestinations$2.L$0 = obj;
        return syncRouteInteractor$updateDestinations$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SyncRouteInteractor$updateDestinations$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        qoh h;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<Address> list = this.$targetDestinations;
            List<Address> list2 = this.$currentDestinations;
            i iVar = this.this$0;
            RoutePointType routePointType = this.$type;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (Address address : list) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    Address address2 = (Address) obj2;
                    if (address2.getOriginPoint() != null && jl40.l(address2.getOriginPoint(), address.getOriginPoint())) {
                        break;
                    }
                }
                Address address3 = (Address) obj2;
                if (address3 != null) {
                    h = tje.h(tseVar, null, null, new SyncRouteInteractor$updateDestinations$2$1$1(address3, null), 3);
                } else {
                    zzs originPoint = address.getOriginPoint();
                    if (originPoint == null) {
                        originPoint = address.B();
                    }
                    h = tje.h(tseVar, null, null, new SyncRouteInteractor$updateDestinations$2$1$2(iVar, originPoint, routePointType, null), 3);
                }
                arrayList.add(h);
            }
            this.L$0 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return kotlin.collections.a.M((Iterable) obj);
    }
}
