package com.squareup.cash.score.views;

import com.squareup.cash.notifications.Op;
import com.squareup.lending.CashCreditScoreHomeData;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class ScoreHomeKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CashCreditScoreHomeData.TextAlignment.values().length];
        try {
            Op.Companion companion = CashCreditScoreHomeData.TextAlignment.Companion;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            Op.Companion companion2 = CashCreditScoreHomeData.TextAlignment.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
