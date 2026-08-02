package com.squareup.cash.banking.applets.presenters;

import androidx.compose.foundation.pager.PagerDefaults;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class OverdraftModel$Activated extends PagerDefaults {
    public final String amountUsedText;

    public OverdraftModel$Activated(String str) {
        str.getClass();
        this.amountUsedText = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverdraftModel$Activated) && Intrinsics.areEqual(this.amountUsedText, ((OverdraftModel$Activated) obj).amountUsedText);
    }

    @Override // androidx.compose.foundation.pager.PagerDefaults
    public final boolean getUseWarningTextColor() {
        return false;
    }

    public final int hashCode() {
        return this.amountUsedText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(true) * 31, 31, false);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Activated(displayAsSubtitle=true, useWarningTextColor=false, amountUsedText=", this.amountUsedText, ")");
    }
}
