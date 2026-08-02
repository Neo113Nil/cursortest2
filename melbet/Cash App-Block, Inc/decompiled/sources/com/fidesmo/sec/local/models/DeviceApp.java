package com.fidesmo.sec.local.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/fidesmo/sec/local/models/DeviceApp;", "", "appId", "", "status", "Lcom/fidesmo/sec/local/models/DeviceAppStatus;", "(Ljava/lang/String;Lcom/fidesmo/sec/local/models/DeviceAppStatus;)V", "getAppId", "()Ljava/lang/String;", "getStatus", "()Lcom/fidesmo/sec/local/models/DeviceAppStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeviceApp {
    private final String appId;
    private final DeviceAppStatus status;

    public DeviceApp(String str, DeviceAppStatus deviceAppStatus) {
        str.getClass();
        deviceAppStatus.getClass();
        this.appId = str;
        this.status = deviceAppStatus;
    }

    public static /* synthetic */ DeviceApp copy$default(DeviceApp deviceApp, String str, DeviceAppStatus deviceAppStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceApp.appId;
        }
        if ((i & 2) != 0) {
            deviceAppStatus = deviceApp.status;
        }
        return deviceApp.copy(str, deviceAppStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component2, reason: from getter */
    public final DeviceAppStatus getStatus() {
        return this.status;
    }

    public final DeviceApp copy(String appId, DeviceAppStatus status) {
        appId.getClass();
        status.getClass();
        return new DeviceApp(appId, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceApp)) {
            return false;
        }
        DeviceApp deviceApp = (DeviceApp) other;
        return Intrinsics.areEqual(this.appId, deviceApp.appId) && this.status == deviceApp.status;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final DeviceAppStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.appId.hashCode() * 31);
    }

    public String toString() {
        return "DeviceApp(appId=" + this.appId + ", status=" + this.status + ')';
    }
}
