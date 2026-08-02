package com.squareup.cash.afterpayapplet.applets.views;

import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.afterpayapplet.applets.viewmodels.CreditStateType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class AfterpayAppletTile$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[CreditStateType.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            CreditStateType creditStateType = CreditStateType.SHOW_FULL_CREDIT_AVAILABLE;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            CreditStateType creditStateType2 = CreditStateType.SHOW_FULL_CREDIT_AVAILABLE;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType.values().length];
        try {
            iArr2[4] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType ringCreditLineType = AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType.CREDIT_INN;
            iArr2[0] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType ringCreditLineType2 = AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType.CREDIT_INN;
            iArr2[1] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType ringCreditLineType3 = AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType.CREDIT_INN;
            iArr2[2] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType ringCreditLineType4 = AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType.CREDIT_INN;
            iArr2[3] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
