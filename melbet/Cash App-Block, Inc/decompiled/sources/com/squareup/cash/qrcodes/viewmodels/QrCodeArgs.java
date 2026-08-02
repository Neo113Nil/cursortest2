package com.squareup.cash.qrcodes.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class QrCodeArgs {
    public final Integer backgroundColor;
    public final CurrencyCode currency;
    public final Integer currencyColor;
    public final Integer logoColor;
    public final int retryKey;
    public final boolean saveToTemporaryStorage;
    public final Integer size;

    public /* synthetic */ QrCodeArgs(Integer num, Integer num2, Integer num3, Integer num4, CurrencyCode currencyCode, int i, int i2) {
        this(num, num2, num3, (i2 & 8) != 0 ? null : num4, (i2 & 16) != 0 ? null : currencyCode, (i2 & 32) == 0, (i2 & 64) != 0 ? 0 : i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrCodeArgs)) {
            return false;
        }
        QrCodeArgs qrCodeArgs = (QrCodeArgs) obj;
        return Intrinsics.areEqual(this.backgroundColor, qrCodeArgs.backgroundColor) && Intrinsics.areEqual(this.logoColor, qrCodeArgs.logoColor) && Intrinsics.areEqual(this.size, qrCodeArgs.size) && Intrinsics.areEqual(this.currencyColor, qrCodeArgs.currencyColor) && this.currency == qrCodeArgs.currency && this.saveToTemporaryStorage == qrCodeArgs.saveToTemporaryStorage && this.retryKey == qrCodeArgs.retryKey;
    }

    public final int hashCode() {
        Integer num = this.backgroundColor;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.logoColor;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.size;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.currencyColor;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        CurrencyCode currencyCode = this.currency;
        return Integer.hashCode(this.retryKey) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (currencyCode != null ? currencyCode.hashCode() : 0)) * 31, 31, this.saveToTemporaryStorage);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QrCodeArgs(backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", logoColor=");
        sb.append(this.logoColor);
        sb.append(", size=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.size, ", currencyColor=", this.currencyColor, ", currency=");
        sb.append(this.currency);
        sb.append(", saveToTemporaryStorage=");
        sb.append(this.saveToTemporaryStorage);
        sb.append(", retryKey=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.retryKey, ")", sb);
    }

    public QrCodeArgs(Integer num, Integer num2, Integer num3, Integer num4, CurrencyCode currencyCode, boolean z, int i) {
        this.backgroundColor = num;
        this.logoColor = num2;
        this.size = num3;
        this.currencyColor = num4;
        this.currency = currencyCode;
        this.saveToTemporaryStorage = z;
        this.retryKey = i;
    }
}
