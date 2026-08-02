package ru.yandex.taxi.preorder.summary.selector.ui.verticals;

import com.yandex.go.taxi.experiments.i;
import defpackage.a60;
import defpackage.k6m;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v770;
import defpackage.wls;
import defpackage.y50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.selector.ui.verticals.DoubleTariffRibbonPresenter$onMarketplaceAltClicked$1", f = "DoubleTariffRibbonPresenter.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class DoubleTariffRibbonPresenter$onMarketplaceAltClicked$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ k6m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleTariffRibbonPresenter$onMarketplaceAltClicked$1(k6m k6mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = k6mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DoubleTariffRibbonPresenter$onMarketplaceAltClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DoubleTariffRibbonPresenter$onMarketplaceAltClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y50 y50Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            k6m k6mVar = this.this$0;
            y50 y50Var2 = k6mVar.L;
            i iVar = k6mVar.M;
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
            kotlin.b.b(obj);
        }
        ((a60) y50Var).c((String) obj, v770.c);
        return zy11.a;
    }
}
