package com.bugsnag.android;

import dev.zacsweers.metro.Provider;

/* loaded from: classes.dex */
public final class DeviceBuildInfo {
    public final Object apiLevel;
    public final Object brand;
    public final Object cpuAbis;
    public final Object fingerprint;
    public final Object manufacturer;
    public final Object model;
    public final Object osBuild;
    public final Object osVersion;
    public final Object tags;

    public /* synthetic */ DeviceBuildInfo(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.manufacturer = provider;
        this.model = provider2;
        this.osVersion = provider3;
        this.osBuild = provider4;
        this.fingerprint = provider5;
        this.tags = provider6;
        this.brand = provider7;
        this.apiLevel = provider8;
        this.cpuAbis = provider9;
    }

    public DeviceBuildInfo(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String[] strArr) {
        this.manufacturer = str;
        this.model = str2;
        this.osVersion = str3;
        this.apiLevel = num;
        this.osBuild = str4;
        this.fingerprint = str5;
        this.tags = str6;
        this.brand = str7;
        this.cpuAbis = strArr;
    }
}
