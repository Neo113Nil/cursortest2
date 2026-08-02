package ru.yandex.taxi.preorder.tollroad;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jpx0;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.qpz0;
import defpackage.sqz0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.tollroad.TollRoadDialogPresenter$attachView$3", f = "TollRoadDialogPresenter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TollRoadDialogPresenter$attachView$3 extends SuspendLambda implements wls {
    final /* synthetic */ sqz0 $mvpView;
    final /* synthetic */ n4u0 $roadOptionsFlow;
    Object L$0;
    int label;
    final /* synthetic */ qpz0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TollRoadDialogPresenter$attachView$3(n4u0 n4u0Var, qpz0 qpz0Var, sqz0 sqz0Var, Continuation continuation) {
        super(2, continuation);
        this.$roadOptionsFlow = n4u0Var;
        this.this$0 = qpz0Var;
        this.$mvpView = sqz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TollRoadDialogPresenter$attachView$3(this.$roadOptionsFlow, this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TollRoadDialogPresenter$attachView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n4u0 n4u0Var = this.$roadOptionsFlow;
            qpz0 qpz0Var = this.this$0;
            tpr b = qpz0Var.A.b(new c(n4u0Var, qpz0Var));
            jpx0 jpx0Var = new jpx0(3, this.$mvpView);
            this.L$0 = null;
            this.label = 1;
            if (b.collect(jpx0Var, this) == coroutineSingletons) {
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
