package ru.yandex.taxi.linked_order.map;

import com.yandex.mapkit.geometry.Point;
import defpackage.cpy;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.plm;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lcom/yandex/mapkit/geometry/Point;", "", "pointWithDistanceLeft", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.map.LinkedOrderRouteProgressTracker$startTracker$positionJob$2", f = "LinkedOrderRouteProgressTracker.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LinkedOrderRouteProgressTracker$startTracker$positionJob$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ cpy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedOrderRouteProgressTracker$startTracker$positionJob$2(cpy cpyVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cpyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LinkedOrderRouteProgressTracker$startTracker$positionJob$2 linkedOrderRouteProgressTracker$startTracker$positionJob$2 = new LinkedOrderRouteProgressTracker$startTracker$positionJob$2(this.this$0, continuation);
        linkedOrderRouteProgressTracker$startTracker$positionJob$2.L$0 = obj;
        return linkedOrderRouteProgressTracker$startTracker$positionJob$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LinkedOrderRouteProgressTracker$startTracker$positionJob$2 linkedOrderRouteProgressTracker$startTracker$positionJob$2 = (LinkedOrderRouteProgressTracker$startTracker$positionJob$2) create((Pair) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        linkedOrderRouteProgressTracker$startTracker$positionJob$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((plm) this.this$0.c).b((Point) pair.c(), (Double) pair.f());
        return zy11.a;
    }
}
