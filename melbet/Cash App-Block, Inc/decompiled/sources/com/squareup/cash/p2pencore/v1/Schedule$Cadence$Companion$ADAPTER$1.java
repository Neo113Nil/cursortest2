package com.squareup.cash.p2pencore.v1;

import com.squareup.cash.p2pencore.v1.Schedule;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class Schedule$Cadence$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Schedule.Cadence.Companion.getClass();
        if (i == 0) {
            return Schedule.Cadence.CADENCE_UNSPECIFIED;
        }
        if (i == 1) {
            return Schedule.Cadence.CADENCE_WEEKLY;
        }
        if (i == 2) {
            return Schedule.Cadence.CADENCE_BIWEEKLY;
        }
        if (i != 3) {
            return null;
        }
        return Schedule.Cadence.CADENCE_MONTHLY;
    }
}
