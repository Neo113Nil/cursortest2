package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.impl.Zd;

/* loaded from: classes9.dex */
public final class Zd {
    public int a = 5;
    public final C0289e b;

    public Zd(InterfaceC0521m0 interfaceC0521m0) {
        this.b = new C0289e(new C0736td(interfaceC0521m0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C0289e c0289e = this.b;
        c0289e.a.add(new InterfaceC0232c() { // from class: ec61
            @Override // io.appmetrica.analytics.impl.InterfaceC0232c
            public final void onAppNotResponding() {
                Zd.b(AnrListener.this);
            }
        });
    }
}
