package com.squareup.cash.investing.viewmodels.search;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class SecurityCarousel implements InvestingSearchRow {
    public final ArrayList tiles;

    public SecurityCarousel(ArrayList arrayList) {
        this.tiles = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SecurityCarousel) && this.tiles.equals(((SecurityCarousel) obj).tiles);
    }

    public final int hashCode() {
        return this.tiles.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("SecurityCarousel(tiles=", ")", this.tiles);
    }
}
