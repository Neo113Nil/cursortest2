package com.squareup.cash.limits.presenters;

import com.squareup.cash.limits.viewmodels.LimitsType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class LimitsPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[LimitsType.values().length];
        try {
            LimitsType limitsType = LimitsType.FLAT;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LimitsType limitsType2 = LimitsType.FLAT;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
