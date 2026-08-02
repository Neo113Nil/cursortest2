package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;

/* loaded from: classes.dex */
public final class UndoManager {
    public final int capacity;
    public final SnapshotStateList redoStack;
    public final SnapshotStateList undoStack;

    public UndoManager(int i, List list, List list2) {
        this.capacity = i;
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Capacity must be a positive integer");
        }
        if (!(list.size() + list2.size() <= i)) {
            InlineClassHelperKt.throwIllegalArgumentException("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(list);
        this.undoStack = snapshotStateList;
        SnapshotStateList snapshotStateList2 = new SnapshotStateList();
        snapshotStateList2.addAll(list2);
        this.redoStack = snapshotStateList2;
    }
}
