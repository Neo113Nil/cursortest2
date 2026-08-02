package ru.yandex.taxi.altpins.confirmation_screen.modal;

import defpackage.cx1;
import defpackage.dx1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.confirmation_screen.modal.AlternativeDestinationPresenter$attachView$1", f = "AlternativeDestinationPresenter.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AlternativeDestinationPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ dx1 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ cx1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlternativeDestinationPresenter$attachView$1(cx1 cx1Var, dx1 dx1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cx1Var;
        this.$mvpView = dx1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AlternativeDestinationPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AlternativeDestinationPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            cx1 cx1Var = this.this$0;
            cx1Var.z.l(cx1Var.x);
            r0 r0Var = this.this$0.z;
            dx1 dx1Var = this.$mvpView;
            o oVar = new o(r0Var, new AlternativeDestinationPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            x5 x5Var = new x5(19, dx1Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(x5Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
