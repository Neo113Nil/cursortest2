package com.squareup.cash.account.settings.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class UnsupportedSettingViewModel {
    public final String message;
    public final boolean shouldSwitchToBusiness;
    public final String title;

    public UnsupportedSettingViewModel(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.message = str2;
        this.shouldSwitchToBusiness = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedSettingViewModel)) {
            return false;
        }
        UnsupportedSettingViewModel unsupportedSettingViewModel = (UnsupportedSettingViewModel) obj;
        return Intrinsics.areEqual(this.title, unsupportedSettingViewModel.title) && Intrinsics.areEqual(this.message, unsupportedSettingViewModel.message) && this.shouldSwitchToBusiness == unsupportedSettingViewModel.shouldSwitchToBusiness;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.shouldSwitchToBusiness) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UnsupportedSettingViewModel(title=", this.title, ", message=", this.message, ", shouldSwitchToBusiness="), this.shouldSwitchToBusiness, ")");
    }
}
