package ru.yandex.taxi.preorder.summary.selector.ui.ribbon;

import com.yandex.go.taxi.experiments.i;
import defpackage.a60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v770;
import defpackage.wls;
import defpackage.xrx0;
import defpackage.y50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonPresenter$onMarketplaceAltClicked$1", f = "TariffsRibbonPresenter.kt", l = {103}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffsRibbonPresenter$onMarketplaceAltClicked$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ xrx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffsRibbonPresenter$onMarketplaceAltClicked$1(xrx0 xrx0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xrx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffsRibbonPresenter$onMarketplaceAltClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffsRibbonPresenter$onMarketplaceAltClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y50 y50Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            xrx0 xrx0Var = this.this$0;
            y50 y50Var2 = xrx0Var.I;
            i iVar = xrx0Var.J;
            this.L$0 = y50Var2;
            this.label = 1;
            obj = iVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            y50Var = y50Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y50Var = (y50) this.L$0;
            b.b(obj);
        }
        ((a60) y50Var).c((String) obj, v770.c);
        return zy11.a;
    }
}
