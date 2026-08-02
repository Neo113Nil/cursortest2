package com.squareup.cash.clientsync.persistence;

import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class BootstrappedSyncEntityStore$getAllValuesOfTypeFlow$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BootstrappedSyncEntityStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BootstrappedSyncEntityStore$getAllValuesOfTypeFlow$1(BootstrappedSyncEntityStore bootstrappedSyncEntityStore, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = bootstrappedSyncEntityStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        BootstrappedSyncEntityStore bootstrappedSyncEntityStore = this.this$0;
        switch (i) {
            case 0:
                return new BootstrappedSyncEntityStore$getAllValuesOfTypeFlow$1(bootstrappedSyncEntityStore, continuation, 0);
            default:
                return new BootstrappedSyncEntityStore$getAllValuesOfTypeFlow$1(bootstrappedSyncEntityStore, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BootstrappedSyncEntityStore$getAllValuesOfTypeFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        BootstrappedSyncEntityStore bootstrappedSyncEntityStore = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                bootstrappedSyncEntityStore.ensureBootstrapped(new CardScene$$ExternalSyntheticLambda1(26));
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                bootstrappedSyncEntityStore.ensureBootstrapped(new CardScene$$ExternalSyntheticLambda1(25));
                break;
        }
        return Unit.INSTANCE;
    }
}
