package androidx.compose.material3.internal;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;
import kotlin.enums.EnumEntriesList;
import okhttp3.internal.Tags;

/* loaded from: classes3.dex */
public final class CalendarModelImpl {
    public static final ZoneId utcTimeZoneId = ZoneId.of("UTC");
    public final int firstDayOfWeek;
    public final LinkedHashMap formatterCache = new LinkedHashMap();
    public final Locale locale;
    public final ArrayList weekdayNames;

    public abstract /* synthetic */ class EntriesMappings {
        public static final /* synthetic */ EnumEntriesList entries$0 = Tags.enumEntries(DayOfWeek.values());
    }

    public CalendarModelImpl(Locale locale) {
        this.locale = locale;
        this.firstDayOfWeek = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        EnumEntriesList enumEntriesList = EntriesMappings.entries$0;
        ArrayList arrayList = new ArrayList(enumEntriesList.getSize());
        int size = enumEntriesList.getSize();
        for (int i = 0; i < size; i++) {
            DayOfWeek dayOfWeek = (DayOfWeek) enumEntriesList.get(i);
            arrayList.add(new Pair(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, locale), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.weekdayNames = arrayList;
    }

    public final CalendarDate getCanonicalDate(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(utcTimeZoneId).toLocalDate();
        return new CalendarDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 1000 * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    public final CalendarMonth getMonth(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.firstDayOfWeek;
        if (value < 0) {
            value += 7;
        }
        return new CalendarMonth(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
    }

    public final CalendarDate getToday() {
        LocalDate now = LocalDate.now();
        return new CalendarDate(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), now.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
    }

    public final CalendarDate parse(String str, String str2, Locale locale) {
        try {
            LocalDate parse = LocalDate.parse(str, Icons$Filled.getCachedDateTimeFormatter(str2, locale, this.formatterCache));
            return new CalendarDate(parse.getYear(), parse.getMonth().getValue(), parse.getDayOfMonth(), parse.atTime(LocalTime.MIDNIGHT).atZone(utcTimeZoneId).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public final String toString() {
        return "CalendarModel";
    }

    public final CalendarMonth getMonth(long j) {
        return getMonth(Instant.ofEpochMilli(j).atZone(utcTimeZoneId).withDayOfMonth(1).toLocalDate());
    }
}
