package com.squareup.cash.clientsync.errors;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/clientsync/errors/ClientSyncReportedError;", "Lcom/squareup/cash/observability/types/ReportedError;", "Lcom/squareup/cash/clientsync/errors/ClientSyncEntityError;", "Lcom/squareup/cash/clientsync/errors/ClientSyncMultiplatformError;", "Lcom/squareup/cash/clientsync/errors/ClientSyncServerPushError;", "Lcom/squareup/cash/clientsync/errors/ServerPushUnexpectedlyResetError;", "Lcom/squareup/cash/clientsync/errors/SyncEntityIdConsistencyException;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ClientSyncReportedError extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.ClientSync.INSTANCE);

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getContext() {
        if (!isBackgroundError()) {
            return null;
        }
        StackTraceElement[] stackTrace = getStackTrace();
        stackTrace.getClass();
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt___ArraysKt.firstOrNull(stackTrace);
        if (stackTraceElement == null) {
            return null;
        }
        return Boxes$$ExternalSyntheticOutline1.m(stackTraceElement.getLineNumber(), stackTraceElement.getFileName(), ":");
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    public boolean isBackgroundError() {
        return false;
    }
}
