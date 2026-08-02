package app.cash.local.presenters.internal;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import app.cash.local.primitives.EstimatedCompletionDuration;
import app.cash.local.primitives.EstimatedCompletionTime;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalText;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class FulfillmentTimeUtils {
    public final AndroidClock clock;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalFulfillmentType.values().length];
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DINE_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_SHIPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FulfillmentTimeUtils(AndroidStringManager androidStringManager, AndroidClock androidClock) {
        this.clock = androidClock;
        this.stringManager = androidStringManager;
    }

    /* renamed from: calculate-LTTRb74, reason: not valid java name */
    public final String m1221calculateLTTRb74(LocalDateTime localDateTime, LocalFulfillmentType localFulfillmentType, long j, Duration duration) {
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.MINUTES;
        long m4176toLongimpl = Duration.m4176toLongimpl(j, durationUnit);
        long m4176toLongimpl2 = Duration.m4176toLongimpl(j, DurationUnit.HOURS);
        Long valueOf = duration != null ? Long.valueOf(Duration.m4176toLongimpl(duration.rawValue, durationUnit)) : null;
        LocalDateTime plusDays = localDateTime.plusDays(1L);
        LocalDateTime plus = localDateTime.plus(Duration.m4167getInWholeMillisecondsimpl(j), (TemporalUnit) ChronoUnit.MILLIS);
        plus.getClass();
        boolean isEqual = plus.toLocalDate().isEqual(localDateTime.toLocalDate());
        boolean z = isEqual && (localFulfillmentType != LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY ? m4176toLongimpl2 > 1 : m4176toLongimpl2 > 3);
        plusDays.getClass();
        boolean isEqual2 = plus.toLocalDate().isEqual(plusDays.toLocalDate());
        boolean z2 = (isEqual || isEqual2) ? false : true;
        if (z) {
            String localizedName = getLocalizedName(localFulfillmentType);
            String format2 = plus.format(DateTimesKt.hourOnlyPattern);
            format2.getClass();
            localizedName.getClass();
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.local_presenters_fulfillment_time_today_later)).format(new Object[]{localizedName, format2});
            format3.getClass();
            return format3;
        }
        if (isEqual2) {
            String localizedName2 = getLocalizedName(localFulfillmentType);
            String format4 = plus.format(DateTimesKt.hourOnlyPattern);
            format4.getClass();
            localizedName2.getClass();
            resources.getClass();
            String format5 = new MessageFormat(resources.getString(R.string.local_presenters_fulfillment_time_tomorrow)).format(new Object[]{localizedName2, format4});
            format5.getClass();
            return format5;
        }
        if (z2) {
            String localizedName3 = getLocalizedName(localFulfillmentType);
            String format6 = plus.format(DateTimesKt.monthDayTimePattern);
            format6.getClass();
            localizedName3.getClass();
            resources.getClass();
            String format7 = new MessageFormat(resources.getString(R.string.local_presenters_fulfillment_time_another_day)).format(new Object[]{localizedName3, format6});
            format7.getClass();
            return format7;
        }
        if (valueOf != null && m4176toLongimpl != valueOf.longValue()) {
            String localizedName4 = getLocalizedName(localFulfillmentType);
            Long valueOf2 = Long.valueOf(m4176toLongimpl);
            localizedName4.getClass();
            resources.getClass();
            String format8 = new MessageFormat(resources.getString(R.string.local_presenters_fulfillment_time_today_in_minutes_range)).format(new Object[]{localizedName4, valueOf2, valueOf});
            format8.getClass();
            return format8;
        }
        if (m4176toLongimpl <= 1) {
            return androidStringManager.get(R.string.local_presenters_estimated_wait_time_now);
        }
        String localizedName5 = getLocalizedName(localFulfillmentType);
        Long valueOf3 = Long.valueOf(m4176toLongimpl);
        localizedName5.getClass();
        resources.getClass();
        String format9 = new MessageFormat(resources.getString(R.string.local_presenters_fulfillment_time_today_in_minutes)).format(new Object[]{localizedName5, valueOf3});
        format9.getClass();
        return format9;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LocalText getEstimatedCompletionTime(FulfillmentConfiguration fulfillmentConfiguration) {
        FulfillmentTimeUtils fulfillmentTimeUtils;
        LocalText localText;
        String str;
        LocalFulfillmentType type2 = FulfillmentConfigurationKt.getType(fulfillmentConfiguration);
        LocalText friendlyFulfillmentTimeText = DateTimesKt.friendlyFulfillmentTimeText(fulfillmentConfiguration.getSchedulingDetails());
        if (friendlyFulfillmentTimeText == null) {
            EstimatedCompletionDuration estimatedCompletionDuration = fulfillmentConfiguration.getEstimatedCompletionDuration();
            LocalText localText2 = null;
            if (estimatedCompletionDuration == null || (friendlyFulfillmentTimeText = estimatedCompletionDuration.friendlyFulfillmentTime) == null || (str = friendlyFulfillmentTimeText.text) == null || StringsKt.isBlank(str)) {
                friendlyFulfillmentTimeText = null;
            }
            if (friendlyFulfillmentTimeText == null) {
                EstimatedCompletionTime estimatedCompletionTime = fulfillmentConfiguration.getEstimatedCompletionTime();
                AndroidClock androidClock = this.clock;
                if (estimatedCompletionTime != null) {
                    Instant ofEpochMilli = Instant.ofEpochMilli(androidClock.millis());
                    ofEpochMilli.getClass();
                    LocalDateTime ofInstant = LocalDateTime.ofInstant(ofEpochMilli, androidClock.timeZone().toZoneId());
                    ofInstant.getClass();
                    java.time.Duration between = java.time.Duration.between(ofEpochMilli, estimatedCompletionTime.earliest);
                    between.getClass();
                    long seconds = between.getSeconds();
                    DurationUnit durationUnit = DurationUnit.SECONDS;
                    long duration = DurationKt.toDuration(seconds, durationUnit);
                    int nano = between.getNano();
                    DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
                    long m4173plusLRDsOJo = Duration.m4173plusLRDsOJo(duration, DurationKt.toDuration(nano, durationUnit2));
                    java.time.Duration between2 = java.time.Duration.between(ofEpochMilli, estimatedCompletionTime.latest);
                    between2.getClass();
                    Duration duration2 = new Duration(Duration.m4173plusLRDsOJo(DurationKt.toDuration(between2.getSeconds(), durationUnit), DurationKt.toDuration(between2.getNano(), durationUnit2)));
                    fulfillmentTimeUtils = this;
                    String m1221calculateLTTRb74 = fulfillmentTimeUtils.m1221calculateLTTRb74(ofInstant, type2, m4173plusLRDsOJo, duration2);
                    if (m1221calculateLTTRb74 != null) {
                        localText = new LocalText(m1221calculateLTTRb74);
                        if (localText == null) {
                            return localText;
                        }
                        EstimatedCompletionDuration estimatedCompletionDuration2 = fulfillmentConfiguration.getEstimatedCompletionDuration();
                        if (estimatedCompletionDuration2 != null) {
                            LocalText localText3 = estimatedCompletionDuration2.friendlyFulfillmentTime;
                            Instant ofEpochMilli2 = Instant.ofEpochMilli(androidClock.millis());
                            ofEpochMilli2.getClass();
                            LocalDateTime ofInstant2 = LocalDateTime.ofInstant(ofEpochMilli2, androidClock.timeZone().toZoneId());
                            ofInstant2.getClass();
                            String m1221calculateLTTRb742 = fulfillmentTimeUtils.m1221calculateLTTRb74(ofInstant2, type2, estimatedCompletionDuration2.earliest, estimatedCompletionDuration2.latest);
                            String str2 = localText3 != null ? localText3.text : null;
                            if (str2 != null && !StringsKt.isBlank(str2)) {
                                localText2 = localText3;
                            }
                            if (localText2 == null) {
                                return LocalTextsKt.toLocalText(m1221calculateLTTRb742);
                            }
                        }
                        return localText2;
                    }
                } else {
                    fulfillmentTimeUtils = this;
                }
                localText = null;
                if (localText == null) {
                }
            }
        }
        return friendlyFulfillmentTimeText;
    }

    public final String getLocalizedName(LocalFulfillmentType localFulfillmentType) {
        int i = WhenMappings.$EnumSwitchMapping$0[localFulfillmentType.ordinal()];
        AndroidStringManager androidStringManager = this.stringManager;
        switch (i) {
            case 1:
                break;
            case 2:
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                Path$$ExternalSyntheticBUOutline0.m$1(localFulfillmentType, "Unsupported fulfillment type: ");
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                break;
        }
        return null;
    }
}
