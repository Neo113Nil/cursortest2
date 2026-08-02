package com.squareup.cash.integration.analytics;

import com.squareup.cash.cdf.Event;
import com.squareup.util.coroutines.StateFlowKt;
import dev.zacsweers.metro.internal.Factory;
import kotlin.Pair;
import kotlinx.coroutines.channels.BufferedChannel;
import papa.PapaEvent;

/* loaded from: classes.dex */
public final class AppAnalyticsQueue implements Analytics {
    public final BufferedChannel eventQueue = PapaEvent.Channel$default(-2, null, null, 6);

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new AppAnalyticsQueue();
        }
    }

    @Override // com.squareup.cash.integration.analytics.Analytics
    public final void track(Event event, Long l) {
        event.getClass();
        StateFlowKt.sendOrThrow$default(this.eventQueue, new Pair(event, l));
    }
}
