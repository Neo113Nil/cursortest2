package ru.yandex.taxi.order.modals.impl.presentation;

import defpackage.bax0;
import defpackage.h4y0;
import defpackage.hhs0;
import defpackage.i4y0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.z3y0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.modals.impl.presentation.TaxiOrderPopupPresenter$attachView$1", f = "TaxiOrderPopupPresenter.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TaxiOrderPopupPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ h4y0 $mvpView;
    int label;
    final /* synthetic */ i4y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderPopupPresenter$attachView$1(i4y0 i4y0Var, h4y0 h4y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = i4y0Var;
        this.$mvpView = h4y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderPopupPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderPopupPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            hhs0 hhs0Var = this.this$0.x;
            tpr a = ((z3y0) hhs0Var.b).a();
            ((tt2) hhs0Var.c).getClass();
            sjh sjhVar = uyj.a;
            tpr F = e.F(a, mdh.b);
            bax0 bax0Var = new bax0(14, this.$mvpView);
            this.label = 1;
            if (F.collect(bax0Var, this) == coroutineSingletons) {
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
