package ru.yandex.taxi.preorder.summary.selector.ui.ribbon;

import defpackage.bax0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xrx0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.preorder.summary.selector.ui.interactor.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonPresenter$attachView$1", f = "TariffsRibbonPresenter.kt", l = {62}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffsRibbonPresenter$attachView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ xrx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffsRibbonPresenter$attachView$1(xrx0 xrx0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xrx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffsRibbonPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffsRibbonPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            e a = this.this$0.L.a();
            this.this$0.x.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(a, uyj.a);
            bax0 bax0Var = new bax0(6, this.this$0);
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
