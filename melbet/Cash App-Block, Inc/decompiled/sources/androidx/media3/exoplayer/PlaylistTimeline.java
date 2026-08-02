package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.ShuffleOrder$DefaultShuffleOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class PlaylistTimeline extends Timeline {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final int childCount;
    public final HashMap childIndexByUid;
    public final int[] firstPeriodInChildIndices;
    public final int[] firstWindowInChildIndices;
    public final int periodCount;
    public final ShuffleOrder$DefaultShuffleOrder shuffleOrder;
    public final Timeline[] timelines;
    public final Object[] uids;
    public final int windowCount;

    public PlaylistTimeline(Timeline[] timelineArr, Object[] objArr, ShuffleOrder$DefaultShuffleOrder shuffleOrder$DefaultShuffleOrder) {
        this.shuffleOrder = shuffleOrder$DefaultShuffleOrder;
        this.childCount = shuffleOrder$DefaultShuffleOrder.shuffled.length;
        int length = timelineArr.length;
        this.timelines = timelineArr;
        this.firstPeriodInChildIndices = new int[length];
        this.firstWindowInChildIndices = new int[length];
        this.uids = objArr;
        this.childIndexByUid = new HashMap();
        int length2 = timelineArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            Timeline timeline = timelineArr[i];
            this.timelines[i4] = timeline;
            this.firstWindowInChildIndices[i4] = i2;
            this.firstPeriodInChildIndices[i4] = i3;
            i2 += timeline.getWindowCount();
            i3 += this.timelines[i4].getPeriodCount();
            this.childIndexByUid.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.windowCount = i2;
        this.periodCount = i3;
    }

    @Override // androidx.media3.common.Timeline
    public final int getFirstWindowIndex(boolean z) {
        if (this.childCount != 0) {
            int i = 0;
            if (z) {
                int[] iArr = this.shuffleOrder.shuffled;
                i = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                Timeline[] timelineArr = this.timelines;
                if (!timelineArr[i].isEmpty()) {
                    return timelineArr[i].getFirstWindowIndex(z) + this.firstWindowInChildIndices[i];
                }
                i = getNextChildIndex(i, z);
            } while (i != -1);
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public final int getIndexOfPeriod(Object obj) {
        int indexOfPeriod;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.childIndexByUid.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (indexOfPeriod = this.timelines[intValue].getIndexOfPeriod(obj3)) != -1) {
                return this.firstPeriodInChildIndices[intValue] + indexOfPeriod;
            }
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public final int getLastWindowIndex(boolean z) {
        int i;
        int i2 = this.childCount;
        if (i2 != 0) {
            if (z) {
                int[] iArr = this.shuffleOrder.shuffled;
                i = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                i = i2 - 1;
            }
            do {
                Timeline[] timelineArr = this.timelines;
                if (!timelineArr[i].isEmpty()) {
                    return timelineArr[i].getLastWindowIndex(z) + this.firstWindowInChildIndices[i];
                }
                i = getPreviousChildIndex(i, z);
            } while (i != -1);
        }
        return -1;
    }

    public final int getNextChildIndex(int i, boolean z) {
        if (!z) {
            if (i < this.childCount - 1) {
                return i + 1;
            }
            return -1;
        }
        ShuffleOrder$DefaultShuffleOrder shuffleOrder$DefaultShuffleOrder = this.shuffleOrder;
        int i2 = shuffleOrder$DefaultShuffleOrder.indexInShuffled[i] + 1;
        int[] iArr = shuffleOrder$DefaultShuffleOrder.shuffled;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public final int getNextWindowIndex(int i, int i2, boolean z) {
        int[] iArr = this.firstWindowInChildIndices;
        int binarySearchFloor = Util.binarySearchFloor(iArr, i + 1, false, false);
        int i3 = iArr[binarySearchFloor];
        Timeline[] timelineArr = this.timelines;
        int nextWindowIndex = timelineArr[binarySearchFloor].getNextWindowIndex(i - i3, i2 != 2 ? i2 : 0, z);
        if (nextWindowIndex != -1) {
            return i3 + nextWindowIndex;
        }
        int nextChildIndex = getNextChildIndex(binarySearchFloor, z);
        while (nextChildIndex != -1 && timelineArr[nextChildIndex].isEmpty()) {
            nextChildIndex = getNextChildIndex(nextChildIndex, z);
        }
        if (nextChildIndex != -1) {
            return timelineArr[nextChildIndex].getFirstWindowIndex(z) + iArr[nextChildIndex];
        }
        if (i2 == 2) {
            return getFirstWindowIndex(z);
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        int[] iArr = this.firstPeriodInChildIndices;
        int binarySearchFloor = Util.binarySearchFloor(iArr, i + 1, false, false);
        int i2 = this.firstWindowInChildIndices[binarySearchFloor];
        this.timelines[binarySearchFloor].getPeriod(i - iArr[binarySearchFloor], period, z);
        period.windowIndex += i2;
        if (z) {
            Object obj = this.uids[binarySearchFloor];
            Object obj2 = period.uid;
            obj2.getClass();
            period.uid = Pair.create(obj, obj2);
        }
        return period;
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.childIndexByUid.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.firstWindowInChildIndices[intValue];
        this.timelines[intValue].getPeriodByUid(obj3, period);
        period.windowIndex += i;
        period.uid = obj;
        return period;
    }

    @Override // androidx.media3.common.Timeline
    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final int getPreviousChildIndex(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        ShuffleOrder$DefaultShuffleOrder shuffleOrder$DefaultShuffleOrder = this.shuffleOrder;
        int i2 = shuffleOrder$DefaultShuffleOrder.indexInShuffled[i] - 1;
        if (i2 >= 0) {
            return shuffleOrder$DefaultShuffleOrder.shuffled[i2];
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public final int getPreviousWindowIndex(int i, int i2, boolean z) {
        int[] iArr = this.firstWindowInChildIndices;
        int binarySearchFloor = Util.binarySearchFloor(iArr, i + 1, false, false);
        int i3 = iArr[binarySearchFloor];
        Timeline[] timelineArr = this.timelines;
        int previousWindowIndex = timelineArr[binarySearchFloor].getPreviousWindowIndex(i - i3, i2 != 2 ? i2 : 0, z);
        if (previousWindowIndex != -1) {
            return i3 + previousWindowIndex;
        }
        int previousChildIndex = getPreviousChildIndex(binarySearchFloor, z);
        while (previousChildIndex != -1 && timelineArr[previousChildIndex].isEmpty()) {
            previousChildIndex = getPreviousChildIndex(previousChildIndex, z);
        }
        if (previousChildIndex != -1) {
            return timelineArr[previousChildIndex].getLastWindowIndex(z) + iArr[previousChildIndex];
        }
        if (i2 == 2) {
            return getLastWindowIndex(z);
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    public final Object getUidOfPeriod(int i) {
        int[] iArr = this.firstPeriodInChildIndices;
        int binarySearchFloor = Util.binarySearchFloor(iArr, i + 1, false, false);
        return Pair.create(this.uids[binarySearchFloor], this.timelines[binarySearchFloor].getUidOfPeriod(i - iArr[binarySearchFloor]));
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        int[] iArr = this.firstWindowInChildIndices;
        int binarySearchFloor = Util.binarySearchFloor(iArr, i + 1, false, false);
        int i2 = iArr[binarySearchFloor];
        int i3 = this.firstPeriodInChildIndices[binarySearchFloor];
        this.timelines[binarySearchFloor].getWindow(i - i2, window, j);
        Object obj = this.uids[binarySearchFloor];
        Object obj2 = Timeline.Window.SINGLE_WINDOW_UID;
        Object obj3 = window.uid;
        if (obj2 != obj3) {
            obj = Pair.create(obj, obj3);
        }
        window.uid = obj;
        window.firstPeriodIndex += i3;
        window.lastPeriodIndex += i3;
        return window;
    }

    @Override // androidx.media3.common.Timeline
    public final int getWindowCount() {
        return this.windowCount;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PlaylistTimeline(ArrayList arrayList, ShuffleOrder$DefaultShuffleOrder shuffleOrder$DefaultShuffleOrder) {
        this(r0, r1, shuffleOrder$DefaultShuffleOrder);
        Timeline[] timelineArr = new Timeline[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            timelineArr[i2] = ((MediaSourceInfoHolder) it.next()).getTimeline();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((MediaSourceInfoHolder) it2.next()).getUid();
            i++;
        }
    }
}
