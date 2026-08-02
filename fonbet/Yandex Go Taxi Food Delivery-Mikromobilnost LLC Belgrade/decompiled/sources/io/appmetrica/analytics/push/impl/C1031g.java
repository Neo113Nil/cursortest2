package io.appmetrica.analytics.push.impl;

import android.os.Build;
import io.appmetrica.analytics.push.model.Filters;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PushFilter;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.push.impl.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1031g implements PushFilter {
    @Override // io.appmetrica.analytics.push.settings.PushFilter
    public final PushFilter.FilterResult filter(PushMessage pushMessage) {
        Filters filters = pushMessage.getFilters();
        if (filters == null) {
            return PushFilter.FilterResult.show();
        }
        int i = Build.VERSION.SDK_INT;
        Integer minAndroidApiLevel = filters.getMinAndroidApiLevel();
        Integer maxAndroidApiLevel = filters.getMaxAndroidApiLevel();
        if ((minAndroidApiLevel == null || i >= minAndroidApiLevel.intValue()) && (maxAndroidApiLevel == null || i <= maxAndroidApiLevel.intValue())) {
            return PushFilter.FilterResult.show();
        }
        Locale locale = Locale.US;
        return PushFilter.FilterResult.silence("Wrong android os version", "Got android os level [" + i + "], allowed min [" + minAndroidApiLevel + "], allowed max [" + maxAndroidApiLevel + "]");
    }
}
