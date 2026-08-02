package com.squareup.cash.afterpayapplet.backend;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterpayAppletAnalyticsEventsSpec {
    public final List clientParameters;
    public final String eventName;
    public final Map serverParameters;

    public AfterpayAppletAnalyticsEventsSpec(String str, List list, Map map) {
        str.getClass();
        map.getClass();
        list.getClass();
        this.eventName = str;
        this.serverParameters = map;
        this.clientParameters = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletAnalyticsEventsSpec)) {
            return false;
        }
        AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec = (AfterpayAppletAnalyticsEventsSpec) obj;
        return Intrinsics.areEqual(this.eventName, afterpayAppletAnalyticsEventsSpec.eventName) && Intrinsics.areEqual(this.serverParameters, afterpayAppletAnalyticsEventsSpec.serverParameters) && Intrinsics.areEqual(this.clientParameters, afterpayAppletAnalyticsEventsSpec.clientParameters);
    }

    public final int hashCode() {
        return this.clientParameters.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.eventName.hashCode() * 31, this.serverParameters, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AfterpayAppletAnalyticsEventsSpec(eventName=");
        sb.append(this.eventName);
        sb.append(", serverParameters=");
        sb.append(this.serverParameters);
        sb.append(", clientParameters=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.clientParameters, ")");
    }
}
