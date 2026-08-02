package com.connectsdk.device;

/* loaded from: classes.dex */
public interface SimpleDevicePickerListener extends DevicePickerListener {
    @Override // com.connectsdk.device.DevicePickerListener
    void onPickDevice(ConnectableDevice connectableDevice);

    @Override // com.connectsdk.device.DevicePickerListener
    void onPickDeviceFailed(boolean z);

    void onPrepareDevice(ConnectableDevice connectableDevice);
}
