package androidx.compose.foundation.lazy;

import android.os.Trace;
import androidx.camera.video.Recorder;
import androidx.camera.view.PreviewView;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.pager.PagerState$remeasurementModifier$1;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzg;
import com.squareup.cash.score.views.ScoreSummaryKt$ScoreDigit$1$1;
import com.stripe.android.uicore.image.DefaultStripeImageLoader$load$2;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LazyListState implements ScrollableState {
    public static final WorkLauncherImpl Saver = ListSaverKt.listSaver(new SnackbarHostKt$$ExternalSyntheticLambda2(1), new BasicTextKt$$ExternalSyntheticLambda14(4));
    public final Recorder.AnonymousClass4 _lazyLayoutScrollDeltaBetweenPasses;
    public LazyListMeasureResult approachLayoutInfo;
    public final AwaitFirstLayoutModifier awaitLayoutModifier;
    public final Recorder.AnonymousClass6 beyondBoundsInfo;
    public final ParcelableSnapshotMutableState canScrollBackward$delegate;
    public final ParcelableSnapshotMutableState canScrollForward$delegate;
    public boolean executeRequestsInHighPriorityMode;
    public boolean hasLookaheadOccurred;
    public final MutableInteractionSourceImpl internalInteractionSource;
    public final LazyLayoutItemAnimator itemAnimator;
    public final ParcelableSnapshotMutableState layoutInfoState;
    public final MutableState measurementScopeInvalidator;
    public final LazyLayoutPinnedItemList pinnedItems;
    public final MutableState placementScopeInvalidator;
    public final PreviewView.AnonymousClass1 prefetchScope;
    public final LazyLayoutPrefetchState prefetchState;
    public final DefaultLazyListPrefetchStrategy prefetchStrategy;
    public final boolean prefetchingEnabled;
    public LayoutNode remeasurement;
    public final PagerState$remeasurementModifier$1 remeasurementModifier;
    public final LazyListScrollPosition scrollPosition;
    public float scrollToBeConsumed;
    public final DefaultScrollableState scrollableState;
    public boolean skipItemPlacementAnimation;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyListState(int i, int i2) {
        DefaultLazyListPrefetchStrategy defaultLazyListPrefetchStrategy = new DefaultLazyListPrefetchStrategy();
        defaultLazyListPrefetchStrategy.indexToPrefetch = -1;
        defaultLazyListPrefetchStrategy.previousPassItemCount = -1;
        this.prefetchStrategy = defaultLazyListPrefetchStrategy;
        this.scrollPosition = new LazyListScrollPosition(i, i2, 0);
        this.layoutInfoState = new ParcelableSnapshotMutableState(LazyListStateKt.EmptyLazyListMeasureResult, NeverEqualPolicy.INSTANCE);
        this.internalInteractionSource = new MutableInteractionSourceImpl();
        this.scrollableState = new DefaultScrollableState(new ObjectList$$ExternalSyntheticLambda0(this, 18));
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new PagerState$remeasurementModifier$1(this, 1);
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.itemAnimator = new LazyLayoutItemAnimator();
        this.beyondBoundsInfo = new Recorder.AnonymousClass6(15);
        this.prefetchState = new LazyLayoutPrefetchState(new LazyListState$$ExternalSyntheticLambda3(this, i, 0));
        this.prefetchScope = new PreviewView.AnonymousClass1(this, 0 == true ? 1 : 0);
        this.pinnedItems = new LazyLayoutPinnedItemList();
        this.measurementScopeInvalidator = LazyLayoutKt.m323constructorimpl$default();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = Updater.mutableStateOf$default(bool);
        this.canScrollBackward$delegate = Updater.mutableStateOf$default(bool);
        this.placementScopeInvalidator = LazyLayoutKt.m323constructorimpl$default();
        this._lazyLayoutScrollDeltaBetweenPasses = new Recorder.AnonymousClass4(16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateScrollToItem(int i, int i2, Continuation continuation) {
        LazyListState$animateScrollToItem$1 lazyListState$animateScrollToItem$1;
        int i3;
        try {
            if (continuation instanceof LazyListState$animateScrollToItem$1) {
                lazyListState$animateScrollToItem$1 = (LazyListState$animateScrollToItem$1) continuation;
                int i4 = lazyListState$animateScrollToItem$1.label;
                if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                    lazyListState$animateScrollToItem$1.label = i4 - PKIFailureInfo.systemUnavail;
                    Object obj = lazyListState$animateScrollToItem$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = lazyListState$animateScrollToItem$1.label;
                    if (i3 != 0) {
                        SafeTrace.throwOnFailure(obj);
                        this.skipItemPlacementAnimation = true;
                        DefaultStripeImageLoader$load$2 defaultStripeImageLoader$load$2 = new DefaultStripeImageLoader$load$2(this, i, i2, null);
                        lazyListState$animateScrollToItem$1.label = 1;
                        if (scroll(MutatePriority.Default, defaultStripeImageLoader$load$2, lazyListState$animateScrollToItem$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    this.skipItemPlacementAnimation = false;
                    this = Unit.INSTANCE;
                    return this;
                }
            }
            if (i3 != 0) {
            }
            this.skipItemPlacementAnimation = false;
            this = Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            this.skipItemPlacementAnimation = false;
            throw th;
        }
        lazyListState$animateScrollToItem$1 = new LazyListState$animateScrollToItem$1(this, continuation);
        Object obj2 = lazyListState$animateScrollToItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = lazyListState$animateScrollToItem$1.label;
    }

    public final void applyMeasureResult$foundation(LazyListMeasureResult lazyListMeasureResult, boolean z, boolean z2) {
        float f;
        long j;
        List list = lazyListMeasureResult.visibleItemsInfo;
        int i = lazyListMeasureResult.totalItemsCount;
        int i2 = lazyListMeasureResult.firstVisibleItemScrollOffset;
        LazyListMeasuredItem lazyListMeasuredItem = lazyListMeasureResult.firstVisibleItem;
        this.prefetchState.idealNestedPrefetchCount = list.size();
        Recorder.AnonymousClass4 anonymousClass4 = this._lazyLayoutScrollDeltaBetweenPasses;
        LazyListScrollPosition lazyListScrollPosition = this.scrollPosition;
        if (!z && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = lazyListMeasureResult;
            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                if (!(((Number) ((AnimationState) anonymousClass4.this$0).value$delegate.getValue()).floatValue() == RecyclerView.DECELERATION_RATE) && lazyListMeasuredItem != null && lazyListMeasuredItem.index == lazyListScrollPosition.index$delegate.getIntValue() && i2 == lazyListScrollPosition.scrollOffset$delegate.getIntValue()) {
                    anonymousClass4.stop$foundation();
                }
                return;
            } finally {
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            }
        }
        if (z) {
            this.hasLookaheadOccurred = true;
        }
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(((lazyListMeasuredItem != null ? lazyListMeasuredItem.index : 0) == 0 && i2 == 0) ? false : true));
        this.canScrollForward$delegate.setValue(Boolean.valueOf(lazyListMeasureResult.canScrollForward));
        this.scrollToBeConsumed -= lazyListMeasureResult.consumedScroll;
        this.layoutInfoState.setValue(lazyListMeasureResult);
        if (z2) {
            lazyListScrollPosition.getClass();
            if (i2 < RecyclerView.DECELERATION_RATE) {
                InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
            }
            lazyListScrollPosition.scrollOffset$delegate.setIntValue(i2);
        } else {
            LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) CollectionsKt.firstOrNull(list);
            LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) CollectionsKt.lastOrNull(list);
            if (lazyListMeasuredItem2 != null) {
                f = 0.0f;
                j = lazyListMeasuredItem2.index;
            } else {
                f = 0.0f;
                j = -1;
            }
            Trace.setCounter("firstVisibleItem:index", j);
            Trace.setCounter("lastVisibleItem:index", lazyListMeasuredItem3 != null ? lazyListMeasuredItem3.index : -1L);
            lazyListScrollPosition.getClass();
            lazyListScrollPosition.lastKnownFirstItemKey = lazyListMeasuredItem != null ? lazyListMeasuredItem.key : null;
            if (lazyListScrollPosition.hadFirstNotEmptyLayout || i > 0) {
                lazyListScrollPosition.hadFirstNotEmptyLayout = true;
                if (i2 < f) {
                    InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
                }
                lazyListScrollPosition.update(lazyListMeasuredItem != null ? lazyListMeasuredItem.index : 0, i2);
            }
            if (this.prefetchingEnabled) {
                DefaultLazyListPrefetchStrategy defaultLazyListPrefetchStrategy = this.prefetchStrategy;
                int i3 = defaultLazyListPrefetchStrategy.indexToPrefetch;
                boolean z3 = defaultLazyListPrefetchStrategy.wasScrollingForward;
                if (i3 != -1 && !list.isEmpty() && i3 != DefaultLazyListPrefetchStrategy.calculateIndexToPrefetch(lazyListMeasureResult, z3)) {
                    defaultLazyListPrefetchStrategy.indexToPrefetch = -1;
                    LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = (LazyLayoutPrefetchState.PrefetchHandle) defaultLazyListPrefetchStrategy.currentPrefetchHandle;
                    if (prefetchHandle != null) {
                        prefetchHandle.cancel();
                    }
                    defaultLazyListPrefetchStrategy.currentPrefetchHandle = null;
                }
                int i4 = defaultLazyListPrefetchStrategy.previousPassItemCount;
                if (i4 != -1 && defaultLazyListPrefetchStrategy.previousPassDelta != f && i4 != i && !list.isEmpty()) {
                    int calculateIndexToPrefetch = DefaultLazyListPrefetchStrategy.calculateIndexToPrefetch(lazyListMeasureResult, defaultLazyListPrefetchStrategy.previousPassDelta < f);
                    if (calculateIndexToPrefetch >= 0 && calculateIndexToPrefetch < i) {
                        defaultLazyListPrefetchStrategy.indexToPrefetch = calculateIndexToPrefetch;
                        defaultLazyListPrefetchStrategy.currentPrefetchHandle = PreviewView.AnonymousClass1.schedulePrefetch$default(this.prefetchScope, calculateIndexToPrefetch);
                    }
                }
                defaultLazyListPrefetchStrategy.previousPassItemCount = i;
            }
        }
        if (z) {
            anonymousClass4.updateScrollDeltaForApproach$foundation(lazyListMeasureResult.scrollBackAmount, lazyListMeasureResult.density, lazyListMeasureResult.coroutineScope);
        }
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

    public final LazyListMeasureResult getLayoutInfo() {
        return (LazyListMeasureResult) this.layoutInfoState.getValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final void notifyPrefetchOnScroll(float f, LazyListMeasureResult lazyListMeasureResult) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        if (this.prefetchingEnabled) {
            DefaultLazyListPrefetchStrategy defaultLazyListPrefetchStrategy = this.prefetchStrategy;
            defaultLazyListPrefetchStrategy.getClass();
            if (!lazyListMeasureResult.visibleItemsInfo.isEmpty()) {
                boolean z = f < RecyclerView.DECELERATION_RATE;
                int calculateIndexToPrefetch = DefaultLazyListPrefetchStrategy.calculateIndexToPrefetch(lazyListMeasureResult, z);
                if (calculateIndexToPrefetch >= 0 && calculateIndexToPrefetch < lazyListMeasureResult.totalItemsCount) {
                    if (calculateIndexToPrefetch != defaultLazyListPrefetchStrategy.indexToPrefetch) {
                        if (defaultLazyListPrefetchStrategy.wasScrollingForward != z) {
                            defaultLazyListPrefetchStrategy.indexToPrefetch = -1;
                            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3 = (LazyLayoutPrefetchState.PrefetchHandle) defaultLazyListPrefetchStrategy.currentPrefetchHandle;
                            if (prefetchHandle3 != null) {
                                prefetchHandle3.cancel();
                            }
                            defaultLazyListPrefetchStrategy.currentPrefetchHandle = null;
                        }
                        defaultLazyListPrefetchStrategy.wasScrollingForward = z;
                        defaultLazyListPrefetchStrategy.indexToPrefetch = calculateIndexToPrefetch;
                        defaultLazyListPrefetchStrategy.currentPrefetchHandle = PreviewView.AnonymousClass1.schedulePrefetch$default(this.prefetchScope, calculateIndexToPrefetch);
                    }
                    List list = lazyListMeasureResult.visibleItemsInfo;
                    if (z) {
                        LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) CollectionsKt.last(list);
                        if (((lazyListMeasuredItem.offset + lazyListMeasuredItem.size) + lazyListMeasureResult.mainAxisItemSpacing) - lazyListMeasureResult.viewportEndOffset < (-f) && (prefetchHandle2 = (LazyLayoutPrefetchState.PrefetchHandle) defaultLazyListPrefetchStrategy.currentPrefetchHandle) != null) {
                            prefetchHandle2.markAsUrgent();
                        }
                    } else if (lazyListMeasureResult.viewportStartOffset - ((LazyListMeasuredItem) CollectionsKt.first(list)).offset < f && (prefetchHandle = (LazyLayoutPrefetchState.PrefetchHandle) defaultLazyListPrefetchStrategy.currentPrefetchHandle) != null) {
                        prefetchHandle.markAsUrgent();
                    }
                }
            }
            defaultLazyListPrefetchStrategy.previousPassDelta = f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r6.scrollableState.scroll(r7, r8, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r6.awaitLayoutModifier.waitForFirstLayout(r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object scroll(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        LazyListState$scroll$1 lazyListState$scroll$1;
        int i;
        Function2 function22;
        if (continuation instanceof LazyListState$scroll$1) {
            lazyListState$scroll$1 = (LazyListState$scroll$1) continuation;
            int i2 = lazyListState$scroll$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                lazyListState$scroll$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = lazyListState$scroll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lazyListState$scroll$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    function22 = function2;
                    if (this.layoutInfoState.getValue() == LazyListStateKt.EmptyLazyListMeasureResult) {
                        lazyListState$scroll$1.L$0 = mutatePriority;
                        lazyListState$scroll$1.L$1 = (SuspendLambda) function2;
                        lazyListState$scroll$1.label = 1;
                        function22 = function2;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Function2 function23 = (Function2) lazyListState$scroll$1.L$1;
                    mutatePriority = lazyListState$scroll$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    function22 = function23;
                }
                lazyListState$scroll$1.L$0 = null;
                lazyListState$scroll$1.L$1 = null;
                lazyListState$scroll$1.label = 2;
            }
        }
        lazyListState$scroll$1 = new LazyListState$scroll$1(this, continuation);
        Object obj2 = lazyListState$scroll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyListState$scroll$1.label;
        if (i != 0) {
        }
        lazyListState$scroll$1.L$0 = null;
        lazyListState$scroll$1.L$1 = null;
        lazyListState$scroll$1.label = 2;
    }

    public final Object scrollToItem(int i, int i2, Continuation continuation) {
        Object scroll = scroll(MutatePriority.Default, new ScoreSummaryKt$ScoreDigit$1$1(this, i, i2, (Continuation) null), continuation);
        return scroll == CoroutineSingletons.COROUTINE_SUSPENDED ? scroll : Unit.INSTANCE;
    }

    public final void snapToItemIndexInternal$foundation(int i, int i2) {
        LazyListScrollPosition lazyListScrollPosition = this.scrollPosition;
        if (lazyListScrollPosition.index$delegate.getIntValue() != i || lazyListScrollPosition.scrollOffset$delegate.getIntValue() != i2) {
            LazyLayoutItemAnimator lazyLayoutItemAnimator = this.itemAnimator;
            lazyLayoutItemAnimator.releaseAnimations();
            lazyLayoutItemAnimator.keyIndexMap = null;
            lazyLayoutItemAnimator.firstVisibleIndex = -1;
        }
        lazyListScrollPosition.update(i, i2);
        lazyListScrollPosition.lastKnownFirstItemKey = null;
        LayoutNode layoutNode = this.remeasurement;
        if (layoutNode != null) {
            layoutNode.forceRemeasure();
        }
    }
}
