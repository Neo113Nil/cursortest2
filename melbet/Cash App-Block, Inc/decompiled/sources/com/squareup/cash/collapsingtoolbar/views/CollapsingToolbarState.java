package com.squareup.cash.collapsingtoolbar.views;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CollapsingToolbarState implements ScrollableState {
    public float deferredConsumption;
    public final ParcelableSnapshotMutableIntState height$delegate = new ParcelableSnapshotMutableIntState(Integer.MAX_VALUE);
    public final ParcelableSnapshotMutableIntState maxHeightState$delegate = new ParcelableSnapshotMutableIntState(Integer.MAX_VALUE);
    public final ParcelableSnapshotMutableIntState minHeightState$delegate = new ParcelableSnapshotMutableIntState(0);
    public final DefaultScrollableState scrollableState = new DefaultScrollableState(new CaptureCheckFaceKt$$ExternalSyntheticLambda12(this, 23));

    public static Object collapse$default(CollapsingToolbarState collapsingToolbarState, SuspendLambda suspendLambda) {
        Object scroll = collapsingToolbarState.scroll(MutatePriority.Default, new RealProfileManager$setPhoto$2(AnimatableKt.AnimationState$default(collapsingToolbarState.height$delegate.getIntValue(), RecyclerView.DECELERATION_RATE, 30), collapsingToolbarState, (Continuation) null, 6), suspendLambda);
        return scroll == CoroutineSingletons.COROUTINE_SUSPENDED ? scroll : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    public final Object expand(int i, SuspendLambda suspendLambda) {
        Object scroll = scroll(MutatePriority.Default, new GovernmentIdFeed$analyze$5(AnimatableKt.AnimationState$default(this.height$delegate.getIntValue(), RecyclerView.DECELERATION_RATE, 30), this, i, (Continuation) null, 4), suspendLambda);
        return scroll == CoroutineSingletons.COROUTINE_SUSPENDED ? scroll : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fling(FlingBehavior flingBehavior, float f, ContinuationImpl continuationImpl) {
        CollapsingToolbarState$fling$1 collapsingToolbarState$fling$1;
        int i;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof CollapsingToolbarState$fling$1) {
            collapsingToolbarState$fling$1 = (CollapsingToolbarState$fling$1) continuationImpl;
            int i2 = collapsingToolbarState$fling$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                collapsingToolbarState$fling$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = collapsingToolbarState$fling$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = collapsingToolbarState$fling$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    ref$FloatRef2.element = f;
                    Function2 verifyCheckDepositPresenter$models$3$1 = new VerifyCheckDepositPresenter$models$3$1(flingBehavior, ref$FloatRef2, null);
                    collapsingToolbarState$fling$1.L$1 = ref$FloatRef2;
                    collapsingToolbarState$fling$1.label = 1;
                    if (scroll(MutatePriority.Default, verifyCheckDepositPresenter$models$3$1, collapsingToolbarState$fling$1) == obj2) {
                        return obj2;
                    }
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$FloatRef = collapsingToolbarState$fling$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                return new Float(ref$FloatRef.element);
            }
        }
        collapsingToolbarState$fling$1 = new CollapsingToolbarState$fling$1(this, continuationImpl);
        Object obj3 = collapsingToolbarState$fling$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = collapsingToolbarState$fling$1.label;
        if (i != 0) {
        }
        return new Float(ref$FloatRef.element);
    }

    public final float getProgress() {
        return this.minHeightState$delegate.getIntValue() == this.maxHeightState$delegate.getIntValue() ? RecyclerView.DECELERATION_RATE : RangesKt___RangesKt.coerceIn((this.height$delegate.getIntValue() - r0.getIntValue()) / (r2.getIntValue() - r0.getIntValue()), RecyclerView.DECELERATION_RATE, 1.0f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object scroll(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object scroll = this.scrollableState.scroll(mutatePriority, function2, continuation);
        return scroll == CoroutineSingletons.COROUTINE_SUSPENDED ? scroll : Unit.INSTANCE;
    }
}
