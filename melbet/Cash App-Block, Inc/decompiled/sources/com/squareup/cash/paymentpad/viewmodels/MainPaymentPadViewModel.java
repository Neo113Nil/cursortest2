package com.squareup.cash.paymentpad.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MainPaymentPadViewModel {
    public final String amountErrorId;
    public final CurrencyCode currencyCode;
    public final String errorMessage;
    public final boolean forceReset;
    public final HypeConfig hypeConfig;
    public final boolean isRestoring;
    public final String limitHelperText;
    public final PaymentPadTheme paymentPadTheme;
    public final String rawAmount;
    public final FiatResetAmount resetAmount;
    public final boolean showHypeAnimation;
    public final boolean showPoolsButton;
    public final boolean showTapToPay;

    public MainPaymentPadViewModel(String str, CurrencyCode currencyCode, String str2, String str3, FiatResetAmount fiatResetAmount, boolean z, boolean z2, boolean z3, boolean z4, PaymentPadTheme paymentPadTheme, HypeConfig hypeConfig, boolean z5, String str4) {
        currencyCode.getClass();
        paymentPadTheme.getClass();
        this.rawAmount = str;
        this.currencyCode = currencyCode;
        this.amountErrorId = str2;
        this.errorMessage = str3;
        this.resetAmount = fiatResetAmount;
        this.showTapToPay = z;
        this.showPoolsButton = z2;
        this.isRestoring = z3;
        this.forceReset = z4;
        this.paymentPadTheme = paymentPadTheme;
        this.hypeConfig = hypeConfig;
        this.showHypeAnimation = z5;
        this.limitHelperText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainPaymentPadViewModel)) {
            return false;
        }
        MainPaymentPadViewModel mainPaymentPadViewModel = (MainPaymentPadViewModel) obj;
        return this.rawAmount.equals(mainPaymentPadViewModel.rawAmount) && this.currencyCode == mainPaymentPadViewModel.currencyCode && Intrinsics.areEqual(this.amountErrorId, mainPaymentPadViewModel.amountErrorId) && Intrinsics.areEqual(this.errorMessage, mainPaymentPadViewModel.errorMessage) && Intrinsics.areEqual(this.resetAmount, mainPaymentPadViewModel.resetAmount) && this.showTapToPay == mainPaymentPadViewModel.showTapToPay && this.showPoolsButton == mainPaymentPadViewModel.showPoolsButton && this.isRestoring == mainPaymentPadViewModel.isRestoring && this.forceReset == mainPaymentPadViewModel.forceReset && this.paymentPadTheme == mainPaymentPadViewModel.paymentPadTheme && Intrinsics.areEqual(this.hypeConfig, mainPaymentPadViewModel.hypeConfig) && this.showHypeAnimation == mainPaymentPadViewModel.showHypeAnimation && Intrinsics.areEqual(this.limitHelperText, mainPaymentPadViewModel.limitHelperText);
    }

    public final int hashCode() {
        int hashCode = (this.currencyCode.hashCode() + (this.rawAmount.hashCode() * 31)) * 31;
        String str = this.amountErrorId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FiatResetAmount fiatResetAmount = this.resetAmount;
        int hashCode4 = (this.paymentPadTheme.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (fiatResetAmount == null ? 0 : fiatResetAmount.hashCode())) * 31, 31, this.showTapToPay), 31, this.showPoolsButton), 31, this.isRestoring), 31, this.forceReset)) * 31;
        HypeConfig hypeConfig = this.hypeConfig;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (hypeConfig == null ? 0 : hypeConfig.hashCode())) * 31, 31, this.showHypeAnimation);
        String str3 = this.limitHelperText;
        return m + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainPaymentPadViewModel(rawAmount=");
        sb.append(this.rawAmount);
        sb.append(", currencyCode=");
        sb.append(this.currencyCode);
        sb.append(", amountErrorId=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.amountErrorId, ", errorMessage=", this.errorMessage, ", resetAmount=");
        sb.append(this.resetAmount);
        sb.append(", showTapToPay=");
        sb.append(this.showTapToPay);
        sb.append(", showPoolsButton=");
        re$$ExternalSyntheticOutline0.m(sb, this.showPoolsButton, ", isRestoring=", this.isRestoring, ", forceReset=");
        sb.append(this.forceReset);
        sb.append(", paymentPadTheme=");
        sb.append(this.paymentPadTheme);
        sb.append(", hypeConfig=");
        sb.append(this.hypeConfig);
        sb.append(", showHypeAnimation=");
        sb.append(this.showHypeAnimation);
        sb.append(", limitHelperText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.limitHelperText, ")");
    }
}
