package com.squareup.cash.observability.types;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.observability.types.ReportedError;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/observability/types/GenericDatadogError;", "Lcom/squareup/cash/observability/types/ReportedError;", "types"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GenericDatadogError extends ReportedError {
    public final Throwable cause;
    public final Set features;
    public final String message;
    public final Map metadata;
    public final Set targets;

    public GenericDatadogError(Set set, String str, Map map, Exception exc) {
        set.getClass();
        map.getClass();
        this.features = set;
        this.message = str;
        this.metadata = map;
        this.cause = exc;
        this.targets = ArraysKt___ArraysKt.toSet(new ReportedError.ErrorReportingTarget[]{ReportedError.ErrorReportingTarget.DATADOG, ReportedError.ErrorReportingTarget.LOGS});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericDatadogError)) {
            return false;
        }
        GenericDatadogError genericDatadogError = (GenericDatadogError) obj;
        return Intrinsics.areEqual(this.features, genericDatadogError.features) && Intrinsics.areEqual(this.message, genericDatadogError.message) && Intrinsics.areEqual(this.metadata, genericDatadogError.metadata) && Intrinsics.areEqual(this.cause, genericDatadogError.cause);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Set getTargets() {
        return this.targets;
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.features.hashCode() * 31, 31, this.message), this.metadata, 31);
        Throwable th = this.cause;
        return m + (th == null ? 0 : th.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "GenericDatadogError(features=" + this.features + ", message=" + this.message + ", metadata=" + this.metadata + ", cause=" + this.cause + ")";
    }
}
