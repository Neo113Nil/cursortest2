package com.squareup.cash.limits.viewmodels;

import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.protos.cash.compass.api.RadioType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class LimitViewModelKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[LimitsSectionType.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LimitsSectionType limitsSectionType = LimitsSectionType.UNKNOWN;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LimitsSectionType limitsSectionType2 = LimitsSectionType.UNKNOWN;
            iArr[3] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LimitsSectionType limitsSectionType3 = LimitsSectionType.UNKNOWN;
            iArr[4] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LimitsSectionType limitsSectionType4 = LimitsSectionType.UNKNOWN;
            iArr[5] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LimitsSectionType limitsSectionType5 = LimitsSectionType.UNKNOWN;
            iArr[0] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[GetCustomerLimitsResponse.LimitsSection.SectionType.values().length];
        try {
            iArr2[4] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            RadioType.Companion companion = GetCustomerLimitsResponse.LimitsSection.SectionType.Companion;
            iArr2[3] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            RadioType.Companion companion2 = GetCustomerLimitsResponse.LimitsSection.SectionType.Companion;
            iArr2[1] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            RadioType.Companion companion3 = GetCustomerLimitsResponse.LimitsSection.SectionType.Companion;
            iArr2[2] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            RadioType.Companion companion4 = GetCustomerLimitsResponse.LimitsSection.SectionType.Companion;
            iArr2[5] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
