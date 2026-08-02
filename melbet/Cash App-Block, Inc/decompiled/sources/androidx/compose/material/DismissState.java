package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DefaultDraggableState;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.paging.CachedPagingDataKt$cachedIn$5;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import app.cash.local.views.internal.LocalMapKt$LocalMap$2$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class DismissState {
    public final ParcelableSnapshotMutableState anchors$delegate;
    public final Function1 confirmStateChange;
    public final ParcelableSnapshotMutableState currentValue$delegate;
    public final DefaultDraggableState draggableState;
    public final FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 latestNonEmptyAnchorsFlow;
    public float maxBound;
    public float minBound;
    public final ParcelableSnapshotMutableState resistance$delegate;
    public final ParcelableSnapshotMutableState thresholds$delegate;
    public final ParcelableSnapshotMutableFloatState velocityThreshold$delegate;
    public final AnimationSpec animationSpec = SwipeableDefaults.AnimationSpec;
    public final ParcelableSnapshotMutableState isAnimationRunning$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
    public final ParcelableSnapshotMutableFloatState offsetState = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    public final ParcelableSnapshotMutableFloatState overflowState = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    public final ParcelableSnapshotMutableFloatState absoluteOffset = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    public final ParcelableSnapshotMutableState animationTarget = Updater.mutableStateOf$default(null);

    public DismissState(DismissValue dismissValue, Function1 function1) {
        this.confirmStateChange = function1;
        this.currentValue$delegate = Updater.mutableStateOf$default(dismissValue);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.anchors$delegate = Updater.mutableStateOf$default(emptyMap);
        int i = 0;
        this.latestNonEmptyAnchorsFlow = FlowKt.take(new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new Worker$$ExternalSyntheticLambda0(this, 4)), i), 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds$delegate = Updater.mutableStateOf$default(new SnackbarHostKt$$ExternalSyntheticLambda2(21));
        this.velocityThreshold$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
        this.resistance$delegate = Updater.mutableStateOf$default(null);
        SwipeableState$$ExternalSyntheticLambda2 swipeableState$$ExternalSyntheticLambda2 = new SwipeableState$$ExternalSyntheticLambda2(this, i);
        CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$5 = DraggableKt.NoOpOnDragStarted;
        this.draggableState = new DefaultDraggableState(swipeableState$$ExternalSyntheticLambda2);
    }

    public static Object animateTo$default(DismissState dismissState, Object obj, Continuation continuation) {
        Object collect = dismissState.latestNonEmptyAnchorsFlow.collect(new SwipeableState$animateTo$2(0, obj, dismissState, dismissState.animationSpec), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }

    public final Object animateInternalToOffset(float f, AnimationSpec animationSpec, Continuation continuation) {
        Object drag = this.draggableState.drag(MutatePriority.Default, new SwipeableState$animateInternalToOffset$2(this, f, animationSpec, (Continuation) null), continuation);
        return drag == CoroutineSingletons.COROUTINE_SUSPENDED ? drag : Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:3|(6:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:19|20))(4:21|22|23|15))(3:25|26|27))(3:28|(2:30|(2:32|(1:34))(2:37|38))(2:39|(3:41|(2:43|(1:45)(3:48|(1:50)(2:52|(2:54|(3:55|(1:57)|58)))|51))(4:62|(1:64)|65|(1:67)(3:68|(1:70)(2:72|(2:74|(3:75|(1:77)|78)))|71))|46))|36)|16|17))|7|(0)(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        if (r11 == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c2, code lost:
    
        if (r14 == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f8, code lost:
    
        r0.L$0 = r13;
        r0.F$0 = r12;
        r0.label = 3;
        r14 = r3.drag(androidx.compose.foundation.MutatePriority.Default, new app.cash.local.views.internal.LocalMapKt$LocalMap$2$1(r12, r11, null), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020e, code lost:
    
        if (r14 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0213, code lost:
    
        if (r14 == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0211, code lost:
    
        r14 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.material.DismissState] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v1, types: [float] */
    /* JADX WARN: Type inference failed for: r12v2, types: [float] */
    /* JADX WARN: Type inference failed for: r12v21, types: [float] */
    /* JADX WARN: Type inference failed for: r12v57, types: [float] */
    /* JADX WARN: Type inference failed for: r12v59, types: [float] */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processNewAnchors$material(Map map, LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        SwipeableState$processNewAnchors$1 swipeableState$processNewAnchors$1;
        int i;
        Float f;
        Map map2;
        Object next;
        float f2;
        Object next2;
        try {
            if (continuationImpl instanceof SwipeableState$processNewAnchors$1) {
                swipeableState$processNewAnchors$1 = (SwipeableState$processNewAnchors$1) continuationImpl;
                int i2 = swipeableState$processNewAnchors$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    swipeableState$processNewAnchors$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = swipeableState$processNewAnchors$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = swipeableState$processNewAnchors$1.label;
                    DefaultDraggableState defaultDraggableState = this.draggableState;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        boolean isEmpty = map.isEmpty();
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.currentValue$delegate;
                        if (isEmpty) {
                            Float m4125minOrNull = CollectionsKt.m4125minOrNull((Iterable) linkedHashMap.keySet());
                            m4125minOrNull.getClass();
                            this.minBound = m4125minOrNull.floatValue();
                            Float m4123maxOrNull = CollectionsKt.m4123maxOrNull((Iterable) linkedHashMap.keySet());
                            m4123maxOrNull.getClass();
                            this.maxBound = m4123maxOrNull.floatValue();
                            Float access$getOffset = CardKt.access$getOffset(linkedHashMap, parcelableSnapshotMutableState.getValue());
                            if (access$getOffset == null) {
                                a$$ExternalSyntheticBUOutline0.m$3("The initial value must have an associated anchor.");
                                return null;
                            }
                            float floatValue = access$getOffset.floatValue();
                            swipeableState$processNewAnchors$1.label = 1;
                            Object drag = defaultDraggableState.drag(MutatePriority.Default, new LocalMapKt$LocalMap$2$1(floatValue, this, null), swipeableState$processNewAnchors$1);
                            if (drag != coroutineSingletons) {
                                drag = Unit.INSTANCE;
                            }
                        } else if (!Intrinsics.areEqual((Object) linkedHashMap, (Object) map)) {
                            this.minBound = Float.NEGATIVE_INFINITY;
                            this.maxBound = Float.POSITIVE_INFINITY;
                            Float f3 = (Float) this.animationTarget.getValue();
                            if (f3 != null) {
                                Float access$getOffset2 = CardKt.access$getOffset(linkedHashMap, map.get(f3));
                                if (access$getOffset2 != null) {
                                    f2 = access$getOffset2.floatValue();
                                } else {
                                    Iterator it = linkedHashMap.keySet().iterator();
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        if (it.hasNext()) {
                                            float abs = Math.abs(((Number) next2).floatValue() - f3.floatValue());
                                            do {
                                                Object next3 = it.next();
                                                float abs2 = Math.abs(((Number) next3).floatValue() - f3.floatValue());
                                                if (Float.compare(abs, abs2) > 0) {
                                                    next2 = next3;
                                                    abs = abs2;
                                                }
                                            } while (it.hasNext());
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                    next2.getClass();
                                    f2 = ((Number) next2).floatValue();
                                }
                            } else {
                                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.offsetState;
                                Object obj2 = map.get(parcelableSnapshotMutableFloatState.getValue());
                                if (Intrinsics.areEqual(obj2, parcelableSnapshotMutableState.getValue())) {
                                    obj2 = parcelableSnapshotMutableState.getValue();
                                }
                                Float access$getOffset3 = CardKt.access$getOffset(linkedHashMap, obj2);
                                if (access$getOffset3 != null) {
                                    f2 = access$getOffset3.floatValue();
                                } else {
                                    Iterator it2 = linkedHashMap.keySet().iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            float abs3 = Math.abs(((Number) next).floatValue() - ((Number) parcelableSnapshotMutableFloatState.getValue()).floatValue());
                                            do {
                                                Object next4 = it2.next();
                                                float abs4 = Math.abs(((Number) next4).floatValue() - ((Number) parcelableSnapshotMutableFloatState.getValue()).floatValue());
                                                if (Float.compare(abs3, abs4) > 0) {
                                                    next = next4;
                                                    abs3 = abs4;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    next.getClass();
                                    f2 = ((Number) next).floatValue();
                                }
                            }
                            AnimationSpec animationSpec = this.animationSpec;
                            swipeableState$processNewAnchors$1.L$0 = linkedHashMap;
                            swipeableState$processNewAnchors$1.F$0 = f2;
                            swipeableState$processNewAnchors$1.label = 2;
                            Object animateInternalToOffset = animateInternalToOffset(f2, animationSpec, swipeableState$processNewAnchors$1);
                            map = f2;
                            linkedHashMap = linkedHashMap;
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i == 2) {
                        float f4 = swipeableState$processNewAnchors$1.F$0;
                        Map map3 = swipeableState$processNewAnchors$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        map = f4;
                        linkedHashMap = map3;
                        f = new Float((float) map);
                        map2 = linkedHashMap;
                        setCurrentValue(MapsKt__MapsKt.getValue(map2, f));
                        Float m4125minOrNull2 = CollectionsKt.m4125minOrNull((Iterable) map2.keySet());
                        m4125minOrNull2.getClass();
                        this.minBound = m4125minOrNull2.floatValue();
                        Float m4123maxOrNull2 = CollectionsKt.m4123maxOrNull((Iterable) map2.keySet());
                        m4123maxOrNull2.getClass();
                        this.maxBound = m4123maxOrNull2.floatValue();
                    } else {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        map = swipeableState$processNewAnchors$1.F$0;
                        linkedHashMap = swipeableState$processNewAnchors$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        f = new Float((float) map);
                        map2 = linkedHashMap;
                        setCurrentValue(MapsKt__MapsKt.getValue(map2, f));
                        Float m4125minOrNull22 = CollectionsKt.m4125minOrNull((Iterable) map2.keySet());
                        m4125minOrNull22.getClass();
                        this.minBound = m4125minOrNull22.floatValue();
                        Float m4123maxOrNull22 = CollectionsKt.m4123maxOrNull((Iterable) map2.keySet());
                        m4123maxOrNull22.getClass();
                        this.maxBound = m4123maxOrNull22.floatValue();
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            setCurrentValue(MapsKt__MapsKt.getValue(linkedHashMap, new Float((float) map)));
            Float m4125minOrNull3 = CollectionsKt.m4125minOrNull((Iterable) linkedHashMap.keySet());
            m4125minOrNull3.getClass();
            this.minBound = m4125minOrNull3.floatValue();
            Float m4123maxOrNull3 = CollectionsKt.m4123maxOrNull((Iterable) linkedHashMap.keySet());
            m4123maxOrNull3.getClass();
            this.maxBound = m4123maxOrNull3.floatValue();
            throw th;
        }
        swipeableState$processNewAnchors$1 = new SwipeableState$processNewAnchors$1(this, continuationImpl);
        Object obj3 = swipeableState$processNewAnchors$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = swipeableState$processNewAnchors$1.label;
        DefaultDraggableState defaultDraggableState2 = this.draggableState;
    }

    public final void setCurrentValue(Object obj) {
        this.currentValue$delegate.setValue(obj);
    }
}
