package com.squareup.cash.card.spendinginsights.backend.api;

import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/card/spendinginsights/backend/api/SpendingInsightsProtoParsingError;", "Lcom/squareup/cash/banking/observability/ProtoParsingError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SpendingInsightsProtoParsingError extends ProtoParsingError {
    public final Throwable cause;

    public SpendingInsightsProtoParsingError(String str, ProtoParsingError.ErrorType errorType, String str2, Throwable th) {
        super(str, errorType, str2, th, SpendingInsightsFeatureError.features, "SpendingInsights", null, 64);
        this.cause = th;
    }

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError, java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    public /* synthetic */ SpendingInsightsProtoParsingError(String str, int i) {
        this(str, ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, (i & 4) != 0 ? null : "action", null);
    }
}
