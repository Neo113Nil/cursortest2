package com.squareup.cash.profile.devicemanager.backend;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class ProfileDeviceManagerBackendModule$Companion$provideDeviceHashKeyValue$1 extends FunctionReferenceImpl implements Function1 {
    public static final ProfileDeviceManagerBackendModule$Companion$provideDeviceHashKeyValue$1 INSTANCE = new ProfileDeviceManagerBackendModule$Companion$provideDeviceHashKeyValue$1(1, DeviceInfoHash.class, "<init>", "constructor-impl(Ljava/lang/String;)Ljava/lang/String;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return new DeviceInfoHash(str);
    }
}
