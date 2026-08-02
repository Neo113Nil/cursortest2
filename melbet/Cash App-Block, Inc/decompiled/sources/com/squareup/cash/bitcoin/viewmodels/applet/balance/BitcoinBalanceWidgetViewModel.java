package com.squareup.cash.bitcoin.viewmodels.applet.balance;

import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinBalanceWidgetViewModel implements BitcoinHomeWidgetViewModel {
    public final String amount;
    public final Long rawAmount;
    public final String sectionTitle;
    public final String subAmount;

    public BitcoinBalanceWidgetViewModel(String str, String str2, String str3, Long l) {
        this.amount = str;
        this.rawAmount = l;
        this.subAmount = str2;
        this.sectionTitle = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinBalanceWidgetViewModel)) {
            return false;
        }
        BitcoinBalanceWidgetViewModel bitcoinBalanceWidgetViewModel = (BitcoinBalanceWidgetViewModel) obj;
        return Intrinsics.areEqual(this.amount, bitcoinBalanceWidgetViewModel.amount) && Intrinsics.areEqual(this.rawAmount, bitcoinBalanceWidgetViewModel.rawAmount) && Intrinsics.areEqual(this.subAmount, bitcoinBalanceWidgetViewModel.subAmount) && Intrinsics.areEqual(this.sectionTitle, bitcoinBalanceWidgetViewModel.sectionTitle);
    }

    public final int hashCode() {
        String str = this.amount;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.rawAmount;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.subAmount;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sectionTitle;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(RumErrorSource$EnumUnboxingLocalUtility.m(this.rawAmount, "BitcoinBalanceWidgetViewModel(amount=", this.amount, ", rawAmount=", ", subAmount="), this.subAmount, ", sectionTitle=", this.sectionTitle, ")");
    }
}
