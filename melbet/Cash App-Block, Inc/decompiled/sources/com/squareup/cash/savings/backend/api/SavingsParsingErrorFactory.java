package com.squareup.cash.savings.backend.api;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;

/* loaded from: classes7.dex */
public final class SavingsParsingErrorFactory implements ProtoParsingError.Factory {
    public static final SavingsParsingErrorFactory INSTANCE = new SavingsParsingErrorFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new SavingsProtoParsingError(str, errorType, str2, exc);
    }
}
