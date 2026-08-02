package com.squareup.cash.investing.applets.presenters;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTileRepository;

/* loaded from: classes6.dex */
public final class RealStocksAppletTileRepository$StocksModel$Installed$GraphError implements RealStocksAppletTileRepository.StocksModel {
    public final long balanceAmountCents;

    public RealStocksAppletTileRepository$StocksModel$Installed$GraphError(long j) {
        this.balanceAmountCents = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RealStocksAppletTileRepository$StocksModel$Installed$GraphError) && this.balanceAmountCents == ((RealStocksAppletTileRepository$StocksModel$Installed$GraphError) obj).balanceAmountCents;
    }

    public final int hashCode() {
        return Long.hashCode(this.balanceAmountCents);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(this.balanceAmountCents, "GraphError(balanceAmountCents=", ")");
    }
}
