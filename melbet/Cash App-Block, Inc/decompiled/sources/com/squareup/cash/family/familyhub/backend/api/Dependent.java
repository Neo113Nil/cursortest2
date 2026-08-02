package com.squareup.cash.family.familyhub.backend.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Dependent {
    public final String cardStatusErrorText;
    public final String customerToken;
    public final String lockCardWarningText;
    public final String sendCashCtaText;
    public final String sendCashCtaUrl;
    public final SponsorshipState sponsorshipState;
    public final String switchingIdentifier;

    public Dependent(String str, String str2, String str3, String str4, String str5, SponsorshipState sponsorshipState, String str6) {
        this.customerToken = str;
        this.sendCashCtaText = str2;
        this.sendCashCtaUrl = str3;
        this.lockCardWarningText = str4;
        this.cardStatusErrorText = str5;
        this.sponsorshipState = sponsorshipState;
        this.switchingIdentifier = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dependent)) {
            return false;
        }
        Dependent dependent = (Dependent) obj;
        return this.customerToken.equals(dependent.customerToken) && this.sendCashCtaText.equals(dependent.sendCashCtaText) && this.sendCashCtaUrl.equals(dependent.sendCashCtaUrl) && Intrinsics.areEqual(this.lockCardWarningText, dependent.lockCardWarningText) && Intrinsics.areEqual(this.cardStatusErrorText, dependent.cardStatusErrorText) && this.sponsorshipState == dependent.sponsorshipState && Intrinsics.areEqual(this.switchingIdentifier, dependent.switchingIdentifier);
    }

    public final SponsorshipState getSponsorshipState() {
        return this.sponsorshipState;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.customerToken.hashCode() * 31, 31, this.sendCashCtaText), 31, this.sendCashCtaUrl);
        String str = this.lockCardWarningText;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cardStatusErrorText;
        int hashCode2 = (this.sponsorshipState.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.switchingIdentifier;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Dependent(customerToken=", this.customerToken, ", sendCashCtaText=", this.sendCashCtaText, ", sendCashCtaUrl=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.sendCashCtaUrl, ", lockCardWarningText=", this.lockCardWarningText, ", cardStatusErrorText=");
        m.append(this.cardStatusErrorText);
        m.append(", sponsorshipState=");
        m.append(this.sponsorshipState);
        m.append(", switchingIdentifier=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.switchingIdentifier, ")");
    }
}
