package androidx.compose.runtime;

import android.os.Trace;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.MutableSetWrapper;
import androidx.collection.ScatterSetKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.foundation.ScrollNode$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.composer.GroupInfo;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.KeyInfo;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.ChangeList;
import androidx.compose.runtime.composer.gapbuffer.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.composer.gapbuffer.changelist.FixupList;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operation;
import androidx.compose.runtime.composer.gapbuffer.changelist.Operations;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.runtime.tooling.SourceInformationKt;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import app.cash.trifle.KeyHandle$keyPair$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import coil3.memory.MemoryCacheService;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class GapComposer implements Composer {
    public GapCompositionDataImpl _compositionData;
    public final MutableSetWrapper abandonSet;
    public final Applier applier;
    public final CoroutineContext applyCoroutineContext;
    public final ComposerChangeListWriter changeListWriter;
    public final ChangeList changes;
    public int childrenComposing;
    public long compositeKeyHashCode;
    public final CompositionImpl composition;
    public int compositionToken;
    public ChangeList deferredChanges;
    public final GapComposer$derivedStateObserver$1 derivedStateObserver;
    public final CompositionErrorContextImpl errorContext;
    public boolean forceRecomposeScopes;
    public int groupNodeCount;
    public GapAnchor insertAnchor;
    public FixupList insertFixups;
    public SlotTable insertTable;
    public boolean inserting;
    public final ArrayList invalidateStack;
    public boolean isComposing;
    public final ChangeList lateChanges;
    public int[] nodeCountOverrides;
    public MutableIntIntMap nodeCountVirtualOverrides;
    public boolean nodeExpected;
    public int nodeIndex;
    public final MemoryCacheService observerHolder;
    public final CompositionContext parentContext;
    public GapPending pending;
    public PersistentCompositionLocalHashMap providerCache;
    public MutableIntObjectMap providerUpdates;
    public boolean providersInvalid;
    public int rGroupIndex;
    public SlotReader reader;
    public boolean reusing;
    public ShouldPauseCallback shouldPauseCallback;
    public final SlotTable slotTable;
    public boolean sourceMarkersEnabled;
    public SlotWriter writer;
    public boolean writerHasAProvider;
    public final ArrayList pendingStack = new ArrayList();
    public final IntStack parentStateStack = new IntStack(0, false);
    public final ArrayList invalidations = new ArrayList();
    public final IntStack entersStack = new IntStack(0, false);
    public PersistentCompositionLocalHashMap rootProvider = PersistentCompositionLocalHashMap.Empty;
    public final IntStack providersInvalidStack = new IntStack(0, false);
    public int reusingGroup = -1;

    public final class CompositionContextHolder implements RememberObserver {
        public final CompositionContextImpl ref;

        public CompositionContextHolder(CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void onForgotten() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void onRemembered() {
        }
    }

    public final class CompositionContextImpl extends CompositionContext {
        public final boolean collectingParameterInformation;
        public final boolean collectingSourceInformation;
        public final MutableScatterSet composers;
        public final long compositeKeyHashCode;
        public final ParcelableSnapshotMutableState compositionLocalScope$delegate;
        public HashSet inspectionTables;

        public CompositionContextImpl(long j, boolean z, boolean z2, MemoryCacheService memoryCacheService) {
            this.compositeKeyHashCode = j;
            this.collectingParameterInformation = z;
            this.collectingSourceInformation = z2;
            MutableScatterSet mutableScatterSet = ScatterSetKt.EmptyScatterSet;
            this.composers = new MutableScatterSet();
            this.compositionLocalScope$delegate = new ParcelableSnapshotMutableState(PersistentCompositionLocalHashMap.Empty, NeverEqualPolicy.INSTANCE$1);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void composeInitial$runtime(CompositionImpl compositionImpl, Function2 function2) {
            GapComposer.this.parentContext.composeInitial$runtime(compositionImpl, function2);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final MutableScatterSet composeInitialPaused$runtime(CompositionImpl compositionImpl, ShouldPauseCallback shouldPauseCallback, Function2 function2) {
            return GapComposer.this.parentContext.composeInitialPaused$runtime(compositionImpl, shouldPauseCallback, function2);
        }

        public final void dispose() {
            MutableScatterSet mutableScatterSet = this.composers;
            if (mutableScatterSet.isNotEmpty()) {
                HashSet hashSet = this.inspectionTables;
                if (hashSet != null) {
                    Object[] objArr = mutableScatterSet.elements;
                    long[] jArr = mutableScatterSet.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        GapComposer gapComposer = (GapComposer) objArr[(i << 3) + i3];
                                        Iterator it = hashSet.iterator();
                                        while (it.hasNext()) {
                                            ((Set) it.next()).remove(gapComposer.getCompositionData());
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                mutableScatterSet.clear();
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void doneComposing$runtime() {
            GapComposer gapComposer = GapComposer.this;
            gapComposer.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final boolean getCollectingCallByInformation$runtime() {
            return GapComposer.this.parentContext.getCollectingCallByInformation$runtime();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final boolean getCollectingParameterInformation$runtime() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final boolean getCollectingSourceInformation$runtime() {
            return this.collectingSourceInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final long getCompositeKeyHashCode$runtime() {
            return this.compositeKeyHashCode;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final Composition getComposition$runtime() {
            return GapComposer.this.composition;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final PersistentCompositionLocalHashMap getCompositionLocalScope$runtime() {
            return (PersistentCompositionLocalHashMap) this.compositionLocalScope$delegate.getValue();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final CoroutineContext getEffectCoroutineContext() {
            return GapComposer.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final boolean getStackTraceEnabled$runtime() {
            return GapComposer.this.parentContext.getStackTraceEnabled$runtime();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void invalidate$runtime(CompositionImpl compositionImpl) {
            GapComposer gapComposer = GapComposer.this;
            CompositionContext compositionContext = gapComposer.parentContext;
            compositionContext.invalidate$runtime(gapComposer.composition);
            compositionContext.invalidate$runtime(compositionImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final MovableContentState movableContentStateResolve$runtime(MovableContentStateReference movableContentStateReference) {
            return GapComposer.this.parentContext.movableContentStateResolve$runtime(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final MutableScatterSet recomposePaused$runtime(CompositionImpl compositionImpl, ShouldPauseCallback shouldPauseCallback, MutableScatterSet mutableScatterSet) {
            return GapComposer.this.parentContext.recomposePaused$runtime(compositionImpl, shouldPauseCallback, mutableScatterSet);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void recordInspectionTable$runtime(Set set) {
            HashSet hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(set);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void registerComposer$runtime(GapComposer gapComposer) {
            this.composers.add(gapComposer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void reportPausedScope$runtime(RecomposeScopeImpl recomposeScopeImpl) {
            GapComposer.this.parentContext.reportPausedScope$runtime(recomposeScopeImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void reportRemovedComposition$runtime(CompositionImpl compositionImpl) {
            GapComposer.this.parentContext.reportRemovedComposition$runtime(compositionImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final CancellationHandle scheduleFrameEndCallback(KeyHandle$keyPair$2 keyHandle$keyPair$2) {
            return GapComposer.this.parentContext.scheduleFrameEndCallback(keyHandle$keyPair$2);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void startComposing$runtime() {
            GapComposer.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void unregisterComposer$runtime(GapComposer gapComposer) {
            HashSet hashSet = this.inspectionTables;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Set set = (Set) it.next();
                    gapComposer.getClass();
                    set.remove(gapComposer.getCompositionData());
                }
            }
            if (gapComposer != null) {
                this.composers.remove(gapComposer);
            }
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void unregisterComposition$runtime(CompositionImpl compositionImpl) {
            GapComposer.this.parentContext.unregisterComposition$runtime(compositionImpl);
        }
    }

    public GapComposer(Applier applier, CompositionContext compositionContext, SlotTable slotTable, MutableSetWrapper mutableSetWrapper, ChangeList changeList, ChangeList changeList2, MemoryCacheService memoryCacheService, CompositionImpl compositionImpl) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = mutableSetWrapper;
        this.changes = changeList;
        this.lateChanges = changeList2;
        this.observerHolder = memoryCacheService;
        this.composition = compositionImpl;
        this.sourceMarkersEnabled = compositionContext.getCollectingSourceInformation$runtime() || compositionContext.getCollectingCallByInformation$runtime();
        this.derivedStateObserver = new GapComposer$derivedStateObserver$1(this, 0);
        this.invalidateStack = new ArrayList();
        SlotReader openReader = slotTable.openReader();
        openReader.close();
        this.reader = openReader;
        SlotTable slotTable2 = new SlotTable();
        if (compositionContext.getCollectingSourceInformation$runtime()) {
            slotTable2.collectSourceInformation();
        }
        if (compositionContext.getCollectingCallByInformation$runtime()) {
            slotTable2.calledByMap = new MutableIntObjectMap();
        }
        this.insertTable = slotTable2;
        SlotWriter openWriter = slotTable2.openWriter();
        openWriter.close(true);
        this.writer = openWriter;
        this.changeListWriter = new ComposerChangeListWriter(this, changeList);
        SlotReader openReader2 = this.insertTable.openReader();
        try {
            GapAnchor anchor = openReader2.anchor(0);
            openReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new FixupList();
            this.errorContext = new CompositionErrorContextImpl(this);
            CoroutineContext effectCoroutineContext = compositionContext.getEffectCoroutineContext();
            CoroutineContext errorContext$runtime = getErrorContext$runtime();
            this.applyCoroutineContext = effectCoroutineContext.plus(errorContext$runtime == null ? EmptyCoroutineContext.INSTANCE : errorContext$runtime);
        } catch (Throwable th) {
            openReader2.close();
            throw th;
        }
    }

    public static final int reportFreeMovableContent$reportGroup(GapComposer gapComposer, int i, boolean z, int i2) {
        int i3;
        long[] jArr;
        int i4;
        long[] jArr2;
        int i5;
        int i6;
        SlotReader slotReader;
        SlotReader slotReader2 = gapComposer.reader;
        int i7 = 0;
        if (slotReader2.hasMark(i)) {
            int groupKey = slotReader2.groupKey(i);
            Object objectKey = slotReader2.objectKey(i, slotReader2.groups);
            if (groupKey == 206 && Intrinsics.areEqual(objectKey, ComposerKt.reference)) {
                Object groupGet = slotReader2.groupGet(i, 0);
                RememberObserverHolder rememberObserverHolder = groupGet instanceof RememberObserverHolder ? (RememberObserverHolder) groupGet : null;
                Object obj = rememberObserverHolder != null ? ((GapRememberObserverHolder) rememberObserverHolder).wrapped : null;
                CompositionContextHolder compositionContextHolder = obj instanceof CompositionContextHolder ? (CompositionContextHolder) obj : null;
                if (compositionContextHolder != null) {
                    MutableScatterSet mutableScatterSet = compositionContextHolder.ref.composers;
                    Object[] objArr = mutableScatterSet.elements;
                    long[] jArr3 = mutableScatterSet.metadata;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr3[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = i7;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        GapComposer gapComposer2 = (GapComposer) objArr[(i8 << 3) + i11];
                                        SlotTable slotTable = gapComposer2.slotTable;
                                        if (slotTable.groupsSize <= 0 || (slotTable.groups[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            i5 = i7;
                                            i6 = i9;
                                        } else {
                                            CompositionImpl compositionImpl = gapComposer2.composition;
                                            synchronized (compositionImpl.lock) {
                                                compositionImpl.drainPendingModificationsOutOfBandLocked();
                                                i6 = i9;
                                                MutableScatterMap mutableScatterMap = compositionImpl.invalidations;
                                                compositionImpl.invalidations = PlatformKt.m1339constructorimpl$default();
                                                try {
                                                    compositionImpl.composer.m571updateComposerInvalidationsRY85e9Y$runtime(mutableScatterMap);
                                                } finally {
                                                }
                                            }
                                            ChangeList changeList = new ChangeList();
                                            gapComposer2.deferredChanges = changeList;
                                            SlotReader openReader = gapComposer2.slotTable.openReader();
                                            try {
                                                gapComposer2.reader = openReader;
                                                ComposerChangeListWriter composerChangeListWriter = gapComposer2.changeListWriter;
                                                ChangeList changeList2 = composerChangeListWriter.changeList;
                                                try {
                                                    composerChangeListWriter.changeList = changeList;
                                                    gapComposer2.reportFreeMovableContent(0);
                                                    ComposerChangeListWriter composerChangeListWriter2 = gapComposer2.changeListWriter;
                                                    composerChangeListWriter2.pushPendingUpsAndDowns();
                                                    jArr2 = jArr3;
                                                    try {
                                                        if (composerChangeListWriter2.startedGroup) {
                                                            slotReader = openReader;
                                                            try {
                                                                composerChangeListWriter2.changeList.f854operations.pushOp(Operation.SkipToEndOfCurrentGroup.INSTANCE);
                                                                if (composerChangeListWriter2.startedGroup) {
                                                                    composerChangeListWriter2.realizeOperationLocation(false);
                                                                    composerChangeListWriter2.realizeOperationLocation(false);
                                                                    composerChangeListWriter2.changeList.f854operations.pushOp(Operation.EndCurrentGroup.INSTANCE);
                                                                    i5 = 0;
                                                                    composerChangeListWriter2.startedGroup = false;
                                                                    composerChangeListWriter.changeList = changeList2;
                                                                    slotReader.close();
                                                                }
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                composerChangeListWriter.changeList = changeList2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            slotReader = openReader;
                                                        }
                                                        composerChangeListWriter.changeList = changeList2;
                                                        slotReader.close();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        slotReader.close();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    slotReader = openReader;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                slotReader = openReader;
                                            }
                                        }
                                        gapComposer.parentContext.reportRemovedComposition$runtime(gapComposer2.composition);
                                    } else {
                                        jArr2 = jArr3;
                                        i5 = i7;
                                        i6 = i9;
                                    }
                                    j >>= i6;
                                    i11++;
                                    i9 = i6;
                                    i7 = i5;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                i4 = i7;
                                if (i10 != i9) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                i4 = i7;
                            }
                            if (i8 == length) {
                                break;
                            }
                            i8++;
                            i7 = i4;
                            jArr3 = jArr;
                        }
                    }
                }
                return slotReader2.nodeCount(i);
            }
            i3 = 1;
            if (!slotReader2.isNode(i)) {
                return slotReader2.nodeCount(i);
            }
        } else {
            i3 = 1;
            if (slotReader2.containsMark(i)) {
                int i12 = slotReader2.groups[(i * 5) + 3] + i;
                int i13 = 0;
                for (int i14 = i + 1; i14 < i12; i14 += slotReader2.groups[(i14 * 5) + 3]) {
                    boolean isNode = slotReader2.isNode(i14);
                    if (isNode) {
                        gapComposer.changeListWriter.realizeNodeMovementOperations();
                        ComposerChangeListWriter composerChangeListWriter3 = gapComposer.changeListWriter;
                        Object node = slotReader2.node(i14);
                        composerChangeListWriter3.realizeNodeMovementOperations();
                        composerChangeListWriter3.pendingDownNodes.add(node);
                    }
                    i13 += reportFreeMovableContent$reportGroup(gapComposer, i14, isNode || z, isNode ? 0 : i2 + i13);
                    if (isNode) {
                        gapComposer.changeListWriter.realizeNodeMovementOperations();
                        gapComposer.changeListWriter.moveUp();
                    }
                }
                if (!slotReader2.isNode(i)) {
                    return i13;
                }
            } else if (!slotReader2.isNode(i)) {
                return slotReader2.nodeCount(i);
            }
        }
        return i3;
    }

    public final void abortRoot() {
        cleanUpCompose();
        this.pendingStack.clear();
        this.parentStateStack.tos = 0;
        this.entersStack.tos = 0;
        this.providersInvalidStack.tos = 0;
        this.providerUpdates = null;
        FixupList fixupList = this.insertFixups;
        fixupList.pendingOperations.clear();
        fixupList.f855operations.clear();
        this.compositeKeyHashCode = 0L;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.reusingGroup = -1;
        SlotReader slotReader = this.reader;
        if (!slotReader.closed) {
            slotReader.close();
        }
        if (this.writer.closed) {
            return;
        }
        forceFreshInsertTable();
    }

    public final void apply(Object obj, Function2 function2) {
        if (this.inserting) {
            Operations operations2 = this.insertFixups.f855operations;
            operations2.pushOp(Operation.UpdateNode.INSTANCE);
            DBUtil.m1186setObjectsGr0YRc(operations2, 0, obj);
            function2.getClass();
            TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, function2);
            DBUtil.m1186setObjectsGr0YRc(operations2, 1, function2);
            return;
        }
        ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
        composerChangeListWriter.pushPendingUpsAndDowns();
        Operations operations3 = composerChangeListWriter.changeList.f854operations;
        operations3.pushOp(Operation.UpdateNode.INSTANCE);
        function2.getClass();
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, function2);
        DBUtil.m1187setObjectsEsEZvaA(operations3, 0, obj, 1, function2);
    }

    public final CompositionContextImpl buildContext() {
        GapComposer gapComposer;
        startGroup(EnumC0170g.SDK_ASSET_ICON_CLOCK_VALUE, ComposerKt.reference);
        if (this.inserting) {
            SlotWriter.markGroup$default(this.writer);
        }
        Object nextSlot = nextSlot();
        RememberObserverHolder rememberObserverHolder = nextSlot instanceof RememberObserverHolder ? (RememberObserverHolder) nextSlot : null;
        if (rememberObserverHolder == null) {
            gapComposer = this;
            rememberObserverHolder = new ReusableGapRememberObserverHolder(new CompositionContextHolder(gapComposer.new CompositionContextImpl(this.compositeKeyHashCode, this.forceRecomposeScopes, this.sourceMarkersEnabled, this.composition.observerHolder)), -1);
            gapComposer.updateValue(rememberObserverHolder);
        } else {
            gapComposer = this;
        }
        RememberObserver rememberObserver = ((GapRememberObserverHolder) rememberObserverHolder).wrapped;
        rememberObserver.getClass();
        CompositionContextImpl compositionContextImpl = ((CompositionContextHolder) rememberObserver).ref;
        compositionContextImpl.compositionLocalScope$delegate.setValue(gapComposer.currentCompositionLocalScope());
        gapComposer.end(false);
        return compositionContextImpl;
    }

    public final boolean changed(float f) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Float) && f == ((Number) nextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(f));
        return true;
    }

    public final boolean changedInstance(Object obj) {
        if (nextSlot() == obj) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    public final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compositeKeyHashCode = 0L;
        this.nodeExpected = false;
        ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
        composerChangeListWriter.startedGroup = false;
        composerChangeListWriter.startedGroups.tos = 0;
        composerChangeListWriter.writersReaderDelta = 0;
        composerChangeListWriter.implicitRootStart = true;
        composerChangeListWriter.pendingUps = 0;
        composerChangeListWriter.pendingDownNodes.clear();
        composerChangeListWriter.removeFrom = -1;
        composerChangeListWriter.moveFrom = -1;
        composerChangeListWriter.moveTo = -1;
        composerChangeListWriter.moveCount = 0;
        this.invalidateStack.clear();
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    public final Object consume(ProvidableCompositionLocal providableCompositionLocal) {
        return Updater.read(currentCompositionLocalScope(), providableCompositionLocal);
    }

    public final void createNode(Function0 function0) {
        if (!this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
        if (!this.inserting) {
            ComposerKt.composeImmediateRuntimeError("createNode() can only be called when inserting");
        }
        IntStack intStack = this.parentStateStack;
        int i = intStack.slots[intStack.tos - 1];
        SlotWriter slotWriter = this.writer;
        GapAnchor anchor = slotWriter.anchor(slotWriter.parent);
        this.groupNodeCount++;
        FixupList fixupList = this.insertFixups;
        Operations operations2 = fixupList.f855operations;
        operations2.pushOp(Operation.UpdateValue.INSTANCE$1);
        DBUtil.m1186setObjectsGr0YRc(operations2, 0, function0);
        operations2.intArgs[operations2.intArgsSize - operations2.opCodes[operations2.opCodesSize - 1].ints] = i;
        DBUtil.m1186setObjectsGr0YRc(operations2, 1, anchor);
        Operations operations3 = fixupList.pendingOperations;
        operations3.pushOp(Operation.UpdateValue.INSTANCE$2);
        operations3.intArgs[operations3.intArgsSize - operations3.opCodes[operations3.opCodesSize - 1].ints] = i;
        DBUtil.m1186setObjectsGr0YRc(operations3, 0, anchor);
    }

    public final PersistentCompositionLocalHashMap currentCompositionLocalScope() {
        PersistentCompositionLocalHashMap persistentCompositionLocalHashMap;
        PersistentCompositionLocalHashMap persistentCompositionLocalHashMap2 = this.providerCache;
        if (persistentCompositionLocalHashMap2 != null) {
            return persistentCompositionLocalHashMap2;
        }
        int i = this.reader.parent;
        boolean z = this.inserting;
        OpaqueKey opaqueKey = ComposerKt.compositionLocalMap;
        if (z && this.writerHasAProvider) {
            int i2 = this.writer.parent;
            while (i2 > 0) {
                if (this.writer.groupKey(i2) == 202 && Intrinsics.areEqual(this.writer.groupObjectKey(i2), opaqueKey)) {
                    Object groupAux = this.writer.groupAux(i2);
                    groupAux.getClass();
                    PersistentCompositionLocalHashMap persistentCompositionLocalHashMap3 = (PersistentCompositionLocalHashMap) groupAux;
                    this.providerCache = persistentCompositionLocalHashMap3;
                    return persistentCompositionLocalHashMap3;
                }
                SlotWriter slotWriter = this.writer;
                i2 = slotWriter.parent(i2, slotWriter.groups);
            }
        }
        if (this.reader.groupsSize > 0) {
            while (i > 0) {
                if (this.reader.groupKey(i) == 202) {
                    SlotReader slotReader = this.reader;
                    if (Intrinsics.areEqual(slotReader.objectKey(i, slotReader.groups), opaqueKey)) {
                        MutableIntObjectMap mutableIntObjectMap = this.providerUpdates;
                        if (mutableIntObjectMap == null || (persistentCompositionLocalHashMap = (PersistentCompositionLocalHashMap) mutableIntObjectMap.get(i)) == null) {
                            SlotReader slotReader2 = this.reader;
                            Object aux = slotReader2.aux(i, slotReader2.groups);
                            aux.getClass();
                            persistentCompositionLocalHashMap = (PersistentCompositionLocalHashMap) aux;
                        }
                        this.providerCache = persistentCompositionLocalHashMap;
                        return persistentCompositionLocalHashMap;
                    }
                }
                i = this.reader.parent(i);
            }
        }
        PersistentCompositionLocalHashMap persistentCompositionLocalHashMap4 = this.rootProvider;
        this.providerCache = persistentCompositionLocalHashMap4;
        return persistentCompositionLocalHashMap4;
    }

    public final ComposeStackTrace currentStackTrace() {
        List buildTrace;
        if (!this.parentContext.getStackTraceEnabled$runtime()) {
            return null;
        }
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        buildTrace = SourceInformationKt.buildTrace(r1, null, this.writer.currentGroup, null);
        createListBuilder.addAll(buildTrace);
        createListBuilder.addAll(SourceInformationKt.buildTrace(this.reader));
        createListBuilder.addAll(parentStackTrace$runtime());
        return new ComposeStackTrace(CollectionsKt__CollectionsJVMKt.build(createListBuilder), this.sourceMarkersEnabled);
    }

    /* renamed from: doCompose-aFTiNEg, reason: not valid java name */
    public final void m569doComposeaFTiNEg(MutableScatterMap mutableScatterMap, Function2 function2) {
        ArrayList arrayList = this.invalidations;
        if (this.isComposing) {
            ComposerKt.composeImmediateRuntimeError("Reentrant composition is not supported");
        }
        this.observerHolder.current();
        Trace.beginSection("Compose:recompose");
        try {
            this.compositionToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            this.providerUpdates = null;
            m571updateComposerInvalidationsRY85e9Y$runtime(mutableScatterMap);
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                startRoot();
                Object nextSlot = nextSlot();
                if (nextSlot != function2 && function2 != null) {
                    updateValue(function2);
                }
                GapComposer$derivedStateObserver$1 gapComposer$derivedStateObserver$1 = this.derivedStateObserver;
                MutableVector derivedStateObservers = Updater.derivedStateObservers();
                try {
                    derivedStateObservers.add(gapComposer$derivedStateObserver$1);
                    OpaqueKey opaqueKey = ComposerKt.invocation;
                    if (function2 != null) {
                        startGroup(200, opaqueKey);
                        Expect_jvmKt.invokeComposable(this, function2);
                        end(false);
                    } else if (!this.providersInvalid || nextSlot == null || nextSlot.equals(Composer.Companion.Empty)) {
                        skipCurrentGroup();
                    } else {
                        startGroup(200, opaqueKey);
                        TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, nextSlot);
                        Expect_jvmKt.invokeComposable(this, (Function2) nextSlot);
                        end(false);
                    }
                    derivedStateObservers.removeAt(derivedStateObservers.size - 1);
                    endRoot();
                    this.isComposing = false;
                    arrayList.clear();
                    if (!this.writer.closed) {
                        ComposerKt.composeImmediateRuntimeError("Check failed");
                    }
                    forceFreshInsertTable();
                } catch (Throwable th) {
                    derivedStateObservers.removeAt(derivedStateObservers.size - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void doRecordDownsFor(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        doRecordDownsFor(this.reader.parent(i), i2);
        if (this.reader.isNode(i)) {
            Object node = this.reader.node(i);
            ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
            composerChangeListWriter.realizeNodeMovementOperations();
            composerChangeListWriter.pendingDownNodes.add(node);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05ae  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void end(boolean z) {
        long rotateRight;
        IntStack intStack;
        ArrayList arrayList;
        int i;
        boolean z2;
        int i2;
        SlotReader slotReader;
        GapPending gapPending;
        ?? r3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        IntStack intStack2;
        int i8;
        int i9;
        ArrayList arrayList2;
        MutableScatterSet mutableScatterSet;
        int i10;
        int i11;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i12;
        GapPending gapPending2;
        int i13;
        Object[] objArr;
        long[] jArr;
        int i14;
        Object[] objArr2;
        long[] jArr2;
        int i15;
        Object[] objArr3;
        long[] jArr3;
        int i16;
        Object[] objArr4;
        long[] jArr4;
        long rotateRight2;
        IntStack intStack3 = this.parentStateStack;
        int i17 = intStack3.slots[intStack3.tos - 2] - 1;
        boolean z3 = this.inserting;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (z3) {
            SlotWriter slotWriter = this.writer;
            int i18 = slotWriter.parent;
            int groupKey = slotWriter.groupKey(i18);
            Object groupObjectKey = this.writer.groupObjectKey(i18);
            Object groupAux = this.writer.groupAux(i18);
            if (groupObjectKey != null) {
                rotateRight2 = Long.rotateRight(this.compositeKeyHashCode, 3) ^ (groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey.hashCode());
            } else if (groupAux == null || groupKey != 207 || groupAux.equals(neverEqualPolicy)) {
                rotateRight2 = Long.rotateRight(this.compositeKeyHashCode ^ i17, 3) ^ groupKey;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(this.compositeKeyHashCode ^ i17, 3) ^ groupAux.hashCode(), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(rotateRight2, 3);
        } else {
            SlotReader slotReader2 = this.reader;
            int i19 = slotReader2.parent;
            int groupKey2 = slotReader2.groupKey(i19);
            SlotReader slotReader3 = this.reader;
            Object objectKey = slotReader3.objectKey(i19, slotReader3.groups);
            SlotReader slotReader4 = this.reader;
            Object aux = slotReader4.aux(i19, slotReader4.groups);
            if (objectKey != null) {
                rotateRight = Long.rotateRight(this.compositeKeyHashCode, 3) ^ (objectKey instanceof Enum ? ((Enum) objectKey).ordinal() : objectKey.hashCode());
            } else if (aux == null || groupKey2 != 207 || aux.equals(neverEqualPolicy)) {
                rotateRight = Long.rotateRight(this.compositeKeyHashCode ^ i17, 3) ^ groupKey2;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(this.compositeKeyHashCode ^ i17, 3) ^ aux.hashCode(), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(rotateRight, 3);
        }
        int i20 = this.groupNodeCount;
        GapPending gapPending3 = this.pending;
        ArrayList arrayList5 = this.invalidations;
        ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
        if (gapPending3 != null) {
            MutableIntObjectMap mutableIntObjectMap = gapPending3.groupInfos;
            int i21 = gapPending3.startIndex;
            ArrayList arrayList6 = gapPending3.keyInfos;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = gapPending3.usedKeys;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i22 = 0; i22 < size; i22++) {
                    hashSet2.add(arrayList7.get(i22));
                }
                i = -1;
                MutableScatterSet mutableScatterSet2 = ScatterSetKt.EmptyScatterSet;
                MutableScatterSet mutableScatterSet3 = new MutableScatterSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (i23 < size3) {
                    KeyInfo keyInfo = (KeyInfo) arrayList6.get(i23);
                    if (hashSet2.contains(keyInfo)) {
                        intStack2 = intStack3;
                        i8 = i23;
                        if (!mutableScatterSet3.contains(keyInfo)) {
                            int i26 = i24;
                            if (i26 < size2) {
                                KeyInfo keyInfo2 = (KeyInfo) arrayList7.get(i26);
                                if (keyInfo2 != keyInfo) {
                                    GroupInfo groupInfo = (GroupInfo) mutableIntObjectMap.get(keyInfo2.location);
                                    int i27 = groupInfo != null ? groupInfo.nodeIndex : -1;
                                    mutableScatterSet3.add(keyInfo2);
                                    i9 = i26;
                                    i12 = i25;
                                    gapPending2 = gapPending3;
                                    if (i27 != i12) {
                                        GroupInfo groupInfo2 = (GroupInfo) mutableIntObjectMap.get(keyInfo2.location);
                                        int i28 = groupInfo2 != null ? groupInfo2.nodeCount : keyInfo2.nodes;
                                        mutableScatterSet = mutableScatterSet3;
                                        int i29 = i27 + i21;
                                        i10 = size2;
                                        int i30 = i12 + i21;
                                        if (i28 > 0) {
                                            i11 = i21;
                                            int i31 = composerChangeListWriter.moveCount;
                                            if (i31 > 0) {
                                                arrayList3 = arrayList6;
                                                if (composerChangeListWriter.moveFrom == i29 - i31 && composerChangeListWriter.moveTo == i30 - i31) {
                                                    composerChangeListWriter.moveCount = i31 + i28;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            composerChangeListWriter.realizeNodeMovementOperations();
                                            composerChangeListWriter.moveFrom = i29;
                                            composerChangeListWriter.moveTo = i30;
                                            composerChangeListWriter.moveCount = i28;
                                        } else {
                                            i11 = i21;
                                            arrayList3 = arrayList6;
                                            composerChangeListWriter.getClass();
                                        }
                                        if (i27 > i12) {
                                            Object[] objArr5 = mutableIntObjectMap.values;
                                            long[] jArr5 = mutableIntObjectMap.metadata;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i32 = 0;
                                                while (true) {
                                                    long j = jArr5[i32];
                                                    int i33 = i28;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i34 = 8 - ((~(i32 - length)) >>> 31);
                                                        int i35 = 0;
                                                        while (i35 < i34) {
                                                            if ((j & 255) < 128) {
                                                                i16 = i35;
                                                                GroupInfo groupInfo3 = (GroupInfo) objArr5[(i32 << 3) + i35];
                                                                objArr4 = objArr5;
                                                                int i36 = groupInfo3.nodeIndex;
                                                                jArr4 = jArr5;
                                                                if (i27 <= i36 && i36 < i27 + i33) {
                                                                    groupInfo3.nodeIndex = (i36 - i27) + i12;
                                                                } else if (i12 <= i36 && i36 < i27) {
                                                                    groupInfo3.nodeIndex = i36 + i33;
                                                                }
                                                            } else {
                                                                i16 = i35;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i35 = i16 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i34 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i32 == length) {
                                                        break;
                                                    }
                                                    i32++;
                                                    arrayList5 = arrayList2;
                                                    i28 = i33;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i37 = i28;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i12 > i27) {
                                                Object[] objArr6 = mutableIntObjectMap.values;
                                                long[] jArr6 = mutableIntObjectMap.metadata;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i38 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i38];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i39 = 8 - ((~(i38 - length2)) >>> 31);
                                                            int i40 = 0;
                                                            while (i40 < i39) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    GroupInfo groupInfo4 = (GroupInfo) objArr6[(i38 << 3) + i40];
                                                                    jArr2 = jArr6;
                                                                    int i41 = groupInfo4.nodeIndex;
                                                                    i15 = i27;
                                                                    if (i27 <= i41 && i41 < i15 + i37) {
                                                                        groupInfo4.nodeIndex = (i41 - i15) + i12;
                                                                    } else if (i15 + 1 <= i41 && i41 < i12) {
                                                                        groupInfo4.nodeIndex = i41 - i37;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i15 = i27;
                                                                }
                                                                j2 >>= 8;
                                                                i40++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i27 = i15;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i14 = i27;
                                                            if (i39 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i14 = i27;
                                                        }
                                                        if (i38 == length2) {
                                                            break;
                                                        }
                                                        i38++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i27 = i14;
                                                    }
                                                }
                                            }
                                        }
                                        i13 = i8;
                                    } else {
                                        arrayList2 = arrayList5;
                                        mutableScatterSet = mutableScatterSet3;
                                        i10 = size2;
                                        i11 = i21;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i13 = i8;
                                } else {
                                    i9 = i26;
                                    arrayList2 = arrayList5;
                                    mutableScatterSet = mutableScatterSet3;
                                    i10 = size2;
                                    i11 = i21;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i12 = i25;
                                    gapPending2 = gapPending3;
                                    i13 = i8 + 1;
                                }
                                i24 = i9 + 1;
                                GroupInfo groupInfo5 = (GroupInfo) mutableIntObjectMap.get(keyInfo2.location);
                                int i42 = i12 + (groupInfo5 != null ? groupInfo5.nodeCount : keyInfo2.nodes);
                                i23 = i13;
                                gapPending3 = gapPending2;
                                mutableScatterSet3 = mutableScatterSet;
                                size2 = i10;
                                i21 = i11;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i25 = i42;
                                intStack3 = intStack2;
                            } else {
                                i24 = i26;
                                intStack3 = intStack2;
                                i23 = i8;
                            }
                        }
                    } else {
                        intStack2 = intStack3;
                        GroupInfo groupInfo6 = (GroupInfo) mutableIntObjectMap.get(keyInfo.location);
                        int i43 = groupInfo6 != null ? groupInfo6.nodeIndex : -1;
                        int i44 = keyInfo.location;
                        i8 = i23;
                        composerChangeListWriter.removeNode(i43 + i21, keyInfo.nodes);
                        gapPending3.updateNodeCount(i44, 0);
                        composerChangeListWriter.writersReaderDelta = (i44 - composerChangeListWriter.composer.reader.currentGroup) + composerChangeListWriter.writersReaderDelta;
                        this.reader.reposition(i44);
                        recordDelete();
                        this.reader.skipGroup();
                        Updater.access$removeRange(i44, this.reader.groups[(i44 * 5) + 3] + i44, arrayList5);
                    }
                    i23 = i8 + 1;
                    intStack3 = intStack2;
                }
                intStack = intStack3;
                arrayList = arrayList5;
                composerChangeListWriter.realizeNodeMovementOperations();
                if (arrayList6.size() > 0) {
                    SlotReader slotReader5 = this.reader;
                    composerChangeListWriter.writersReaderDelta = (slotReader5.currentEnd - composerChangeListWriter.composer.reader.currentGroup) + composerChangeListWriter.writersReaderDelta;
                    slotReader5.skipToGroupEnd();
                }
                z2 = this.inserting;
                if (!z2) {
                    SlotReader slotReader6 = this.reader;
                    int i45 = slotReader6.currentSlotEnd - slotReader6.currentSlot;
                    if (i45 > 0) {
                        if (i45 > 0) {
                            composerChangeListWriter.realizeOperationLocation(false);
                            IntStack intStack4 = composerChangeListWriter.startedGroups;
                            SlotReader slotReader7 = composerChangeListWriter.composer.reader;
                            if (slotReader7.groupsSize > 0 && intStack4.peekOr(-2) != (i7 = slotReader7.parent)) {
                                if (!composerChangeListWriter.startedGroup && composerChangeListWriter.implicitRootStart) {
                                    composerChangeListWriter.realizeOperationLocation(false);
                                    composerChangeListWriter.changeList.f854operations.pushOp(Operation.EnsureRootGroupStarted.INSTANCE);
                                    composerChangeListWriter.startedGroup = true;
                                }
                                if (i7 > 0) {
                                    GapAnchor anchor = slotReader7.anchor(i7);
                                    intStack4.push(i7);
                                    composerChangeListWriter.realizeOperationLocation(false);
                                    Operations operations2 = composerChangeListWriter.changeList.f854operations;
                                    operations2.pushOp(Operation.EnsureGroupStarted.INSTANCE);
                                    DBUtil.m1186setObjectsGr0YRc(operations2, 0, anchor);
                                    composerChangeListWriter.startedGroup = true;
                                }
                            }
                            Operations operations3 = composerChangeListWriter.changeList.f854operations;
                            operations3.pushOp(Operation.TrimParentValues.INSTANCE);
                            operations3.intArgs[operations3.intArgsSize - operations3.opCodes[operations3.opCodesSize - 1].ints] = i45;
                        } else {
                            composerChangeListWriter.getClass();
                        }
                    }
                }
                i2 = this.nodeIndex;
                while (true) {
                    slotReader = this.reader;
                    if (slotReader.emptyCount > 0 && (i6 = slotReader.currentGroup) != slotReader.currentEnd) {
                        recordDelete();
                        composerChangeListWriter.removeNode(i2, this.reader.skipGroup());
                        Updater.access$removeRange(i6, this.reader.currentGroup, arrayList);
                    }
                }
                if (z2) {
                    if (z) {
                        composerChangeListWriter.moveUp();
                    }
                    int i46 = composerChangeListWriter.composer.reader.parent;
                    IntStack intStack5 = composerChangeListWriter.startedGroups;
                    int i47 = i;
                    if (intStack5.peekOr(i47) > i46) {
                        ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup");
                    }
                    if (intStack5.peekOr(i47) == i46) {
                        composerChangeListWriter.realizeOperationLocation(false);
                        intStack5.pop();
                        composerChangeListWriter.changeList.f854operations.pushOp(Operation.EndCurrentGroup.INSTANCE);
                    }
                    int i48 = this.reader.parent;
                    if (i20 != updatedNodeCount(i48)) {
                        updateNodeCountOverrides(i48, i20);
                    }
                    if (z) {
                        i20 = 1;
                    }
                    this.reader.endGroup();
                    composerChangeListWriter.realizeNodeMovementOperations();
                } else {
                    if (z) {
                        FixupList fixupList = this.insertFixups;
                        Operations operations4 = fixupList.pendingOperations;
                        if (operations4.opCodesSize == 0) {
                            ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        Operations operations5 = fixupList.f855operations;
                        Operation[] operationArr = operations4.opCodes;
                        int i49 = operations4.opCodesSize - 1;
                        operations4.opCodesSize = i49;
                        Operation operation2 = operationArr[i49];
                        operationArr[i49] = null;
                        operations5.pushOp(operation2);
                        Object[] objArr7 = operations4.objectArgs;
                        Object[] objArr8 = operations5.objectArgs;
                        int i50 = operations5.objectArgsSize;
                        int i51 = operation2.objects;
                        int i52 = operations4.objectArgsSize;
                        int i53 = i52 - i51;
                        System.arraycopy(objArr7, i53, objArr8, i50 - i51, i52 - i53);
                        Object[] objArr9 = operations4.objectArgs;
                        int i54 = operations4.objectArgsSize;
                        Arrays.fill(objArr9, i54 - i51, i54, (Object) null);
                        int[] iArr = operations4.intArgs;
                        int[] iArr2 = operations5.intArgs;
                        int i55 = operations5.intArgsSize;
                        int i56 = operation2.ints;
                        int i57 = operations4.intArgsSize;
                        ArraysKt___ArraysJvmKt.copyInto(i55 - i56, iArr, i57 - i56, i57, iArr2);
                        operations4.objectArgsSize -= i51;
                        operations4.intArgsSize -= i56;
                        i20 = 1;
                    }
                    if (this.reader.emptyCount <= 0) {
                        PreconditionsKt.throwIllegalArgumentException("Unbalanced begin/end empty");
                    }
                    r4.emptyCount--;
                    SlotWriter slotWriter2 = this.writer;
                    int i58 = slotWriter2.parent;
                    slotWriter2.endGroup();
                    if (this.reader.emptyCount <= 0) {
                        int i59 = (-2) - i58;
                        this.writer.endInsert();
                        this.writer.close(true);
                        GapAnchor gapAnchor = this.insertAnchor;
                        boolean isEmpty = this.insertFixups.f855operations.isEmpty();
                        SlotTable slotTable = this.insertTable;
                        if (isEmpty) {
                            composerChangeListWriter.pushPendingUpsAndDowns();
                            composerChangeListWriter.realizeOperationLocation(false);
                            IntStack intStack6 = composerChangeListWriter.startedGroups;
                            SlotReader slotReader8 = composerChangeListWriter.composer.reader;
                            if (slotReader8.groupsSize > 0 && intStack6.peekOr(-2) != (i5 = slotReader8.parent)) {
                                if (!composerChangeListWriter.startedGroup && composerChangeListWriter.implicitRootStart) {
                                    composerChangeListWriter.realizeOperationLocation(false);
                                    composerChangeListWriter.changeList.f854operations.pushOp(Operation.EnsureRootGroupStarted.INSTANCE);
                                    composerChangeListWriter.startedGroup = true;
                                }
                                if (i5 > 0) {
                                    GapAnchor anchor2 = slotReader8.anchor(i5);
                                    intStack6.push(i5);
                                    composerChangeListWriter.realizeOperationLocation(false);
                                    Operations operations6 = composerChangeListWriter.changeList.f854operations;
                                    operations6.pushOp(Operation.EnsureGroupStarted.INSTANCE);
                                    DBUtil.m1186setObjectsGr0YRc(operations6, 0, anchor2);
                                    i4 = 1;
                                    composerChangeListWriter.startedGroup = true;
                                    composerChangeListWriter.realizeNodeMovementOperations();
                                    Operations operations7 = composerChangeListWriter.changeList.f854operations;
                                    operations7.pushOp(Operation.InsertSlots.INSTANCE);
                                    DBUtil.m1187setObjectsEsEZvaA(operations7, 0, gapAnchor, i4, slotTable);
                                    r3 = 0;
                                }
                            }
                            i4 = 1;
                            composerChangeListWriter.realizeNodeMovementOperations();
                            Operations operations72 = composerChangeListWriter.changeList.f854operations;
                            operations72.pushOp(Operation.InsertSlots.INSTANCE);
                            DBUtil.m1187setObjectsEsEZvaA(operations72, 0, gapAnchor, i4, slotTable);
                            r3 = 0;
                        } else {
                            FixupList fixupList2 = this.insertFixups;
                            composerChangeListWriter.pushPendingUpsAndDowns();
                            composerChangeListWriter.realizeOperationLocation(false);
                            IntStack intStack7 = composerChangeListWriter.startedGroups;
                            SlotReader slotReader9 = composerChangeListWriter.composer.reader;
                            if (slotReader9.groupsSize > 0 && intStack7.peekOr(-2) != (i3 = slotReader9.parent)) {
                                if (!composerChangeListWriter.startedGroup && composerChangeListWriter.implicitRootStart) {
                                    composerChangeListWriter.realizeOperationLocation(false);
                                    composerChangeListWriter.changeList.f854operations.pushOp(Operation.EnsureRootGroupStarted.INSTANCE);
                                    composerChangeListWriter.startedGroup = true;
                                }
                                if (i3 > 0) {
                                    GapAnchor anchor3 = slotReader9.anchor(i3);
                                    intStack7.push(i3);
                                    composerChangeListWriter.realizeOperationLocation(false);
                                    Operations operations8 = composerChangeListWriter.changeList.f854operations;
                                    operations8.pushOp(Operation.EnsureGroupStarted.INSTANCE);
                                    DBUtil.m1186setObjectsGr0YRc(operations8, 0, anchor3);
                                    composerChangeListWriter.startedGroup = true;
                                }
                            }
                            composerChangeListWriter.realizeNodeMovementOperations();
                            Operations operations9 = composerChangeListWriter.changeList.f854operations;
                            operations9.pushOp(Operation.InsertSlotsWithFixups.INSTANCE);
                            int i60 = operations9.objectArgsSize - operations9.opCodes[operations9.opCodesSize - 1].objects;
                            Object[] objArr10 = operations9.objectArgs;
                            objArr10[i60] = gapAnchor;
                            objArr10[i60 + 1] = slotTable;
                            objArr10[i60 + 2] = fixupList2;
                            this.insertFixups = new FixupList();
                            r3 = 0;
                        }
                        this.inserting = r3;
                        if (this.slotTable.groupsSize != 0) {
                            updateNodeCount(i59, r3);
                            updateNodeCountOverrides(i59, i20);
                        }
                    }
                }
                gapPending = (GapPending) this.pendingStack.remove(r3.size() - 1);
                if (gapPending != null && !z2) {
                    gapPending.groupIndex++;
                }
                this.pending = gapPending;
                this.nodeIndex = intStack.pop() + i20;
                this.rGroupIndex = intStack.pop();
                this.groupNodeCount = intStack.pop() + i20;
            }
        }
        intStack = intStack3;
        arrayList = arrayList5;
        i = -1;
        z2 = this.inserting;
        if (!z2) {
        }
        i2 = this.nodeIndex;
        while (true) {
            slotReader = this.reader;
            if (slotReader.emptyCount > 0) {
                break;
            }
            recordDelete();
            composerChangeListWriter.removeNode(i2, this.reader.skipGroup());
            Updater.access$removeRange(i6, this.reader.currentGroup, arrayList);
        }
        if (z2) {
        }
        gapPending = (GapPending) this.pendingStack.remove(r3.size() - 1);
        if (gapPending != null) {
            gapPending.groupIndex++;
        }
        this.pending = gapPending;
        this.nodeIndex = intStack.pop() + i20;
        this.rGroupIndex = intStack.pop();
        this.groupNodeCount = intStack.pop() + i20;
    }

    public final void endDefaults() {
        end(false);
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime != null) {
            int i = currentRecomposeScope$runtime.flags;
            if ((i & 1) != 0) {
                currentRecomposeScope$runtime.flags = i | 2;
            }
        }
    }

    public final void endNode() {
        end(true);
    }

    public final void endReplaceGroup() {
        end(false);
    }

    public final RecomposeScopeImpl endRestartGroup() {
        RecomposeScopeImpl recomposeScopeImpl;
        GapAnchor anchor;
        ScrollNode$$ExternalSyntheticLambda0 scrollNode$$ExternalSyntheticLambda0;
        ArrayList arrayList = this.invalidateStack;
        int i = 1;
        RecomposeScopeImpl recomposeScopeImpl2 = !arrayList.isEmpty() ? (RecomposeScopeImpl) arrayList.remove(arrayList.size() - 1) : null;
        if (recomposeScopeImpl2 != null) {
            recomposeScopeImpl2.flags &= -9;
            this.observerHolder.current();
            int i2 = this.compositionToken;
            MutableObjectIntMap mutableObjectIntMap = recomposeScopeImpl2.trackedInstances;
            if (mutableObjectIntMap != null && (recomposeScopeImpl2.flags & 16) == 0) {
                Object[] objArr = mutableObjectIntMap.keys;
                int[] iArr = mutableObjectIntMap.values;
                long[] jArr = mutableObjectIntMap.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    loop0: while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j & 255) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = objArr[i6];
                                    if (iArr[i6] != i2) {
                                        scrollNode$$ExternalSyntheticLambda0 = new ScrollNode$$ExternalSyntheticLambda0(recomposeScopeImpl2, i2, mutableObjectIntMap, i);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            scrollNode$$ExternalSyntheticLambda0 = null;
            ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
            if (scrollNode$$ExternalSyntheticLambda0 != null) {
                Operations operations2 = composerChangeListWriter.changeList.f854operations;
                operations2.pushOp(Operation.EndCompositionScope.INSTANCE);
                DBUtil.m1187setObjectsEsEZvaA(operations2, 0, scrollNode$$ExternalSyntheticLambda0, 1, this.composition);
            }
            int i7 = recomposeScopeImpl2.flags;
            if ((i7 & 512) != 0) {
                recomposeScopeImpl2.flags = i7 & (-513);
                Operations operations3 = composerChangeListWriter.changeList.f854operations;
                operations3.pushOp(Operation.EndResumingScope.INSTANCE);
                DBUtil.m1186setObjectsGr0YRc(operations3, 0, recomposeScopeImpl2);
                int i8 = recomposeScopeImpl2.flags;
                recomposeScopeImpl2.flags = i8 & (-129);
                if ((i8 & 1024) != 0) {
                    recomposeScopeImpl2.flags = i8 & (-1153);
                    if (this.reusingGroup == this.reader.parent) {
                        this.reusing = false;
                        this.reusingGroup = -1;
                    }
                }
            }
        }
        if (recomposeScopeImpl2 != null) {
            int i9 = recomposeScopeImpl2.flags;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.forceRecomposeScopes)) {
                if (recomposeScopeImpl2.anchor == null) {
                    if (this.inserting) {
                        SlotWriter slotWriter = this.writer;
                        anchor = slotWriter.anchor(slotWriter.parent);
                    } else {
                        SlotReader slotReader = this.reader;
                        anchor = slotReader.anchor(slotReader.parent);
                    }
                    recomposeScopeImpl2.anchor = anchor;
                }
                recomposeScopeImpl2.flags &= -5;
                recomposeScopeImpl = recomposeScopeImpl2;
                end(false);
                return recomposeScopeImpl;
            }
        }
        recomposeScopeImpl = null;
        end(false);
        return recomposeScopeImpl;
    }

    public final void endReuseFromRoot$runtime() {
        if (this.isComposing || this.reusingGroup != 0) {
            PreconditionsKt.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    public final void endRoot() {
        end(false);
        this.parentContext.doneComposing$runtime();
        end(false);
        ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
        if (composerChangeListWriter.startedGroup) {
            composerChangeListWriter.realizeOperationLocation(false);
            composerChangeListWriter.realizeOperationLocation(false);
            composerChangeListWriter.changeList.f854operations.pushOp(Operation.EndCurrentGroup.INSTANCE);
            composerChangeListWriter.startedGroup = false;
        }
        composerChangeListWriter.pushPendingUpsAndDowns();
        if (composerChangeListWriter.startedGroups.tos != 0) {
            ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup()");
        }
        if (!this.pendingStack.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Start/end imbalance");
        }
        cleanUpCompose();
        this.reader.close();
        this.providersInvalid = this.providersInvalidStack.pop() != 0;
    }

    public final void endToMarker(int i) {
        if (i < 0) {
            int i2 = -i;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int i3 = slotWriter.parent;
                if (i3 <= i2) {
                    return;
                } else {
                    end(slotWriter.isNode(i3));
                }
            }
        } else {
            if (this.inserting) {
                SlotWriter slotWriter2 = this.writer;
                while (this.inserting) {
                    end(slotWriter2.isNode(slotWriter2.parent));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int i4 = slotReader.parent;
                if (i4 <= i) {
                    return;
                } else {
                    end(slotReader.isNode(i4));
                }
            }
        }
    }

    public final void enterGroup(boolean z, GapPending gapPending) {
        this.pendingStack.add(this.pending);
        this.pending = gapPending;
        int i = this.groupNodeCount;
        IntStack intStack = this.parentStateStack;
        intStack.push(i);
        intStack.push(this.rGroupIndex);
        intStack.push(this.nodeIndex);
        if (z) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    public final void forceFreshInsertTable() {
        SlotTable slotTable = new SlotTable();
        if (this.sourceMarkersEnabled) {
            slotTable.collectSourceInformation();
        }
        if (this.parentContext.getCollectingCallByInformation$runtime()) {
            slotTable.calledByMap = new MutableIntObjectMap();
        }
        this.insertTable = slotTable;
        SlotWriter openWriter = slotTable.openWriter();
        openWriter.close(true);
        this.writer = openWriter;
    }

    public final CompositionData getCompositionData() {
        GapCompositionDataImpl gapCompositionDataImpl = this._compositionData;
        if (gapCompositionDataImpl != null) {
            return gapCompositionDataImpl;
        }
        GapCompositionDataImpl gapCompositionDataImpl2 = new GapCompositionDataImpl(this.composition);
        this._compositionData = gapCompositionDataImpl2;
        return gapCompositionDataImpl2;
    }

    public final int getCurrentMarker() {
        return this.inserting ? -this.writer.parent : this.reader.parent;
    }

    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime() {
        if (this.childrenComposing != 0) {
            return null;
        }
        ArrayList arrayList = this.invalidateStack;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (RecomposeScopeImpl) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, arrayList);
    }

    public final boolean getDefaultsInvalid() {
        if (!getSkipping() || this.providersInvalid) {
            return true;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        return (currentRecomposeScope$runtime == null || (currentRecomposeScope$runtime.flags & 4) == 0) ? false : true;
    }

    public final CompositionErrorContextImpl getErrorContext$runtime() {
        if (this.parentContext.getStackTraceEnabled$runtime()) {
            return this.errorContext;
        }
        return null;
    }

    public final boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        return (this.inserting || this.reusing || this.providersInvalid || (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) == null || (currentRecomposeScope$runtime.flags & 8) != 0) ? false : true;
    }

    public final void insertMovableContentGuarded(ArrayList arrayList) {
        GapComposer gapComposer = this;
        ChangeList changeList = gapComposer.lateChanges;
        ComposerChangeListWriter composerChangeListWriter = gapComposer.changeListWriter;
        ChangeList changeList2 = composerChangeListWriter.changeList;
        try {
            composerChangeListWriter.changeList = changeList;
            changeList.f854operations.pushOp(Operation.ResetSlots.INSTANCE);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Pair pair = (Pair) arrayList.get(i);
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) pair.first;
                GapAnchor asGapAnchor = Room.asGapAnchor(movableContentStateReference.getAnchor$runtime());
                SlotTable asGapBufferSlotTable = SlotTableKt.asGapBufferSlotTable(movableContentStateReference.getSlotStorage$runtime());
                int anchorIndex = asGapBufferSlotTable.anchorIndex(asGapAnchor);
                IntRef intRef = new IntRef();
                composerChangeListWriter.pushPendingUpsAndDowns();
                Operations operations2 = composerChangeListWriter.changeList.f854operations;
                operations2.pushOp(Operation.DetermineMovableContentNodeIndex.INSTANCE);
                DBUtil.m1187setObjectsEsEZvaA(operations2, 0, intRef, 1, asGapAnchor);
                if (asGapBufferSlotTable == gapComposer.insertTable) {
                    if (!gapComposer.writer.closed) {
                        ComposerKt.composeImmediateRuntimeError("Check failed");
                    }
                    gapComposer.forceFreshInsertTable();
                }
                SlotReader openReader = asGapBufferSlotTable.openReader();
                try {
                    openReader.reposition(anchorIndex);
                    composerChangeListWriter.writersReaderDelta = anchorIndex;
                    ChangeList changeList3 = new ChangeList();
                    gapComposer.recomposeMovableContent(null, null, null, EmptyList.INSTANCE, new n$$ExternalSyntheticLambda1(gapComposer, changeList3, openReader, movableContentStateReference));
                    ChangeList changeList4 = composerChangeListWriter.changeList;
                    changeList4.getClass();
                    if (!changeList3.f854operations.isEmpty()) {
                        Operations operations3 = changeList4.f854operations;
                        operations3.pushOp(Operation.ApplyChangeList.INSTANCE);
                        DBUtil.m1187setObjectsEsEZvaA(operations3, 0, changeList3, 1, intRef);
                    }
                    openReader.close();
                    composerChangeListWriter.changeList.f854operations.pushOp(Operation.SkipToEndOfCurrentGroup.INSTANCE);
                    i++;
                    gapComposer = this;
                } catch (Throwable th) {
                    openReader.close();
                    throw th;
                }
            }
            composerChangeListWriter.pushPendingUpsAndDowns();
            composerChangeListWriter.changeList.f854operations.pushOp(Operation.EndMovableContentPlacement.INSTANCE);
            composerChangeListWriter.writersReaderDelta = 0;
            composerChangeListWriter.changeList = changeList2;
        } catch (Throwable th2) {
            composerChangeListWriter.changeList = changeList2;
            throw th2;
        }
    }

    public final void invokeMovableContentLambda(PersistentCompositionLocalHashMap persistentCompositionLocalHashMap, Object obj) {
        startMovableGroup(126665345, null);
        nextSlot();
        updateValue(obj);
        long j = this.compositeKeyHashCode;
        try {
            this.compositeKeyHashCode = 126665345L;
            if (this.inserting) {
                SlotWriter.markGroup$default(this.writer);
            }
            boolean z = (this.inserting || Intrinsics.areEqual(this.reader.getGroupAux(), persistentCompositionLocalHashMap)) ? false : true;
            if (z) {
                recordProviderUpdate(persistentCompositionLocalHashMap);
            }
            m570startAzEfcrM(EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, ComposerKt.compositionLocalMap, persistentCompositionLocalHashMap, 0);
            this.providerCache = null;
            boolean z2 = this.providersInvalid;
            this.providersInvalid = z;
            Expect_jvmKt.invokeComposable(this, new ComposableLambdaImpl(new HintHandler$$ExternalSyntheticLambda0(obj, 16), true, -59194059));
            this.providersInvalid = z2;
        } finally {
        }
    }

    public final Object joinKey(Object obj, Object obj2) {
        SlotReader slotReader = this.reader;
        int i = slotReader.currentGroup;
        Object key = Updater.getKey(i < slotReader.currentEnd ? slotReader.objectKey(i, slotReader.groups) : null, obj, obj2);
        return key == null ? new JoinedKey(obj, obj2) : key;
    }

    public final Object nextSlot() {
        boolean z = this.inserting;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (!z) {
            Object next = this.reader.next();
            if (!this.reusing || (next instanceof ReusableGapRememberObserverHolder)) {
                return next;
            }
        } else if (this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
            return neverEqualPolicy;
        }
        return neverEqualPolicy;
    }

    public final List parentStackTrace$runtime() {
        CompositionContext compositionContext = this.parentContext;
        Composition composition$runtime = compositionContext.getComposition$runtime();
        CompositionImpl compositionImpl = composition$runtime != null ? (CompositionImpl) composition$runtime : null;
        if (compositionImpl == null) {
            return EmptyList.INSTANCE;
        }
        SlotTable slotTable = compositionImpl.slotStorage;
        Integer findSubcompositionContextGroup = SourceInformationKt.findSubcompositionContextGroup(SlotTableKt.asGapBufferSlotTable(slotTable), compositionContext);
        if (findSubcompositionContextGroup == null) {
            return EmptyList.INSTANCE;
        }
        SlotReader openReader = SlotTableKt.asGapBufferSlotTable(slotTable).openReader();
        try {
            ArrayList traceForGroup = SourceInformationKt.traceForGroup(openReader, findSubcompositionContextGroup.intValue(), 0);
            openReader.close();
            return CollectionsKt.plus((Iterable) compositionImpl.composer.parentStackTrace$runtime(), (Collection) traceForGroup);
        } catch (Throwable th) {
            openReader.close();
            throw th;
        }
    }

    public final int rGroupIndexOf(int i) {
        int parent = this.reader.parent(i) + 1;
        int i2 = 0;
        while (parent < i) {
            if (!this.reader.hasObjectKey(parent)) {
                i2++;
            }
            parent += this.reader.groups[(parent * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object recomposeMovableContent(CompositionImpl compositionImpl, CompositionImpl compositionImpl2, Integer num, List list, Function0 function0) {
        Object invoke;
        boolean z = this.isComposing;
        int i = this.nodeIndex;
        try {
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) pair.first;
                Object obj = pair.second;
                if (obj != null) {
                    tryImminentInvalidation$runtime(recomposeScopeImpl, obj);
                } else {
                    tryImminentInvalidation$runtime(recomposeScopeImpl, null);
                }
            }
            if (compositionImpl != null) {
                int intValue = num != null ? num.intValue() : -1;
                if (compositionImpl2 == null || compositionImpl2.equals(compositionImpl) || intValue < 0) {
                    invoke = function0.invoke();
                } else {
                    compositionImpl.invalidationDelegate = compositionImpl2;
                    compositionImpl.invalidationDelegateGroup = intValue;
                    try {
                        invoke = function0.invoke();
                        compositionImpl.invalidationDelegate = null;
                        compositionImpl.invalidationDelegateGroup = 0;
                    } catch (Throwable th) {
                        compositionImpl.invalidationDelegate = null;
                        compositionImpl.invalidationDelegateGroup = 0;
                        throw th;
                    }
                }
            }
            invoke = function0.invoke();
            this.isComposing = z;
            this.nodeIndex = i;
            return invoke;
        } catch (Throwable th2) {
            this.isComposing = z;
            this.nodeIndex = i;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (r4.location < r6) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0339  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void recomposeToGroupEnd() {
        Invalidation invalidation;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        boolean z;
        MutableObjectIntMap mutableObjectIntMap;
        long j2;
        int findLocation;
        int i8;
        int hashCode;
        Object aux;
        NeverEqualPolicy neverEqualPolicy = NeverEqualPolicy.INSTANCE$3;
        boolean z2 = this.isComposing;
        this.isComposing = true;
        SlotReader slotReader = this.reader;
        int i9 = slotReader.parent;
        int i10 = (i9 * 5) + 3;
        int i11 = slotReader.groups[i10] + i9;
        int i12 = this.nodeIndex;
        long j3 = this.compositeKeyHashCode;
        int i13 = this.groupNodeCount;
        int i14 = this.rGroupIndex;
        int i15 = slotReader.currentGroup;
        ArrayList arrayList = this.invalidations;
        int findLocation2 = Updater.findLocation(i15, arrayList);
        if (findLocation2 < 0) {
            findLocation2 = -(findLocation2 + 1);
        }
        if (findLocation2 < arrayList.size()) {
            invalidation = (Invalidation) arrayList.get(findLocation2);
        }
        invalidation = null;
        int i16 = 1;
        int i17 = i9;
        int i18 = 0;
        while (invalidation != null) {
            RecomposeScopeImpl recomposeScopeImpl = invalidation.scope;
            int i19 = invalidation.location;
            NeverEqualPolicy neverEqualPolicy2 = neverEqualPolicy;
            int findLocation3 = Updater.findLocation(i19, arrayList);
            if (findLocation3 >= 0) {
            }
            Object obj = invalidation.instances;
            if (obj == null) {
                recomposeScopeImpl.getClass();
                i3 = i11;
                i = i10;
                i2 = i12;
            } else {
                int i20 = 8;
                MutableScatterMap mutableScatterMap = recomposeScopeImpl.trackedDependencies;
                if (mutableScatterMap == null) {
                    i3 = i11;
                    i = i10;
                    i2 = i12;
                } else {
                    i = i10;
                    if (obj instanceof DerivedSnapshotState) {
                        DerivedSnapshotState derivedSnapshotState = (DerivedSnapshotState) obj;
                        SnapshotMutationPolicy snapshotMutationPolicy = derivedSnapshotState.policy;
                        if (snapshotMutationPolicy == null) {
                            snapshotMutationPolicy = neverEqualPolicy2;
                        }
                        i2 = i12;
                        i6 = !snapshotMutationPolicy.equivalent(derivedSnapshotState.getCurrentRecord().result, mutableScatterMap.get(derivedSnapshotState)) ? 1 : 0;
                        i3 = i11;
                        i4 = i13;
                        i5 = i14;
                    } else {
                        i2 = i12;
                        if (obj instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                            if (mutableScatterSet.isNotEmpty()) {
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr = mutableScatterSet.metadata;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    i4 = i13;
                                    i5 = i14;
                                    int i21 = 0;
                                    while (true) {
                                        long j4 = jArr[i21];
                                        i3 = i11;
                                        Object[] objArr2 = objArr;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j4 & 255) < 128) {
                                                    i7 = i23;
                                                    Object obj2 = objArr2[(i21 << 3) + i23];
                                                    j = j4;
                                                    if (!(obj2 instanceof DerivedSnapshotState)) {
                                                        break;
                                                    }
                                                    DerivedSnapshotState derivedSnapshotState2 = (DerivedSnapshotState) obj2;
                                                    SnapshotMutationPolicy snapshotMutationPolicy2 = derivedSnapshotState2.policy;
                                                    if (snapshotMutationPolicy2 == null) {
                                                        snapshotMutationPolicy2 = neverEqualPolicy2;
                                                    }
                                                    if (!snapshotMutationPolicy2.equivalent(derivedSnapshotState2.getCurrentRecord().result, mutableScatterMap.get(derivedSnapshotState2))) {
                                                        break;
                                                    }
                                                } else {
                                                    i7 = i23;
                                                    j = j4;
                                                }
                                                j4 = j >> i20;
                                                i23 = i7 + 1;
                                            }
                                            if (i22 != i20) {
                                                break;
                                            }
                                        }
                                        if (i21 == length) {
                                            break;
                                        }
                                        i21++;
                                        i11 = i3;
                                        objArr = objArr2;
                                        i20 = 8;
                                    }
                                    i6 = 0;
                                }
                            }
                            i3 = i11;
                            i4 = i13;
                            i5 = i14;
                            i6 = 0;
                        } else {
                            i3 = i11;
                        }
                    }
                    if (i6 == 0) {
                        this.reader.reposition(i19);
                        int i24 = this.reader.currentGroup;
                        recordUpsAndDowns(i17, i24, i9);
                        int parent = this.reader.parent(i24);
                        while (parent != i9 && !this.reader.isNode(parent)) {
                            parent = this.reader.parent(parent);
                        }
                        int i25 = this.reader.isNode(parent) ? 0 : i2;
                        if (parent != i24) {
                            int updatedNodeCount = (updatedNodeCount(parent) - this.reader.nodeCount(i24)) + i25;
                            while (i25 < updatedNodeCount && parent != i19) {
                                parent++;
                                while (parent < i19) {
                                    SlotReader slotReader2 = this.reader;
                                    int i26 = slotReader2.groups[(parent * 5) + 3] + parent;
                                    if (i19 >= i26) {
                                        i25 += slotReader2.isNode(parent) ? i16 : updatedNodeCount(parent);
                                        parent = i26;
                                    }
                                }
                                break;
                            }
                        }
                        this.nodeIndex = i25;
                        this.rGroupIndex = rGroupIndexOf(i24);
                        int parent2 = this.reader.parent(i24);
                        long j5 = 0;
                        int i27 = 3;
                        int i28 = 0;
                        while (true) {
                            if (parent2 < 0) {
                                break;
                            }
                            if (parent2 == i9) {
                                j5 ^= Long.rotateLeft(j3, i28);
                                break;
                            }
                            SlotReader slotReader3 = this.reader;
                            boolean hasObjectKey = slotReader3.hasObjectKey(parent2);
                            int[] iArr = slotReader3.groups;
                            if (hasObjectKey) {
                                Object objectKey = slotReader3.objectKey(parent2, iArr);
                                if (objectKey != null) {
                                    hashCode = objectKey instanceof Enum ? ((Enum) objectKey).ordinal() : objectKey.hashCode();
                                    i8 = i24;
                                } else {
                                    i8 = i24;
                                    hashCode = 0;
                                }
                            } else {
                                int groupKey = slotReader3.groupKey(parent2);
                                i8 = i24;
                                hashCode = (groupKey != 207 || (aux = slotReader3.aux(parent2, iArr)) == null || aux.equals(Composer.Companion.Empty)) ? groupKey : aux.hashCode();
                            }
                            if (hashCode == 126665345) {
                                j5 ^= Long.rotateLeft(hashCode, i28);
                                break;
                            }
                            j5 = (j5 ^ Long.rotateLeft(hashCode, i27)) ^ Long.rotateLeft(this.reader.hasObjectKey(parent2) ? 0 : rGroupIndexOf(parent2), i28);
                            i27 = (i27 + 6) % 64;
                            i28 = (i28 + 6) % 64;
                            parent2 = this.reader.parent(parent2);
                            i24 = i8;
                        }
                        i8 = i24;
                        this.compositeKeyHashCode = j5;
                        this.providerCache = null;
                        Function2 function2 = recomposeScopeImpl.block;
                        if (function2 == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("Invalid restart scope");
                            return;
                        }
                        function2.invoke(this, Integer.valueOf(i16));
                        this.providerCache = null;
                        SlotReader slotReader4 = this.reader;
                        int i29 = slotReader4.groups[i] + i9;
                        int i30 = slotReader4.currentGroup;
                        if (i30 < i9 || i30 > i29) {
                            ComposerKt.composeImmediateRuntimeError("Index " + i9 + " is not a parent of " + i30);
                        }
                        slotReader4.parent = i9;
                        slotReader4.currentEnd = i29;
                        slotReader4.currentSlot = 0;
                        slotReader4.currentSlotEnd = 0;
                        z = z2;
                        i17 = i8;
                        i18 = i16;
                    } else {
                        ArrayList arrayList2 = this.invalidateStack;
                        arrayList2.add(recomposeScopeImpl);
                        this.observerHolder.current();
                        CompositionImpl compositionImpl = recomposeScopeImpl.owner;
                        if (compositionImpl == null || (mutableObjectIntMap = recomposeScopeImpl.trackedInstances) == null) {
                            z = z2;
                        } else {
                            recomposeScopeImpl.setRereading(i16);
                            try {
                                Object[] objArr3 = mutableObjectIntMap.keys;
                                int[] iArr2 = mutableObjectIntMap.values;
                                long[] jArr2 = mutableObjectIntMap.metadata;
                                int length2 = jArr2.length - 2;
                                z = z2;
                                if (length2 >= 0) {
                                    int i31 = 0;
                                    while (true) {
                                        long j6 = jArr2[i31];
                                        long[] jArr3 = jArr2;
                                        Object[] objArr4 = objArr3;
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i32 = 8 - ((~(i31 - length2)) >>> 31);
                                            int i33 = 0;
                                            while (i33 < i32) {
                                                if ((j6 & 255) < 128) {
                                                    int i34 = (i31 << 3) + i33;
                                                    j2 = j6;
                                                    Object obj3 = objArr4[i34];
                                                    int i35 = iArr2[i34];
                                                    compositionImpl.recordReadOf(obj3);
                                                } else {
                                                    j2 = j6;
                                                }
                                                i33++;
                                                j6 = j2 >> 8;
                                            }
                                            if (i32 != 8) {
                                                break;
                                            }
                                        }
                                        if (i31 == length2) {
                                            break;
                                        }
                                        i31++;
                                        objArr3 = objArr4;
                                        jArr2 = jArr3;
                                    }
                                }
                                recomposeScopeImpl.setRereading(false);
                            } catch (Throwable th) {
                                recomposeScopeImpl.setRereading(false);
                                throw th;
                            }
                        }
                        i16 = 1;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    findLocation = Updater.findLocation(this.reader.currentGroup, arrayList);
                    if (findLocation < 0) {
                        findLocation = -(findLocation + 1);
                    }
                    if (findLocation >= arrayList.size()) {
                        Invalidation invalidation2 = (Invalidation) arrayList.get(findLocation);
                        i11 = i3;
                        if (invalidation2.location < i11) {
                            invalidation = invalidation2;
                            z2 = z;
                            neverEqualPolicy = neverEqualPolicy2;
                            i10 = i;
                            i12 = i2;
                            i13 = i4;
                            i14 = i5;
                        }
                    } else {
                        i11 = i3;
                    }
                    invalidation = null;
                    z2 = z;
                    neverEqualPolicy = neverEqualPolicy2;
                    i10 = i;
                    i12 = i2;
                    i13 = i4;
                    i14 = i5;
                }
            }
            i4 = i13;
            i5 = i14;
            i6 = i16;
            if (i6 == 0) {
            }
            findLocation = Updater.findLocation(this.reader.currentGroup, arrayList);
            if (findLocation < 0) {
            }
            if (findLocation >= arrayList.size()) {
            }
            invalidation = null;
            z2 = z;
            neverEqualPolicy = neverEqualPolicy2;
            i10 = i;
            i12 = i2;
            i13 = i4;
            i14 = i5;
        }
        boolean z3 = z2;
        int i36 = i12;
        int i37 = i13;
        int i38 = i14;
        if (i18 != 0) {
            recordUpsAndDowns(i17, i9, i9);
            this.reader.skipToGroupEnd();
            int updatedNodeCount2 = updatedNodeCount(i9);
            this.nodeIndex = i36 + updatedNodeCount2;
            this.groupNodeCount = i37 + updatedNodeCount2;
            this.rGroupIndex = i38;
        } else {
            skipReaderToGroupEnd();
        }
        this.compositeKeyHashCode = j3;
        this.isComposing = z3;
    }

    public final void recordDelete() {
        int i;
        reportFreeMovableContent(this.reader.currentGroup);
        ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
        composerChangeListWriter.realizeOperationLocation(false);
        IntStack intStack = composerChangeListWriter.startedGroups;
        GapComposer gapComposer = composerChangeListWriter.composer;
        SlotReader slotReader = gapComposer.reader;
        if (slotReader.groupsSize > 0 && intStack.peekOr(-2) != (i = slotReader.parent)) {
            if (!composerChangeListWriter.startedGroup && composerChangeListWriter.implicitRootStart) {
                composerChangeListWriter.realizeOperationLocation(false);
                composerChangeListWriter.changeList.f854operations.pushOp(Operation.EnsureRootGroupStarted.INSTANCE);
                composerChangeListWriter.startedGroup = true;
            }
            if (i > 0) {
                GapAnchor anchor = slotReader.anchor(i);
                intStack.push(i);
                composerChangeListWriter.realizeOperationLocation(false);
                Operations operations2 = composerChangeListWriter.changeList.f854operations;
                operations2.pushOp(Operation.EnsureGroupStarted.INSTANCE);
                DBUtil.m1186setObjectsGr0YRc(operations2, 0, anchor);
                composerChangeListWriter.startedGroup = true;
            }
        }
        composerChangeListWriter.changeList.f854operations.pushOp(Operation.RemoveCurrentGroup.INSTANCE);
        int i2 = composerChangeListWriter.writersReaderDelta;
        SlotReader slotReader2 = gapComposer.reader;
        composerChangeListWriter.writersReaderDelta = slotReader2.groups[(slotReader2.currentGroup * 5) + 3] + i2;
    }

    public final void recordProviderUpdate(PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
        MutableIntObjectMap mutableIntObjectMap = this.providerUpdates;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap();
            this.providerUpdates = mutableIntObjectMap;
        }
        mutableIntObjectMap.set(this.reader.currentGroup, persistentCompositionLocalHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void recordUpsAndDowns(int i, int i2, int i3) {
        SlotReader slotReader = this.reader;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (slotReader.parent(i) == i2) {
                    i3 = i2;
                } else if (slotReader.parent(i2) != i) {
                    if (slotReader.parent(i) == slotReader.parent(i2)) {
                        i3 = slotReader.parent(i);
                    } else {
                        int i4 = i;
                        int i5 = 0;
                        while (i4 > 0 && i4 != i3) {
                            i4 = slotReader.parent(i4);
                            i5++;
                        }
                        int i6 = i2;
                        int i7 = 0;
                        while (i6 > 0 && i6 != i3) {
                            i6 = slotReader.parent(i6);
                            i7++;
                        }
                        int i8 = i5 - i7;
                        int i9 = i;
                        for (int i10 = 0; i10 < i8; i10++) {
                            i9 = slotReader.parent(i9);
                        }
                        int i11 = i7 - i5;
                        int i12 = i2;
                        for (int i13 = 0; i13 < i11; i13++) {
                            i12 = slotReader.parent(i12);
                        }
                        i3 = i9;
                        for (int i14 = i12; i3 != i14; i14 = slotReader.parent(i14)) {
                            i3 = slotReader.parent(i3);
                        }
                    }
                }
            }
            while (i > 0 && i != i3) {
                if (!slotReader.isNode(i)) {
                    this.changeListWriter.moveUp();
                }
                i = slotReader.parent(i);
            }
            doRecordDownsFor(i2, i3);
        }
        i3 = i;
        while (i > 0) {
            if (!slotReader.isNode(i)) {
            }
            i = slotReader.parent(i);
        }
        doRecordDownsFor(i2, i3);
    }

    public final Object rememberedValue() {
        boolean z = this.inserting;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (!z) {
            Object next = this.reader.next();
            if (!this.reusing || (next instanceof ReusableGapRememberObserverHolder)) {
                return next instanceof RememberObserverHolder ? ((GapRememberObserverHolder) ((RememberObserverHolder) next)).wrapped : next;
            }
        } else if (this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
            return neverEqualPolicy;
        }
        return neverEqualPolicy;
    }

    public final void reportFreeMovableContent(int i) {
        boolean isNode = this.reader.isNode(i);
        ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
        if (isNode) {
            composerChangeListWriter.realizeNodeMovementOperations();
            Object node = this.reader.node(i);
            composerChangeListWriter.realizeNodeMovementOperations();
            composerChangeListWriter.pendingDownNodes.add(node);
        }
        reportFreeMovableContent$reportGroup(this, i, isNode, 0);
        composerChangeListWriter.realizeNodeMovementOperations();
        if (isNode) {
            composerChangeListWriter.moveUp();
        }
    }

    public final boolean shouldExecute(int i, boolean z) {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        if ((i & 1) == 0 && (this.inserting || this.reusing)) {
            ShouldPauseCallback shouldPauseCallback = this.shouldPauseCallback;
            if (shouldPauseCallback != null && (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) != null && shouldPauseCallback.shouldPause()) {
                int i2 = currentRecomposeScope$runtime.flags;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                currentRecomposeScope$runtime.flags = i3;
                currentRecomposeScope$runtime.flags = (this.reusing ? i2 | EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE : i3 & (-129)) | 256;
                Operations operations2 = this.changeListWriter.changeList.f854operations;
                operations2.pushOp(Operation.RememberPausingScope.INSTANCE);
                DBUtil.m1186setObjectsGr0YRc(operations2, 0, currentRecomposeScope$runtime);
                this.parentContext.reportPausedScope$runtime(currentRecomposeScope$runtime);
                return false;
            }
        } else if (!z && getSkipping()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void skipCurrentGroup() {
        long rotateLeft;
        if (this.invalidations.isEmpty()) {
            this.groupNodeCount = this.reader.skipGroup() + this.groupNodeCount;
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        int[] iArr = slotReader.groups;
        int i = slotReader.currentGroup;
        Object objectKey = i < slotReader.currentEnd ? slotReader.objectKey(i, iArr) : null;
        Object groupAux = slotReader.getGroupAux();
        int i2 = this.rGroupIndex;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (objectKey != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.compositeKeyHashCode, 3) ^ (objectKey instanceof Enum ? ((Enum) objectKey).ordinal() : objectKey.hashCode()), 3);
        } else {
            if (groupAux != null && groupKey == 207 && !groupAux.equals(neverEqualPolicy)) {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(this.compositeKeyHashCode, 3) ^ groupAux.hashCode(), 3) ^ i2;
                startReaderGroup(null, (iArr[(slotReader.currentGroup * 5) + 1] & 1073741824) != 0);
                recomposeToGroupEnd();
                slotReader.endGroup();
                if (objectKey == null) {
                    if (objectKey instanceof Enum) {
                        this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(this.compositeKeyHashCode, 3) ^ ((Enum) objectKey).ordinal(), 3);
                        return;
                    } else {
                        this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(this.compositeKeyHashCode, 3) ^ objectKey.hashCode(), 3);
                        return;
                    }
                }
                if (groupAux == null || groupKey != 207 || groupAux.equals(neverEqualPolicy)) {
                    this.compositeKeyHashCode = Long.rotateRight(groupKey ^ Long.rotateRight(this.compositeKeyHashCode ^ i2, 3), 3);
                    return;
                } else {
                    this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(this.compositeKeyHashCode ^ i2, 3) ^ groupAux.hashCode(), 3);
                    return;
                }
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.compositeKeyHashCode, 3) ^ groupKey, 3) ^ i2;
        }
        this.compositeKeyHashCode = rotateLeft;
        startReaderGroup(null, (iArr[(slotReader.currentGroup * 5) + 1] & 1073741824) != 0);
        recomposeToGroupEnd();
        slotReader.endGroup();
        if (objectKey == null) {
        }
    }

    public final void skipReaderToGroupEnd() {
        SlotReader slotReader = this.reader;
        int i = slotReader.parent;
        this.groupNodeCount = i >= 0 ? slotReader.groups[(i * 5) + 1] & 67108863 : 0;
        slotReader.skipToGroupEnd();
    }

    public final void skipToGroupEnd() {
        if (this.groupNodeCount != 0) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.inserting) {
            return;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime != null) {
            int i = currentRecomposeScope$runtime.flags;
            if ((i & 128) == 0) {
                currentRecomposeScope$runtime.flags = i | 16;
            }
        }
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /* renamed from: start-AzEfcrM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m570startAzEfcrM(int i, Object obj, Object obj2, int i2) {
        long rotateLeft;
        boolean z;
        GapPending gapPending;
        GapPending gapPending2;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        Object obj3 = obj;
        if (this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
        int i9 = this.rGroupIndex;
        Object obj4 = Composer.Companion.Empty;
        if (obj3 != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.compositeKeyHashCode, 3) ^ (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode()), 3);
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(obj4)) {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(this.compositeKeyHashCode, 3) ^ obj2.hashCode(), 3) ^ i9;
                if (obj3 == null) {
                    this.rGroupIndex++;
                }
                boolean z3 = i2 == 0;
                if (!this.inserting) {
                    this.reader.emptyCount++;
                    SlotWriter slotWriter = this.writer;
                    int i10 = slotWriter.currentGroup;
                    if (z3) {
                        slotWriter.startGroup(obj4, obj4, true, i);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        slotWriter.startGroup(obj3, obj2, false, i);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        slotWriter.startGroup(obj3, obj4, false, i);
                    }
                    GapPending gapPending3 = this.pending;
                    if (gapPending3 != null) {
                        int i11 = (-2) - i10;
                        KeyInfo keyInfo = new KeyInfo(i, i11, -1, -1);
                        gapPending3.groupInfos.set(i11, new GroupInfo(-1, this.nodeIndex - gapPending3.startIndex, 0));
                        gapPending3.usedKeys.add(keyInfo);
                    }
                    enterGroup(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.reusing;
                if (this.pending == null) {
                    int groupKey = this.reader.getGroupKey();
                    if (!z4 && groupKey == i) {
                        SlotReader slotReader = this.reader;
                        int i12 = slotReader.currentGroup;
                        if (Intrinsics.areEqual(obj3, i12 < slotReader.currentEnd ? slotReader.objectKey(i12, slotReader.groups) : null)) {
                            startReaderGroup(obj2, z3);
                        }
                    }
                    SlotReader slotReader2 = this.reader;
                    int[] iArr = slotReader2.groups;
                    ArrayList arrayList = new ArrayList();
                    if (slotReader2.emptyCount <= 0) {
                        int i13 = slotReader2.currentGroup;
                        while (i13 < slotReader2.currentEnd) {
                            int i14 = i13 * 5;
                            int i15 = iArr[i14];
                            Object objectKey = slotReader2.objectKey(i13, iArr);
                            int i16 = iArr[i14 + 1];
                            if ((i16 & 1073741824) != 0) {
                                z2 = z4;
                                i8 = 1;
                            } else {
                                z2 = z4;
                                i8 = i16 & 67108863;
                            }
                            arrayList.add(new KeyInfo(i15, i13, objectKey, i8));
                            i13 += iArr[i14 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.pending = new GapPending(this.nodeIndex, arrayList);
                    gapPending = this.pending;
                    if (gapPending != null) {
                        ArrayList arrayList2 = gapPending.usedKeys;
                        MutableIntObjectMap mutableIntObjectMap = gapPending.groupInfos;
                        int i17 = gapPending.startIndex;
                        Object joinedKey = obj3 != null ? new JoinedKey(Integer.valueOf(i), obj3) : Integer.valueOf(i);
                        MutableScatterMap mutableScatterMap = ((MultiValueMap) gapPending.keyMap$delegate.getValue()).map;
                        Object obj5 = mutableScatterMap.get(joinedKey);
                        if (obj5 == null) {
                            obj5 = null;
                        } else if (obj5 instanceof MutableObjectList) {
                            MutableObjectList mutableObjectList = (MutableObjectList) obj5;
                            Object removeAt = mutableObjectList.removeAt(0);
                            if (mutableObjectList.isEmpty()) {
                                mutableScatterMap.remove(joinedKey);
                            }
                            if (mutableObjectList._size == 1) {
                                mutableScatterMap.set(joinedKey, mutableObjectList.first());
                            }
                            obj5 = removeAt;
                        } else {
                            mutableScatterMap.remove(joinedKey);
                        }
                        KeyInfo keyInfo2 = (KeyInfo) obj5;
                        if (z || keyInfo2 == null) {
                            this.reader.emptyCount++;
                            this.inserting = true;
                            this.providerCache = null;
                            if (this.writer.closed) {
                                SlotWriter openWriter = this.insertTable.openWriter();
                                this.writer = openWriter;
                                openWriter.skipToGroupEnd();
                                this.writerHasAProvider = false;
                                this.providerCache = null;
                            }
                            this.writer.beginInsert();
                            SlotWriter slotWriter2 = this.writer;
                            int i18 = slotWriter2.currentGroup;
                            if (z3) {
                                slotWriter2.startGroup(obj4, obj4, true, i);
                                i3 = 0;
                            } else if (obj2 != null) {
                                if (obj != null) {
                                    obj4 = obj;
                                }
                                i3 = 0;
                                slotWriter2.startGroup(obj4, obj2, false, i);
                            } else {
                                i3 = 0;
                                slotWriter2.startGroup(obj == null ? obj4 : obj, obj4, false, i);
                            }
                            this.insertAnchor = this.writer.anchor(i18);
                            int i19 = (-2) - i18;
                            KeyInfo keyInfo3 = new KeyInfo(i, i19, -1, -1);
                            mutableIntObjectMap.set(i19, new GroupInfo(-1, this.nodeIndex - i17, i3));
                            arrayList2.add(keyInfo3);
                            gapPending2 = new GapPending(z3 ? i3 : this.nodeIndex, new ArrayList());
                            enterGroup(z3, gapPending2);
                            return;
                        }
                        int i20 = keyInfo2.location;
                        arrayList2.add(keyInfo2);
                        GroupInfo groupInfo = (GroupInfo) mutableIntObjectMap.get(i20);
                        this.nodeIndex = (groupInfo != null ? groupInfo.nodeIndex : -1) + i17;
                        GroupInfo groupInfo2 = (GroupInfo) mutableIntObjectMap.get(i20);
                        int i21 = groupInfo2 != null ? groupInfo2.slotIndex : -1;
                        int i22 = gapPending.groupIndex;
                        int i23 = i21 - i22;
                        int i24 = 8;
                        if (i21 > i22) {
                            Object[] objArr3 = mutableIntObjectMap.values;
                            long[] jArr = mutableIntObjectMap.metadata;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) < 128) {
                                                i7 = i24;
                                                GroupInfo groupInfo3 = (GroupInfo) objArr3[(i25 << 3) + i27];
                                                i6 = i23;
                                                int i28 = groupInfo3.slotIndex;
                                                if (i28 == i21) {
                                                    groupInfo3.slotIndex = i22;
                                                } else if (i22 <= i28 && i28 < i21) {
                                                    groupInfo3.slotIndex = i28 + 1;
                                                }
                                            } else {
                                                i6 = i23;
                                                i7 = i24;
                                            }
                                            j >>= i7;
                                            i27++;
                                            i24 = i7;
                                            i23 = i6;
                                        }
                                        i4 = i23;
                                        if (i26 != i24) {
                                            break;
                                        }
                                    } else {
                                        i4 = i23;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    i23 = i4;
                                    i24 = 8;
                                }
                            } else {
                                i4 = i23;
                            }
                        } else {
                            i4 = i23;
                            if (i22 > i21) {
                                Object[] objArr4 = mutableIntObjectMap.values;
                                long[] jArr2 = mutableIntObjectMap.metadata;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j2 = jArr2[i29];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j2 & 255) < 128) {
                                                    GroupInfo groupInfo4 = (GroupInfo) objArr4[(i29 << 3) + i31];
                                                    int i32 = groupInfo4.slotIndex;
                                                    if (i32 == i21) {
                                                        groupInfo4.slotIndex = i22;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i21 + 1 <= i32 && i32 < i22) {
                                                            groupInfo4.slotIndex = i32 - 1;
                                                        }
                                                        j2 >>= 8;
                                                        i31++;
                                                        objArr4 = objArr2;
                                                    }
                                                }
                                                objArr2 = objArr4;
                                                j2 >>= 8;
                                                i31++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i30 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                        int i33 = composerChangeListWriter.writersReaderDelta;
                        GapComposer gapComposer = composerChangeListWriter.composer;
                        composerChangeListWriter.writersReaderDelta = (i20 - gapComposer.reader.currentGroup) + i33;
                        this.reader.reposition(i20);
                        if (i4 > 0) {
                            composerChangeListWriter.realizeOperationLocation(false);
                            IntStack intStack = composerChangeListWriter.startedGroups;
                            SlotReader slotReader3 = gapComposer.reader;
                            if (slotReader3.groupsSize > 0 && intStack.peekOr(-2) != (i5 = slotReader3.parent)) {
                                if (!composerChangeListWriter.startedGroup && composerChangeListWriter.implicitRootStart) {
                                    composerChangeListWriter.realizeOperationLocation(false);
                                    composerChangeListWriter.changeList.f854operations.pushOp(Operation.EnsureRootGroupStarted.INSTANCE);
                                    composerChangeListWriter.startedGroup = true;
                                }
                                if (i5 > 0) {
                                    GapAnchor anchor = slotReader3.anchor(i5);
                                    intStack.push(i5);
                                    composerChangeListWriter.realizeOperationLocation(false);
                                    Operations operations2 = composerChangeListWriter.changeList.f854operations;
                                    operations2.pushOp(Operation.EnsureGroupStarted.INSTANCE);
                                    DBUtil.m1186setObjectsGr0YRc(operations2, 0, anchor);
                                    composerChangeListWriter.startedGroup = true;
                                }
                            }
                            Operations operations3 = composerChangeListWriter.changeList.f854operations;
                            operations3.pushOp(Operation.MoveCurrentGroup.INSTANCE);
                            operations3.intArgs[operations3.intArgsSize - operations3.opCodes[operations3.opCodesSize - 1].ints] = i4;
                        }
                        startReaderGroup(obj2, z3);
                    }
                    gapPending2 = null;
                    enterGroup(z3, gapPending2);
                    return;
                }
                z = z4;
                gapPending = this.pending;
                if (gapPending != null) {
                }
                gapPending2 = null;
                enterGroup(z3, gapPending2);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.compositeKeyHashCode, 3) ^ i, 3) ^ i9;
        }
        this.compositeKeyHashCode = rotateLeft;
        if (obj3 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.inserting) {
        }
    }

    public final void startDefaults() {
        m570startAzEfcrM(-127, null, null, 0);
    }

    public final void startGroup(int i, OpaqueKey opaqueKey) {
        m570startAzEfcrM(i, opaqueKey, null, 0);
    }

    public final void startMovableGroup(int i, Object obj) {
        m570startAzEfcrM(i, obj, null, 0);
    }

    public final void startNode() {
        m570startAzEfcrM(125, null, null, 1);
        this.nodeExpected = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r1) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void startProviders(ProvidedValue[] providedValueArr) {
        PersistentCompositionLocalHashMap build$1;
        PersistentCompositionLocalHashMap currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, ComposerKt.provider);
        boolean z = this.inserting;
        OpaqueKey opaqueKey = ComposerKt.providerMaps;
        boolean z2 = true;
        if (z) {
            PersistentCompositionLocalHashMap updateCompositionMap = Updater.updateCompositionMap(providedValueArr, currentCompositionLocalScope, PersistentCompositionLocalHashMap.Empty);
            currentCompositionLocalScope.getClass();
            PersistentCompositionLocalHashMap.Builder builder = new PersistentCompositionLocalHashMap.Builder(currentCompositionLocalScope);
            builder.map = currentCompositionLocalScope;
            builder.putAll(updateCompositionMap);
            build$1 = builder.build$1();
            startGroup(EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE, opaqueKey);
            nextSlot();
            updateValue(build$1);
            nextSlot();
            updateValue(updateCompositionMap);
            end(false);
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object groupGet = slotReader.groupGet(slotReader.currentGroup, 0);
            groupGet.getClass();
            PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = (PersistentCompositionLocalHashMap) groupGet;
            SlotReader slotReader2 = this.reader;
            Object groupGet2 = slotReader2.groupGet(slotReader2.currentGroup, 1);
            groupGet2.getClass();
            PersistentCompositionLocalHashMap persistentCompositionLocalHashMap2 = (PersistentCompositionLocalHashMap) groupGet2;
            PersistentCompositionLocalHashMap updateCompositionMap2 = Updater.updateCompositionMap(providedValueArr, currentCompositionLocalScope, persistentCompositionLocalHashMap2);
            if (!getSkipping() || this.reusing || !persistentCompositionLocalHashMap2.equals(updateCompositionMap2)) {
                currentCompositionLocalScope.getClass();
                PersistentCompositionLocalHashMap.Builder builder2 = new PersistentCompositionLocalHashMap.Builder(currentCompositionLocalScope);
                builder2.map = currentCompositionLocalScope;
                builder2.putAll(updateCompositionMap2);
                build$1 = builder2.build$1();
                startGroup(EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE, opaqueKey);
                nextSlot();
                updateValue(build$1);
                nextSlot();
                updateValue(updateCompositionMap2);
                end(false);
                if (!this.reusing) {
                }
                if (z2 && !this.inserting) {
                    recordProviderUpdate(build$1);
                }
                this.providersInvalidStack.push(this.providersInvalid ? 1 : 0);
                this.providersInvalid = z2;
                this.providerCache = build$1;
                m570startAzEfcrM(EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, ComposerKt.compositionLocalMap, build$1, 0);
            }
            this.groupNodeCount = this.reader.skipGroup() + this.groupNodeCount;
            build$1 = persistentCompositionLocalHashMap;
        }
        z2 = false;
        if (z2) {
            recordProviderUpdate(build$1);
        }
        this.providersInvalidStack.push(this.providersInvalid ? 1 : 0);
        this.providersInvalid = z2;
        this.providerCache = build$1;
        m570startAzEfcrM(EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, ComposerKt.compositionLocalMap, build$1, 0);
    }

    public final void startReaderGroup(Object obj, boolean z) {
        if (z) {
            SlotReader slotReader = this.reader;
            if (slotReader.emptyCount <= 0) {
                if ((slotReader.groups[(slotReader.currentGroup * 5) + 1] & 1073741824) == 0) {
                    PreconditionsKt.throwIllegalArgumentException("Expected a node group");
                }
                slotReader.startGroup();
                return;
            }
            return;
        }
        if (obj != null && this.reader.getGroupAux() != obj) {
            ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
            composerChangeListWriter.getClass();
            composerChangeListWriter.realizeOperationLocation(false);
            Operations operations2 = composerChangeListWriter.changeList.f854operations;
            operations2.pushOp(Operation.UpdateAuxData.INSTANCE);
            DBUtil.m1186setObjectsGr0YRc(operations2, 0, obj);
        }
        this.reader.startGroup();
    }

    public final void startReplaceGroup(int i) {
        int i2;
        int i3;
        if (this.pending != null) {
            m570startAzEfcrM(i, null, null, 0);
            return;
        }
        if (this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
        this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(this.compositeKeyHashCode, 3) ^ i, 3) ^ this.rGroupIndex;
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        boolean z = this.inserting;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (z) {
            slotReader.emptyCount++;
            this.writer.startGroup(neverEqualPolicy, neverEqualPolicy, false, i);
            enterGroup(false, null);
            return;
        }
        if (slotReader.getGroupKey() == i && ((i3 = slotReader.currentGroup) >= slotReader.currentEnd || (slotReader.groups[(i3 * 5) + 1] & PKIFailureInfo.duplicateCertReq) == 0)) {
            slotReader.startGroup();
            enterGroup(false, null);
            return;
        }
        if (slotReader.emptyCount <= 0 && (i2 = slotReader.currentGroup) != slotReader.currentEnd) {
            int i4 = this.nodeIndex;
            recordDelete();
            this.changeListWriter.removeNode(i4, slotReader.skipGroup());
            Updater.access$removeRange(i2, slotReader.currentGroup, this.invalidations);
        }
        slotReader.emptyCount++;
        this.inserting = true;
        this.providerCache = null;
        if (this.writer.closed) {
            SlotWriter openWriter = this.insertTable.openWriter();
            this.writer = openWriter;
            openWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
        SlotWriter slotWriter = this.writer;
        slotWriter.beginInsert();
        int i5 = slotWriter.currentGroup;
        slotWriter.startGroup(neverEqualPolicy, neverEqualPolicy, false, i);
        this.insertAnchor = slotWriter.anchor(i5);
        enterGroup(false, null);
    }

    public final void startReplaceableGroup(int i) {
        m570startAzEfcrM(i, null, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GapComposer startRestartGroup(int i) {
        RecomposeScopeImpl recomposeScopeImpl;
        boolean z;
        int i2;
        startReplaceGroup(i);
        boolean z2 = this.inserting;
        MemoryCacheService memoryCacheService = this.observerHolder;
        ArrayList arrayList = this.invalidateStack;
        CompositionImpl compositionImpl = this.composition;
        if (z2) {
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl(compositionImpl);
            arrayList.add(recomposeScopeImpl2);
            updateValue(recomposeScopeImpl2);
            recomposeScopeImpl2.currentToken = this.compositionToken;
            recomposeScopeImpl2.flags &= -17;
            memoryCacheService.current();
            return this;
        }
        int i3 = this.reader.parent;
        ArrayList arrayList2 = this.invalidations;
        int findLocation = Updater.findLocation(i3, arrayList2);
        Invalidation invalidation = findLocation >= 0 ? (Invalidation) arrayList2.remove(findLocation) : null;
        Object next = this.reader.next();
        if (Intrinsics.areEqual(next, Composer.Companion.Empty)) {
            recomposeScopeImpl = new RecomposeScopeImpl(compositionImpl);
            updateValue(recomposeScopeImpl);
        } else {
            next.getClass();
            recomposeScopeImpl = (RecomposeScopeImpl) next;
        }
        if (invalidation == null) {
            int i4 = recomposeScopeImpl.flags;
            boolean z3 = (i4 & 64) != 0;
            if (z3) {
                recomposeScopeImpl.flags = i4 & (-65);
            }
            if (!z3) {
                z = false;
                int i5 = recomposeScopeImpl.flags;
                recomposeScopeImpl.flags = !z ? i5 | 8 : i5 & (-9);
                arrayList.add(recomposeScopeImpl);
                recomposeScopeImpl.currentToken = this.compositionToken;
                recomposeScopeImpl.flags &= -17;
                memoryCacheService.current();
                i2 = recomposeScopeImpl.flags;
                if ((i2 & 256) != 0) {
                    recomposeScopeImpl.flags = (i2 & (-257)) | 512;
                    Operations operations2 = this.changeListWriter.changeList.f854operations;
                    operations2.pushOp(Operation.StartResumingScope.INSTANCE);
                    DBUtil.m1186setObjectsGr0YRc(operations2, 0, recomposeScopeImpl);
                    if (!this.reusing) {
                        int i6 = recomposeScopeImpl.flags;
                        if ((i6 & 128) != 0) {
                            this.reusing = true;
                            this.reusingGroup = this.reader.parent;
                            recomposeScopeImpl.flags = i6 | 1024;
                        }
                    }
                }
                return this;
            }
        }
        z = true;
        int i52 = recomposeScopeImpl.flags;
        recomposeScopeImpl.flags = !z ? i52 | 8 : i52 & (-9);
        arrayList.add(recomposeScopeImpl);
        recomposeScopeImpl.currentToken = this.compositionToken;
        recomposeScopeImpl.flags &= -17;
        memoryCacheService.current();
        i2 = recomposeScopeImpl.flags;
        if ((i2 & 256) != 0) {
        }
        return this;
    }

    public final void startReusableGroup(Object obj) {
        if (!this.inserting && this.reader.getGroupKey() == 207 && !Intrinsics.areEqual(this.reader.getGroupAux(), obj) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.currentGroup;
            this.reusing = true;
        }
        m570startAzEfcrM(EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE, null, obj, 0);
    }

    public final void startReusableNode() {
        m570startAzEfcrM(125, null, null, 2);
        this.nodeExpected = true;
    }

    public final void startRoot() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.openReader();
        m570startAzEfcrM(100, null, null, 0);
        CompositionContext compositionContext = this.parentContext;
        compositionContext.startComposing$runtime();
        PersistentCompositionLocalHashMap compositionLocalScope$runtime = compositionContext.getCompositionLocalScope$runtime();
        this.providersInvalidStack.push(this.providersInvalid ? 1 : 0);
        this.providersInvalid = changed(compositionLocalScope$runtime);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = compositionContext.getCollectingParameterInformation$runtime();
        }
        if (!this.sourceMarkersEnabled) {
            this.sourceMarkersEnabled = compositionContext.getCollectingSourceInformation$runtime();
        }
        if (this.sourceMarkersEnabled) {
            StaticProvidableCompositionLocal localCompositionErrorContext = CompositionErrorContextKt.getLocalCompositionErrorContext();
            localCompositionErrorContext.getClass();
            compositionLocalScope$runtime = compositionLocalScope$runtime.putValue(localCompositionErrorContext, new StaticValueHolder(getErrorContext$runtime()));
        }
        this.rootProvider = compositionLocalScope$runtime;
        Set set = (Set) Updater.read(compositionLocalScope$runtime, InspectionTablesKt.LocalInspectionTables);
        if (set != null) {
            set.add(getCompositionData());
            compositionContext.recordInspectionTable$runtime(set);
        }
        m570startAzEfcrM(Long.hashCode(compositionContext.getCompositeKeyHashCode$runtime()), null, null, 0);
    }

    public final boolean tryImminentInvalidation$runtime(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        GapAnchor gapAnchor = recomposeScopeImpl.anchor;
        if (gapAnchor == null) {
            return false;
        }
        int anchorIndex = this.reader.table.anchorIndex(Room.asGapAnchor(gapAnchor));
        if (!this.isComposing || anchorIndex < this.reader.currentGroup) {
            return false;
        }
        ArrayList arrayList = this.invalidations;
        int findLocation = Updater.findLocation(anchorIndex, arrayList);
        if (findLocation < 0) {
            int i = -(findLocation + 1);
            if (!(obj instanceof DerivedSnapshotState)) {
                obj = null;
            }
            arrayList.add(i, new Invalidation(recomposeScopeImpl, anchorIndex, obj));
            return true;
        }
        Invalidation invalidation = (Invalidation) arrayList.get(findLocation);
        if (!(obj instanceof DerivedSnapshotState)) {
            invalidation.instances = null;
            return true;
        }
        Object obj2 = invalidation.instances;
        if (obj2 == null) {
            invalidation.instances = obj;
            return true;
        }
        if (obj2 instanceof MutableScatterSet) {
            ((MutableScatterSet) obj2).add(obj);
            return true;
        }
        MutableScatterSet mutableScatterSet = ScatterSetKt.EmptyScatterSet;
        MutableScatterSet mutableScatterSet2 = new MutableScatterSet(2);
        mutableScatterSet2.plusAssign(obj2);
        mutableScatterSet2.plusAssign(obj);
        invalidation.instances = mutableScatterSet2;
        return true;
    }

    /* renamed from: updateComposerInvalidations-RY85e9Y$runtime, reason: not valid java name */
    public final void m571updateComposerInvalidationsRY85e9Y$runtime(MutableScatterMap mutableScatterMap) {
        ArrayList arrayList = this.invalidations;
        for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList); -1 < lastIndex; lastIndex--) {
            Invalidation invalidation = (Invalidation) arrayList.get(lastIndex);
            GapAnchor gapAnchor = invalidation.scope.anchor;
            GapAnchor asGapAnchor = gapAnchor != null ? Room.asGapAnchor(gapAnchor) : null;
            if (asGapAnchor == null || !asGapAnchor.getValid()) {
                arrayList.remove(lastIndex);
            } else {
                int i = invalidation.location;
                int i2 = asGapAnchor.location;
                if (i != i2) {
                    invalidation.location = i2;
                }
            }
        }
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                            GapAnchor gapAnchor2 = recomposeScopeImpl.anchor;
                            if (gapAnchor2 != null) {
                                int i7 = Room.asGapAnchor(gapAnchor2).location;
                                if (obj2 == NeverEqualPolicy.INSTANCE$2) {
                                    obj2 = null;
                                }
                                arrayList.add(new Invalidation(recomposeScopeImpl, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, Updater.InvalidationLocationAscending);
    }

    public final void updateNodeCount(int i, int i2) {
        if (updatedNodeCount(i) != i2) {
            if (i < 0) {
                MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap();
                    this.nodeCountVirtualOverrides = mutableIntIntMap;
                }
                mutableIntIntMap.set(i, i2);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                int i3 = this.reader.groupsSize;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.nodeCountOverrides = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void updateNodeCountOverrides(int i, int i2) {
        int updatedNodeCount = updatedNodeCount(i);
        if (updatedNodeCount != i2) {
            int i3 = i2 - updatedNodeCount;
            ArrayList arrayList = this.pendingStack;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int updatedNodeCount2 = updatedNodeCount(i) + i3;
                updateNodeCount(i, updatedNodeCount2);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        GapPending gapPending = (GapPending) arrayList.get(i4);
                        if (gapPending != null && gapPending.updateNodeCount(i, updatedNodeCount2)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                SlotReader slotReader = this.reader;
                if (i < 0) {
                    i = slotReader.parent;
                } else if (slotReader.isNode(i)) {
                    return;
                } else {
                    i = this.reader.parent(i);
                }
            }
        }
    }

    public final void updateRememberedValue(Object obj) {
        if (obj instanceof RememberObserver) {
            GapRememberObserverHolder gapRememberObserverHolder = new GapRememberObserverHolder((RememberObserver) obj, this.rGroupIndex - 1);
            if (this.inserting) {
                Operations operations2 = this.changeListWriter.changeList.f854operations;
                operations2.pushOp(Operation.Remember.INSTANCE);
                DBUtil.m1186setObjectsGr0YRc(operations2, 0, gapRememberObserverHolder);
            }
            this.abandonSet.add(obj);
            obj = gapRememberObserverHolder;
        }
        updateValue(obj);
    }

    public final void updateValue(Object obj) {
        if (this.inserting) {
            SlotWriter slotWriter = this.writer;
            if (slotWriter.insertCount <= 0 || slotWriter.currentSlot == slotWriter.slotsGapStart) {
                slotWriter.rawUpdate(obj);
                return;
            }
            MutableIntObjectMap mutableIntObjectMap = slotWriter.deferredSlotWrites;
            if (mutableIntObjectMap == null) {
                mutableIntObjectMap = new MutableIntObjectMap();
            }
            slotWriter.deferredSlotWrites = mutableIntObjectMap;
            int i = slotWriter.parent;
            Object obj2 = mutableIntObjectMap.get(i);
            if (obj2 == null) {
                obj2 = new MutableObjectList();
                mutableIntObjectMap.set(i, obj2);
            }
            ((MutableObjectList) obj2).add(obj);
            return;
        }
        SlotReader slotReader = this.reader;
        boolean z = slotReader.hadNext;
        ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
        if (!z) {
            GapAnchor anchor = slotReader.anchor(slotReader.parent);
            Operations operations2 = composerChangeListWriter.changeList.f854operations;
            operations2.pushOp(Operation.AppendValue.INSTANCE);
            DBUtil.m1187setObjectsEsEZvaA(operations2, 0, anchor, 1, obj);
            return;
        }
        int access$slotAnchor = (slotReader.currentSlot - SlotTableKt.access$slotAnchor(slotReader.parent, slotReader.groups)) - 1;
        if (composerChangeListWriter.composer.reader.parent - composerChangeListWriter.writersReaderDelta >= 0) {
            composerChangeListWriter.realizeOperationLocation(true);
            Operations operations3 = composerChangeListWriter.changeList.f854operations;
            operations3.pushOp(Operation.UpdateValue.INSTANCE);
            DBUtil.m1186setObjectsGr0YRc(operations3, 0, obj);
            operations3.intArgs[operations3.intArgsSize - operations3.opCodes[operations3.opCodesSize - 1].ints] = access$slotAnchor;
            return;
        }
        SlotReader slotReader2 = this.reader;
        GapAnchor anchor2 = slotReader2.anchor(slotReader2.parent);
        Operations operations4 = composerChangeListWriter.changeList.f854operations;
        operations4.pushOp(Operation.UpdateValue.INSTANCE$3);
        DBUtil.m1187setObjectsEsEZvaA(operations4, 0, obj, 1, anchor2);
        operations4.intArgs[operations4.intArgsSize - operations4.opCodes[operations4.opCodesSize - 1].ints] = access$slotAnchor;
    }

    public final int updatedNodeCount(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.reader.nodeCount(i) : i2;
        }
        MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
        if (mutableIntIntMap == null || mutableIntIntMap.findKeyIndex(i) < 0) {
            return 0;
        }
        int findKeyIndex = mutableIntIntMap.findKeyIndex(i);
        if (findKeyIndex >= 0) {
            return mutableIntIntMap.values[findKeyIndex];
        }
        RuntimeHelpersKt.throwNoSuchElementException("Cannot find value for key " + i);
        throw null;
    }

    public final void useNode() {
        if (!this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
        if (this.inserting) {
            ComposerKt.composeImmediateRuntimeError("useNode() called while inserting");
        }
        SlotReader slotReader = this.reader;
        Object node = slotReader.node(slotReader.parent);
        ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
        composerChangeListWriter.realizeNodeMovementOperations();
        composerChangeListWriter.pendingDownNodes.add(node);
        if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
            composerChangeListWriter.pushPendingUpsAndDowns();
            composerChangeListWriter.changeList.f854operations.pushOp(Operation.UseCurrentNode.INSTANCE);
        }
    }

    public final boolean changed(char c) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Character) && c == ((Character) nextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(c));
        return true;
    }

    public final boolean changed(boolean z) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Boolean) && z == ((Boolean) nextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z));
        return true;
    }

    public final boolean changed(Object obj) {
        if (Intrinsics.areEqual(nextSlot(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    public final boolean changed(long j) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Long) && j == ((Number) nextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j));
        return true;
    }

    public final boolean changed(double d) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Double) && d == ((Number) nextSlot).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(d));
        return true;
    }

    public final boolean changed(int i) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Integer) && i == ((Number) nextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i));
        return true;
    }
}
