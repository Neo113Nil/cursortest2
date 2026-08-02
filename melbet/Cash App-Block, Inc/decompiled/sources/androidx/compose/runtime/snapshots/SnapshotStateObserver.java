package androidx.compose.runtime.snapshots;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer$derivedStateObserver$1;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.molecule.PlatformKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public Snapshot$Companion$$ExternalSyntheticLambda0 applyUnsubscribe;
    public ObservedScopeMap currentMap;
    public final Function1 onChangedExecutor;
    public boolean sendingNotifications;
    public final AtomicReference pendingChanges = new AtomicReference(null);
    public final ComposerKt$$ExternalSyntheticLambda0 applyObserver = new ComposerKt$$ExternalSyntheticLambda0(this, 8);
    public final CashApp$$ExternalSyntheticLambda2 readObserver = new CashApp$$ExternalSyntheticLambda2(this, 15);
    public final MutableVector observedScopeMaps = new MutableVector(0, new ObservedScopeMap[16]);
    public final Object observedScopeMapsLock = new Object();
    public long currentMapThreadId = -1;

    public final class ObservedScopeMap {
        public Object currentScope;
        public MutableObjectIntMap currentScopeReads;
        public int deriveStateScopeCount;
        public final Function1 onChanged;
        public boolean readingDerivedStates;
        public int currentToken = -1;
        public final MutableScatterMap valueToScopes = PlatformKt.m1339constructorimpl$default();
        public final MutableScatterMap scopeToValues = new MutableScatterMap();
        public final MutableScatterSet invalidated = new MutableScatterSet();
        public final MutableVector statesToReread = new MutableVector(0, new DerivedSnapshotState[16]);
        public final GapComposer$derivedStateObserver$1 derivedStateObserver = new GapComposer$derivedStateObserver$1(this, 1);
        public final MutableScatterMap dependencyToDerivedStates = PlatformKt.m1339constructorimpl$default();
        public final HashMap recordedDerivedStateValues = new HashMap();

        public ObservedScopeMap(Function1 function1) {
            this.onChanged = function1;
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
            */
        public final boolean recordInvalidation(java.util.Set r46) {
            /*
                Method dump skipped, instructions count: 1678
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.recordInvalidation(java.util.Set):boolean");
        }

        public final void recordRead(Object obj, int i, Object obj2, MutableObjectIntMap mutableObjectIntMap) {
            int i2;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int findIndex = mutableObjectIntMap.findIndex(obj);
            if (findIndex < 0) {
                findIndex = ~findIndex;
                i2 = -1;
            } else {
                i2 = mutableObjectIntMap.values[findIndex];
            }
            mutableObjectIntMap.keys[findIndex] = obj;
            mutableObjectIntMap.values[findIndex] = i;
            if ((obj instanceof DerivedSnapshotState) && i2 != i) {
                DerivedSnapshotState.ResultRecord currentRecord = ((DerivedSnapshotState) obj).getCurrentRecord();
                this.recordedDerivedStateValues.put(obj, currentRecord.result);
                MutableObjectIntMap mutableObjectIntMap2 = currentRecord.dependencies;
                MutableScatterMap mutableScatterMap = this.dependencyToDerivedStates;
                PlatformKt.m1343removeScopeimpl(mutableScatterMap, obj);
                Object[] objArr = mutableObjectIntMap2.keys;
                long[] jArr = mutableObjectIntMap2.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j & 255) < 128) {
                                    StateObject stateObject = (StateObject) objArr[(i3 << 3) + i5];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ((StateObjectImpl) stateObject).m583recordReadInh_f27i8$runtime(2);
                                    }
                                    PlatformKt.m1338addimpl(mutableScatterMap, stateObject, obj);
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
            }
            if (i2 == -1) {
                if (obj instanceof StateObjectImpl) {
                    ((StateObjectImpl) obj).m583recordReadInh_f27i8$runtime(2);
                }
                PlatformKt.m1338addimpl(this.valueToScopes, obj, obj2);
            }
        }

        public final void removeObservation(Object obj, Object obj2) {
            MutableScatterMap mutableScatterMap = this.valueToScopes;
            PlatformKt.m1342removeimpl(mutableScatterMap, obj2, obj);
            if (!(obj2 instanceof DerivedSnapshotState) || mutableScatterMap.containsKey(obj2)) {
                return;
            }
            PlatformKt.m1343removeScopeimpl(this.dependencyToDerivedStates, obj2);
            this.recordedDerivedStateValues.remove(obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void removeScopeIf() {
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
            long[] jArr;
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12;
            long[] jArr2;
            long j;
            char c;
            long j2;
            int i;
            Boolean bool;
            long j3;
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE$6;
            MutableScatterMap mutableScatterMap = this.scopeToValues;
            long[] jArr3 = mutableScatterMap.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j4 = jArr3[i2];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j4 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            c = c2;
                            Object obj = mutableScatterMap.keys[i6];
                            j2 = j5;
                            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) mutableScatterMap.values[i6];
                            Boolean bool2 = (Boolean) ownerSnapshotObserver$onCommitAffectingLayout$13.invoke(obj);
                            if (bool2.booleanValue()) {
                                Object[] objArr = mutableObjectIntMap.keys;
                                int i7 = i3;
                                int[] iArr = mutableObjectIntMap.values;
                                long[] jArr4 = mutableObjectIntMap.metadata;
                                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                j = j4;
                                if (length2 >= 0) {
                                    int i8 = 0;
                                    while (true) {
                                        long j6 = jArr4[i8];
                                        long[] jArr5 = jArr4;
                                        bool = bool2;
                                        if ((((~j6) << c) & j6 & j2) != j2) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j6 & 255) < 128) {
                                                    int i11 = (i8 << 3) + i10;
                                                    j3 = j6;
                                                    Object obj2 = objArr[i11];
                                                    int i12 = iArr[i11];
                                                    removeObservation(obj, obj2);
                                                } else {
                                                    j3 = j6;
                                                }
                                                j6 = j3 >> i7;
                                            }
                                            if (i9 != i7) {
                                                break;
                                            }
                                        }
                                        if (i8 == length2) {
                                            break;
                                        }
                                        i8++;
                                        bool2 = bool;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                    if (bool.booleanValue()) {
                                        mutableScatterMap.removeValueAt(i6);
                                    }
                                    i = 8;
                                }
                            } else {
                                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                                jArr2 = jArr3;
                                j = j4;
                            }
                            bool = bool2;
                            if (bool.booleanValue()) {
                            }
                            i = 8;
                        } else {
                            ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                            jArr2 = jArr3;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i = i3;
                        }
                        i5++;
                        i3 = i;
                        j4 = j >> i;
                        c2 = c;
                        j5 = j2;
                        ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        jArr3 = jArr2;
                    }
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                jArr3 = jArr;
            }
        }
    }

    public SnapshotStateObserver(Function1 function1) {
        this.onChangedExecutor = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080 A[Catch: all -> 0x008e, TryCatch #0 {all -> 0x008e, blocks: (B:4:0x0007, B:8:0x0011, B:11:0x0078, B:13:0x0080, B:15:0x0090, B:17:0x0085, B:20:0x0021, B:23:0x002d, B:25:0x0041, B:27:0x004f, B:29:0x0059, B:31:0x0069, B:39:0x0074, B:42:0x0094), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void clear(Object obj) {
        int i;
        int i2;
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector mutableVector = this.observedScopeMaps;
                int i3 = mutableVector.size;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Object[] objArr = mutableVector.content;
                    if (i4 < i3) {
                        ObservedScopeMap observedScopeMap = (ObservedScopeMap) objArr[i4];
                        MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) observedScopeMap.scopeToValues.remove(obj);
                        if (mutableObjectIntMap != null) {
                            Object[] objArr2 = mutableObjectIntMap.keys;
                            int[] iArr = mutableObjectIntMap.values;
                            long[] jArr = mutableObjectIntMap.metadata;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    i = i4;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                                        int i8 = 0;
                                        while (i8 < i7) {
                                            if ((j & 255) < 128) {
                                                int i9 = (i6 << 3) + i8;
                                                i2 = i8;
                                                Object obj2 = objArr2[i9];
                                                int i10 = iArr[i9];
                                                observedScopeMap.removeObservation(obj, obj2);
                                            } else {
                                                i2 = i8;
                                            }
                                            j >>= 8;
                                            i8 = i2 + 1;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                    }
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                    i4 = i;
                                }
                                if (observedScopeMap.scopeToValues.isNotEmpty()) {
                                    i5++;
                                } else if (i5 > 0) {
                                    Object[] objArr3 = mutableVector.content;
                                    objArr3[i - i5] = objArr3[i];
                                }
                                i4 = i + 1;
                            }
                        }
                        i = i4;
                        if (observedScopeMap.scopeToValues.isNotEmpty()) {
                        }
                        i4 = i + 1;
                    } else {
                        int i11 = i3 - i5;
                        Arrays.fill(objArr, i11, i3, (Object) null);
                        mutableVector.size = i11;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean drainChanges() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.observedScopeMapsLock) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.pendingChanges;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        ComposerKt.composeRuntimeError("Unexpected notification");
                        OptionalProvider$$ExternalSyntheticLambda0.m$1();
                        return false;
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.observedScopeMapsLock) {
                MutableVector mutableVector = this.observedScopeMaps;
                Object[] objArr = mutableVector.content;
                int i = mutableVector.size;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((ObservedScopeMap) objArr[i2]).recordInvalidation(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void observeReads(Object obj, Function1 function1, Function0 function0) {
        ?? r6;
        Object obj2;
        ObservedScopeMap observedScopeMap;
        boolean z;
        ObservedScopeMap observedScopeMap2;
        long j;
        long j2;
        ObservedScopeMap observedScopeMap3;
        Snapshot transparentObserverMutableSnapshot;
        long j3;
        MutableObjectIntMap mutableObjectIntMap;
        int i;
        long j4;
        MutableObjectIntMap mutableObjectIntMap2;
        long currentThreadId = Expect_jvmKt.currentThreadId();
        synchronized (this.observedScopeMapsLock) {
            r6 = this.observedScopeMaps;
            Object[] objArr = r6.content;
            int i2 = r6.size;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((ObservedScopeMap) obj2).onChanged == function1) {
                    break;
                } else {
                    i3++;
                }
            }
            observedScopeMap = (ObservedScopeMap) obj2;
            z = true;
            if (observedScopeMap == null) {
                function1.getClass();
                TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, function1);
                observedScopeMap = new ObservedScopeMap(function1);
                r6.add(observedScopeMap);
            }
            observedScopeMap2 = this.currentMap;
            j = this.currentMapThreadId;
        }
        long j5 = r6;
        if (j != -1) {
            j5 = r6;
            if (j != currentThreadId) {
                StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
                m1149m.append(currentThreadId);
                m1149m.append(", name=");
                m1149m.append(Thread.currentThread().getName());
                m1149m.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                PreconditionsKt.throwIllegalArgumentException(m1149m.toString());
                j5 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
            }
        }
        try {
            synchronized (this.observedScopeMapsLock) {
                try {
                    this.currentMap = observedScopeMap;
                    this.currentMapThreadId = currentThreadId;
                } catch (Throwable th) {
                    th = th;
                    j2 = j5;
                }
            }
            CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = this.readObserver;
            Object obj3 = observedScopeMap.currentScope;
            MutableObjectIntMap mutableObjectIntMap3 = observedScopeMap.currentScopeReads;
            int i4 = observedScopeMap.currentToken;
            observedScopeMap.currentScope = obj;
            observedScopeMap.currentScopeReads = (MutableObjectIntMap) observedScopeMap.scopeToValues.get(obj);
            if (observedScopeMap.currentToken == -1) {
                observedScopeMap.currentToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            }
            GapComposer$derivedStateObserver$1 gapComposer$derivedStateObserver$1 = observedScopeMap.derivedStateObserver;
            MutableVector derivedStateObservers = Updater.derivedStateObservers();
            try {
                derivedStateObservers.add(gapComposer$derivedStateObserver$1);
                if (cashApp$$ExternalSyntheticLambda2 == null) {
                    function0.invoke();
                    observedScopeMap3 = observedScopeMap;
                } else {
                    Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
                    if (snapshot instanceof TransparentObserverMutableSnapshot) {
                        observedScopeMap3 = observedScopeMap;
                        if (((TransparentObserverMutableSnapshot) snapshot).threadId == Expect_jvmKt.currentThreadId()) {
                            Function1 function12 = ((TransparentObserverMutableSnapshot) snapshot).readObserver;
                            Function1 function13 = ((TransparentObserverMutableSnapshot) snapshot).writeObserver;
                            try {
                                ((TransparentObserverMutableSnapshot) snapshot).readObserver = SnapshotKt.mergedReadObserver(cashApp$$ExternalSyntheticLambda2, function12, true);
                                ((TransparentObserverMutableSnapshot) snapshot).writeObserver = function13;
                                function0.invoke();
                                ((TransparentObserverMutableSnapshot) snapshot).readObserver = function12;
                                ((TransparentObserverMutableSnapshot) snapshot).writeObserver = function13;
                            } catch (Throwable th2) {
                                ((TransparentObserverMutableSnapshot) snapshot).readObserver = function12;
                                ((TransparentObserverMutableSnapshot) snapshot).writeObserver = function13;
                                throw th2;
                            }
                        }
                    } else {
                        observedScopeMap3 = observedScopeMap;
                    }
                    if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                        transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, cashApp$$ExternalSyntheticLambda2, null, true, false);
                    } else {
                        transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(cashApp$$ExternalSyntheticLambda2);
                    }
                    try {
                        Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                        try {
                            function0.invoke();
                            Snapshot.restoreCurrent(makeCurrent);
                            transparentObserverMutableSnapshot.dispose();
                        } catch (Throwable th3) {
                            try {
                                Snapshot.restoreCurrent(makeCurrent);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    transparentObserverMutableSnapshot.dispose();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    derivedStateObservers.removeAt(derivedStateObservers.size - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                derivedStateObservers.removeAt(derivedStateObservers.size - 1);
                ObservedScopeMap observedScopeMap4 = observedScopeMap3;
                Object obj4 = observedScopeMap4.currentScope;
                obj4.getClass();
                int i5 = observedScopeMap4.currentToken;
                MutableObjectIntMap mutableObjectIntMap4 = observedScopeMap4.currentScopeReads;
                if (mutableObjectIntMap4 != null) {
                    try {
                        long[] jArr = mutableObjectIntMap4.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j6 = jArr[i6];
                                boolean z2 = z;
                                MutableObjectIntMap mutableObjectIntMap5 = mutableObjectIntMap4;
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j6 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j6;
                                            mutableObjectIntMap2 = mutableObjectIntMap5;
                                            Object obj5 = mutableObjectIntMap2.keys[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = mutableObjectIntMap2.values[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    observedScopeMap4.removeObservation(obj4, obj5);
                                                }
                                                if (z3) {
                                                    mutableObjectIntMap2.removeValueAt(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.observedScopeMapsLock) {
                                                    this.currentMap = observedScopeMap2;
                                                    this.currentMapThreadId = j2;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j6;
                                            mutableObjectIntMap2 = mutableObjectIntMap5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j7 = j3;
                                        mutableObjectIntMap5 = mutableObjectIntMap2;
                                        j6 = j4 >> 8;
                                        j = j7;
                                    }
                                    mutableObjectIntMap = mutableObjectIntMap5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    mutableObjectIntMap = mutableObjectIntMap5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                mutableObjectIntMap4 = mutableObjectIntMap;
                                z = z2;
                                j = j3;
                            }
                            observedScopeMap4.currentScope = obj3;
                            observedScopeMap4.currentScopeReads = mutableObjectIntMap3;
                            observedScopeMap4.currentToken = i4;
                            synchronized (this.observedScopeMapsLock) {
                                this.currentMap = observedScopeMap2;
                                this.currentMapThreadId = j3;
                            }
                            return;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.observedScopeMapsLock) {
                        }
                    }
                }
                j3 = j;
                observedScopeMap4.currentScope = obj3;
                observedScopeMap4.currentScopeReads = mutableObjectIntMap3;
                observedScopeMap4.currentToken = i4;
                synchronized (this.observedScopeMapsLock) {
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public final void start() {
        ComposerKt$$ExternalSyntheticLambda0 composerKt$$ExternalSyntheticLambda0 = this.applyObserver;
        SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
        synchronized (SnapshotKt.lock) {
            SnapshotKt.applyObservers = CollectionsKt.plus((Collection) SnapshotKt.applyObservers, (Object) composerKt$$ExternalSyntheticLambda0);
        }
        this.applyUnsubscribe = new Snapshot$Companion$$ExternalSyntheticLambda0(composerKt$$ExternalSyntheticLambda0, 1);
    }

    public final void stop() {
        Snapshot$Companion$$ExternalSyntheticLambda0 snapshot$Companion$$ExternalSyntheticLambda0 = this.applyUnsubscribe;
        if (snapshot$Companion$$ExternalSyntheticLambda0 != null) {
            snapshot$Companion$$ExternalSyntheticLambda0.dispose();
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMapsLock) {
            MutableVector mutableVector = this.observedScopeMaps;
            Object[] objArr = mutableVector.content;
            int i = mutableVector.size;
            for (int i2 = 0; i2 < i; i2++) {
                ObservedScopeMap observedScopeMap = (ObservedScopeMap) objArr[i2];
                observedScopeMap.valueToScopes.clear();
                observedScopeMap.scopeToValues.clear();
                observedScopeMap.dependencyToDerivedStates.clear();
                observedScopeMap.recordedDerivedStateValues.clear();
            }
        }
    }
}
