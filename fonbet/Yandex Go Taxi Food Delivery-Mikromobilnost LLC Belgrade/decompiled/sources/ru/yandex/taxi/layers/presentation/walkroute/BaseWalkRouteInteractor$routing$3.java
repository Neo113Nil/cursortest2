package ru.yandex.taxi.layers.presentation.walkroute;

import defpackage.bms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lzzs;", "userLocation", "objectLocation", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lkotlin/Pair;", "<anonymous>", "(Lzzs;Lzzs;Lru/yandex/taxi/theme/ThemeType;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.walkroute.BaseWalkRouteInteractor$routing$3", f = "BaseWalkRouteInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BaseWalkRouteInteractor$routing$3 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public BaseWalkRouteInteractor$routing$3() {
        super(4, null);
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        BaseWalkRouteInteractor$routing$3 baseWalkRouteInteractor$routing$3 = new BaseWalkRouteInteractor$routing$3(4, (Continuation) obj4);
        baseWalkRouteInteractor$routing$3.L$0 = (zzs) obj;
        baseWalkRouteInteractor$routing$3.L$1 = (zzs) obj2;
        return baseWalkRouteInteractor$routing$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzs zzsVar = (zzs) this.L$0;
        zzs zzsVar2 = (zzs) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(zzsVar, zzsVar2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
