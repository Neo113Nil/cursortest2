package com.squareup.cash.pools.backend.real;

import com.squareup.protos.cash.pools.CreatePoolResponse;
import com.squareup.protos.cash.pools.PoolVisibility;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class RealPoolsRepository$createPool$2$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CreatePoolResponse.FailureReason.values().length];
        try {
            PoolVisibility.Companion companion = CreatePoolResponse.FailureReason.Companion;
            iArr[4] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            PoolVisibility.Companion companion2 = CreatePoolResponse.FailureReason.Companion;
            iArr[3] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            PoolVisibility.Companion companion3 = CreatePoolResponse.FailureReason.Companion;
            iArr[6] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            PoolVisibility.Companion companion4 = CreatePoolResponse.FailureReason.Companion;
            iArr[8] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            PoolVisibility.Companion companion5 = CreatePoolResponse.FailureReason.Companion;
            iArr[9] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
