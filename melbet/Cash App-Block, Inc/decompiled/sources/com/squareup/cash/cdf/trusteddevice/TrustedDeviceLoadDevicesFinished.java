package com.squareup.cash.cdf.trusteddevice;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class TrustedDeviceLoadDevicesFinished implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.AMPLITUDE);
    public final String error_message;
    public final LinkedHashMap parameters;
    public final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Status {
        public static final /* synthetic */ Status[] $VALUES;
        public static final Status FAILED;
        public static final Status SUCCESSFUL;

        static {
            Status status = new Status("SUCCESSFUL", 0);
            SUCCESSFUL = status;
            Status status2 = new Status("FAILED", 1);
            FAILED = status2;
            $VALUES = new Status[]{status, status2};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public TrustedDeviceLoadDevicesFinished(Status status, String str) {
        this.status = status;
        this.error_message = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "TrustedDevice", "cdf_action", "LoadDevices");
        Countries.putSafe(m, "status", status);
        Countries.putSafe(m, "error_message", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedDeviceLoadDevicesFinished)) {
            return false;
        }
        TrustedDeviceLoadDevicesFinished trustedDeviceLoadDevicesFinished = (TrustedDeviceLoadDevicesFinished) obj;
        return this.status == trustedDeviceLoadDevicesFinished.status && Intrinsics.areEqual(this.error_message, trustedDeviceLoadDevicesFinished.error_message);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "TrustedDevice LoadDevices Finished";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Status status = this.status;
        int hashCode = (status == null ? 0 : status.hashCode()) * 31;
        String str = this.error_message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TrustedDeviceLoadDevicesFinished(status=" + this.status + ", error_message=" + this.error_message + ")";
    }

    public /* synthetic */ TrustedDeviceLoadDevicesFinished() {
        this(Status.SUCCESSFUL, null);
    }
}
