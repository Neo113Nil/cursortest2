package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.xd40;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lxd40;", "currentState", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lxd40;)Lxd40;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.checkout.MtTrainCheckoutUiStateRepository$uiStateFlow$1", f = "MtTrainCheckoutUiStateRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTrainCheckoutUiStateRepository$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtTrainCheckoutUiStateRepository$uiStateFlow$1 mtTrainCheckoutUiStateRepository$uiStateFlow$1 = new MtTrainCheckoutUiStateRepository$uiStateFlow$1(3, (Continuation) obj3);
        mtTrainCheckoutUiStateRepository$uiStateFlow$1.L$0 = (xd40) obj2;
        return mtTrainCheckoutUiStateRepository$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xd40 xd40Var = (xd40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return xd40Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
