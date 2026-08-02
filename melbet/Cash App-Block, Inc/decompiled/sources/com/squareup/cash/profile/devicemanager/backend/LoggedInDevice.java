package com.squareup.cash.profile.devicemanager.backend;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LoggedInDevice {
    public final String appToken;
    public final DeviceType deviceType;
    public final boolean isThisDevice;
    public final LastLogin lastLogin;
    public final Long lastVerifiedTimeMillis;
    public final String name;
    public final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class DeviceType {
        public static final /* synthetic */ DeviceType[] $VALUES;
        public static final DeviceType ANDROID;
        public static final DeviceType BROWSER;
        public static final DeviceType IPAD;
        public static final DeviceType IPHONE;
        public static final DeviceType IPOD_TOUCH;
        public static final DeviceType MAC;
        public static final DeviceType OTHER;
        public static final DeviceType WINDOWS;

        static {
            DeviceType deviceType = new DeviceType("ANDROID", 0);
            ANDROID = deviceType;
            DeviceType deviceType2 = new DeviceType("BROWSER", 1);
            BROWSER = deviceType2;
            DeviceType deviceType3 = new DeviceType("MAC", 2);
            MAC = deviceType3;
            DeviceType deviceType4 = new DeviceType("WINDOWS", 3);
            WINDOWS = deviceType4;
            DeviceType deviceType5 = new DeviceType("IPAD", 4);
            IPAD = deviceType5;
            DeviceType deviceType6 = new DeviceType("IPHONE", 5);
            IPHONE = deviceType6;
            DeviceType deviceType7 = new DeviceType("IPOD_TOUCH", 6);
            IPOD_TOUCH = deviceType7;
            DeviceType deviceType8 = new DeviceType("OTHER", 7);
            OTHER = deviceType8;
            $VALUES = new DeviceType[]{deviceType, deviceType2, deviceType3, deviceType4, deviceType5, deviceType6, deviceType7, deviceType8};
        }

        public static DeviceType valueOf(String str) {
            return (DeviceType) Enum.valueOf(DeviceType.class, str);
        }

        public static DeviceType[] values() {
            return (DeviceType[]) $VALUES.clone();
        }
    }

    public final class LastLogin {
        public final String locationName;
        public final String locationUrl;
        public final long timestampMillis;

        public LastLogin(long j, String str, String str2) {
            this.timestampMillis = j;
            this.locationName = str;
            this.locationUrl = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LastLogin)) {
                return false;
            }
            LastLogin lastLogin = (LastLogin) obj;
            return this.timestampMillis == lastLogin.timestampMillis && Intrinsics.areEqual(this.locationName, lastLogin.locationName) && Intrinsics.areEqual(this.locationUrl, lastLogin.locationUrl);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.timestampMillis) * 31;
            String str = this.locationName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.locationUrl;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline2.m(re$$ExternalSyntheticOutline0.m("LastLogin(timestampMillis=", this.timestampMillis, ", locationName=", this.locationName), ", locationUrl=", this.locationUrl, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Status {
        public static final /* synthetic */ Status[] $VALUES;
        public static final Status LOGGED_IN;
        public static final Status LOGGED_OUT;

        static {
            Status status = new Status("LOGGED_IN", 0);
            LOGGED_IN = status;
            Status status2 = new Status("LOGGED_OUT", 1);
            LOGGED_OUT = status2;
            $VALUES = new Status[]{status, status2};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public LoggedInDevice(String str, String str2, DeviceType deviceType, Status status, LastLogin lastLogin, boolean z, Long l) {
        this.appToken = str;
        this.name = str2;
        this.deviceType = deviceType;
        this.status = status;
        this.lastLogin = lastLogin;
        this.isThisDevice = z;
        this.lastVerifiedTimeMillis = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoggedInDevice)) {
            return false;
        }
        LoggedInDevice loggedInDevice = (LoggedInDevice) obj;
        return this.appToken.equals(loggedInDevice.appToken) && this.name.equals(loggedInDevice.name) && this.deviceType == loggedInDevice.deviceType && this.status == loggedInDevice.status && this.lastLogin.equals(loggedInDevice.lastLogin) && this.isThisDevice == loggedInDevice.isThisDevice && Intrinsics.areEqual(this.lastVerifiedTimeMillis, loggedInDevice.lastVerifiedTimeMillis);
    }

    public final String getAppToken() {
        return this.appToken;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.lastLogin.hashCode() + ((this.status.hashCode() + ((this.deviceType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.appToken.hashCode() * 31, 31, this.name)) * 31)) * 31)) * 31, 31, this.isThisDevice);
        Long l = this.lastVerifiedTimeMillis;
        return m + (l == null ? 0 : l.hashCode());
    }

    public final boolean isThisDevice() {
        return this.isThisDevice;
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoggedInDevice(appToken=", this.appToken, ", name=", this.name, ", deviceType=");
        m.append(this.deviceType);
        m.append(", status=");
        m.append(this.status);
        m.append(", lastLogin=");
        m.append(this.lastLogin);
        m.append(", isThisDevice=");
        m.append(this.isThisDevice);
        m.append(", lastVerifiedTimeMillis=");
        return Thread$State$EnumUnboxingLocalUtility.m(m, this.lastVerifiedTimeMillis, ")");
    }
}
