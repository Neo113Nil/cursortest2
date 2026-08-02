package com.squareup.cash.cashapplite.viewmodels;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class KycAppletTileModel {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KycAppletTileModel) && Float.compare(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(RecyclerView.DECELERATION_RATE);
    }

    public final String toString() {
        return "KycAppletTileModel(progress=0.0)";
    }
}
