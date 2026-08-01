package S3;

import android.app.NotificationChannel;
import java.time.Duration;
import java.time.Instant;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class i {
    public static /* bridge */ /* synthetic */ Class C() {
        return Duration.class;
    }

    public static /* synthetic */ NotificationChannel e(int i, String str, String str2) {
        return new NotificationChannel(str, str2, i);
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return Instant.class;
    }

    public static /* bridge */ /* synthetic */ Duration m(Object obj) {
        return (Duration) obj;
    }

    public static /* bridge */ /* synthetic */ Instant o(Object obj) {
        return (Instant) obj;
    }

    public static /* synthetic */ void u() {
    }
}
