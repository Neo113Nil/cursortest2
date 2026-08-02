package com.squareup.cash.bitcoin.viewmodels.map;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class BitcoinLocationFilter {
    public final boolean squareSellersOnly;

    public BitcoinLocationFilter(boolean z) {
        this.squareSellersOnly = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinLocationFilter) && this.squareSellersOnly == ((BitcoinLocationFilter) obj).squareSellersOnly;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.squareSellersOnly);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("BitcoinLocationFilter(squareSellersOnly=", ")", this.squareSellersOnly);
    }
}
