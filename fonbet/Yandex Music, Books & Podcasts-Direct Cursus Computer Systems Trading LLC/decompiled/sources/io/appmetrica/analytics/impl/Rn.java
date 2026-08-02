package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class Rn {
    public final Hr a;

    public Rn(Hr hr) {
        this.a = hr;
    }

    public final long a() {
        long optLong;
        Hr hr = this.a;
        synchronized (hr) {
            optLong = hr.a.a().optLong("session_id", -1L);
        }
        long j = optLong >= 10000000000L ? 1 + optLong : 10000000000L;
        this.a.b(j);
        return j;
    }
}
