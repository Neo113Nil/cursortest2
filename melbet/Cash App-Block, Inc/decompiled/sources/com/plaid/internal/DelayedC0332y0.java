package com.plaid.internal;

import com.plaid.link.event.LinkEvent;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.y0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DelayedC0332y0 implements Delayed {
    public final LinkEvent a;
    public final long b;

    public DelayedC0332y0(LinkEvent linkEvent, int i) {
        linkEvent.getClass();
        this.a = linkEvent;
        this.b = System.currentTimeMillis() + i;
    }

    public final LinkEvent a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        delayed2.getClass();
        return Intrinsics.compare(this.b, ((DelayedC0332y0) delayed2).b);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        timeUnit.getClass();
        return timeUnit.convert(this.b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
}
