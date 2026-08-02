package com.squareup.cash.onboarding.accountpicker.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AccountPickerErrorViewModel {
    public final String message;

    public AccountPickerErrorViewModel(String str) {
        str.getClass();
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountPickerErrorViewModel) && Intrinsics.areEqual(this.message, ((AccountPickerErrorViewModel) obj).message);
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountPickerErrorViewModel(message=", this.message, ")");
    }
}
