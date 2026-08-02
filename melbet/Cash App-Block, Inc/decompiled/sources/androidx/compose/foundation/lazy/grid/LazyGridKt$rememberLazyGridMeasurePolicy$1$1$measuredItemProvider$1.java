package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScopeImpl;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.credentials.Credential;
import java.util.List;

/* loaded from: classes3.dex */
public final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1 extends Credential {
    public final /* synthetic */ int $afterContentPadding;
    public final /* synthetic */ int $beforeContentPadding;
    public final /* synthetic */ LazyGridState $state;
    public final /* synthetic */ LazyLayoutMeasureScopeImpl $this_LazyLayoutMeasurePolicy;
    public final /* synthetic */ long $visualItemOffset;
    public final int defaultMainAxisSpacing;
    public final LazyGridItemProviderImpl itemProvider;
    public final LazyLayoutMeasureScopeImpl measureScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1(LazyGridItemProviderImpl lazyGridItemProviderImpl, LazyLayoutMeasureScopeImpl lazyLayoutMeasureScopeImpl, int i, LazyGridState lazyGridState, int i2, int i3, long j) {
        super(3);
        this.$this_LazyLayoutMeasurePolicy = lazyLayoutMeasureScopeImpl;
        this.$state = lazyGridState;
        this.$beforeContentPadding = i2;
        this.$afterContentPadding = i3;
        this.$visualItemOffset = j;
        this.itemProvider = lazyGridItemProviderImpl;
        this.measureScope = lazyLayoutMeasureScopeImpl;
        this.defaultMainAxisSpacing = i;
    }

    @Override // androidx.credentials.Credential
    /* renamed from: getAndMeasure--hBUhpc */
    public final LazyLayoutMeasuredItem mo308getAndMeasurehBUhpc(int i, int i2, int i3, long j) {
        return m316getAndMeasurem8Kt_7k(i, i2, i3, this.defaultMainAxisSpacing, j);
    }

    /* renamed from: getAndMeasure-m8Kt_7k, reason: not valid java name */
    public final LazyGridMeasuredItem m316getAndMeasurem8Kt_7k(int i, int i2, int i3, int i4, long j) {
        int m1026getMinHeightimpl;
        LazyGridItemProviderImpl lazyGridItemProviderImpl = this.itemProvider;
        Object key = lazyGridItemProviderImpl.getKey(i);
        Object contentType = lazyGridItemProviderImpl.intervalContent.getContentType(i);
        List m1104getPlaceables3p2s80s = m1104getPlaceables3p2s80s(this.measureScope, i, j);
        if (Constraints.m1023getHasFixedWidthimpl(j)) {
            m1026getMinHeightimpl = Constraints.m1027getMinWidthimpl(j);
        } else {
            if (!Constraints.m1022getHasFixedHeightimpl(j)) {
                InlineClassHelperKt.throwIllegalArgumentException("does not have fixed height");
            }
            m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j);
        }
        LayoutDirection layoutDirection = this.$this_LazyLayoutMeasurePolicy.subcomposeMeasureScope.getLayoutDirection();
        LazyLayoutItemAnimator lazyLayoutItemAnimator = this.$state.itemAnimator;
        return new LazyGridMeasuredItem(i, key, m1026getMinHeightimpl, i4, layoutDirection, this.$beforeContentPadding, this.$afterContentPadding, m1104getPlaceables3p2s80s, this.$visualItemOffset, contentType, lazyLayoutItemAnimator, j, i2, i3);
    }
}
