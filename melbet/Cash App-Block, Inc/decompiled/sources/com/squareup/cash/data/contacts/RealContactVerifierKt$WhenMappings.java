package com.squareup.cash.data.contacts;

import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.franklin.app.VerifyContactsResponse;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class RealContactVerifierKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[VerifyContactsResponse.Status.values().length];
        try {
            PoolVisibility.Companion companion = VerifyContactsResponse.Status.Companion;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            PoolVisibility.Companion companion2 = VerifyContactsResponse.Status.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            PoolVisibility.Companion companion3 = VerifyContactsResponse.Status.Companion;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            PoolVisibility.Companion companion4 = VerifyContactsResponse.Status.Companion;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            PoolVisibility.Companion companion5 = VerifyContactsResponse.Status.Companion;
            iArr[4] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
