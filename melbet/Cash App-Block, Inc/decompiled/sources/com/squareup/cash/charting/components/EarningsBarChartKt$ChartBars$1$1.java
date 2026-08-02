package com.squareup.cash.charting.components;

import androidx.compose.animation.core.Animatable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class EarningsBarChartKt$ChartBars$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ long $animationIntervalDurationMs;
    public final /* synthetic */ List $barAnimations;
    public final /* synthetic */ EarningsBarChartConfig $barChartConfig;
    public int I$0;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Iterator L$2;
    public Animatable L$4;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsBarChartKt$ChartBars$1$1(EarningsBarChartConfig earningsBarChartConfig, List list, long j, Continuation continuation) {
        super(2, continuation);
        this.$barChartConfig = earningsBarChartConfig;
        this.$barAnimations = list;
        this.$animationIntervalDurationMs = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EarningsBarChartKt$ChartBars$1$1 earningsBarChartKt$ChartBars$1$1 = new EarningsBarChartKt$ChartBars$1$1(this.$barChartConfig, this.$barAnimations, this.$animationIntervalDurationMs, continuation);
        earningsBarChartKt$ChartBars$1$1.L$0 = obj;
        return earningsBarChartKt$ChartBars$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EarningsBarChartKt$ChartBars$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0067 -> B:5:0x006a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        Iterator it;
        int i;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 0;
        Continuation continuation = null;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            if (!this.$barChartConfig.animationEnabled) {
                return Unit.INSTANCE;
            }
            Iterator it2 = this.$barAnimations.iterator();
            j = this.$animationIntervalDurationMs;
            it = it2;
            i = 0;
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.I$0;
        j = this.J$0;
        Animatable animatable = this.L$4;
        it = this.L$2;
        SafeTrace.throwOnFailure(obj);
        JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable, continuation, i3), 3);
        while (it.hasNext()) {
            animatable = (Animatable) it.next();
            if (((Number) animatable.getValue()).floatValue() != 1.0f) {
                this.L$0 = coroutineScope;
                this.L$2 = it;
                this.L$4 = animatable;
                this.J$0 = j;
                this.I$0 = i;
                this.label = 1;
                if (JobKt.delay(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1(animatable, continuation, i3), 3);
                while (it.hasNext()) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
