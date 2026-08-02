package com.squareup.cash.account.settings.viewmodels;

import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;

/* loaded from: classes7.dex */
public final class IncomingRequestsViewModel {
    public final IncomingRequestPolicy policy;

    public IncomingRequestsViewModel(IncomingRequestPolicy incomingRequestPolicy) {
        this.policy = incomingRequestPolicy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IncomingRequestsViewModel) && this.policy == ((IncomingRequestsViewModel) obj).policy;
    }

    public final int hashCode() {
        IncomingRequestPolicy incomingRequestPolicy = this.policy;
        if (incomingRequestPolicy == null) {
            return 0;
        }
        return incomingRequestPolicy.hashCode();
    }

    public final String toString() {
        return "IncomingRequestsViewModel(policy=" + this.policy + ")";
    }
}
