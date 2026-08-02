package com.squareup.cash.cdf.trusteddevice;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes6.dex */
public final class TrustedDeviceLoadDevicesStarted implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.AMPLITUDE);
    public final LinkedHashMap parameters;
    public final Reason reason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Reason {
        public static final /* synthetic */ Reason[] $VALUES;
        public static final Reason INITIAL_LOAD;
        public static final Reason REFRESH;

        static {
            Reason reason = new Reason("INITIAL_LOAD", 0);
            INITIAL_LOAD = reason;
            Reason reason2 = new Reason("REFRESH", 1);
            REFRESH = reason2;
            $VALUES = new Reason[]{reason, reason2};
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }
    }

    public TrustedDeviceLoadDevicesStarted(Reason reason) {
        this.reason = reason;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "TrustedDevice", "cdf_action", "LoadDevices");
        Countries.putSafe(m, "reason", reason);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrustedDeviceLoadDevicesStarted) && this.reason == ((TrustedDeviceLoadDevicesStarted) obj).reason;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "TrustedDevice LoadDevices Started";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.reason.hashCode();
    }

    public final String toString() {
        return "TrustedDeviceLoadDevicesStarted(reason=" + this.reason + ")";
    }
}
