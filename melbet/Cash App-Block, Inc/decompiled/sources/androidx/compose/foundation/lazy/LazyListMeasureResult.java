package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class LazyListMeasureResult implements MeasureResult {
    public final int afterContentPadding;
    public final boolean canScrollForward;
    public final long childConstraints;
    public final float consumedScroll;
    public final CoroutineScope coroutineScope;
    public final Density density;
    public final LazyListMeasuredItem firstVisibleItem;
    public final int firstVisibleItemScrollOffset;
    public final int mainAxisItemSpacing;
    public final MeasureResult measureResult;
    public final Orientation orientation;
    public final boolean remeasureNeeded;
    public final float scrollBackAmount;
    public final int totalItemsCount;
    public final int viewportEndOffset;
    public final int viewportStartOffset;
    public final List visibleItemsInfo;

    public LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i, boolean z, float f, MeasureResult measureResult, float f2, boolean z2, CoroutineScope coroutineScope, Density density, long j, List list, int i2, int i3, int i4, Orientation orientation, int i5, int i6) {
        this.firstVisibleItem = lazyListMeasuredItem;
        this.firstVisibleItemScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
        this.measureResult = measureResult;
        this.scrollBackAmount = f2;
        this.remeasureNeeded = z2;
        this.coroutineScope = coroutineScope;
        this.density = density;
        this.childConstraints = j;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i2;
        this.viewportEndOffset = i3;
        this.totalItemsCount = i4;
        this.orientation = orientation;
        this.afterContentPadding = i5;
        this.mainAxisItemSpacing = i6;
    }

    public final LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure(int i, boolean z) {
        LazyListMeasuredItem lazyListMeasuredItem;
        int i2;
        int i3;
        int i4;
        if (this.remeasureNeeded) {
            return null;
        }
        List list = this.visibleItemsInfo;
        if (list.isEmpty() || (lazyListMeasuredItem = this.firstVisibleItem) == null) {
            return null;
        }
        int i5 = lazyListMeasuredItem.mainAxisSizeWithSpacings;
        int i6 = this.firstVisibleItemScrollOffset - i;
        if (i6 < 0 || i6 >= i5) {
            return null;
        }
        LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) CollectionsKt.first(list);
        LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) CollectionsKt.last(list);
        if (lazyListMeasuredItem2.nonScrollableItem || lazyListMeasuredItem3.nonScrollableItem) {
            return null;
        }
        int i7 = lazyListMeasuredItem2.offset;
        int i8 = this.viewportEndOffset;
        int i9 = this.viewportStartOffset;
        if (i < 0) {
            if (Math.min((i7 + lazyListMeasuredItem2.mainAxisSizeWithSpacings) - i9, (lazyListMeasuredItem3.offset + lazyListMeasuredItem3.mainAxisSizeWithSpacings) - i8) <= (-i)) {
                return null;
            }
        } else if (Math.min(i9 - i7, i8 - lazyListMeasuredItem3.offset) <= i) {
            return null;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) list.get(i10);
            boolean z2 = lazyListMeasuredItem4.isVertical;
            int[] iArr = lazyListMeasuredItem4.placeableOffsets;
            if (!lazyListMeasuredItem4.nonScrollableItem) {
                lazyListMeasuredItem4.offset += i;
                int length = iArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = i11 & 1;
                    if ((z2 && i12 != 0) || (!z2 && i12 == 0)) {
                        iArr[i11] = iArr[i11] + i;
                    }
                }
                if (z) {
                    int size2 = lazyListMeasuredItem4.placeables.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        LazyLayoutItemAnimation animation = lazyListMeasuredItem4.animator.getAnimation(i13, lazyListMeasuredItem4.key);
                        if (animation != null) {
                            long j = animation.rawOffset;
                            if (z2) {
                                i2 = i10;
                                i3 = (int) (j >> 32);
                                i4 = ((int) (j & BodyPartID.bodyIdMax)) + i;
                            } else {
                                i2 = i10;
                                i3 = ((int) (j >> 32)) + i;
                                i4 = (int) (j & BodyPartID.bodyIdMax);
                            }
                            animation.rawOffset = (i4 & BodyPartID.bodyIdMax) | (i3 << 32);
                        } else {
                            i2 = i10;
                        }
                        i13++;
                        i10 = i2;
                    }
                }
            }
            i10++;
        }
        return new LazyListMeasureResult(this.firstVisibleItem, i6, this.canScrollForward || i > 0, i, this.measureResult, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.childConstraints, this.visibleItemsInfo, this.viewportStartOffset, this.viewportEndOffset, this.totalItemsCount, this.orientation, this.afterContentPadding, this.mainAxisItemSpacing);
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Map getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Function1 getRulers() {
        return this.measureResult.getRulers();
    }

    /* renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    public final long m310getViewportSizeYbymL2g() {
        MeasureResult measureResult = this.measureResult;
        return (measureResult.getWidth() << 32) | (measureResult.getHeight() & BodyPartID.bodyIdMax);
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void placeChildren() {
        this.measureResult.placeChildren();
    }
}
