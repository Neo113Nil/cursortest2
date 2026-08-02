package com.squareup.cash.profile.devicemanager.backend;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ProfileDeviceManagerBackendModule$Companion$provideDeviceHashKeyValue$2 implements Function1 {
    public static final ProfileDeviceManagerBackendModule$Companion$provideDeviceHashKeyValue$2 INSTANCE = new ProfileDeviceManagerBackendModule$Companion$provideDeviceHashKeyValue$2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = ((DeviceInfoHash) obj).deviceInfoHash;
        str.getClass();
        return str;
    }
}
