package ru.yandex.taxi.layers.domain;

import defpackage.fxe0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfxe0;", "presentationState", "Lzy11;", "<anonymous>", "(Lfxe0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.MapObjectsRenderingInteractor$startMapObjectsListening$1", f = "MapObjectsRenderingInteractor.kt", l = {160}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsRenderingInteractor$startMapObjectsListening$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsRenderingInteractor$startMapObjectsListening$1(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapObjectsRenderingInteractor$startMapObjectsListening$1 mapObjectsRenderingInteractor$startMapObjectsListening$1 = new MapObjectsRenderingInteractor$startMapObjectsListening$1(this.this$0, continuation);
        mapObjectsRenderingInteractor$startMapObjectsListening$1.L$0 = obj;
        return mapObjectsRenderingInteractor$startMapObjectsListening$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectsRenderingInteractor$startMapObjectsListening$1) create((fxe0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fxe0 fxe0Var = (fxe0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = this.this$0;
            this.L$0 = null;
            this.label = 1;
            if (o.a(oVar, fxe0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
