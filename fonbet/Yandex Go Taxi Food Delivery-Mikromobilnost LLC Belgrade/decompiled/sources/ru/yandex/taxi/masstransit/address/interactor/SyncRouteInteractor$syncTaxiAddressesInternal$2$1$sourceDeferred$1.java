package ru.yandex.taxi.masstransit.address.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/address/models/ZoneAddress;", "<anonymous>", "(Ltse;)Lcom/yandex/go/address/models/ZoneAddress;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.address.interactor.SyncRouteInteractor$syncTaxiAddressesInternal$2$1$sourceDeferred$1", f = "SyncRouteInteractor.kt", l = {176}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SyncRouteInteractor$syncTaxiAddressesInternal$2$1$sourceDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ ZoneAddress $source;
    final /* synthetic */ ZoneAddress $taxiSource;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncRouteInteractor$syncTaxiAddressesInternal$2$1$sourceDeferred$1(ZoneAddress zoneAddress, i iVar, ZoneAddress zoneAddress2, Continuation continuation) {
        super(2, continuation);
        this.$source = zoneAddress;
        this.this$0 = iVar;
        this.$taxiSource = zoneAddress2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SyncRouteInteractor$syncTaxiAddressesInternal$2$1$sourceDeferred$1(this.$source, this.this$0, this.$taxiSource, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SyncRouteInteractor$syncTaxiAddressesInternal$2$1$sourceDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ZoneAddress zoneAddress = this.$source;
            if (zoneAddress != null) {
                i iVar = this.this$0;
                Address address = zoneAddress.a;
                ZoneAddress zoneAddress2 = this.$taxiSource;
                if (i.a(iVar, address, zoneAddress2 != null ? zoneAddress2.a : null)) {
                    return this.$taxiSource;
                }
                i iVar2 = this.this$0;
                Address address2 = this.$source.a;
                RoutePointType routePointType = RoutePointType.POINT_A;
                this.label = 1;
                obj = i.b(iVar2, address2, routePointType, false, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return null;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Address address3 = (Address) obj;
        if (address3 != null) {
            return new ZoneAddress(address3, this.$source.b);
        }
        return null;
    }
}
