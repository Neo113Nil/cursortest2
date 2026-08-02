package com.squareup.cash.offers.presenters;

import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class OffersHomePresenter$models$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ OffersHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersHomePresenter$models$1$1$1(OffersHomePresenter offersHomePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = offersHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        OffersHomePresenter offersHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new OffersHomePresenter$models$1$1$1(offersHomePresenter, continuation, 0);
            default:
                return new OffersHomePresenter$models$1$1$1(offersHomePresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((OffersHomePresenter$models$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((OffersHomePresenter$models$1$1$1) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        OffersHomePresenter offersHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                offersHomePresenter.clientSyncer.sync(SyncTrigger.BLOCKING_USER_ACTION, SyncScope.Global.INSTANCE);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                offersHomePresenter.analytics.clearCache();
                break;
        }
        return Unit.INSTANCE;
    }
}
