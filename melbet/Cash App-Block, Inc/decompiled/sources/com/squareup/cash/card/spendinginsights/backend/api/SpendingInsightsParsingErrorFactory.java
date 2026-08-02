package com.squareup.cash.card.spendinginsights.backend.api;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;

/* loaded from: classes6.dex */
public final class SpendingInsightsParsingErrorFactory implements ProtoParsingError.Factory {
    public static final SpendingInsightsParsingErrorFactory INSTANCE = new SpendingInsightsParsingErrorFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new SpendingInsightsProtoParsingError(str, errorType, str2, exc);
    }
}
