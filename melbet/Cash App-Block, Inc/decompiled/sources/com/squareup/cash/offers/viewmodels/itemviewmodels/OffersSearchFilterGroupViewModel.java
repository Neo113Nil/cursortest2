package com.squareup.cash.offers.viewmodels.itemviewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes6.dex */
public final class OffersSearchFilterGroupViewModel {
    public final boolean active;
    public final String name;

    public OffersSearchFilterGroupViewModel(String str, boolean z) {
        this.name = str;
        this.active = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersSearchFilterGroupViewModel)) {
            return false;
        }
        OffersSearchFilterGroupViewModel offersSearchFilterGroupViewModel = (OffersSearchFilterGroupViewModel) obj;
        return this.name.equals(offersSearchFilterGroupViewModel.name) && this.active == offersSearchFilterGroupViewModel.active;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.active) + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("OffersSearchFilterGroupViewModel(name=", this.name, ", active=", ")", this.active);
    }
}
