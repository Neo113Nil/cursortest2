package app.cash.local.primitives;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Tier {
    public final LocalMoney capAbsoluteAmount;
    public final Long capSubtotalMultiplierBps;
    public final long earningRateBps;
    public final LocalMoney subtotalThreshold;

    public Tier(LocalMoney localMoney, Long l, LocalMoney localMoney2, long j) {
        this.subtotalThreshold = localMoney;
        this.capSubtotalMultiplierBps = l;
        this.capAbsoluteAmount = localMoney2;
        this.earningRateBps = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tier)) {
            return false;
        }
        Tier tier = (Tier) obj;
        return Intrinsics.areEqual(this.subtotalThreshold, tier.subtotalThreshold) && Intrinsics.areEqual(this.capSubtotalMultiplierBps, tier.capSubtotalMultiplierBps) && Intrinsics.areEqual(this.capAbsoluteAmount, tier.capAbsoluteAmount) && this.earningRateBps == tier.earningRateBps;
    }

    public final int hashCode() {
        LocalMoney localMoney = this.subtotalThreshold;
        int hashCode = (localMoney == null ? 0 : localMoney.hashCode()) * 31;
        Long l = this.capSubtotalMultiplierBps;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        LocalMoney localMoney2 = this.capAbsoluteAmount;
        return Long.hashCode(this.earningRateBps) + ((hashCode2 + (localMoney2 != null ? localMoney2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Tier(subtotalThreshold=" + this.subtotalThreshold + ", capSubtotalMultiplierBps=" + this.capSubtotalMultiplierBps + ", capAbsoluteAmount=" + this.capAbsoluteAmount + ", earningRateBps=" + this.earningRateBps + ")";
    }
}
