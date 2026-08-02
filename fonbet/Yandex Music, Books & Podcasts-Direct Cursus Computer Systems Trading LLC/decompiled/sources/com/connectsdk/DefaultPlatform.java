package com.connectsdk;

import java.util.HashMap;

/* loaded from: classes.dex */
public class DefaultPlatform {
    public static HashMap<String, String> getDeviceServiceMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("com.connectsdk.service.WebOSTVService", "com.connectsdk.discovery.provider.SSDPDiscoveryProvider");
        hashMap.put("com.connectsdk.service.NetcastTVService", "com.connectsdk.discovery.provider.SSDPDiscoveryProvider");
        hashMap.put("com.connectsdk.service.DLNAService", "com.connectsdk.discovery.provider.SSDPDiscoveryProvider");
        hashMap.put("com.connectsdk.service.DIALService", "com.connectsdk.discovery.provider.SSDPDiscoveryProvider");
        hashMap.put("com.connectsdk.service.RokuService", "com.connectsdk.discovery.provider.SSDPDiscoveryProvider");
        hashMap.put("com.connectsdk.service.AirPlayService", "com.connectsdk.discovery.provider.ZeroconfDiscoveryProvider");
        return hashMap;
    }
}
