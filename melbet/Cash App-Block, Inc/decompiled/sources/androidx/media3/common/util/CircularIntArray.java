package androidx.media3.common.util;

import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class CircularIntArray {
    public int capacityBitmask = 7;
    public int[] elements = new int[8];
    public int head;
    public int tail;

    public void addLast(int i) {
        int[] iArr = this.elements;
        int i2 = this.tail;
        iArr[i2] = i;
        int i3 = this.capacityBitmask & (i2 + 1);
        this.tail = i3;
        int i4 = this.head;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.elements, 0, iArr2, i5, this.head);
            this.elements = iArr2;
            this.head = 0;
            this.tail = length;
            this.capacityBitmask = i6 - 1;
        }
    }

    public void addPosition(int i, int i2) {
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.capacityBitmask;
        int i4 = i3 * 2;
        int[] iArr = this.elements;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.elements = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.elements = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.elements;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.capacityBitmask++;
    }

    public void collectPrefetchPositionsFromView(RecyclerView recyclerView, boolean z) {
        this.capacityBitmask = 0;
        int[] iArr = this.elements;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || layoutManager == null || !layoutManager.mItemPrefetchEnabled) {
            return;
        }
        if (z) {
            if (!recyclerView.mAdapterHelper.hasPendingUpdates()) {
                layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            layoutManager.collectAdjacentPrefetchPositions(this.head, this.tail, recyclerView.mState, this);
        }
        int i = this.capacityBitmask;
        if (i > layoutManager.mPrefetchMaxCountObserved) {
            layoutManager.mPrefetchMaxCountObserved = i;
            layoutManager.mPrefetchMaxObservedInInitialPrefetch = z;
            recyclerView.mRecycler.updateViewCacheSize();
        }
    }
}
