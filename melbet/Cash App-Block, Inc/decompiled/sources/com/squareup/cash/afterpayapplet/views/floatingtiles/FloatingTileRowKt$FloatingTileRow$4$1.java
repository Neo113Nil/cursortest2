package com.squareup.cash.afterpayapplet.views.floatingtiles;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class FloatingTileRowKt$FloatingTileRow$4$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $phase$delegate;
    public final /* synthetic */ long $waveCycleDurationMs;
    public final /* synthetic */ double $waveLengthDistance;
    public double D$0;
    public long J$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingTileRowKt$FloatingTileRow$4$1(double d, long j, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$waveLengthDistance = d;
        this.$waveCycleDurationMs = j;
        this.$phase$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FloatingTileRowKt$FloatingTileRow$4$1(this.$waveLengthDistance, this.$waveCycleDurationMs, this.$phase$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((FloatingTileRowKt$FloatingTileRow$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        double d;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        double d2 = this.$waveLengthDistance;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            d = (16.0d * d2) / this.$waveCycleDurationMs;
            j = 16;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d = this.D$0;
            j = this.J$0;
            SafeTrace.throwOnFailure(obj);
        }
        do {
            MutableState mutableState = this.$phase$delegate;
            mutableState.setValue(Double.valueOf((((Number) mutableState.getValue()).doubleValue() + d) % d2));
            this.J$0 = j;
            this.D$0 = d;
            this.label = 1;
        } while (JobKt.delay(j, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
