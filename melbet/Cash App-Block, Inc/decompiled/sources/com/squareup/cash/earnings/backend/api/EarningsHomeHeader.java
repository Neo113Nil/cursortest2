package com.squareup.cash.earnings.backend.api;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EarningsHomeHeader {
    public final boolean showsChart;
    public final String title;

    public EarningsHomeHeader(String str, boolean z) {
        this.title = str;
        this.showsChart = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsHomeHeader)) {
            return false;
        }
        EarningsHomeHeader earningsHomeHeader = (EarningsHomeHeader) obj;
        return Intrinsics.areEqual(this.title, earningsHomeHeader.title) && this.showsChart == earningsHomeHeader.showsChart;
    }

    public final int hashCode() {
        String str = this.title;
        return Boolean.hashCode(this.showsChart) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("EarningsHomeHeader(title=", this.title, ", showsChart=", ")", this.showsChart);
    }
}
