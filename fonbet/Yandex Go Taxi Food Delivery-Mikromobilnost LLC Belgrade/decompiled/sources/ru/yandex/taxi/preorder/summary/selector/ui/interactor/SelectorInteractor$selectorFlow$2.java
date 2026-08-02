package ru.yandex.taxi.preorder.summary.selector.ui.interactor;

import defpackage.dms;
import defpackage.ik31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lik31;", "verticalsInfo", "Lzy11;", "<unused var>", "Lru/yandex/taxi/theme/ThemeType;", "", "", "<anonymous>", "(Lru/yandex/taxi/tariffs/model/verticals/VerticalsSnapshot;VLru/yandex/taxi/theme/ThemeType;Ljava/util/Map;)Lru/yandex/taxi/tariffs/model/verticals/VerticalsSnapshot;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.selector.ui.interactor.SelectorInteractor$selectorFlow$2", f = "SelectorInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SelectorInteractor$selectorFlow$2 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        SelectorInteractor$selectorFlow$2 selectorInteractor$selectorFlow$2 = new SelectorInteractor$selectorFlow$2(5, (Continuation) obj5);
        selectorInteractor$selectorFlow$2.L$0 = (ik31) obj;
        return selectorInteractor$selectorFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ik31 ik31Var = (ik31) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return ik31Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
