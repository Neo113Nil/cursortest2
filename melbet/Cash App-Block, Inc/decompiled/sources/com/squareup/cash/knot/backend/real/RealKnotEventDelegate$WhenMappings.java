package com.squareup.cash.knot.backend.real;

import com.knotapi.knot.models.KnotError;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class RealKnotEventDelegate$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[KnotError.values().length];
        try {
            iArr[KnotError.INVALID_SESSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KnotError.EXPIRED_SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KnotError.INVALID_CLIENT_ID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[KnotError.INTERNAL_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[KnotError.INVALID_CARD_NAME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[KnotError.INVALID_CUSTOMER_NAME.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[KnotError.INVALID_LOGO_ID.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[KnotError.MERCHANT_ID_NOT_FOUND.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
