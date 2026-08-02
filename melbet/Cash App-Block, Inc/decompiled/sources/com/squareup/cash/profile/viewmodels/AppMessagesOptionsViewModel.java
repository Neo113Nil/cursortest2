package com.squareup.cash.profile.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes7.dex */
public final class AppMessagesOptionsViewModel {
    public final boolean lightEnabled;
    public final boolean vibrateEnabled;

    public AppMessagesOptionsViewModel(boolean z, boolean z2) {
        this.vibrateEnabled = z;
        this.lightEnabled = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppMessagesOptionsViewModel)) {
            return false;
        }
        AppMessagesOptionsViewModel appMessagesOptionsViewModel = (AppMessagesOptionsViewModel) obj;
        return this.vibrateEnabled == appMessagesOptionsViewModel.vibrateEnabled && this.lightEnabled == appMessagesOptionsViewModel.lightEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.lightEnabled) + (Boolean.hashCode(this.vibrateEnabled) * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("AppMessagesOptionsViewModel(vibrateEnabled=", ", lightEnabled=", ")", this.vibrateEnabled, this.lightEnabled);
    }
}
