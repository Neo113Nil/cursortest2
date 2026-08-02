package com.connectsdk.discovery;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.command.ServiceCommandError;

/* loaded from: classes.dex */
public interface DiscoveryManagerListener {
    void onDeviceAdded(DiscoveryManager discoveryManager, ConnectableDevice connectableDevice);

    void onDeviceRemoved(DiscoveryManager discoveryManager, ConnectableDevice connectableDevice);

    void onDeviceUpdated(DiscoveryManager discoveryManager, ConnectableDevice connectableDevice);

    void onDiscoveryFailed(DiscoveryManager discoveryManager, ServiceCommandError serviceCommandError);
}
