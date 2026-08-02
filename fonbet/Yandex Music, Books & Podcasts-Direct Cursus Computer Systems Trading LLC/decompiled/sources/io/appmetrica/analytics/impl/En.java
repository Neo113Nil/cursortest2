package io.appmetrica.analytics.impl;

import defpackage.eta;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class En {
    public final P5 a;
    public final Wn b;
    public final Hn c;
    public long d;
    public long e;
    public AtomicLong f;
    public boolean g;
    public volatile Un h;
    public long i;
    public long j;
    public final SystemTimeProvider k;

    public En(P5 p5, Wn wn, Hn hn, SystemTimeProvider systemTimeProvider) {
        this.a = p5;
        this.b = wn;
        this.c = hn;
        this.k = systemTimeProvider;
        a();
    }

    public final void a() {
        Hn hn = this.c;
        long elapsedRealtime = this.k.elapsedRealtime();
        Long l = hn.c;
        if (l != null) {
            elapsedRealtime = l.longValue();
        }
        this.e = elapsedRealtime;
        Long l2 = this.c.b;
        this.d = l2 == null ? -1L : l2.longValue();
        Long l3 = this.c.e;
        this.f = new AtomicLong(l3 == null ? 0L : l3.longValue());
        Boolean bool = this.c.f;
        this.g = bool == null ? true : bool.booleanValue();
        Long l4 = this.c.g;
        long longValue = l4 != null ? l4.longValue() : 0L;
        this.i = longValue;
        Hn hn2 = this.c;
        long j = longValue - this.e;
        Long l5 = hn2.h;
        if (l5 != null) {
            j = l5.longValue();
        }
        this.j = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{id=");
        sb.append(this.d);
        sb.append(", creationTime=");
        sb.append(this.e);
        sb.append(", currentReportId=");
        sb.append(this.f);
        sb.append(", sessionRequestParams=");
        sb.append(this.h);
        sb.append(", sleepStart=");
        return eta.g(sb, this.i, '}');
    }
}
