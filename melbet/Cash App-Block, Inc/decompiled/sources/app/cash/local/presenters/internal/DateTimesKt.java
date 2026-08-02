package app.cash.local.presenters.internal;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import app.cash.local.primitives.EstimatedCompletionDuration;
import app.cash.local.primitives.EstimatedCompletionTime;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalText;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;

/* loaded from: classes3.dex */
public abstract class DateTimesKt {
    public static final DateTimeFormatter expirationDateFormatter;
    public static final DateTimeFormatter expirationDateWithYearFormatter;
    public static final DateTimeFormatter hourDayPattern;
    public static final DateTimeFormatter hourOnlyPattern;
    public static final DateTimeFormatter hourOnlyPatternNoAmPm;
    public static final DateTimeFormatter monthDayTimePattern;
    public static final DateTimeFormatter shortMonthDayPattern;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.appendPattern("h:mm");
        hourOnlyPatternNoAmPm = dateTimeFormatterBuilder.toFormatter();
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder2.appendPattern("h:mm");
        ChronoField chronoField = ChronoField.AMPM_OF_DAY;
        dateTimeFormatterBuilder2.appendText(chronoField, MapsKt__MapsKt.mapOf(new Pair(0L, " AM"), new Pair(1L, " PM")));
        hourOnlyPattern = dateTimeFormatterBuilder2.toFormatter();
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.appendPattern("h:mm");
        dateTimeFormatterBuilder3.appendText(chronoField, MapsKt__MapsKt.mapOf(new Pair(0L, " AM"), new Pair(1L, " PM")));
        dateTimeFormatterBuilder3.appendLiteral((char) 160);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        TextStyle textStyle = TextStyle.SHORT;
        dateTimeFormatterBuilder3.appendText(chronoField2, textStyle);
        hourDayPattern = dateTimeFormatterBuilder3.toFormatter();
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
        DateTimeFormatterBuilder appendLiteral = dateTimeFormatterBuilder4.appendValue(chronoField3).appendLiteral('/');
        ChronoField chronoField4 = ChronoField.DAY_OF_MONTH;
        shortMonthDayPattern = appendLiteral.appendValue(chronoField4).toFormatter();
        expirationDateFormatter = new DateTimeFormatterBuilder().appendText(chronoField3, textStyle).appendLiteral(' ').appendValue(chronoField4).toFormatter();
        expirationDateWithYearFormatter = new DateTimeFormatterBuilder().appendText(chronoField3, textStyle).appendLiteral(' ').appendValue(chronoField4).appendLiteral(", ").appendValue(ChronoField.YEAR).toFormatter();
        monthDayTimePattern = new DateTimeFormatterBuilder().appendText(chronoField3, TextStyle.FULL).appendLiteral((char) 160).appendValue(chronoField4).appendLiteral(" at ").appendPattern("h:mm").appendText(chronoField, MapsKt__MapsKt.mapOf(new Pair(0L, " AM"), new Pair(1L, " PM"))).toFormatter();
    }

    /* renamed from: estimatedAsString-PNRv63U, reason: not valid java name */
    public static final String m1220estimatedAsStringPNRv63U(long j, Duration duration, AndroidStringManager androidStringManager, boolean z) {
        androidStringManager.getClass();
        Resources resources = androidStringManager.resources;
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.MINUTES;
        long m4176toLongimpl = Duration.m4176toLongimpl(j, durationUnit);
        long m4176toLongimpl2 = duration != null ? Duration.m4176toLongimpl(duration.rawValue, durationUnit) : m4176toLongimpl;
        if (m4176toLongimpl2 <= 1) {
            return androidStringManager.get(R.string.local_presenters_estimated_wait_time_now);
        }
        if (m4176toLongimpl >= 120) {
            long m4176toLongimpl3 = Duration.m4176toLongimpl(j, DurationUnit.HOURS);
            if (z) {
                Object[] objArr = {Long.valueOf(m4176toLongimpl3), Long.valueOf(m4176toLongimpl - (m4176toLongimpl3 * 60))};
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.local_presenters_estimated_wait_time_hmin)).format(objArr);
                format2.getClass();
                return format2;
            }
            Object[] objArr2 = {Long.valueOf(m4176toLongimpl3), Long.valueOf(m4176toLongimpl - (m4176toLongimpl3 * 60))};
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.local_presenters_estimated_wait_time_hmin_no_prefix)).format(objArr2);
            format3.getClass();
            return format3;
        }
        if (z) {
            if (m4176toLongimpl2 == m4176toLongimpl) {
                Object[] objArr3 = {Long.valueOf(m4176toLongimpl)};
                resources.getClass();
                String format4 = new MessageFormat(resources.getString(R.string.local_presenters_estimated_wait_time)).format(objArr3);
                format4.getClass();
                return format4;
            }
            Object[] objArr4 = {Long.valueOf(m4176toLongimpl), Long.valueOf(m4176toLongimpl2)};
            resources.getClass();
            String format5 = new MessageFormat(resources.getString(R.string.local_presenters_estimated_wait_time_range)).format(objArr4);
            format5.getClass();
            return format5;
        }
        if (m4176toLongimpl2 == m4176toLongimpl) {
            Object[] objArr5 = {Long.valueOf(m4176toLongimpl)};
            resources.getClass();
            String format6 = new MessageFormat(resources.getString(R.string.local_presenters_estimated_wait_time_no_prefix)).format(objArr5);
            format6.getClass();
            return format6;
        }
        Object[] objArr6 = {Long.valueOf(m4176toLongimpl), Long.valueOf(m4176toLongimpl2)};
        resources.getClass();
        String format7 = new MessageFormat(resources.getString(R.string.local_presenters_estimated_wait_time_range_no_prefix)).format(objArr6);
        format7.getClass();
        return format7;
    }

    public static final LocalText estimatedTime(Fulfillment fulfillment, AndroidStringManager androidStringManager, ZoneId zoneId) {
        LocalText localText;
        fulfillment.getClass();
        androidStringManager.getClass();
        LocalFulfillment.SchedulingDetails schedulingDetails = fulfillment.schedulingDetails;
        EstimatedCompletionDuration estimatedCompletionDuration = fulfillment.estimatedCompletionDuration;
        EstimatedCompletionTime estimatedCompletionTime = fulfillment.estimatedCompletionTime;
        LocalText friendlyFulfillmentTimeText = friendlyFulfillmentTimeText(schedulingDetails);
        if (friendlyFulfillmentTimeText != null) {
            return friendlyFulfillmentTimeText;
        }
        String str = null;
        if (estimatedCompletionDuration != null) {
            String m1220estimatedAsStringPNRv63U = m1220estimatedAsStringPNRv63U(estimatedCompletionDuration.earliest, estimatedCompletionDuration.latest, androidStringManager, false);
            localText = estimatedCompletionDuration.friendlyFulfillmentTime;
            String str2 = localText != null ? localText.text : null;
            if (str2 == null || StringsKt.isBlank(str2)) {
                localText = null;
            }
            if (localText == null) {
                localText = new LocalText(m1220estimatedAsStringPNRv63U);
            }
        } else {
            localText = null;
        }
        if (localText != null) {
            return localText;
        }
        if (estimatedCompletionTime != null) {
            zoneId.getClass();
            LocalDateTime instantToLocalDateTime = instantToLocalDateTime(estimatedCompletionTime.earliest, zoneId);
            LocalDateTime instantToLocalDateTime2 = instantToLocalDateTime(estimatedCompletionTime.latest, zoneId);
            String format2 = instantToLocalDateTime.format(hourOnlyPatternNoAmPm);
            String format3 = instantToLocalDateTime2.format(hourOnlyPattern);
            format3.getClass();
            format2.getClass();
            if (!StringsKt__StringsJVMKt.startsWith(format3, format2, false)) {
                Resources resources = androidStringManager.resources;
                resources.getClass();
                format3 = new MessageFormat(resources.getString(R.string.local_presenters_estimated_time_range)).format(new Object[]{format2, format3});
                format3.getClass();
            }
            str = format3;
        }
        return LocalTextsKt.toLocalText(str);
    }

    public static String formatDaysOrDate$default(Instant instant, AndroidStringManager androidStringManager, ZoneId zoneId) {
        instant.getClass();
        zoneId.getClass();
        ZonedDateTime now = ZonedDateTime.now(zoneId);
        now.getClass();
        ZonedDateTime atZone = instant.atZone(zoneId);
        long between = ChronoUnit.DAYS.between(atZone.toLocalDate(), now.toLocalDate());
        if (between < 1) {
            return null;
        }
        if (between > 13) {
            return atZone.format(shortMonthDayPattern);
        }
        Object[] objArr = {Long.valueOf(between)};
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.local_presenters_days_ago_short)).format(objArr);
        format2.getClass();
        return format2;
    }

    public static final String formatExpirationDate(Instant instant, AndroidStringManager androidStringManager, AssetPublicSuffixList assetPublicSuffixList, ZoneId zoneId, ZonedDateTime zonedDateTime) {
        Resources resources = androidStringManager.resources;
        assetPublicSuffixList.getClass();
        zoneId.getClass();
        zonedDateTime.getClass();
        ZonedDateTime atZone = instant.atZone(zoneId);
        if (atZone.isBefore(zonedDateTime)) {
            String formatDate$default = AssetPublicSuffixList.formatDate$default(assetPublicSuffixList, instant, 10);
            formatDate$default.getClass();
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.local_presenters_expired_date)).format(new Object[]{formatDate$default});
            format2.getClass();
            return format2;
        }
        String format3 = atZone.format(atZone.getYear() == zonedDateTime.getYear() ? expirationDateFormatter : expirationDateWithYearFormatter);
        format3.getClass();
        resources.getClass();
        String format4 = new MessageFormat(resources.getString(R.string.local_presenters_expires_date)).format(new Object[]{format3});
        format4.getClass();
        return format4;
    }

    public static final LocalText friendlyFulfillmentTimeText(LocalFulfillment.SchedulingDetails schedulingDetails) {
        LocalText localText;
        if ((schedulingDetails != null ? schedulingDetails.scheduling_mode : null) != LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED) {
            schedulingDetails = null;
        }
        if (schedulingDetails != null && (localText = schedulingDetails.friendly_fulfillment_time) != null) {
            String str = localText.text;
            if (!(str == null || StringsKt.isBlank(str))) {
                return localText;
            }
        }
        return null;
    }

    public static final boolean hasFriendlyEstimatedTimeText(Fulfillment fulfillment) {
        LocalText localText;
        fulfillment.getClass();
        LocalFulfillment.SchedulingDetails schedulingDetails = fulfillment.schedulingDetails;
        EstimatedCompletionDuration estimatedCompletionDuration = fulfillment.estimatedCompletionDuration;
        if (friendlyFulfillmentTimeText(schedulingDetails) != null) {
            return true;
        }
        String str = (estimatedCompletionDuration == null || (localText = estimatedCompletionDuration.friendlyFulfillmentTime) == null) ? null : localText.text;
        return (str == null || StringsKt.isBlank(str)) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.time.LocalDateTime] */
    public static final LocalDateTime instantToLocalDateTime(Instant instant, ZoneId zoneId) {
        instant.getClass();
        zoneId.getClass();
        ?? localDateTime = ZonedDateTime.ofInstant(instant, zoneId).toLocalDateTime();
        localDateTime.getClass();
        return localDateTime;
    }
}
