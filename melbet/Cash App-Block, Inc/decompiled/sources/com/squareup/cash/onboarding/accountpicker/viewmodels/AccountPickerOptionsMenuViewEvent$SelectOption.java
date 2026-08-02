package com.squareup.cash.onboarding.accountpicker.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class AccountPickerOptionsMenuViewEvent$SelectOption {
    public final int optionId;

    public AccountPickerOptionsMenuViewEvent$SelectOption(int i) {
        this.optionId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountPickerOptionsMenuViewEvent$SelectOption) && this.optionId == ((AccountPickerOptionsMenuViewEvent$SelectOption) obj).optionId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.optionId);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.optionId, "SelectOption(optionId=", ")");
    }
}
