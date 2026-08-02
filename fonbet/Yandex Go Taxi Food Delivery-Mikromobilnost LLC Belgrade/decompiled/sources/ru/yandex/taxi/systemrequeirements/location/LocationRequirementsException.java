package ru.yandex.taxi.systemrequeirements.location;

import defpackage.k4o;
import defpackage.mo21;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0002\u0012\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/systemrequeirements/location/LocationRequirementsException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lru/yandex/taxi/systemrequeirements/location/LocationRequirementsException$FailureReason;", "failureReason", "<init>", "(Lru/yandex/taxi/systemrequeirements/location/LocationRequirementsException$FailureReason;)V", "Lru/yandex/taxi/systemrequeirements/location/LocationRequirementsException$FailureReason;", "getFailureReason", "()Lru/yandex/taxi/systemrequeirements/location/LocationRequirementsException$FailureReason;", "Lmo21;", "fallbackUserLocation", "Lmo21;", "getFallbackUserLocation", "()Lmo21;", "setFallbackUserLocation", "(Lmo21;)V", "Companion", "FailureReason", "ru/yandex/taxi/systemrequeirements/location/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocationRequirementsException extends RuntimeException {
    public static final e Companion = new e();
    private final FailureReason failureReason;
    private mo21 fallbackUserLocation;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/systemrequeirements/location/LocationRequirementsException$FailureReason;", "", "PERMISSION_NOT_GRANTED", "LOCATION_SERVICE_NOT_AVAILABLE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class FailureReason {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FailureReason[] $VALUES;
        public static final FailureReason LOCATION_SERVICE_NOT_AVAILABLE;
        public static final FailureReason PERMISSION_NOT_GRANTED;

        static {
            FailureReason failureReason = new FailureReason("PERMISSION_NOT_GRANTED", 0);
            PERMISSION_NOT_GRANTED = failureReason;
            FailureReason failureReason2 = new FailureReason("LOCATION_SERVICE_NOT_AVAILABLE", 1);
            LOCATION_SERVICE_NOT_AVAILABLE = failureReason2;
            FailureReason[] failureReasonArr = {failureReason, failureReason2};
            $VALUES = failureReasonArr;
            $ENTRIES = kotlin.enums.a.a(failureReasonArr);
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
        }
    }

    private LocationRequirementsException(FailureReason failureReason) {
        this.failureReason = failureReason;
    }

    public static final boolean isLocationServiceNotAvailableError(Throwable th) {
        Companion.getClass();
        return e.a(th);
    }

    public static final boolean isPermissionNotGrantedError(Throwable th) {
        Companion.getClass();
        return e.b(th);
    }

    public static final LocationRequirementsException locationServiceNotAvailable() {
        Companion.getClass();
        return e.c();
    }

    public static final LocationRequirementsException permissionNotGranted() {
        Companion.getClass();
        return e.d();
    }

    public final FailureReason getFailureReason() {
        return this.failureReason;
    }

    public final mo21 getFallbackUserLocation() {
        return this.fallbackUserLocation;
    }

    public final void setFallbackUserLocation(mo21 mo21Var) {
        this.fallbackUserLocation = mo21Var;
    }

    public /* synthetic */ LocationRequirementsException(FailureReason failureReason, DefaultConstructorMarker defaultConstructorMarker) {
        this(failureReason);
    }
}
