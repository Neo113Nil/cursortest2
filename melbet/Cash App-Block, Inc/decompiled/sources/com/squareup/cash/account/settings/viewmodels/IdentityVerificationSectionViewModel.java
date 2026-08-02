package com.squareup.cash.account.settings.viewmodels;

import com.squareup.protos.franklin.ui.IdentityHubState;

/* loaded from: classes6.dex */
public interface IdentityVerificationSectionViewModel {

    /* loaded from: classes7.dex */
    public final class Content implements IdentityVerificationSectionViewModel {
        public final boolean shouldShowBadge;
        public final IdentityHubState.EntrypointStatus verificationStatus;

        public Content(boolean z, IdentityHubState.EntrypointStatus entrypointStatus) {
            entrypointStatus.getClass();
            this.shouldShowBadge = z;
            this.verificationStatus = entrypointStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.shouldShowBadge == content.shouldShowBadge && this.verificationStatus == content.verificationStatus;
        }

        public final int hashCode() {
            return this.verificationStatus.hashCode() + (Boolean.hashCode(this.shouldShowBadge) * 31);
        }

        public final String toString() {
            return "Content(shouldShowBadge=" + this.shouldShowBadge + ", verificationStatus=" + this.verificationStatus + ")";
        }
    }

    /* loaded from: classes7.dex */
    public final class None implements IdentityVerificationSectionViewModel {
        public static final None INSTANCE = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return 1233595655;
        }

        public final String toString() {
            return "None";
        }
    }
}
