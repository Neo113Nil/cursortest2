package com.squareup.cash.bitcoin.viewmodels.unavailable;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class BitcoinFeatureUnavailableViewModel {
    public final String bodyText;
    public final String buttonText;

    public BitcoinFeatureUnavailableViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.bodyText = str;
        this.buttonText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinFeatureUnavailableViewModel)) {
            return false;
        }
        BitcoinFeatureUnavailableViewModel bitcoinFeatureUnavailableViewModel = (BitcoinFeatureUnavailableViewModel) obj;
        return Intrinsics.areEqual(this.bodyText, bitcoinFeatureUnavailableViewModel.bodyText) && Intrinsics.areEqual(this.buttonText, bitcoinFeatureUnavailableViewModel.buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode() + (this.bodyText.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("BitcoinFeatureUnavailableViewModel(bodyText=", this.bodyText, ", buttonText=", this.buttonText, ")");
    }
}
