package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {540, 551}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
/* loaded from: classes.dex */
final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, Continuation<? super Recomposer$runRecomposeAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, continuation);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0145  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0127 -> B:6:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0132 -> B:7:0x0140). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MonotonicFrameClock monotonicFrameClock;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        IdentityArraySet identityArraySet;
        IdentityArraySet identityArraySet2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        LinkedHashSet linkedHashSet3;
        LinkedHashSet linkedHashSet4;
        IdentityArraySet identityArraySet3;
        boolean recordComposerModifications;
        boolean shouldKeepRecomposing;
        Object awaitWorkAvailable;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        char c = 2;
        int i2 = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            monotonicFrameClock = (MonotonicFrameClock) this.L$0;
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            linkedHashSet = new LinkedHashSet();
            linkedHashSet2 = new LinkedHashSet();
            identityArraySet = new IdentityArraySet();
            identityArraySet2 = new IdentityArraySet();
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
            }
        } else if (i == 1) {
            IdentityArraySet identityArraySet4 = (IdentityArraySet) this.L$7;
            IdentityArraySet identityArraySet5 = (IdentityArraySet) this.L$6;
            ?? r6 = (Set) this.L$5;
            ?? r7 = (Set) this.L$4;
            ?? r8 = (List) this.L$3;
            ?? r9 = (List) this.L$2;
            ?? r10 = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock2 = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure(obj);
            linkedHashSet3 = r7;
            arrayList6 = r8;
            arrayList4 = r9;
            arrayList5 = r10;
            identityArraySet3 = identityArraySet4;
            identityArraySet = identityArraySet5;
            monotonicFrameClock = monotonicFrameClock2;
            linkedHashSet4 = r6;
            recordComposerModifications = this.this$0.recordComposerModifications();
            if (recordComposerModifications) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            IdentityArraySet identityArraySet6 = (IdentityArraySet) this.L$7;
            IdentityArraySet identityArraySet7 = (IdentityArraySet) this.L$6;
            ?? r62 = (Set) this.L$5;
            ?? r72 = (Set) this.L$4;
            ?? r82 = (List) this.L$3;
            ?? r92 = (List) this.L$2;
            ?? r102 = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock3 = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList7 = r82;
            arrayList4 = r92;
            linkedHashSet2 = r62;
            linkedHashSet = r72;
            Object obj2 = coroutine_suspended;
            char c2 = 2;
            identityArraySet2 = identityArraySet6;
            monotonicFrameClock = monotonicFrameClock3;
            identityArraySet = identityArraySet7;
            arrayList = r102;
            this.this$0.discardUnusedValues();
            coroutine_suspended = obj2;
            c = c2;
            arrayList2 = arrayList4;
            arrayList3 = arrayList7;
            i2 = 1;
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
                this.L$0 = monotonicFrameClock;
                this.L$1 = arrayList;
                this.L$2 = arrayList2;
                this.L$3 = arrayList3;
                this.L$4 = linkedHashSet;
                this.L$5 = linkedHashSet2;
                this.L$6 = identityArraySet;
                this.L$7 = identityArraySet2;
                this.label = i2;
                awaitWorkAvailable = this.this$0.awaitWorkAvailable(this);
                if (awaitWorkAvailable == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList5 = arrayList;
                arrayList4 = arrayList2;
                arrayList6 = arrayList3;
                linkedHashSet3 = linkedHashSet;
                IdentityArraySet identityArraySet8 = identityArraySet2;
                linkedHashSet4 = linkedHashSet2;
                identityArraySet3 = identityArraySet8;
                recordComposerModifications = this.this$0.recordComposerModifications();
                if (recordComposerModifications) {
                    arrayList7 = arrayList6;
                    LinkedHashSet linkedHashSet5 = linkedHashSet4;
                    identityArraySet2 = identityArraySet3;
                    linkedHashSet2 = linkedHashSet5;
                    linkedHashSet = linkedHashSet3;
                    coroutine_suspended = coroutine_suspended;
                    c = c;
                    arrayList = arrayList5;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList7;
                    i2 = 1;
                    shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                    if (!shouldKeepRecomposing) {
                    }
                } else {
                    final Recomposer recomposer = this.this$0;
                    final IdentityArraySet identityArraySet9 = identityArraySet;
                    final IdentityArraySet identityArraySet10 = identityArraySet3;
                    IdentityArraySet identityArraySet11 = identityArraySet3;
                    final ArrayList arrayList8 = arrayList5;
                    IdentityArraySet identityArraySet12 = identityArraySet;
                    final ArrayList arrayList9 = arrayList4;
                    final LinkedHashSet linkedHashSet6 = linkedHashSet4;
                    final LinkedHashSet linkedHashSet7 = linkedHashSet3;
                    Object obj3 = coroutine_suspended;
                    LinkedHashSet linkedHashSet8 = linkedHashSet3;
                    final ArrayList arrayList10 = arrayList6;
                    arrayList7 = arrayList6;
                    this.L$0 = monotonicFrameClock;
                    this.L$1 = arrayList5;
                    this.L$2 = arrayList4;
                    this.L$3 = arrayList7;
                    this.L$4 = linkedHashSet8;
                    linkedHashSet2 = linkedHashSet6;
                    this.L$5 = linkedHashSet2;
                    this.L$6 = identityArraySet12;
                    identityArraySet2 = identityArraySet11;
                    this.L$7 = identityArraySet2;
                    c2 = 2;
                    this.label = 2;
                    Object withFrameNanos = monotonicFrameClock.withFrameNanos(new Function1<Long, Unit>() { // from class: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                            invoke(l.longValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(long j) {
                            boolean hasBroadcastFrameClockAwaiters;
                            Object beginSection;
                            List performInsertValues;
                            ControlledComposition performRecompose;
                            BroadcastFrameClock broadcastFrameClock;
                            hasBroadcastFrameClockAwaiters = Recomposer.this.getHasBroadcastFrameClockAwaiters();
                            if (hasBroadcastFrameClockAwaiters) {
                                Recomposer recomposer2 = Recomposer.this;
                                beginSection = Trace.INSTANCE.beginSection("Recomposer:animation");
                                try {
                                    broadcastFrameClock = recomposer2.broadcastFrameClock;
                                    broadcastFrameClock.sendFrame(j);
                                    Snapshot.INSTANCE.sendApplyNotifications();
                                    Unit unit = Unit.INSTANCE;
                                } finally {
                                }
                            }
                            Recomposer recomposer3 = Recomposer.this;
                            IdentityArraySet<Object> identityArraySet13 = identityArraySet9;
                            IdentityArraySet<ControlledComposition> identityArraySet14 = identityArraySet10;
                            List<ControlledComposition> list = arrayList8;
                            List<MovableContentStateReference> list2 = arrayList9;
                            Set<ControlledComposition> set = linkedHashSet7;
                            List<ControlledComposition> list3 = arrayList10;
                            Set<ControlledComposition> set2 = linkedHashSet6;
                            beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
                            try {
                                recomposer3.recordComposerModifications();
                                synchronized (recomposer3.stateLock) {
                                    List list4 = recomposer3.compositionInvalidations;
                                    int size = list4.size();
                                    for (int i3 = 0; i3 < size; i3++) {
                                        list.add((ControlledComposition) list4.get(i3));
                                    }
                                    recomposer3.compositionInvalidations.clear();
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                identityArraySet13.clear();
                                identityArraySet14.clear();
                                while (true) {
                                    if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                                        break;
                                    }
                                    try {
                                        try {
                                            int size2 = list.size();
                                            for (int i4 = 0; i4 < size2; i4++) {
                                                ControlledComposition controlledComposition = list.get(i4);
                                                identityArraySet14.add(controlledComposition);
                                                performRecompose = recomposer3.performRecompose(controlledComposition, identityArraySet13);
                                                if (performRecompose != null) {
                                                    list3.add(performRecompose);
                                                }
                                            }
                                            list.clear();
                                            if (identityArraySet13.isNotEmpty()) {
                                                synchronized (recomposer3.stateLock) {
                                                    List knownCompositions = recomposer3.getKnownCompositions();
                                                    int size3 = knownCompositions.size();
                                                    for (int i5 = 0; i5 < size3; i5++) {
                                                        ControlledComposition controlledComposition2 = (ControlledComposition) knownCompositions.get(i5);
                                                        if (!identityArraySet14.contains(controlledComposition2) && controlledComposition2.observesAnyOf(identityArraySet13)) {
                                                            list.add(controlledComposition2);
                                                        }
                                                    }
                                                    Unit unit3 = Unit.INSTANCE;
                                                }
                                            }
                                            if (list.isEmpty()) {
                                                try {
                                                    Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list2, recomposer3);
                                                    while (!list2.isEmpty()) {
                                                        performInsertValues = recomposer3.performInsertValues(list2, identityArraySet13);
                                                        CollectionsKt.addAll(set, performInsertValues);
                                                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list2, recomposer3);
                                                    }
                                                } catch (Exception e) {
                                                    Recomposer.processCompositionError$default(recomposer3, e, null, true, 2, null);
                                                    Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet13, identityArraySet14);
                                                    return;
                                                }
                                            }
                                        } catch (Exception e2) {
                                            Recomposer.processCompositionError$default(recomposer3, e2, null, true, 2, null);
                                            Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet13, identityArraySet14);
                                            list.clear();
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        list.clear();
                                        throw th;
                                    }
                                }
                                if (!list3.isEmpty()) {
                                    recomposer3.changeCount = recomposer3.getChangeCount() + 1;
                                    try {
                                        int size4 = list3.size();
                                        for (int i6 = 0; i6 < size4; i6++) {
                                            set2.add(list3.get(i6));
                                        }
                                        int size5 = list3.size();
                                        for (int i7 = 0; i7 < size5; i7++) {
                                            list3.get(i7).applyChanges();
                                        }
                                    } catch (Exception e3) {
                                        Recomposer.processCompositionError$default(recomposer3, e3, null, false, 6, null);
                                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet13, identityArraySet14);
                                        return;
                                    } finally {
                                        list3.clear();
                                    }
                                }
                                try {
                                    if (!set.isEmpty()) {
                                        try {
                                            CollectionsKt.addAll(set2, set);
                                            Iterator<T> it = set.iterator();
                                            while (it.hasNext()) {
                                                ((ControlledComposition) it.next()).applyLateChanges();
                                            }
                                        } catch (Exception e4) {
                                            Recomposer.processCompositionError$default(recomposer3, e4, null, false, 6, null);
                                            Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet13, identityArraySet14);
                                            set.clear();
                                            return;
                                        }
                                    }
                                    try {
                                        if (!set2.isEmpty()) {
                                            try {
                                                Iterator<T> it2 = set2.iterator();
                                                while (it2.hasNext()) {
                                                    ((ControlledComposition) it2.next()).changesApplied();
                                                }
                                            } catch (Exception e5) {
                                                Recomposer.processCompositionError$default(recomposer3, e5, null, false, 6, null);
                                                Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet13, identityArraySet14);
                                                set2.clear();
                                                return;
                                            }
                                        }
                                        synchronized (recomposer3.stateLock) {
                                            recomposer3.deriveStateLocked();
                                        }
                                        Snapshot.INSTANCE.notifyObjectsInitialized();
                                        identityArraySet14.clear();
                                        identityArraySet13.clear();
                                        recomposer3.compositionsRemoved = null;
                                        Unit unit4 = Unit.INSTANCE;
                                    } finally {
                                        set2.clear();
                                    }
                                } finally {
                                    set.clear();
                                }
                            } finally {
                            }
                        }
                    }, this);
                    obj2 = obj3;
                    if (withFrameNanos == obj2) {
                        return obj2;
                    }
                    linkedHashSet = linkedHashSet8;
                    identityArraySet = identityArraySet12;
                    arrayList = arrayList5;
                    this.this$0.discardUnusedValues();
                    coroutine_suspended = obj2;
                    c = c2;
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList7;
                    i2 = 1;
                    shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                    if (!shouldKeepRecomposing) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$clearRecompositionState(List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, Set<ControlledComposition> set, Set<ControlledComposition> set2, IdentityArraySet<Object> identityArraySet, IdentityArraySet<ControlledComposition> identityArraySet2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
        identityArraySet.clear();
        identityArraySet2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
        List list2;
        List list3;
        list.clear();
        synchronized (recomposer.stateLock) {
            list2 = recomposer.compositionValuesAwaitingInsert;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((MovableContentStateReference) list2.get(i));
            }
            list3 = recomposer.compositionValuesAwaitingInsert;
            list3.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
