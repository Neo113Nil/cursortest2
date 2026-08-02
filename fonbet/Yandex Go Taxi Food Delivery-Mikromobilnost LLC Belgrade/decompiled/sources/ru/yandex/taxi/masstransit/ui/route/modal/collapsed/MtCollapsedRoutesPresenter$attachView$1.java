package ru.yandex.taxi.masstransit.ui.route.modal.collapsed;

import defpackage.me30;
import defpackage.mvg;
import defpackage.nc30;
import defpackage.ne30;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.masstransit.repository.MtAddressRepository$stateFlow$$inlined$flatMapLatest$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesPresenter$attachView$1", f = "MtCollapsedRoutesPresenter.kt", l = {440}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCollapsedRoutesPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ me30 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCollapsedRoutesPresenter$attachView$1(d dVar, me30 me30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$mvpView = me30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtCollapsedRoutesPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtCollapsedRoutesPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            nc30 nc30Var = this.this$0.y;
            g X = e.X(e.d(nc30Var.a.b), new MtAddressRepository$stateFlow$$inlined$flatMapLatest$1(null, nc30Var));
            me30 me30Var = this.$mvpView;
            o oVar = new o(X, new MtCollapsedRoutesPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            ne30 ne30Var = new ne30(me30Var, 0);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(ne30Var, this) == coroutineSingletons) {
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
