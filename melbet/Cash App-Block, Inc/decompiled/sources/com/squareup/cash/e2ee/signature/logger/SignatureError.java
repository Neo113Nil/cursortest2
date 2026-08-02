package com.squareup.cash.e2ee.signature.logger;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/e2ee/signature/logger/SignatureError;", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SignatureError extends ReportedError {
    public final Exception cause;
    public final String message;

    public SignatureError(Exception exc, String str) {
        this.cause = exc;
        this.message = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SignatureManager: ", str, " Failure");
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return ArraysKt___ArraysKt.toSet(new ErrorFeature[]{ErrorFeature.Security.INSTANCE, ErrorFeature.Encryption.INSTANCE});
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
