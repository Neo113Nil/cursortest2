package ru.yandex.taxi.preorder.summary.tariffpage.interactors;

import defpackage.i890;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li890;", Constants.KEY_DATA, "<anonymous>", "(Li890;)Li890;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.interactors.TariffPagerDataInteractor$dataFlow$3", f = "TariffPagerDataInteractor.kt", l = {62}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffPagerDataInteractor$dataFlow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffPagerDataInteractor$dataFlow$3(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TariffPagerDataInteractor$dataFlow$3 tariffPagerDataInteractor$dataFlow$3 = new TariffPagerDataInteractor$dataFlow$3(this.this$0, continuation);
        tariffPagerDataInteractor$dataFlow$3.L$0 = obj;
        return tariffPagerDataInteractor$dataFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffPagerDataInteractor$dataFlow$3) create((i890) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i890 i890Var = (i890) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return i890Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        this.L$0 = i890Var;
        this.label = 1;
        return e.a(eVar, this) == coroutineSingletons ? coroutineSingletons : i890Var;
    }
}
