package com.squareup.cash.earningstracker.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CustomerViewModel {
    public final AvatarViewModel avatar;
    public final String cashtag;
    public final String customerToken;
    public final String formattedSalesAmount;
    public final int sales;

    public CustomerViewModel(String str, String str2, int i, String str3, AvatarViewModel avatarViewModel) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.customerToken = str;
        this.cashtag = str2;
        this.sales = i;
        this.formattedSalesAmount = str3;
        this.avatar = avatarViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerViewModel)) {
            return false;
        }
        CustomerViewModel customerViewModel = (CustomerViewModel) obj;
        return Intrinsics.areEqual(this.customerToken, customerViewModel.customerToken) && Intrinsics.areEqual(this.cashtag, customerViewModel.cashtag) && this.sales == customerViewModel.sales && Intrinsics.areEqual(this.formattedSalesAmount, customerViewModel.formattedSalesAmount) && this.avatar.equals(customerViewModel.avatar);
    }

    public final int hashCode() {
        return this.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sales, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.customerToken.hashCode() * 31, 31, this.cashtag), 31), 31, this.formattedSalesAmount);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerViewModel(customerToken=", this.customerToken, ", cashtag=", this.cashtag, ", sales=");
        m.append(this.sales);
        m.append(", formattedSalesAmount=");
        m.append(this.formattedSalesAmount);
        m.append(", avatar=");
        m.append(this.avatar);
        m.append(")");
        return m.toString();
    }
}
