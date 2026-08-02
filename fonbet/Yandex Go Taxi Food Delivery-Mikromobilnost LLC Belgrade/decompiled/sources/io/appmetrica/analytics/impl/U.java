package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsItemStatus;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class U {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StartupParamsItemStatus.values().length];
        try {
            iArr[StartupParamsItemStatus.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StartupParamsItemStatus.FEATURE_DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StartupParamsItemStatus.PROVIDER_UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[StartupParamsItemStatus.FORBIDDEN_BY_CLIENT_CONFIG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
