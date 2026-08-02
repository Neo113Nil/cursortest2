package com.datadog.android.api.context;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class DeviceInfo {
    public final String architecture;
    public final String deviceBrand;
    public final String deviceBuildId;
    public final String deviceModel;
    public final String deviceName;
    public final DeviceType deviceType;
    public final LocaleInfo localeInfo;
    public final Integer numberOfDisplays;
    public final String osMajorVersion;
    public final String osName;
    public final String osVersion;

    public DeviceInfo(String str, String str2, String str3, DeviceType deviceType, String str4, String str5, String str6, String str7, String str8, Integer num, LocaleInfo localeInfo) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        deviceType.getClass();
        str4.getClass();
        Request$Priority$EnumUnboxingLocalUtility.m(str5, str6, str7, str8);
        this.deviceName = str;
        this.deviceBrand = str2;
        this.deviceModel = str3;
        this.deviceType = deviceType;
        this.deviceBuildId = str4;
        this.osName = str5;
        this.osMajorVersion = str6;
        this.osVersion = str7;
        this.architecture = str8;
        this.numberOfDisplays = num;
        this.localeInfo = localeInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return Intrinsics.areEqual(this.deviceName, deviceInfo.deviceName) && Intrinsics.areEqual(this.deviceBrand, deviceInfo.deviceBrand) && Intrinsics.areEqual(this.deviceModel, deviceInfo.deviceModel) && this.deviceType == deviceInfo.deviceType && Intrinsics.areEqual(this.deviceBuildId, deviceInfo.deviceBuildId) && Intrinsics.areEqual(this.osName, deviceInfo.osName) && Intrinsics.areEqual(this.osMajorVersion, deviceInfo.osMajorVersion) && Intrinsics.areEqual(this.osVersion, deviceInfo.osVersion) && Intrinsics.areEqual(this.architecture, deviceInfo.architecture) && Intrinsics.areEqual(this.numberOfDisplays, deviceInfo.numberOfDisplays) && this.localeInfo.equals(deviceInfo.localeInfo);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.deviceType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.deviceName.hashCode() * 31, 31, this.deviceBrand), 31, this.deviceModel)) * 31, 31, this.deviceBuildId), 31, this.osName), 31, this.osMajorVersion), 31, this.osVersion), 31, this.architecture);
        Integer num = this.numberOfDisplays;
        return this.localeInfo.hashCode() + ((m + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeviceInfo(deviceName=", this.deviceName, ", deviceBrand=", this.deviceBrand, ", deviceModel=");
        m.append(this.deviceModel);
        m.append(", deviceType=");
        m.append(this.deviceType);
        m.append(", deviceBuildId=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.deviceBuildId, ", osName=", this.osName, ", osMajorVersion=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.osMajorVersion, ", osVersion=", this.osVersion, ", architecture=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.architecture, ", numberOfDisplays=", this.numberOfDisplays, ", localeInfo=");
        m.append(this.localeInfo);
        m.append(")");
        return m.toString();
    }
}
