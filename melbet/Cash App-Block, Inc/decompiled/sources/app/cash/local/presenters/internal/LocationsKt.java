package app.cash.local.presenters.internal;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.OrderingMode;
import app.cash.local.viewmodels.LocalTextsKt;
import app.cash.local.viewmodels.LocationStatus;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalOpenHours;
import com.squareup.protos.cash.local.client.v1.LocalText;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes3.dex */
public abstract class LocationsKt {
    public static final boolean currentlyOpen(AndroidClock androidClock, Location.OpenState openState) {
        openState.getClass();
        if ((openState instanceof Location.OpenState.Unspecified) || (openState instanceof Location.OpenState.Closed)) {
            return false;
        }
        if (openState instanceof Location.OpenState.Open24Hours) {
            return true;
        }
        if (!(openState instanceof Location.OpenState.Hours)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return false;
        }
        Instant now = DimensionKt.now(androidClock);
        List<LocalOpenHours.HoursForDay> list = ((Location.OpenState.Hours) openState).openHours.hours_for_days;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((LocalOpenHours.HoursForDay) it.next()).ranges, arrayList);
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LocalOpenHours.HoursForDay.Range range = (LocalOpenHours.HoursForDay.Range) it2.next();
                Long l = range.opening_time;
                l.getClass();
                if (Instant.ofEpochMilli(l.longValue()).isBefore(now)) {
                    Long l2 = range.closing_time;
                    l2.getClass();
                    if (now.isBefore(Instant.ofEpochMilli(l2.longValue()))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final String nextLocalTime(LocalOpenHours localOpenHours, boolean z, AndroidClock androidClock, ZoneId zoneId) {
        Object obj;
        Instant ofEpochMilli;
        List<LocalOpenHours.HoursForDay> list = localOpenHours.hours_for_days;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((LocalOpenHours.HoursForDay) it.next()).ranges, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LocalOpenHours.HoursForDay.Range range = (LocalOpenHours.HoursForDay.Range) it2.next();
            if (z) {
                Long l = range.closing_time;
                l.getClass();
                ofEpochMilli = Instant.ofEpochMilli(l.longValue());
            } else {
                Long l2 = range.opening_time;
                l2.getClass();
                ofEpochMilli = Instant.ofEpochMilli(l2.longValue());
            }
            arrayList2.add(ofEpochMilli);
        }
        List sorted = CollectionsKt.sorted(arrayList2);
        Instant now = DimensionKt.now(androidClock);
        Iterator it3 = sorted.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (now.isBefore((Instant) obj)) {
                break;
            }
        }
        Instant instant = (Instant) obj;
        if (instant == null) {
            return null;
        }
        LocalDateTime instantToLocalDateTime = DateTimesKt.instantToLocalDateTime(instant, zoneId);
        String format2 = instantToLocalDateTime.getDayOfWeek() == now.atZone(ZoneId.systemDefault()).getDayOfWeek() ? instantToLocalDateTime.format(DateTimesKt.hourOnlyPattern) : instantToLocalDateTime.format(DateTimesKt.hourDayPattern);
        format2.getClass();
        return StringsKt__StringsJVMKt.replace$default(format2, ":00", "");
    }

    public static final String nextOpeningOrClosing(Location location, boolean z, AndroidClock androidClock, AndroidStringManager androidStringManager, LocalFulfillmentType localFulfillmentType) {
        String nextLocalTime;
        Location.OpenState openState = location.openState(localFulfillmentType);
        if (!(openState instanceof Location.OpenState.Hours)) {
            if (openState instanceof Location.OpenState.Unspecified) {
                return "";
            }
            if (openState instanceof Location.OpenState.Closed) {
                return androidStringManager.get(R.string.local_presenters_status_always_closed);
            }
            if (openState instanceof Location.OpenState.Open24Hours) {
                return androidStringManager.get(R.string.local_presenters_status_always_open);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        ZoneId zoneId = location.getZoneId();
        if (zoneId == null || (nextLocalTime = nextLocalTime(((Location.OpenState.Hours) openState).openHours, z, androidClock, zoneId)) == null) {
            return "";
        }
        Resources resources = androidStringManager.resources;
        if (z) {
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.local_presenters_status_next_closes)).format(new Object[]{nextLocalTime});
            format2.getClass();
            return format2;
        }
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.local_presenters_status_next_opens)).format(new Object[]{nextLocalTime});
        format3.getClass();
        return format3;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LocationStatus status(Location location, String str, String str2, LocalEstimatedCompletionDuration localEstimatedCompletionDuration, AndroidClock androidClock, AndroidStringManager androidStringManager, LocalFulfillmentType localFulfillmentType) {
        String str3;
        String str4;
        String str5;
        Duration duration;
        String nextLocalTime;
        localFulfillmentType.getClass();
        boolean currentlyOpen = currentlyOpen(androidClock, location.openState(localFulfillmentType));
        Location.OpenState openState = location.openState(localFulfillmentType);
        LocalText localText = null;
        if (openState instanceof Location.OpenState.Hours) {
            ZoneId zoneId = location.getZoneId();
            if (zoneId != null && (nextLocalTime = nextLocalTime(((Location.OpenState.Hours) openState).openHours, currentlyOpen, androidClock, zoneId)) != null) {
                Resources resources = androidStringManager.resources;
                if (currentlyOpen) {
                    resources.getClass();
                    str3 = new MessageFormat(resources.getString(R.string.local_presenters_status_open_until)).format(new Object[]{nextLocalTime});
                    str3.getClass();
                } else {
                    resources.getClass();
                    str3 = new MessageFormat(resources.getString(R.string.local_presenters_status_opens_at)).format(new Object[]{nextLocalTime});
                    str3.getClass();
                }
            }
            str3 = "";
        } else {
            if (!(openState instanceof Location.OpenState.Unspecified)) {
                if (openState instanceof Location.OpenState.Closed) {
                    str3 = androidStringManager.get(R.string.local_presenters_status_always_closed);
                } else {
                    if (!(openState instanceof Location.OpenState.Open24Hours)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str3 = androidStringManager.get(R.string.local_presenters_status_always_open);
                }
            }
            str3 = "";
        }
        if (str == null) {
            str = str2;
        }
        if (!currentlyOpen) {
            if (StringsKt.isBlank(str3)) {
                str3 = androidStringManager.get(R.string.local_presenters_status_closed);
            }
            return new LocationStatus.Closed(str3, str);
        }
        OrderingMode orderingMode = location.getOrderingMode();
        if (orderingMode instanceof OrderingMode.Unavailable) {
            OrderingMode.Unavailable unavailable = (OrderingMode.Unavailable) orderingMode;
            boolean z = unavailable.isPermanent;
            String str6 = unavailable.message;
            return z ? new LocationStatus.Closed(str6, null) : new LocationStatus.TemporarilyDisabled(str6);
        }
        LocalText localText2 = localEstimatedCompletionDuration != null ? localEstimatedCompletionDuration.earliest_within_hours_friendly_fulfillment_time : null;
        if (localEstimatedCompletionDuration != null) {
            Long l = localEstimatedCompletionDuration.earliest_within_hours;
            if (l == null) {
                l = localEstimatedCompletionDuration.earliest;
            }
            if (l != null) {
                Duration.Companion companion = Duration.Companion;
                duration = new Duration(DurationKt.toDuration(l.longValue(), DurationUnit.MILLISECONDS));
            } else {
                duration = null;
            }
            if (duration != null) {
                str4 = DateTimesKt.m1220estimatedAsStringPNRv63U(duration.rawValue, null, androidStringManager, true);
                str5 = localText2 == null ? localText2.text : null;
                if (str5 != null && !StringsKt.isBlank(str5)) {
                    localText = localText2;
                }
                if (localText == null) {
                    localText = LocalTextsKt.toLocalText(str4);
                }
                if (StringsKt.isBlank(str3)) {
                    str3 = androidStringManager.get(R.string.local_presenters_status_open);
                }
                return new LocationStatus.Open(localText, str3, str);
            }
        }
        str4 = null;
        if (localText2 == null) {
        }
        if (str5 != null) {
            localText = localText2;
        }
        if (localText == null) {
        }
        if (StringsKt.isBlank(str3)) {
        }
        return new LocationStatus.Open(localText, str3, str);
    }
}
