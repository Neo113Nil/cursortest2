package com.squareup.cash.investing.presenters.errors;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/investing/presenters/errors/FailedToStartTradeFlowError;", "Lcom/squareup/cash/investing/presenters/errors/InvestingError;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FailedToStartTradeFlowError extends InvestingError {
    public final Exception cause;
    public final String entityToken;
    public final String groupingDescriptor;
    public final String message;
    public final Map metadata;
    public final String orderTypeString;

    public FailedToStartTradeFlowError(Exception exc, String str, String str2) {
        String groupingDescriptor;
        str.getClass();
        this.orderTypeString = str;
        this.entityToken = str2;
        this.cause = exc;
        this.message = "Failed to start trade";
        ReportedError reportedError = exc instanceof ReportedError ? (ReportedError) exc : null;
        this.groupingDescriptor = (reportedError == null || (groupingDescriptor = reportedError.getGroupingDescriptor()) == null) ? exc.getMessage() : groupingDescriptor;
        this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Investing", MapsKt__MapsKt.mapOf(new Pair("Entity Token", str2), new Pair("Entity Token", str)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FailedToStartTradeFlowError)) {
            return false;
        }
        FailedToStartTradeFlowError failedToStartTradeFlowError = (FailedToStartTradeFlowError) obj;
        return Intrinsics.areEqual(this.orderTypeString, failedToStartTradeFlowError.orderTypeString) && Intrinsics.areEqual(this.entityToken, failedToStartTradeFlowError.entityToken) && Intrinsics.areEqual(this.cause, failedToStartTradeFlowError.cause);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getGroupingDescriptor() {
        return this.groupingDescriptor;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }

    public final int hashCode() {
        return this.cause.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.orderTypeString.hashCode() * 31, 31, this.entityToken);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FailedToStartTradeFlowError(orderTypeString=", this.orderTypeString, ", entityToken=", this.entityToken, ", cause=");
        m.append(this.cause);
        m.append(")");
        return m.toString();
    }
}
