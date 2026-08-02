package com.squareup.cash.card.onboarding.graphics;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
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
public final class WandActivationSuccessEffectKt$WandActivationSuccessAnimation$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableFloatState $bobbleTime$delegate;
    public final /* synthetic */ ActivationSuccessConfig $config;
    public final /* synthetic */ MutableFloatState $fadeOpacity$delegate;
    public final /* synthetic */ boolean $isPlaying;
    public final /* synthetic */ MutableFloatState $sweepProgress$delegate;
    public long J$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WandActivationSuccessEffectKt$WandActivationSuccessAnimation$1$1(boolean z, ActivationSuccessConfig activationSuccessConfig, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableFloatState mutableFloatState3, Continuation continuation) {
        super(2, continuation);
        this.$isPlaying = z;
        this.$config = activationSuccessConfig;
        this.$fadeOpacity$delegate = mutableFloatState;
        this.$sweepProgress$delegate = mutableFloatState2;
        this.$bobbleTime$delegate = mutableFloatState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WandActivationSuccessEffectKt$WandActivationSuccessAnimation$1$1(this.$isPlaying, this.$config, this.$fadeOpacity$delegate, this.$sweepProgress$delegate, this.$bobbleTime$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WandActivationSuccessEffectKt$WandActivationSuccessAnimation$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r10 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003c, code lost:
    
        if (r10 == r0) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long longValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (!this.$isPlaying) {
                return Unit.INSTANCE;
            }
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
            longValue = this.J$0;
            SafeTrace.throwOnFailure(obj);
            long longValue2 = ((Number) obj).longValue();
            float f = (longValue2 - longValue) / 1.0E9f;
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) this.$fadeOpacity$delegate;
            if (parcelableSnapshotMutableFloatState.getFloatValue() < 1.0f) {
                float floatValue = parcelableSnapshotMutableFloatState.getFloatValue();
                this.$config.getClass();
                float f2 = (f / 0.4f) + floatValue;
                parcelableSnapshotMutableFloatState.setFloatValue(f2 <= 1.0f ? f2 : 1.0f);
            } else {
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = (ParcelableSnapshotMutableFloatState) this.$sweepProgress$delegate;
                if (parcelableSnapshotMutableFloatState2.getFloatValue() < 1.0f) {
                    float floatValue2 = (f / 2.6333334f) + parcelableSnapshotMutableFloatState2.getFloatValue();
                    parcelableSnapshotMutableFloatState2.setFloatValue(floatValue2 <= 1.0f ? floatValue2 : 1.0f);
                } else {
                    ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState3 = (ParcelableSnapshotMutableFloatState) this.$bobbleTime$delegate;
                    parcelableSnapshotMutableFloatState3.setFloatValue(parcelableSnapshotMutableFloatState3.getFloatValue() + f);
                }
            }
            longValue = longValue2;
            CardStudioQueries$$ExternalSyntheticLambda3 cardStudioQueries$$ExternalSyntheticLambda32 = new CardStudioQueries$$ExternalSyntheticLambda3(11);
            this.J$0 = longValue;
            this.label = 2;
            obj = Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, cardStudioQueries$$ExternalSyntheticLambda32);
        }
        longValue = ((Number) obj).longValue();
        CardStudioQueries$$ExternalSyntheticLambda3 cardStudioQueries$$ExternalSyntheticLambda322 = new CardStudioQueries$$ExternalSyntheticLambda3(11);
        this.J$0 = longValue;
        this.label = 2;
        obj = Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, cardStudioQueries$$ExternalSyntheticLambda322);
    }
}
