package com.squareup.cash.family.familyhub.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentControlsToggleViewModel {
    public final boolean toggleChecked;
    public final Integer toggleIcon;
    public final String toggleSubtitle;
    public final String toggleTitle;

    public DependentControlsToggleViewModel(String str, String str2, Integer num, boolean z) {
        str.getClass();
        str2.getClass();
        this.toggleTitle = str;
        this.toggleSubtitle = str2;
        this.toggleChecked = z;
        this.toggleIcon = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentControlsToggleViewModel)) {
            return false;
        }
        DependentControlsToggleViewModel dependentControlsToggleViewModel = (DependentControlsToggleViewModel) obj;
        return Intrinsics.areEqual(this.toggleTitle, dependentControlsToggleViewModel.toggleTitle) && Intrinsics.areEqual(this.toggleSubtitle, dependentControlsToggleViewModel.toggleSubtitle) && this.toggleChecked == dependentControlsToggleViewModel.toggleChecked && Intrinsics.areEqual(this.toggleIcon, dependentControlsToggleViewModel.toggleIcon);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.toggleTitle.hashCode() * 31, 31, this.toggleSubtitle), 31, this.toggleChecked);
        Integer num = this.toggleIcon;
        return Boolean.hashCode(true) + ((m + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DependentControlsToggleViewModel(toggleTitle=", this.toggleTitle, ", toggleSubtitle=", this.toggleSubtitle, ", toggleChecked=");
        m.append(this.toggleChecked);
        m.append(", toggleIcon=");
        m.append(this.toggleIcon);
        m.append(", showToggle=true)");
        return m.toString();
    }
}
