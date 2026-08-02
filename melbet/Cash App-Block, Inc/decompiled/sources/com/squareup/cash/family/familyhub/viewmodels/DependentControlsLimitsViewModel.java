package com.squareup.cash.family.familyhub.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentControlsLimitsViewModel {
    public final String currentLimit;
    public final boolean isLimitEditable;
    public final String limitSubtitle;
    public final String limitTitle;
    public final boolean subtleRowValue;

    public DependentControlsLimitsViewModel(String str, String str2, String str3, boolean z, boolean z2) {
        str.getClass();
        str3.getClass();
        this.limitTitle = str;
        this.limitSubtitle = str2;
        this.currentLimit = str3;
        this.subtleRowValue = z;
        this.isLimitEditable = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentControlsLimitsViewModel)) {
            return false;
        }
        DependentControlsLimitsViewModel dependentControlsLimitsViewModel = (DependentControlsLimitsViewModel) obj;
        return Intrinsics.areEqual(this.limitTitle, dependentControlsLimitsViewModel.limitTitle) && Intrinsics.areEqual(this.limitSubtitle, dependentControlsLimitsViewModel.limitSubtitle) && Intrinsics.areEqual(this.currentLimit, dependentControlsLimitsViewModel.currentLimit) && this.subtleRowValue == dependentControlsLimitsViewModel.subtleRowValue && this.isLimitEditable == dependentControlsLimitsViewModel.isLimitEditable;
    }

    public final int hashCode() {
        int hashCode = this.limitTitle.hashCode() * 31;
        String str = this.limitSubtitle;
        return Boolean.hashCode(this.isLimitEditable) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.currentLimit), 31, this.subtleRowValue);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DependentControlsLimitsViewModel(limitTitle=", this.limitTitle, ", limitSubtitle=", this.limitSubtitle, ", currentLimit=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.currentLimit, ", subtleRowValue=", this.subtleRowValue, ", isLimitEditable=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isLimitEditable, ")");
    }
}
