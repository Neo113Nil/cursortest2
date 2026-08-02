package androidx.compose.foundation.pager;

import androidx.biometric.BiometricPrompt;
import androidx.camera.video.Recorder;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.CachedItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzg;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import net.oneformapp.schema.Schema;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class PagerState implements ScrollableState {
    public float accumulator;
    public PagerMeasureResult approachLayoutInfo;
    public final AwaitFirstLayoutModifier awaitLayoutModifier;
    public final Recorder.AnonymousClass6 beyondBoundsInfo;
    public final PagerCacheWindowLogic cacheWindowLogic;
    public final ParcelableSnapshotMutableState canScrollBackward$delegate;
    public final ParcelableSnapshotMutableState canScrollForward$delegate;
    public Density density;
    public int firstVisiblePage;
    public int firstVisiblePageOffset;
    public boolean hasLookaheadOccurred;
    public final MutableInteractionSourceImpl internalInteractionSource;
    public final ParcelableSnapshotMutableState isLastScrollBackwardState;
    public final ParcelableSnapshotMutableState isLastScrollForwardState;
    public int latestPageSizeWithSpacing;
    public long maxScrollOffset;
    public final MutableState measurementScopeInvalidator;
    public long minScrollOffset;
    public final ParcelableSnapshotMutableState pagerLayoutInfoState;
    public final LazyLayoutPinnedItemList pinnedPages;
    public final MutableState placementScopeInvalidator;
    public final LazyLayoutPrefetchState prefetchState;
    public final boolean prefetchingEnabled;
    public float previousPassDelta;
    public final ParcelableSnapshotMutableIntState programmaticScrollTargetPage$delegate;
    public final ParcelableSnapshotMutableState remeasurement$delegate;
    public final PagerState$remeasurementModifier$1 remeasurementModifier;
    public final Schema scrollPosition;
    public final DefaultScrollableState scrollableState;
    public final DerivedSnapshotState settledPage$delegate;
    public final ParcelableSnapshotMutableIntState settledPageState$delegate;
    public final DerivedSnapshotState targetPage$delegate;
    public final ParcelableSnapshotMutableState upDownDifference$delegate;

    public PagerState(float f, int i) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            InlineClassHelperKt.throwIllegalArgumentException("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.upDownDifference$delegate = Updater.mutableStateOf$default(new Offset(0L));
        this.scrollPosition = new Schema(i, f, this);
        this.firstVisiblePage = i;
        this.maxScrollOffset = Long.MAX_VALUE;
        final int i2 = 0;
        this.scrollableState = new DefaultScrollableState(new Function1(this) { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda0
            public final /* synthetic */ PagerState f$0;

            {
                this.f$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Long] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                PagerMeasureResult pagerMeasureResult;
                int i3 = i2;
                PagerMeasureResult pagerMeasureResult2 = null;
                PagerState pagerState = this.f$0;
                switch (i3) {
                    case 0:
                        ?? r14 = (Float) obj;
                        float floatValue = r14.floatValue();
                        long currentAbsoluteScrollOffset = ComposeUtilsKt.currentAbsoluteScrollOffset(pagerState);
                        float f2 = pagerState.accumulator + floatValue;
                        long roundToLong = MathKt__MathJVMKt.roundToLong(f2);
                        pagerState.accumulator = f2 - roundToLong;
                        if (Math.abs(floatValue) >= 1.0E-4f) {
                            long j = currentAbsoluteScrollOffset + roundToLong;
                            long coerceIn = RangesKt___RangesKt.coerceIn(j, pagerState.minScrollOffset, pagerState.maxScrollOffset);
                            ?? r0 = j != coerceIn;
                            long j2 = coerceIn - currentAbsoluteScrollOffset;
                            float f3 = j2;
                            pagerState.previousPassDelta = f3;
                            long abs = Math.abs(j2);
                            float f4 = RecyclerView.DECELERATION_RATE;
                            if (abs != 0) {
                                pagerState.isLastScrollForwardState.setValue(Boolean.valueOf(f3 > RecyclerView.DECELERATION_RATE));
                                pagerState.isLastScrollBackwardState.setValue(Boolean.valueOf(f3 < RecyclerView.DECELERATION_RATE));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            PagerMeasureResult copyWithScrollDeltaWithoutRemeasure = ((PagerMeasureResult) pagerState.pagerLayoutInfoState.getValue()).copyWithScrollDeltaWithoutRemeasure(i5);
                            if (copyWithScrollDeltaWithoutRemeasure != null && (pagerMeasureResult = pagerState.approachLayoutInfo) != null) {
                                PagerMeasureResult copyWithScrollDeltaWithoutRemeasure2 = pagerMeasureResult.copyWithScrollDeltaWithoutRemeasure(i5);
                                if (copyWithScrollDeltaWithoutRemeasure2 != null) {
                                    pagerState.approachLayoutInfo = copyWithScrollDeltaWithoutRemeasure2;
                                }
                                if (pagerMeasureResult2 == null) {
                                    pagerState.applyMeasureResult$foundation(pagerMeasureResult2, pagerState.hasLookaheadOccurred, true);
                                    LazyLayoutKt.m324invalidateScopeimpl(pagerState.placementScopeInvalidator);
                                } else {
                                    Schema schema = pagerState.scrollPosition;
                                    PagerState pagerState2 = (PagerState) schema.mappedElements;
                                    ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) schema.fieldSortOrder;
                                    if (pagerState2.getPageSizeWithSpacing$foundation() != 0) {
                                        f4 = i4 / pagerState2.getPageSizeWithSpacing$foundation();
                                    }
                                    parcelableSnapshotMutableFloatState.setFloatValue(parcelableSnapshotMutableFloatState.getFloatValue() + f4);
                                    LayoutNode layoutNode = (LayoutNode) pagerState.remeasurement$delegate.getValue();
                                    if (layoutNode != null) {
                                        layoutNode.forceRemeasure();
                                    }
                                }
                                if (r0 != false) {
                                    r14 = Long.valueOf(j2);
                                }
                                floatValue = r14.floatValue();
                            }
                            pagerMeasureResult2 = copyWithScrollDeltaWithoutRemeasure;
                            if (pagerMeasureResult2 == null) {
                            }
                            if (r0 != false) {
                            }
                            floatValue = r14.floatValue();
                        }
                        return Float.valueOf(floatValue);
                    default:
                        LazyLayoutPrefetchState.NestedPrefetchScopeImpl nestedPrefetchScopeImpl = (LazyLayoutPrefetchState.NestedPrefetchScopeImpl) obj;
                        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                        try {
                            nestedPrefetchScopeImpl.schedulePrecomposition(pagerState.firstVisiblePage);
                            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            throw th;
                        }
                }
            }
        });
        final int i3 = 1;
        this.prefetchingEnabled = true;
        this.pagerLayoutInfoState = new ParcelableSnapshotMutableState(PagerStateKt.EmptyLayoutInfo, NeverEqualPolicy.INSTANCE);
        this.density = PagerStateKt.UnitDensity;
        this.internalInteractionSource = new MutableInteractionSourceImpl();
        this.programmaticScrollTargetPage$delegate = new ParcelableSnapshotMutableIntState(-1);
        this.settledPageState$delegate = new ParcelableSnapshotMutableIntState(i);
        NeverEqualPolicy neverEqualPolicy = NeverEqualPolicy.INSTANCE$3;
        this.settledPage$delegate = Updater.derivedStateOf(neverEqualPolicy, new PagerState$$ExternalSyntheticLambda1(this, i2));
        this.targetPage$delegate = Updater.derivedStateOf(neverEqualPolicy, new PagerState$$ExternalSyntheticLambda1(this, 3));
        LazyLayoutPrefetchState lazyLayoutPrefetchState = new LazyLayoutPrefetchState(new Function1(this) { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda0
            public final /* synthetic */ PagerState f$0;

            {
                this.f$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Long] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                PagerMeasureResult pagerMeasureResult;
                int i32 = i3;
                PagerMeasureResult pagerMeasureResult2 = null;
                PagerState pagerState = this.f$0;
                switch (i32) {
                    case 0:
                        ?? r14 = (Float) obj;
                        float floatValue = r14.floatValue();
                        long currentAbsoluteScrollOffset = ComposeUtilsKt.currentAbsoluteScrollOffset(pagerState);
                        float f2 = pagerState.accumulator + floatValue;
                        long roundToLong = MathKt__MathJVMKt.roundToLong(f2);
                        pagerState.accumulator = f2 - roundToLong;
                        if (Math.abs(floatValue) >= 1.0E-4f) {
                            long j = currentAbsoluteScrollOffset + roundToLong;
                            long coerceIn = RangesKt___RangesKt.coerceIn(j, pagerState.minScrollOffset, pagerState.maxScrollOffset);
                            ?? r0 = j != coerceIn;
                            long j2 = coerceIn - currentAbsoluteScrollOffset;
                            float f3 = j2;
                            pagerState.previousPassDelta = f3;
                            long abs = Math.abs(j2);
                            float f4 = RecyclerView.DECELERATION_RATE;
                            if (abs != 0) {
                                pagerState.isLastScrollForwardState.setValue(Boolean.valueOf(f3 > RecyclerView.DECELERATION_RATE));
                                pagerState.isLastScrollBackwardState.setValue(Boolean.valueOf(f3 < RecyclerView.DECELERATION_RATE));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            PagerMeasureResult copyWithScrollDeltaWithoutRemeasure = ((PagerMeasureResult) pagerState.pagerLayoutInfoState.getValue()).copyWithScrollDeltaWithoutRemeasure(i5);
                            if (copyWithScrollDeltaWithoutRemeasure != null && (pagerMeasureResult = pagerState.approachLayoutInfo) != null) {
                                PagerMeasureResult copyWithScrollDeltaWithoutRemeasure2 = pagerMeasureResult.copyWithScrollDeltaWithoutRemeasure(i5);
                                if (copyWithScrollDeltaWithoutRemeasure2 != null) {
                                    pagerState.approachLayoutInfo = copyWithScrollDeltaWithoutRemeasure2;
                                }
                                if (pagerMeasureResult2 == null) {
                                    pagerState.applyMeasureResult$foundation(pagerMeasureResult2, pagerState.hasLookaheadOccurred, true);
                                    LazyLayoutKt.m324invalidateScopeimpl(pagerState.placementScopeInvalidator);
                                } else {
                                    Schema schema = pagerState.scrollPosition;
                                    PagerState pagerState2 = (PagerState) schema.mappedElements;
                                    ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) schema.fieldSortOrder;
                                    if (pagerState2.getPageSizeWithSpacing$foundation() != 0) {
                                        f4 = i4 / pagerState2.getPageSizeWithSpacing$foundation();
                                    }
                                    parcelableSnapshotMutableFloatState.setFloatValue(parcelableSnapshotMutableFloatState.getFloatValue() + f4);
                                    LayoutNode layoutNode = (LayoutNode) pagerState.remeasurement$delegate.getValue();
                                    if (layoutNode != null) {
                                        layoutNode.forceRemeasure();
                                    }
                                }
                                if (r0 != false) {
                                    r14 = Long.valueOf(j2);
                                }
                                floatValue = r14.floatValue();
                            }
                            pagerMeasureResult2 = copyWithScrollDeltaWithoutRemeasure;
                            if (pagerMeasureResult2 == null) {
                            }
                            if (r0 != false) {
                            }
                            floatValue = r14.floatValue();
                        }
                        return Float.valueOf(floatValue);
                    default:
                        LazyLayoutPrefetchState.NestedPrefetchScopeImpl nestedPrefetchScopeImpl = (LazyLayoutPrefetchState.NestedPrefetchScopeImpl) obj;
                        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                        try {
                            nestedPrefetchScopeImpl.schedulePrecomposition(pagerState.firstVisiblePage);
                            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            return Unit.INSTANCE;
                        } catch (Throwable th) {
                            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                            throw th;
                        }
                }
            }
        });
        this.prefetchState = lazyLayoutPrefetchState;
        this.cacheWindowLogic = new PagerCacheWindowLogic(new BiometricPrompt(this, 18), lazyLayoutPrefetchState, new PagerState$$ExternalSyntheticLambda1(this, 4));
        this.beyondBoundsInfo = new Recorder.AnonymousClass6(15);
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.remeasurement$delegate = Updater.mutableStateOf$default(null);
        this.remeasurementModifier = new PagerState$remeasurementModifier$1(this, i2);
        ConstraintsKt.Constraints$default(0, 0, 0, 0, 15);
        this.pinnedPages = new LazyLayoutPinnedItemList();
        this.placementScopeInvalidator = LazyLayoutKt.m323constructorimpl$default();
        this.measurementScopeInvalidator = LazyLayoutKt.m323constructorimpl$default();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = Updater.mutableStateOf$default(bool);
        this.canScrollBackward$delegate = Updater.mutableStateOf$default(bool);
        this.isLastScrollForwardState = Updater.mutableStateOf$default(bool);
        this.isLastScrollBackwardState = Updater.mutableStateOf$default(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r9.scroll(r7, r8, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.awaitScrollDependencies(r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object scroll$suspendImpl(PagerState pagerState, MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        PagerState$scroll$1 pagerState$scroll$1;
        int i;
        Function2 function22;
        if (continuation instanceof PagerState$scroll$1) {
            pagerState$scroll$1 = (PagerState$scroll$1) continuation;
            int i2 = pagerState$scroll$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pagerState$scroll$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pagerState$scroll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pagerState$scroll$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    pagerState$scroll$1.L$0 = pagerState;
                    pagerState$scroll$1.L$1 = mutatePriority;
                    pagerState$scroll$1.L$2 = (SuspendLambda) function2;
                    pagerState$scroll$1.label = 1;
                    function22 = function2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pagerState = pagerState$scroll$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        pagerState.programmaticScrollTargetPage$delegate.setIntValue(-1);
                        return Unit.INSTANCE;
                    }
                    Function2 function23 = (Function2) pagerState$scroll$1.L$2;
                    mutatePriority = pagerState$scroll$1.L$1;
                    pagerState = pagerState$scroll$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    function22 = function23;
                }
                if (!pagerState.scrollableState.isScrollInProgress()) {
                    pagerState.settledPageState$delegate.setIntValue(((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue());
                }
                DefaultScrollableState defaultScrollableState = pagerState.scrollableState;
                pagerState$scroll$1.L$0 = pagerState;
                pagerState$scroll$1.L$1 = null;
                pagerState$scroll$1.L$2 = null;
                pagerState$scroll$1.label = 2;
            }
        }
        pagerState$scroll$1 = new PagerState$scroll$1(pagerState, continuation);
        Object obj2 = pagerState$scroll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pagerState$scroll$1.label;
        if (i != 0) {
        }
        if (!pagerState.scrollableState.isScrollInProgress()) {
        }
        DefaultScrollableState defaultScrollableState2 = pagerState.scrollableState;
        pagerState$scroll$1.L$0 = pagerState;
        pagerState$scroll$1.L$1 = null;
        pagerState$scroll$1.L$2 = null;
        pagerState$scroll$1.label = 2;
    }

    public static Object scrollToPage$default(PagerState pagerState, int i, SuspendLambda suspendLambda) {
        pagerState.getClass();
        Object scroll = pagerState.scroll(MutatePriority.Default, new PagerState$scrollToPage$2(pagerState, i, null, 0), suspendLambda);
        return scroll == CoroutineSingletons.COROUTINE_SUSPENDED ? scroll : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
    
        if (scroll(androidx.compose.foundation.MutatePriority.Default, r5, r0) != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (awaitScrollDependencies(r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateScrollToPage(int i, float f, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation) {
        PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$1;
        int i2;
        double d;
        if (continuation instanceof PagerState$animateScrollToPage$1) {
            pagerState$animateScrollToPage$1 = (PagerState$animateScrollToPage$1) continuation;
            int i3 = pagerState$animateScrollToPage$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                pagerState$animateScrollToPage$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = pagerState$animateScrollToPage$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = pagerState$animateScrollToPage$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Schema schema = this.scrollPosition;
                    if ((i == ((ParcelableSnapshotMutableIntState) schema.elementTypes).getIntValue() && ((ParcelableSnapshotMutableFloatState) schema.fieldSortOrder).getFloatValue() == f) || getPageCount() == 0) {
                        return Unit.INSTANCE;
                    }
                    pagerState$animateScrollToPage$1.L$0 = finiteAnimationSpec;
                    pagerState$animateScrollToPage$1.I$0 = i;
                    pagerState$animateScrollToPage$1.F$0 = f;
                    pagerState$animateScrollToPage$1.label = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f = pagerState$animateScrollToPage$1.F$0;
                    i = pagerState$animateScrollToPage$1.I$0;
                    finiteAnimationSpec = pagerState$animateScrollToPage$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
                d = f;
                if (-0.5d <= d || d > 0.5d) {
                    InlineClassHelperKt.throwIllegalArgumentException("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
                }
                Function2 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this, coerceInPageRange(i), f * getPageSizeWithSpacing$foundation(), finiteAnimationSpec2, null);
                pagerState$animateScrollToPage$1.L$0 = null;
                pagerState$animateScrollToPage$1.label = 2;
            }
        }
        pagerState$animateScrollToPage$1 = new PagerState$animateScrollToPage$1(this, continuation);
        Object obj3 = pagerState$animateScrollToPage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = pagerState$animateScrollToPage$1.label;
        if (i2 != 0) {
        }
        FiniteAnimationSpec finiteAnimationSpec22 = finiteAnimationSpec;
        d = f;
        if (-0.5d <= d) {
        }
        InlineClassHelperKt.throwIllegalArgumentException("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        Function2 pagerState$animateScrollToPage$32 = new PagerState$animateScrollToPage$3(this, coerceInPageRange(i), f * getPageSizeWithSpacing$foundation(), finiteAnimationSpec22, null);
        pagerState$animateScrollToPage$1.L$0 = null;
        pagerState$animateScrollToPage$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0341, code lost:
    
        if (isNotGestureAction$foundation() == false) goto L136;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b4  */
    /* JADX WARN: Type inference failed for: r5v22, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void applyMeasureResult$foundation(PagerMeasureResult pagerMeasureResult, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        CachedItem cachedItem;
        List list;
        ?? r5;
        long coerceIn;
        long j;
        List list2 = pagerMeasureResult.visiblePagesInfo;
        int i = pagerMeasureResult.firstVisiblePageScrollOffset;
        MeasuredPage measuredPage = pagerMeasureResult.firstVisiblePage;
        MeasuredPage measuredPage2 = pagerMeasureResult.currentPage;
        float f = pagerMeasureResult.currentPageOffsetFraction;
        this.prefetchState.idealNestedPrefetchCount = list2.size();
        int i2 = pagerMeasureResult.pageSize;
        this.latestPageSizeWithSpacing = pagerMeasureResult.pageSpacing + i2;
        if (!z && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = pagerMeasureResult;
            return;
        }
        boolean z9 = true;
        if (z) {
            this.hasLookaheadOccurred = true;
        }
        PagerCacheWindowLogic pagerCacheWindowLogic = this.cacheWindowLogic;
        boolean z10 = this.prefetchingEnabled;
        Schema schema = this.scrollPosition;
        if (z2) {
            ((ParcelableSnapshotMutableFloatState) schema.fieldSortOrder).setFloatValue(f);
        } else {
            schema.getClass();
            schema.mVersion = measuredPage2 != null ? measuredPage2.key : null;
            if (schema.mLoaded || !list2.isEmpty()) {
                schema.mLoaded = true;
                int i3 = measuredPage2 != null ? measuredPage2.index : 0;
                ((ParcelableSnapshotMutableIntState) schema.elementTypes).setIntValue(i3);
                ((LazyLayoutNearestRangeState) schema.rootElements).update(i3);
                ((ParcelableSnapshotMutableFloatState) schema.fieldSortOrder).setFloatValue(f);
            }
            if (z10) {
                boolean z11 = z10;
                Recorder.AnonymousClass3 anonymousClass3 = pagerCacheWindowLogic.cacheWindowScope;
                MutableIntObjectMap mutableIntObjectMap = pagerCacheWindowLogic.windowCacheWithItems;
                anonymousClass3.val$recordingToStart = pagerMeasureResult;
                anonymousClass3.this$0 = pagerCacheWindowLogic.state;
                BiometricPrompt biometricPrompt = pagerCacheWindowLogic.cacheWindow;
                int i4 = pagerCacheWindowLogic.previousPassItemCount;
                int i5 = -1;
                float f2 = RecyclerView.DECELERATION_RATE;
                if (i4 != -1 && i4 != anonymousClass3.getTotalItemsCount()) {
                    pagerCacheWindowLogic.shouldRefillWindow = true;
                    if (anonymousClass3.getHasVisibleItems()) {
                        int i6 = pagerCacheWindowLogic.prefetchWindowStartLine;
                        if (i6 < 0) {
                            i6 = 0;
                        }
                        pagerCacheWindowLogic.prefetchWindowStartLine = i6;
                        int totalItemsCount = anonymousClass3.getLayoutInfo().visiblePagesInfo.isEmpty() ? -1 : anonymousClass3.getTotalItemsCount() - 1;
                        if (totalItemsCount != -1) {
                            int i7 = pagerCacheWindowLogic.prefetchWindowEndLine;
                            if (i7 <= totalItemsCount) {
                                totalItemsCount = i7;
                            }
                            pagerCacheWindowLogic.prefetchWindowEndLine = totalItemsCount;
                        }
                        if (pagerCacheWindowLogic.previousPassDelta <= RecyclerView.DECELERATION_RATE) {
                            pagerCacheWindowLogic.removeOutOfBoundsItems(anonymousClass3.getLastVisibleLineIndex(), pagerCacheWindowLogic.itemsCount - 1);
                        } else {
                            pagerCacheWindowLogic.removeOutOfBoundsItems(0, anonymousClass3.getFirstVisibleLineIndex());
                        }
                    }
                }
                pagerCacheWindowLogic.itemsCount = anonymousClass3.getTotalItemsCount();
                if (anonymousClass3.getHasVisibleItems()) {
                    int size = anonymousClass3.getLayoutInfo().extraPagesAfter.size() + anonymousClass3.getLayoutInfo().visiblePagesInfo.size() + anonymousClass3.getLayoutInfo().extraPagesBefore.size();
                    int i8 = 0;
                    while (i8 < size) {
                        int size2 = anonymousClass3.getLayoutInfo().extraPagesBefore.size();
                        float f3 = f2;
                        int size3 = anonymousClass3.getLayoutInfo().visiblePagesInfo.size();
                        int i9 = i8 < size2 ? ((MeasuredPage) anonymousClass3.getLayoutInfo().extraPagesBefore.get(i8)).index : (i8 < size2 || i8 >= size2 + size3) ? i8 >= size2 + size3 ? ((MeasuredPage) anonymousClass3.getLayoutInfo().extraPagesAfter.get((i8 - size2) - size3)).index : i5 : ((MeasuredPage) anonymousClass3.getLayoutInfo().visiblePagesInfo.get(i8 - size2)).index;
                        int size4 = anonymousClass3.getLayoutInfo().extraPagesBefore.size();
                        int size5 = anonymousClass3.getLayoutInfo().visiblePagesInfo.size();
                        Object obj = i8 < size4 ? ((MeasuredPage) anonymousClass3.getLayoutInfo().extraPagesBefore.get(i8)).key : (i8 < size4 || i8 >= size4 + size5) ? i8 >= size4 + size5 ? ((MeasuredPage) anonymousClass3.getLayoutInfo().extraPagesAfter.get((i8 - size4) - size5)).key : CachedItem.NoKey : ((MeasuredPage) anonymousClass3.getLayoutInfo().visiblePagesInfo.get(i8 - size4)).key;
                        int i10 = anonymousClass3.getLayoutInfo().pageSize;
                        if (i9 != -1) {
                            if (mutableIntObjectMap.containsKey(i9)) {
                                Object obj2 = mutableIntObjectMap.get(i9);
                                obj2.getClass();
                                int i11 = ((CachedItem) obj2).mainAxisSize;
                                Object obj3 = mutableIntObjectMap.get(i9);
                                obj3.getClass();
                                z7 = z11;
                                Object obj4 = ((CachedItem) obj3).key;
                                if (i11 != i10 || !Intrinsics.areEqual(obj4, obj)) {
                                    z8 = true;
                                    pagerCacheWindowLogic.shouldRefillWindow = true;
                                    cachedItem = (CachedItem) mutableIntObjectMap.get(i9);
                                    if (cachedItem == null) {
                                        cachedItem.mainAxisSize = i10;
                                        cachedItem.key = obj;
                                    } else {
                                        cachedItem = new CachedItem();
                                        cachedItem.key = obj;
                                        cachedItem.mainAxisSize = i10;
                                    }
                                    mutableIntObjectMap.set(i9, cachedItem);
                                    pagerCacheWindowLogic.prefetchWindowStartLine = Math.min(pagerCacheWindowLogic.prefetchWindowStartLine, i9);
                                    pagerCacheWindowLogic.prefetchWindowEndLine = Math.max(pagerCacheWindowLogic.prefetchWindowEndLine, i9);
                                    list = (List) pagerCacheWindowLogic.prefetchWindowHandles.remove(i9);
                                    if (list == null) {
                                        int size6 = list.size();
                                        for (int i12 = 0; i12 < size6; i12++) {
                                            ((LazyLayoutPrefetchState.PrefetchHandle) list.get(i12)).cancel();
                                        }
                                    }
                                }
                            } else {
                                z7 = z11;
                            }
                            z8 = true;
                            cachedItem = (CachedItem) mutableIntObjectMap.get(i9);
                            if (cachedItem == null) {
                            }
                            mutableIntObjectMap.set(i9, cachedItem);
                            pagerCacheWindowLogic.prefetchWindowStartLine = Math.min(pagerCacheWindowLogic.prefetchWindowStartLine, i9);
                            pagerCacheWindowLogic.prefetchWindowEndLine = Math.max(pagerCacheWindowLogic.prefetchWindowEndLine, i9);
                            list = (List) pagerCacheWindowLogic.prefetchWindowHandles.remove(i9);
                            if (list == null) {
                            }
                        } else {
                            z7 = z11;
                            z8 = true;
                        }
                        i8++;
                        f2 = f3;
                        z9 = z8;
                        z11 = z7;
                        i5 = -1;
                    }
                    z3 = z11;
                    z4 = z9;
                    float f4 = f2;
                    if (pagerCacheWindowLogic.shouldRefillWindow) {
                        boolean z12 = pagerCacheWindowLogic.previousPassDelta <= f4 ? z4 : false;
                        if (anonymousClass3.getHasVisibleItems()) {
                            PagerLayoutInfoKt.getMainAxisViewportSize(anonymousClass3.getLayoutInfo());
                            z6 = false;
                            pagerCacheWindowLogic.onPrefetchForward(anonymousClass3, anonymousClass3.getFirstVisibleLineIndex(), anonymousClass3.getLastVisibleLineIndex(), anonymousClass3.getLayoutInfo().density != null ? ((PagerState) biometricPrompt.mClientFragmentManager).latestPageSizeWithSpacing : 0, anonymousClass3.getMainAxisExtraSpaceEnd(), anonymousClass3.getMainAxisExtraSpaceStart(), RecyclerView.DECELERATION_RATE, z12);
                        } else {
                            z6 = false;
                        }
                        pagerCacheWindowLogic.shouldRefillWindow = z6;
                        z5 = z6;
                    } else {
                        z5 = false;
                    }
                } else {
                    z3 = z11;
                    z4 = true;
                    z5 = false;
                    pagerCacheWindowLogic.resetStrategy();
                }
                pagerCacheWindowLogic.previousPassItemCount = anonymousClass3.getTotalItemsCount();
                r5 = z5;
                this.pagerLayoutInfoState.setValue(pagerMeasureResult);
                this.canScrollForward$delegate.setValue(Boolean.valueOf(pagerMeasureResult.canScrollForward));
                this.canScrollBackward$delegate.setValue(Boolean.valueOf(((measuredPage == null ? measuredPage.index : r5) == 0 || i != 0) ? z4 : r5));
                if (measuredPage != null) {
                    this.firstVisiblePage = measuredPage.index;
                }
                this.firstVisiblePageOffset = i;
                Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                if (z3) {
                    try {
                        if (pagerMeasureResult.beyondViewportPageCount < getPageCount() && Math.abs(this.previousPassDelta) > 0.5f) {
                            float f5 = this.previousPassDelta;
                            if (getLayoutInfo().orientation == Orientation.Vertical) {
                                if (Math.signum(f5) == Math.signum(-Float.intBitsToFloat((int) (m333getUpDownDifferenceF1C5BW0$foundation() & BodyPartID.bodyIdMax)))) {
                                    pagerCacheWindowLogic.onScroll(this.previousPassDelta, pagerMeasureResult);
                                }
                            } else if (Math.signum(f5) == Math.signum(-Float.intBitsToFloat((int) (m333getUpDownDifferenceF1C5BW0$foundation() >> 32)))) {
                                pagerCacheWindowLogic.onScroll(this.previousPassDelta, pagerMeasureResult);
                            }
                        }
                    } finally {
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    }
                }
                this.maxScrollOffset = PagerStateKt.calculateNewMaxScrollOffset(pagerMeasureResult, getPageCount());
                getPageCount();
                int m332getViewportSizeYbymL2g = (int) (pagerMeasureResult.orientation != Orientation.Horizontal ? pagerMeasureResult.m332getViewportSizeYbymL2g() >> 32 : pagerMeasureResult.m332getViewportSizeYbymL2g() & BodyPartID.bodyIdMax);
                coerceIn = RangesKt___RangesKt.coerceIn(pagerMeasureResult.snapPosition.position(m332getViewportSizeYbymL2g, i2, -pagerMeasureResult.viewportStartOffset, pagerMeasureResult.afterContentPadding), (int) r5, m332getViewportSizeYbymL2g);
                j = this.maxScrollOffset;
                if (coerceIn > j) {
                    coerceIn = j;
                }
                this.minScrollOffset = coerceIn;
            }
        }
        z4 = true;
        z3 = z10;
        r5 = 0;
        this.pagerLayoutInfoState.setValue(pagerMeasureResult);
        this.canScrollForward$delegate.setValue(Boolean.valueOf(pagerMeasureResult.canScrollForward));
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(((measuredPage == null ? measuredPage.index : r5) == 0 || i != 0) ? z4 : r5));
        if (measuredPage != null) {
        }
        this.firstVisiblePageOffset = i;
        Snapshot currentThreadSnapshot2 = zzg.getCurrentThreadSnapshot();
        Function1 readObserver2 = currentThreadSnapshot2 != null ? currentThreadSnapshot2.getReadObserver() : null;
        Snapshot makeCurrentNonObservable2 = zzg.makeCurrentNonObservable(currentThreadSnapshot2);
        if (z3) {
        }
        this.maxScrollOffset = PagerStateKt.calculateNewMaxScrollOffset(pagerMeasureResult, getPageCount());
        getPageCount();
        int m332getViewportSizeYbymL2g2 = (int) (pagerMeasureResult.orientation != Orientation.Horizontal ? pagerMeasureResult.m332getViewportSizeYbymL2g() >> 32 : pagerMeasureResult.m332getViewportSizeYbymL2g() & BodyPartID.bodyIdMax);
        coerceIn = RangesKt___RangesKt.coerceIn(pagerMeasureResult.snapPosition.position(m332getViewportSizeYbymL2g2, i2, -pagerMeasureResult.viewportStartOffset, pagerMeasureResult.afterContentPadding), (int) r5, m332getViewportSizeYbymL2g2);
        j = this.maxScrollOffset;
        if (coerceIn > j) {
        }
        this.minScrollOffset = coerceIn;
    }

    public final Object awaitScrollDependencies(ContinuationImpl continuationImpl) {
        Object waitForFirstLayout;
        return (this.pagerLayoutInfoState.getValue() == PagerStateKt.EmptyLayoutInfo && (waitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? waitForFirstLayout : Unit.INSTANCE;
    }

    public final int coerceInPageRange(int i) {
        if (getPageCount() > 0) {
            return RangesKt___RangesKt.coerceIn(i, 0, getPageCount() - 1);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float dispatchRawDelta(float f) {
        return this.scrollableState.dispatchRawDelta(f);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final boolean getLastScrolledForward() {
        return ((Boolean) this.isLastScrollForwardState.getValue()).booleanValue();
    }

    public final PagerMeasureResult getLayoutInfo() {
        return (PagerMeasureResult) this.pagerLayoutInfoState.getValue();
    }

    public final float getOffsetDistanceInPages(int i) {
        if (i < 0 || i > getPageCount()) {
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "page ", " is not within the range 0 to ");
            m2m.append(getPageCount());
            InlineClassHelperKt.throwIllegalArgumentException(m2m.toString());
        }
        return (i - ((ParcelableSnapshotMutableIntState) r2.elementTypes).getIntValue()) - ((ParcelableSnapshotMutableFloatState) this.scrollPosition.fieldSortOrder).getFloatValue();
    }

    public abstract int getPageCount();

    public final int getPageSize$foundation() {
        return ((PagerMeasureResult) this.pagerLayoutInfoState.getValue()).pageSize;
    }

    public final int getPageSizeWithSpacing$foundation() {
        return ((PagerMeasureResult) this.pagerLayoutInfoState.getValue()).pageSpacing + getPageSize$foundation();
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage$delegate.getValue()).intValue();
    }

    /* renamed from: getUpDownDifference-F1C5BW0$foundation, reason: not valid java name */
    public final long m333getUpDownDifferenceF1C5BW0$foundation() {
        return ((Offset) this.upDownDifference$delegate.getValue()).packedValue;
    }

    public final boolean isNotGestureAction$foundation() {
        return ((int) Float.intBitsToFloat((int) (m333getUpDownDifferenceF1C5BW0$foundation() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (m333getUpDownDifferenceF1C5BW0$foundation() & BodyPartID.bodyIdMax))) == 0;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object scroll(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        return scroll$suspendImpl(this, mutatePriority, function2, continuation);
    }

    public final void snapToItem$foundation(int i, float f, boolean z) {
        Schema schema = this.scrollPosition;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) schema.elementTypes;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) schema.fieldSortOrder;
        if (parcelableSnapshotMutableIntState.getIntValue() != i || parcelableSnapshotMutableFloatState.getFloatValue() != f) {
            this.cacheWindowLogic.resetStrategy();
        }
        ((ParcelableSnapshotMutableIntState) schema.elementTypes).setIntValue(i);
        ((LazyLayoutNearestRangeState) schema.rootElements).update(i);
        parcelableSnapshotMutableFloatState.setFloatValue(f);
        schema.mVersion = null;
        if (!z) {
            LazyLayoutKt.m324invalidateScopeimpl(this.measurementScopeInvalidator);
            return;
        }
        LayoutNode layoutNode = (LayoutNode) this.remeasurement$delegate.getValue();
        if (layoutNode != null) {
            layoutNode.forceRemeasure();
        }
    }
}
