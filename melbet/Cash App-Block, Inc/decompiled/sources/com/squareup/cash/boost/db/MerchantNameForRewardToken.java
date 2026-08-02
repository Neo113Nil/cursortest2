package com.squareup.cash.boost.db;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class MerchantNameForRewardToken {
    public final String merchant_name;

    public MerchantNameForRewardToken(String str) {
        this.merchant_name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MerchantNameForRewardToken) && Intrinsics.areEqual(this.merchant_name, ((MerchantNameForRewardToken) obj).merchant_name);
    }

    public final int hashCode() {
        String str = this.merchant_name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MerchantNameForRewardToken(merchant_name=", this.merchant_name, ")");
    }
}
