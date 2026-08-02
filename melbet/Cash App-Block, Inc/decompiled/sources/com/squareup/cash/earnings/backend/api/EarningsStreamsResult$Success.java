package com.squareup.cash.earnings.backend.api;

import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.protos.common.CurrencyCode;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EarningsStreamsResult$Success {
    public final CurrencyCode fallbackCurrency;
    public final List streams;
    public final Lazy totalEarnings$delegate;

    public EarningsStreamsResult$Success(List list, CurrencyCode currencyCode) {
        list.getClass();
        currencyCode.getClass();
        this.streams = list;
        this.fallbackCurrency = currencyCode;
        this.totalEarnings$delegate = LazyKt.lazy(new ArcadeModal$$ExternalSyntheticLambda2(this, 10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsStreamsResult$Success)) {
            return false;
        }
        EarningsStreamsResult$Success earningsStreamsResult$Success = (EarningsStreamsResult$Success) obj;
        return Intrinsics.areEqual(this.streams, earningsStreamsResult$Success.streams) && this.fallbackCurrency == earningsStreamsResult$Success.fallbackCurrency;
    }

    public final int hashCode() {
        return this.fallbackCurrency.hashCode() + (this.streams.hashCode() * 31);
    }

    public final String toString() {
        return "Success(streams=" + this.streams + ", fallbackCurrency=" + this.fallbackCurrency + ")";
    }
}
