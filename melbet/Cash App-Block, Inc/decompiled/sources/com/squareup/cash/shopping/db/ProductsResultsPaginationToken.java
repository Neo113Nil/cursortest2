package com.squareup.cash.shopping.db;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProductsResultsPaginationToken {
    public final String token;

    public ProductsResultsPaginationToken(String str) {
        this.token = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductsResultsPaginationToken) && Intrinsics.areEqual(this.token, ((ProductsResultsPaginationToken) obj).token);
    }

    public final int hashCode() {
        String str = this.token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProductsResultsPaginationToken(token=", this.token, ")");
    }
}
