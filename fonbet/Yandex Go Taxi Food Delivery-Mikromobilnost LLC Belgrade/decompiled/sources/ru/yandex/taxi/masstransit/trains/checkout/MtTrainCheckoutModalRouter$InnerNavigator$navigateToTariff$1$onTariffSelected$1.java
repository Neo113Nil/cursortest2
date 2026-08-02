package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.gb40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pd40;
import defpackage.ph40;
import defpackage.tse;
import defpackage.wls;
import defpackage.ya40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.checkout.MtTrainCheckoutModalRouter$InnerNavigator$navigateToTariff$1$onTariffSelected$1", f = "MtTrainCheckoutModalRouter.kt", l = {HProv.PP_VERSION_EX}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTrainCheckoutModalRouter$InnerNavigator$navigateToTariff$1$onTariffSelected$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $selectedTariffId;
    final /* synthetic */ ph40 $tariffItem;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainCheckoutModalRouter$InnerNavigator$navigateToTariff$1$onTariffSelected$1(i iVar, String str, ph40 ph40Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$selectedTariffId = str;
        this.$tariffItem = ph40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTrainCheckoutModalRouter$InnerNavigator$navigateToTariff$1$onTariffSelected$1(this.this$0, this.$selectedTariffId, this.$tariffItem, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTrainCheckoutModalRouter$InnerNavigator$navigateToTariff$1$onTariffSelected$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = (a) this.this$0.U.getValue();
            pd40 pd40Var = new pd40(this.$selectedTariffId, this.$tariffItem);
            r U = this.this$0.U();
            i iVar = this.this$0;
            ya40 ya40Var = iVar.T;
            gb40 gb40Var = (gb40) iVar.n();
            tse o = this.this$0.o();
            this.label = 1;
            if (aVar.b(pd40Var, U, ya40Var, gb40Var, o, this) == coroutineSingletons) {
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
