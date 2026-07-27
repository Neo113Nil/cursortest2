package kotlin.text;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class CatchingFishDaggerHiltMVP {
    public static final AtomicReference CatchingFishParcelableFAB = new AtomicReference();

    public static Calendar CatchingFishCoroutine(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    public static Calendar CatchingFishParcelableFAB(Calendar calendar) {
        Calendar CatchingFishCoroutine = CatchingFishCoroutine(calendar);
        Calendar CatchingFishCoroutine2 = CatchingFishCoroutine(null);
        CatchingFishCoroutine2.set(CatchingFishCoroutine.get(1), CatchingFishCoroutine.get(2), CatchingFishCoroutine.get(5));
        return CatchingFishCoroutine2;
    }

    public static Calendar CatchingFishSnackbar() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }
}
