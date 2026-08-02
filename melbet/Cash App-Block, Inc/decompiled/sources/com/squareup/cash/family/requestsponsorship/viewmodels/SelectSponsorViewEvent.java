package com.squareup.cash.family.requestsponsorship.viewmodels;

import com.squareup.cash.recipients.data.Recipient;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SelectSponsorViewEvent {

    public final class ClosePressed implements SelectSponsorViewEvent {
        public static final ClosePressed INSTANCE = new ClosePressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClosePressed);
        }

        public final int hashCode() {
            return -338736335;
        }

        public final String toString() {
            return "ClosePressed";
        }
    }

    public final class DialogDismissed implements SelectSponsorViewEvent {
        public static final DialogDismissed INSTANCE = new DialogDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DialogDismissed);
        }

        public final int hashCode() {
            return -1744828742;
        }

        public final String toString() {
            return "DialogDismissed";
        }
    }

    public final class EnableContact implements SelectSponsorViewEvent {
        public static final EnableContact INSTANCE = new EnableContact();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableContact);
        }

        public final int hashCode() {
            return 184444374;
        }

        public final String toString() {
            return "EnableContact";
        }
    }

    public final class Search implements SelectSponsorViewEvent {
        public final String input;

        public Search(String str) {
            this.input = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Search) && this.input.equals(((Search) obj).input);
        }

        public final int hashCode() {
            return this.input.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Search(input=", this.input, ")");
        }
    }

    public final class SendInviteTapped implements SelectSponsorViewEvent {
        public static final SendInviteTapped INSTANCE = new SendInviteTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SendInviteTapped);
        }

        public final int hashCode() {
            return 2086622020;
        }

        public final String toString() {
            return "SendInviteTapped";
        }
    }

    public final class SponsorRowTapped implements SelectSponsorViewEvent {
        public final boolean isRecommended;
        public final Recipient sponsor;

        public SponsorRowTapped(Recipient recipient, boolean z) {
            recipient.getClass();
            this.sponsor = recipient;
            this.isRecommended = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SponsorRowTapped)) {
                return false;
            }
            SponsorRowTapped sponsorRowTapped = (SponsorRowTapped) obj;
            return Intrinsics.areEqual(this.sponsor, sponsorRowTapped.sponsor) && this.isRecommended == sponsorRowTapped.isRecommended;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isRecommended) + (this.sponsor.hashCode() * 31);
        }

        public final String toString() {
            return "SponsorRowTapped(sponsor=" + this.sponsor + ", isRecommended=" + this.isRecommended + ")";
        }
    }
}
