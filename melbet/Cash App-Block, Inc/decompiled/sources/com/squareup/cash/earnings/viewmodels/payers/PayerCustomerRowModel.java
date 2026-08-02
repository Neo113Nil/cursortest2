package com.squareup.cash.earnings.viewmodels.payers;

import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PayerCustomerRowModel {
    public final Color accentColor;
    public final String cashtag;
    public final String customerToken;
    public final String displayName;
    public final String imageUrl;
    public final boolean isSelected;
    public final Character monogram;

    public PayerCustomerRowModel(String str, String str2, String str3, Character ch, Color color, String str4, boolean z) {
        str.getClass();
        this.customerToken = str;
        this.displayName = str2;
        this.cashtag = str3;
        this.monogram = ch;
        this.accentColor = color;
        this.imageUrl = str4;
        this.isSelected = z;
    }

    public static PayerCustomerRowModel copy$default(PayerCustomerRowModel payerCustomerRowModel, boolean z) {
        String str = payerCustomerRowModel.customerToken;
        String str2 = payerCustomerRowModel.displayName;
        String str3 = payerCustomerRowModel.cashtag;
        Character ch = payerCustomerRowModel.monogram;
        Color color = payerCustomerRowModel.accentColor;
        String str4 = payerCustomerRowModel.imageUrl;
        payerCustomerRowModel.getClass();
        str.getClass();
        return new PayerCustomerRowModel(str, str2, str3, ch, color, str4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayerCustomerRowModel)) {
            return false;
        }
        PayerCustomerRowModel payerCustomerRowModel = (PayerCustomerRowModel) obj;
        return Intrinsics.areEqual(this.customerToken, payerCustomerRowModel.customerToken) && this.displayName.equals(payerCustomerRowModel.displayName) && this.cashtag.equals(payerCustomerRowModel.cashtag) && Intrinsics.areEqual(this.monogram, payerCustomerRowModel.monogram) && Intrinsics.areEqual(this.accentColor, payerCustomerRowModel.accentColor) && Intrinsics.areEqual(this.imageUrl, payerCustomerRowModel.imageUrl) && this.isSelected == payerCustomerRowModel.isSelected;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.customerToken.hashCode() * 31, 31, this.displayName), 31, this.cashtag);
        Character ch = this.monogram;
        int hashCode = (m + (ch == null ? 0 : ch.hashCode())) * 31;
        Color color = this.accentColor;
        int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
        String str = this.imageUrl;
        return Boolean.hashCode(this.isSelected) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PayerCustomerRowModel(customerToken=", this.customerToken, ", displayName=", this.displayName, ", cashtag=");
        m.append(this.cashtag);
        m.append(", monogram=");
        m.append(this.monogram);
        m.append(", accentColor=");
        m.append(this.accentColor);
        m.append(", imageUrl=");
        m.append(this.imageUrl);
        m.append(", isSelected=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isSelected, ")");
    }
}
