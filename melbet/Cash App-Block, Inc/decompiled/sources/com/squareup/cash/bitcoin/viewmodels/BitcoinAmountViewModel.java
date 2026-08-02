package com.squareup.cash.bitcoin.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BitcoinAmountViewModel {
    public final String actionButtonText;
    public final String initialAmount;
    public final boolean isActionEnabled;
    public final boolean isLoading;
    public final boolean isReady;
    public final boolean isSubtitleVisible;
    public final BitcoinKeypadModel keypadModel;
    public final String noteButtonText;
    public final String title;

    public /* synthetic */ BitcoinAmountViewModel(int i, BitcoinKeypadModel bitcoinKeypadModel, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this(z, (i & 2) == 0, "", z2, str, z3, bitcoinKeypadModel, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : str3);
    }

    public static BitcoinAmountViewModel copy$default(BitcoinAmountViewModel bitcoinAmountViewModel, boolean z, String str, boolean z2, String str2, BitcoinKeypadModel bitcoinKeypadModel, int i) {
        boolean z3 = bitcoinAmountViewModel.isReady;
        if ((i & 2) != 0) {
            z = bitcoinAmountViewModel.isLoading;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            str = bitcoinAmountViewModel.title;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            z2 = bitcoinAmountViewModel.isSubtitleVisible;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            str2 = bitcoinAmountViewModel.actionButtonText;
        }
        String str4 = str2;
        boolean z6 = bitcoinAmountViewModel.isActionEnabled;
        BitcoinKeypadModel bitcoinKeypadModel2 = (i & 64) != 0 ? bitcoinAmountViewModel.keypadModel : bitcoinKeypadModel;
        String str5 = (i & 128) != 0 ? bitcoinAmountViewModel.noteButtonText : null;
        String str6 = bitcoinAmountViewModel.initialAmount;
        bitcoinAmountViewModel.getClass();
        str3.getClass();
        str4.getClass();
        bitcoinKeypadModel2.getClass();
        return new BitcoinAmountViewModel(z3, z4, str3, z5, str4, z6, bitcoinKeypadModel2, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinAmountViewModel)) {
            return false;
        }
        BitcoinAmountViewModel bitcoinAmountViewModel = (BitcoinAmountViewModel) obj;
        return this.isReady == bitcoinAmountViewModel.isReady && this.isLoading == bitcoinAmountViewModel.isLoading && Intrinsics.areEqual(this.title, bitcoinAmountViewModel.title) && this.isSubtitleVisible == bitcoinAmountViewModel.isSubtitleVisible && Intrinsics.areEqual(this.actionButtonText, bitcoinAmountViewModel.actionButtonText) && this.isActionEnabled == bitcoinAmountViewModel.isActionEnabled && Intrinsics.areEqual(this.keypadModel, bitcoinAmountViewModel.keypadModel) && Intrinsics.areEqual(this.noteButtonText, bitcoinAmountViewModel.noteButtonText) && Intrinsics.areEqual(this.initialAmount, bitcoinAmountViewModel.initialAmount);
    }

    public final int hashCode() {
        int hashCode = (this.keypadModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.isReady) * 31, 31, this.isLoading), 31, this.title), 31, this.isSubtitleVisible), 31, this.actionButtonText), 31, this.isActionEnabled)) * 31;
        String str = this.noteButtonText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.initialAmount;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("BitcoinAmountViewModel(isReady=", ", isLoading=", ", title=", this.isReady, this.isLoading);
        NavAction$$ExternalSyntheticOutline0.m(m, this.title, ", isSubtitleVisible=", this.isSubtitleVisible, ", actionButtonText=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.actionButtonText, ", isActionEnabled=", this.isActionEnabled, ", keypadModel=");
        m.append(this.keypadModel);
        m.append(", noteButtonText=");
        m.append(this.noteButtonText);
        m.append(", initialAmount=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.initialAmount, ")");
    }

    public BitcoinAmountViewModel(boolean z, boolean z2, String str, boolean z3, String str2, boolean z4, BitcoinKeypadModel bitcoinKeypadModel, String str3, String str4) {
        str2.getClass();
        this.isReady = z;
        this.isLoading = z2;
        this.title = str;
        this.isSubtitleVisible = z3;
        this.actionButtonText = str2;
        this.isActionEnabled = z4;
        this.keypadModel = bitcoinKeypadModel;
        this.noteButtonText = str3;
        this.initialAmount = str4;
    }
}
