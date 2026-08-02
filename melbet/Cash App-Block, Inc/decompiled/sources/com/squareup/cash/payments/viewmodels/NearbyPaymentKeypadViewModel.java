package com.squareup.cash.payments.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.protos.common.CurrencyCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NearbyPaymentKeypadViewModel {
    public final CurrencyCode currencyCode;
    public final String initialAmount;
    public final InstrumentAvatarViewModel instrumentAvatarViewModel;
    public final String instrumentLabel;
    public final String instrumentSubLabel;
    public final boolean isPayEnabled;
    public final RecipientViewModel recipient;

    public NearbyPaymentKeypadViewModel(RecipientViewModel recipientViewModel, CurrencyCode currencyCode, String str, String str2, String str3, boolean z, InstrumentAvatarViewModel instrumentAvatarViewModel) {
        recipientViewModel.getClass();
        currencyCode.getClass();
        this.recipient = recipientViewModel;
        this.currencyCode = currencyCode;
        this.initialAmount = str;
        this.instrumentLabel = str2;
        this.instrumentSubLabel = str3;
        this.isPayEnabled = z;
        this.instrumentAvatarViewModel = instrumentAvatarViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPaymentKeypadViewModel)) {
            return false;
        }
        NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = (NearbyPaymentKeypadViewModel) obj;
        return Intrinsics.areEqual(this.recipient, nearbyPaymentKeypadViewModel.recipient) && this.currencyCode == nearbyPaymentKeypadViewModel.currencyCode && this.initialAmount.equals(nearbyPaymentKeypadViewModel.initialAmount) && this.instrumentLabel.equals(nearbyPaymentKeypadViewModel.instrumentLabel) && this.instrumentSubLabel.equals(nearbyPaymentKeypadViewModel.instrumentSubLabel) && this.isPayEnabled == nearbyPaymentKeypadViewModel.isPayEnabled && Intrinsics.areEqual(this.instrumentAvatarViewModel, nearbyPaymentKeypadViewModel.instrumentAvatarViewModel);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.currencyCode.hashCode() + (this.recipient.hashCode() * 31)) * 31, 31, this.initialAmount), 31, this.instrumentLabel), 31, this.instrumentSubLabel), 31, this.isPayEnabled);
        InstrumentAvatarViewModel instrumentAvatarViewModel = this.instrumentAvatarViewModel;
        return m + (instrumentAvatarViewModel == null ? 0 : instrumentAvatarViewModel.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyPaymentKeypadViewModel(recipient=");
        sb.append(this.recipient);
        sb.append(", currencyCode=");
        sb.append(this.currencyCode);
        sb.append(", initialAmount=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.initialAmount, ", instrumentLabel=", this.instrumentLabel, ", instrumentSubLabel=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.instrumentSubLabel, ", isPayEnabled=", this.isPayEnabled, ", instrumentAvatarViewModel=");
        sb.append(this.instrumentAvatarViewModel);
        sb.append(")");
        return sb.toString();
    }
}
