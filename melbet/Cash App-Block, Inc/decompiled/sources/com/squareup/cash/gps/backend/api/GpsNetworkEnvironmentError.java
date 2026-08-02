package com.squareup.cash.gps.backend.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/gps/backend/api/GpsNetworkEnvironmentError;", "Lcom/squareup/cash/gps/backend/api/GpsError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GpsNetworkEnvironmentError extends GpsError {
    public final Exception cause;
    public final String message;

    public GpsNetworkEnvironmentError(String str, Exception exc) {
        this.message = str;
        this.cause = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsNetworkEnvironmentError)) {
            return false;
        }
        GpsNetworkEnvironmentError gpsNetworkEnvironmentError = (GpsNetworkEnvironmentError) obj;
        return Intrinsics.areEqual(this.message, gpsNetworkEnvironmentError.message) && Intrinsics.areEqual(this.cause, gpsNetworkEnvironmentError.cause);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return this.cause.hashCode() + (this.message.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "GpsNetworkEnvironmentError(message=" + this.message + ", cause=" + this.cause + ")";
    }
}
