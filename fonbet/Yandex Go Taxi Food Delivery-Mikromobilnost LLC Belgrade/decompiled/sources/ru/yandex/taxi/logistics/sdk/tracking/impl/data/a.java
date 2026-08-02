package ru.yandex.taxi.logistics.sdk.tracking.impl.data;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.ov7;
import defpackage.puh;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ov7 b;

    public a(vpr vprVar, ov7 ov7Var) {
        this.a = vprVar;
        this.b = ov7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1 cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof CancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1) {
            cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1 = (CancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1) continuation;
            int i2 = cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : (List) obj) {
                        if (obj4 instanceof puh) {
                            arrayList.add(obj4);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((puh) obj2).a, this.b.a)) {
                            break;
                        }
                    }
                    cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1.L$0 = null;
                    cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1.L$1 = null;
                    cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1.L$2 = null;
                    cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1.L$3 = null;
                    cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1.I$0 = 0;
                    cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1 = new CancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelDeliveryRepository$getDeliveryOrderStatusFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
