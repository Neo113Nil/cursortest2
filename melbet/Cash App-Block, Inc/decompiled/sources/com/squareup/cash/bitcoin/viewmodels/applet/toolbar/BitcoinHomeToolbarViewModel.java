package com.squareup.cash.bitcoin.viewmodels.applet.toolbar;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinHomeToolbarViewModel {
    public final boolean showBitcoinMapMenuIcon;
    public final boolean showScannerMenuIcon;
    public final String title;

    public BitcoinHomeToolbarViewModel(String str, boolean z, boolean z2) {
        str.getClass();
        this.showScannerMenuIcon = z;
        this.showBitcoinMapMenuIcon = z2;
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinHomeToolbarViewModel)) {
            return false;
        }
        BitcoinHomeToolbarViewModel bitcoinHomeToolbarViewModel = (BitcoinHomeToolbarViewModel) obj;
        return this.showScannerMenuIcon == bitcoinHomeToolbarViewModel.showScannerMenuIcon && this.showBitcoinMapMenuIcon == bitcoinHomeToolbarViewModel.showBitcoinMapMenuIcon && Intrinsics.areEqual(this.title, bitcoinHomeToolbarViewModel.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.showScannerMenuIcon) * 31, 31, this.showBitcoinMapMenuIcon);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("BitcoinHomeToolbarViewModel(showScannerMenuIcon=", ", showBitcoinMapMenuIcon=", ", title=", this.showScannerMenuIcon, this.showBitcoinMapMenuIcon), this.title, ")");
    }
}
