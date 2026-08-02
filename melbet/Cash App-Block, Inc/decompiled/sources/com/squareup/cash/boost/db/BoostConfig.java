package com.squareup.cash.boost.db;

import com.squareup.protos.franklin.app.GetBoostConfigResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BoostConfig {
    public final GetBoostConfigResponse.BtcBoostUpsell bitcoinBoostUpsell;
    public final Long expirationHintThresholdBps;

    public BoostConfig(Long l, GetBoostConfigResponse.BtcBoostUpsell btcBoostUpsell) {
        this.expirationHintThresholdBps = l;
        this.bitcoinBoostUpsell = btcBoostUpsell;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoostConfig)) {
            return false;
        }
        BoostConfig boostConfig = (BoostConfig) obj;
        return Intrinsics.areEqual(this.expirationHintThresholdBps, boostConfig.expirationHintThresholdBps) && Intrinsics.areEqual(this.bitcoinBoostUpsell, boostConfig.bitcoinBoostUpsell);
    }

    public final int hashCode() {
        Long l = this.expirationHintThresholdBps;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        GetBoostConfigResponse.BtcBoostUpsell btcBoostUpsell = this.bitcoinBoostUpsell;
        return hashCode + (btcBoostUpsell != null ? btcBoostUpsell.hashCode() : 0);
    }

    public final String toString() {
        return "BoostConfig(expirationHintThresholdBps=" + this.expirationHintThresholdBps + ", bitcoinBoostUpsell=" + this.bitcoinBoostUpsell + ")";
    }
}
