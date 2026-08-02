package com.squareup.cash.payments.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.versioned.Versioned;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentEntrypointButtonViewModel;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.Orientation;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class QuickPayState {
    public final Money acceptedFee;
    public final Money amount;
    public final BalanceSnapshot balanceSnapshot;
    public final Country countryCode;
    public final Boolean hasPassedIdv;
    public final boolean ignoreDuplicate;
    public final InstrumentLinkingConfig instrumentLinkingConfig;
    public final List instruments;
    public final boolean isAmountError;
    public final boolean isLoading;
    public final boolean isPromptForInstrumentOpen;
    public final String note;
    public final Orientation orientation;
    public final List paymentGetters;
    public final PersonalizePaymentEntrypointButtonViewModel personalizePaymentButtonState;
    public final Region region;
    public final String selectedInstrumentToken;
    public final Versioned shouldRequestNoteFocus;

    public QuickPayState(boolean z, Money money, Orientation orientation, Region region, boolean z2, Money money2, String str, Versioned versioned, BalanceSnapshot balanceSnapshot, List list, InstrumentLinkingConfig instrumentLinkingConfig, Boolean bool, Country country, boolean z3, String str2, boolean z4, List list2, PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel) {
        money.getClass();
        orientation.getClass();
        region.getClass();
        str.getClass();
        list.getClass();
        list2.getClass();
        personalizePaymentEntrypointButtonViewModel.getClass();
        this.isLoading = z;
        this.amount = money;
        this.orientation = orientation;
        this.region = region;
        this.ignoreDuplicate = z2;
        this.acceptedFee = money2;
        this.note = str;
        this.shouldRequestNoteFocus = versioned;
        this.balanceSnapshot = balanceSnapshot;
        this.instruments = list;
        this.instrumentLinkingConfig = instrumentLinkingConfig;
        this.hasPassedIdv = bool;
        this.countryCode = country;
        this.isPromptForInstrumentOpen = z3;
        this.selectedInstrumentToken = str2;
        this.isAmountError = z4;
        this.paymentGetters = list2;
        this.personalizePaymentButtonState = personalizePaymentEntrypointButtonViewModel;
    }

    public static QuickPayState copy$default(QuickPayState quickPayState, Money money, Orientation orientation, Region region, boolean z, Money money2, String str, Versioned versioned, BalanceSnapshot balanceSnapshot, List list, InstrumentLinkingConfig instrumentLinkingConfig, Boolean bool, Country country, boolean z2, String str2, boolean z3, List list2, PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel, int i) {
        boolean z4 = (i & 1) != 0 ? quickPayState.isLoading : false;
        Money money3 = (i & 2) != 0 ? quickPayState.amount : money;
        Orientation orientation2 = (i & 4) != 0 ? quickPayState.orientation : orientation;
        Region region2 = (i & 8) != 0 ? quickPayState.region : region;
        boolean z5 = (i & 16) != 0 ? quickPayState.ignoreDuplicate : z;
        Money money4 = (i & 32) != 0 ? quickPayState.acceptedFee : money2;
        String str3 = (i & 64) != 0 ? quickPayState.note : str;
        Versioned versioned2 = (i & 128) != 0 ? quickPayState.shouldRequestNoteFocus : versioned;
        BalanceSnapshot balanceSnapshot2 = (i & 256) != 0 ? quickPayState.balanceSnapshot : balanceSnapshot;
        List list3 = (i & 512) != 0 ? quickPayState.instruments : list;
        InstrumentLinkingConfig instrumentLinkingConfig2 = (i & 1024) != 0 ? quickPayState.instrumentLinkingConfig : instrumentLinkingConfig;
        Boolean bool2 = (i & 2048) != 0 ? quickPayState.hasPassedIdv : bool;
        Country country2 = (i & 4096) != 0 ? quickPayState.countryCode : country;
        boolean z6 = (i & PKIFailureInfo.certRevoked) != 0 ? quickPayState.isPromptForInstrumentOpen : z2;
        boolean z7 = z4;
        String str4 = (i & 16384) != 0 ? quickPayState.selectedInstrumentToken : str2;
        boolean z8 = (i & 32768) != 0 ? quickPayState.isAmountError : z3;
        List list4 = (i & 65536) != 0 ? quickPayState.paymentGetters : list2;
        PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel2 = (i & PKIFailureInfo.unsupportedVersion) != 0 ? quickPayState.personalizePaymentButtonState : personalizePaymentEntrypointButtonViewModel;
        quickPayState.getClass();
        money3.getClass();
        orientation2.getClass();
        region2.getClass();
        str3.getClass();
        list3.getClass();
        list4.getClass();
        personalizePaymentEntrypointButtonViewModel2.getClass();
        return new QuickPayState(z7, money3, orientation2, region2, z5, money4, str3, versioned2, balanceSnapshot2, list3, instrumentLinkingConfig2, bool2, country2, z6, str4, z8, list4, personalizePaymentEntrypointButtonViewModel2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPayState)) {
            return false;
        }
        QuickPayState quickPayState = (QuickPayState) obj;
        return this.isLoading == quickPayState.isLoading && Intrinsics.areEqual(this.amount, quickPayState.amount) && this.orientation == quickPayState.orientation && this.region == quickPayState.region && this.ignoreDuplicate == quickPayState.ignoreDuplicate && Intrinsics.areEqual(this.acceptedFee, quickPayState.acceptedFee) && Intrinsics.areEqual(this.note, quickPayState.note) && this.shouldRequestNoteFocus.equals(quickPayState.shouldRequestNoteFocus) && Intrinsics.areEqual(this.balanceSnapshot, quickPayState.balanceSnapshot) && Intrinsics.areEqual(this.instruments, quickPayState.instruments) && Intrinsics.areEqual(this.instrumentLinkingConfig, quickPayState.instrumentLinkingConfig) && Intrinsics.areEqual(this.hasPassedIdv, quickPayState.hasPassedIdv) && this.countryCode == quickPayState.countryCode && this.isPromptForInstrumentOpen == quickPayState.isPromptForInstrumentOpen && Intrinsics.areEqual(this.selectedInstrumentToken, quickPayState.selectedInstrumentToken) && this.isAmountError == quickPayState.isAmountError && Intrinsics.areEqual(this.paymentGetters, quickPayState.paymentGetters) && Intrinsics.areEqual(this.personalizePaymentButtonState, quickPayState.personalizePaymentButtonState);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.region.hashCode() + ((this.orientation.hashCode() + NavAction$$ExternalSyntheticOutline0.m(this.amount, Boolean.hashCode(this.isLoading) * 31, 31)) * 31)) * 31, 31, this.ignoreDuplicate);
        Money money = this.acceptedFee;
        int hashCode = (this.shouldRequestNoteFocus.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (money == null ? 0 : money.hashCode())) * 31, 31, this.note)) * 31;
        BalanceSnapshot balanceSnapshot = this.balanceSnapshot;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode + (balanceSnapshot == null ? 0 : balanceSnapshot.hashCode())) * 31, 31, this.instruments);
        InstrumentLinkingConfig instrumentLinkingConfig = this.instrumentLinkingConfig;
        int hashCode2 = (m2 + (instrumentLinkingConfig == null ? 0 : instrumentLinkingConfig.hashCode())) * 31;
        Boolean bool = this.hasPassedIdv;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Country country = this.countryCode;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (country == null ? 0 : country.hashCode())) * 31, 31, this.isPromptForInstrumentOpen);
        String str = this.selectedInstrumentToken;
        return this.personalizePaymentButtonState.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.isAmountError), 31, this.paymentGetters);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickPayState(isLoading=");
        sb.append(this.isLoading);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", orientation=");
        sb.append(this.orientation);
        sb.append(", region=");
        sb.append(this.region);
        sb.append(", ignoreDuplicate=");
        sb.append(this.ignoreDuplicate);
        sb.append(", acceptedFee=");
        sb.append(this.acceptedFee);
        sb.append(", note=");
        sb.append(this.note);
        sb.append(", shouldRequestNoteFocus=");
        sb.append(this.shouldRequestNoteFocus);
        sb.append(", balanceSnapshot=");
        sb.append(this.balanceSnapshot);
        sb.append(", instruments=");
        sb.append(this.instruments);
        sb.append(", instrumentLinkingConfig=");
        sb.append(this.instrumentLinkingConfig);
        sb.append(", hasPassedIdv=");
        sb.append(this.hasPassedIdv);
        sb.append(", countryCode=");
        sb.append(this.countryCode);
        sb.append(", isPromptForInstrumentOpen=");
        sb.append(this.isPromptForInstrumentOpen);
        sb.append(", selectedInstrumentToken=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.selectedInstrumentToken, ", isAmountError=", this.isAmountError, ", paymentGetters=");
        sb.append(this.paymentGetters);
        sb.append(", personalizePaymentButtonState=");
        sb.append(this.personalizePaymentButtonState);
        sb.append(")");
        return sb.toString();
    }
}
