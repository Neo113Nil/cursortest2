package com.squareup.cash.cashoclock.api.v1_0.syncvalues;

import com.squareup.cash.cashoclock.api.v1_0.syncvalues.RecurringSchedule;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class RecurringSchedule$Frequency$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RecurringSchedule.Frequency.Companion.getClass();
        if (i == 1) {
            return RecurringSchedule.Frequency.EVERY_WEEK;
        }
        if (i == 2) {
            return RecurringSchedule.Frequency.EVERY_TWO_WEEKS;
        }
        if (i == 3) {
            return RecurringSchedule.Frequency.EVERY_MONTH;
        }
        if (i != 4) {
            return null;
        }
        return RecurringSchedule.Frequency.EVERY_DAY;
    }
}
