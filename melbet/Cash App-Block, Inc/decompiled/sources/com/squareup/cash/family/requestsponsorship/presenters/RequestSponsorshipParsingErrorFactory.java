package com.squareup.cash.family.requestsponsorship.presenters;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;

/* loaded from: classes6.dex */
public final class RequestSponsorshipParsingErrorFactory implements ProtoParsingError.Factory {
    public static final RequestSponsorshipParsingErrorFactory INSTANCE = new RequestSponsorshipParsingErrorFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new RequestSponsorshipProtoParsingError(str, errorType, str2, exc, RequestSponsorshipFeatureError.features, "Family", null, 64);
    }
}
