package com.squareup.cash.card.onboarding.graphics;

import android.os.SystemClock;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class FlowsKt$tickerFlow$2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ long $periodMillis;
    public long J$0;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowsKt$tickerFlow$2(long j, Continuation continuation) {
        super(3, continuation);
        this.$periodMillis = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        FlowsKt$tickerFlow$2 flowsKt$tickerFlow$2 = new FlowsKt$tickerFlow$2(this.$periodMillis, (Continuation) obj3);
        flowsKt$tickerFlow$2.L$0 = (FlowCollector) obj;
        flowsKt$tickerFlow$2.Z$0 = booleanValue;
        return flowsKt$tickerFlow$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        if (r0.emit(r13, r12) == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r10 - (r8 % r10), r12) == r2) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005a -> B:6:0x002c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long elapsedRealtime;
        FlowCollector flowCollector = this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (!z) {
                return Unit.INSTANCE;
            }
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else if (i == 1) {
            elapsedRealtime = this.J$0;
            SafeTrace.throwOnFailure(obj);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            long j = this.$periodMillis;
            this.L$0 = flowCollector;
            this.Z$0 = z;
            this.J$0 = elapsedRealtime;
            this.label = 2;
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            elapsedRealtime = this.J$0;
            SafeTrace.throwOnFailure(obj);
        }
        Long l = new Long(SystemClock.elapsedRealtime() - elapsedRealtime);
        this.L$0 = flowCollector;
        this.Z$0 = z;
        this.J$0 = elapsedRealtime;
        this.label = 1;
    }
}
