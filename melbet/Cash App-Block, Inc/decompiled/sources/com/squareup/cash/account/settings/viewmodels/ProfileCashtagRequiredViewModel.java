package com.squareup.cash.account.settings.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfileCashtagRequiredViewModel {
    public final String message;
    public final String positiveButtonText;

    public ProfileCashtagRequiredViewModel(String str, String str2) {
        str2.getClass();
        this.message = str;
        this.positiveButtonText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileCashtagRequiredViewModel)) {
            return false;
        }
        ProfileCashtagRequiredViewModel profileCashtagRequiredViewModel = (ProfileCashtagRequiredViewModel) obj;
        return this.message.equals(profileCashtagRequiredViewModel.message) && Intrinsics.areEqual(this.positiveButtonText, profileCashtagRequiredViewModel.positiveButtonText);
    }

    public final int hashCode() {
        return this.positiveButtonText.hashCode() + (this.message.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ProfileCashtagRequiredViewModel(message=", this.message, ", positiveButtonText=", this.positiveButtonText, ")");
    }
}
