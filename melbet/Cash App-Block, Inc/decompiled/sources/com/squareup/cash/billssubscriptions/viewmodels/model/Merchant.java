package com.squareup.cash.billssubscriptions.viewmodels.model;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Merchant {
    public final String categoryToken;
    public final String name;
    public final MerchantLinkingStatus status;
    public final String subtitle;

    public Merchant(String str, String str2, String str3, MerchantLinkingStatus merchantLinkingStatus) {
        this.name = str;
        this.subtitle = str2;
        this.categoryToken = str3;
        this.status = merchantLinkingStatus;
    }

    public static Merchant copy$default(Merchant merchant) {
        MerchantLinkingStatus merchantLinkingStatus = MerchantLinkingStatus.LINKED;
        String str = merchant.name;
        String str2 = merchant.subtitle;
        String str3 = merchant.categoryToken;
        merchant.getClass();
        return new Merchant(str, str2, str3, merchantLinkingStatus);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Merchant)) {
            return false;
        }
        Merchant merchant = (Merchant) obj;
        return this.name.equals(merchant.name) && Intrinsics.areEqual(this.subtitle, merchant.subtitle) && this.categoryToken.equals(merchant.categoryToken) && this.status == merchant.status;
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.subtitle;
        return this.status.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.categoryToken);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Merchant(name=", this.name, ", subtitle=", this.subtitle, ", categoryToken=");
        m.append(this.categoryToken);
        m.append(", status=");
        m.append(this.status);
        m.append(")");
        return m.toString();
    }
}
