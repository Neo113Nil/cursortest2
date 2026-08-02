package ru.yandex.taxi.systemrequeirements.location;

import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;

/* loaded from: classes6.dex */
public final class e {
    public static boolean a(Throwable th) {
        return (th instanceof LocationRequirementsException) && ((LocationRequirementsException) th).getFailureReason() == LocationRequirementsException.FailureReason.LOCATION_SERVICE_NOT_AVAILABLE;
    }

    public static boolean b(Throwable th) {
        return (th instanceof LocationRequirementsException) && ((LocationRequirementsException) th).getFailureReason() == LocationRequirementsException.FailureReason.PERMISSION_NOT_GRANTED;
    }

    public static LocationRequirementsException c() {
        return new LocationRequirementsException(LocationRequirementsException.FailureReason.LOCATION_SERVICE_NOT_AVAILABLE, null);
    }

    public static LocationRequirementsException d() {
        return new LocationRequirementsException(LocationRequirementsException.FailureReason.PERMISSION_NOT_GRANTED, null);
    }
}
