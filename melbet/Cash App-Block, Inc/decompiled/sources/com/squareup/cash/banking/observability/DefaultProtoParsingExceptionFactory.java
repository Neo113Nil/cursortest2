package com.squareup.cash.banking.observability;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;

/* loaded from: classes5.dex */
public final class DefaultProtoParsingExceptionFactory implements ProtoParsingError.Factory {
    public static final DefaultProtoParsingExceptionFactory INSTANCE = new DefaultProtoParsingExceptionFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final com.squareup.cash.observability.protovalidation.ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new ProtoParsingError(str, errorType, str2, exc, null, null, null, 112);
    }
}
