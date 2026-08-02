package ru.yandex.taxi.order;

import defpackage.d0y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.OrderControllerCompatFragmentRouter$changeSourceAddress$1", f = "OrderControllerCompatFragmentRouter.kt", l = {460}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderControllerCompatFragmentRouter$changeSourceAddress$1 extends SuspendLambda implements wls {
    final /* synthetic */ d0y0 $data;
    final /* synthetic */ sls $onSourcePointChanged;
    final /* synthetic */ o2y0 $orderHolder;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.order.OrderControllerCompatFragmentRouter$changeSourceAddress$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            o2y0 o2y0Var = (o2y0) obj;
            ((f) this.receiver).d0(o2y0Var).a((String) obj2, o2y0Var.b().b.d());
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderControllerCompatFragmentRouter$changeSourceAddress$1(f fVar, d0y0 d0y0Var, o2y0 o2y0Var, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$data = d0y0Var;
        this.$orderHolder = o2y0Var;
        this.$onSourcePointChanged = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderControllerCompatFragmentRouter$changeSourceAddress$1(this.this$0, this.$data, this.$orderHolder, this.$onSourcePointChanged, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderControllerCompatFragmentRouter$changeSourceAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.order.change.source.interactor.d dVar = (com.yandex.go.taxi.order.change.source.interactor.d) this.this$0.g0.get();
            d0y0 d0y0Var = this.$data;
            o2y0 o2y0Var = this.$orderHolder;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, this.this$0, f.class, "onPorchChanged", "onPorchChanged(Lcom/yandex/go/taxi/order/models/api/TaxiOrderHolder;Ljava/lang/String;)V", 0);
            sls slsVar = this.$onSourcePointChanged;
            this.label = 1;
            if (dVar.a(d0y0Var, o2y0Var, anonymousClass1, slsVar, this) == coroutineSingletons) {
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
