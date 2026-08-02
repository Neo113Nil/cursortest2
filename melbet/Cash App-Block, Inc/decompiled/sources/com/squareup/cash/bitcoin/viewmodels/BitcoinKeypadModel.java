package com.squareup.cash.bitcoin.viewmodels;

import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes5.dex */
public final class BitcoinKeypadModel {
    public final String convertedAmount;
    public final BitcoinDisplayUnits displayUnits;
    public final AndroidTileMode_androidKt error;
    public final String subtitle;
    public final Money transferMoney;
    public final String transferRawAmount;

    public BitcoinKeypadModel(String str, BitcoinDisplayUnits bitcoinDisplayUnits, Money money, String str2, String str3, AndroidTileMode_androidKt androidTileMode_androidKt) {
        money.getClass();
        str3.getClass();
        this.subtitle = str;
        this.displayUnits = bitcoinDisplayUnits;
        this.transferMoney = money;
        this.transferRawAmount = str2;
        this.convertedAmount = str3;
        this.error = androidTileMode_androidKt;
    }

    public static BitcoinKeypadModel copy$default(BitcoinKeypadModel bitcoinKeypadModel, String str, AndroidTileMode_androidKt androidTileMode_androidKt, int i) {
        if ((i & 1) != 0) {
            str = bitcoinKeypadModel.subtitle;
        }
        String str2 = str;
        BitcoinDisplayUnits bitcoinDisplayUnits = bitcoinKeypadModel.displayUnits;
        Money money = bitcoinKeypadModel.transferMoney;
        String str3 = bitcoinKeypadModel.transferRawAmount;
        String str4 = bitcoinKeypadModel.convertedAmount;
        if ((i & 32) != 0) {
            androidTileMode_androidKt = bitcoinKeypadModel.error;
        }
        bitcoinKeypadModel.getClass();
        str2.getClass();
        money.getClass();
        str4.getClass();
        return new BitcoinKeypadModel(str2, bitcoinDisplayUnits, money, str3, str4, androidTileMode_androidKt);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinKeypadModel)) {
            return false;
        }
        BitcoinKeypadModel bitcoinKeypadModel = (BitcoinKeypadModel) obj;
        return this.subtitle.equals(bitcoinKeypadModel.subtitle) && this.displayUnits == bitcoinKeypadModel.displayUnits && Intrinsics.areEqual(this.transferMoney, bitcoinKeypadModel.transferMoney) && this.transferRawAmount.equals(bitcoinKeypadModel.transferRawAmount) && Intrinsics.areEqual(this.convertedAmount, bitcoinKeypadModel.convertedAmount) && Intrinsics.areEqual(this.error, bitcoinKeypadModel.error);
    }

    public final int hashCode() {
        int hashCode = this.subtitle.hashCode() * 31;
        BitcoinDisplayUnits bitcoinDisplayUnits = this.displayUnits;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.transferMoney, (hashCode + (bitcoinDisplayUnits == null ? 0 : bitcoinDisplayUnits.hashCode())) * 31, 31), 31, this.transferRawAmount), 31, this.convertedAmount);
        AndroidTileMode_androidKt androidTileMode_androidKt = this.error;
        return m + (androidTileMode_androidKt != null ? androidTileMode_androidKt.hashCode() : 0);
    }
}
