package com.squareup.cash.cdf.threeds;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ThreeDsAuthenticationSdkInitializationFailure implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String failure_message;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public ThreeDsAuthenticationSdkInitializationFailure(String str, String str2, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        this.flow_token = str;
        this.failure_message = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "ThreeDs", "cdf_action", "Authentication");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "failure_message", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDsAuthenticationSdkInitializationFailure)) {
            return false;
        }
        ThreeDsAuthenticationSdkInitializationFailure threeDsAuthenticationSdkInitializationFailure = (ThreeDsAuthenticationSdkInitializationFailure) obj;
        return Intrinsics.areEqual(this.flow_token, threeDsAuthenticationSdkInitializationFailure.flow_token) && Intrinsics.areEqual(this.failure_message, threeDsAuthenticationSdkInitializationFailure.failure_message);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ThreeDs Authentication SdkInitializationFailure";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.failure_message;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ThreeDsAuthenticationSdkInitializationFailure(flow_token=", this.flow_token, ", failure_message=", this.failure_message, ")");
    }
}
