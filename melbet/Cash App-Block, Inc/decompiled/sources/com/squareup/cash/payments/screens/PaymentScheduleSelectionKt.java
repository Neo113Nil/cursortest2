package com.squareup.cash.payments.screens;

import coil3.size.DimensionKt;
import com.squareup.protos.franklin.common.ScheduleRFC2445;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import java.time.ZoneId;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes6.dex */
public abstract class PaymentScheduleSelectionKt {
    public static ScheduleRFC2445 toScheduleProto$default(PaymentScheduleSelection paymentScheduleSelection) {
        ZoneId systemDefault = ZoneId.systemDefault();
        systemDefault.getClass();
        paymentScheduleSelection.getClass();
        LocalDate localDate = paymentScheduleSelection.date;
        long epochMilli = localDate.atStartOfDay(systemDefault).toInstant().toEpochMilli();
        int ordinal = paymentScheduleSelection.frequency.ordinal();
        if (ordinal == 0) {
            return new ScheduleRFC2445(Long.valueOf(epochMilli), systemDefault.getId(), ScheduleRFC2445.Frequency.WEEKLY, 1L, null, 112);
        }
        if (ordinal == 1) {
            return new ScheduleRFC2445(Long.valueOf(epochMilli), systemDefault.getId(), ScheduleRFC2445.Frequency.WEEKLY, 2L, null, 112);
        }
        if (ordinal == 2) {
            return new ScheduleRFC2445(Long.valueOf(epochMilli), systemDefault.getId(), ScheduleRFC2445.Frequency.MONTHLY, 1L, CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(DimensionKt.getSafeDayOfMonth(localDate))), 80);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
