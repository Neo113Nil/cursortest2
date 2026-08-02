package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.PinnableContainer;

/* loaded from: classes3.dex */
public final class LazyLayoutPinnableItem implements PinnableContainer, PinnableContainer.PinnedHandle {
    public boolean isDisposed;
    public final Object key;
    public PinnableContainer.PinnedHandle parentHandle;
    public final LazyLayoutPinnedItemList pinnedItemList;
    public int pinsCount;
    public int index = -1;
    public final ParcelableSnapshotMutableState _parentPinnableContainer$delegate = Updater.mutableStateOf$default(null);

    public LazyLayoutPinnableItem(Object obj, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        this.key = obj;
        this.pinnedItemList = lazyLayoutPinnedItemList;
    }

    public final LazyLayoutPinnableItem pin() {
        LazyLayoutPinnableItem lazyLayoutPinnableItem;
        if (this.isDisposed) {
            InlineClassHelperKt.throwIllegalStateException("Pin should not be called on an already disposed item ");
        }
        if (this.pinsCount == 0) {
            this.pinnedItemList.items.add(this);
            PinnableContainer pinnableContainer = (PinnableContainer) this._parentPinnableContainer$delegate.getValue();
            if (pinnableContainer != null) {
                lazyLayoutPinnableItem = (LazyLayoutPinnableItem) pinnableContainer;
                lazyLayoutPinnableItem.pin();
            } else {
                lazyLayoutPinnableItem = null;
            }
            this.parentHandle = lazyLayoutPinnableItem;
        }
        this.pinsCount++;
        return this;
    }

    public final void release() {
        if (this.isDisposed) {
            return;
        }
        if (this.pinsCount <= 0) {
            InlineClassHelperKt.throwIllegalStateException("Release should only be called once");
        }
        int i = this.pinsCount - 1;
        this.pinsCount = i;
        if (i == 0) {
            this.pinnedItemList.items.remove(this);
            PinnableContainer.PinnedHandle pinnedHandle = this.parentHandle;
            if (pinnedHandle != null) {
                ((LazyLayoutPinnableItem) pinnedHandle).release();
            }
            this.parentHandle = null;
        }
    }
}
