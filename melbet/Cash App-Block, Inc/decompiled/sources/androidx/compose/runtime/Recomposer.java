package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.trifle.KeyHandle$keyPair$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.wire.GrpcMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class Recomposer extends CompositionContext {
    public final ArrayList _knownCompositions;
    public List _knownCompositionsCache;
    public final StateFlowImpl _state;
    public final BroadcastFrameClock broadcastFrameClock;
    public long changeCount;
    public Throwable closeCause;
    public final MutableVector compositionInvalidations;
    public final ArrayList compositionsAwaitingApply;
    public MutableScatterSet compositionsRemoved;
    public final CoroutineContext effectCoroutineContext;
    public final JobImpl effectJob;
    public final StateFlowImpl errorState;
    public ArrayList failedCompositions;
    public boolean frameClockPaused;
    public final ArrayList movableContentAwaitingInsert;
    public final MutableScatterMap movableContentNestedExtractionsPending;
    public final WorkLauncherImpl movableContentNestedStatesAvailable;
    public final MutableScatterMap movableContentRemoved;
    public final MutableScatterMap movableContentStatesAvailable;
    public final GrpcMethod nextFrameEndCallbackQueue;
    public final GrpcMethod pausedScopes;
    public final NeverEqualPolicy recomposerInfo;
    public Job runnerJob;
    public MutableScatterSet snapshotInvalidations;
    public final Object stateLock;
    public CancellableContinuationImpl workContinuation;
    public static final StateFlowImpl _runningRecomposers = FlowKt.MutableStateFlow(PersistentOrderedSet.EMPTY);
    public static final AtomicReference _hotReloadEnabled = new AtomicReference(Boolean.FALSE);

    /* loaded from: classes3.dex */
    public final class RecomposerErrorState {
        public final Throwable cause;

        public RecomposerErrorState(Throwable th) {
            this.cause = th;
        }

        public final Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State Idle;
        public static final State Inactive;
        public static final State InactivePendingWork;
        public static final State PendingWork;
        public static final State ShutDown;
        public static final State ShuttingDown;

        static {
            State state = new State("ShutDown", 0);
            ShutDown = state;
            State state2 = new State("ShuttingDown", 1);
            ShuttingDown = state2;
            State state3 = new State("Inactive", 2);
            Inactive = state3;
            State state4 = new State("InactivePendingWork", 3);
            InactivePendingWork = state4;
            State state5 = new State("Idle", 4);
            Idle = state5;
            State state6 = new State("PendingWork", 5);
            PendingWork = state6;
            $VALUES = new State[]{state, state2, state3, state4, state5, state6};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public Recomposer(CoroutineContext coroutineContext) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Recomposer$$ExternalSyntheticLambda1(this, 0));
        this.broadcastFrameClock = broadcastFrameClock;
        Recomposer$$ExternalSyntheticLambda1 recomposer$$ExternalSyntheticLambda1 = new Recomposer$$ExternalSyntheticLambda1(this, 1);
        GrpcMethod grpcMethod = new GrpcMethod();
        grpcMethod.path = new AtomicInt(0);
        grpcMethod.requestAdapter = new ComponentRegistry.Builder(1);
        grpcMethod.responseAdapter = new ComponentRegistry$Builder$$ExternalSyntheticLambda3(8, grpcMethod, recomposer$$ExternalSyntheticLambda1);
        this.nextFrameEndCallbackQueue = grpcMethod;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new MutableScatterSet();
        this.compositionInvalidations = new MutableVector(0, new CompositionImpl[16]);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = new MutableScatterMap();
        this.movableContentNestedStatesAvailable = new WorkLauncherImpl(6);
        this.movableContentStatesAvailable = new MutableScatterMap();
        this.movableContentNestedExtractionsPending = new MutableScatterMap();
        this.errorState = FlowKt.MutableStateFlow(null);
        this._state = FlowKt.MutableStateFlow(State.Inactive);
        this.pausedScopes = new GrpcMethod(5, false);
        JobImpl jobImpl = new JobImpl((Job) coroutineContext.get(Job.Key.$$INSTANCE));
        jobImpl.invokeOnCompletion(new CashApp$$ExternalSyntheticLambda2(this, 12));
        this.effectJob = jobImpl;
        this.effectCoroutineContext = coroutineContext.plus(broadcastFrameClock).plus(jobImpl);
        this.recomposerInfo = new NeverEqualPolicy(8);
    }

    public static void applyAndCheck(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.apply() instanceof SnapshotApplyResult$Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            mutableSnapshot.dispose();
        }
    }

    public static final void performInitialMovableContentInserts$fillToInsert(ArrayList arrayList, Recomposer recomposer, CompositionImpl compositionImpl) {
        arrayList.clear();
        synchronized (recomposer.stateLock) {
            Iterator it = recomposer.movableContentAwaitingInsert.iterator();
            while (it.hasNext()) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) it.next();
                if (movableContentStateReference.getComposition$runtime().equals(compositionImpl)) {
                    arrayList.add(movableContentStateReference);
                    it.remove();
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            if (((State) this._state.getValue()).compareTo(State.Idle) >= 0) {
                StateFlowImpl stateFlowImpl = this._state;
                State state = State.ShuttingDown;
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, state);
            }
        }
        this.effectJob.cancel(null);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void composeInitial$runtime(CompositionImpl compositionImpl, Function2 function2) {
        State state;
        boolean contains;
        MutableSnapshot takeNestedMutableSnapshot;
        boolean z = compositionImpl.composer.isComposing;
        synchronized (this.stateLock) {
            State state2 = (State) this._state.getValue();
            state = State.ShuttingDown;
            contains = state2.compareTo(state) > 0 ? true ^ knownCompositionsLocked().contains(compositionImpl) : true;
        }
        try {
            CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = new CashApp$$ExternalSyntheticLambda2(compositionImpl, 11);
            Recomposer$$ExternalSyntheticLambda4 recomposer$$ExternalSyntheticLambda4 = new Recomposer$$ExternalSyntheticLambda4(0, compositionImpl, null);
            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = currentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot : null;
            if (mutableSnapshot == null || (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(cashApp$$ExternalSyntheticLambda2, recomposer$$ExternalSyntheticLambda4)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                Snapshot makeCurrent = takeNestedMutableSnapshot.makeCurrent();
                try {
                    compositionImpl.composeContent(function2);
                    synchronized (this.stateLock) {
                        if (((State) this._state.getValue()).compareTo(state) > 0 && !knownCompositionsLocked().contains(compositionImpl)) {
                            this._knownCompositions.add(compositionImpl);
                            this._knownCompositionsCache = null;
                        }
                    }
                    if (!z) {
                        SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime();
                    }
                    try {
                        performInitialMovableContentInserts(compositionImpl);
                        try {
                            compositionImpl.applyChanges();
                            compositionImpl.applyLateChanges();
                            if (z) {
                                return;
                            }
                            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime();
                        } catch (Throwable th) {
                            processCompositionError(th, null);
                        }
                    } catch (Throwable th2) {
                        processCompositionError(th2, compositionImpl);
                    }
                } finally {
                    Snapshot.restoreCurrent(makeCurrent);
                }
            } finally {
                applyAndCheck(takeNestedMutableSnapshot);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (this.stateLock) {
                }
            }
            processCompositionError(th3, compositionImpl);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final MutableScatterSet composeInitialPaused$runtime(CompositionImpl compositionImpl, ShouldPauseCallback shouldPauseCallback, Function2 function2) {
        GrpcMethod grpcMethod = this.pausedScopes;
        try {
            ShouldPauseCallback shouldPauseCallback2 = compositionImpl.shouldPause;
            compositionImpl.shouldPause = shouldPauseCallback;
            try {
                composeInitial$runtime(compositionImpl, function2);
                MutableScatterSet mutableScatterSet = (MutableScatterSet) grpcMethod.get();
                if (mutableScatterSet == null) {
                    mutableScatterSet = ScatterSetKt.EmptyScatterSet;
                    mutableScatterSet.getClass();
                }
                return mutableScatterSet;
            } finally {
                compositionImpl.shouldPause = shouldPauseCallback2;
            }
        } finally {
            grpcMethod.set(null);
        }
    }

    public final CancellableContinuation deriveStateLocked() {
        State state;
        StateFlowImpl stateFlowImpl = this._state;
        int compareTo = ((State) stateFlowImpl.getValue()).compareTo(State.ShuttingDown);
        StateFlowImpl stateFlowImpl2 = this.errorState;
        ArrayList arrayList = this.movableContentAwaitingInsert;
        ArrayList arrayList2 = this.compositionsAwaitingApply;
        MutableVector mutableVector = this.compositionInvalidations;
        if (compareTo > 0) {
            if (stateFlowImpl2.getValue() != null) {
                state = State.Inactive;
            } else if (this.runnerJob == null) {
                this.snapshotInvalidations = new MutableScatterSet();
                mutableVector.clear();
                state = (getHasBroadcastFrameClockAwaitersLocked() || getHasNextFrameEndAwaitersLocked()) ? State.InactivePendingWork : State.Inactive;
            } else {
                state = (mutableVector.size != 0 || this.snapshotInvalidations.isNotEmpty() || !arrayList2.isEmpty() || !arrayList.isEmpty() || getHasBroadcastFrameClockAwaitersLocked() || getHasNextFrameEndAwaitersLocked() || this.movableContentRemoved.isNotEmpty()) ? State.PendingWork : State.Idle;
            }
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, state);
            if (state != State.PendingWork) {
                return null;
            }
            CancellableContinuationImpl cancellableContinuationImpl = this.workContinuation;
            this.workContinuation = null;
            return cancellableContinuationImpl;
        }
        List knownCompositionsLocked = knownCompositionsLocked();
        int size = knownCompositionsLocked.size();
        for (int i = 0; i < size; i++) {
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = EmptyList.INSTANCE;
        this.snapshotInvalidations = new MutableScatterSet();
        mutableVector.clear();
        arrayList2.clear();
        arrayList.clear();
        this.failedCompositions = null;
        CancellableContinuationImpl cancellableContinuationImpl2 = this.workContinuation;
        if (cancellableContinuationImpl2 != null) {
            cancellableContinuationImpl2.cancel(null);
        }
        this.workContinuation = null;
        stateFlowImpl2.setValue(null);
        return null;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final boolean getCollectingCallByInformation$runtime() {
        return ((Boolean) _hotReloadEnabled.get()).booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final boolean getCollectingParameterInformation$runtime() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final boolean getCollectingSourceInformation$runtime() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final long getCompositeKeyHashCode$runtime() {
        return 1000L;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final Composition getComposition$runtime() {
        return null;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    public final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && (((AtomicInt) this.broadcastFrameClock.queue.keyers).get() & 134217727) > 0;
    }

    public final boolean getHasFrameWorkLocked() {
        return this.compositionInvalidations.size != 0 || getHasBroadcastFrameClockAwaitersLocked() || getHasNextFrameEndAwaitersLocked() || this.movableContentRemoved.isNotEmpty();
    }

    public final boolean getHasNextFrameEndAwaitersLocked() {
        return !this.frameClockPaused && (((AtomicInt) ((ComponentRegistry.Builder) this.nextFrameEndCallbackQueue.requestAdapter).keyers).get() & 134217727) > 0;
    }

    public final boolean getHasSchedulingWork() {
        boolean z;
        synchronized (this.stateLock) {
            if (!this.snapshotInvalidations.isNotEmpty() && this.compositionInvalidations.size == 0 && !getHasBroadcastFrameClockAwaitersLocked()) {
                z = getHasNextFrameEndAwaitersLocked();
            }
        }
        return z;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final boolean getStackTraceEnabled$runtime() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void invalidate$runtime(CompositionImpl compositionImpl) {
        CancellableContinuation cancellableContinuation;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(compositionImpl)) {
                cancellableContinuation = null;
            } else {
                this.compositionInvalidations.add(compositionImpl);
                cancellableContinuation = deriveStateLocked();
            }
        }
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.Companion;
            ((CancellableContinuationImpl) cancellableContinuation).resumeWith(Unit.INSTANCE);
        }
    }

    public final List knownCompositionsLocked() {
        List list = this._knownCompositionsCache;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this._knownCompositions;
        List arrayList2 = arrayList.isEmpty() ? EmptyList.INSTANCE : new ArrayList(arrayList);
        this._knownCompositionsCache = arrayList2;
        return arrayList2;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final MovableContentState movableContentStateResolve$runtime(MovableContentStateReference movableContentStateReference) {
        MovableContentState movableContentState;
        synchronized (this.stateLock) {
            movableContentState = (MovableContentState) this.movableContentStatesAvailable.remove(movableContentStateReference);
        }
        return movableContentState;
    }

    public final void onNewFrameAwaiter() {
        CancellableContinuation deriveStateLocked;
        synchronized (this.stateLock) {
            deriveStateLocked = deriveStateLocked();
            if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                throw JobKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", this.closeCause);
            }
        }
        if (deriveStateLocked != null) {
            Result.Companion companion = Result.Companion;
            ((CancellableContinuationImpl) deriveStateLocked).resumeWith(Unit.INSTANCE);
        }
    }

    public final void performInitialMovableContentInserts(CompositionImpl compositionImpl) {
        synchronized (this.stateLock) {
            ArrayList arrayList = this.movableContentAwaitingInsert;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((MovableContentStateReference) arrayList.get(i)).getComposition$runtime().equals(compositionImpl)) {
                    ArrayList arrayList2 = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList2, this, compositionImpl);
                    while (!arrayList2.isEmpty()) {
                        performInsertValues(arrayList2, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList2, this, compositionImpl);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0141, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0146, code lost:
    
        if (r4 >= r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0150, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).second == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0152, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0155, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0163, code lost:
    
        if (r9 >= r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0165, code lost:
    
        r11 = (kotlin.Pair) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016d, code lost:
    
        if (r11.second != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016f, code lost:
    
        r11 = (androidx.compose.runtime.MovableContentStateReference) r11.first;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0176, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0179, code lost:
    
        r4 = r17.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017b, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017c, code lost:
    
        kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r3, r17.movableContentAwaitingInsert);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0181, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0182, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0190, code lost:
    
        if (r9 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0192, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019b, code lost:
    
        if (((kotlin.Pair) r11).second == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019d, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a0, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a3, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List performInsertValues(List list, MutableScatterSet mutableScatterSet) {
        MutableSnapshot takeNestedMutableSnapshot;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            CompositionImpl composition$runtime = ((MovableContentStateReference) obj).getComposition$runtime();
            Object obj2 = hashMap.get(composition$runtime);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(composition$runtime, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            CompositionImpl compositionImpl = (CompositionImpl) entry.getKey();
            List list2 = (List) entry.getValue();
            if (compositionImpl.composer.isComposing) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = new CashApp$$ExternalSyntheticLambda2(compositionImpl, 11);
            Recomposer$$ExternalSyntheticLambda4 recomposer$$ExternalSyntheticLambda4 = new Recomposer$$ExternalSyntheticLambda4(i, compositionImpl, mutableScatterSet);
            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = currentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot : null;
            if (mutableSnapshot == null || (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(cashApp$$ExternalSyntheticLambda2, recomposer$$ExternalSyntheticLambda4)) == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                Snapshot makeCurrent = takeNestedMutableSnapshot.makeCurrent();
                try {
                    synchronized (this.stateLock) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i3 = i; i3 < size2; i3++) {
                                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) list2.get(i3);
                                MutableScatterMap mutableScatterMap = this.movableContentRemoved;
                                movableContentStateReference.getClass();
                                Object m578removeLastimpl = MultiValueMap.m578removeLastimpl(mutableScatterMap);
                                arrayList.add(new Pair(movableContentStateReference, m578removeLastimpl));
                            }
                            int size3 = arrayList.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size3) {
                                    break;
                                }
                                Pair pair = (Pair) arrayList.get(i4);
                                if (pair.second == null) {
                                    WorkLauncherImpl workLauncherImpl = this.movableContentNestedStatesAvailable;
                                    ((MovableContentStateReference) pair.first).getClass();
                                    if (((MutableScatterMap) workLauncherImpl.processor).contains(null)) {
                                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i5 = 0; i5 < size4; i5++) {
                                            Pair pair2 = (Pair) arrayList.get(i5);
                                            if (pair2.second == null) {
                                                WorkLauncherImpl workLauncherImpl2 = this.movableContentNestedStatesAvailable;
                                                ((MovableContentStateReference) pair2.first).getClass();
                                                MutableScatterMap mutableScatterMap2 = (MutableScatterMap) workLauncherImpl2.processor;
                                                if (mutableScatterMap2.isEmpty()) {
                                                    ((MutableScatterMap) workLauncherImpl2.workTaskExecutor).clear();
                                                }
                                            }
                                            arrayList2.add(pair2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i4++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size5) {
                            break;
                        }
                        if (((Pair) arrayList.get(i6)).second != null) {
                            break;
                        }
                        i6++;
                    }
                    compositionImpl.insertMovableContent(arrayList);
                    Snapshot.restoreCurrent(makeCurrent);
                    applyAndCheck(takeNestedMutableSnapshot);
                    i = 0;
                } catch (Throwable th) {
                    Snapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            } catch (Throwable th2) {
                applyAndCheck(takeNestedMutableSnapshot);
                throw th2;
            }
        }
        return CollectionsKt.toList(hashMap.keySet());
    }

    public final CompositionImpl performRecompose(CompositionImpl compositionImpl, MutableScatterSet mutableScatterSet) {
        MutableSnapshot takeNestedMutableSnapshot;
        if (compositionImpl.composer.isComposing || compositionImpl.state == 3) {
            return null;
        }
        MutableScatterSet mutableScatterSet2 = this.compositionsRemoved;
        if (mutableScatterSet2 == null || !mutableScatterSet2.contains(compositionImpl)) {
            CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = new CashApp$$ExternalSyntheticLambda2(compositionImpl, 11);
            Recomposer$$ExternalSyntheticLambda4 recomposer$$ExternalSyntheticLambda4 = new Recomposer$$ExternalSyntheticLambda4(0, compositionImpl, mutableScatterSet);
            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = currentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) currentSnapshot : null;
            if (mutableSnapshot == null || (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(cashApp$$ExternalSyntheticLambda2, recomposer$$ExternalSyntheticLambda4)) == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    Snapshot makeCurrent = takeNestedMutableSnapshot.makeCurrent();
                    if (mutableScatterSet != null) {
                        try {
                            if (mutableScatterSet.isNotEmpty()) {
                                ComponentRegistry$Builder$$ExternalSyntheticLambda3 componentRegistry$Builder$$ExternalSyntheticLambda3 = new ComponentRegistry$Builder$$ExternalSyntheticLambda3(9, mutableScatterSet, compositionImpl);
                                GapComposer gapComposer = compositionImpl.composer;
                                if (gapComposer.isComposing) {
                                    ComposerKt.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
                                }
                                gapComposer.isComposing = true;
                                try {
                                    componentRegistry$Builder$$ExternalSyntheticLambda3.invoke();
                                    gapComposer.isComposing = false;
                                } catch (Throwable th) {
                                    gapComposer.isComposing = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            Snapshot.restoreCurrent(makeCurrent);
                            throw th2;
                        }
                    }
                    boolean recompose = compositionImpl.recompose();
                    Snapshot.restoreCurrent(makeCurrent);
                    if (recompose) {
                        return compositionImpl;
                    }
                } finally {
                    applyAndCheck(takeNestedMutableSnapshot);
                }
            }
        }
        return null;
    }

    public final void processCompositionError(Throwable th, CompositionImpl compositionImpl) {
        if (!((Boolean) _hotReloadEnabled.get()).booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                Utils_androidKt.logError("Error was captured in composition.", th);
                RecomposerErrorState recomposerErrorState = (RecomposerErrorState) this.errorState.getValue();
                if (recomposerErrorState != null) {
                    throw recomposerErrorState.getCause();
                }
                StateFlowImpl stateFlowImpl = this.errorState;
                RecomposerErrorState recomposerErrorState2 = new RecomposerErrorState(th);
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, recomposerErrorState2);
            }
            throw th;
        }
        synchronized (this.stateLock) {
            try {
                Utils_androidKt.logError("Error was captured in composition while live edit was enabled.", th);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new MutableScatterSet();
                this.movableContentAwaitingInsert.clear();
                this.movableContentRemoved.clear();
                this.movableContentStatesAvailable.clear();
                StateFlowImpl stateFlowImpl2 = this.errorState;
                RecomposerErrorState recomposerErrorState3 = new RecomposerErrorState(th);
                stateFlowImpl2.getClass();
                stateFlowImpl2.updateState(null, recomposerErrorState3);
                if (compositionImpl != null) {
                    recordFailedCompositionLocked(compositionImpl);
                }
                if (deriveStateLocked() != null) {
                    ComposerKt.composeImmediateRuntimeError("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final MutableScatterSet recomposePaused$runtime(CompositionImpl compositionImpl, ShouldPauseCallback shouldPauseCallback, MutableScatterSet mutableScatterSet) {
        GrpcMethod grpcMethod = this.pausedScopes;
        try {
            recordComposerModifications();
            compositionImpl.recordModificationsOf(new ScatterSetWrapper(mutableScatterSet));
            ShouldPauseCallback shouldPauseCallback2 = compositionImpl.shouldPause;
            compositionImpl.shouldPause = shouldPauseCallback;
            try {
                CompositionImpl performRecompose = performRecompose(compositionImpl, null);
                if (performRecompose != null) {
                    performInitialMovableContentInserts(compositionImpl);
                    performRecompose.applyChanges();
                    performRecompose.applyLateChanges();
                }
                MutableScatterSet mutableScatterSet2 = (MutableScatterSet) grpcMethod.get();
                if (mutableScatterSet2 == null) {
                    mutableScatterSet2 = ScatterSetKt.EmptyScatterSet;
                    mutableScatterSet2.getClass();
                }
                return mutableScatterSet2;
            } finally {
                compositionImpl.shouldPause = shouldPauseCallback2;
            }
        } finally {
            grpcMethod.set(null);
        }
    }

    public final boolean recordComposerModifications() {
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            List knownCompositionsLocked = knownCompositionsLocked();
            ScatterSetWrapper scatterSetWrapper = new ScatterSetWrapper(this.snapshotInvalidations);
            this.snapshotInvalidations = new MutableScatterSet();
            try {
                int size = knownCompositionsLocked.size();
                for (int i = 0; i < size; i++) {
                    ((CompositionImpl) knownCompositionsLocked.get(i)).recordModificationsOf(scatterSetWrapper);
                    if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    MutableScatterSet mutableScatterSet = this.snapshotInvalidations;
                    mutableScatterSet.getClass();
                    Iterator<E> it = scatterSetWrapper.iterator();
                    while (it.hasNext()) {
                        mutableScatterSet.plusAssign(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void recordFailedCompositionLocked(CompositionImpl compositionImpl) {
        ArrayList arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(compositionImpl)) {
            arrayList.add(compositionImpl);
        }
        if (this._knownCompositions.remove(compositionImpl)) {
            this._knownCompositionsCache = null;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void recordInspectionTable$runtime(Set set) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void reportPausedScope$runtime(RecomposeScopeImpl recomposeScopeImpl) {
        GrpcMethod grpcMethod = this.pausedScopes;
        MutableScatterSet mutableScatterSet = (MutableScatterSet) grpcMethod.get();
        if (mutableScatterSet == null) {
            MutableScatterSet mutableScatterSet2 = ScatterSetKt.EmptyScatterSet;
            mutableScatterSet = new MutableScatterSet();
            grpcMethod.set(mutableScatterSet);
        }
        mutableScatterSet.add(recomposeScopeImpl);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void reportRemovedComposition$runtime(CompositionImpl compositionImpl) {
        synchronized (this.stateLock) {
            try {
                MutableScatterSet mutableScatterSet = this.compositionsRemoved;
                if (mutableScatterSet == null) {
                    MutableScatterSet mutableScatterSet2 = ScatterSetKt.EmptyScatterSet;
                    mutableScatterSet = new MutableScatterSet();
                    this.compositionsRemoved = mutableScatterSet;
                }
                mutableScatterSet.add(compositionImpl);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object runRecomposeAndApplyChanges(SuspendLambda suspendLambda) {
        Object withContext = JobKt.withContext(this.broadcastFrameClock, new Recomposer$recompositionRunner$2(this, new Recomposer$runRecomposeAndApplyChanges$2(this, null), Updater.getMonotonicFrameClock(suspendLambda.getContext()), null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (withContext != coroutineSingletons) {
            withContext = Unit.INSTANCE;
        }
        return withContext == coroutineSingletons ? withContext : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final CancellationHandle scheduleFrameEndCallback(KeyHandle$keyPair$2 keyHandle$keyPair$2) {
        GrpcMethod grpcMethod = this.nextFrameEndCallbackQueue;
        return ((ComponentRegistry.Builder) grpcMethod.requestAdapter).addAwaiter(new NextFrameEndCallbackQueue$NextFrameEndAwaiter(keyHandle$keyPair$2), (ComponentRegistry$Builder$$ExternalSyntheticLambda3) grpcMethod.responseAdapter);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void unregisterComposition$runtime(CompositionImpl compositionImpl) {
        synchronized (this.stateLock) {
            if (this._knownCompositions.remove(compositionImpl)) {
                this._knownCompositionsCache = null;
            }
            this.compositionInvalidations.remove(compositionImpl);
            this.compositionsAwaitingApply.remove(compositionImpl);
        }
    }
}
