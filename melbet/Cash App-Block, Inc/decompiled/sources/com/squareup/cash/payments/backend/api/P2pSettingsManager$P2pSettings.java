package com.squareup.cash.payments.backend.api;

import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.protos.franklin.common.DepositPreferenceData;
import com.squareup.protos.franklin.common.NearbyVisibility;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class P2pSettingsManager$P2pSettings {
    public final Boolean canUpgradeToBusiness;
    public final Boolean cashBalanceHomeScreenButtonEnabled;
    public final DepositPreference depositPreference;
    public final DepositPreferenceData depositPreferenceData;
    public final IncomingRequestPolicy incomingRequestPolicy;
    public final NearbyVisibility nearbyVisibility;
    public final RatePlan ratePlan;
    public final int requireMinimumInitiatorNotesLengthForRequests;

    public P2pSettingsManager$P2pSettings(int i, IncomingRequestPolicy incomingRequestPolicy, NearbyVisibility nearbyVisibility, RatePlan ratePlan, Boolean bool, DepositPreference depositPreference, DepositPreferenceData depositPreferenceData, Boolean bool2) {
        this.requireMinimumInitiatorNotesLengthForRequests = i;
        this.incomingRequestPolicy = incomingRequestPolicy;
        this.nearbyVisibility = nearbyVisibility;
        this.ratePlan = ratePlan;
        this.canUpgradeToBusiness = bool;
        this.depositPreference = depositPreference;
        this.depositPreferenceData = depositPreferenceData;
        this.cashBalanceHomeScreenButtonEnabled = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2pSettingsManager$P2pSettings)) {
            return false;
        }
        P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings = (P2pSettingsManager$P2pSettings) obj;
        return this.requireMinimumInitiatorNotesLengthForRequests == p2pSettingsManager$P2pSettings.requireMinimumInitiatorNotesLengthForRequests && this.incomingRequestPolicy == p2pSettingsManager$P2pSettings.incomingRequestPolicy && this.nearbyVisibility == p2pSettingsManager$P2pSettings.nearbyVisibility && this.ratePlan == p2pSettingsManager$P2pSettings.ratePlan && Intrinsics.areEqual(this.canUpgradeToBusiness, p2pSettingsManager$P2pSettings.canUpgradeToBusiness) && this.depositPreference == p2pSettingsManager$P2pSettings.depositPreference && Intrinsics.areEqual(this.depositPreferenceData, p2pSettingsManager$P2pSettings.depositPreferenceData) && Intrinsics.areEqual(this.cashBalanceHomeScreenButtonEnabled, p2pSettingsManager$P2pSettings.cashBalanceHomeScreenButtonEnabled);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.requireMinimumInitiatorNotesLengthForRequests) * 31;
        IncomingRequestPolicy incomingRequestPolicy = this.incomingRequestPolicy;
        int hashCode2 = (hashCode + (incomingRequestPolicy == null ? 0 : incomingRequestPolicy.hashCode())) * 31;
        NearbyVisibility nearbyVisibility = this.nearbyVisibility;
        int hashCode3 = (hashCode2 + (nearbyVisibility == null ? 0 : nearbyVisibility.hashCode())) * 31;
        RatePlan ratePlan = this.ratePlan;
        int hashCode4 = (hashCode3 + (ratePlan == null ? 0 : ratePlan.hashCode())) * 31;
        Boolean bool = this.canUpgradeToBusiness;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        DepositPreference depositPreference = this.depositPreference;
        int hashCode6 = (hashCode5 + (depositPreference == null ? 0 : depositPreference.hashCode())) * 31;
        DepositPreferenceData depositPreferenceData = this.depositPreferenceData;
        int hashCode7 = (hashCode6 + (depositPreferenceData == null ? 0 : depositPreferenceData.hashCode())) * 31;
        Boolean bool2 = this.cashBalanceHomeScreenButtonEnabled;
        return hashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "P2pSettings(requireMinimumInitiatorNotesLengthForRequests=" + this.requireMinimumInitiatorNotesLengthForRequests + ", incomingRequestPolicy=" + this.incomingRequestPolicy + ", nearbyVisibility=" + this.nearbyVisibility + ", ratePlan=" + this.ratePlan + ", canUpgradeToBusiness=" + this.canUpgradeToBusiness + ", depositPreference=" + this.depositPreference + ", depositPreferenceData=" + this.depositPreferenceData + ", cashBalanceHomeScreenButtonEnabled=" + this.cashBalanceHomeScreenButtonEnabled + ")";
    }
}
