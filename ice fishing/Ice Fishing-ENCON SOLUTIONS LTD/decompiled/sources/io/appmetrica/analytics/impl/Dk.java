package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class Dk {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f4310a;

    /* renamed from: b, reason: collision with root package name */
    public final Uk f4311b;

    /* renamed from: c, reason: collision with root package name */
    public final Gk f4312c;

    /* renamed from: d, reason: collision with root package name */
    public long f4313d;

    /* renamed from: e, reason: collision with root package name */
    public long f4314e;

    /* renamed from: f, reason: collision with root package name */
    public AtomicLong f4315f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4316g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Sk f4317h;

    /* renamed from: i, reason: collision with root package name */
    public long f4318i;

    /* renamed from: j, reason: collision with root package name */
    public long f4319j;

    /* renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f4320k;

    public Dk(X4 x4, Uk uk, Gk gk, SystemTimeProvider systemTimeProvider) {
        this.f4310a = x4;
        this.f4311b = uk;
        this.f4312c = gk;
        this.f4320k = systemTimeProvider;
        a();
    }

    public final void a() {
        Gk gk = this.f4312c;
        long elapsedRealtime = this.f4320k.elapsedRealtime();
        Long l2 = gk.f4436c;
        if (l2 != null) {
            elapsedRealtime = l2.longValue();
        }
        this.f4314e = elapsedRealtime;
        Long l3 = this.f4312c.f4435b;
        this.f4313d = l3 == null ? -1L : l3.longValue();
        Long l4 = this.f4312c.f4438e;
        this.f4315f = new AtomicLong(l4 == null ? 0L : l4.longValue());
        Boolean bool = this.f4312c.f4439f;
        this.f4316g = bool == null ? true : bool.booleanValue();
        Long l5 = this.f4312c.f4440g;
        long longValue = l5 != null ? l5.longValue() : 0L;
        this.f4318i = longValue;
        Gk gk2 = this.f4312c;
        long j2 = longValue - this.f4314e;
        Long l6 = gk2.f4441h;
        if (l6 != null) {
            j2 = l6.longValue();
        }
        this.f4319j = j2;
    }

    public final String toString() {
        return "Session{id=" + this.f4313d + ", creationTime=" + this.f4314e + ", currentReportId=" + this.f4315f + ", sessionRequestParams=" + this.f4317h + ", sleepStart=" + this.f4318i + '}';
    }
}
