package androidx.compose.foundation.text.selection;

import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.work.impl.WorkLauncherImpl;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;

/* loaded from: classes3.dex */
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    public static final WorkLauncherImpl Saver = new WorkLauncherImpl(8, new SnackbarHostKt$$ExternalSyntheticLambda2(7), new ButtonKt$$ExternalSyntheticLambda2(5));
    public final MutableLongObjectMap _selectableMap;
    public final ArrayList _selectables = new ArrayList();
    public SelectionManager$$ExternalSyntheticLambda1 afterSelectableUnsubscribe;
    public final AtomicLong incrementId;
    public SelectionManager$$ExternalSyntheticLambda1 onPositionChangeCallback;
    public SelectionManager$$ExternalSyntheticLambda1 onSelectableChangeCallback;
    public SelectionManager$$ExternalSyntheticLambda8 onSelectionUpdateCallback;
    public SelectionManager$$ExternalSyntheticLambda0 onSelectionUpdateEndCallback;
    public ScoreUiFactory$$ExternalSyntheticLambda0 onSelectionUpdateStartCallback;
    public boolean sorted;
    public final ParcelableSnapshotMutableState subselections$delegate;

    public SelectionRegistrarImpl(long j) {
        MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.EmptyLongObjectMap;
        this._selectableMap = new MutableLongObjectMap();
        this.incrementId = new AtomicLong(j);
        MutableLongObjectMap mutableLongObjectMap2 = LongObjectMapKt.EmptyLongObjectMap;
        mutableLongObjectMap2.getClass();
        this.subselections$delegate = Updater.mutableStateOf$default(mutableLongObjectMap2);
    }

    public final MutableLongObjectMap getSubselections() {
        return (MutableLongObjectMap) this.subselections$delegate.getValue();
    }

    public final long nextSelectableId() {
        AtomicLong atomicLong = this.incrementId;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    public final void notifySelectableChange(long j) {
        SelectionManager$$ExternalSyntheticLambda1 selectionManager$$ExternalSyntheticLambda1 = this.onSelectableChangeCallback;
        if (selectionManager$$ExternalSyntheticLambda1 != null) {
            selectionManager$$ExternalSyntheticLambda1.invoke(Long.valueOf(j));
        }
    }

    /* renamed from: notifySelectionUpdate-njBpvok, reason: not valid java name */
    public final boolean m446notifySelectionUpdatenjBpvok(LayoutCoordinates layoutCoordinates, long j, long j2, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0, boolean z) {
        SelectionManager$$ExternalSyntheticLambda8 selectionManager$$ExternalSyntheticLambda8 = this.onSelectionUpdateCallback;
        if (selectionManager$$ExternalSyntheticLambda8 == null) {
            return true;
        }
        SelectionManager selectionManager = selectionManager$$ExternalSyntheticLambda8.f$0;
        long m443convertToContainerCoordinatesR5De75A = selectionManager.m443convertToContainerCoordinatesR5De75A(layoutCoordinates, j);
        long m443convertToContainerCoordinatesR5De75A2 = selectionManager.m443convertToContainerCoordinatesR5De75A(layoutCoordinates, j2);
        selectionManager.setInTouchMode(z);
        return selectionManager.m444updateSelectionjyLRC_s$foundation(m443convertToContainerCoordinatesR5De75A, m443convertToContainerCoordinatesR5De75A2, false, selectionAdjustment$Companion$$ExternalSyntheticLambda0);
    }

    public final ArrayList sort(LayoutCoordinates layoutCoordinates) {
        boolean z = this.sorted;
        ArrayList arrayList = this._selectables;
        if (!z) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new VideoCapture$$ExternalSyntheticLambda6(new HintHandler$$ExternalSyntheticLambda0(layoutCoordinates, 12), 3));
            this.sorted = true;
        }
        return arrayList;
    }

    public final MultiWidgetSelectionDelegate subscribe(MultiWidgetSelectionDelegate multiWidgetSelectionDelegate) {
        long j = multiWidgetSelectionDelegate.selectableId;
        if (j == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("The selectable contains an invalid id: " + j);
        }
        MutableLongObjectMap mutableLongObjectMap = this._selectableMap;
        if (mutableLongObjectMap.containsKey(j)) {
            InlineClassHelperKt.throwIllegalArgumentException("Another selectable with the id: " + multiWidgetSelectionDelegate + ".selectableId has already subscribed.");
        }
        mutableLongObjectMap.set(multiWidgetSelectionDelegate, j);
        this._selectables.add(multiWidgetSelectionDelegate);
        this.sorted = false;
        return multiWidgetSelectionDelegate;
    }

    public final void unsubscribe(MultiWidgetSelectionDelegate multiWidgetSelectionDelegate) {
        long j = multiWidgetSelectionDelegate.selectableId;
        MutableLongObjectMap mutableLongObjectMap = this._selectableMap;
        if (mutableLongObjectMap.containsKey(j)) {
            this._selectables.remove(multiWidgetSelectionDelegate);
            mutableLongObjectMap.remove(j);
            SelectionManager$$ExternalSyntheticLambda1 selectionManager$$ExternalSyntheticLambda1 = this.afterSelectableUnsubscribe;
            if (selectionManager$$ExternalSyntheticLambda1 != null) {
                selectionManager$$ExternalSyntheticLambda1.invoke(Long.valueOf(j));
            }
        }
    }
}
