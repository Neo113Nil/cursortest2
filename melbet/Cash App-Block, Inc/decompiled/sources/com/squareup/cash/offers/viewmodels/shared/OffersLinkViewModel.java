package com.squareup.cash.offers.viewmodels.shared;

import com.squareup.protos.cash.shop.rendering.api.TapAction;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersLinkViewModel {
    public final TapAction tapAction;
    public final String text;

    public OffersLinkViewModel(String str, TapAction tapAction) {
        str.getClass();
        tapAction.getClass();
        this.text = str;
        this.tapAction = tapAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersLinkViewModel)) {
            return false;
        }
        OffersLinkViewModel offersLinkViewModel = (OffersLinkViewModel) obj;
        return Intrinsics.areEqual(this.text, offersLinkViewModel.text) && Intrinsics.areEqual(this.tapAction, offersLinkViewModel.tapAction);
    }

    public final int hashCode() {
        return this.tapAction.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "OffersLinkViewModel(text=" + this.text + ", tapAction=" + this.tapAction + ")";
    }
}
