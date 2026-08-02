package io.appmetrica.analytics.logger.appmetrica.internal;

import android.content.Context;
import defpackage.unr0;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lio/appmetrica/analytics/logger/appmetrica/internal/PublicLogger;", "Lio/appmetrica/analytics/logger/common/BaseReleaseLogger;", "", "partialApiKey", "<init>", "(Ljava/lang/String;)V", "Companion", "logger_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class PublicLogger extends BaseReleaseLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final PublicLogger a = new PublicLogger("");

    public PublicLogger(String str) {
        super("AppMetrica", unr0.l(']', "[", str));
    }

    public static final PublicLogger getAnonymousInstance() {
        return INSTANCE.getAnonymousInstance();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/appmetrica/analytics/logger/appmetrica/internal/PublicLogger$Companion;", "", "Lio/appmetrica/analytics/logger/appmetrica/internal/PublicLogger;", "getAnonymousInstance", "()Lio/appmetrica/analytics/logger/appmetrica/internal/PublicLogger;", "Landroid/content/Context;", "context", "Lzy11;", "init", "(Landroid/content/Context;)V", "ANONYMOUS_INSTANCE", "Lio/appmetrica/analytics/logger/appmetrica/internal/PublicLogger;", "logger_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PublicLogger getAnonymousInstance() {
            return PublicLogger.a;
        }

        public final void init(Context context) {
            BaseReleaseLogger.init(context);
        }

        private Companion() {
        }
    }
}
