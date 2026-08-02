package com.squareup.cash.cdf.clientroute;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class ClientRouteManagedAccountRouteAttempt implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean is_deep_link;
    public final String origin;
    public final LinkedHashMap parameters;
    public final String spec_name;
    public final String spec_path_format;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ManagedAccountRouteOutcome {
        public static final /* synthetic */ ManagedAccountRouteOutcome[] $VALUES;
        public static final ManagedAccountRouteOutcome ROUTED;

        static {
            ManagedAccountRouteOutcome managedAccountRouteOutcome = new ManagedAccountRouteOutcome("ROUTED", 0);
            ROUTED = managedAccountRouteOutcome;
            $VALUES = new ManagedAccountRouteOutcome[]{managedAccountRouteOutcome, new ManagedAccountRouteOutcome("BLOCKED", 1), new ManagedAccountRouteOutcome("UNHANDLED", 2)};
        }

        public static ManagedAccountRouteOutcome valueOf(String str) {
            return (ManagedAccountRouteOutcome) Enum.valueOf(ManagedAccountRouteOutcome.class, str);
        }

        public static ManagedAccountRouteOutcome[] values() {
            return (ManagedAccountRouteOutcome[]) $VALUES.clone();
        }
    }

    public ClientRouteManagedAccountRouteAttempt(Boolean bool, String str, String str2, String str3) {
        ManagedAccountRouteOutcome managedAccountRouteOutcome = ManagedAccountRouteOutcome.ROUTED;
        this.origin = str;
        this.is_deep_link = bool;
        this.spec_name = str2;
        this.spec_path_format = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "ClientRoute", "cdf_action", "ManagedAccountRoute");
        Countries.putSafe(m, "origin", str);
        Countries.putSafe(m, "is_deep_link", bool);
        Countries.putSafe(m, "spec_name", str2);
        Countries.putSafe(m, "spec_path_format", str3);
        Countries.putSafe(m, "outcome", managedAccountRouteOutcome);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientRouteManagedAccountRouteAttempt)) {
            return false;
        }
        ClientRouteManagedAccountRouteAttempt clientRouteManagedAccountRouteAttempt = (ClientRouteManagedAccountRouteAttempt) obj;
        if (!Intrinsics.areEqual(this.origin, clientRouteManagedAccountRouteAttempt.origin) || !this.is_deep_link.equals(clientRouteManagedAccountRouteAttempt.is_deep_link) || !Intrinsics.areEqual(this.spec_name, clientRouteManagedAccountRouteAttempt.spec_name) || !Intrinsics.areEqual(this.spec_path_format, clientRouteManagedAccountRouteAttempt.spec_path_format)) {
            return false;
        }
        ManagedAccountRouteOutcome managedAccountRouteOutcome = ManagedAccountRouteOutcome.ROUTED;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ClientRoute ManagedAccountRoute Attempt";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.origin;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_deep_link, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.spec_name;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.spec_path_format;
        return ManagedAccountRouteOutcome.ROUTED.hashCode() + ((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        ManagedAccountRouteOutcome managedAccountRouteOutcome = ManagedAccountRouteOutcome.ROUTED;
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.is_deep_link, "ClientRouteManagedAccountRouteAttempt(origin=", this.origin, ", is_deep_link=", ", spec_name=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.spec_name, ", spec_path_format=", this.spec_path_format, ", outcome=");
        m.append(managedAccountRouteOutcome);
        m.append(")");
        return m.toString();
    }
}
