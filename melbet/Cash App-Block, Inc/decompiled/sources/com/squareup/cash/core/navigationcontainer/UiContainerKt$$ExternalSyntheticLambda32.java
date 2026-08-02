package com.squareup.cash.core.navigationcontainer;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.MutableScatterSet;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot;
import androidx.compose.runtime.snapshots.TransparentObserverSnapshot;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.common.composeui.CashWindowInsets;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.ui.CashInsets;
import com.squareup.cash.ui.CashInsetsListener;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowKt__DelayKt$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final /* synthetic */ class UiContainerKt$$ExternalSyntheticLambda32 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ List f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;

    public /* synthetic */ UiContainerKt$$ExternalSyntheticLambda32(Recomposer recomposer, MutableScatterSet mutableScatterSet, MutableScatterSet mutableScatterSet2, List list, List list2, MutableScatterSet mutableScatterSet3, List list3, MutableScatterSet mutableScatterSet4, Set set) {
        this.f$0 = recomposer;
        this.f$1 = mutableScatterSet;
        this.f$2 = mutableScatterSet2;
        this.f$6 = list;
        this.f$3 = list2;
        this.f$4 = mutableScatterSet3;
        this.f$5 = list3;
        this.f$7 = mutableScatterSet4;
        this.f$8 = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean hasBroadcastFrameClockAwaitersLocked;
        Unit unit;
        Snapshot snapshot;
        char c;
        long j;
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                CashComposeInsets cashComposeInsets = (CashComposeInsets) this.f$0;
                WindowInsets windowInsets = (WindowInsets) this.f$1;
                WindowInsets windowInsets2 = (WindowInsets) this.f$2;
                Density density = (Density) this.f$3;
                NavigationModel.Ready.Location location = (NavigationModel.Ready.Location) this.f$4;
                UiFactory.ScreenUi screenUi = (UiFactory.ScreenUi) this.f$5;
                List list = this.f$6;
                WireAdapter wireAdapter = (WireAdapter) this.f$7;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.f$8;
                KeyEvent.Callback callback = (View) obj;
                callback.getClass();
                IntrinsicHeightReportingView intrinsicHeightReportingView = callback instanceof IntrinsicHeightReportingView ? (IntrinsicHeightReportingView) callback : null;
                if (intrinsicHeightReportingView != null) {
                    intrinsicHeightReportingView.setMaxHeight(parcelableSnapshotMutableIntState.getIntValue());
                }
                CashInsetsListener cashInsetsListener = callback instanceof CashInsetsListener ? (CashInsetsListener) callback : null;
                if (cashInsetsListener != null) {
                    CashWindowInsets cashWindowInsets = cashComposeInsets.cashFloatingBottomNavigation;
                    Pair pair = new Pair(cashWindowInsets.f1116type, cashWindowInsets.getInsets$compose_ui());
                    CashWindowInsets cashWindowInsets2 = cashComposeInsets.cashInlineBottomNavigation;
                    cashInsetsListener.onApplyCashInsets(CashInsets.Companion.of(pair, new Pair(cashWindowInsets2.f1116type, cashWindowInsets2.getInsets$compose_ui())));
                }
                StableSystemBarsInsetsView stableSystemBarsInsetsView = callback instanceof StableSystemBarsInsetsView ? (StableSystemBarsInsetsView) callback : null;
                if (stableSystemBarsInsetsView != null) {
                    windowInsets.getClass();
                    windowInsets2.getClass();
                    density.getClass();
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    Insets of = Insets.of(windowInsets.getLeft(density, layoutDirection), windowInsets.getTop(density), windowInsets.getRight(density, layoutDirection), windowInsets.getBottom(density));
                    Insets of2 = Insets.of(windowInsets2.getLeft(density, layoutDirection), windowInsets2.getTop(density), windowInsets2.getRight(density, layoutDirection), windowInsets2.getBottom(density));
                    if (!of.equals(stableSystemBarsInsetsView.stableStatusBarInsets) || !of2.equals(stableSystemBarsInsetsView.stableNavigationBarInsets)) {
                        stableSystemBarsInsetsView.stableStatusBarInsets = of;
                        stableSystemBarsInsetsView.stableNavigationBarInsets = of2;
                        stableSystemBarsInsetsView.requestApplyInsets();
                    }
                }
                UiContainerKt.launchUiBindingIfNeeded(location.getScope(), (UiFactory.ViewUi) screenUi, location.getScreen(), list, wireAdapter);
                return Unit.INSTANCE;
            default:
                Recomposer recomposer = (Recomposer) this.f$0;
                MutableScatterSet mutableScatterSet = (MutableScatterSet) this.f$1;
                MutableScatterSet mutableScatterSet2 = (MutableScatterSet) this.f$2;
                List list2 = this.f$6;
                List list3 = (List) this.f$3;
                mutableScatterSet2 = (MutableScatterSet) this.f$4;
                List list4 = (List) this.f$5;
                mutableScatterSet2 = (MutableScatterSet) this.f$7;
                Set set = (Set) this.f$8;
                long longValue = ((Long) obj).longValue();
                synchronized (recomposer.stateLock) {
                    hasBroadcastFrameClockAwaitersLocked = recomposer.getHasBroadcastFrameClockAwaitersLocked();
                }
                boolean z2 = 0;
                if (hasBroadcastFrameClockAwaitersLocked) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        recomposer.broadcastFrameClock.queue.flushAndDispatchAwaiters(new FlowKt__DelayKt$$ExternalSyntheticLambda0(longValue, 1));
                        synchronized (SnapshotKt.lock) {
                            MutableScatterSet mutableScatterSet3 = SnapshotKt.globalSnapshot.modified;
                            if (mutableScatterSet3 != null) {
                                z = mutableScatterSet3.isNotEmpty();
                            }
                        }
                        if (z) {
                            SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
                        }
                    } finally {
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    recomposer.recordComposerModifications();
                    synchronized (recomposer.stateLock) {
                        try {
                            MutableVector mutableVector = recomposer.compositionInvalidations;
                            Object[] objArr = mutableVector.content;
                            int i = mutableVector.size;
                            for (int i2 = 0; i2 < i; i2++) {
                                list2.add((CompositionImpl) objArr[i2]);
                            }
                            recomposer.compositionInvalidations.clear();
                        } finally {
                        }
                    }
                    mutableScatterSet.clear();
                    while (true) {
                        if (list2.isEmpty() && list3.isEmpty()) {
                            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
                            Snapshot transparentObserverMutableSnapshot = currentSnapshot instanceof MutableSnapshot ? new TransparentObserverMutableSnapshot((MutableSnapshot) currentSnapshot, null, null, true, false) : new TransparentObserverSnapshot(currentSnapshot, null, true, z2);
                            try {
                                Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                                try {
                                    if (!list4.isEmpty()) {
                                        recomposer.changeCount++;
                                        try {
                                            int size = list4.size();
                                            for (int i3 = z2; i3 < size; i3++) {
                                                mutableScatterSet2.add((CompositionImpl) list4.get(i3));
                                            }
                                            int size2 = list4.size();
                                            for (int i4 = z2; i4 < size2; i4++) {
                                                ((CompositionImpl) list4.get(i4)).applyChanges();
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                recomposer.processCompositionError(th, null);
                                                Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(recomposer, list2, list3, list4, mutableScatterSet2, mutableScatterSet2, mutableScatterSet, mutableScatterSet2);
                                                unit = Unit.INSTANCE;
                                                Snapshot.restoreCurrent(makeCurrent);
                                                return unit;
                                            } finally {
                                                list4.clear();
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    snapshot = makeCurrent;
                                    Snapshot.restoreCurrent(snapshot);
                                    throw th;
                                }
                                try {
                                    if (mutableScatterSet2.isNotEmpty()) {
                                        try {
                                            mutableScatterSet2.plusAssign(mutableScatterSet2);
                                            Object[] objArr2 = mutableScatterSet2.elements;
                                            long[] jArr = mutableScatterSet2.metadata;
                                            c = 7;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                int i5 = z2;
                                                j = 128;
                                                while (true) {
                                                    long j2 = jArr[i5];
                                                    Object[] objArr3 = objArr2;
                                                    snapshot = makeCurrent;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                                                        for (int i7 = 0; i7 < i6; i7++) {
                                                            if ((j2 & 255) < 128) {
                                                                try {
                                                                    ((CompositionImpl) objArr3[(i5 << 3) + i7]).applyLateChanges();
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    try {
                                                                        recomposer.processCompositionError(th, null);
                                                                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(recomposer, list2, list3, list4, mutableScatterSet2, mutableScatterSet2, mutableScatterSet, mutableScatterSet2);
                                                                        unit = Unit.INSTANCE;
                                                                        mutableScatterSet2.clear();
                                                                        Snapshot.restoreCurrent(snapshot);
                                                                        return unit;
                                                                    } finally {
                                                                    }
                                                                }
                                                            }
                                                            j2 >>= 8;
                                                        }
                                                        if (i6 != 8) {
                                                        }
                                                    }
                                                    if (i5 != length) {
                                                        i5++;
                                                        makeCurrent = snapshot;
                                                        objArr2 = objArr3;
                                                    }
                                                }
                                            } else {
                                                snapshot = makeCurrent;
                                                j = 128;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            snapshot = makeCurrent;
                                        }
                                    } else {
                                        snapshot = makeCurrent;
                                        c = 7;
                                        j = 128;
                                    }
                                    if (mutableScatterSet2.isNotEmpty()) {
                                        try {
                                            Object[] objArr4 = mutableScatterSet2.elements;
                                            long[] jArr2 = mutableScatterSet2.metadata;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i8 = 0;
                                                while (true) {
                                                    long j3 = jArr2[i8];
                                                    Object[] objArr5 = objArr4;
                                                    long[] jArr3 = jArr2;
                                                    if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        for (int i10 = 0; i10 < i9; i10++) {
                                                            if ((j3 & 255) < j) {
                                                                ((CompositionImpl) objArr5[(i8 << 3) + i10]).changesApplied();
                                                            }
                                                            j3 >>= 8;
                                                        }
                                                        if (i9 != 8) {
                                                        }
                                                    }
                                                    if (i8 != length2) {
                                                        i8++;
                                                        objArr4 = objArr5;
                                                        jArr2 = jArr3;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            try {
                                                recomposer.processCompositionError(th5, null);
                                                Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(recomposer, list2, list3, list4, mutableScatterSet2, mutableScatterSet2, mutableScatterSet, mutableScatterSet2);
                                                unit = Unit.INSTANCE;
                                                Snapshot.restoreCurrent(snapshot);
                                                return unit;
                                            } finally {
                                            }
                                        }
                                    }
                                    Snapshot.restoreCurrent(snapshot);
                                    transparentObserverMutableSnapshot.dispose();
                                    synchronized (recomposer.stateLock) {
                                        if (recomposer.deriveStateLocked() != null) {
                                            ComposerKt.composeImmediateRuntimeError("unexpected to get continuation here");
                                        }
                                    }
                                    SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime();
                                    mutableScatterSet2.clear();
                                    mutableScatterSet.clear();
                                    recomposer.compositionsRemoved = null;
                                    Trace.endSection();
                                    return Unit.INSTANCE;
                                } catch (Throwable th6) {
                                    th = th6;
                                    Snapshot.restoreCurrent(snapshot);
                                    throw th;
                                }
                            } finally {
                                transparentObserverMutableSnapshot.dispose();
                            }
                        }
                        try {
                            int size3 = list2.size();
                            for (int i11 = 0; i11 < size3; i11++) {
                                CompositionImpl compositionImpl = (CompositionImpl) list2.get(i11);
                                CompositionImpl performRecompose = recomposer.performRecompose(compositionImpl, mutableScatterSet);
                                if (performRecompose != null) {
                                    list4.add(performRecompose);
                                }
                                mutableScatterSet2.add(compositionImpl);
                            }
                            list2.clear();
                            if (mutableScatterSet.isNotEmpty() || recomposer.compositionInvalidations.size != 0) {
                                synchronized (recomposer.stateLock) {
                                    try {
                                        List knownCompositionsLocked = recomposer.knownCompositionsLocked();
                                        int size4 = knownCompositionsLocked.size();
                                        for (int i12 = 0; i12 < size4; i12++) {
                                            CompositionImpl compositionImpl2 = (CompositionImpl) knownCompositionsLocked.get(i12);
                                            if (!mutableScatterSet2.contains(compositionImpl2) && compositionImpl2.observesAnyOf(set)) {
                                                list2.add(compositionImpl2);
                                            }
                                        }
                                        MutableVector mutableVector2 = recomposer.compositionInvalidations;
                                        int i13 = mutableVector2.size;
                                        int i14 = 0;
                                        int i15 = 0;
                                        while (true) {
                                            Object[] objArr6 = mutableVector2.content;
                                            if (i14 < i13) {
                                                CompositionImpl compositionImpl3 = (CompositionImpl) objArr6[i14];
                                                if (!mutableScatterSet2.contains(compositionImpl3) && !list2.contains(compositionImpl3)) {
                                                    list2.add(compositionImpl3);
                                                    i15++;
                                                } else if (i15 > 0) {
                                                    Object[] objArr7 = mutableVector2.content;
                                                    objArr7[i14 - i15] = objArr7[i14];
                                                }
                                                i14++;
                                            } else {
                                                int i16 = i13 - i15;
                                                Arrays.fill(objArr6, i16, i13, (Object) null);
                                                mutableVector2.size = i16;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                            if (list2.isEmpty()) {
                                try {
                                    Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list3, recomposer);
                                    while (!list3.isEmpty()) {
                                        List performInsertValues = recomposer.performInsertValues(list3, mutableScatterSet);
                                        mutableScatterSet2.getClass();
                                        performInsertValues.getClass();
                                        Iterator it = performInsertValues.iterator();
                                        while (it.hasNext()) {
                                            mutableScatterSet2.plusAssign(it.next());
                                        }
                                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list3, recomposer);
                                    }
                                } catch (Throwable th7) {
                                    recomposer.processCompositionError(th7, null);
                                    Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(recomposer, list2, list3, list4, mutableScatterSet2, mutableScatterSet2, mutableScatterSet, mutableScatterSet2);
                                    unit = Unit.INSTANCE;
                                    return unit;
                                }
                            }
                            z2 = 0;
                        } catch (Throwable th8) {
                            try {
                                recomposer.processCompositionError(th8, null);
                                Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(recomposer, list2, list3, list4, mutableScatterSet2, mutableScatterSet2, mutableScatterSet, mutableScatterSet2);
                                unit = Unit.INSTANCE;
                                list2.clear();
                                return unit;
                            } catch (Throwable th9) {
                                list2.clear();
                                throw th9;
                            }
                        }
                    }
                } finally {
                }
                break;
        }
    }

    public /* synthetic */ UiContainerKt$$ExternalSyntheticLambda32(CashComposeInsets cashComposeInsets, AndroidWindowInsets androidWindowInsets, AndroidWindowInsets androidWindowInsets2, Density density, NavigationModel.Ready.Location location, UiFactory.ScreenUi screenUi, List list, WireAdapter wireAdapter, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.f$0 = cashComposeInsets;
        this.f$1 = androidWindowInsets;
        this.f$2 = androidWindowInsets2;
        this.f$3 = density;
        this.f$4 = location;
        this.f$5 = screenUi;
        this.f$6 = list;
        this.f$7 = wireAdapter;
        this.f$8 = parcelableSnapshotMutableIntState;
    }
}
