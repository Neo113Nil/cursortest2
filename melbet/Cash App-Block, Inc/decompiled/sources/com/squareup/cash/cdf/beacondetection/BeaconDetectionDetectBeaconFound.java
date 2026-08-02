package com.squareup.cash.cdf.beacondetection;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BeaconDetectionDetectBeaconFound implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final Double accuracy_meters;
    public final String beacon_major;
    public final String beacon_minor;
    public final String beacon_uuid;
    public final Double coarse_latitude;
    public final Double coarse_longitude;
    public final DetectionContext detection_context;
    public final LocationPermissionLevel location_permission_level;
    public final LinkedHashMap parameters;
    public final Platform platform;
    public final Proximity proximity;
    public final Integer rssi;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DetectionContext {
        public static final /* synthetic */ DetectionContext[] $VALUES;
        public static final DetectionContext BACKGROUND_REGION_ENTRY;
        public static final DetectionContext BACKGROUND_REGION_EXIT;
        public static final DetectionContext FOREGROUND_RANGING;

        static {
            DetectionContext detectionContext = new DetectionContext("FOREGROUND_RANGING", 0);
            FOREGROUND_RANGING = detectionContext;
            DetectionContext detectionContext2 = new DetectionContext("BACKGROUND_REGION_ENTRY", 1);
            BACKGROUND_REGION_ENTRY = detectionContext2;
            DetectionContext detectionContext3 = new DetectionContext("BACKGROUND_REGION_EXIT", 2);
            BACKGROUND_REGION_EXIT = detectionContext3;
            $VALUES = new DetectionContext[]{detectionContext, detectionContext2, detectionContext3};
        }

        public static DetectionContext valueOf(String str) {
            return (DetectionContext) Enum.valueOf(DetectionContext.class, str);
        }

        public static DetectionContext[] values() {
            return (DetectionContext[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LocationPermissionLevel {
        public static final /* synthetic */ LocationPermissionLevel[] $VALUES;
        public static final LocationPermissionLevel ALWAYS;
        public static final LocationPermissionLevel WHEN_IN_USE;

        static {
            LocationPermissionLevel locationPermissionLevel = new LocationPermissionLevel("ALWAYS", 0);
            ALWAYS = locationPermissionLevel;
            LocationPermissionLevel locationPermissionLevel2 = new LocationPermissionLevel("WHEN_IN_USE", 1);
            WHEN_IN_USE = locationPermissionLevel2;
            $VALUES = new LocationPermissionLevel[]{locationPermissionLevel, locationPermissionLevel2};
        }

        public static LocationPermissionLevel valueOf(String str) {
            return (LocationPermissionLevel) Enum.valueOf(LocationPermissionLevel.class, str);
        }

        public static LocationPermissionLevel[] values() {
            return (LocationPermissionLevel[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Platform {
        public static final /* synthetic */ Platform[] $VALUES;
        public static final Platform ANDROID;

        /* JADX INFO: Fake field, exist only in values array */
        Platform EF0;

        static {
            Platform platform = new Platform("IOS", 0);
            Platform platform2 = new Platform("ANDROID", 1);
            ANDROID = platform2;
            $VALUES = new Platform[]{platform, platform2};
        }

        public static Platform valueOf(String str) {
            return (Platform) Enum.valueOf(Platform.class, str);
        }

        public static Platform[] values() {
            return (Platform[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Proximity {
        public static final /* synthetic */ Proximity[] $VALUES;
        public static final Proximity FAR;
        public static final Proximity IMMEDIATE;
        public static final Proximity NEAR;
        public static final Proximity UNKNOWN;

        static {
            Proximity proximity = new Proximity("IMMEDIATE", 0);
            IMMEDIATE = proximity;
            Proximity proximity2 = new Proximity("NEAR", 1);
            NEAR = proximity2;
            Proximity proximity3 = new Proximity("FAR", 2);
            FAR = proximity3;
            Proximity proximity4 = new Proximity("UNKNOWN", 3);
            UNKNOWN = proximity4;
            $VALUES = new Proximity[]{proximity, proximity2, proximity3, proximity4};
        }

        public static Proximity valueOf(String str) {
            return (Proximity) Enum.valueOf(Proximity.class, str);
        }

        public static Proximity[] values() {
            return (Proximity[]) $VALUES.clone();
        }
    }

    public BeaconDetectionDetectBeaconFound(String str, String str2, String str3, Integer num, Proximity proximity, Double d, Double d2, Double d3, DetectionContext detectionContext, LocationPermissionLevel locationPermissionLevel) {
        Platform platform = Platform.ANDROID;
        this.beacon_uuid = str;
        this.beacon_major = str2;
        this.beacon_minor = str3;
        this.rssi = num;
        this.proximity = proximity;
        this.accuracy_meters = d;
        this.coarse_latitude = d2;
        this.coarse_longitude = d3;
        this.detection_context = detectionContext;
        this.location_permission_level = locationPermissionLevel;
        this.platform = platform;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 13, "BeaconDetection", "cdf_action", "Detect");
        Countries.putSafe(m, "beacon_uuid", str);
        Countries.putSafe(m, "beacon_major", str2);
        Countries.putSafe(m, "beacon_minor", str3);
        Countries.putSafe(m, "rssi", num);
        Countries.putSafe(m, "proximity", proximity);
        Countries.putSafe(m, "accuracy_meters", d);
        Countries.putSafe(m, "coarse_latitude", d2);
        Countries.putSafe(m, "coarse_longitude", d3);
        Countries.putSafe(m, "detection_context", detectionContext);
        Countries.putSafe(m, "location_permission_level", locationPermissionLevel);
        Countries.putSafe(m, "platform", platform);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeaconDetectionDetectBeaconFound)) {
            return false;
        }
        BeaconDetectionDetectBeaconFound beaconDetectionDetectBeaconFound = (BeaconDetectionDetectBeaconFound) obj;
        return Intrinsics.areEqual(this.beacon_uuid, beaconDetectionDetectBeaconFound.beacon_uuid) && Intrinsics.areEqual(this.beacon_major, beaconDetectionDetectBeaconFound.beacon_major) && Intrinsics.areEqual(this.beacon_minor, beaconDetectionDetectBeaconFound.beacon_minor) && Intrinsics.areEqual(this.rssi, beaconDetectionDetectBeaconFound.rssi) && this.proximity == beaconDetectionDetectBeaconFound.proximity && Intrinsics.areEqual((Object) this.accuracy_meters, (Object) beaconDetectionDetectBeaconFound.accuracy_meters) && Intrinsics.areEqual((Object) this.coarse_latitude, (Object) beaconDetectionDetectBeaconFound.coarse_latitude) && Intrinsics.areEqual((Object) this.coarse_longitude, (Object) beaconDetectionDetectBeaconFound.coarse_longitude) && this.detection_context == beaconDetectionDetectBeaconFound.detection_context && this.location_permission_level == beaconDetectionDetectBeaconFound.location_permission_level && this.platform == beaconDetectionDetectBeaconFound.platform;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BeaconDetection Detect BeaconFound";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.beacon_uuid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.beacon_major;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.beacon_minor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.rssi;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Proximity proximity = this.proximity;
        int hashCode5 = (hashCode4 + (proximity == null ? 0 : proximity.hashCode())) * 31;
        Double d = this.accuracy_meters;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.coarse_latitude;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.coarse_longitude;
        int hashCode8 = (hashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        DetectionContext detectionContext = this.detection_context;
        int hashCode9 = (hashCode8 + (detectionContext == null ? 0 : detectionContext.hashCode())) * 31;
        LocationPermissionLevel locationPermissionLevel = this.location_permission_level;
        int hashCode10 = (hashCode9 + (locationPermissionLevel == null ? 0 : locationPermissionLevel.hashCode())) * 31;
        Platform platform = this.platform;
        return hashCode10 + (platform != null ? platform.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BeaconDetectionDetectBeaconFound(beacon_uuid=", this.beacon_uuid, ", beacon_major=", this.beacon_major, ", beacon_minor=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.beacon_minor, ", rssi=", this.rssi, ", proximity=");
        m.append(this.proximity);
        m.append(", accuracy_meters=");
        m.append(this.accuracy_meters);
        m.append(", coarse_latitude=");
        m.append(this.coarse_latitude);
        m.append(", coarse_longitude=");
        m.append(this.coarse_longitude);
        m.append(", detection_context=");
        m.append(this.detection_context);
        m.append(", location_permission_level=");
        m.append(this.location_permission_level);
        m.append(", platform=");
        m.append(this.platform);
        m.append(")");
        return m.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeaconDetectionDetectBeaconFound(Double d, Double d2, DetectionContext detectionContext, LocationPermissionLevel locationPermissionLevel) {
        this("D2A6E1C8-5F3B-4E8D-9C7A-1B0F3E6D8A42", null, null, null, null, null, d, d2, detectionContext, locationPermissionLevel);
        Platform platform = Platform.ANDROID;
    }
}
