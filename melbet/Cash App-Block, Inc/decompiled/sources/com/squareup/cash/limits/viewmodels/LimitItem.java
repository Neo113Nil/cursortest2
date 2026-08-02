package com.squareup.cash.limits.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LimitItem {
    public final String amount;
    public final String label;

    public LimitItem(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.label = str;
        this.amount = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitItem)) {
            return false;
        }
        LimitItem limitItem = (LimitItem) obj;
        return Intrinsics.areEqual(this.label, limitItem.label) && Intrinsics.areEqual(this.amount, limitItem.amount);
    }

    public final int hashCode() {
        return this.amount.hashCode() + (this.label.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("LimitItem(label=", this.label, ", amount=", this.amount, ")");
    }
}
