package com.braze.support;

import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okio.Path$$ExternalSyntheticBUOutline0;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0002\u001a\r\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u0019\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a?\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010 \u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010!\u001a\u0011\u0010\u001b\u001a\u00020\u000b*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\"\u001a\u0011\u0010#\u001a\u00020\u0000*\u00020\u000b¢\u0006\u0004\b#\u0010$\"\u001c\u0010&\u001a\n %*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010(\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\"\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,\"!\u00104\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"", "nowInSeconds", "()J", "", "nowInSecondsPrecise", "()D", "nowInMilliseconds", "nowInMillisecondsSystemClock", "", "Lcom/braze/enums/BrazeDateFormat;", "dateFormat", "Ljava/util/Date;", "parseDate", "(Ljava/lang/String;Lcom/braze/enums/BrazeDateFormat;)Ljava/util/Date;", "Ljava/util/TimeZone;", "timeZone", "formatDate", "(Ljava/util/Date;Lcom/braze/enums/BrazeDateFormat;Ljava/util/TimeZone;)Ljava/lang/String;", "formatDateNow", "(Lcom/braze/enums/BrazeDateFormat;)Ljava/lang/String;", "", "year", "month", "day", "hours", "minutes", "seconds", "createDate", "(IIIIII)Ljava/util/Date;", "", "validateDateComponents", "(IIIIII)V", "formatDateFromMillis", "(JLcom/braze/enums/BrazeDateFormat;Ljava/util/TimeZone;)Ljava/lang/String;", "(J)Ljava/util/Date;", "getTimeFromEpochInSeconds", "(Ljava/util/Date;)J", "kotlin.jvm.PlatformType", "UTC_TIME_ZONE", "Ljava/util/TimeZone;", "TAG", "Ljava/lang/String;", "", "shouldUseNetworkTimeClock", "Z", "Ljava/time/Clock;", "networkTimeClock$delegate", "Lkotlin/Lazy;", "getNetworkTimeClock", "()Ljava/time/Clock;", "getNetworkTimeClock$annotations", "()V", "networkTimeClock", "android-sdk-base_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DateTimeUtils {
    private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("UTC");
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("DateTimeUtils");
    private static boolean shouldUseNetworkTimeClock = true;
    private static final Lazy networkTimeClock$delegate = LazyKt.lazy(new BrazeLogger$$ExternalSyntheticLambda3(29));

    public static final Date createDate(int i, int i2, int i3, int i4, int i5, int i6) {
        validateDateComponents(i, i2, i3, i4, i5, i6);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
        gregorianCalendar.setTimeZone(UTC_TIME_ZONE);
        Date time = gregorianCalendar.getTime();
        time.getClass();
        return time;
    }

    public static /* synthetic */ Date createDate$default(int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            i4 = 0;
        }
        if ((i7 & 16) != 0) {
            i5 = 0;
        }
        if ((i7 & 32) != 0) {
            i6 = 0;
        }
        return createDate(i, i2, i3, i4, i5, i6);
    }

    public static final String formatDate(Date date, BrazeDateFormat brazeDateFormat, TimeZone timeZone) {
        date.getClass();
        brazeDateFormat.getClass();
        timeZone.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(brazeDateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        String format2 = simpleDateFormat.format(date);
        format2.getClass();
        return format2;
    }

    public static /* synthetic */ String formatDate$default(Date date, BrazeDateFormat brazeDateFormat, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = UTC_TIME_ZONE;
            timeZone.getClass();
        }
        return formatDate(date, brazeDateFormat, timeZone);
    }

    public static final String formatDateFromMillis(long j, BrazeDateFormat brazeDateFormat, TimeZone timeZone) {
        brazeDateFormat.getClass();
        timeZone.getClass();
        return formatDate(new Date(j), brazeDateFormat, timeZone);
    }

    public static /* synthetic */ String formatDateFromMillis$default(long j, BrazeDateFormat brazeDateFormat, TimeZone timeZone, int i, Object obj) {
        if ((i & 1) != 0) {
            brazeDateFormat = BrazeDateFormat.ANDROID_LOGCAT;
        }
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
            timeZone.getClass();
        }
        return formatDateFromMillis(j, brazeDateFormat, timeZone);
    }

    public static final String formatDateNow(BrazeDateFormat brazeDateFormat) {
        brazeDateFormat.getClass();
        Date createDate = createDate(nowInSeconds());
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        return formatDate(createDate, brazeDateFormat, timeZone);
    }

    private static final Clock getNetworkTimeClock() {
        return (Clock) networkTimeClock$delegate.getValue();
    }

    public static final long getTimeFromEpochInSeconds(Date date) {
        date.getClass();
        return date.getTime() / 1000;
    }

    public static final long nowInMilliseconds() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (Build.VERSION.SDK_INT >= 33 && shouldUseNetworkTimeClock) {
                long millis = getNetworkTimeClock().millis();
                if (millis >= 1691768838316L) {
                    return millis;
                }
            }
            return currentTimeMillis;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) e, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(28), 8, (Object) null);
            shouldUseNetworkTimeClock = false;
            return currentTimeMillis;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String nowInMilliseconds$lambda$0() {
        return "Error reading date and time from network. Using system time instead.";
    }

    public static final long nowInMillisecondsSystemClock() {
        return System.currentTimeMillis();
    }

    public static final long nowInSeconds() {
        return nowInMilliseconds() / 1000;
    }

    public static final double nowInSecondsPrecise() {
        return nowInMilliseconds() / 1000.0d;
    }

    public static final Date parseDate(String str, BrazeDateFormat brazeDateFormat) {
        str.getClass();
        brazeDateFormat.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(brazeDateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(UTC_TIME_ZONE);
        try {
            Date parse = simpleDateFormat.parse(str);
            parse.getClass();
            return parse;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new b$$ExternalSyntheticLambda1(str, 12), 8, (Object) null);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseDate$lambda$0(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Exception parsing date ", str, ". Returning null");
    }

    private static final void validateDateComponents(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i <= 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Year must be positive, was "));
            return;
        }
        if (i2 < 0 || i2 >= 12) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Month must be between 0 and 11, was "));
            return;
        }
        if (i4 < 0 || i4 >= 24) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i4, "Hours must be between 0 and 23, was "));
            return;
        }
        if (i5 < 0 || i5 >= 60) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "Minutes must be between 0 and 59, was "));
            return;
        }
        if (i6 < 0 || i6 >= 60) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i6, "Seconds must be between 0 and 59, was "));
            return;
        }
        if (i3 < 1) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "Day must be at least 1, was "));
            return;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, 1);
        gregorianCalendar.setTimeZone(UTC_TIME_ZONE);
        int actualMaximum = gregorianCalendar.getActualMaximum(5);
        if (i3 <= actualMaximum) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(i, i3, ", was ", Recorder$$ExternalSyntheticOutline2.m107m(actualMaximum, i2, "Day must not exceed ", " for month ", " of year ")));
    }

    public static final Date createDate(long j) {
        return new Date(j * 1000);
    }
}
