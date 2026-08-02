package com.squareup.cash.investing.viewmodels.search;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class CategoryTile$CategoryCarousel implements InvestingSearchRow {
    public final ArrayList tiles;

    public CategoryTile$CategoryCarousel(ArrayList arrayList) {
        this.tiles = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CategoryTile$CategoryCarousel) && this.tiles.equals(((CategoryTile$CategoryCarousel) obj).tiles);
    }

    public final int hashCode() {
        return this.tiles.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("CategoryCarousel(tiles=", ")", this.tiles);
    }
}
