package ru.yandex.taxi.superapp.orders.multi.tracking;

import com.yandex.mapkit.geometry.BoundingBox;
import defpackage.an91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zy70;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/mapkit/geometry/BoundingBox;", "it", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/geometry/BoundingBox;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.orders.multi.tracking.OrderListOverlayRecenter$start$1", f = "OrderListOverlayRecenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class OrderListOverlayRecenter$start$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ zy70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderListOverlayRecenter$start$1(zy70 zy70Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zy70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderListOverlayRecenter$start$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrderListOverlayRecenter$start$1 orderListOverlayRecenter$start$1 = (OrderListOverlayRecenter$start$1) create((BoundingBox) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        orderListOverlayRecenter$start$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        zy70 zy70Var = this.this$0;
        List l = zy70Var.a.l();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = zy70Var.c;
        for (o2y0 o2y0Var : hashMap.keySet()) {
            if (!l.contains(o2y0Var) || an91.i(o2y0Var.c())) {
                arrayList.add(o2y0Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.remove((o2y0) it.next());
        }
        return zy11.a;
    }
}
