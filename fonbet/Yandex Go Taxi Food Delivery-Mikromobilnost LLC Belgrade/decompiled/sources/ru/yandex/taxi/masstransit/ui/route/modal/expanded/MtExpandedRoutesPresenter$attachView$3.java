package ru.yandex.taxi.masstransit.ui.route.modal.expanded;

import com.yandex.go.address.models.Address;
import defpackage.ij30;
import defpackage.kj30;
import defpackage.lj30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v011;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.expanded.MtExpandedRoutesPresenter$attachView$3", f = "MtExpandedRoutesPresenter.kt", l = {112}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtExpandedRoutesPresenter$attachView$3 extends SuspendLambda implements wls {
    final /* synthetic */ ij30 $mvpView;
    int label;
    final /* synthetic */ lj30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtExpandedRoutesPresenter$attachView$3(lj30 lj30Var, ij30 ij30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lj30Var;
        this.$mvpView = ij30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtExpandedRoutesPresenter$attachView$3(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtExpandedRoutesPresenter$attachView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            lj30 lj30Var = this.this$0;
            v011 v011Var = lj30Var.F;
            Address h = lj30Var.I.h();
            g d = ((ru.yandex.taxi.masstransit.paymentcards.d) v011Var).d(h != null ? h.B() : null);
            kj30 kj30Var = new kj30(this.$mvpView, 1);
            this.label = 1;
            if (d.collect(kj30Var, this) == coroutineSingletons) {
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
