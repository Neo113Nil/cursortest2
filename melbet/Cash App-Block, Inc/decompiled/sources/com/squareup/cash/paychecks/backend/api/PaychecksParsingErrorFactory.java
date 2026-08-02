package com.squareup.cash.paychecks.backend.api;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;

/* loaded from: classes6.dex */
public final class PaychecksParsingErrorFactory implements ProtoParsingError.Factory {
    public static final PaychecksParsingErrorFactory INSTANCE = new PaychecksParsingErrorFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new PaychecksProtoParsingError(str, errorType, str2, exc);
    }
}
