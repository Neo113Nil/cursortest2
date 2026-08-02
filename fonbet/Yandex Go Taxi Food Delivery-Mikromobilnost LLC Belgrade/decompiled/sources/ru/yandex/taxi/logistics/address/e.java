package ru.yandex.taxi.logistics.address;

import defpackage.avj0;
import defpackage.cwh;
import defpackage.fnx0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.Optional;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ cwh b;

    public e(vpr vprVar, cwh cwhVar) {
        this.a = vprVar;
        this.b = cwhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r8 != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1 deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1;
        int i;
        String h;
        cwh cwhVar = this.b;
        zuj0 zuj0Var = cwhVar.c;
        if (continuation instanceof DeliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1) {
            deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1 = (DeliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1) continuation;
            int i2 = deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    fnx0 fnx0Var = (fnx0) ((Optional) obj).orElse(null);
                    if (fnx0Var != null) {
                        if (cwhVar.b.f(fnx0Var.c.b) || jl40.l(fnx0Var.d, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY)) {
                            h = ((avj0) zuj0Var).h(kyh0.summary_source_address_delivery_hint);
                        } else {
                            h = null;
                        }
                    }
                    h = ((avj0) zuj0Var).h(kyh0.address_search_modal_view_from);
                    deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1.L$0 = null;
                    deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1.L$1 = null;
                    deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1.L$2 = null;
                    deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1.L$3 = null;
                    deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(h, deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1 = new DeliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryAddressHintsRepository$sourceFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
