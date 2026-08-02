package com.squareup.cash.limits.backend.api;

/* loaded from: classes.dex */
public final class LimitsPageletStore$VersionedLimitsPagelet {
    public final LimitsPageletStore$LimitsInlineMessageSource$Network inlineMessageSource;
    public final long version;

    public LimitsPageletStore$VersionedLimitsPagelet(LimitsPageletStore$LimitsInlineMessageSource$Network limitsPageletStore$LimitsInlineMessageSource$Network, long j) {
        this.inlineMessageSource = limitsPageletStore$LimitsInlineMessageSource$Network;
        this.version = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitsPageletStore$VersionedLimitsPagelet)) {
            return false;
        }
        LimitsPageletStore$VersionedLimitsPagelet limitsPageletStore$VersionedLimitsPagelet = (LimitsPageletStore$VersionedLimitsPagelet) obj;
        return this.inlineMessageSource.equals(limitsPageletStore$VersionedLimitsPagelet.inlineMessageSource) && this.version == limitsPageletStore$VersionedLimitsPagelet.version;
    }

    public final int hashCode() {
        return Long.hashCode(this.version) + (this.inlineMessageSource.message.hashCode() * 31);
    }

    public final String toString() {
        return "VersionedLimitsPagelet(inlineMessageSource=" + this.inlineMessageSource + ", version=" + this.version + ")";
    }
}
