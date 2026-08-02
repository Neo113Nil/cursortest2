package com.squareup.cash.benefits.utils;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.types.ErrorFeature;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes5.dex */
public final class BankingBenefitsProtoParsingErrorFactory implements ProtoParsingError.Factory {
    public static final BankingBenefitsProtoParsingErrorFactory INSTANCE = new BankingBenefitsProtoParsingErrorFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new BankingBenefitsProtoParsingError(str, errorType, str2, exc, SetsKt__SetsJVMKt.setOf(ErrorFeature.BankingBenefits.INSTANCE), "Banking Benefits", null, 64);
    }
}
