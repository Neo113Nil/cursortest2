package com.squareup.cash.marketcapabilities;

/* loaded from: classes6.dex */
public final class MarketCapability {
    public final MarketCapabilityAvailability capabilityAvailability;
    public final MarketCapabilityName capabilityName;

    public MarketCapability(MarketCapabilityName marketCapabilityName, MarketCapabilityAvailability marketCapabilityAvailability) {
        this.capabilityName = marketCapabilityName;
        this.capabilityAvailability = marketCapabilityAvailability;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCapability)) {
            return false;
        }
        MarketCapability marketCapability = (MarketCapability) obj;
        return this.capabilityName == marketCapability.capabilityName && this.capabilityAvailability == marketCapability.capabilityAvailability;
    }

    public final MarketCapabilityAvailability getCapabilityAvailability() {
        return this.capabilityAvailability;
    }

    public final MarketCapabilityName getCapabilityName() {
        return this.capabilityName;
    }

    public final int hashCode() {
        return this.capabilityAvailability.hashCode() + (this.capabilityName.hashCode() * 31);
    }

    public final String toString() {
        return "MarketCapability(capabilityName=" + this.capabilityName + ", capabilityAvailability=" + this.capabilityAvailability + ")";
    }
}
