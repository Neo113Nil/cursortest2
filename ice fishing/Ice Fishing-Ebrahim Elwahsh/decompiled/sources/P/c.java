package P;

import android.app.NotificationChannel;
import java.time.Duration;
import java.time.Instant;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ Class D() {
        return Duration.class;
    }

    public static /* synthetic */ NotificationChannel e(int i, String str, String str2) {
        return new NotificationChannel(str, str2, i);
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return Instant.class;
    }

    public static /* bridge */ /* synthetic */ Duration n(Object obj) {
        return (Duration) obj;
    }

    public static /* bridge */ /* synthetic */ Instant p(Object obj) {
        return (Instant) obj;
    }
}
