package ru.yandex.taxi.layers.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "need", "Lrsn;", "", "ids", "<anonymous>", "(ZLrsn;)Lrsn;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.MapObjectsRenderingInteractor$startListening$2", f = "MapObjectsRenderingInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsRenderingInteractor$startListening$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        MapObjectsRenderingInteractor$startListening$2 mapObjectsRenderingInteractor$startListening$2 = new MapObjectsRenderingInteractor$startListening$2(3, (Continuation) obj3);
        mapObjectsRenderingInteractor$startListening$2.Z$0 = booleanValue;
        mapObjectsRenderingInteractor$startListening$2.L$0 = (rsn) obj2;
        return mapObjectsRenderingInteractor$startListening$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        rsn rsnVar = (rsn) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z) {
            return rsnVar;
        }
        return null;
    }
}
