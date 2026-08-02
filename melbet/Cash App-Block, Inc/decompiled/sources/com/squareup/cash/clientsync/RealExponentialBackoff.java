package com.squareup.cash.clientsync;

import kotlin.random.Random;

/* loaded from: classes.dex */
public final class RealExponentialBackoff {
    public int attempt;
    public final long baseInterval;
    public final long maxInterval;
    public final Random random;

    public RealExponentialBackoff(long j, long j2, Random.Default r5) {
        r5.getClass();
        this.baseInterval = j;
        this.maxInterval = j2;
        this.random = r5;
    }

    public RealExponentialBackoff(long j, long j2) {
        this.baseInterval = j;
        this.maxInterval = j2;
        this.random = Random.Default;
    }
}
