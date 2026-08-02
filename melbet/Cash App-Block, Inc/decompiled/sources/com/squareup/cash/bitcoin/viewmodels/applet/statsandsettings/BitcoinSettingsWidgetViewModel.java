package com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinSettingsWidgetViewModel implements BitcoinHomeWidgetViewModel {
    public final List items;
    public final boolean showHeader;

    public BitcoinSettingsWidgetViewModel(boolean z, List list) {
        list.getClass();
        this.showHeader = z;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinSettingsWidgetViewModel)) {
            return false;
        }
        BitcoinSettingsWidgetViewModel bitcoinSettingsWidgetViewModel = (BitcoinSettingsWidgetViewModel) obj;
        return this.showHeader == bitcoinSettingsWidgetViewModel.showHeader && Intrinsics.areEqual(this.items, bitcoinSettingsWidgetViewModel.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Boolean.hashCode(this.showHeader) * 31);
    }

    public final String toString() {
        return "BitcoinSettingsWidgetViewModel(showHeader=" + this.showHeader + ", items=" + this.items + ")";
    }
}
