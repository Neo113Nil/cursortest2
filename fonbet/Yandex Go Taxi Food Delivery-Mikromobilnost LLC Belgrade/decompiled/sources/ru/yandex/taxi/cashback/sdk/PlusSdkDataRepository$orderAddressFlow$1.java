package ru.yandex.taxi.cashback.sdk;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.zone.model.Zone;
import defpackage.d0l0;
import defpackage.hkd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo2y0;", "orderHolder", "Lhkd0;", "pinAddress", "<anonymous>", "(Lo2y0;Lhkd0;)Lhkd0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.sdk.PlusSdkDataRepository$orderAddressFlow$1", f = "PlusSdkDataRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PlusSdkDataRepository$orderAddressFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public PlusSdkDataRepository$orderAddressFlow$1() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlusSdkDataRepository$orderAddressFlow$1 plusSdkDataRepository$orderAddressFlow$1 = new PlusSdkDataRepository$orderAddressFlow$1(3, (Continuation) obj3);
        plusSdkDataRepository$orderAddressFlow$1.L$0 = (o2y0) obj;
        plusSdkDataRepository$orderAddressFlow$1.L$1 = (hkd0) obj2;
        return plusSdkDataRepository$orderAddressFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Address h;
        ZoneAddress zoneAddress;
        Zone zone;
        TaxiOrder b;
        o2y0 o2y0Var = (o2y0) this.L$0;
        hkd0 hkd0Var = (hkd0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        zzs zzsVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d0l0 t = (o2y0Var == null || (b = o2y0Var.b()) == null) ? null : b.t();
        String str = (t == null || (zoneAddress = t.a) == null || (zone = zoneAddress.b) == null) ? null : zone.a;
        if (str == null) {
            str = "";
        }
        if (t != null && (h = t.h()) != null) {
            zzsVar = h.B();
        }
        return (str.length() == 0 || zzsVar == null) ? hkd0Var : new hkd0(zzsVar, str);
    }
}
