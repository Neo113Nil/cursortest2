package com.datadog.trace.api;

import androidx.paging.LoadState;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes4.dex */
public final class IdGenerationStrategy$Random extends LoadState {
    @Override // androidx.paging.LoadState
    public final long getNonZeroPositiveLong() {
        return ThreadLocalRandom.current().nextLong(0L, Long.MAX_VALUE) + 1;
    }
}
