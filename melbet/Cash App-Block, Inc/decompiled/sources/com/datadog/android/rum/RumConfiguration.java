package com.datadog.android.rum;

import com.datadog.android.rum.internal.RumFeature;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class RumConfiguration {
    public final String applicationId;
    public final RumFeature.Configuration featureConfiguration;

    public RumConfiguration(String str, RumFeature.Configuration configuration) {
        str.getClass();
        configuration.getClass();
        this.applicationId = str;
        this.featureConfiguration = configuration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RumConfiguration)) {
            return false;
        }
        RumConfiguration rumConfiguration = (RumConfiguration) obj;
        return Intrinsics.areEqual(this.applicationId, rumConfiguration.applicationId) && Intrinsics.areEqual(this.featureConfiguration, rumConfiguration.featureConfiguration);
    }

    public final int hashCode() {
        return this.featureConfiguration.hashCode() + (this.applicationId.hashCode() * 31);
    }

    public final String toString() {
        return "RumConfiguration(applicationId=" + this.applicationId + ", featureConfiguration=" + this.featureConfiguration + ")";
    }
}
