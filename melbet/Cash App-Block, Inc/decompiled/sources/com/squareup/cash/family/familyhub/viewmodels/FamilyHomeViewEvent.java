package com.squareup.cash.family.familyhub.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipTier;
import com.squareup.protos.franklin.api.BlockerAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class FamilyHomeViewEvent {

    public final class TapBack extends FamilyHomeViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return -1862610748;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    public final class TapDependent extends FamilyHomeViewEvent {
        public final String dependentCustomerToken;
        public final String dependentDisplayName;
        public final SponsorshipTier sponsorshipTier;

        public TapDependent(SponsorshipTier sponsorshipTier, String str, String str2) {
            str.getClass();
            this.sponsorshipTier = sponsorshipTier;
            this.dependentCustomerToken = str;
            this.dependentDisplayName = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapDependent)) {
                return false;
            }
            TapDependent tapDependent = (TapDependent) obj;
            return this.sponsorshipTier == tapDependent.sponsorshipTier && Intrinsics.areEqual(this.dependentCustomerToken, tapDependent.dependentCustomerToken) && Intrinsics.areEqual(this.dependentDisplayName, tapDependent.dependentDisplayName);
        }

        public final int hashCode() {
            SponsorshipTier sponsorshipTier = this.sponsorshipTier;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((sponsorshipTier == null ? 0 : sponsorshipTier.hashCode()) * 31, 31, this.dependentCustomerToken);
            String str = this.dependentDisplayName;
            return m + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TapDependent(sponsorshipTier=");
            sb.append(this.sponsorshipTier);
            sb.append(", dependentCustomerToken=");
            sb.append(this.dependentCustomerToken);
            sb.append(", dependentDisplayName=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.dependentDisplayName, ")");
        }
    }

    public final class TapListItem extends FamilyHomeViewEvent {
        public final String analyticalIdentifier;
        public final String url;

        public TapListItem(String str, String str2) {
            this.url = str;
            this.analyticalIdentifier = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapListItem)) {
                return false;
            }
            TapListItem tapListItem = (TapListItem) obj;
            return this.url.equals(tapListItem.url) && Intrinsics.areEqual(this.analyticalIdentifier, tapListItem.analyticalIdentifier);
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            String str = this.analyticalIdentifier;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("TapListItem(url=", this.url, ", analyticalIdentifier=", this.analyticalIdentifier, ")");
        }
    }

    public final class TapMembersSectionHeaderButton extends FamilyHomeViewEvent {
        public static final TapMembersSectionHeaderButton INSTANCE = new TapMembersSectionHeaderButton();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapMembersSectionHeaderButton);
        }

        public final int hashCode() {
            return -1067195928;
        }

        public final String toString() {
            return "TapMembersSectionHeaderButton";
        }
    }

    public final class TapMultiplePendingRequests extends FamilyHomeViewEvent {
        public final String url;

        public TapMultiplePendingRequests(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapMultiplePendingRequests) && Intrinsics.areEqual(this.url, ((TapMultiplePendingRequests) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapMultiplePendingRequests(url=", this.url, ")");
        }
    }

    public final class TapPendingRequest extends FamilyHomeViewEvent {
        public final String requesterCustomerToken;
        public final String url;

        public TapPendingRequest(String str, String str2) {
            this.url = str;
            this.requesterCustomerToken = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapPendingRequest)) {
                return false;
            }
            TapPendingRequest tapPendingRequest = (TapPendingRequest) obj;
            return this.url.equals(tapPendingRequest.url) && Intrinsics.areEqual(this.requesterCustomerToken, tapPendingRequest.requesterCustomerToken);
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            String str = this.requesterCustomerToken;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("TapPendingRequest(url=", this.url, ", requesterCustomerToken=", this.requesterCustomerToken, ")");
        }
    }

    public final class TapUpsellCard extends FamilyHomeViewEvent {
        public final BlockerAction action;

        public TapUpsellCard(BlockerAction blockerAction) {
            blockerAction.getClass();
            this.action = blockerAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapUpsellCard) && Intrinsics.areEqual(this.action, ((TapUpsellCard) obj).action);
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m("TapUpsellCard(action=", this.action, ")");
        }
    }
}
