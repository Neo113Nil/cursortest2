package com.squareup.cash.payments.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NearbyPaymentsInfoInfoItem {
    public final String body;
    public final NearbyPaymentsInfoIcon icon;
    public final String label;

    public NearbyPaymentsInfoInfoItem(NearbyPaymentsInfoIcon nearbyPaymentsInfoIcon, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.icon = nearbyPaymentsInfoIcon;
        this.label = str;
        this.body = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPaymentsInfoInfoItem)) {
            return false;
        }
        NearbyPaymentsInfoInfoItem nearbyPaymentsInfoInfoItem = (NearbyPaymentsInfoInfoItem) obj;
        return this.icon == nearbyPaymentsInfoInfoItem.icon && Intrinsics.areEqual(this.label, nearbyPaymentsInfoInfoItem.label) && Intrinsics.areEqual(this.body, nearbyPaymentsInfoInfoItem.body);
    }

    public final int hashCode() {
        return this.body.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.label);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyPaymentsInfoInfoItem(icon=");
        sb.append(this.icon);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", body=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.body, ")");
    }
}
