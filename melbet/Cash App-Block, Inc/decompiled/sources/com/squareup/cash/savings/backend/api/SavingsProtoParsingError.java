package com.squareup.cash.savings.backend.api;

import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/savings/backend/api/SavingsProtoParsingError;", "Lcom/squareup/cash/banking/observability/ProtoParsingError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavingsProtoParsingError extends ProtoParsingError {
    public SavingsProtoParsingError(String str, ProtoParsingError.ErrorType errorType, String str2, Throwable th) {
        super(str, errorType, str2, th, SavingsFeatureError.features, "Savings", null, 64);
    }

    public /* synthetic */ SavingsProtoParsingError(String str, ProtoParsingError.ErrorType errorType, String str2, int i) {
        this(str, errorType, (i & 4) != 0 ? null : str2, (Throwable) null);
    }
}
