package com.squareup.cash.afterpayapplet.backend;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;

/* loaded from: classes5.dex */
public final class AfterpayAppletParsingErrorFactory implements ProtoParsingError.Factory {
    public static final AfterpayAppletParsingErrorFactory INSTANCE = new AfterpayAppletParsingErrorFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new AfterpayAppletProtoParsingError(str, errorType, str2, exc, AfterpayAppletFeatureError.features, "AfterpayApplet", null, 64);
    }
}
