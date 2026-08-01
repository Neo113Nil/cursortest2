package com.onesignal.core.internal.http.impl;

import com.onesignal.common.h;

/* loaded from: classes2.dex */
public abstract class b {
    public static final String HTTP_SDK_VERSION_HEADER_KEY = "SDK-Version";
    private static final String HTTP_SDK_VERSION_HEADER_VALUE = "onesignal/android/" + h.INSTANCE.getSdkVersion();

    public static final String getHTTP_SDK_VERSION_HEADER_VALUE() {
        return HTTP_SDK_VERSION_HEADER_VALUE;
    }
}
