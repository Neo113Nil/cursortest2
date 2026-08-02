package io.appmetrica.analytics.impl;

import defpackage.unr0;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes9.dex */
public final class Wn {
    public final S5 a;
    public final C0689ro b;
    public final Zn c;
    public long d;
    public long e;
    public long f;
    public AtomicLong g;
    public boolean h;
    public long i;
    public long j;
    public boolean k;
    public final SystemTimeProvider l;

    public Wn(S5 s5, C0689ro c0689ro, Zn zn, SystemTimeProvider systemTimeProvider) {
        this.a = s5;
        this.b = c0689ro;
        this.c = zn;
        this.l = systemTimeProvider;
        a();
    }

    public final void a() {
        Zn zn = this.c;
        long elapsedRealtime = this.l.elapsedRealtime();
        Long l = zn.c;
        if (l != null) {
            elapsedRealtime = l.longValue();
        }
        this.e = elapsedRealtime;
        Zn zn2 = this.c;
        long currentTimeMillis = this.l.currentTimeMillis();
        Long l2 = zn2.d;
        if (l2 != null) {
            currentTimeMillis = l2.longValue();
        }
        this.f = currentTimeMillis;
        Long l3 = this.c.b;
        this.d = l3 == null ? -1L : l3.longValue();
        Long l4 = this.c.f;
        this.g = new AtomicLong(l4 == null ? 0L : l4.longValue());
        Boolean bool = this.c.g;
        this.h = bool == null ? true : bool.booleanValue();
        Long l5 = this.c.h;
        long longValue = l5 != null ? l5.longValue() : 0L;
        this.i = longValue;
        Zn zn3 = this.c;
        long j = longValue - this.e;
        Long l6 = zn3.i;
        if (l6 != null) {
            j = l6.longValue();
        }
        this.j = j;
        Boolean bool2 = this.c.j;
        this.k = bool2 == null ? false : bool2.booleanValue();
    }

    public final synchronized void b() {
        this.k = true;
        C0689ro c0689ro = this.b;
        c0689ro.a(C0689ro.k, Boolean.TRUE);
        c0689ro.a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{id=");
        sb.append(this.d);
        sb.append(", creationTime=");
        sb.append(this.e);
        sb.append(", sessionCreationCurrentTimeMillis=");
        sb.append(this.f);
        sb.append(", currentReportId=");
        sb.append(this.g);
        sb.append(", sessionRequestParams=null, sleepStart=");
        sb.append(this.i);
        sb.append(", aliveNeeded=");
        sb.append(this.h);
        sb.append(", crashedSession=");
        return unr0.u(sb, this.k, '}');
    }
}
