package com.squareup.cash.family.familyhub.backend.api;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;

/* loaded from: classes6.dex */
public final class FamilyParsingErrorFactory implements ProtoParsingError.Factory {
    public static final FamilyParsingErrorFactory INSTANCE = new FamilyParsingErrorFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new FamilyProtoParsingError(str, errorType, str2, exc, FamilyFeatureError.features, "Family", null, 64);
    }
}
