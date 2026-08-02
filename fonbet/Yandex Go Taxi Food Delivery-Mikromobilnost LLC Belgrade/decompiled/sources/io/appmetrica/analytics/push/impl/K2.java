package io.appmetrica.analytics.push.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import io.appmetrica.analytics.push.model.Filters;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PushFilter;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class K2 implements PushFilter {
    public final Context a;

    public K2(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.push.settings.PushFilter
    public final PushFilter.FilterResult filter(PushMessage pushMessage) {
        PackageInfo packageInfo;
        Filters filters = pushMessage.getFilters();
        if (filters == null) {
            return PushFilter.FilterResult.show();
        }
        Context context = this.a;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th) {
            PublicLogger.INSTANCE.error(th, th.getMessage(), new Object[0]);
            packageInfo = null;
        }
        int i = packageInfo == null ? -1 : packageInfo.versionCode;
        Integer minVersionCode = filters.getMinVersionCode();
        Integer maxVersionCode = filters.getMaxVersionCode();
        if ((minVersionCode == null || i >= minVersionCode.intValue()) && (maxVersionCode == null || i <= maxVersionCode.intValue())) {
            return PushFilter.FilterResult.show();
        }
        Locale locale = Locale.US;
        return PushFilter.FilterResult.silence("Wrong app version code", "Got app version code [" + i + "], allowed min [" + minVersionCode + "], allowed max [" + maxVersionCode + "]");
    }
}
