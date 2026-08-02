package ru.yandex.taxi.routeselector.presentation;

import defpackage.kal0;
import defpackage.m9l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u8l0;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.routeselector.presentation.RouteSelectorPresenter$attachView$7", f = "RouteSelectorPresenter.kt", l = {486}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RouteSelectorPresenter$attachView$7 extends SuspendLambda implements wls {
    final /* synthetic */ m9l0 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSelectorPresenter$attachView$7(s sVar, m9l0 m9l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
        this.$mvpView = m9l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteSelectorPresenter$attachView$7(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteSelectorPresenter$attachView$7) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            s sVar = this.this$0;
            u8l0 u8l0Var = sVar.D;
            r0 r0Var = sVar.k0;
            u8l0Var.getClass();
            tpr t = kotlinx.coroutines.flow.e.t(new rol0(new RouteSelectorBubbleInteractor$bubbleFlow$1(u8l0Var, r0Var, null)));
            u8l0Var.d.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(t, uyj.a);
            m9l0 m9l0Var = this.$mvpView;
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(F, new RouteSelectorPresenter$attachView$7$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            kal0 kal0Var = new kal0(m9l0Var, 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(kal0Var, this) == coroutineSingletons) {
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
