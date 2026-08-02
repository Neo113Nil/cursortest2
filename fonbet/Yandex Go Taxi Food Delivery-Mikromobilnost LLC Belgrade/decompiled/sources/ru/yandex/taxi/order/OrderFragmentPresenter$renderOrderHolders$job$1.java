package ru.yandex.taxi.order;

import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import defpackage.fs70;
import defpackage.ga80;
import defpackage.ike;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.ww70;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.OrderFragmentPresenter$renderOrderHolders$job$1", f = "OrderFragmentPresenter.kt", l = {464}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class OrderFragmentPresenter$renderOrderHolders$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrderSessionCheckpoint $delayType;
    final /* synthetic */ o2y0 $holder;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderFragmentPresenter$renderOrderHolders$job$1(i iVar, TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$delayType = taxiOrderSessionCheckpoint;
        this.$holder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderFragmentPresenter$renderOrderHolders$job$1(this.this$0, this.$delayType, this.$holder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderFragmentPresenter$renderOrderHolders$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.order.perf.a aVar = this.this$0.x0;
            TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint = this.$delayType;
            fs70 fs70Var = new fs70(15);
            this.label = 1;
            if (aVar.a(taxiOrderSessionCheckpoint, fs70Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Pair a = this.this$0.I.a(this.$holder);
        ga80 ga80Var = (ga80) a.c();
        if (((Boolean) a.f()).booleanValue()) {
            ((ww70) this.this$0.Dg()).I8(ga80Var);
        }
        ((ww70) this.this$0.Dg()).Db(this.$holder, ga80Var);
        if (jl40.l(this.$holder, this.this$0.y0) && this.this$0.w0.b().g) {
            i iVar = this.this$0;
            iVar.r0.c((ike) iVar.Jg(), null);
        }
        return zy11.a;
    }
}
