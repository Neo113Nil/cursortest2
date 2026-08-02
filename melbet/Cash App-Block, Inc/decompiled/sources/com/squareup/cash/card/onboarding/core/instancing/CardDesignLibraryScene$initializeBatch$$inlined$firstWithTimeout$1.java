package com.squareup.cash.card.onboarding.core.instancing;

import androidx.datastore.core.DataStoreImpl$data$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StateFlow $this_firstWithTimeout;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1(StateFlow stateFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_firstWithTimeout = stateFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1(this.$this_firstWithTimeout, continuation, 0);
            case 1:
                return new CardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1(this.$this_firstWithTimeout, continuation, 1);
            default:
                return new CardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1(this.$this_firstWithTimeout, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardDesignLibraryScene$initializeBatch$$inlined$firstWithTimeout$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 2;
        StateFlow stateFlow = this.$this_firstWithTimeout;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                DataStoreImpl$data$1.AnonymousClass2 anonymousClass2 = new DataStoreImpl$data$1.AnonymousClass2(i2, continuation, 14);
                this.label = 1;
                Object first = FlowKt.first(stateFlow, anonymousClass2, this);
                return first == coroutineSingletons ? coroutineSingletons : first;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                DataStoreImpl$data$1.AnonymousClass2 anonymousClass22 = new DataStoreImpl$data$1.AnonymousClass2(i2, continuation, 13);
                this.label = 1;
                Object first2 = FlowKt.first(stateFlow, anonymousClass22, this);
                return first2 == coroutineSingletons2 ? coroutineSingletons2 : first2;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                DataStoreImpl$data$1.AnonymousClass2 anonymousClass23 = new DataStoreImpl$data$1.AnonymousClass2(i2, continuation, 15);
                this.label = 1;
                Object first3 = FlowKt.first(stateFlow, anonymousClass23, this);
                return first3 == coroutineSingletons3 ? coroutineSingletons3 : first3;
        }
    }
}
