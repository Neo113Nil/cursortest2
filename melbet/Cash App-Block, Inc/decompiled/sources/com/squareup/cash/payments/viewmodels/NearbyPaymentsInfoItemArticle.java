package com.squareup.cash.payments.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class NearbyPaymentsInfoItemArticle {
    public final String label;

    /* renamed from: type, reason: collision with root package name */
    public final NearbyPaymentsInfoItem f1186type;

    public NearbyPaymentsInfoItemArticle(NearbyPaymentsInfoItem nearbyPaymentsInfoItem, String str) {
        str.getClass();
        this.f1186type = nearbyPaymentsInfoItem;
        this.label = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPaymentsInfoItemArticle)) {
            return false;
        }
        NearbyPaymentsInfoItemArticle nearbyPaymentsInfoItemArticle = (NearbyPaymentsInfoItemArticle) obj;
        return this.f1186type == nearbyPaymentsInfoItemArticle.f1186type && Intrinsics.areEqual(this.label, nearbyPaymentsInfoItemArticle.label);
    }

    public final int hashCode() {
        return this.label.hashCode() + (this.f1186type.hashCode() * 31);
    }

    public final String toString() {
        return "NearbyPaymentsInfoItemArticle(type=" + this.f1186type + ", label=" + this.label + ")";
    }
}
