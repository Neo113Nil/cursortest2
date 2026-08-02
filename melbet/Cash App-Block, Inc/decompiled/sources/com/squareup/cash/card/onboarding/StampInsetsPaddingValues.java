package com.squareup.cash.card.onboarding;

import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StampInsetsPaddingValues implements PaddingValues {
    public final Density density;
    public final WindowInsets insets;

    public StampInsetsPaddingValues(AndroidWindowInsets androidWindowInsets, Density density) {
        androidWindowInsets.getClass();
        density.getClass();
        this.insets = androidWindowInsets;
        this.density = density;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public final float mo264calculateBottomPaddingD9Ej5fM() {
        WindowInsets windowInsets = this.insets;
        Density density = this.density;
        return density.mo233toDpu2uoSUM(windowInsets.getBottom(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public final float mo265calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        WindowInsets windowInsets = this.insets;
        Density density = this.density;
        return density.mo233toDpu2uoSUM(windowInsets.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public final float mo266calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        WindowInsets windowInsets = this.insets;
        Density density = this.density;
        return density.mo233toDpu2uoSUM(windowInsets.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public final float mo267calculateTopPaddingD9Ej5fM() {
        return RecyclerView.DECELERATION_RATE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StampInsetsPaddingValues)) {
            return false;
        }
        StampInsetsPaddingValues stampInsetsPaddingValues = (StampInsetsPaddingValues) obj;
        return Intrinsics.areEqual(this.insets, stampInsetsPaddingValues.insets) && Intrinsics.areEqual(this.density, stampInsetsPaddingValues.density);
    }

    public final int hashCode() {
        return this.density.hashCode() + (this.insets.hashCode() * 31);
    }

    public final String toString() {
        return "StampInsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ")";
    }
}
