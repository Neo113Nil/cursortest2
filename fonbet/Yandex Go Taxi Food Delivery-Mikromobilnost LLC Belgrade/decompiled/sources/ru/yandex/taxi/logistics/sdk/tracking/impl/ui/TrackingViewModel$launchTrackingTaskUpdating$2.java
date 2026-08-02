package ru.yandex.taxi.logistics.sdk.tracking.impl.ui;

import defpackage.c3s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc3s;", "it", "Lzy11;", "<anonymous>", "(Lc3s;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.TrackingViewModel$launchTrackingTaskUpdating$2", f = "TrackingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TrackingViewModel$launchTrackingTaskUpdating$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingViewModel$launchTrackingTaskUpdating$2(Continuation continuation, k kVar) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackingViewModel$launchTrackingTaskUpdating$2(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TrackingViewModel$launchTrackingTaskUpdating$2 trackingViewModel$launchTrackingTaskUpdating$2 = (TrackingViewModel$launchTrackingTaskUpdating$2) create((c3s) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        trackingViewModel$launchTrackingTaskUpdating$2.invokeSuspend(zy11Var);
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
        this.this$0.C.b();
        return zy11.a;
    }
}
