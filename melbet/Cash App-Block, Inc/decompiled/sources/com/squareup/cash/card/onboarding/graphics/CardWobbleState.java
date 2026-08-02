package com.squareup.cash.card.onboarding.graphics;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.glance.session.SessionWorkerKt$runSession$snapshotMonitor$1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.l2$$ExternalSyntheticLambda7;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.ClosedFloatRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;

/* loaded from: classes6.dex */
public final class CardWobbleState {
    public final ParcelableSnapshotMutableState wobbleRotation = Updater.mutableStateOf$default(new Quat(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f));
    public final ParcelableSnapshotMutableState wobbleTranslation = Updater.mutableStateOf$default(new Vector4());

    public static final FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 access$wobbleFlow(CardWobbleState cardWobbleState, CoroutineScope coroutineScope, Quat quat, Vector4 vector4) {
        float[] eulerAngles = quat.toEulerAngles();
        ClosedFloatRange closedFloatRange = new ClosedFloatRange(3.0f, 6.0f);
        ClosedFloatRange closedFloatRange2 = new ClosedFloatRange(8.0f, 16.0f);
        ClosedFloatRange closedFloatRange3 = new ClosedFloatRange(0.1f, 0.2f);
        ClosedFloatRange closedFloatRange4 = new ClosedFloatRange(0.05f, 0.1f);
        int i = 0;
        Animatable Animatable = AnimatableKt.Animatable(eulerAngles[0], 0.01f);
        int i2 = 2;
        Animatable Animatable2 = AnimatableKt.Animatable(eulerAngles[2], 0.01f);
        Animatable Animatable3 = AnimatableKt.Animatable(vector4.vector[1], 0.01f);
        Animatable Animatable4 = AnimatableKt.Animatable(vector4.vector[2], 0.01f);
        Continuation continuation = null;
        CardWobbleState$wobbleFlow$1 cardWobbleState$wobbleFlow$1 = new CardWobbleState$wobbleFlow$1(closedFloatRange, Animatable, continuation, i);
        int i3 = 3;
        JobKt.launch$default(coroutineScope, null, null, cardWobbleState$wobbleFlow$1, 3);
        JobKt.launch$default(coroutineScope, null, null, new CardWobbleState$wobbleFlow$1(closedFloatRange2, Animatable2, continuation, 1), 3);
        JobKt.launch$default(coroutineScope, null, null, new CardWobbleState$wobbleFlow$1(closedFloatRange3, Animatable4, continuation, i2), 3);
        JobKt.launch$default(coroutineScope, null, null, new CardWobbleState$wobbleFlow$1(closedFloatRange4, Animatable3, continuation, i3), 3);
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new l2$$ExternalSyntheticLambda7(Animatable, Animatable2, Animatable3, Animatable4, 21)), 6), new SessionWorkerKt$runSession$snapshotMonitor$1(i2, continuation, i3), i);
    }

    public final Object wobbleCard(SuspendLambda suspendLambda) {
        Object coroutineScope = JobKt.coroutineScope(new CardStudioPresenter$models$1$1(this, (Continuation) null, 14), suspendLambda);
        return coroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineScope : Unit.INSTANCE;
    }

    public final Quat wobbleRotation() {
        return (Quat) this.wobbleRotation.getValue();
    }

    public final Vector4 wobbleTranslation() {
        return (Vector4) this.wobbleTranslation.getValue();
    }
}
