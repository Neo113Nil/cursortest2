package androidx.compose.runtime;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Transition$$ExternalSyntheticLambda2;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operation;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operations;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda0;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.EventStore$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.wire.GrpcMethod;
import com.stripe.android.uicore.utils.StateFlowsComposeKt$produceState$1$1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public abstract class Updater {
    public static final ComposableLambdaImpl lambda$954879418 = new ComposableLambdaImpl(new SaversKt$$ExternalSyntheticLambda0(2), false, 954879418);
    public static final ComposableLambdaImpl lambda$1918065384 = new ComposableLambdaImpl(new SaversKt$$ExternalSyntheticLambda0(3), false, 1918065384);
    public static final Object PendingApplyNoModifications = new Object();
    public static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();
    public static final EventStore$$ExternalSyntheticLambda0 InvalidationLocationAscending = new EventStore$$ExternalSyntheticLambda0(1);

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompositionLocalProvider(ProvidedValue providedValue, Function2 function2, Composer composer, int i) {
        ValueHolder valueHolder;
        boolean z;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-149765515);
        IntStack intStack = gapComposer.providersInvalidStack;
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        gapComposer.startGroup(EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, ComposerKt.provider);
        Object rememberedValue = gapComposer.rememberedValue();
        if (Intrinsics.areEqual(rememberedValue, Composer.Companion.Empty)) {
            valueHolder = null;
        } else {
            rememberedValue.getClass();
            valueHolder = (ValueHolder) rememberedValue;
        }
        ProvidableCompositionLocal providableCompositionLocal = providedValue.compositionLocal;
        providableCompositionLocal.getClass();
        ValueHolder updatedStateOf$runtime = providableCompositionLocal.updatedStateOf$runtime(providedValue, valueHolder);
        boolean equals = updatedStateOf$runtime.equals(valueHolder);
        if (!equals) {
            gapComposer.updateRememberedValue(updatedStateOf$runtime);
        }
        if (gapComposer.inserting) {
            if (providedValue.canOverride || !currentCompositionLocalScope.containsKey(providableCompositionLocal)) {
                currentCompositionLocalScope = currentCompositionLocalScope.putValue(providableCompositionLocal, updatedStateOf$runtime);
            }
            gapComposer.writerHasAProvider = true;
        } else {
            SlotReader slotReader = gapComposer.reader;
            Object aux = slotReader.aux(slotReader.currentGroup, slotReader.groups);
            aux.getClass();
            PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = (PersistentCompositionLocalHashMap) aux;
            if (!(gapComposer.getSkipping() && equals) && (providedValue.canOverride || !currentCompositionLocalScope.containsKey(providableCompositionLocal))) {
                currentCompositionLocalScope = currentCompositionLocalScope.putValue(providableCompositionLocal, updatedStateOf$runtime);
            } else if ((equals && !gapComposer.providersInvalid) || !gapComposer.providersInvalid) {
                currentCompositionLocalScope = persistentCompositionLocalHashMap;
            }
            if (gapComposer.reusing || persistentCompositionLocalHashMap != currentCompositionLocalScope) {
                z = true;
                if (z && !gapComposer.inserting) {
                    gapComposer.recordProviderUpdate(currentCompositionLocalScope);
                }
                intStack.push(gapComposer.providersInvalid ? 1 : 0);
                gapComposer.providersInvalid = z;
                gapComposer.providerCache = currentCompositionLocalScope;
                gapComposer.m570startAzEfcrM(EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, ComposerKt.compositionLocalMap, currentCompositionLocalScope, 0);
                Recorder$$ExternalSyntheticOutline2.m((i >> 3) & 14, function2, gapComposer, false, false);
                gapComposer.providersInvalid = intStack.pop() != 0;
                gapComposer.providerCache = null;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new Transition$$ExternalSyntheticLambda2(providedValue, function2, i, 2);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            gapComposer.recordProviderUpdate(currentCompositionLocalScope);
        }
        intStack.push(gapComposer.providersInvalid ? 1 : 0);
        gapComposer.providersInvalid = z;
        gapComposer.providerCache = currentCompositionLocalScope;
        gapComposer.m570startAzEfcrM(EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, ComposerKt.compositionLocalMap, currentCompositionLocalScope, 0);
        Recorder$$ExternalSyntheticOutline2.m((i >> 3) & 14, function2, gapComposer, false, false);
        gapComposer.providersInvalid = intStack.pop() != 0;
        gapComposer.providerCache = null;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void DisposableEffect(Object[] objArr, Function1 function1, Composer composer) {
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= ((GapComposer) composer).changed(obj);
        }
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.Empty) {
            gapComposer.updateRememberedValue(new DisposableEffectImpl(function1));
        }
    }

    public static final void LaunchedEffect(Object[] objArr, Function2 function2, Composer composer) {
        CoroutineContext coroutineContext = ((GapComposer) composer).applyCoroutineContext;
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= ((GapComposer) composer).changed(obj);
        }
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.Empty) {
            gapComposer.updateRememberedValue(new LaunchedEffectImpl(coroutineContext, function2));
        }
    }

    public static final void SideEffect(Function0 function0, Composer composer) {
        Operations operations2 = ((GapComposer) composer).changeListWriter.changeList.f854operations;
        operations2.pushOp(Operation.SideEffect.INSTANCE);
        DBUtil.m1186setObjectsGr0YRc(operations2, 0, function0);
    }

    public static final void access$removeRange(int i, int i2, List list) {
        int findLocation = findLocation(i, list);
        if (findLocation < 0) {
            findLocation = -(findLocation + 1);
        }
        while (findLocation < list.size() && ((Invalidation) list.get(findLocation)).location < i2) {
        }
    }

    public static void adoptAnchoredScopes$runtime(SlotWriter slotWriter, List list, CompositionImpl compositionImpl) {
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            int anchorIndex = slotWriter.anchorIndex((GapAnchor) list.get(i));
            int slotIndex = slotWriter.slotIndex(slotWriter.groupIndexToAddress(anchorIndex), slotWriter.groups);
            Object obj = slotIndex < slotWriter.dataIndex(slotWriter.groupIndexToAddress(anchorIndex + 1), slotWriter.groups) ? slotWriter.slots[slotWriter.dataIndexToDataAddress(slotIndex)] : Composer.Companion.Empty;
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                recomposeScopeImpl.owner = compositionImpl;
            }
        }
    }

    public static final MutableState collectAsState(Flow flow, Object obj, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        GapComposer gapComposer = (GapComposer) composer;
        boolean changedInstance = gapComposer.changedInstance(coroutineContext2) | gapComposer.changedInstance(flow);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new DataStoreImpl$data$1(coroutineContext2, flow, (Continuation) null, 7);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return produceState(obj, flow, coroutineContext2, (Function2) rememberedValue, gapComposer, ((i >> 3) & 14) | (i & 896));
    }

    public static final void collectNodesFrom$lambda$0$collectFromGroup(SlotReader slotReader, ArrayList arrayList, int i) {
        boolean isNode = slotReader.isNode(i);
        int[] iArr = slotReader.groups;
        if (isNode) {
            arrayList.add(slotReader.node(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            collectNodesFrom$lambda$0$collectFromGroup(slotReader, arrayList, i3);
        }
    }

    public static final CoroutineScope createCompositionCoroutineScope(CoroutineContext coroutineContext, Composer composer) {
        if (coroutineContext.get(Job.Key.$$INSTANCE) == null) {
            return new RememberedCoroutineScope(((GapComposer) composer).applyCoroutineContext, coroutineContext);
        }
        JobImpl Job$default = JobKt.Job$default();
        Job$default.makeCompleting$kotlinx_coroutines_core(new CompletedExceptionally(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
        return JobKt.CoroutineScope(Job$default);
    }

    public static final MutableVector derivedStateObservers() {
        GrpcMethod grpcMethod = SnapshotStateKt__DerivedStateKt.derivedStateObservers;
        MutableVector mutableVector = (MutableVector) grpcMethod.get();
        if (mutableVector != null) {
            return mutableVector;
        }
        MutableVector mutableVector2 = new MutableVector(0, new GapComposer$derivedStateObserver$1[0]);
        grpcMethod.set(mutableVector2);
        return mutableVector2;
    }

    public static final DerivedSnapshotState derivedStateOf(Function0 function0) {
        GrpcMethod grpcMethod = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
        return new DerivedSnapshotState(null, function0);
    }

    public static final int findLocation(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int compare = Intrinsics.compare(((Invalidation) list.get(i3)).location, i);
            if (compare < 0) {
                i2 = i3 + 1;
            } else {
                if (compare <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int getCurrentCompositeKeyHash(Composer composer) {
        composer.getClass();
        return Long.hashCode(((GapComposer) composer).compositeKeyHashCode);
    }

    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        Object obj4 = joinedKey.right;
        Object obj5 = joinedKey.left;
        if (Intrinsics.areEqual(obj5, obj2) && Intrinsics.areEqual(obj4, obj3)) {
            return obj;
        }
        Object key = getKey(obj5, obj2, obj3);
        return key == null ? getKey(obj4, obj2, obj3) : key;
    }

    public static final MonotonicFrameClock getMonotonicFrameClock(CoroutineContext coroutineContext) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) coroutineContext.get(NeverEqualPolicy.$$INSTANCE);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        a$$ExternalSyntheticBUOutline0.m$1("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final void m574initimpl(Composer composer, Integer num, Function2 function2) {
        if (((GapComposer) composer).inserting) {
            ((GapComposer) composer).apply(num, function2);
        }
    }

    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final ParcelableSnapshotMutableFloatState mutableFloatStateOf() {
        return new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
    }

    public static final SnapshotStateMap mutableStateMapOf() {
        return new SnapshotStateMap();
    }

    public static ParcelableSnapshotMutableState mutableStateOf$default(Object obj) {
        return new ParcelableSnapshotMutableState(obj, NeverEqualPolicy.INSTANCE$3);
    }

    public static final MutableState produceState(Object obj, Object[] objArr, Function2 function2, GapComposer gapComposer) {
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = mutableStateOf$default(obj);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        boolean changedInstance = gapComposer.changedInstance(function2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new StateFlowsComposeKt$produceState$1$1(function2, mutableState, null, 2);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        LaunchedEffect(copyOf, (Function2) rememberedValue2, gapComposer);
        return mutableState;
    }

    public static final Object read(PersistentCompositionLocalHashMap persistentCompositionLocalHashMap, ProvidableCompositionLocal providableCompositionLocal) {
        providableCompositionLocal.getClass();
        Object obj = persistentCompositionLocalHashMap.get(providableCompositionLocal);
        if (obj == null) {
            obj = providableCompositionLocal.getDefaultValueHolder$runtime();
        }
        return ((ValueHolder) obj).readValue(persistentCompositionLocalHashMap);
    }

    /* renamed from: reconcile-impl, reason: not valid java name */
    public static final void m575reconcileimpl(Composer composer, Function1 function1) {
        ((GapComposer) composer).apply(Unit.INSTANCE, new Updater$$ExternalSyntheticLambda0(function1, 0, (byte) 0));
    }

    public static final MutableState rememberUpdatedState(Object obj, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = mutableStateOf$default(obj);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        mutableState.setValue(obj);
        return mutableState;
    }

    public static final void removeData(SlotWriter slotWriter, int i, Object obj) {
        int dataIndexToDataAddress = slotWriter.dataIndexToDataAddress(i);
        Object[] objArr = slotWriter.slots;
        Object obj2 = objArr[dataIndexToDataAddress];
        objArr[dataIndexToDataAddress] = Composer.Companion.Empty;
        if (obj == obj2) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m576setimpl(Composer composer, Object obj, Function2 function2) {
        if (((GapComposer) composer).inserting || !Intrinsics.areEqual(((GapComposer) composer).rememberedValue(), obj)) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.updateRememberedValue(obj);
            gapComposer.apply(obj, function2);
        }
    }

    public static final SafeFlow snapshotFlow(Function0 function0) {
        return new SafeFlow(new Recomposer$recompositionRunner$2(function0, null));
    }

    public static final StaticProvidableCompositionLocal staticCompositionLocalOf(Function0 function0) {
        return new StaticProvidableCompositionLocal(function0);
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m577updateimpl(Composer composer, Object obj, Function2 function2) {
        boolean z = ((GapComposer) composer).inserting;
        if (z || !Intrinsics.areEqual(((GapComposer) composer).rememberedValue(), obj)) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.updateRememberedValue(obj);
            if (z) {
                return;
            }
            gapComposer.apply(obj, function2);
        }
    }

    public static final int updateChangedFlags(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final PersistentCompositionLocalHashMap updateCompositionMap(ProvidedValue[] providedValueArr, PersistentCompositionLocalHashMap persistentCompositionLocalHashMap, PersistentCompositionLocalHashMap persistentCompositionLocalHashMap2) {
        PersistentCompositionLocalHashMap persistentCompositionLocalHashMap3 = PersistentCompositionLocalHashMap.Empty;
        PersistentCompositionLocalHashMap.Builder builder = new PersistentCompositionLocalHashMap.Builder(persistentCompositionLocalHashMap3);
        builder.map = persistentCompositionLocalHashMap3;
        for (ProvidedValue providedValue : providedValueArr) {
            ProvidableCompositionLocal providableCompositionLocal = providedValue.compositionLocal;
            providableCompositionLocal.getClass();
            if (providedValue.canOverride || !persistentCompositionLocalHashMap.containsKey(providableCompositionLocal)) {
                builder.put(providableCompositionLocal, providableCompositionLocal.updatedStateOf$runtime(providedValue, (ValueHolder) persistentCompositionLocalHashMap2.get(providableCompositionLocal)));
            }
        }
        return builder.build$1();
    }

    public static final Object withFrameMillis(Function1 function1, SuspendLambda suspendLambda) {
        return getMonotonicFrameClock(suspendLambda.getContext()).withFrameNanos(suspendLambda, new MonotonicFrameClockKt$withFrameMillis$2(0, function1));
    }

    public static final DerivedSnapshotState derivedStateOf(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0) {
        GrpcMethod grpcMethod = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
        return new DerivedSnapshotState(snapshotMutationPolicy, function0);
    }

    public static final void DisposableEffect(Object obj, Object obj2, Function1 function1, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        boolean changed = gapComposer.changed(obj) | gapComposer.changed(obj2);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new DisposableEffectImpl(function1);
            gapComposer.updateRememberedValue(rememberedValue);
        }
    }

    public static final MutableState produceState(Object obj, Object obj2, Function2 function2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = mutableStateOf$default(obj);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(function2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(function2, mutableState, null, 1);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        LaunchedEffect(gapComposer, obj2, (Function2) rememberedValue2);
        return mutableState;
    }

    public static final void LaunchedEffect(Object obj, Object obj2, Function2 function2, Composer composer) {
        CoroutineContext coroutineContext = ((GapComposer) composer).applyCoroutineContext;
        GapComposer gapComposer = (GapComposer) composer;
        boolean changed = gapComposer.changed(obj) | gapComposer.changed(obj2);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new LaunchedEffectImpl(coroutineContext, function2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
    }

    public static final void DisposableEffect(Object obj, Object obj2, Object obj3, Function1 function1, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        boolean changed = gapComposer.changed(obj) | gapComposer.changed(obj2) | gapComposer.changed(obj3);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new DisposableEffectImpl(function1);
            gapComposer.updateRememberedValue(rememberedValue);
        }
    }

    public static final MutableState collectAsState(StateFlow stateFlow, CoroutineContext coroutineContext, Composer composer, int i) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return collectAsState(stateFlow, stateFlow.getValue(), coroutineContext, composer, 0, 0);
    }

    public static final void DisposableEffect(Object obj, Function1 function1, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        boolean changed = gapComposer.changed(obj);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new DisposableEffectImpl(function1);
            gapComposer.updateRememberedValue(rememberedValue);
        }
    }

    public static final void LaunchedEffect(Object obj, Object obj2, Object obj3, Function2 function2, Composer composer) {
        CoroutineContext coroutineContext = ((GapComposer) composer).applyCoroutineContext;
        GapComposer gapComposer = (GapComposer) composer;
        boolean changed = gapComposer.changed(obj) | gapComposer.changed(obj2) | gapComposer.changed(obj3);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new LaunchedEffectImpl(coroutineContext, function2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
    }

    public static final MutableState produceState(Object obj, Object obj2, Object obj3, Function2 function2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = mutableStateOf$default(obj);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(function2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(function2, mutableState, null, 2);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        LaunchedEffect(obj2, obj3, (Function2) rememberedValue2, gapComposer);
        return mutableState;
    }

    public static final void LaunchedEffect(Composer composer, Object obj, Function2 function2) {
        CoroutineContext coroutineContext = ((GapComposer) composer).applyCoroutineContext;
        GapComposer gapComposer = (GapComposer) composer;
        boolean changed = gapComposer.changed(obj);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new LaunchedEffectImpl(coroutineContext, function2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
    }

    public static final MutableState produceState(Object obj, Object obj2, Object obj3, Boolean bool, Function2 function2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = mutableStateOf$default(obj);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(function2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new StateFlowsComposeKt$produceState$1$1(function2, mutableState, null, 1);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        LaunchedEffect(obj2, obj3, bool, (Function2) rememberedValue2, gapComposer);
        return mutableState;
    }

    public static final MutableState produceState(Composer composer, Object obj, Function2 function2) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = mutableStateOf$default(obj);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(function2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(function2, mutableState, null, 0);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        return mutableState;
    }

    public static final void CompositionLocalProvider(ProvidedValue[] providedValueArr, Function2 function2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(415205898);
        gapComposer.startProviders(providedValueArr);
        Recorder$$ExternalSyntheticOutline2.m((i >> 3) & 14, function2, gapComposer, false, false);
        int i2 = 1;
        gapComposer.providersInvalid = gapComposer.providersInvalidStack.pop() != 0;
        gapComposer.providerCache = null;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Transition$$ExternalSyntheticLambda2(providedValueArr, function2, i, i2);
        }
    }

    public static final void CompositionLocalProvider(CompositionLocalContext compositionLocalContext, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1162003659);
        int i2 = (gapComposer.changed(compositionLocalContext) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            PersistentCompositionLocalHashMap compositionLocals$runtime = compositionLocalContext.getCompositionLocals$runtime();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime.getSize());
            for (Map.Entry entry : compositionLocals$runtime.getEntries()) {
                arrayList.add(((ValueHolder) entry.getValue()).toProvided((ProvidableCompositionLocal) entry.getKey()));
            }
            ProvidedValue[] providedValueArr = (ProvidedValue[]) arrayList.toArray(new ProvidedValue[0]);
            CompositionLocalProvider((ProvidedValue[]) Arrays.copyOf(providedValueArr, providedValueArr.length), composableLambdaImpl, gapComposer, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda0(compositionLocalContext, composableLambdaImpl, i, 22);
        }
    }
}
