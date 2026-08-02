package ru.yandex.taxi.delivery;

import com.yandex.delivery.mapper.model.PointType;
import com.yandex.go.address.models.Address;
import defpackage.a0t;
import defpackage.d0l0;
import defpackage.ny61;
import defpackage.oo0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryUserAddressInteractor$special$$inlined$map$1$2$1 deliveryUserAddressInteractor$special$$inlined$map$1$2$1;
        int i;
        oo0 oo0Var;
        if (continuation instanceof DeliveryUserAddressInteractor$special$$inlined$map$1$2$1) {
            deliveryUserAddressInteractor$special$$inlined$map$1$2$1 = (DeliveryUserAddressInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = deliveryUserAddressInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryUserAddressInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryUserAddressInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryUserAddressInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Address h = ((d0l0) obj).h();
                    if (h != null) {
                        oo0Var = new oo0(h.D1(), (PointType) null, (String) null, (String) null, (String) null, new a0t(h.B().a, h.B().b, h.B().c), (String) null, 222);
                    } else {
                        oo0Var = null;
                    }
                    deliveryUserAddressInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    deliveryUserAddressInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    deliveryUserAddressInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    deliveryUserAddressInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    deliveryUserAddressInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(oo0Var, deliveryUserAddressInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliveryUserAddressInteractor$special$$inlined$map$1$2$1 = new DeliveryUserAddressInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveryUserAddressInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryUserAddressInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
