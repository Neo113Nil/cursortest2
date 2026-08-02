package com.squareup.cash.afterpayapplet.backend;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/afterpayapplet/backend/AfterpayAppletStaleResponseError;", "Lcom/squareup/cash/observability/types/ReportedError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AfterpayAppletStaleResponseError extends ReportedError {
    public final long deviceTimestamp;
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.AfterpayApplet.INSTANCE);
    public final String message;
    public final long responseTimestamp;

    public AfterpayAppletStaleResponseError(long j, long j2) {
        this.responseTimestamp = j;
        this.deviceTimestamp = j2;
        this.message = CameraState$Type$EnumUnboxingLocalUtility.m(j2, ".", Boxes$$ExternalSyntheticOutline1.m1149m(j, "Afterpay Applet received an expired response. Response timestamp: ", ". Device timestamp: "));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletStaleResponseError)) {
            return false;
        }
        AfterpayAppletStaleResponseError afterpayAppletStaleResponseError = (AfterpayAppletStaleResponseError) obj;
        return this.responseTimestamp == afterpayAppletStaleResponseError.responseTimestamp && this.deviceTimestamp == afterpayAppletStaleResponseError.deviceTimestamp;
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
        return Long.hashCode(this.deviceTimestamp) + (Long.hashCode(this.responseTimestamp) * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.deviceTimestamp, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.responseTimestamp, "AfterpayAppletStaleResponseError(responseTimestamp=", ", deviceTimestamp="));
    }
}
