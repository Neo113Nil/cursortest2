package com.squareup.cash.blockers.presenters;

import com.squareup.cash.observability.protovalidation.ProtoParsingError;

/* loaded from: classes6.dex */
public final class BlockersParsingErrorFactory implements ProtoParsingError.Factory {
    public static final BlockersParsingErrorFactory INSTANCE = new BlockersParsingErrorFactory();

    @Override // com.squareup.cash.observability.protovalidation.ProtoParsingError.Factory
    public final ProtoParsingError create(String str, ProtoParsingError.ErrorType errorType, String str2, Exception exc) {
        return new BlockersProtoParsingError(str, errorType, str2, exc, "Blockers");
    }
}
