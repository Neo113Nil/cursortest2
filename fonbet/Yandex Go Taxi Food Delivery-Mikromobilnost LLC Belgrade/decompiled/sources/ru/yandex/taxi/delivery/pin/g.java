package ru.yandex.taxi.delivery.pin;

import defpackage.ati;
import defpackage.fji;
import defpackage.fnx0;
import defpackage.jl40;
import defpackage.mji;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.ybo;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.DeliveryPinType;

/* loaded from: classes5.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k b;
    public final /* synthetic */ int c;

    public g(vpr vprVar, k kVar, int i) {
        this.a = vprVar;
        this.b = kVar;
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d0, code lost:
    
        if (r2.emit(r12, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1 deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        fji fjiVar;
        Object obj2;
        vpr vprVar2;
        if (continuation instanceof DeliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1) {
            deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1 = (DeliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1) continuation;
            int i2 = deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    fnx0 fnx0Var = (fnx0) obj;
                    ati atiVar = fnx0Var.c.Z;
                    vprVar = this.a;
                    if (atiVar != null) {
                        Iterator it = atiVar.c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            mji mjiVar = (mji) obj2;
                            if (mjiVar.a == DeliveryPinType.ROUTE_DESTINATION && jl40.l(mjiVar.b, Boolean.TRUE)) {
                                break;
                            }
                        }
                        mji mjiVar2 = (mji) obj2;
                        if (mjiVar2 != null) {
                            ybo yboVar = fnx0Var.c.h;
                            Integer num = new Integer(this.c);
                            deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$0 = null;
                            deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$1 = null;
                            deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$2 = null;
                            deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$3 = null;
                            deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$4 = vprVar;
                            deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$5 = null;
                            deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$6 = null;
                            deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$7 = null;
                            deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.label = 1;
                            obj3 = this.b.c(mjiVar2, yboVar, num, deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1);
                            if (obj3 != coroutineSingletons) {
                                vprVar2 = vprVar;
                            }
                            return coroutineSingletons;
                        }
                    }
                    fjiVar = null;
                    deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$0 = null;
                    deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$1 = null;
                    deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$2 = null;
                    deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$3 = null;
                    deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$4 = null;
                    deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$5 = null;
                    deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$6 = null;
                    deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$7 = null;
                    deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj3);
                }
                fjiVar = (fji) obj3;
                vprVar = vprVar2;
                deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$0 = null;
                deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$1 = null;
                deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$2 = null;
                deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$3 = null;
                deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$4 = null;
                deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$5 = null;
                deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$6 = null;
                deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$7 = null;
                deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1 = new DeliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        fjiVar = (fji) obj32;
        vprVar = vprVar2;
        deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$0 = null;
        deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$1 = null;
        deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$2 = null;
        deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$3 = null;
        deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$4 = null;
        deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$5 = null;
        deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$6 = null;
        deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.L$7 = null;
        deliveryPinInteractor$deliveryRouteDestinationPinFlow$$inlined$map$1$2$1.label = 2;
    }
}
