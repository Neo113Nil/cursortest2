package com.squareup.cash.bitcoin.viewmodels.applet.disclosure;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinHomeDisclosureWidgetViewModel implements BitcoinHomeWidgetViewModel {
    public final String disclosure;
    public final String url;

    public BitcoinHomeDisclosureWidgetViewModel(String str, String str2) {
        str2.getClass();
        this.disclosure = str;
        this.url = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinHomeDisclosureWidgetViewModel)) {
            return false;
        }
        BitcoinHomeDisclosureWidgetViewModel bitcoinHomeDisclosureWidgetViewModel = (BitcoinHomeDisclosureWidgetViewModel) obj;
        return this.disclosure.equals(bitcoinHomeDisclosureWidgetViewModel.disclosure) && Intrinsics.areEqual(this.url, bitcoinHomeDisclosureWidgetViewModel.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + (this.disclosure.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("BitcoinHomeDisclosureWidgetViewModel(disclosure=", this.disclosure, ", url=", this.url, ")");
    }
}
