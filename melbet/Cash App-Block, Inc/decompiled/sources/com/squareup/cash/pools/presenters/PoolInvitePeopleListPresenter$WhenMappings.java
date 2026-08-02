package com.squareup.cash.pools.presenters;

import com.squareup.cash.recipients.data.Section;
import com.squareup.protos.cash.pools.AddCustomersToPoolResponse;
import com.squareup.protos.cash.pools.RemoveCustomersFromPoolResponse;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.tax.TaxEnvironment;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class PoolInvitePeopleListPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[AddCustomersToPoolResponse.FailureReason.values().length];
        try {
            iArr[2] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            TextSize.Companion companion = AddCustomersToPoolResponse.FailureReason.Companion;
            iArr[4] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            TextSize.Companion companion2 = AddCustomersToPoolResponse.FailureReason.Companion;
            iArr[0] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            TextSize.Companion companion3 = AddCustomersToPoolResponse.FailureReason.Companion;
            iArr[1] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            TextSize.Companion companion4 = AddCustomersToPoolResponse.FailureReason.Companion;
            iArr[5] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            TextSize.Companion companion5 = AddCustomersToPoolResponse.FailureReason.Companion;
            iArr[3] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            TextSize.Companion companion6 = AddCustomersToPoolResponse.FailureReason.Companion;
            iArr[6] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[RemoveCustomersFromPoolResponse.FailureReason.values().length];
        try {
            iArr2[2] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            TaxEnvironment.Companion companion7 = RemoveCustomersFromPoolResponse.FailureReason.Companion;
            iArr2[3] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[Section.Type.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            Section.Type type2 = Section.Type.SUGGESTED;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            Section.Type type3 = Section.Type.SUGGESTED;
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
