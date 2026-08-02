package ru.yandex.taxi.logistics.ndd_flow;

import defpackage.b8r;
import defpackage.kb5;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.pei;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ pei b;

    public a(vpr vprVar, pei peiVar) {
        this.a = vprVar;
        this.b = peiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1 deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DeliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1) {
            deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1 = (DeliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1) continuation;
            int i2 = deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pei peiVar = this.b;
                    mi31 d = b8r.d(peiVar.a, ((kb5) obj).b, null, 6);
                    Boolean valueOf = Boolean.valueOf(d != null ? peiVar.a(d.a) : false);
                    deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1.L$0 = null;
                    deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1.L$1 = null;
                    deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1.L$2 = null;
                    deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1.L$3 = null;
                    deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1 = new DeliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryNddFlowDelegateImpl$observeNddOrderFlag$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
