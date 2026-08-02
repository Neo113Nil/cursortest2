package app.cash.badging.backend;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes3.dex */
public abstract class RealBadger2Kt {
    public static final Duration[] retryDelaysByFailureCount;

    static {
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.MINUTES;
        retryDelaysByFailureCount = new Duration[]{new Duration(DurationKt.toDuration(5, durationUnit)), new Duration(DurationKt.toDuration(30, DurationUnit.SECONDS)), new Duration(DurationKt.toDuration(1, durationUnit)), new Duration(DurationKt.toDuration(2, durationUnit)), new Duration(DurationKt.toDuration(5, durationUnit))};
    }
}
