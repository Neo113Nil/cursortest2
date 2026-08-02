package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0568q5 {
    public final C0258fd a;

    public C0568q5() {
        this(C0747wb.k().l());
    }

    public final C0560pq a(C0510o5 c0510o5, Ep ep) {
        C0560pq c0560pq = new C0560pq(c0510o5, new C0437lj(ep));
        C0258fd c0258fd = this.a;
        synchronized (c0258fd) {
            c0258fd.c.add(c0560pq);
        }
        return c0560pq;
    }

    public C0568q5(C0258fd c0258fd) {
        this.a = c0258fd;
    }

    public static C0712v5 a(C0510o5 c0510o5) {
        return new C0712v5(new C0654t5(c0510o5), c0510o5);
    }
}
