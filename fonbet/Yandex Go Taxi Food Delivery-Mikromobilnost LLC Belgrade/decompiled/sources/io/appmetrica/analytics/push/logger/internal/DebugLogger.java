package io.appmetrica.analytics.push.logger.internal;

import io.appmetrica.analytics.logger.common.BaseDebugLogger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/appmetrica/analytics/push/logger/internal/DebugLogger;", "Lio/appmetrica/analytics/logger/common/BaseDebugLogger;", "logger_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class DebugLogger extends BaseDebugLogger {
    public static final DebugLogger INSTANCE = new DebugLogger();

    private DebugLogger() {
        super("AppMetricaPushDebug");
    }
}
