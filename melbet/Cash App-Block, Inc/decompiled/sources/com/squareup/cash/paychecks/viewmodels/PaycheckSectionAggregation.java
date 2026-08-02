package com.squareup.cash.paychecks.viewmodels;

import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaycheckSectionAggregation {
    public final String aggregatedValue;
    public final PaychecksUiState.CalendarMonthPaychecksAggregation payload;

    public PaycheckSectionAggregation(String str, PaychecksUiState.CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation) {
        str.getClass();
        this.aggregatedValue = str;
        this.payload = calendarMonthPaychecksAggregation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaycheckSectionAggregation)) {
            return false;
        }
        PaycheckSectionAggregation paycheckSectionAggregation = (PaycheckSectionAggregation) obj;
        return Intrinsics.areEqual(this.aggregatedValue, paycheckSectionAggregation.aggregatedValue) && this.payload.equals(paycheckSectionAggregation.payload);
    }

    public final int hashCode() {
        return this.payload.hashCode() + (this.aggregatedValue.hashCode() * 31);
    }

    public final String toString() {
        return "PaycheckSectionAggregation(aggregatedValue=" + this.aggregatedValue + ", payload=" + this.payload + ")";
    }
}
