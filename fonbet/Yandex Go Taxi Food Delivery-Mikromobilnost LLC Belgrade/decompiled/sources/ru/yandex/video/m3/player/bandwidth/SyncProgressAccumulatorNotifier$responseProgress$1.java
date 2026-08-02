package ru.yandex.video.m3.player.bandwidth;

import defpackage.ep4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.bandwidth.SyncProgressAccumulatorNotifier$responseProgress$1", f = "SyncProgressAccumulatorNotifier.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class SyncProgressAccumulatorNotifier$responseProgress$1 extends SuspendLambda implements wls {
    final /* synthetic */ ep4 $bandwidthInfo;
    int label;
    final /* synthetic */ SyncProgressAccumulatorNotifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncProgressAccumulatorNotifier$responseProgress$1(SyncProgressAccumulatorNotifier syncProgressAccumulatorNotifier, ep4 ep4Var, Continuation<? super SyncProgressAccumulatorNotifier$responseProgress$1> continuation) {
        super(2, continuation);
        this.this$0 = syncProgressAccumulatorNotifier;
        this.$bandwidthInfo = ep4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new SyncProgressAccumulatorNotifier$responseProgress$1(this.this$0, this.$bandwidthInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((SyncProgressAccumulatorNotifier$responseProgress$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProgressAccumulatorNotifier progressAccumulatorNotifier;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        progressAccumulatorNotifier = this.this$0.delegate;
        progressAccumulatorNotifier.responseProgress(this.$bandwidthInfo);
        return zy11.a;
    }
}
