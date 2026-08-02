package com.squareup.cash.gps.backend.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/gps/backend/api/GpsAnalyticsParamParsingError;", "Lcom/squareup/cash/gps/backend/api/GpsError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GpsAnalyticsParamParsingError extends GpsError {
    public final String message;

    public GpsAnalyticsParamParsingError(String str) {
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GpsAnalyticsParamParsingError) && Intrinsics.areEqual(this.message, ((GpsAnalyticsParamParsingError) obj).message);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GpsAnalyticsParamParsingError(message=", this.message, ")");
    }
}
