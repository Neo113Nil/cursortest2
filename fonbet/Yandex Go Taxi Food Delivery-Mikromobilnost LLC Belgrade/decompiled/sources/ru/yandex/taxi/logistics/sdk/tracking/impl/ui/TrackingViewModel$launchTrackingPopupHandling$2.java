package ru.yandex.taxi.logistics.sdk.tracking.impl.ui;

import defpackage.dri;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldri;", "popup", "Lzy11;", "<anonymous>", "(Ldri;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.TrackingViewModel$launchTrackingPopupHandling$2", f = "TrackingViewModel.kt", l = {312}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TrackingViewModel$launchTrackingPopupHandling$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingViewModel$launchTrackingPopupHandling$2(Continuation continuation, k kVar) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackingViewModel$launchTrackingPopupHandling$2 trackingViewModel$launchTrackingPopupHandling$2 = new TrackingViewModel$launchTrackingPopupHandling$2(continuation, this.this$0);
        trackingViewModel$launchTrackingPopupHandling$2.L$0 = obj;
        return trackingViewModel$launchTrackingPopupHandling$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackingViewModel$launchTrackingPopupHandling$2) create((dri) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dri driVar = (dri) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n nVar = this.this$0.L;
            this.L$0 = null;
            this.label = 1;
            if (nVar.a(driVar, this) == coroutineSingletons) {
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
