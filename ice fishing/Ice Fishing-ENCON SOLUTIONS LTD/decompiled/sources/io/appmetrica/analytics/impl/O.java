package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes.dex */
public abstract /* synthetic */ class O {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4841a;

    static {
        int[] iArr = new int[IdentifierStatus.values().length];
        f4841a = iArr;
        try {
            iArr[IdentifierStatus.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4841a[IdentifierStatus.FEATURE_DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4841a[IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f4841a[IdentifierStatus.INVALID_ADV_ID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f4841a[IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
