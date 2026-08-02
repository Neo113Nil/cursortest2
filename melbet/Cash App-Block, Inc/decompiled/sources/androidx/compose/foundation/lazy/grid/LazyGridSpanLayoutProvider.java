package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.IntervalList$Interval;
import androidx.core.provider.FontsContractCompat;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class LazyGridSpanLayoutProvider {
    public final ArrayList buckets;
    public final ArrayList cachedBucket;
    public int cachedBucketIndex;
    public final LazyGridIntervalContent gridContent;
    public int lastLineIndex;
    public int lastLineStartItemIndex;
    public int lastLineStartKnownSpan;
    public List previousDefaultSpans;
    public int slotsPerLine;

    public final class Bucket {
        public final int firstItemIndex;
        public final int firstItemKnownSpan;

        public Bucket(int i, int i2) {
            this.firstItemIndex = i;
            this.firstItemKnownSpan = i2;
        }
    }

    public final class LazyGridItemSpanScopeImpl {
        public static final LazyGridItemSpanScopeImpl INSTANCE = new LazyGridItemSpanScopeImpl();
        public static int maxLineSpan;
    }

    public LazyGridSpanLayoutProvider(LazyGridIntervalContent lazyGridIntervalContent) {
        this.gridContent = lazyGridIntervalContent;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Bucket(0, 0));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = EmptyList.INSTANCE;
    }

    public final int getBucketSize() {
        return ((int) Math.sqrt((getTotalSize() * 1.0d) / this.slotsPerLine)) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r9 < r7) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FontsContractCompat.FontFamilyResult getLineConfiguration(int i) {
        int i2;
        int i3;
        int i4;
        List list;
        boolean z = true;
        if (!this.gridContent.hasCustomSpans) {
            int i5 = this.slotsPerLine;
            int i6 = i * i5;
            int totalSize = getTotalSize() - i6;
            if (i5 > totalSize) {
                i5 = totalSize;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            if (i5 == this.previousDefaultSpans.size()) {
                list = this.previousDefaultSpans;
            } else {
                ArrayList arrayList = new ArrayList(i5);
                for (int i7 = 0; i7 < i5; i7++) {
                    arrayList.add(new GridItemSpan(BadgedAvatarKt.GridItemSpan(1)));
                }
                this.previousDefaultSpans = arrayList;
                list = arrayList;
            }
            return new FontsContractCompat.FontFamilyResult(i6, list);
        }
        int bucketSize = i / getBucketSize();
        ArrayList arrayList2 = this.buckets;
        int min = Math.min(bucketSize, arrayList2.size() - 1);
        int bucketSize2 = getBucketSize() * min;
        int i8 = ((Bucket) arrayList2.get(min)).firstItemIndex;
        int i9 = ((Bucket) arrayList2.get(min)).firstItemKnownSpan;
        int i10 = this.lastLineIndex;
        ArrayList arrayList3 = this.cachedBucket;
        if (bucketSize2 <= i10 && i10 <= i) {
            i8 = this.lastLineStartItemIndex;
            i9 = this.lastLineStartKnownSpan;
            bucketSize2 = i10;
        } else if (min == this.cachedBucketIndex && (i2 = i - bucketSize2) < arrayList3.size()) {
            i8 = ((Number) arrayList3.get(i2)).intValue();
            bucketSize2 = i;
            i9 = 0;
        }
        if (bucketSize2 % getBucketSize() == 0) {
            int bucketSize3 = getBucketSize();
            int i11 = i - bucketSize2;
            if (2 <= i11) {
            }
        }
        z = false;
        if (z) {
            this.cachedBucketIndex = min;
            arrayList3.clear();
        }
        if (bucketSize2 > i) {
            InlineClassHelperKt.throwIllegalStateException("currentLine (" + bucketSize2 + ") > lineIndex (" + i + ')');
        }
        while (bucketSize2 < i && i8 < getTotalSize()) {
            if (z) {
                arrayList3.add(Integer.valueOf(i8));
            }
            int i12 = 0;
            while (i12 < this.slotsPerLine && i8 < getTotalSize()) {
                if (i9 == 0) {
                    i4 = i9;
                    i9 = spanOf(i8);
                } else {
                    i4 = 0;
                }
                i12 += i9;
                if (i12 > this.slotsPerLine) {
                    break;
                }
                i8++;
                i9 = i4;
            }
            bucketSize2++;
            if (bucketSize2 % getBucketSize() == 0 && i8 < getTotalSize()) {
                if (arrayList2.size() != bucketSize2 / getBucketSize()) {
                    InlineClassHelperKt.throwIllegalStateException("invalid starting point");
                }
                arrayList2.add(new Bucket(i8, i9));
            }
        }
        this.lastLineIndex = i;
        this.lastLineStartItemIndex = i8;
        this.lastLineStartKnownSpan = i9;
        ArrayList arrayList4 = new ArrayList();
        int i13 = 0;
        int i14 = i8;
        while (i13 < this.slotsPerLine && i14 < getTotalSize()) {
            if (i9 == 0) {
                int i15 = i9;
                i9 = spanOf(i14);
                i3 = i15;
            } else {
                i3 = 0;
            }
            i13 += i9;
            if (i13 > this.slotsPerLine) {
                break;
            }
            i14++;
            arrayList4.add(new GridItemSpan(BadgedAvatarKt.GridItemSpan(i9)));
            i9 = i3;
        }
        return new FontsContractCompat.FontFamilyResult(i8, arrayList4);
    }

    public final int getLineIndexOfItem(int i) {
        int i2;
        if (getTotalSize() <= 0) {
            return 0;
        }
        if (i >= getTotalSize()) {
            InlineClassHelperKt.throwIllegalArgumentException("ItemIndex > total count");
        }
        if (!this.gridContent.hasCustomSpans) {
            return i / this.slotsPerLine;
        }
        ArrayList arrayList = this.buckets;
        int size = arrayList.size();
        CollectionsKt__CollectionsKt.rangeCheck$CollectionsKt__CollectionsKt(arrayList.size(), size);
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int i5 = ((Bucket) arrayList.get(i2)).firstItemIndex - i;
            if (i5 >= 0) {
                if (i5 <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 < 0) {
            i2 = (-i2) - 2;
        }
        int bucketSize = getBucketSize() * i2;
        int i6 = ((Bucket) arrayList.get(i2)).firstItemIndex;
        if (i6 > i) {
            InlineClassHelperKt.throwIllegalArgumentException("currentItemIndex > itemIndex");
        }
        int i7 = 0;
        while (i6 < i) {
            int i8 = i6 + 1;
            int spanOf = spanOf(i6);
            i7 += spanOf;
            int i9 = this.slotsPerLine;
            if (i7 >= i9) {
                if (i7 == i9) {
                    bucketSize++;
                    i7 = 0;
                } else {
                    bucketSize++;
                    i7 = spanOf;
                }
            }
            if (bucketSize % getBucketSize() == 0 && bucketSize / getBucketSize() >= arrayList.size()) {
                arrayList.add(new Bucket(i8 - (i7 > 0 ? 1 : 0), 0));
            }
            i6 = i8;
        }
        return spanOf(i) + i7 > this.slotsPerLine ? bucketSize + 1 : bucketSize;
    }

    public final int getTotalSize() {
        return this.gridContent.intervals.alphabetSize;
    }

    public final int spanOf(int i) {
        LazyGridItemSpanScopeImpl.maxLineSpan = this.slotsPerLine;
        IntervalList$Interval intervalList$Interval = this.gridContent.intervals.get(i);
        int i2 = i - intervalList$Interval.startIndex;
        return (int) ((GridItemSpan) ((LazyGridInterval) intervalList$Interval.value).span.invoke(LazyGridItemSpanScopeImpl.INSTANCE, Integer.valueOf(i2))).packedValue;
    }
}
