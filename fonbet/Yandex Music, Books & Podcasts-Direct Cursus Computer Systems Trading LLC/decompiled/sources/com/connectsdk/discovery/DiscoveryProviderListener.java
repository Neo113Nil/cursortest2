package com.connectsdk.discovery;

import com.connectsdk.service.command.ServiceCommandError;
import com.connectsdk.service.config.ServiceDescription;

/* loaded from: classes.dex */
public interface DiscoveryProviderListener {
    void onServiceAdded(DiscoveryProvider discoveryProvider, ServiceDescription serviceDescription);

    void onServiceDiscoveryFailed(DiscoveryProvider discoveryProvider, ServiceCommandError serviceCommandError);

    void onServiceRemoved(DiscoveryProvider discoveryProvider, ServiceDescription serviceDescription);
}
