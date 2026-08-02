package com.squareup.cash.bitcoin.viewmodels.applet.disabled;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class DependentBitcoinDisabledViewModel implements BitcoinHomeWidgetViewModel {
    public final String ctaText;
    public final String title;

    public DependentBitcoinDisabledViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.ctaText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentBitcoinDisabledViewModel)) {
            return false;
        }
        DependentBitcoinDisabledViewModel dependentBitcoinDisabledViewModel = (DependentBitcoinDisabledViewModel) obj;
        return Intrinsics.areEqual(this.title, dependentBitcoinDisabledViewModel.title) && Intrinsics.areEqual(this.ctaText, dependentBitcoinDisabledViewModel.ctaText);
    }

    public final int hashCode() {
        return this.ctaText.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("DependentBitcoinDisabledViewModel(title=", this.title, ", ctaText=", this.ctaText, ")");
    }
}
