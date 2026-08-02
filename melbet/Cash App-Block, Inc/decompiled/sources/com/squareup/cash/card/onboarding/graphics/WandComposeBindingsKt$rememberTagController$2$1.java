package com.squareup.cash.card.onboarding.graphics;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class WandComposeBindingsKt$rememberTagController$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ TagPoseController $controller;
    public final /* synthetic */ MutableState $output;
    public long J$0;
    public long J$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WandComposeBindingsKt$rememberTagController$2$1(TagPoseController tagPoseController, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$controller = tagPoseController;
        this.$output = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WandComposeBindingsKt$rememberTagController$2$1(this.$controller, this.$output, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((WandComposeBindingsKt$rememberTagController$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0058 -> B:6:0x005b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long longValue;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CardStudioQueries$$ExternalSyntheticLambda3 cardStudioQueries$$ExternalSyntheticLambda3 = new CardStudioQueries$$ExternalSyntheticLambda3(11);
            this.label = 1;
            obj = Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, cardStudioQueries$$ExternalSyntheticLambda3);
        } else if (i == 1) {
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            longValue = this.J$1;
            j = this.J$0;
            SafeTrace.throwOnFailure(obj);
            long longValue2 = ((Number) obj).longValue();
            float f = (longValue2 - j) / 1.0E9f;
            float f2 = (longValue2 - longValue) / 1.0E9f;
            TagPoseController tagPoseController = this.$controller;
            if (tagPoseController.isAnimating()) {
                this.$output.setValue(tagPoseController.tick(f, f2));
            }
            longValue = longValue2;
            CardStudioQueries$$ExternalSyntheticLambda3 cardStudioQueries$$ExternalSyntheticLambda32 = new CardStudioQueries$$ExternalSyntheticLambda3(11);
            this.J$0 = j;
            this.J$1 = longValue;
            this.label = 2;
            obj = Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, cardStudioQueries$$ExternalSyntheticLambda32);
        }
        longValue = ((Number) obj).longValue();
        j = longValue;
        CardStudioQueries$$ExternalSyntheticLambda3 cardStudioQueries$$ExternalSyntheticLambda322 = new CardStudioQueries$$ExternalSyntheticLambda3(11);
        this.J$0 = j;
        this.J$1 = longValue;
        this.label = 2;
        obj = Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, cardStudioQueries$$ExternalSyntheticLambda322);
    }
}
