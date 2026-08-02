package ru.yandex.taxi.layers.presentation;

import com.yandex.go.layers.api.model.Action;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.nm00;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$finalizeGravityIfPossible$2$invokeSuspend$$inlined$finalizeGravity$1", f = "MapObjectsOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class MapObjectsOverlay$finalizeGravityIfPossible$2$invokeSuspend$$inlined$finalizeGravity$1 extends SuspendLambda implements wls {
    final /* synthetic */ lm00 $mapObject;
    final /* synthetic */ g $receiver$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$finalizeGravityIfPossible$2$invokeSuspend$$inlined$finalizeGravity$1(lm00 lm00Var, Continuation continuation, g gVar) {
        super(2, continuation);
        this.$mapObject = lm00Var;
        this.$receiver$inlined = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectsOverlay$finalizeGravityIfPossible$2$invokeSuspend$$inlined$finalizeGravity$1(this.$mapObject, continuation, this.$receiver$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MapObjectsOverlay$finalizeGravityIfPossible$2$invokeSuspend$$inlined$finalizeGravity$1 mapObjectsOverlay$finalizeGravityIfPossible$2$invokeSuspend$$inlined$finalizeGravity$1 = (MapObjectsOverlay$finalizeGravityIfPossible$2$invokeSuspend$$inlined$finalizeGravity$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mapObjectsOverlay$finalizeGravityIfPossible$2$invokeSuspend$$inlined$finalizeGravity$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        lm00 lm00Var = this.$mapObject;
        this.$receiver$inlined.x.c(new nm00(lm00Var.a, lm00Var.b, lm00Var.e, Action.DRAG));
        return zy11.a;
    }
}
