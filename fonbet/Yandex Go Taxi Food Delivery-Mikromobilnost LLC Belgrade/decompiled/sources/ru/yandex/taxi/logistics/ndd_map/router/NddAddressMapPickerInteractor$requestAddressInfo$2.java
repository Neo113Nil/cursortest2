package ru.yandex.taxi.logistics.ndd_map.router;

import defpackage.ai50;
import defpackage.ji50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.wls;
import defpackage.zh50;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.statebar.controller.NotificatorReporter$MessageType;
import ru.yandex.taxi.statebar.data.LocationErrorReason;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpv0;", "addressInfo", "Lzy11;", "<anonymous>", "(Lpv0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.ndd_map.router.NddAddressMapPickerInteractor$requestAddressInfo$2", f = "NddAddressMapPickerInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NddAddressMapPickerInteractor$requestAddressInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $pvzGeoPoint;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NddAddressMapPickerInteractor$requestAddressInfo$2(e eVar, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$pvzGeoPoint = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NddAddressMapPickerInteractor$requestAddressInfo$2 nddAddressMapPickerInteractor$requestAddressInfo$2 = new NddAddressMapPickerInteractor$requestAddressInfo$2(this.this$0, this.$pvzGeoPoint, continuation);
        nddAddressMapPickerInteractor$requestAddressInfo$2.L$0 = obj;
        return nddAddressMapPickerInteractor$requestAddressInfo$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NddAddressMapPickerInteractor$requestAddressInfo$2 nddAddressMapPickerInteractor$requestAddressInfo$2 = (NddAddressMapPickerInteractor$requestAddressInfo$2) create((pv0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        nddAddressMapPickerInteractor$requestAddressInfo$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pv0 pv0Var = (pv0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        ai50 ai50Var = eVar.c;
        boolean b = eVar.h.b.b();
        String obj2 = pv0Var.a.toString();
        ji50 ji50Var = this.this$0.a;
        ai50Var.getClass();
        ai50Var.c(new zh50(ai50Var, b, obj2, ji50Var, 0), "SuperApp.Delivery.SelectedStationOnMap");
        this.this$0.h.b(pv0Var.a, this.$pvzGeoPoint);
        this.this$0.h.a(this.$pvzGeoPoint);
        e eVar2 = this.this$0;
        eVar2.C.a(LocationErrorReason.LOCATION_MESSAGE_REASON);
        ru.yandex.taxi.statebar.controller.a aVar = eVar2.D;
        aVar.q = true;
        if (aVar.e() && !aVar.s) {
            aVar.k.a("improper", NotificatorReporter$MessageType.NETWORK_ERROR);
        }
        aVar.f();
        return zy11.a;
    }
}
