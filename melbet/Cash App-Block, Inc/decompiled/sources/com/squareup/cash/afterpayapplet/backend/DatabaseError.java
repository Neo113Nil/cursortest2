package com.squareup.cash.afterpayapplet.backend;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/afterpayapplet/backend/DatabaseError;", "Lcom/squareup/cash/observability/types/ReportedError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DatabaseError extends ReportedError {
    public final Exception cause;
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Persistence.INSTANCE);
    public final String message;

    public DatabaseError(Exception exc, String str) {
        this.cause = exc;
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getGroupingDescriptor() {
        String str = this.message;
        if (str != null) {
            return str;
        }
        Exception exc = this.cause;
        if (exc != null) {
            return exc.getMessage();
        }
        return null;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
