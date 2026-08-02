package ru.yandex.taxi.layers.domain;

import defpackage.kqr;
import defpackage.mvg;
import defpackage.nm00;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.uud0;
import defpackage.wls;
import defpackage.z2e0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "it", "Ltpr;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.PolygonActionsInteractor$stateChangeListener$lambda$0$$inlined$flatMapMerge$1", f = "PolygonActionsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class PolygonActionsInteractor$stateChangeListener$lambda$0$$inlined$flatMapMerge$1 extends SuspendLambda implements wls {
    final /* synthetic */ rsn $emitHolder$inlined;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ z2e0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolygonActionsInteractor$stateChangeListener$lambda$0$$inlined$flatMapMerge$1(Continuation continuation, z2e0 z2e0Var, rsn rsnVar) {
        super(2, continuation);
        this.this$0 = z2e0Var;
        this.$emitHolder$inlined = rsnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PolygonActionsInteractor$stateChangeListener$lambda$0$$inlined$flatMapMerge$1 polygonActionsInteractor$stateChangeListener$lambda$0$$inlined$flatMapMerge$1 = new PolygonActionsInteractor$stateChangeListener$lambda$0$$inlined$flatMapMerge$1(continuation, this.this$0, this.$emitHolder$inlined);
        polygonActionsInteractor$stateChangeListener$lambda$0$$inlined$flatMapMerge$1.L$0 = obj;
        return polygonActionsInteractor$stateChangeListener$lambda$0$$inlined$flatMapMerge$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PolygonActionsInteractor$stateChangeListener$lambda$0$$inlined$flatMapMerge$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        z2e0 z2e0Var = this.this$0;
        rsn rsnVar = this.$emitHolder$inlined;
        nm00 nm00Var = (nm00) rsnVar.a;
        nm00 nm00Var2 = (nm00) rsnVar.b;
        z2e0Var.getClass();
        return kotlinx.coroutines.flow.e.E(new q(new kotlinx.coroutines.flow.g(((uud0) obj2).a), z2e0Var, nm00Var, nm00Var2), kqr.a);
    }
}
