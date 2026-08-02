package com.squareup.cash.moneybot.backend.api;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;

/* loaded from: classes7.dex */
public final class MoneybotParsingErrorFactory implements ProtoParsingError.Factory {
    public static final MoneybotParsingErrorFactory INSTANCE = new MoneybotParsingErrorFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new MoneybotProtoParsingError(str, errorType, str2, exc, null, null, 48);
    }
}
