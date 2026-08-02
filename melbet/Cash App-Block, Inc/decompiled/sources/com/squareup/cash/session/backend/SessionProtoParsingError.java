package com.squareup.cash.session.backend;

import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/session/backend/SessionProtoParsingError;", "Lcom/squareup/cash/banking/observability/ProtoParsingError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SessionProtoParsingError extends ProtoParsingError {
    public SessionProtoParsingError(String str, ProtoParsingError.ErrorType errorType, String str2, Throwable th) {
        super(str, errorType, str2, th, null, "Session", null, 80);
    }
}
