package ru.yandex.taxi.preorder.source;

import defpackage.cqe0;
import defpackage.d0l0;
import defpackage.h5l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lzlm;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.PreorderDrivingRouteProvider$initFlow$7", f = "PreorderDrivingRouteProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PreorderDrivingRouteProvider$initFlow$7 extends SuspendLambda implements zls {
    int label;
    final /* synthetic */ cqe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreorderDrivingRouteProvider$initFlow$7(cqe0 cqe0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cqe0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PreorderDrivingRouteProvider$initFlow$7 preorderDrivingRouteProvider$initFlow$7 = new PreorderDrivingRouteProvider$initFlow$7(this.this$0, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        preorderDrivingRouteProvider$initFlow$7.invokeSuspend(zy11Var);
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
        cqe0 cqe0Var = this.this$0;
        d0l0.Companion.getClass();
        cqe0Var.t = h5l0.a;
        this.this$0.r.a = true;
        return zy11.a;
    }
}
