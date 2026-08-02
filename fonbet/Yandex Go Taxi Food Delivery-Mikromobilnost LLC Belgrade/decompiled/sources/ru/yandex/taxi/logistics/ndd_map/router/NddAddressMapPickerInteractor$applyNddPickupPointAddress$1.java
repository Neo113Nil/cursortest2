package ru.yandex.taxi.logistics.ndd_map.router;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.PlainAddress;
import defpackage.ai50;
import defpackage.dji;
import defpackage.ji50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zh50;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.common_models.object.GeoObjectType;
import ru.yandex.taxi.statebar.controller.NotificatorReporter$MessageType;
import ru.yandex.taxi.statebar.data.LocationErrorReason;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.ndd_map.router.NddAddressMapPickerInteractor$applyNddPickupPointAddress$1", f = "NddAddressMapPickerInteractor.kt", l = {NetworkRequestException.TOO_MANY_REQUESTS}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NddAddressMapPickerInteractor$applyNddPickupPointAddress$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $geoPoint;
    final /* synthetic */ dji $pickupAddress;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NddAddressMapPickerInteractor$applyNddPickupPointAddress$1(dji djiVar, zzs zzsVar, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$pickupAddress = djiVar;
        this.$geoPoint = zzsVar;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NddAddressMapPickerInteractor$applyNddPickupPointAddress$1(this.$pickupAddress, this.$geoPoint, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NddAddressMapPickerInteractor$applyNddPickupPointAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                dji djiVar = this.$pickupAddress;
                String str = djiVar.b;
                String str2 = djiVar.c;
                AddressDTO addressDTO = new AddressDTO(this.$geoPoint, null, null, str, str, null, null, GeoObjectType.DELIVERY_PICKUP_POINT, null, str2, null, null, null, null, null, null, null, null, null, null, null, 33553102);
                PlainAddress.Companion.getClass();
                PlainAddress plainAddress = new PlainAddress(addressDTO);
                pv0 pv0Var = new pv0(plainAddress, null, null, null, null, null, null, null, 1022);
                e eVar = this.this$0;
                ai50 ai50Var = eVar.c;
                boolean b = eVar.h.b.b();
                String plainAddress2 = plainAddress.toString();
                ji50 ji50Var = this.this$0.a;
                ai50Var.getClass();
                ai50Var.c(new zh50(ai50Var, b, plainAddress2, ji50Var, 0), "SuperApp.Delivery.SelectedStationOnMap");
                this.this$0.h.b(plainAddress, this.$geoPoint);
                this.this$0.h.a(this.$geoPoint);
                e eVar2 = this.this$0;
                eVar2.C.a(LocationErrorReason.LOCATION_MESSAGE_REASON);
                ru.yandex.taxi.statebar.controller.a aVar = eVar2.D;
                aVar.q = true;
                if (aVar.e() && !aVar.s) {
                    aVar.k.a("improper", NotificatorReporter$MessageType.NETWORK_ERROR);
                }
                aVar.f();
                e eVar3 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (eVar3.b(pv0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        } catch (Throwable th) {
            this.this$0.e(th);
            this.this$0.e.b(AddressResolveRepository.State.ERROR);
        }
        return zy11.a;
    }
}
