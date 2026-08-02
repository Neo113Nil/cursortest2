package ru.yandex.taxi.order;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.OrderControllerCompatFragmentRouter$createMultiOrderCallback$1$onShown$1", f = "OrderControllerCompatFragmentRouter.kt", l = {1581}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderControllerCompatFragmentRouter$createMultiOrderCallback$1$onShown$1 extends SuspendLambda implements wls {
    final /* synthetic */ o2y0 $associatedData;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderControllerCompatFragmentRouter$createMultiOrderCallback$1$onShown$1(f fVar, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$associatedData = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderControllerCompatFragmentRouter$createMultiOrderCallback$1$onShown$1(this.this$0, this.$associatedData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderControllerCompatFragmentRouter$createMultiOrderCallback$1$onShown$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.order.provider.a aVar = this.this$0.L;
            o2y0 o2y0Var = this.$associatedData;
            this.label = 1;
            if (aVar.s(o2y0Var, this) == coroutineSingletons) {
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
