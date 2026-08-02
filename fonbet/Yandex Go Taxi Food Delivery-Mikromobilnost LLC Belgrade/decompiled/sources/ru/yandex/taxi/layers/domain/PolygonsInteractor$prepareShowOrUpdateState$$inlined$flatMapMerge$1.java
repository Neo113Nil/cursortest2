package ru.yandex.taxi.layers.domain;

import defpackage.g4e0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "it", "Ltpr;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.PolygonsInteractor$prepareShowOrUpdateState$$inlined$flatMapMerge$1", f = "PolygonsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class PolygonsInteractor$prepareShowOrUpdateState$$inlined$flatMapMerge$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolygonsInteractor$prepareShowOrUpdateState$$inlined$flatMapMerge$1(Continuation continuation, r rVar) {
        super(2, continuation);
        this.receiver$inlined = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PolygonsInteractor$prepareShowOrUpdateState$$inlined$flatMapMerge$1 polygonsInteractor$prepareShowOrUpdateState$$inlined$flatMapMerge$1 = new PolygonsInteractor$prepareShowOrUpdateState$$inlined$flatMapMerge$1(continuation, this.receiver$inlined);
        polygonsInteractor$prepareShowOrUpdateState$$inlined$flatMapMerge$1.L$0 = obj;
        return polygonsInteractor$prepareShowOrUpdateState$$inlined$flatMapMerge$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PolygonsInteractor$prepareShowOrUpdateState$$inlined$flatMapMerge$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        r rVar = this.receiver$inlined;
        rVar.getClass();
        rol0 rol0Var = new rol0(new PolygonsInteractor$onResponse$1(rVar, (g4e0) obj2, null));
        rVar.j.getClass();
        return kotlinx.coroutines.flow.e.F(rol0Var, uyj.a);
    }
}
