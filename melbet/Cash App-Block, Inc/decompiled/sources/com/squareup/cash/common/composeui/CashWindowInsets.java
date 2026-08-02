package com.squareup.cash.common.composeui;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.cash.ui.CashInsets;

/* loaded from: classes.dex */
public final class CashWindowInsets implements WindowInsets {
    public final ParcelableSnapshotMutableState insets$delegate = Updater.mutableStateOf$default(Insets.NONE);

    /* renamed from: type, reason: collision with root package name */
    public final CashInsets.Type f1116type;

    public CashWindowInsets(CashInsets.Type type2) {
        this.f1116type = type2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashWindowInsets) && this.f1116type == ((CashWindowInsets) obj).f1116type;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(Density density) {
        density.getClass();
        return getInsets$compose_ui().bottom;
    }

    public final Insets getInsets$compose_ui() {
        return (Insets) this.insets$delegate.getValue();
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(Density density, LayoutDirection layoutDirection) {
        density.getClass();
        layoutDirection.getClass();
        return getInsets$compose_ui().left;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(Density density, LayoutDirection layoutDirection) {
        density.getClass();
        layoutDirection.getClass();
        return getInsets$compose_ui().right;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(Density density) {
        density.getClass();
        return getInsets$compose_ui().top;
    }

    public final int hashCode() {
        return this.f1116type.hashCode();
    }

    public final String toString() {
        String name = this.f1116type.name();
        int i = getInsets$compose_ui().left;
        int i2 = getInsets$compose_ui().top;
        int i3 = getInsets$compose_ui().right;
        int i4 = getInsets$compose_ui().bottom;
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        Fragment$5$$ExternalSyntheticOutline0.m(i3, i4, ", ", ", ", sb);
        sb.append(")");
        return sb.toString();
    }
}
