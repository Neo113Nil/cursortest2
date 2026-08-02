package io.appmetrica.analytics.blewrapper.internal.config;

import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b#\u0010$J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lio/appmetrica/analytics/blewrapper/internal/config/ScanFilterConfig;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "getDeviceAddress", "()Ljava/lang/String;", "deviceAddress", "b", "getDeviceName", "deviceName", "Lio/appmetrica/analytics/blewrapper/internal/config/ManufacturerData;", "c", "Lio/appmetrica/analytics/blewrapper/internal/config/ManufacturerData;", "getManufacturerData", "()Lio/appmetrica/analytics/blewrapper/internal/config/ManufacturerData;", "manufacturerData", "Lio/appmetrica/analytics/blewrapper/internal/config/ServiceData;", "d", "Lio/appmetrica/analytics/blewrapper/internal/config/ServiceData;", "getServiceData", "()Lio/appmetrica/analytics/blewrapper/internal/config/ServiceData;", "serviceData", "Lio/appmetrica/analytics/blewrapper/internal/config/ServiceUuid;", "e", "Lio/appmetrica/analytics/blewrapper/internal/config/ServiceUuid;", "getServiceUuid", "()Lio/appmetrica/analytics/blewrapper/internal/config/ServiceUuid;", "serviceUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/appmetrica/analytics/blewrapper/internal/config/ManufacturerData;Lio/appmetrica/analytics/blewrapper/internal/config/ServiceData;Lio/appmetrica/analytics/blewrapper/internal/config/ServiceUuid;)V", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ScanFilterConfig {

    /* renamed from: a, reason: from kotlin metadata */
    private final String deviceAddress;

    /* renamed from: b, reason: from kotlin metadata */
    private final String deviceName;

    /* renamed from: c, reason: from kotlin metadata */
    private final ManufacturerData manufacturerData;

    /* renamed from: d, reason: from kotlin metadata */
    private final ServiceData serviceData;

    /* renamed from: e, reason: from kotlin metadata */
    private final ServiceUuid serviceUuid;

    public ScanFilterConfig(String str, String str2, ManufacturerData manufacturerData, ServiceData serviceData, ServiceUuid serviceUuid) {
        this.deviceAddress = str;
        this.deviceName = str2;
        this.manufacturerData = manufacturerData;
        this.serviceData = serviceData;
        this.serviceUuid = serviceUuid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ScanFilterConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        ScanFilterConfig scanFilterConfig = (ScanFilterConfig) other;
        return jl40.l(this.deviceAddress, scanFilterConfig.deviceAddress) && jl40.l(this.deviceName, scanFilterConfig.deviceName) && jl40.l(this.manufacturerData, scanFilterConfig.manufacturerData) && jl40.l(this.serviceData, scanFilterConfig.serviceData) && jl40.l(this.serviceUuid, scanFilterConfig.serviceUuid);
    }

    public final String getDeviceAddress() {
        return this.deviceAddress;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final ManufacturerData getManufacturerData() {
        return this.manufacturerData;
    }

    public final ServiceData getServiceData() {
        return this.serviceData;
    }

    public final ServiceUuid getServiceUuid() {
        return this.serviceUuid;
    }

    public int hashCode() {
        String str = this.deviceAddress;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.deviceName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ManufacturerData manufacturerData = this.manufacturerData;
        int hashCode3 = (hashCode2 + (manufacturerData != null ? manufacturerData.hashCode() : 0)) * 31;
        ServiceData serviceData = this.serviceData;
        int hashCode4 = (hashCode3 + (serviceData != null ? serviceData.hashCode() : 0)) * 31;
        ServiceUuid serviceUuid = this.serviceUuid;
        return hashCode4 + (serviceUuid != null ? serviceUuid.hashCode() : 0);
    }

    public String toString() {
        return "ScanFilterConfig(deviceAddress=" + this.deviceAddress + ", deviceName=" + this.deviceName + ", manufacturerData=" + this.manufacturerData + ", serviceData=" + this.serviceData + ", serviceUuid=" + this.serviceUuid + ')';
    }
}
