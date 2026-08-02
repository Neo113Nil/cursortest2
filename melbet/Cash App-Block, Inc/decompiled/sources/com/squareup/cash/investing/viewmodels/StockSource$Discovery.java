package com.squareup.cash.investing.viewmodels;

import com.nimbusds.jose.util.DeflateUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StockSource$Discovery extends DeflateUtils {
    public final String analyticsSource;

    public StockSource$Discovery(String str) {
        str.getClass();
        this.analyticsSource = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StockSource$Discovery) && Intrinsics.areEqual(this.analyticsSource, ((StockSource$Discovery) obj).analyticsSource);
    }

    public final int hashCode() {
        return this.analyticsSource.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Discovery(analyticsSource=", this.analyticsSource, ")");
    }
}
