package com.squareup.cash.limits.backend.api;

import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;

/* loaded from: classes.dex */
public final class LimitsPageletStore$LimitsInlineMessageSource$Network {
    public final GetInlineMessageResponse.LimitsHubInlineMessage message;

    public LimitsPageletStore$LimitsInlineMessageSource$Network(GetInlineMessageResponse.LimitsHubInlineMessage limitsHubInlineMessage) {
        this.message = limitsHubInlineMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LimitsPageletStore$LimitsInlineMessageSource$Network) && this.message.equals(((LimitsPageletStore$LimitsInlineMessageSource$Network) obj).message);
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    public final String toString() {
        return "Network(message=" + this.message + ")";
    }
}
