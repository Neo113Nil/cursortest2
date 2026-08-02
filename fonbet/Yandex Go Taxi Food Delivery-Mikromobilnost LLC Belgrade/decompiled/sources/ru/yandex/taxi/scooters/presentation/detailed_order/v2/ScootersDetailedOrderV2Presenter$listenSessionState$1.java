package ru.yandex.taxi.scooters.presentation.detailed_order.v2;

import defpackage.ahn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lahn0;", ClidProvider.STATE, "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "<anonymous>", "(Lahn0;Lru/yandex/taxi/theme/ThemeType;)Lahn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2Presenter$listenSessionState$1", f = "ScootersDetailedOrderV2Presenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersDetailedOrderV2Presenter$listenSessionState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersDetailedOrderV2Presenter$listenSessionState$1 scootersDetailedOrderV2Presenter$listenSessionState$1 = new ScootersDetailedOrderV2Presenter$listenSessionState$1(3, (Continuation) obj3);
        scootersDetailedOrderV2Presenter$listenSessionState$1.L$0 = (ahn0) obj;
        return scootersDetailedOrderV2Presenter$listenSessionState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ahn0 ahn0Var = (ahn0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return ahn0Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
