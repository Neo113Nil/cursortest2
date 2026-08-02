package com.squareup.cash.moneybot.viewmodels.amountinput;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotAmountInputViewModel {
    public final String ctaText;
    public final boolean enableContinue;
    public final AmountConfig.MoneyConfig moneyConfig;
    public final String rawAmount;
    public final String subtitle;
    public final String title;

    public MoneybotAmountInputViewModel(String str, AmountConfig.MoneyConfig moneyConfig, boolean z, String str2, String str3, String str4) {
        str.getClass();
        this.rawAmount = str;
        this.moneyConfig = moneyConfig;
        this.enableContinue = z;
        this.title = str2;
        this.subtitle = str3;
        this.ctaText = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotAmountInputViewModel)) {
            return false;
        }
        MoneybotAmountInputViewModel moneybotAmountInputViewModel = (MoneybotAmountInputViewModel) obj;
        return Intrinsics.areEqual(this.rawAmount, moneybotAmountInputViewModel.rawAmount) && this.moneyConfig.equals(moneybotAmountInputViewModel.moneyConfig) && this.enableContinue == moneybotAmountInputViewModel.enableContinue && Intrinsics.areEqual(this.title, moneybotAmountInputViewModel.title) && Intrinsics.areEqual(this.subtitle, moneybotAmountInputViewModel.subtitle) && Intrinsics.areEqual(this.ctaText, moneybotAmountInputViewModel.ctaText);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.moneyConfig.hashCode() + (this.rawAmount.hashCode() * 31)) * 31, 31, this.enableContinue);
        String str = this.title;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ctaText;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneybotAmountInputViewModel(rawAmount=");
        sb.append(this.rawAmount);
        sb.append(", moneyConfig=");
        sb.append(this.moneyConfig);
        sb.append(", enableContinue=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.enableContinue, ", title=", this.title, ", subtitle=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.subtitle, ", ctaText=", this.ctaText, ")");
    }
}
