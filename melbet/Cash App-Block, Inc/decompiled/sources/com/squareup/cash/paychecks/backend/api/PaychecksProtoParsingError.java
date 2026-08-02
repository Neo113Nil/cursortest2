package com.squareup.cash.paychecks.backend.api;

import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/paychecks/backend/api/PaychecksProtoParsingError;", "Lcom/squareup/cash/banking/observability/ProtoParsingError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaychecksProtoParsingError extends ProtoParsingError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaychecksProtoParsingError(String str, ProtoParsingError.ErrorType errorType, String str2, Throwable th) {
        super(str, errorType, str2, th, PaychecksFeatureError.features, "Paychecks", null, 64);
        str.getClass();
    }

    public /* synthetic */ PaychecksProtoParsingError(String str, ProtoParsingError.ErrorType errorType, String str2, int i) {
        this(str, errorType, (i & 4) != 0 ? null : str2, (Throwable) null);
    }
}
