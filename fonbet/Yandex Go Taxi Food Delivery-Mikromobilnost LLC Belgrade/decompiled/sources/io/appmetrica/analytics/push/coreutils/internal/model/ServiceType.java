package io.appmetrica.analytics.push.coreutils.internal.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/model/ServiceType;", "", "", "a", CA20Status.STATUS_USER_I, "getValue", "()I", "value", "Companion", "PROVIDER_SERVICE", "APPMETRICA_PUSH_SERVICE", "UNKNOWN", "core-utils_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public enum ServiceType {
    PROVIDER_SERVICE(0),
    APPMETRICA_PUSH_SERVICE(1),
    UNKNOWN(-1);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final int value;

    ServiceType(int i) {
        this.value = i;
    }

    public static final ServiceType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public final int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/model/ServiceType$Companion;", "", "", "value", "Lio/appmetrica/analytics/push/coreutils/internal/model/ServiceType;", "fromValue", "core-utils_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ServiceType fromValue(int value) {
            for (ServiceType serviceType : ServiceType.values()) {
                if (serviceType.getValue() == value) {
                    return serviceType;
                }
            }
            return ServiceType.UNKNOWN;
        }

        private Companion() {
        }
    }
}
