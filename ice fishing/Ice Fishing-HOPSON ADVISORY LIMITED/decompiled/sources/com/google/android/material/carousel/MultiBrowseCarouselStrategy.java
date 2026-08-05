package com.google.android.material.carousel;

import android.view.View;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};

    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f = layoutParams.topMargin + layoutParams.bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f = layoutParams.leftMargin + layoutParams.rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f;
        float max = Math.max(getSmallItemSizeMax() + f, smallItemSizeMin);
        float f2 = containerHeight;
        float min = Math.min(measuredHeight + f, f2);
        float clamp = MathUtils.clamp((measuredHeight / 3.0f) + f, smallItemSizeMin + f, max + f);
        float f3 = (min + clamp) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        float f4 = smallItemSizeMin * 2.0f;
        if (f2 <= f4) {
            iArr = new int[]{0};
        }
        int[] iArr2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            iArr = doubleCounts(iArr);
            iArr2 = doubleCounts(iArr2);
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int max2 = (int) Math.max(1.0d, Math.floor(((f2 - (CarouselStrategyHelper.maxValue(iArr4) * f3)) - (CarouselStrategyHelper.maxValue(iArr3) * max)) / min));
        int ceil = (int) Math.ceil(f2 / min);
        int i = (ceil - max2) + 1;
        int[] iArr5 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr5[i2] = ceil - i2;
        }
        int i3 = containerHeight;
        Arrangement findLowestCostArrangement = Arrangement.findLowestCostArrangement(f2, clamp, smallItemSizeMin, max, iArr3, f3, iArr4, min, iArr5);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        boolean ensureArrangementFitsItemCount = ensureArrangementFitsItemCount(findLowestCostArrangement, carousel.getItemCount());
        if (findLowestCostArrangement.mediumCount == 0 && findLowestCostArrangement.smallCount == 0 && f2 > f4) {
            findLowestCostArrangement.smallCount = 1;
            ensureArrangementFitsItemCount = true;
        }
        if (ensureArrangementFitsItemCount) {
            findLowestCostArrangement = Arrangement.findLowestCostArrangement(f2, clamp, smallItemSizeMin, max, new int[]{findLowestCostArrangement.smallCount}, f3, new int[]{findLowestCostArrangement.mediumCount}, min, new int[]{findLowestCostArrangement.largeCount});
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f, i3, findLowestCostArrangement, carousel.getCarouselAlignment());
    }

    boolean ensureArrangementFitsItemCount(Arrangement arrangement, int i) {
        int itemCount = arrangement.getItemCount() - i;
        boolean z = itemCount > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1);
        while (itemCount > 0) {
            if (arrangement.smallCount > 0) {
                arrangement.smallCount--;
            } else if (arrangement.mediumCount > 1) {
                arrangement.mediumCount--;
            }
            itemCount--;
        }
        return z;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(Carousel carousel, int i) {
        return (i < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i >= this.keylineCount && carousel.getItemCount() < this.keylineCount);
    }
}
