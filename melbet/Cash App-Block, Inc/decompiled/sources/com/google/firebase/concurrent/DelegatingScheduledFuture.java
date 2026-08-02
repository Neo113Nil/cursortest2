package com.google.firebase.concurrent;

import androidx.concurrent.futures.AbstractResolvableFuture;
import com.squareup.scannerview.SizeMap;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class DelegatingScheduledFuture extends AbstractResolvableFuture implements ScheduledFuture {
    public final ScheduledFuture upstreamFuture;

    public interface Resolver {
        ScheduledFuture addCompleter(SizeMap sizeMap);
    }

    public DelegatingScheduledFuture(Resolver resolver) {
        this.upstreamFuture = resolver.addCompleter(new SizeMap(this, 6));
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final void afterDone() {
        ScheduledFuture scheduledFuture = this.upstreamFuture;
        Object obj = this.value;
        scheduledFuture.cancel((obj instanceof AbstractResolvableFuture.Cancellation) && ((AbstractResolvableFuture.Cancellation) obj).wasInterrupted);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.upstreamFuture.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.upstreamFuture.getDelay(timeUnit);
    }
}
