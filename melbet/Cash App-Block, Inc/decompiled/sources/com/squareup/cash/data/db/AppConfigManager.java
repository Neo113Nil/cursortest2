package com.squareup.cash.data.db;

import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes.dex */
public interface AppConfigManager {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long TTL;

        static {
            Duration.Companion companion = Duration.Companion;
            TTL = DurationKt.toDuration(5, DurationUnit.MINUTES);
        }
    }
}
