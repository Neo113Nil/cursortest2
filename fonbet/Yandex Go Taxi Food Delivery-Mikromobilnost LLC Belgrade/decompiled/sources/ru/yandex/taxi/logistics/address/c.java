package ru.yandex.taxi.logistics.address;

import defpackage.avj0;
import defpackage.cwh;
import defpackage.fnx0;
import defpackage.hv0;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.experiments.k;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ cwh b;

    public c(vpr vprVar, cwh cwhVar) {
        this.a = vprVar;
        this.b = cwhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1 deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1;
        int i;
        String h;
        String str;
        cwh cwhVar = this.b;
        zuj0 zuj0Var = cwhVar.c;
        k kVar = cwhVar.b;
        if (continuation instanceof DeliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1) {
            deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1 = (DeliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1) continuation;
            int i2 = deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (kVar.f(((fnx0) obj).c.b)) {
                        pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) cwhVar.a).m();
                        h = (m == null || (str = m.b) == null) ? "" : kVar.d(str);
                    } else {
                        h = ((avj0) zuj0Var).h(kyh0.summary_destination_address_delivery_hint);
                    }
                    hv0 hv0Var = new hv0(h, ((avj0) zuj0Var).h(kyh0.summary_source_address_delivery_hint));
                    deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.L$0 = null;
                    deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.L$1 = null;
                    deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.L$2 = null;
                    deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.L$3 = null;
                    deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(hv0Var, deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1 = new DeliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryAddressHintsRepository$hintsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
