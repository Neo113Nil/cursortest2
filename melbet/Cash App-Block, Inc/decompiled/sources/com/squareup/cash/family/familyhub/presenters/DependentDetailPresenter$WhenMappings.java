package com.squareup.cash.family.familyhub.presenters;

import com.squareup.cash.family.familyhub.backend.api.DependentBalanceName;
import com.squareup.protos.cash.piggybank.api.v2.InterestYieldStatus;
import com.squareup.protos.cash.ui.ActionType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class DependentDetailPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[DependentBalanceName.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            DependentBalanceName dependentBalanceName = DependentBalanceName.Cash;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            DependentBalanceName dependentBalanceName2 = DependentBalanceName.Cash;
            iArr[3] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[InterestYieldStatus.values().length];
        try {
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            ActionType.Companion companion = InterestYieldStatus.Companion;
            iArr2[2] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
