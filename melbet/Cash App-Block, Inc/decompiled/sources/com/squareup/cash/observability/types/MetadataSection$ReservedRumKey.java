package com.squareup.cash.observability.types;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes.dex */
public abstract class MetadataSection$ReservedRumKey extends MetadataKey {

    /* loaded from: classes6.dex */
    public final class AppTokenKey extends MetadataSection$ReservedRumKey {
        public static final AppTokenKey INSTANCE = new AppTokenKey("app_token");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AppTokenKey);
        }

        public final int hashCode() {
            return 2098459842;
        }

        public final String toString() {
            return "AppTokenKey";
        }
    }

    /* loaded from: classes6.dex */
    public final class DeviceBrandKey extends MetadataSection$ReservedRumKey {
        public static final DeviceBrandKey INSTANCE = new DeviceBrandKey(Recorder$$ExternalSyntheticOutline2.m$1((String) MetadataSection$DeviceSection.INSTANCE.valueType, ".brand"));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DeviceBrandKey);
        }

        public final int hashCode() {
            return 418990611;
        }

        public final String toString() {
            return "DeviceBrandKey";
        }
    }

    /* loaded from: classes6.dex */
    public final class DeviceModelKey extends MetadataSection$ReservedRumKey {
        public static final DeviceModelKey INSTANCE = new DeviceModelKey(Recorder$$ExternalSyntheticOutline2.m$1((String) MetadataSection$DeviceSection.INSTANCE.valueType, ".model"));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DeviceModelKey);
        }

        public final int hashCode() {
            return -174661839;
        }

        public final String toString() {
            return "DeviceModelKey";
        }
    }

    /* loaded from: classes6.dex */
    public final class OsNameKey extends MetadataSection$ReservedRumKey {
        public static final OsNameKey INSTANCE = new OsNameKey(Recorder$$ExternalSyntheticOutline2.m$1((String) MetadataSection$OperatingSystemSection.INSTANCE.valueType, ".name"));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OsNameKey);
        }

        public final int hashCode() {
            return -1874329109;
        }

        public final String toString() {
            return "OsNameKey";
        }
    }

    /* loaded from: classes6.dex */
    public final class OsVersionKey extends MetadataSection$ReservedRumKey {
        public static final OsVersionKey INSTANCE = new OsVersionKey(Recorder$$ExternalSyntheticOutline2.m$1((String) MetadataSection$OperatingSystemSection.INSTANCE.valueType, ".version"));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OsVersionKey);
        }

        public final int hashCode() {
            return 1051461872;
        }

        public final String toString() {
            return "OsVersionKey";
        }
    }

    public MetadataSection$ReservedRumKey(String str) {
        super(str, "n/a", str);
    }
}
