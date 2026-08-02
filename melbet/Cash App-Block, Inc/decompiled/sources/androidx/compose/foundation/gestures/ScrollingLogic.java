package androidx.compose.foundation.gestures;

import android.view.ViewTreeObserver;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda4;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Velocity;
import androidx.datastore.core.SimpleActor;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.util.coroutines.TickerKt$tickerFlow$1;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ScrollingLogic {
    public FlingBehavior flingBehavior;
    public boolean isFlinging;
    public final ScrollableNode$$ExternalSyntheticLambda0 isScrollableNodeAttached;
    public SimpleActor nestedScrollDispatcher;
    public final ScrollableNode onScrollChangedDispatcher;
    public Orientation orientation;
    public AndroidEdgeEffectOverscrollEffect overscrollEffect;
    public boolean reverseDirection;
    public ScrollableState scrollableState;
    public int latestScrollSource = 1;
    public ScrollScope outerStateScope = ScrollableKt.NoOpScrollScope;
    public final ScrollingLogic$nestedScrollScope$1 nestedScrollScope = new ScrollingLogic$nestedScrollScope$1(this);
    public final CashApp$$ExternalSyntheticLambda2 performScrollForOverscroll = new CashApp$$ExternalSyntheticLambda2(this, 4);

    public ScrollingLogic(ScrollableState scrollableState, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean z, SimpleActor simpleActor, ScrollableNode scrollableNode, ScrollableNode$$ExternalSyntheticLambda0 scrollableNode$$ExternalSyntheticLambda0) {
        this.scrollableState = scrollableState;
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.flingBehavior = flingBehavior;
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = simpleActor;
        this.onScrollChangedDispatcher = scrollableNode;
        this.isScrollableNodeAttached = scrollableNode$$ExternalSyntheticLambda0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m243doFlingAnimationQWom1Mo(long j, ContinuationImpl continuationImpl) {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        int i;
        ScrollingLogic scrollingLogic;
        Throwable th;
        Ref$LongRef ref$LongRef;
        if (continuationImpl instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) continuationImpl;
            int i2 = scrollingLogic$doFlingAnimation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                scrollingLogic$doFlingAnimation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = scrollingLogic$doFlingAnimation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollingLogic$doFlingAnimation$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                    ref$LongRef2.element = j;
                    this.isFlinging = true;
                    try {
                        MutatePriority mutatePriority = MutatePriority.Default;
                        scrollingLogic = this;
                        try {
                            ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(scrollingLogic, ref$LongRef2, j, null);
                            scrollingLogic$doFlingAnimation$1.L$0 = ref$LongRef2;
                            scrollingLogic$doFlingAnimation$1.label = 1;
                            if (scrollingLogic.scroll(mutatePriority, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ref$LongRef = ref$LongRef2;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            scrollingLogic.isFlinging = false;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        scrollingLogic = this;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$LongRef = scrollingLogic$doFlingAnimation$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        scrollingLogic = this;
                    } catch (Throwable th4) {
                        th = th4;
                        scrollingLogic = this;
                        scrollingLogic.isFlinging = false;
                        throw th;
                    }
                }
                scrollingLogic.isFlinging = false;
                return Velocity.m1064boximpl(ref$LongRef.element);
            }
        }
        scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuationImpl);
        Object obj2 = scrollingLogic$doFlingAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollingLogic$doFlingAnimation$1.label;
        if (i != 0) {
        }
        scrollingLogic.isFlinging = false;
        return Velocity.m1064boximpl(ref$LongRef.element);
    }

    /* renamed from: onScrollStopped-BMRW4eQ, reason: not valid java name */
    public final Object m244onScrollStoppedBMRW4eQ(long j, boolean z, SuspendLambda suspendLambda) {
        if (z) {
            FlingBehavior flingBehavior = this.flingBehavior;
            ScrollState$$ExternalSyntheticLambda4 scrollState$$ExternalSyntheticLambda4 = ScrollableKt.CanDragCalculation;
            if (flingBehavior instanceof DefaultFlingBehavior) {
                return Unit.INSTANCE;
            }
        }
        int i = 1;
        long m1065copyOhffZ5M$default = this.orientation == Orientation.Horizontal ? Velocity.m1065copyOhffZ5M$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1, j) : Velocity.m1065copyOhffZ5M$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 2, j);
        TickerKt$tickerFlow$1 tickerKt$tickerFlow$1 = new TickerKt$tickerFlow$1(this, (Continuation) null, i);
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.overscrollEffect;
        if (androidEdgeEffectOverscrollEffect == null || !(this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward())) {
            Object invoke = tickerKt$tickerFlow$1.invoke(Velocity.m1064boximpl(m1065copyOhffZ5M$default), suspendLambda);
            return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : Unit.INSTANCE;
        }
        Object m165applyToFlingBMRW4eQ = androidEdgeEffectOverscrollEffect.m165applyToFlingBMRW4eQ(m1065copyOhffZ5M$default, tickerKt$tickerFlow$1, suspendLambda);
        return m165applyToFlingBMRW4eQ == CoroutineSingletons.COROUTINE_SUSPENDED ? m165applyToFlingBMRW4eQ : Unit.INSTANCE;
    }

    /* renamed from: performScroll-3eAAhYA, reason: not valid java name */
    public final long m245performScroll3eAAhYA(ScrollScope scrollScope, long j, int i) {
        NestedScrollNode nestedScrollNode = (NestedScrollNode) this.nestedScrollDispatcher.consumeMessage;
        NestedScrollNode parentNestedScrollNode$ui = nestedScrollNode != null ? nestedScrollNode.getParentNestedScrollNode$ui() : null;
        long mo326onPreScrollOzD1aCk = parentNestedScrollNode$ui != null ? parentNestedScrollNode$ui.mo326onPreScrollOzD1aCk(i, j) : 0L;
        long m625minusMKHz9U = Offset.m625minusMKHz9U(j, mo326onPreScrollOzD1aCk);
        long m246reverseIfNeededMKHz9U = m246reverseIfNeededMKHz9U(m248toOffsettuRUvjQ(scrollScope.scrollBy(m247toFloatk4lQ0M(m246reverseIfNeededMKHz9U(this.orientation == Orientation.Horizontal ? Offset.m620copydBAh8RU$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1, m625minusMKHz9U) : Offset.m620copydBAh8RU$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 2, m625minusMKHz9U))))));
        ScrollableNode scrollableNode = this.onScrollChangedDispatcher;
        if (scrollableNode.isAttached()) {
            ViewTreeObserver viewTreeObserver = ((AndroidComposeView) DepthSortedSetKt.requireOwner(scrollableNode)).getViewTreeObserver();
            try {
                if (AndroidComposeView.dispatchOnScrollChangedMethod == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.dispatchOnScrollChangedMethod = declaredMethod;
                }
                Method method = AndroidComposeView.dispatchOnScrollChangedMethod;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long m625minusMKHz9U2 = Offset.m625minusMKHz9U(m625minusMKHz9U, m246reverseIfNeededMKHz9U);
        NestedScrollNode nestedScrollNode2 = (NestedScrollNode) this.nestedScrollDispatcher.consumeMessage;
        NestedScrollNode parentNestedScrollNode$ui2 = nestedScrollNode2 != null ? nestedScrollNode2.getParentNestedScrollNode$ui() : null;
        return Offset.m626plusMKHz9U(Offset.m626plusMKHz9U(mo326onPreScrollOzD1aCk, m246reverseIfNeededMKHz9U), parentNestedScrollNode$ui2 != null ? parentNestedScrollNode$ui2.mo242onPostScrollDzOQY0M(i, m246reverseIfNeededMKHz9U, m625minusMKHz9U2) : 0L);
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1.0f) : f;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m246reverseIfNeededMKHz9U(long j) {
        return this.reverseDirection ? Offset.m627timestuRUvjQ(j, -1.0f) : j;
    }

    public final Object scroll(MutatePriority mutatePriority, Function2 function2, ContinuationImpl continuationImpl) {
        Object scroll = this.scrollableState.scroll(mutatePriority, new SliderDraggableState$drag$2(this, function2, (Continuation) null, 22), continuationImpl);
        return scroll == CoroutineSingletons.COROUTINE_SUSPENDED ? scroll : Unit.INSTANCE;
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m247toFloatk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j >> 32 : j & BodyPartID.bodyIdMax));
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m248toOffsettuRUvjQ(float f) {
        if (f == RecyclerView.DECELERATION_RATE) {
            return 0L;
        }
        if (this.orientation == Orientation.Horizontal) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax);
        }
        return (Float.floatToRawIntBits(f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32);
    }

    /* renamed from: toSingleAxisDeltaFromAngle-k-4lQ0M, reason: not valid java name */
    public final float m249toSingleAxisDeltaFromAnglek4lQ0M(long j) {
        int i = (int) (BodyPartID.bodyIdMax & j);
        int i2 = (int) (j >> 32);
        double atan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        Orientation orientation = this.orientation;
        return atan2 >= 0.7853981633974483d ? orientation == Orientation.Vertical ? Float.intBitsToFloat(i) : RecyclerView.DECELERATION_RATE : orientation == Orientation.Horizontal ? Float.intBitsToFloat(i2) : RecyclerView.DECELERATION_RATE;
    }
}
