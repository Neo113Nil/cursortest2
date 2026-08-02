package com.squareup.cash.earnings.backend.api;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;

/* loaded from: classes6.dex */
public final class EarningsParsingErrorFactory implements ProtoParsingError.Factory {
    public static final EarningsParsingErrorFactory INSTANCE = new EarningsParsingErrorFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new EarningsProtoParsingError(str, errorType, str2, exc);
    }
}
