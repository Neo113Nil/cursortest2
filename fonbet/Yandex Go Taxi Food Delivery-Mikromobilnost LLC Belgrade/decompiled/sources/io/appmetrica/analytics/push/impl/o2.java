package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import io.appmetrica.analytics.push.model.Filters;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.settings.PushFilter;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class o2 implements PushFilter {
    public final X1 a;

    public o2(X1 x1) {
        this.a = x1;
    }

    @Override // io.appmetrica.analytics.push.settings.PushFilter
    public final PushFilter.FilterResult filter(PushMessage pushMessage) {
        Filters filters = pushMessage.getFilters();
        Integer onePushPerPeriodMinutes = filters == null ? null : filters.getOnePushPerPeriodMinutes();
        if (onePushPerPeriodMinutes == null) {
            return PushFilter.FilterResult.show();
        }
        PushNotification notification = pushMessage.getNotification();
        LinkedList a = this.a.a(notification != null ? notification.getChannelId() : null);
        long longValue = a.isEmpty() ? 0L : ((Long) a.get(a.size() - 1)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (longValue > currentTimeMillis) {
            PublicLogger.INSTANCE.warning("%s Last push was shown in future", "[SinglePushPerPeriodFilter]");
            return PushFilter.FilterResult.show();
        }
        long j = currentTimeMillis - longValue;
        if (j >= TimeUnit.MINUTES.toMillis(onePushPerPeriodMinutes.intValue())) {
            return PushFilter.FilterResult.show();
        }
        Locale locale = Locale.US;
        return PushFilter.FilterResult.silence("Already have shown push in this period", "Previous push was shown [" + (j / 60000) + "] minutes ago, min period is [" + onePushPerPeriodMinutes + "]");
    }
}
