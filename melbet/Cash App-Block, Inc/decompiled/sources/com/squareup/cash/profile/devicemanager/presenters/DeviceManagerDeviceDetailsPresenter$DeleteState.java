package com.squareup.cash.profile.devicemanager.presenters;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DeviceManagerDeviceDetailsPresenter$DeleteState {
    public final String deviceId;
    public final boolean isInProgress;

    public DeviceManagerDeviceDetailsPresenter$DeleteState(String str, boolean z) {
        this.deviceId = str;
        this.isInProgress = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceManagerDeviceDetailsPresenter$DeleteState)) {
            return false;
        }
        DeviceManagerDeviceDetailsPresenter$DeleteState deviceManagerDeviceDetailsPresenter$DeleteState = (DeviceManagerDeviceDetailsPresenter$DeleteState) obj;
        return Intrinsics.areEqual(this.deviceId, deviceManagerDeviceDetailsPresenter$DeleteState.deviceId) && this.isInProgress == deviceManagerDeviceDetailsPresenter$DeleteState.isInProgress;
    }

    public final int hashCode() {
        String str = this.deviceId;
        return Boolean.hashCode(this.isInProgress) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("DeleteState(deviceId=", this.deviceId, ", isInProgress=", ")", this.isInProgress);
    }
}
