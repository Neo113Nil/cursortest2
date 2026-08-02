package com.squareup.cash.afterpayapplet.views.floatingtiles;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FloatingTileRowKt$FloatingTileRow$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $isUserScrolling$delegate;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ float $scrollSpeedPxPerSec;
    public float F$0;
    public long J$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingTileRowKt$FloatingTileRow$3$1(float f, LazyListState lazyListState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$scrollSpeedPxPerSec = f;
        this.$listState = lazyListState;
        this.$isUserScrolling$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FloatingTileRowKt$FloatingTileRow$3$1(this.$scrollSpeedPxPerSec, this.$listState, this.$isUserScrolling$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FloatingTileRowKt$FloatingTileRow$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r4, r6) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0059 -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f;
        long j;
        float f2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (((Boolean) this.$isUserScrolling$delegate.getValue()).booleanValue()) {
                return Unit.INSTANCE;
            }
            f = (this.$scrollSpeedPxPerSec * 16.0f) / 1000.0f;
            j = 16;
            this.J$0 = j;
            this.F$0 = f;
            this.label = 1;
            if (PlatformKt.scrollBy(this.$listState, f, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = this.F$0;
            j = this.J$0;
            SafeTrace.throwOnFailure(obj);
            f = f2;
            this.J$0 = j;
            this.F$0 = f;
            this.label = 1;
            if (PlatformKt.scrollBy(this.$listState, f, this) != coroutineSingletons) {
                f2 = f;
                this.J$0 = j;
                this.F$0 = f2;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        f2 = this.F$0;
        j = this.J$0;
        SafeTrace.throwOnFailure(obj);
        this.J$0 = j;
        this.F$0 = f2;
        this.label = 2;
    }
}
