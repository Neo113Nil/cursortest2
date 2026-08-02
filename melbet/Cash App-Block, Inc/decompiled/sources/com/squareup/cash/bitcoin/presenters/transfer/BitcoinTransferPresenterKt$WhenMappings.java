package com.squareup.cash.bitcoin.presenters.transfer;

import com.squareup.protos.repeatedly.common.RecurringSchedule;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BitcoinTransferPresenterKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[RecurringSchedule.Frequency.values().length];
        try {
            iArr[RecurringSchedule.Frequency.EVERY_WEEK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RecurringSchedule.Frequency.EVERY_TWO_WEEKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RecurringSchedule.Frequency.EVERY_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RecurringSchedule.Frequency.EVERY_DAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
