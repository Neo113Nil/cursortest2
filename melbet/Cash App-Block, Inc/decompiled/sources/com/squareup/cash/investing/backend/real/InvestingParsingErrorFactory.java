package com.squareup.cash.investing.backend.real;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;

/* loaded from: classes6.dex */
public final class InvestingParsingErrorFactory implements ProtoParsingError.Factory {
    public static final InvestingParsingErrorFactory INSTANCE = new InvestingParsingErrorFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new com.squareup.cash.banking.observability.ProtoParsingError(str, errorType, str2, exc, InvestingFeatureError.features, "Investing", null, 64);
    }
}
