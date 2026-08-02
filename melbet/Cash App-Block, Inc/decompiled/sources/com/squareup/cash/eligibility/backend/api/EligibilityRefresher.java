package com.squareup.cash.eligibility.backend.api;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes.dex */
public interface EligibilityRefresher {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes6.dex */
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long MAX_DELAY_BETWEEN_ATTEMPTS;

        static {
            Duration.Companion companion = Duration.Companion;
            MAX_DELAY_BETWEEN_ATTEMPTS = DurationKt.toDuration(1, DurationUnit.MINUTES);
        }
    }
}
