package io.appmetrica.analytics.screenshot.internal;

import io.appmetrica.analytics.screenshot.impl.P;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lio/appmetrica/analytics/screenshot/internal/ServiceSideScreenshotConfigWrapper;", "", "Lio/appmetrica/analytics/screenshot/impl/P;", "a", "Lio/appmetrica/analytics/screenshot/impl/P;", "getConfig$screenshot_release", "()Lio/appmetrica/analytics/screenshot/impl/P;", ConfigConstants.CONFIG, "<init>", "(Lio/appmetrica/analytics/screenshot/impl/P;)V", "Companion", "screenshot_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ServiceSideScreenshotConfigWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final P config;

    public ServiceSideScreenshotConfigWrapper(P p) {
        this.config = p;
    }

    /* renamed from: getConfig$screenshot_release, reason: from getter */
    public final P getConfig() {
        return this.config;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lio/appmetrica/analytics/screenshot/internal/ServiceSideScreenshotConfigWrapper$Companion;", "", "Lio/appmetrica/analytics/screenshot/impl/P;", "Lio/appmetrica/analytics/screenshot/internal/ServiceSideScreenshotConfigWrapper;", "toWrapper$screenshot_release", "(Lio/appmetrica/analytics/screenshot/impl/P;)Lio/appmetrica/analytics/screenshot/internal/ServiceSideScreenshotConfigWrapper;", "toWrapper", "screenshot_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ServiceSideScreenshotConfigWrapper toWrapper$screenshot_release(P p) {
            return new ServiceSideScreenshotConfigWrapper(p);
        }

        private Companion() {
        }
    }
}
