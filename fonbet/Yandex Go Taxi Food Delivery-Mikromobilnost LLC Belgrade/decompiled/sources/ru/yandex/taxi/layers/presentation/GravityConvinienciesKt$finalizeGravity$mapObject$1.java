package ru.yandex.taxi.layers.presentation;

import com.yandex.mapkit.map.CameraPosition;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llm00;", "<anonymous>", "(Ltse;)Llm00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.GravityConvinienciesKt$finalizeGravity$mapObject$1", f = "GravityConviniencies.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class GravityConvinienciesKt$finalizeGravity$mapObject$1 extends SuspendLambda implements wls {
    final /* synthetic */ CameraPosition $cameraPosition;
    final /* synthetic */ Map<String, lm00> $this_finalizeGravity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GravityConvinienciesKt$finalizeGravity$mapObject$1(Map map, CameraPosition cameraPosition, Continuation continuation) {
        super(2, continuation);
        this.$this_finalizeGravity = map;
        this.$cameraPosition = cameraPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GravityConvinienciesKt$finalizeGravity$mapObject$1(this.$this_finalizeGravity, this.$cameraPosition, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GravityConvinienciesKt$finalizeGravity$mapObject$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return a.a(this.$this_finalizeGravity, this.$cameraPosition.getZoom(), ru.yandex.taxi.map.utils.a.E(this.$cameraPosition.getTarget(), null));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
