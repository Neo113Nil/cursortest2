package io.appmetrica.analytics;

import android.os.SystemClock;
import defpackage.b64;
import java.util.Objects;

/* loaded from: classes9.dex */
public class MviTimestamp {
    private final long a;

    public MviTimestamp(long j) {
        this.a = j;
    }

    public static MviTimestamp fromUptimeMillis(long j) {
        return new MviTimestamp(j);
    }

    public static MviTimestamp now() {
        return fromUptimeMillis(SystemClock.uptimeMillis());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((MviTimestamp) obj).a;
    }

    public long getUptimeMillis() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.a));
    }

    public final long millisSince(MviTimestamp mviTimestamp) {
        return this.a - mviTimestamp.a;
    }

    public final MviTimestamp timestampAfter(long j) {
        return new MviTimestamp(this.a + j);
    }

    public String toString() {
        return b64.o(new StringBuilder("MviTimestamp{uptimeMillis="), this.a, '}');
    }
}
