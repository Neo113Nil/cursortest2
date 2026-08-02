package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.model.Filters;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.settings.PushFilter;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class I1 implements PushFilter {
    public final X1 a;

    public I1(X1 x1) {
        this.a = x1;
    }

    @Override // io.appmetrica.analytics.push.settings.PushFilter
    public final PushFilter.FilterResult filter(PushMessage pushMessage) {
        Filters filters = pushMessage.getFilters();
        Integer maxPushPerDay = filters == null ? null : filters.getMaxPushPerDay();
        if (maxPushPerDay == null) {
            return PushFilter.FilterResult.show();
        }
        PushNotification notification = pushMessage.getNotification();
        LinkedList a = this.a.a(notification != null ? notification.getChannelId() : null);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Iterator it = a.iterator();
        int i = 0;
        while (it.hasNext()) {
            calendar.setTimeInMillis(((Long) it.next()).longValue());
            if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6) && (i = i + 1) >= maxPushPerDay.intValue()) {
                Locale locale = Locale.US;
                return PushFilter.FilterResult.silence("Reached max per day pushes for current topic", "Was shown [" + i + "], max allowed [" + maxPushPerDay + "]");
            }
        }
        return PushFilter.FilterResult.show();
    }
}
