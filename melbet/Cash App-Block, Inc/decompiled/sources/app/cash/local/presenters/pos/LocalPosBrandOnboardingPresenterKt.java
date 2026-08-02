package app.cash.local.presenters.pos;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes3.dex */
public abstract class LocalPosBrandOnboardingPresenterKt {
    public static final long LOCAL_CASH_FLIP_DELAY;

    static {
        Duration.Companion companion = Duration.Companion;
        LOCAL_CASH_FLIP_DELAY = DurationKt.toDuration(2, DurationUnit.SECONDS);
    }
}
