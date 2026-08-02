package ru.yandex.taxi.logistics.sdk.tracking.preparer.skeleton;

import defpackage.f4c;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ljava/util/UUID;", "it", "Lzy11;", "<anonymous>", "(Ljava/util/Set;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.preparer.skeleton.TrackingSkeletonViewModel$subscribeOnLocalDeliveriesFailed$1", f = "TrackingSkeletonViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TrackingSkeletonViewModel$subscribeOnLocalDeliveriesFailed$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingSkeletonViewModel$subscribeOnLocalDeliveriesFailed$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackingSkeletonViewModel$subscribeOnLocalDeliveriesFailed$1 trackingSkeletonViewModel$subscribeOnLocalDeliveriesFailed$1 = new TrackingSkeletonViewModel$subscribeOnLocalDeliveriesFailed$1(this.this$0, continuation);
        trackingSkeletonViewModel$subscribeOnLocalDeliveriesFailed$1.L$0 = obj;
        return trackingSkeletonViewModel$subscribeOnLocalDeliveriesFailed$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TrackingSkeletonViewModel$subscribeOnLocalDeliveriesFailed$1 trackingSkeletonViewModel$subscribeOnLocalDeliveriesFailed$1 = (TrackingSkeletonViewModel$subscribeOnLocalDeliveriesFailed$1) create((Set) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        trackingSkeletonViewModel$subscribeOnLocalDeliveriesFailed$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set set = (Set) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (set.contains(this.this$0.b.a)) {
            this.this$0.c.a(f4c.a);
        }
        return zy11.a;
    }
}
