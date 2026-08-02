package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.appcompat.app.TwilightManager$TwilightState;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.NestedPrefetchScopeImpl;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.unit.Constraints;
import androidx.paging.FlattenedPageEventStorage;
import app.cash.redwood.Modifier$$ExternalSyntheticLambda0;
import com.android.volley.Response;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.MonotonicTimeSource;
import kotlin.time.TimeSource;
import okio.Okio;

/* loaded from: classes3.dex */
public final class PrefetchHandleProvider$HandleAndRequestImpl implements LazyLayoutPrefetchState.PrefetchHandle {
    public long availableTimeNanos;
    public long elapsedTimeNanos;
    public boolean hasResolvedNestedPrefetches;
    public final int index;
    public boolean isApplied;
    public boolean isCanceled;
    public boolean isMeasured;
    public boolean isUrgent;
    public Object keyUsedForComposition;
    public FlattenedPageEventStorage nestedPrefetchController;
    public final Function1 onItemPremeasured;
    public boolean pauseRequested;
    public SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition;
    public SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle;
    public final Recorder.AnonymousClass3 prefetchMetrics;
    public Constraints premeasureConstraints;
    public long startTime;
    public final /* synthetic */ Response this$0;

    public PrefetchHandleProvider$HandleAndRequestImpl(Response response, int i, Recorder.AnonymousClass3 anonymousClass3, Function1 function1) {
        this.this$0 = response;
        this.index = i;
        this.prefetchMetrics = anonymousClass3;
        this.onItemPremeasured = function1;
        TimeSource.Monotonic.INSTANCE.getClass();
        MonotonicTimeSource.INSTANCE.getClass();
        this.startTime = MonotonicTimeSource.read$1();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
    public final void cancel() {
        if (this.isCanceled) {
            return;
        }
        this.isCanceled = true;
        cleanUp();
    }

    public final void cleanUp() {
        SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition = this.pausedPrecomposition;
        if (pausedPrecomposition != null) {
            pausedPrecomposition.cancel();
        }
        this.pausedPrecomposition = null;
        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
        if (precomposedSlotHandle != null) {
            precomposedSlotHandle.dispose();
        }
        this.precomposeHandle = null;
        this.nestedPrefetchController = null;
    }

    public final boolean execute(TwilightManager$TwilightState twilightManager$TwilightState) {
        boolean executeRequest;
        if (!this.this$0.intermediate) {
            return false;
        }
        if (this.isUrgent) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                executeRequest = executeRequest(twilightManager$TwilightState);
            } finally {
                Trace.endSection();
            }
        } else {
            executeRequest = executeRequest(twilightManager$TwilightState);
        }
        Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
        return executeRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01f7 A[Catch: all -> 0x0210, LOOP:2: B:100:0x01cb->B:110:0x01f7, LOOP_END, TRY_ENTER, TryCatch #0 {all -> 0x0210, blocks: (B:84:0x0184, B:86:0x018c, B:88:0x0192, B:91:0x01a0, B:93:0x01ac, B:94:0x01c2, B:95:0x01af, B:99:0x01c4, B:100:0x01cb, B:102:0x01d3, B:107:0x01e4, B:108:0x01e9, B:110:0x01f7, B:117:0x01fd), top: B:83:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean executeRequest(TwilightManager$TwilightState twilightManager$TwilightState) {
        long j;
        ?? r12;
        List list;
        int i = this.index;
        long j2 = i;
        Trace.setCounter("compose:lazy:prefetch:execute:item", j2);
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) ((LazyLayoutItemContentFactory) this.this$0.result).itemProvider.invoke();
        if (!this.isCanceled) {
            int itemCount = lazyLayoutItemProvider.getItemCount();
            if (i >= 0 && i < itemCount) {
                Object key = lazyLayoutItemProvider.getKey(i);
                Object obj = this.keyUsedForComposition;
                if (obj != null && !key.equals(obj)) {
                    cleanUp();
                    return false;
                }
                Object contentType = lazyLayoutItemProvider.getContentType(i);
                Recorder.AnonymousClass3 anonymousClass3 = this.prefetchMetrics;
                Averages averages = (Averages) anonymousClass3.this$0;
                if (anonymousClass3.val$recordingToStart != contentType || averages == null) {
                    MutableScatterMap mutableScatterMap = (MutableScatterMap) anonymousClass3.val$completer;
                    Object obj2 = mutableScatterMap.get(contentType);
                    Object obj3 = obj2;
                    if (obj2 == null) {
                        Averages averages2 = new Averages();
                        averages2.nestedPrefetchCount = -1;
                        mutableScatterMap.set(contentType, averages2);
                        obj3 = averages2;
                    }
                    averages = (Averages) obj3;
                    anonymousClass3.val$recordingToStart = contentType;
                    anonymousClass3.this$0 = averages;
                }
                isComposed();
                long availableTimeNanos = twilightManager$TwilightState.availableTimeNanos();
                this.availableTimeNanos = availableTimeNanos;
                TimeSource.Monotonic.INSTANCE.getClass();
                MonotonicTimeSource.INSTANCE.getClass();
                this.startTime = MonotonicTimeSource.read$1();
                this.elapsedTimeNanos = 0L;
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", availableTimeNanos);
                if (isComposed()) {
                    j = 0;
                } else {
                    j = 0;
                    if (shouldExecute(this.availableTimeNanos, averages.resumeTimeNanos + averages.pauseTimeNanos)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            performPausableComposition(key, contentType, averages);
                        } finally {
                        }
                    }
                    if (!isComposed()) {
                        return true;
                    }
                }
                if (this.pausedPrecomposition != null) {
                    if (!shouldExecute(this.availableTimeNanos, averages.applyTimeNanos)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition = this.pausedPrecomposition;
                        if (pausedPrecomposition == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        this.precomposeHandle = pausedPrecomposition.apply();
                        this.pausedPrecomposition = null;
                        this.isApplied = true;
                        Trace.endSection();
                        updateElapsedAndAvailableTime();
                        averages.applyTimeNanos = Averages.calculateAverageTime(this.elapsedTimeNanos, averages.applyTimeNanos);
                    } finally {
                    }
                }
                if (!this.hasResolvedNestedPrefetches) {
                    if (this.availableTimeNanos <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
                        if (precomposedSlotHandle == null) {
                            throw Recorder$$ExternalSyntheticOutline2.m("Should precompose before resolving nested prefetch states");
                        }
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        precomposedSlotHandle.traverseDescendants(new Modifier$$ExternalSyntheticLambda0(1, ref$ObjectRef));
                        List list2 = (List) ref$ObjectRef.element;
                        this.nestedPrefetchController = list2 != null ? new FlattenedPageEventStorage(this, list2) : null;
                        this.hasResolvedNestedPrefetches = true;
                    } finally {
                    }
                }
                FlattenedPageEventStorage flattenedPageEventStorage = this.nestedPrefetchController;
                if (flattenedPageEventStorage != null) {
                    int i2 = averages.nestedPrefetchCount;
                    boolean z = this.isUrgent;
                    List[] listArr = (List[]) flattenedPageEventStorage.sourceStates;
                    int i3 = flattenedPageEventStorage.placeholdersBefore;
                    List list3 = flattenedPageEventStorage.pages;
                    if (i3 < list3.size()) {
                        if (((PrefetchHandleProvider$HandleAndRequestImpl) flattenedPageEventStorage.mediatorStates).isCanceled) {
                            InlineClassHelperKt.throwIllegalStateException("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list3.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((LazyLayoutPrefetchState) list3.get(i4)).realizedNestedPrefetchCount = i2;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (flattenedPageEventStorage.placeholdersBefore < list3.size()) {
                                try {
                                    if (listArr[flattenedPageEventStorage.placeholdersBefore] == null) {
                                        if (twilightManager$TwilightState.availableTimeNanos() <= j) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i5 = flattenedPageEventStorage.placeholdersBefore;
                                        LazyLayoutPrefetchState lazyLayoutPrefetchState = (LazyLayoutPrefetchState) list3.get(i5);
                                        Function1 function1 = lazyLayoutPrefetchState.onNestedPrefetch;
                                        if (function1 == null) {
                                            list = EmptyList.INSTANCE;
                                        } else {
                                            LazyLayoutPrefetchState.NestedPrefetchScopeImpl nestedPrefetchScopeImpl = lazyLayoutPrefetchState.new NestedPrefetchScopeImpl(lazyLayoutPrefetchState.realizedNestedPrefetchCount);
                                            function1.invoke(nestedPrefetchScopeImpl);
                                            ArrayList arrayList = nestedPrefetchScopeImpl._requests;
                                            lazyLayoutPrefetchState.lastNumberOfNestedPrefetchItems = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i5] = list;
                                    }
                                    List list4 = listArr[flattenedPageEventStorage.placeholdersBefore];
                                    list4.getClass();
                                    while (flattenedPageEventStorage.placeholdersAfter < list4.size()) {
                                        PrefetchHandleProvider$HandleAndRequestImpl prefetchHandleProvider$HandleAndRequestImpl = (PrefetchHandleProvider$HandleAndRequestImpl) list4.get(flattenedPageEventStorage.placeholdersAfter);
                                        if (z) {
                                            PrefetchHandleProvider$HandleAndRequestImpl prefetchHandleProvider$HandleAndRequestImpl2 = prefetchHandleProvider$HandleAndRequestImpl != null ? prefetchHandleProvider$HandleAndRequestImpl : null;
                                            if (prefetchHandleProvider$HandleAndRequestImpl2 != null) {
                                                r12 = 1;
                                                prefetchHandleProvider$HandleAndRequestImpl2.isUrgent = true;
                                                flattenedPageEventStorage.receivedFirstEvent = r12;
                                                if (!prefetchHandleProvider$HandleAndRequestImpl.execute(twilightManager$TwilightState)) {
                                                    return r12;
                                                }
                                                flattenedPageEventStorage.placeholdersAfter += r12;
                                            }
                                        }
                                        r12 = 1;
                                        flattenedPageEventStorage.receivedFirstEvent = r12;
                                        if (!prefetchHandleProvider$HandleAndRequestImpl.execute(twilightManager$TwilightState)) {
                                        }
                                    }
                                    flattenedPageEventStorage.placeholdersAfter = 0;
                                    flattenedPageEventStorage.placeholdersBefore++;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                FlattenedPageEventStorage flattenedPageEventStorage2 = this.nestedPrefetchController;
                if (flattenedPageEventStorage2 != null && flattenedPageEventStorage2.receivedFirstEvent) {
                    updateElapsedAndAvailableTime();
                    Trace.setCounter("compose:lazy:prefetch:execute:item", j2);
                    FlattenedPageEventStorage flattenedPageEventStorage3 = this.nestedPrefetchController;
                    if (flattenedPageEventStorage3 != null) {
                        flattenedPageEventStorage3.receivedFirstEvent = false;
                    }
                }
                Constraints constraints = this.premeasureConstraints;
                if (!this.isMeasured && constraints != null) {
                    if (!shouldExecute(this.availableTimeNanos, averages.measureTimeNanos)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j3 = constraints.value;
                        if (this.isCanceled) {
                            InlineClassHelperKt.throwIllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.isMeasured) {
                            InlineClassHelperKt.throwIllegalArgumentException("Request was already measured!");
                        }
                        this.isMeasured = true;
                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle2 = this.precomposeHandle;
                        if (precomposedSlotHandle2 == null) {
                            throw Recorder$$ExternalSyntheticOutline2.m("performComposition() must be called before performMeasure()");
                        }
                        int placeablesCount = precomposedSlotHandle2.getPlaceablesCount();
                        for (int i6 = 0; i6 < placeablesCount; i6++) {
                            precomposedSlotHandle2.mo849premeasure0kLqBqw(i6, j3);
                        }
                        Trace.endSection();
                        updateElapsedAndAvailableTime();
                        averages.measureTimeNanos = Averages.calculateAverageTime(this.elapsedTimeNanos, averages.measureTimeNanos);
                        Function1 function12 = this.onItemPremeasured;
                        if (function12 != null) {
                            function12.invoke(this);
                        }
                    } finally {
                    }
                }
                FlattenedPageEventStorage flattenedPageEventStorage4 = this.nestedPrefetchController;
                if (this.isMeasured && this.hasResolvedNestedPrefetches && flattenedPageEventStorage4 != null) {
                    List list5 = flattenedPageEventStorage4.pages;
                    List list6 = list5;
                    int size2 = list6.size();
                    int i7 = Integer.MAX_VALUE;
                    for (int i8 = 0; i8 < size2; i8++) {
                        i7 = Math.min(i7, ((LazyLayoutPrefetchState) list5.get(i8)).idealNestedPrefetchCount);
                    }
                    if (i7 == Integer.MAX_VALUE) {
                        i7 = 0;
                    }
                    int i9 = averages.nestedPrefetchCount;
                    averages.nestedPrefetchCount = i9 == -1 ? i7 : Recorder$$ExternalSyntheticOutline1.m(i9, 3, i7, 4);
                    int size3 = list6.size();
                    int i10 = Integer.MAX_VALUE;
                    for (int i11 = 0; i11 < size3; i11++) {
                        i10 = Math.min(i10, ((LazyLayoutPrefetchState) list5.get(i11)).lastNumberOfNestedPrefetchItems);
                    }
                    if (i10 == Integer.MAX_VALUE) {
                        i10 = 0;
                    }
                    if (i10 < i7) {
                        averages.measureTimeNanos = j;
                    }
                }
                return false;
            }
        }
        cleanUp();
        return false;
    }

    public final boolean isComposed() {
        SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition;
        return this.isApplied || ((pausedPrecomposition = this.pausedPrecomposition) != null && pausedPrecomposition.isComplete());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
    public final void markAsUrgent() {
        this.isUrgent = true;
    }

    public final void performPausableComposition(Object obj, Object obj2, Averages averages) {
        SubcomposeLayoutState.PausedPrecomposition anonymousClass1;
        SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition = this.pausedPrecomposition;
        boolean z = false;
        if (pausedPrecomposition == null) {
            Response response = this.this$0;
            Function2 content = ((LazyLayoutItemContentFactory) response.result).getContent(this.index, obj, obj2);
            LayoutNodeSubcompositionsState state = ((SubcomposeLayoutState) response.cacheEntry).getState();
            if (state.root.isAttached()) {
                state.precompose(obj, content, true);
                anonymousClass1 = new Recorder.AnonymousClass1(20, state, obj);
            } else {
                anonymousClass1 = new Recorder.AnonymousClass4(state, obj, z, 19);
            }
            pausedPrecomposition = anonymousClass1;
            this.pausedPrecomposition = pausedPrecomposition;
            this.keyUsedForComposition = obj;
        }
        this.pauseRequested = false;
        while (!pausedPrecomposition.isComplete() && !this.pauseRequested) {
            pausedPrecomposition.resume(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(7, this, averages));
        }
        updateElapsedAndAvailableTime();
        boolean z2 = this.pauseRequested;
        long j = this.elapsedTimeNanos;
        if (z2) {
            averages.pauseTimeNanos = Averages.calculateAverageTime(j, averages.pauseTimeNanos);
        } else {
            averages.resumeTimeNanos = Averages.calculateAverageTime(j, averages.resumeTimeNanos);
        }
    }

    public final boolean shouldExecute(long j, long j2) {
        if (this.isUrgent) {
            j2 = 0;
        }
        return j > j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.index);
        sb.append(", constraints = ");
        sb.append(this.premeasureConstraints);
        sb.append(", isComposed = ");
        sb.append(isComposed());
        sb.append(", isMeasured = ");
        sb.append(this.isMeasured);
        sb.append(", isCanceled = ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isCanceled, " }");
    }

    public final void updateElapsedAndAvailableTime() {
        long infinityOfSign;
        TimeSource.Monotonic.INSTANCE.getClass();
        MonotonicTimeSource monotonicTimeSource = MonotonicTimeSource.INSTANCE;
        monotonicTimeSource.getClass();
        long read$1 = MonotonicTimeSource.read$1();
        long j = this.startTime;
        monotonicTimeSource.getClass();
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        if (((j - 1) | 1) != Long.MAX_VALUE) {
            infinityOfSign = (1 | (read$1 - 1)) == Long.MAX_VALUE ? Okio.infinityOfSign(read$1) : Okio.saturatingFiniteDiff(read$1, j);
        } else if (read$1 == j) {
            Duration.Companion.getClass();
            infinityOfSign = 0;
        } else {
            infinityOfSign = Duration.m4179unaryMinusUwyO8pc(Okio.infinityOfSign(j));
        }
        long m4168getInWholeNanosecondsimpl = Duration.m4168getInWholeNanosecondsimpl(infinityOfSign);
        this.elapsedTimeNanos = m4168getInWholeNanosecondsimpl;
        long j2 = this.availableTimeNanos - m4168getInWholeNanosecondsimpl;
        this.availableTimeNanos = j2;
        this.startTime = read$1;
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", j2);
    }
}
