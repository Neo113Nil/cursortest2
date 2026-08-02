package com.squareup.cash.family.applets.backend.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface FamilyAppletConfig {

    public final class Sponsor implements FamilyAppletConfig {
        public final Long becameActiveSponsorAtMillis;
        public final List dependentCustomerTokens;
        public final String dependentNames;
        public final String pendingRequestsLabel;
        public final String tapUrl;
        public final String title;

        public Sponsor(String str, String str2, List list, String str3, Long l, String str4) {
            str2.getClass();
            list.getClass();
            this.title = str;
            this.tapUrl = str2;
            this.dependentCustomerTokens = list;
            this.dependentNames = str3;
            this.becameActiveSponsorAtMillis = l;
            this.pendingRequestsLabel = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Sponsor)) {
                return false;
            }
            Sponsor sponsor = (Sponsor) obj;
            return this.title.equals(sponsor.title) && Intrinsics.areEqual(this.tapUrl, sponsor.tapUrl) && Intrinsics.areEqual(this.dependentCustomerTokens, sponsor.dependentCustomerTokens) && this.dependentNames.equals(sponsor.dependentNames) && Intrinsics.areEqual(this.becameActiveSponsorAtMillis, sponsor.becameActiveSponsorAtMillis) && Intrinsics.areEqual(this.pendingRequestsLabel, sponsor.pendingRequestsLabel);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.tapUrl), 31, this.dependentCustomerTokens), 31, this.dependentNames);
            Long l = this.becameActiveSponsorAtMillis;
            int hashCode = (m + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.pendingRequestsLabel;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Sponsor(title=", this.title, ", tapUrl=", this.tapUrl, ", dependentCustomerTokens=");
            Recorder$$ExternalSyntheticOutline2.m(", dependentNames=", this.dependentNames, ", becameActiveSponsorAtMillis=", m, this.dependentCustomerTokens);
            m.append(this.becameActiveSponsorAtMillis);
            m.append(", pendingRequestsLabel=");
            m.append(this.pendingRequestsLabel);
            m.append(")");
            return m.toString();
        }
    }

    /* loaded from: classes5.dex */
    public final class SponsoredTeen implements FamilyAppletConfig {
        public static final SponsoredTeen INSTANCE = new SponsoredTeen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SponsoredTeen);
        }

        public final int hashCode() {
            return -1838899328;
        }

        public final String toString() {
            return "SponsoredTeen";
        }
    }

    public final class Unverified implements FamilyAppletConfig {
        public static final Unverified INSTANCE = new Unverified();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unverified);
        }

        public final int hashCode() {
            return 367834036;
        }

        public final String toString() {
            return "Unverified";
        }
    }

    public final class VerifiedNonSponsor implements FamilyAppletConfig {
        public static final VerifiedNonSponsor INSTANCE = new VerifiedNonSponsor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VerifiedNonSponsor);
        }

        public final int hashCode() {
            return -939180856;
        }

        public final String toString() {
            return "VerifiedNonSponsor";
        }
    }
}
