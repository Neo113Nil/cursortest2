package ru.yandex.taxi.layers.presentation.optimalview;

import defpackage.fxe0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oaq0;
import defpackage.wls;
import defpackage.y9q0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfxe0;", "presentationState", "", "<anonymous>", "(Lfxe0;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.optimalview.MapObservationPresenter$waitForAnySelection$1$1$1", f = "MapObservationPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MapObservationPresenter$waitForAnySelection$1$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapObservationPresenter$waitForAnySelection$1$1$1 mapObservationPresenter$waitForAnySelection$1$1$1 = new MapObservationPresenter$waitForAnySelection$1$1$1(2, continuation);
        mapObservationPresenter$waitForAnySelection$1$1$1.L$0 = obj;
        return mapObservationPresenter$waitForAnySelection$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObservationPresenter$waitForAnySelection$1$1$1) create((fxe0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fxe0 fxe0Var = (fxe0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf((fxe0Var instanceof y9q0) || (fxe0Var instanceof oaq0));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
