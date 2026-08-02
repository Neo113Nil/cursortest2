package androidx.compose.foundation.lazy.grid;

import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.Recorder;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.DefaultLazyListPrefetchStrategy;
import androidx.compose.foundation.lazy.LazyListScrollPosition;
import androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.pager.PagerState$remeasurementModifier$1;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$1$1;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LazyGridState implements ScrollableState {
    public static final WorkLauncherImpl Saver = ListSaverKt.listSaver(new SnackbarHostKt$$ExternalSyntheticLambda2(3), new BasicTextKt$$ExternalSyntheticLambda14(7));
    public final Recorder.AnonymousClass4 _lazyLayoutScrollDeltaBetweenPasses;
    public LazyGridMeasureResult approachLayoutInfo;
    public final AwaitFirstLayoutModifier awaitLayoutModifier;
    public final Recorder.AnonymousClass6 beyondBoundsInfo;
    public final ParcelableSnapshotMutableState canScrollBackward$delegate;
    public final ParcelableSnapshotMutableState canScrollForward$delegate;
    public boolean hasLookaheadOccurred;
    public final MutableInteractionSourceImpl internalInteractionSource;
    public final LazyLayoutItemAnimator itemAnimator;
    public final ParcelableSnapshotMutableState layoutInfoState;
    public final MutableState measurementScopeInvalidator;
    public final LazyLayoutPinnedItemList pinnedItems;
    public final MutableState placementScopeInvalidator;
    public final Toolbar.AnonymousClass1 prefetchScope;
    public final LazyLayoutPrefetchState prefetchState;
    public final DefaultLazyListPrefetchStrategy prefetchStrategy;
    public final boolean prefetchingEnabled;
    public LayoutNode remeasurement;
    public final PagerState$remeasurementModifier$1 remeasurementModifier;
    public final LazyListScrollPosition scrollPosition;
    public float scrollToBeConsumed;
    public final DefaultScrollableState scrollableState;

    public LazyGridState(int i, int i2) {
        DefaultLazyListPrefetchStrategy defaultLazyListPrefetchStrategy = new DefaultLazyListPrefetchStrategy();
        defaultLazyListPrefetchStrategy.indexToPrefetch = -1;
        defaultLazyListPrefetchStrategy.currentPrefetchHandle = new MutableVector(0, new LazyLayoutPrefetchState.PrefetchHandle[16]);
        defaultLazyListPrefetchStrategy.previousPassItemCount = -1;
        this.prefetchStrategy = defaultLazyListPrefetchStrategy;
        this.scrollPosition = new LazyListScrollPosition(i, i2, 1);
        this.layoutInfoState = new ParcelableSnapshotMutableState(LazyGridStateKt.EmptyLazyGridLayoutInfo, NeverEqualPolicy.INSTANCE);
        this.internalInteractionSource = new MutableInteractionSourceImpl();
        this.scrollableState = new DefaultScrollableState(new ObjectList$$ExternalSyntheticLambda0(this, 20));
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new PagerState$remeasurementModifier$1(this, 2);
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.itemAnimator = new LazyLayoutItemAnimator();
        this.beyondBoundsInfo = new Recorder.AnonymousClass6(15);
        this.prefetchState = new LazyLayoutPrefetchState(new LazyListState$$ExternalSyntheticLambda3(this, i, 1));
        this.prefetchScope = new Toolbar.AnonymousClass1(this);
        this.pinnedItems = new LazyLayoutPinnedItemList();
        this.placementScopeInvalidator = LazyLayoutKt.m323constructorimpl$default();
        this.measurementScopeInvalidator = LazyLayoutKt.m323constructorimpl$default();
        Boolean bool = Boolean.FALSE;
        this.canScrollForward$delegate = Updater.mutableStateOf$default(bool);
        this.canScrollBackward$delegate = Updater.mutableStateOf$default(bool);
        this._lazyLayoutScrollDeltaBetweenPasses = new Recorder.AnonymousClass4(16);
    }

    public static Object animateScrollToItem$default(LazyGridState lazyGridState, int i, SuspendLambda suspendLambda) {
        lazyGridState.getClass();
        Object scroll = lazyGridState.scroll(MutatePriority.Default, new MoneyTabUIKt$MoneyTabLoaded$1$1(lazyGridState, i, (Continuation) null), suspendLambda);
        return scroll == CoroutineSingletons.COROUTINE_SUSPENDED ? scroll : Unit.INSTANCE;
    }

    public static Object scrollToItem$default(LazyGridState lazyGridState, int i, SuspendLambda suspendLambda) {
        lazyGridState.getClass();
        Object scroll = lazyGridState.scroll(MutatePriority.Default, new ThumbNode$onAttach$1(lazyGridState, i, (Continuation) null), suspendLambda);
        return scroll == CoroutineSingletons.COROUTINE_SUSPENDED ? scroll : Unit.INSTANCE;
    }

    public final void applyMeasureResult$foundation(LazyGridMeasureResult lazyGridMeasureResult, boolean z, boolean z2) {
        LazyGridMeasuredItem lazyGridMeasuredItem;
        LazyGridMeasuredItem lazyGridMeasuredItem2;
        LazyGridMeasuredItem lazyGridMeasuredItem3;
        List list = lazyGridMeasureResult.visibleItemsInfo;
        int i = lazyGridMeasureResult.totalItemsCount;
        LazyGridMeasuredLine lazyGridMeasuredLine = lazyGridMeasureResult.firstVisibleLine;
        int i2 = lazyGridMeasureResult.firstVisibleLineScrollOffset;
        this.prefetchState.idealNestedPrefetchCount = list.size();
        Object obj = null;
        obj = null;
        LazyListScrollPosition lazyListScrollPosition = this.scrollPosition;
        Recorder.AnonymousClass4 anonymousClass4 = this._lazyLayoutScrollDeltaBetweenPasses;
        if (!z && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = lazyGridMeasureResult;
            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                if (!(((Number) ((AnimationState) anonymousClass4.this$0).value$delegate.getValue()).floatValue() == RecyclerView.DECELERATION_RATE) && i2 == lazyListScrollPosition.scrollOffset$delegate.getIntValue() && lazyGridMeasuredLine != null && (lazyGridMeasuredItem3 = (LazyGridMeasuredItem) ArraysKt___ArraysKt.firstOrNull(lazyGridMeasuredLine.items)) != null && lazyGridMeasuredItem3.index == lazyListScrollPosition.index$delegate.getIntValue()) {
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
        this.scrollToBeConsumed -= lazyGridMeasureResult.consumedScroll;
        this.layoutInfoState.setValue(lazyGridMeasureResult);
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(((lazyGridMeasuredLine != null ? lazyGridMeasuredLine.index : 0) == 0 && i2 == 0) ? false : true));
        this.canScrollForward$delegate.setValue(Boolean.valueOf(lazyGridMeasureResult.canScrollForward));
        if (z2) {
            lazyListScrollPosition.getClass();
            if (i2 < RecyclerView.DECELERATION_RATE) {
                InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
            }
            lazyListScrollPosition.scrollOffset$delegate.setIntValue(i2);
        } else {
            lazyListScrollPosition.getClass();
            if (lazyGridMeasuredLine != null && (lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt___ArraysKt.firstOrNull(lazyGridMeasuredLine.items)) != null) {
                obj = lazyGridMeasuredItem2.key;
            }
            lazyListScrollPosition.lastKnownFirstItemKey = obj;
            if (lazyListScrollPosition.hadFirstNotEmptyLayout || i > 0) {
                lazyListScrollPosition.hadFirstNotEmptyLayout = true;
                if (i2 < RecyclerView.DECELERATION_RATE) {
                    InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative (" + i2 + ')');
                }
                lazyListScrollPosition.update((lazyGridMeasuredLine == null || (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt___ArraysKt.firstOrNull(lazyGridMeasuredLine.items)) == null) ? 0 : lazyGridMeasuredItem.index, i2);
            }
            if (this.prefetchingEnabled) {
                DefaultLazyListPrefetchStrategy defaultLazyListPrefetchStrategy = this.prefetchStrategy;
                MutableVector mutableVector = (MutableVector) defaultLazyListPrefetchStrategy.currentPrefetchHandle;
                int i3 = defaultLazyListPrefetchStrategy.indexToPrefetch;
                boolean z3 = defaultLazyListPrefetchStrategy.wasScrollingForward;
                if (i3 != -1 && !list.isEmpty() && i3 != DefaultLazyListPrefetchStrategy.calculateLineIndexToPrefetch(lazyGridMeasureResult, z3)) {
                    defaultLazyListPrefetchStrategy.indexToPrefetch = -1;
                    Object[] objArr = mutableVector.content;
                    int i4 = mutableVector.size;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((LazyLayoutPrefetchState.PrefetchHandle) objArr[i5]).cancel();
                    }
                    mutableVector.clear();
                }
                int i6 = defaultLazyListPrefetchStrategy.previousPassItemCount;
                if (i6 != -1 && defaultLazyListPrefetchStrategy.previousPassDelta != RecyclerView.DECELERATION_RATE && i6 != i && !list.isEmpty()) {
                    int calculateLineIndexToPrefetch = DefaultLazyListPrefetchStrategy.calculateLineIndexToPrefetch(lazyGridMeasureResult, defaultLazyListPrefetchStrategy.previousPassDelta < RecyclerView.DECELERATION_RATE);
                    int i7 = defaultLazyListPrefetchStrategy.previousPassDelta < RecyclerView.DECELERATION_RATE ? ((LazyGridMeasuredItem) CollectionsKt.last(list)).index + 1 : ((LazyGridMeasuredItem) CollectionsKt.first(list)).index - 1;
                    if (i7 >= 0 && i7 < i && calculateLineIndexToPrefetch != defaultLazyListPrefetchStrategy.indexToPrefetch && calculateLineIndexToPrefetch >= 0) {
                        defaultLazyListPrefetchStrategy.indexToPrefetch = calculateLineIndexToPrefetch;
                        mutableVector.clear();
                        mutableVector.addAll(mutableVector.size, (List) this.prefetchScope.scheduleLinePrefetch(calculateLineIndexToPrefetch));
                    }
                }
                defaultLazyListPrefetchStrategy.previousPassItemCount = i;
            }
        }
        if (z) {
            anonymousClass4.updateScrollDeltaForApproach$foundation(lazyGridMeasureResult.scrollBackAmount, lazyGridMeasureResult.density, lazyGridMeasureResult.coroutineScope);
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

    public final LazyGridMeasureResult getLayoutInfo() {
        return (LazyGridMeasureResult) this.layoutInfoState.getValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final void notifyPrefetchOnScroll(float f, LazyGridMeasureResult lazyGridMeasureResult) {
        if (this.prefetchingEnabled) {
            DefaultLazyListPrefetchStrategy defaultLazyListPrefetchStrategy = this.prefetchStrategy;
            MutableVector mutableVector = (MutableVector) defaultLazyListPrefetchStrategy.currentPrefetchHandle;
            List list = lazyGridMeasureResult.visibleItemsInfo;
            List list2 = lazyGridMeasureResult.visibleItemsInfo;
            Orientation orientation = lazyGridMeasureResult.orientation;
            if (!list.isEmpty()) {
                int i = 0;
                boolean z = f < RecyclerView.DECELERATION_RATE;
                int calculateLineIndexToPrefetch = DefaultLazyListPrefetchStrategy.calculateLineIndexToPrefetch(lazyGridMeasureResult, z);
                int i2 = z ? ((LazyGridMeasuredItem) CollectionsKt.last(list2)).index + 1 : ((LazyGridMeasuredItem) CollectionsKt.first(list2)).index - 1;
                if (i2 >= 0 && i2 < lazyGridMeasureResult.totalItemsCount) {
                    if (calculateLineIndexToPrefetch != defaultLazyListPrefetchStrategy.indexToPrefetch && calculateLineIndexToPrefetch >= 0) {
                        if (defaultLazyListPrefetchStrategy.wasScrollingForward != z) {
                            Object[] objArr = mutableVector.content;
                            int i3 = mutableVector.size;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((LazyLayoutPrefetchState.PrefetchHandle) objArr[i4]).cancel();
                            }
                        }
                        defaultLazyListPrefetchStrategy.wasScrollingForward = z;
                        defaultLazyListPrefetchStrategy.indexToPrefetch = calculateLineIndexToPrefetch;
                        mutableVector.clear();
                        mutableVector.addAll(mutableVector.size, (List) this.prefetchScope.scheduleLinePrefetch(calculateLineIndexToPrefetch));
                    }
                    if (z) {
                        LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) CollectionsKt.last(list2);
                        if (((zzacn.offsetOnMainAxis(lazyGridMeasuredItem, orientation) + ((int) (orientation == Orientation.Vertical ? lazyGridMeasuredItem.size & BodyPartID.bodyIdMax : lazyGridMeasuredItem.size >> 32))) + lazyGridMeasureResult.mainAxisItemSpacing) - lazyGridMeasureResult.viewportEndOffset < (-f)) {
                            Object[] objArr2 = mutableVector.content;
                            int i5 = mutableVector.size;
                            while (i < i5) {
                                ((LazyLayoutPrefetchState.PrefetchHandle) objArr2[i]).markAsUrgent();
                                i++;
                            }
                        }
                    } else if (lazyGridMeasureResult.viewportStartOffset - zzacn.offsetOnMainAxis((LazyGridMeasuredItem) CollectionsKt.first(list2), orientation) < f) {
                        Object[] objArr3 = mutableVector.content;
                        int i6 = mutableVector.size;
                        while (i < i6) {
                            ((LazyLayoutPrefetchState.PrefetchHandle) objArr3[i]).markAsUrgent();
                            i++;
                        }
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
        LazyGridState$scroll$1 lazyGridState$scroll$1;
        int i;
        Function2 function22;
        if (continuation instanceof LazyGridState$scroll$1) {
            lazyGridState$scroll$1 = (LazyGridState$scroll$1) continuation;
            int i2 = lazyGridState$scroll$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                lazyGridState$scroll$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = lazyGridState$scroll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lazyGridState$scroll$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    function22 = function2;
                    if (this.layoutInfoState.getValue() == LazyGridStateKt.EmptyLazyGridLayoutInfo) {
                        lazyGridState$scroll$1.L$0 = mutatePriority;
                        lazyGridState$scroll$1.L$1 = (SuspendLambda) function2;
                        lazyGridState$scroll$1.label = 1;
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
                    Function2 function23 = (Function2) lazyGridState$scroll$1.L$1;
                    mutatePriority = lazyGridState$scroll$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    function22 = function23;
                }
                lazyGridState$scroll$1.L$0 = null;
                lazyGridState$scroll$1.L$1 = null;
                lazyGridState$scroll$1.label = 2;
            }
        }
        lazyGridState$scroll$1 = new LazyGridState$scroll$1(this, continuation);
        Object obj2 = lazyGridState$scroll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyGridState$scroll$1.label;
        if (i != 0) {
        }
        lazyGridState$scroll$1.L$0 = null;
        lazyGridState$scroll$1.L$1 = null;
        lazyGridState$scroll$1.label = 2;
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
