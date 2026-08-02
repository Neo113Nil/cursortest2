package com.squareup.cash.account.settings.viewmodels;

import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;

/* loaded from: classes6.dex */
public abstract class ProfilePrivacyReadyViewModel$ProfileSecurityPolicy {

    /* loaded from: classes7.dex */
    public abstract class FailedToUpdatePolicy extends ProfilePrivacyReadyViewModel$ProfileSecurityPolicy {
    }

    /* loaded from: classes7.dex */
    public final class RenderedPolicy extends ProfilePrivacyReadyViewModel$ProfileSecurityPolicy {
        public final IncomingRequestPolicy value;

        public RenderedPolicy(IncomingRequestPolicy incomingRequestPolicy) {
            incomingRequestPolicy.getClass();
            this.value = incomingRequestPolicy;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RenderedPolicy) && this.value == ((RenderedPolicy) obj).value;
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return "RenderedPolicy(value=" + this.value + ")";
        }
    }
}
