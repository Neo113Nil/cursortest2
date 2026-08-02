package ru.yandex.taxi.superapp.orders.multi.tracking;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zy70;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ zy70 b;

    public b(jqr jqrVar, zy70 zy70Var) {
        this.a = jqrVar;
        this.b = zy70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderListOverlayRecenter$start$$inlined$mapNotNull$1$1 orderListOverlayRecenter$start$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof OrderListOverlayRecenter$start$$inlined$mapNotNull$1$1) {
            orderListOverlayRecenter$start$$inlined$mapNotNull$1$1 = (OrderListOverlayRecenter$start$$inlined$mapNotNull$1$1) continuation;
            int i2 = orderListOverlayRecenter$start$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderListOverlayRecenter$start$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderListOverlayRecenter$start$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderListOverlayRecenter$start$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    orderListOverlayRecenter$start$$inlined$mapNotNull$1$1.L$0 = null;
                    orderListOverlayRecenter$start$$inlined$mapNotNull$1$1.L$1 = null;
                    orderListOverlayRecenter$start$$inlined$mapNotNull$1$1.L$2 = null;
                    orderListOverlayRecenter$start$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(aVar, orderListOverlayRecenter$start$$inlined$mapNotNull$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        orderListOverlayRecenter$start$$inlined$mapNotNull$1$1 = new OrderListOverlayRecenter$start$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = orderListOverlayRecenter$start$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderListOverlayRecenter$start$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
