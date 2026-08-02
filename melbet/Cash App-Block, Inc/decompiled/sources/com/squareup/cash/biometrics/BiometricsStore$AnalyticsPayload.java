package com.squareup.cash.biometrics;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class BiometricsStore$AnalyticsPayload {
    public final String clientScenario;
    public final String flowToken;

    public BiometricsStore$AnalyticsPayload(String str, String str2) {
        this.flowToken = str;
        this.clientScenario = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiometricsStore$AnalyticsPayload)) {
            return false;
        }
        BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload = (BiometricsStore$AnalyticsPayload) obj;
        return Intrinsics.areEqual(this.flowToken, biometricsStore$AnalyticsPayload.flowToken) && Intrinsics.areEqual(this.clientScenario, biometricsStore$AnalyticsPayload.clientScenario);
    }

    public final String getClientScenario() {
        return this.clientScenario;
    }

    public final String getFlowToken() {
        return this.flowToken;
    }

    public final int hashCode() {
        String str = this.flowToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientScenario;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("AnalyticsPayload(flowToken=", this.flowToken, ", clientScenario=", this.clientScenario, ")");
    }
}
