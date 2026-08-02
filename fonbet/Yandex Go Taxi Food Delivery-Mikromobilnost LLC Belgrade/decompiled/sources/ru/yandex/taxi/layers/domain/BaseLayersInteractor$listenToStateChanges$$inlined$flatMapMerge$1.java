package ru.yandex.taxi.layers.domain;

import defpackage.bzx;
import defpackage.cyx;
import defpackage.gyx;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o35;
import defpackage.o370;
import defpackage.oo2;
import defpackage.pwy0;
import defpackage.tpr;
import defpackage.w4y0;
import defpackage.wls;
import defpackage.z0c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.layers.source.requesttrigger.ClearMapObjectsEventRepository$listenToClearEvent$$inlined$flatMapLatest$1;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "it", "Ltpr;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.BaseLayersInteractor$listenToStateChanges$$inlined$flatMapMerge$1", f = "BaseLayersInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class BaseLayersInteractor$listenToStateChanges$$inlined$flatMapMerge$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o35 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLayersInteractor$listenToStateChanges$$inlined$flatMapMerge$1(o35 o35Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = o35Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseLayersInteractor$listenToStateChanges$$inlined$flatMapMerge$1 baseLayersInteractor$listenToStateChanges$$inlined$flatMapMerge$1 = new BaseLayersInteractor$listenToStateChanges$$inlined$flatMapMerge$1(this.this$0, continuation);
        baseLayersInteractor$listenToStateChanges$$inlined$flatMapMerge$1.L$0 = obj;
        return baseLayersInteractor$listenToStateChanges$$inlined$flatMapMerge$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseLayersInteractor$listenToStateChanges$$inlined$flatMapMerge$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        bzx bzxVar = (bzx) obj2;
        oo2 oo2Var = this.this$0.e;
        gyx j = ru.yandex.taxi.layers.source.factory.a.j(bzxVar);
        BaseLayersInteractor$listenToStateChanges$3$1 baseLayersInteractor$listenToStateChanges$3$1 = new BaseLayersInteractor$listenToStateChanges$3$1(0, this.this$0.g, ru.yandex.taxi.layers.source.c.class, "listenToLayersConfig", "listenToLayersConfig$old()Lkotlinx/coroutines/flow/Flow;", 0);
        tpr a = ((cyx) oo2Var.w).a();
        k kVar = new k(new mth(((pwy0) oo2Var.a).a(), 4));
        z0c z0cVar = (z0c) oo2Var.c;
        z0cVar.getClass();
        return new kotlinx.coroutines.flow.n(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.K(a, kVar, kotlinx.coroutines.flow.e.X((tpr) baseLayersInteractor$listenToStateChanges$3$1.invoke(), new ClearMapObjectsEventRepository$listenToClearEvent$$inlined$flatMapLatest$1(null, z0cVar)), ((ru.yandex.taxi.layers.source.requesttrigger.g) oo2Var.b).a(j, baseLayersInteractor$listenToStateChanges$3$1), new ru.yandex.taxi.layers.source.requesttrigger.m(((w4y0) ((o370) oo2Var.x).a).b)), new BaseLayersInteractor$listenToStateChanges$lambda$2$$inlined$flatMapLatest$1(this.this$0, null)), new BaseLayersInteractor$listenToStateChanges$3$3(this.this$0, bzxVar, null));
    }
}
