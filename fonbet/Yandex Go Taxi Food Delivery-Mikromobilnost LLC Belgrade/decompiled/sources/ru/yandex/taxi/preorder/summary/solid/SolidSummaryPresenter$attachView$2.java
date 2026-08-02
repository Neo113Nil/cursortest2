package ru.yandex.taxi.preorder.summary.solid;

import com.yandex.go.taxi.summary.api.model.TariffCardMode;
import defpackage.as21;
import defpackage.hhs0;
import defpackage.m6t0;
import defpackage.mqv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v6t0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.SolidSummaryPresenter$attachView$2", f = "SolidSummaryPresenter.kt", l = {313}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SolidSummaryPresenter$attachView$2 extends SuspendLambda implements wls {
    final /* synthetic */ m6t0 $mvpView;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SolidSummaryPresenter$attachView$2(l lVar, m6t0 m6t0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$mvpView = m6t0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SolidSummaryPresenter$attachView$2(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SolidSummaryPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            hhs0 hhs0Var = this.this$0.T1;
            int a = ((mqv0) hhs0Var.b).a();
            int i2 = v6t0.a[((1 > a || a >= as21.b((as21) hhs0Var.c, "FIELD_MAIN_SCREEN_LOADING_TIME")) ? TariffCardMode.DEFAULT : TariffCardMode.LATE_INIT).ordinal()];
            if (i2 == 1) {
                this.$mvpView.O2(false);
                return zy11.a;
            }
            if (i2 != 2) {
                w511.b();
                return null;
            }
            this.$mvpView.O2(false);
            com.yandex.go.taxi.summary.shared.lifecycle.a aVar = this.this$0.V1;
            this.label = 1;
            if (aVar.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$mvpView.O2(true);
        return zy11.a;
    }
}
