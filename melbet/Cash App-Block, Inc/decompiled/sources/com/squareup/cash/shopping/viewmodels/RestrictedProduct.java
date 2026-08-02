package com.squareup.cash.shopping.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class RestrictedProduct {
    public final String productName;

    public RestrictedProduct(String str) {
        this.productName = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RestrictedProduct) && Intrinsics.areEqual(this.productName, ((RestrictedProduct) obj).productName);
    }

    public final int hashCode() {
        String str = this.productName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RestrictedProduct(productName=", this.productName, ")");
    }
}
