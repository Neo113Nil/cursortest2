package ru.yandex.taxi.layers.presentation.walkroute;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzzs;", "pos", "", "azimuth", "Lkotlin/Pair;", "<anonymous>", "(Lzzs;F)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.walkroute.BaseWalkRouteInteractor$listenUserGeoParams$1", f = "BaseWalkRouteInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BaseWalkRouteInteractor$listenUserGeoParams$1 extends SuspendLambda implements zls {
    /* synthetic */ float F$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        BaseWalkRouteInteractor$listenUserGeoParams$1 baseWalkRouteInteractor$listenUserGeoParams$1 = new BaseWalkRouteInteractor$listenUserGeoParams$1(3, (Continuation) obj3);
        baseWalkRouteInteractor$listenUserGeoParams$1.L$0 = (zzs) obj;
        baseWalkRouteInteractor$listenUserGeoParams$1.F$0 = floatValue;
        return baseWalkRouteInteractor$listenUserGeoParams$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzs zzsVar = (zzs) this.L$0;
        float f = this.F$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(zzsVar, new Float(f));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
