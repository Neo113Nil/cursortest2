package com.squareup.cash.account.settings.viewmodels;

import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;

/* loaded from: classes6.dex */
public interface IncomingRequestsViewEvent {

    /* loaded from: classes7.dex */
    public final class GoBack implements IncomingRequestsViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 883507577;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    /* loaded from: classes7.dex */
    public final class NewPolicy implements IncomingRequestsViewEvent {
        public final IncomingRequestPolicy current;
        public final IncomingRequestPolicy policy;

        public NewPolicy(IncomingRequestPolicy incomingRequestPolicy, IncomingRequestPolicy incomingRequestPolicy2) {
            this.current = incomingRequestPolicy;
            this.policy = incomingRequestPolicy2;
        }
    }
}
