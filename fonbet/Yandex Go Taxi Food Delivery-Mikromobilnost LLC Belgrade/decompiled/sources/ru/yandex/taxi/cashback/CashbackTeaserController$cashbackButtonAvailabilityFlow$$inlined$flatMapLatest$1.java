package ru.yandex.taxi.cashback;

import com.yandex.go.plus.experiment.CashbackExperiment;
import defpackage.g92;
import defpackage.mvg;
import defpackage.n49;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.CashbackTeaserController$cashbackButtonAvailabilityFlow$$inlined$flatMapLatest$1", f = "CashbackTeaserController.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class CashbackTeaserController$cashbackButtonAvailabilityFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ n49 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackTeaserController$cashbackButtonAvailabilityFlow$$inlined$flatMapLatest$1(Continuation continuation, n49 n49Var) {
        super(3, continuation);
        this.this$0 = n49Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CashbackTeaserController$cashbackButtonAvailabilityFlow$$inlined$flatMapLatest$1 cashbackTeaserController$cashbackButtonAvailabilityFlow$$inlined$flatMapLatest$1 = new CashbackTeaserController$cashbackButtonAvailabilityFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        cashbackTeaserController$cashbackButtonAvailabilityFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        cashbackTeaserController$cashbackButtonAvailabilityFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return cashbackTeaserController$cashbackButtonAvailabilityFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n49 n49Var = this.this$0;
            n49Var.getClass();
            tpr g92Var = !((CashbackExperiment) obj2).b ? new g92(2, Boolean.FALSE) : new c(new tpr[]{n49Var.e.a.b(), new e(((com.yandex.go.payments.paymentlist.data.c) n49Var.c).u), n49Var.f.b, kotlinx.coroutines.flow.e.d(n49Var.g.a.f), n49Var.h.c(), kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(n49Var.j.a.c()), new CashbackTeaserController$loyaltyProgramLoadedFlow$$inlined$flatMapLatest$1(null, n49Var))}, n49Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
