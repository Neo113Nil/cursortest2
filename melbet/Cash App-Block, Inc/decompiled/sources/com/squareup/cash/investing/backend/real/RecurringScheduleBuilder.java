package com.squareup.cash.investing.backend.real;

import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class RecurringScheduleBuilder {
    public final AndroidClock clock;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurringSchedule.Frequency.values().length];
            try {
                iArr[RecurringSchedule.Frequency.EVERY_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_TWO_WEEKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RecurringScheduleBuilder(AndroidClock androidClock) {
        this.clock = androidClock;
    }

    public final RecurringSchedule build(RecurringSchedule.Frequency frequency) {
        List list;
        if (frequency == null) {
            return null;
        }
        AndroidClock androidClock = this.clock;
        Calendar calendar = Calendar.getInstance(androidClock.timeZone(), Locale.US);
        calendar.setTimeInMillis(androidClock.millis());
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            list = EmptyList.INSTANCE;
        } else if (i == 2 || i == 3) {
            Object clone = calendar.clone();
            clone.getClass();
            Calendar calendar2 = (Calendar) clone;
            if (calendar2.getFirstDayOfWeek() == 1) {
                calendar2.add(7, -1);
            }
            list = CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(calendar2.get(7)));
        } else {
            if (i != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            list = CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(calendar.get(5)));
        }
        List list2 = list;
        Object clone2 = calendar.clone();
        clone2.getClass();
        Calendar calendar3 = (Calendar) clone2;
        calendar3.set(11, 0);
        calendar3.set(12, 0);
        calendar3.set(13, 0);
        calendar3.set(14, 0);
        return new RecurringSchedule(frequency, list2, calendar.getTimeZone().getID(), Integer.valueOf((int) (calendar.getTimeInMillis() - calendar3.getTimeInMillis())), 16);
    }
}
