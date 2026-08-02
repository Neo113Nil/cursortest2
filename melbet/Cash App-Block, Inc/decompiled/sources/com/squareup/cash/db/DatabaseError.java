package com.squareup.cash.db;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/db/DatabaseError;", "Lcom/squareup/cash/observability/types/ReportedError;", "db"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DatabaseError extends ReportedError {
    public final Throwable cause;
    public final Set features;
    public final String message;

    public DatabaseError(String str, Throwable th) {
        this.cause = th;
        this.message = str;
        this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Persistence.INSTANCE);
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
        Throwable th = this.cause;
        if (th != null) {
            return th.getMessage();
        }
        return null;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public /* synthetic */ DatabaseError(UnsupportedOperationException unsupportedOperationException) {
        this(null, unsupportedOperationException);
    }
}
