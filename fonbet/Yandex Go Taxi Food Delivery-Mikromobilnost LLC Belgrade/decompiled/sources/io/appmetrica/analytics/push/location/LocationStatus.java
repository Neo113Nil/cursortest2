package io.appmetrica.analytics.push.location;

import android.location.Location;
import defpackage.g8e;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class LocationStatus {
    private final String a;
    private final String b;

    public static class CustomLocationProviderIsNull extends LocationStatus {
        public CustomLocationProviderIsNull() {
            super("Custom location provider is null", "");
        }
    }

    public static class ExpiredByTimeout extends LocationStatus {
        public ExpiredByTimeout() {
            super("Request for location expired by timeout", "");
        }
    }

    public static class LocationIsNotAccurate extends LocationStatus {
        public LocationIsNotAccurate(float f, long j) {
            super("Location is not accurate", String.format(Locale.ENGLISH, "Got accuracy [%f], maximum allowed [%d]", Float.valueOf(f), Long.valueOf(j)));
        }
    }

    public static class LocationIsNotNearPoints extends LocationStatus {
        public LocationIsNotNearPoints(List<Location> list, float f) {
            super("Location is not near points", String.format(Locale.ENGLISH, "Location is not near points [%s] with radius [%f]", list, Float.valueOf(f)));
        }
    }

    public static class LocationIsNotRecent extends LocationStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocationIsNotRecent(long j, long j2) {
            super("Location is not recent", oyr.n(j2, "]", unr0.w(j, "Got recency [", "], minimum allowed [")));
            Locale locale = Locale.ENGLISH;
        }
    }

    public static class LocationManagerIsNull extends LocationStatus {
        public LocationManagerIsNull() {
            super("Location manager is null", "");
        }
    }

    public static class LocationProviderReturnedNull extends LocationStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocationProviderReturnedNull(String str) {
            super("Location provider returned null", oyr.p("Location provider \"", str, "\" returned null"));
            Locale locale = Locale.ENGLISH;
        }
    }

    public static class PermissionIsNotGranted extends LocationStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PermissionIsNotGranted(String str) {
            super("Location permissions is not granted", g8e.o("Location permissions is not granted for ", str));
            Locale locale = Locale.ENGLISH;
        }
    }

    public static class Success extends LocationStatus {
        public Success() {
            super("Success", "");
        }

        @Override // io.appmetrica.analytics.push.location.LocationStatus
        public boolean isSuccess() {
            return true;
        }
    }

    public LocationStatus(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String getCategory() {
        return this.a;
    }

    public String getDetails() {
        return this.b;
    }

    public boolean isSuccess() {
        return false;
    }
}
