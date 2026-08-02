package app.cash.local.db;

import com.squareup.protos.cash.local.client.app.v1.MarketTilesScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Local_market_screen {
    public final Long expires_at;
    public final MarketTilesScreen tiles;

    public Local_market_screen(MarketTilesScreen marketTilesScreen, Long l) {
        this.tiles = marketTilesScreen;
        this.expires_at = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Local_market_screen)) {
            return false;
        }
        Local_market_screen local_market_screen = (Local_market_screen) obj;
        return Intrinsics.areEqual(this.tiles, local_market_screen.tiles) && Intrinsics.areEqual(this.expires_at, local_market_screen.expires_at);
    }

    public final int hashCode() {
        MarketTilesScreen marketTilesScreen = this.tiles;
        int hashCode = (marketTilesScreen == null ? 0 : marketTilesScreen.hashCode()) * 31;
        Long l = this.expires_at;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "Local_market_screen(tiles=" + this.tiles + ", expires_at=" + this.expires_at + ")";
    }
}
