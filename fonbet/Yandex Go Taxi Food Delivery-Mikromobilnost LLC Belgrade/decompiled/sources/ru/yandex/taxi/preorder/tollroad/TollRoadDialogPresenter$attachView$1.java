package ru.yandex.taxi.preorder.tollroad;

import defpackage.bax0;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.qpz0;
import defpackage.sqz0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.tollroad.TollRoadDialogPresenter$attachView$1", f = "TollRoadDialogPresenter.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TollRoadDialogPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ sqz0 $mvpView;
    final /* synthetic */ n4u0 $roadOptionsFlow;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ qpz0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TollRoadDialogPresenter$attachView$1(n4u0 n4u0Var, qpz0 qpz0Var, sqz0 sqz0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qpz0Var;
        this.$roadOptionsFlow = n4u0Var;
        this.$mvpView = sqz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TollRoadDialogPresenter$attachView$1(this.$roadOptionsFlow, this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TollRoadDialogPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qpz0 qpz0Var = this.this$0;
            n4u0 n4u0Var = this.$roadOptionsFlow;
            o oVar = qpz0Var.z;
            m0 m0Var = new m0(new n(new l(oVar.d.a(), oVar), oVar), new jqr(n4u0Var, new TollRoadDialogPresenter$tollRoadUiStateFlow$1(qpz0Var, null), 3), new TollRoadDialogPresenter$tollRoadUiStateFlow$2(qpz0Var, null));
            sqz0 sqz0Var = this.$mvpView;
            kotlinx.coroutines.flow.o oVar2 = new kotlinx.coroutines.flow.o(m0Var, new TollRoadDialogPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            bax0 bax0Var = new bax0(24, sqz0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar2.collect(bax0Var, this) == coroutineSingletons) {
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
