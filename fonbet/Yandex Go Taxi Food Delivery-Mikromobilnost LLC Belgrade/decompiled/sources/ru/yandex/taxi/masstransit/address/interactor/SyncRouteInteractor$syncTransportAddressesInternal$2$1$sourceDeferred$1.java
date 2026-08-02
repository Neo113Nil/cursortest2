package ru.yandex.taxi.masstransit.address.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tse;
import defpackage.uu30;
import defpackage.wls;
import defpackage.zgc0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/address/models/ZoneAddress;", "<anonymous>", "(Ltse;)Lcom/yandex/go/address/models/ZoneAddress;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.address.interactor.SyncRouteInteractor$syncTransportAddressesInternal$2$1$sourceDeferred$1", f = "SyncRouteInteractor.kt", l = {HProv.PP_INFO, HProv.PP_SECURITY_LEVEL, HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SyncRouteInteractor$syncTransportAddressesInternal$2$1$sourceDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ uu30 $route;
    final /* synthetic */ ZoneAddress $source;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncRouteInteractor$syncTransportAddressesInternal$2$1$sourceDeferred$1(ZoneAddress zoneAddress, i iVar, uu30 uu30Var, Continuation continuation) {
        super(2, continuation);
        this.$source = zoneAddress;
        this.this$0 = iVar;
        this.$route = uu30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SyncRouteInteractor$syncTransportAddressesInternal$2$1$sourceDeferred$1(this.$source, this.this$0, this.$route, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SyncRouteInteractor$syncTransportAddressesInternal$2$1$sourceDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
    
        if (r10 != r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0066, code lost:
    
        if (r10 == r0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zgc0 zgc0Var;
        i iVar;
        boolean z;
        Address address;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ZoneAddress zoneAddress = this.$source;
            if (zoneAddress != null && (address = zoneAddress.a) != null) {
                i iVar2 = this.this$0;
                ZoneAddress zoneAddress2 = this.$route.a;
                if (i.a(iVar2, address, zoneAddress2 != null ? zoneAddress2.a : null)) {
                    return this.$route.a;
                }
            }
            ZoneAddress zoneAddress3 = this.$source;
            i iVar3 = this.this$0;
            if (zoneAddress3 != null) {
                Address address2 = zoneAddress3.a;
                RoutePointType routePointType = RoutePointType.TRANSPORT_A;
                z = this.$route.a == null;
                this.label = 1;
                obj = i.b(iVar3, address2, routePointType, z, this);
            } else {
                zgc0 zgc0Var2 = PlainAddress.Companion;
                po21 po21Var = iVar3.f;
                this.L$0 = iVar3;
                this.L$1 = zgc0Var2;
                this.label = 2;
                Object g = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).g(this);
                if (g != coroutineSingletons) {
                    zgc0Var = zgc0Var2;
                    obj = g;
                    iVar = iVar3;
                    zzs a = ((mo21) obj).a();
                    zgc0Var.getClass();
                    PlainAddress a2 = zgc0.a(a);
                    RoutePointType routePointType2 = RoutePointType.TRANSPORT_A;
                    if (this.$route.a == null) {
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    obj = i.b(iVar, a2, routePointType2, z, this);
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            Address address3 = (Address) obj;
            if (address3 != null) {
                return new ZoneAddress(address3, this.$source.b);
            }
            return null;
        }
        if (i != 2) {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            Address address4 = (Address) obj;
            if (address4 != null) {
                return new ZoneAddress(address4, this.this$0.g.b());
            }
            return null;
        }
        zgc0Var = (zgc0) this.L$1;
        iVar = (i) this.L$0;
        kotlin.b.b(obj);
        zzs a3 = ((mo21) obj).a();
        zgc0Var.getClass();
        PlainAddress a22 = zgc0.a(a3);
        RoutePointType routePointType22 = RoutePointType.TRANSPORT_A;
        z = this.$route.a == null;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        obj = i.b(iVar, a22, routePointType22, z, this);
    }
}
