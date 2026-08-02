package ru.yandex.taxi.masstransit.stop.interactor;

import defpackage.k110;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.utils.RefreshState;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/yandex/taxi/masstransit/utils/RefreshState;", "refreshState", "", "<unused var>", "Lkotlin/Pair;", "Lk110;", "<anonymous>", "(Lru/yandex/taxi/masstransit/utils/RefreshState;J)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stop.interactor.MtStopStateInteractor$updateStopState$2$1$1", f = "MtStopStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopStateInteractor$updateStopState$2$1$1 extends SuspendLambda implements zls {
    final /* synthetic */ k110 $exp;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopStateInteractor$updateStopState$2$1$1(k110 k110Var, Continuation continuation) {
        super(3, continuation);
        this.$exp = k110Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).longValue();
        MtStopStateInteractor$updateStopState$2$1$1 mtStopStateInteractor$updateStopState$2$1$1 = new MtStopStateInteractor$updateStopState$2$1$1(this.$exp, (Continuation) obj3);
        mtStopStateInteractor$updateStopState$2$1$1.L$0 = (RefreshState) obj;
        return mtStopStateInteractor$updateStopState$2$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RefreshState refreshState = (RefreshState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(this.$exp, refreshState);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
