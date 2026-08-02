package androidx.compose.ui.text.style;

import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class BaselineShiftKt {
    public static final String formattedTime(HistoricalRange historicalRange, long j, TimeUnit timeUnit, AndroidClock androidClock, AndroidDateFormatManager androidDateFormatManager) {
        String str;
        historicalRange.getClass();
        timeUnit.getClass();
        if (historicalRange == HistoricalRange.DAY) {
            Calendar calendar = Calendar.getInstance(androidClock.timeZone());
            calendar.setTimeInMillis(androidClock.millis());
            int i = calendar.get(6);
            Calendar calendar2 = Calendar.getInstance(androidClock.timeZone());
            calendar2.setTimeInMillis(timeUnit.toMillis(j));
            if (i != calendar2.get(6)) {
                historicalRange = HistoricalRange.WEEK;
            }
        }
        int ordinal = historicalRange.ordinal();
        if (ordinal == 0) {
            str = "hh:mm a";
        } else if (ordinal == 1) {
            str = "EEE hh:mm a";
        } else if (ordinal == 2) {
            str = "MMM dd hh a";
        } else if (ordinal == 3) {
            str = "MMM dd";
        } else {
            if (ordinal != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = "MMM dd yyyy";
        }
        String format2 = androidDateFormatManager.getDateFormat(str, androidDateFormatManager.clock.timeZone()).formatter.format(Instant.ofEpochMilli(timeUnit.toMillis(j)));
        format2.getClass();
        return format2;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.DeprecatedCashAppPaySandbox.deepLinkSpecs;
    }

    /* renamed from: lerp-jWV1Mfo, reason: not valid java name */
    public static final float m1006lerpjWV1Mfo(float f, float f2, float f3) {
        return TransactorKt.lerp(f, f2, f3);
    }
}
