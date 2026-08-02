package io.appmetrica.analytics.push.impl;

/* renamed from: io.appmetrica.analytics.push.impl.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1086x {
    public final M1 a;
    public final String b;

    public C1086x(M1 m1, String str) {
        this.a = m1;
        this.b = str;
    }

    public final synchronized long a() {
        long j;
        M1 m1 = this.a;
        String str = this.b;
        m1.getClass();
        j = m1.a.getSharedPreferences(m1.b, 0).getLong("appmetrica_tracker_event_id_" + str, -1L) + 1;
        this.a.a(this.b, j);
        return j;
    }
}
