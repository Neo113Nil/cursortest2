package androidx.work;

import android.net.NetworkRequest;
import android.net.Uri;
import androidx.work.impl.utils.NetworkRequestCompat;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Constraints {
    public static final Constraints NONE = new Constraints();
    public final long contentTriggerMaxDelayMillis;
    public final long contentTriggerUpdateDelayMillis;
    public final Set contentUriTriggers;
    public final NetworkRequestCompat requiredNetworkRequestCompat;
    public final NetworkType requiredNetworkType;
    public final boolean requiresBatteryNotLow;
    public final boolean requiresCharging;
    public final boolean requiresDeviceIdle;
    public final boolean requiresStorageNotLow;

    /* loaded from: classes3.dex */
    public final class ContentUriTrigger {
        public final boolean isTriggeredForDescendants;
        public final Uri uri;

        public ContentUriTrigger(boolean z, Uri uri) {
            this.uri = uri;
            this.isTriggeredForDescendants = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!ContentUriTrigger.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            ContentUriTrigger contentUriTrigger = (ContentUriTrigger) obj;
            return this.uri.equals(contentUriTrigger.uri) && this.isTriggeredForDescendants == contentUriTrigger.isTriggeredForDescendants;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isTriggeredForDescendants) + (this.uri.hashCode() * 31);
        }

        public final boolean isTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }
    }

    public Constraints(Constraints constraints) {
        constraints.getClass();
        this.requiresCharging = constraints.requiresCharging;
        this.requiresDeviceIdle = constraints.requiresDeviceIdle;
        this.requiredNetworkRequestCompat = constraints.requiredNetworkRequestCompat;
        this.requiredNetworkType = constraints.requiredNetworkType;
        this.requiresBatteryNotLow = constraints.requiresBatteryNotLow;
        this.requiresStorageNotLow = constraints.requiresStorageNotLow;
        this.contentUriTriggers = constraints.contentUriTriggers;
        this.contentTriggerUpdateDelayMillis = constraints.contentTriggerUpdateDelayMillis;
        this.contentTriggerMaxDelayMillis = constraints.contentTriggerMaxDelayMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Constraints.class.equals(obj.getClass())) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.requiresCharging == constraints.requiresCharging && this.requiresDeviceIdle == constraints.requiresDeviceIdle && this.requiresBatteryNotLow == constraints.requiresBatteryNotLow && this.requiresStorageNotLow == constraints.requiresStorageNotLow && this.contentTriggerUpdateDelayMillis == constraints.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == constraints.contentTriggerMaxDelayMillis && Intrinsics.areEqual(getRequiredNetworkRequest(), constraints.getRequiredNetworkRequest()) && this.requiredNetworkType == constraints.requiredNetworkType) {
            return Intrinsics.areEqual(this.contentUriTriggers, constraints.contentUriTriggers);
        }
        return false;
    }

    public final NetworkRequest getRequiredNetworkRequest() {
        return (NetworkRequest) this.requiredNetworkRequestCompat.wrapped;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.requiredNetworkType.hashCode() * 31) + (this.requiresCharging ? 1 : 0)) * 31) + (this.requiresDeviceIdle ? 1 : 0)) * 31) + (this.requiresBatteryNotLow ? 1 : 0)) * 31) + (this.requiresStorageNotLow ? 1 : 0)) * 31;
        long j = this.contentTriggerUpdateDelayMillis;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.contentTriggerMaxDelayMillis;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.contentUriTriggers);
        NetworkRequest requiredNetworkRequest = getRequiredNetworkRequest();
        return m + (requiredNetworkRequest != null ? requiredNetworkRequest.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.requiredNetworkType + ", requiresCharging=" + this.requiresCharging + ", requiresDeviceIdle=" + this.requiresDeviceIdle + ", requiresBatteryNotLow=" + this.requiresBatteryNotLow + ", requiresStorageNotLow=" + this.requiresStorageNotLow + ", contentTriggerUpdateDelayMillis=" + this.contentTriggerUpdateDelayMillis + ", contentTriggerMaxDelayMillis=" + this.contentTriggerMaxDelayMillis + ", contentUriTriggers=" + this.contentUriTriggers + ", }";
    }

    public Constraints(NetworkRequestCompat networkRequestCompat, NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        set.getClass();
        this.requiredNetworkRequestCompat = networkRequestCompat;
        this.requiredNetworkType = networkType;
        this.requiresCharging = z;
        this.requiresDeviceIdle = z2;
        this.requiresBatteryNotLow = z3;
        this.requiresStorageNotLow = z4;
        this.contentTriggerUpdateDelayMillis = j;
        this.contentTriggerMaxDelayMillis = j2;
        this.contentUriTriggers = set;
    }

    public Constraints() {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        EmptySet emptySet = EmptySet.INSTANCE;
        emptySet.getClass();
        this.requiredNetworkRequestCompat = new NetworkRequestCompat(null);
        this.requiredNetworkType = networkType;
        this.requiresCharging = false;
        this.requiresDeviceIdle = false;
        this.requiresBatteryNotLow = false;
        this.requiresStorageNotLow = false;
        this.contentTriggerUpdateDelayMillis = -1L;
        this.contentTriggerMaxDelayMillis = -1L;
        this.contentUriTriggers = emptySet;
    }
}
