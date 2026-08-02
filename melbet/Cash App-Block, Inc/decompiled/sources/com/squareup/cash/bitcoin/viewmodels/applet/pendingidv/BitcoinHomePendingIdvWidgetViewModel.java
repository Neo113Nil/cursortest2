package com.squareup.cash.bitcoin.viewmodels.applet.pendingidv;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinHomePendingIdvWidgetViewModel implements BitcoinHomeWidgetViewModel {
    public final String subtitle;
    public final String title;

    public BitcoinHomePendingIdvWidgetViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.subtitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinHomePendingIdvWidgetViewModel)) {
            return false;
        }
        BitcoinHomePendingIdvWidgetViewModel bitcoinHomePendingIdvWidgetViewModel = (BitcoinHomePendingIdvWidgetViewModel) obj;
        return Intrinsics.areEqual(this.title, bitcoinHomePendingIdvWidgetViewModel.title) && Intrinsics.areEqual(this.subtitle, bitcoinHomePendingIdvWidgetViewModel.subtitle);
    }

    public final int hashCode() {
        return this.subtitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(R.drawable.mooncake_large_icon_fg_pending) * 31, 31, this.title);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(re$$ExternalSyntheticOutline0.m("BitcoinHomePendingIdvWidgetViewModel(iconRes=", R.drawable.mooncake_large_icon_fg_pending, ", title=", this.title, ", subtitle="), this.subtitle, ")");
    }
}
