package com.squareup.cash.limits.viewmodels;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;

/* loaded from: classes6.dex */
public final class LimitsParsingErrorFactory implements ProtoParsingError.Factory {
    public static final LimitsParsingErrorFactory INSTANCE = new LimitsParsingErrorFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new LimitsProtoParsingError(str, errorType, str2, exc, "Limits");
    }
}
