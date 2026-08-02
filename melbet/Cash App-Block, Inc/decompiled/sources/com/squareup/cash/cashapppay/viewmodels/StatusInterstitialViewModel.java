package com.squareup.cash.cashapppay.viewmodels;

import com.squareup.protos.franklin.api.StatusInterstitialBlocker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StatusInterstitialViewModel {
    public final StatusInterstitialBlocker.StatusIcon statusIcon;
    public final String statusText;

    public StatusInterstitialViewModel(StatusInterstitialBlocker.StatusIcon statusIcon, String str) {
        this.statusIcon = statusIcon;
        this.statusText = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusInterstitialViewModel)) {
            return false;
        }
        StatusInterstitialViewModel statusInterstitialViewModel = (StatusInterstitialViewModel) obj;
        return this.statusIcon == statusInterstitialViewModel.statusIcon && Intrinsics.areEqual(this.statusText, statusInterstitialViewModel.statusText);
    }

    public final int hashCode() {
        int hashCode = this.statusIcon.hashCode() * 31;
        String str = this.statusText;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "StatusInterstitialViewModel(statusIcon=" + this.statusIcon + ", statusText=" + this.statusText + ")";
    }
}
