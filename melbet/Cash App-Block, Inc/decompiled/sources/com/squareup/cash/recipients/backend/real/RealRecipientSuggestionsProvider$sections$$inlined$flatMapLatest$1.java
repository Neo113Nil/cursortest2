package com.squareup.cash.recipients.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealRecipientSuggestionsProvider$sections$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ boolean $includeNonCashUsers$inlined;
    public final /* synthetic */ RealRecipientSuggestionsProvider$sections$$inlined$map$1 $suggestionsStream$inlined;
    public final /* synthetic */ Set $supportedRegions$inlined;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ RealRecipientSuggestionsProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealRecipientSuggestionsProvider$sections$$inlined$flatMapLatest$1(Continuation continuation, RealRecipientSuggestionsProvider$sections$$inlined$map$1 realRecipientSuggestionsProvider$sections$$inlined$map$1, RealRecipientSuggestionsProvider realRecipientSuggestionsProvider, boolean z, Set set) {
        super(3, continuation);
        this.$suggestionsStream$inlined = realRecipientSuggestionsProvider$sections$$inlined$map$1;
        this.this$0 = realRecipientSuggestionsProvider;
        this.$includeNonCashUsers$inlined = z;
        this.$supportedRegions$inlined = set;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RealRecipientSuggestionsProvider$sections$$inlined$flatMapLatest$1 realRecipientSuggestionsProvider$sections$$inlined$flatMapLatest$1 = new RealRecipientSuggestionsProvider$sections$$inlined$flatMapLatest$1((Continuation) obj3, this.$suggestionsStream$inlined, this.this$0, this.$includeNonCashUsers$inlined, this.$supportedRegions$inlined);
        realRecipientSuggestionsProvider$sections$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        realRecipientSuggestionsProvider$sections$$inlined$flatMapLatest$1.L$1 = obj2;
        return realRecipientSuggestionsProvider$sections$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector = this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            FlowKt.ensureActive(flowCollector);
            Object collect = this.$suggestionsStream$inlined.collect(new RealRecipientSuggestionsProvider$sections$lambda$1$$inlined$map$1$2(flowCollector, (String) obj2, this.this$0, this.$includeNonCashUsers$inlined, this.$supportedRegions$inlined), this);
            if (collect != coroutineSingletons) {
                collect = Unit.INSTANCE;
            }
            if (collect != coroutineSingletons) {
                collect = Unit.INSTANCE;
            }
            if (collect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
