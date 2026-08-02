package com.squareup.cash.merchant.backend.api;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.types.ErrorFeature;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes6.dex */
public final class MerchantProtoParsingExceptionFactory implements ProtoParsingError.Factory {
    public static final MerchantProtoParsingExceptionFactory INSTANCE = new MerchantProtoParsingExceptionFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new com.squareup.cash.banking.observability.ProtoParsingError(str, errorType, str2, exc, SetsKt__SetsJVMKt.setOf(ErrorFeature.Merchant.INSTANCE), "BlockedBusinesses", null, 64);
    }
}
