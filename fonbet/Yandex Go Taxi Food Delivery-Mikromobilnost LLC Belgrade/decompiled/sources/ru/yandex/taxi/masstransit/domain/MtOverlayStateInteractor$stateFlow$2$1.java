package ru.yandex.taxi.masstransit.domain;

import defpackage.fc30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.py30;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lfc30;", "icons", "Lkotlin/Pair;", "Lpy30;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lfc30;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtOverlayStateInteractor$stateFlow$2$1", f = "MtOverlayStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtOverlayStateInteractor$stateFlow$2$1 extends SuspendLambda implements zls {
    final /* synthetic */ py30 $state;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtOverlayStateInteractor$stateFlow$2$1(py30 py30Var, Continuation continuation) {
        super(3, continuation);
        this.$state = py30Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtOverlayStateInteractor$stateFlow$2$1 mtOverlayStateInteractor$stateFlow$2$1 = new MtOverlayStateInteractor$stateFlow$2$1(this.$state, (Continuation) obj3);
        mtOverlayStateInteractor$stateFlow$2$1.L$0 = (fc30) obj2;
        return mtOverlayStateInteractor$stateFlow$2$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fc30 fc30Var = (fc30) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(this.$state, fc30Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
