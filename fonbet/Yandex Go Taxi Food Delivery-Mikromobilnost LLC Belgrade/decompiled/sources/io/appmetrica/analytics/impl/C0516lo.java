package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.lo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0516lo {
    public final as a;

    public C0516lo(as asVar) {
        this.a = asVar;
    }

    public final long a() {
        long optLong;
        as asVar = this.a;
        synchronized (asVar) {
            optLong = asVar.a.a().optLong("session_id", -1L);
        }
        long j = optLong >= 10000000000L ? 1 + optLong : 10000000000L;
        this.a.b(j);
        return j;
    }
}
