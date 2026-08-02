package com.squareup.cash.boost.backend.analytics;

import androidx.compose.ui.platform.DerivedSize;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class BoostAppLocation$MerchantProfile extends DerivedSize.Companion {
    public final String referrerFlowToken;

    public BoostAppLocation$MerchantProfile(String str) {
        this.referrerFlowToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BoostAppLocation$MerchantProfile) && Intrinsics.areEqual(this.referrerFlowToken, ((BoostAppLocation$MerchantProfile) obj).referrerFlowToken);
    }

    public final int hashCode() {
        String str = this.referrerFlowToken;
        return (str == null ? 0 : str.hashCode()) * 31;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MerchantProfile(referrerFlowToken=", this.referrerFlowToken, ", origin=null)");
    }
}
