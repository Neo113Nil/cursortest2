package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class I8 {
    public final C0258fd a;

    public I8() {
        this(C0747wb.k().l());
    }

    public final Q8 a(J8 j8, N5 n5, Sn sn, Hr hr) {
        Q8 q8 = new Q8(j8, n5.a(), sn, hr);
        C0258fd c0258fd = this.a;
        synchronized (c0258fd) {
            c0258fd.c.add(q8);
        }
        return q8;
    }

    public I8(C0258fd c0258fd) {
        this.a = c0258fd;
    }
}
