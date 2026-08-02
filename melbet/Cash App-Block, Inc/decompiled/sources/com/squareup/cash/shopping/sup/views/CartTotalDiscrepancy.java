package com.squareup.cash.shopping.sup.views;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class CartTotalDiscrepancy {
    public final String availableLimit;
    public final String cartTotal;
    public final String minimumOrderAmount;

    public CartTotalDiscrepancy(String str, String str2, String str3, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str.getClass();
        this.cartTotal = str;
        this.availableLimit = str2;
        this.minimumOrderAmount = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartTotalDiscrepancy)) {
            return false;
        }
        CartTotalDiscrepancy cartTotalDiscrepancy = (CartTotalDiscrepancy) obj;
        return Intrinsics.areEqual(this.cartTotal, cartTotalDiscrepancy.cartTotal) && Intrinsics.areEqual(this.availableLimit, cartTotalDiscrepancy.availableLimit) && Intrinsics.areEqual(this.minimumOrderAmount, cartTotalDiscrepancy.minimumOrderAmount);
    }

    public final int hashCode() {
        int hashCode = this.cartTotal.hashCode() * 31;
        String str = this.availableLimit;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.minimumOrderAmount;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CartTotalDiscrepancy(cartTotal=", this.cartTotal, ", availableLimit=", this.availableLimit, ", minimumOrderAmount="), this.minimumOrderAmount, ")");
    }
}
