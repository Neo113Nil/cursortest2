package ru.yandex.taxi.altpins.order;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.order.WalkingInfoBlockInteractorImpl$onCancelWalkingRoute$1", f = "WalkingInfoBlockInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class WalkingInfoBlockInteractorImpl$onCancelWalkingRoute$1 extends SuspendLambda implements tls {
    int label;

    public WalkingInfoBlockInteractorImpl$onCancelWalkingRoute$1() {
        super(1, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WalkingInfoBlockInteractorImpl$onCancelWalkingRoute$1(1, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        WalkingInfoBlockInteractorImpl$onCancelWalkingRoute$1 walkingInfoBlockInteractorImpl$onCancelWalkingRoute$1 = (WalkingInfoBlockInteractorImpl$onCancelWalkingRoute$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        walkingInfoBlockInteractorImpl$onCancelWalkingRoute$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return zy11.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
