package com.squareup.cash.bitcoin.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinPayInUsdSettingsViewModel {
    public final String description;
    public final String header;
    public final boolean toggleEnabled;
    public final String toggleSubtitle;
    public final String toggleTitle;

    public BitcoinPayInUsdSettingsViewModel(String str, String str2, String str3, String str4, boolean z) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.header = str;
        this.description = str2;
        this.toggleTitle = str3;
        this.toggleSubtitle = str4;
        this.toggleEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinPayInUsdSettingsViewModel)) {
            return false;
        }
        BitcoinPayInUsdSettingsViewModel bitcoinPayInUsdSettingsViewModel = (BitcoinPayInUsdSettingsViewModel) obj;
        return Intrinsics.areEqual(this.header, bitcoinPayInUsdSettingsViewModel.header) && Intrinsics.areEqual(this.description, bitcoinPayInUsdSettingsViewModel.description) && Intrinsics.areEqual(this.toggleTitle, bitcoinPayInUsdSettingsViewModel.toggleTitle) && Intrinsics.areEqual(this.toggleSubtitle, bitcoinPayInUsdSettingsViewModel.toggleSubtitle) && this.toggleEnabled == bitcoinPayInUsdSettingsViewModel.toggleEnabled;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.header.hashCode() * 31, 31, this.description), 31, this.toggleTitle);
        String str = this.toggleSubtitle;
        return Boolean.hashCode(this.toggleEnabled) + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BitcoinPayInUsdSettingsViewModel(header=", this.header, ", description=", this.description, ", toggleTitle=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.toggleTitle, ", toggleSubtitle=", this.toggleSubtitle, ", toggleEnabled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.toggleEnabled, ")");
    }
}
