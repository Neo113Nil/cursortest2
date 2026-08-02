package com.connectsdk.device;

/* loaded from: classes.dex */
public interface DevicePickerListener {
    void onPickDevice(ConnectableDevice connectableDevice);

    void onPickDeviceFailed(boolean z);
}
