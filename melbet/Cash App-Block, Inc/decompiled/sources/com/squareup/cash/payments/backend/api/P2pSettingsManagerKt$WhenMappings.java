package com.squareup.cash.payments.backend.api;

import com.squareup.protos.franklin.api.RatePlan;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class P2pSettingsManagerKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[RatePlan.values().length];
        try {
            iArr[RatePlan.BUSINESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RatePlan.BUSINESS_0.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RatePlan.BUSINESS_1_5.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RatePlan.BUSINESS_1_9.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RatePlan.BUSINESS_2_60.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RatePlan.BUSINESS_2_75.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[RatePlan.BUSINESS_NONPROFIT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[RatePlan.BUSINESS_MERCHANT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
