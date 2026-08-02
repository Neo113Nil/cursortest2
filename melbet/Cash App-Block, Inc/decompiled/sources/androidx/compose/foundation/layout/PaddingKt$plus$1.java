package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes3.dex */
public final class PaddingKt$plus$1 implements PaddingValues {
    public final /* synthetic */ PaddingValuesImpl $other;
    public final /* synthetic */ PaddingValues $this_plus;

    public PaddingKt$plus$1(PaddingValues paddingValues, PaddingValuesImpl paddingValuesImpl) {
        this.$this_plus = paddingValues;
        this.$other = paddingValuesImpl;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public final float mo264calculateBottomPaddingD9Ej5fM() {
        return this.$other.bottom + this.$this_plus.mo264calculateBottomPaddingD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public final float mo265calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return this.$other.mo265calculateLeftPaddingu2uoSUM(layoutDirection) + this.$this_plus.mo265calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public final float mo266calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return this.$other.mo266calculateRightPaddingu2uoSUM(layoutDirection) + this.$this_plus.mo266calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public final float mo267calculateTopPaddingD9Ej5fM() {
        return this.$other.top + this.$this_plus.mo267calculateTopPaddingD9Ej5fM();
    }
}
