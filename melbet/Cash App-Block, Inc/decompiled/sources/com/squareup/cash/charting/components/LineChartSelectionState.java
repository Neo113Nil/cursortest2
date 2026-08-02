package com.squareup.cash.charting.components;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import java.util.List;

/* loaded from: classes6.dex */
public final class LineChartSelectionState {
    public final ParcelableSnapshotMutableState selectedPoints$delegate;
    public final ParcelableSnapshotMutableState selectionBehavior$delegate;

    public LineChartSelectionState(LineChartSelectionState$SelectionBehavior$None lineChartSelectionState$SelectionBehavior$None, List list) {
        lineChartSelectionState$SelectionBehavior$None.getClass();
        this.selectionBehavior$delegate = Updater.mutableStateOf$default(lineChartSelectionState$SelectionBehavior$None);
        this.selectedPoints$delegate = Updater.mutableStateOf$default(list);
    }

    public final List getSelectedPoints() {
        return (List) this.selectedPoints$delegate.getValue();
    }

    public final LineChartSelectionState$SelectionBehavior$None getSelectionBehavior() {
        return (LineChartSelectionState$SelectionBehavior$None) this.selectionBehavior$delegate.getValue();
    }
}
