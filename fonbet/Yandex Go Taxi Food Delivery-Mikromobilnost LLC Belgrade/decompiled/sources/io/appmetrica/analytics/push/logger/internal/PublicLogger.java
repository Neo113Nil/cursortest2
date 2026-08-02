package io.appmetrica.analytics.push.logger.internal;

import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/appmetrica/analytics/push/logger/internal/PublicLogger;", "Lio/appmetrica/analytics/logger/common/BaseReleaseLogger;", "logger_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes9.dex */
public final class PublicLogger extends BaseReleaseLogger {
    public static final PublicLogger INSTANCE = new PublicLogger();

    private PublicLogger() {
        super("AppMetricaPush", "");
    }
}
