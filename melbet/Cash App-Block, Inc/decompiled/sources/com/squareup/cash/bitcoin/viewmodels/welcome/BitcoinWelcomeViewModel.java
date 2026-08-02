package com.squareup.cash.bitcoin.viewmodels.welcome;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinWelcomeViewModel implements BitcoinHomeWidgetViewModel {
    public final String subTitle;
    public final String title;

    public BitcoinWelcomeViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.subTitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinWelcomeViewModel)) {
            return false;
        }
        BitcoinWelcomeViewModel bitcoinWelcomeViewModel = (BitcoinWelcomeViewModel) obj;
        return Intrinsics.areEqual(this.title, bitcoinWelcomeViewModel.title) && Intrinsics.areEqual(this.subTitle, bitcoinWelcomeViewModel.subTitle);
    }

    public final int hashCode() {
        return this.subTitle.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("BitcoinWelcomeViewModel(title=", this.title, ", subTitle=", this.subTitle, ")");
    }
}
