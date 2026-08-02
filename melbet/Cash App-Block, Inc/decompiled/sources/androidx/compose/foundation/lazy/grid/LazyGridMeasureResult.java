package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class LazyGridMeasureResult implements MeasureResult {
    public final int afterContentPadding;
    public final boolean canScrollForward;
    public final float consumedScroll;
    public final CoroutineScope coroutineScope;
    public final Density density;
    public final LazyGridMeasuredLine firstVisibleLine;
    public final int firstVisibleLineScrollOffset;
    public final Function1 lineIndexProvider;
    public final int mainAxisItemSpacing;
    public final MeasureResult measureResult;
    public final Orientation orientation;
    public final Function1 prefetchInfoRetriever;
    public final boolean remeasureNeeded;
    public final float scrollBackAmount;
    public final int slotsPerLine;
    public final int totalItemsCount;
    public final int viewportEndOffset;
    public final int viewportStartOffset;
    public final List visibleItemsInfo;

    public LazyGridMeasureResult(LazyGridMeasuredLine lazyGridMeasuredLine, int i, boolean z, float f, MeasureResult measureResult, float f2, boolean z2, CoroutineScope coroutineScope, Density density, int i2, Function1 function1, Function1 function12, List list, int i3, int i4, int i5, Orientation orientation, int i6, int i7) {
        this.firstVisibleLine = lazyGridMeasuredLine;
        this.firstVisibleLineScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
        this.measureResult = measureResult;
        this.scrollBackAmount = f2;
        this.remeasureNeeded = z2;
        this.coroutineScope = coroutineScope;
        this.density = density;
        this.slotsPerLine = i2;
        this.prefetchInfoRetriever = function1;
        this.lineIndexProvider = function12;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i3;
        this.viewportEndOffset = i4;
        this.totalItemsCount = i5;
        this.orientation = orientation;
        this.afterContentPadding = i6;
        this.mainAxisItemSpacing = i7;
    }

    public final LazyGridMeasureResult copyWithScrollDeltaWithoutRemeasure(int i, boolean z) {
        LazyGridMeasuredLine lazyGridMeasuredLine;
        int i2;
        long j;
        int i3;
        if (this.remeasureNeeded) {
            return null;
        }
        List list = this.visibleItemsInfo;
        if (list.isEmpty() || (lazyGridMeasuredLine = this.firstVisibleLine) == null) {
            return null;
        }
        int i4 = lazyGridMeasuredLine.mainAxisSizeWithSpacings;
        int i5 = this.firstVisibleLineScrollOffset - i;
        if (i5 < 0 || i5 >= i4) {
            return null;
        }
        LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) CollectionsKt.first(list);
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) CollectionsKt.last(list);
        if (lazyGridMeasuredItem.nonScrollableItem || lazyGridMeasuredItem2.nonScrollableItem) {
            return null;
        }
        int i6 = this.viewportEndOffset;
        int i7 = this.viewportStartOffset;
        Orientation orientation = this.orientation;
        if (i < 0) {
            if (Math.min((zzacn.offsetOnMainAxis(lazyGridMeasuredItem, orientation) + lazyGridMeasuredItem.mainAxisSizeWithSpacings) - i7, (zzacn.offsetOnMainAxis(lazyGridMeasuredItem2, orientation) + lazyGridMeasuredItem2.mainAxisSizeWithSpacings) - i6) <= (-i)) {
                return null;
            }
        } else if (Math.min(i7 - zzacn.offsetOnMainAxis(lazyGridMeasuredItem, orientation), i6 - zzacn.offsetOnMainAxis(lazyGridMeasuredItem2, orientation)) <= i) {
            return null;
        }
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            LazyGridMeasuredItem lazyGridMeasuredItem3 = (LazyGridMeasuredItem) list.get(i8);
            lazyGridMeasuredItem3.getClass();
            if (lazyGridMeasuredItem3.nonScrollableItem) {
                i2 = i8;
            } else {
                long j2 = lazyGridMeasuredItem3.offset;
                long j3 = BodyPartID.bodyIdMax;
                int i9 = i8;
                char c = ' ';
                lazyGridMeasuredItem3.offset = (((int) (j2 >> 32)) << 32) | ((((int) (j2 & BodyPartID.bodyIdMax)) + i) & BodyPartID.bodyIdMax);
                if (z) {
                    int size2 = lazyGridMeasuredItem3.placeables.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        LazyLayoutItemAnimation animation = lazyGridMeasuredItem3.animator.getAnimation(i10, lazyGridMeasuredItem3.key);
                        if (animation != null) {
                            long j4 = animation.rawOffset;
                            j = j3;
                            i3 = i9;
                            animation.rawOffset = (((int) (j4 >> r14)) << c) | ((((int) (j4 & j)) + i) & j);
                        } else {
                            j = j3;
                            i3 = i9;
                        }
                        i10++;
                        i9 = i3;
                        j3 = j;
                        c = ' ';
                    }
                }
                i2 = i9;
            }
            i8 = i2 + 1;
        }
        return new LazyGridMeasureResult(this.firstVisibleLine, i5, this.canScrollForward || i > 0, i, this.measureResult, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.slotsPerLine, this.prefetchInfoRetriever, this.lineIndexProvider, this.visibleItemsInfo, this.viewportStartOffset, this.viewportEndOffset, this.totalItemsCount, orientation, this.afterContentPadding, this.mainAxisItemSpacing);
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
    public final long m317getViewportSizeYbymL2g() {
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
