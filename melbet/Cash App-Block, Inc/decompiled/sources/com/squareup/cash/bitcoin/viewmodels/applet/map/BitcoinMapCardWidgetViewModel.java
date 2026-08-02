package com.squareup.cash.bitcoin.viewmodels.applet.map;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;

/* loaded from: classes5.dex */
public final class BitcoinMapCardWidgetViewModel implements BitcoinHomeWidgetViewModel {
    public final boolean canPayWithLightning;

    public BitcoinMapCardWidgetViewModel(boolean z) {
        this.canPayWithLightning = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinMapCardWidgetViewModel) && this.canPayWithLightning == ((BitcoinMapCardWidgetViewModel) obj).canPayWithLightning;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.canPayWithLightning);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("BitcoinMapCardWidgetViewModel(canPayWithLightning=", ")", this.canPayWithLightning);
    }
}
