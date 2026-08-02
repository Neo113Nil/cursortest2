package com.squareup.cash.payments.views.coreflowsheet;

import androidx.compose.foundation.layout.InsetsPaddingValues;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AddedPaddingValues implements PaddingValues {
    public final InsetsPaddingValues first;
    public final PaddingValues second;

    public AddedPaddingValues(InsetsPaddingValues insetsPaddingValues, PaddingValues paddingValues) {
        paddingValues.getClass();
        this.first = insetsPaddingValues;
        this.second = paddingValues;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public final float mo264calculateBottomPaddingD9Ej5fM() {
        return this.second.mo264calculateBottomPaddingD9Ej5fM() + this.first.mo264calculateBottomPaddingD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public final float mo265calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        return this.second.mo265calculateLeftPaddingu2uoSUM(layoutDirection) + this.first.mo265calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public final float mo266calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        layoutDirection.getClass();
        return this.second.mo266calculateRightPaddingu2uoSUM(layoutDirection) + this.first.mo266calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public final float mo267calculateTopPaddingD9Ej5fM() {
        return this.second.mo267calculateTopPaddingD9Ej5fM() + this.first.mo267calculateTopPaddingD9Ej5fM();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddedPaddingValues)) {
            return false;
        }
        AddedPaddingValues addedPaddingValues = (AddedPaddingValues) obj;
        return this.first.equals(addedPaddingValues.first) && Intrinsics.areEqual(this.second, addedPaddingValues.second);
    }

    public final int hashCode() {
        return this.second.hashCode() + (this.first.hashCode() * 31);
    }

    public final String toString() {
        return "AddedPaddingValues(first=" + this.first + ", second=" + this.second + ")";
    }
}
