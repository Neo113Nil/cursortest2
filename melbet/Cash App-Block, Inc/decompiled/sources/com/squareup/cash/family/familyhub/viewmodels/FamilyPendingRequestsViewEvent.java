package com.squareup.cash.family.familyhub.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class FamilyPendingRequestsViewEvent {

    public final class TapBack extends FamilyPendingRequestsViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return -2042974780;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    public final class TapOnPendingRequest extends FamilyPendingRequestsViewEvent {
        public final String requesterCustomerToken;
        public final String url;

        public TapOnPendingRequest(String str, String str2) {
            this.url = str;
            this.requesterCustomerToken = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapOnPendingRequest)) {
                return false;
            }
            TapOnPendingRequest tapOnPendingRequest = (TapOnPendingRequest) obj;
            return this.url.equals(tapOnPendingRequest.url) && Intrinsics.areEqual(this.requesterCustomerToken, tapOnPendingRequest.requesterCustomerToken);
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            String str = this.requesterCustomerToken;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("TapOnPendingRequest(url=", this.url, ", requesterCustomerToken=", this.requesterCustomerToken, ")");
        }
    }
}
