package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.api.context.TimeInfo;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.util.Strings;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class zzhm {
    public static final TimeInfo composeTimeInfo(Strings strings) {
        strings.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long serverTimestampMillis = strings.getServerTimestampMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = serverTimestampMillis - currentTimeMillis;
        return new TimeInfo(timeUnit.toNanos(currentTimeMillis), timeUnit.toNanos(serverTimestampMillis), timeUnit.toNanos(j), j);
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLocalBrandProfileWithCashtagAndLocationSlug.deepLinkSpecs;
    }
}
