package com.squareup.cash.banking.applets.presenters;

import androidx.compose.foundation.pager.PagerDefaults;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class OverdraftModel$Disabled extends PagerDefaults {
    public final String amountUsedText;
    public final boolean useWarningTextColor;

    public OverdraftModel$Disabled(boolean z, String str) {
        str.getClass();
        this.useWarningTextColor = z;
        this.amountUsedText = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverdraftModel$Disabled)) {
            return false;
        }
        OverdraftModel$Disabled overdraftModel$Disabled = (OverdraftModel$Disabled) obj;
        return this.useWarningTextColor == overdraftModel$Disabled.useWarningTextColor && Intrinsics.areEqual(this.amountUsedText, overdraftModel$Disabled.amountUsedText);
    }

    @Override // androidx.compose.foundation.pager.PagerDefaults
    public final boolean getUseWarningTextColor() {
        return this.useWarningTextColor;
    }

    public final int hashCode() {
        return this.amountUsedText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(true) * 31, 31, this.useWarningTextColor);
    }

    public final String toString() {
        return "Disabled(displayAsSubtitle=true, useWarningTextColor=" + this.useWarningTextColor + ", amountUsedText=" + this.amountUsedText + ")";
    }
}
