package com.squareup.cash.afterpayapplet.backend;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/afterpayapplet/backend/AfterpayAppletEntrypointHttpError;", "Lcom/squareup/cash/observability/types/ReportedError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AfterpayAppletEntrypointHttpError extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.AfterpayApplet.INSTANCE);
    public final String message;
    public final int statusCode;

    public AfterpayAppletEntrypointHttpError(int i) {
        this.statusCode = i;
        this.message = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Failed to fetch afterpay response in the Afterpay Applet Entrypoint. HTTP code: ", ".");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletEntrypointHttpError) && this.statusCode == ((AfterpayAppletEntrypointHttpError) obj).statusCode;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return Integer.hashCode(this.statusCode);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.statusCode, "AfterpayAppletEntrypointHttpError(statusCode=", ")");
    }
}
