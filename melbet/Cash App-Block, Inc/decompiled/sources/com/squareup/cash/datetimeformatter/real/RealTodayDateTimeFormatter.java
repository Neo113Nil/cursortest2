package com.squareup.cash.datetimeformatter.real;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.datetimeformatter.api.TodayDateTimeFormatter$FormatOptions;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes6.dex */
public final class RealTodayDateTimeFormatter {
    public final AndroidClock clock;
    public final AndroidDateFormatManager dateFormatManager;
    public final AndroidStringManager stringManager;

    public RealTodayDateTimeFormatter(AndroidClock androidClock, AndroidStringManager androidStringManager, AndroidDateFormatManager androidDateFormatManager) {
        this.clock = androidClock;
        this.stringManager = androidStringManager;
        this.dateFormatManager = androidDateFormatManager;
    }

    public final String formatDate(Instant instant, TodayDateTimeFormatter$FormatOptions todayDateTimeFormatter$FormatOptions) {
        String str;
        String format2;
        String str2;
        AndroidDateFormatManager androidDateFormatManager = this.dateFormatManager;
        AndroidClock androidClock = androidDateFormatManager.clock;
        instant.getClass();
        AndroidClock androidClock2 = this.clock;
        ZoneId of = ZoneId.of(androidClock2.timeZone().getID());
        LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(androidClock2.millis()), of).toLocalDate();
        ZonedDateTime ofInstant = ZonedDateTime.ofInstant(instant, of);
        ofInstant.getClass();
        localDate.getClass();
        StringBuilder sb = new StringBuilder();
        boolean areEqual = Intrinsics.areEqual(ofInstant.toLocalDate(), localDate);
        String str3 = null;
        String concat = (!areEqual || (str2 = todayDateTimeFormatter$FormatOptions.prefixToday) == null) ? (areEqual || (str = todayDateTimeFormatter$FormatOptions.prefixOtherDays) == null) ? null : str.concat(" ") : str2.concat(" ");
        if (concat != null) {
            sb.append(concat);
        }
        boolean areEqual2 = Intrinsics.areEqual(ofInstant.toLocalDate(), localDate);
        AndroidStringManager androidStringManager = this.stringManager;
        if (areEqual2) {
            format2 = androidStringManager.get(R.string.datetime_formatter_today);
        } else if (todayDateTimeFormatter$FormatOptions.formatTomorrow && Intrinsics.areEqual(ofInstant.toLocalDate(), localDate.plusDays(1L))) {
            format2 = androidStringManager.get(R.string.datetime_formatter_tomorrow);
        } else if (todayDateTimeFormatter$FormatOptions.formatYesterday && Intrinsics.areEqual(ofInstant.toLocalDate(), localDate.minusDays(1L))) {
            format2 = androidStringManager.get(R.string.datetime_formatter_yesterday);
        } else {
            format2 = androidDateFormatManager.getDateFormat((todayDateTimeFormatter$FormatOptions.alwaysShowYear || localDate.getYear() != ofInstant.getYear()) ? "MMMdyyyy" : "MMMd", androidClock.timeZone()).formatter.format(ofInstant);
            format2.getClass();
        }
        sb.append(format2);
        if (todayDateTimeFormatter$FormatOptions.showTime) {
            String format3 = androidDateFormatManager.getDateFormat("h:mm a", androidClock.timeZone()).formatter.format(ofInstant);
            format3.getClass();
            str3 = CameraSelector$$ExternalSyntheticOutline0.m(" ", androidStringManager.get(R.string.datetime_formatter_time_at), " ", new Regex("\\p{Zs}+").replace(format3, " "));
        }
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }
}
