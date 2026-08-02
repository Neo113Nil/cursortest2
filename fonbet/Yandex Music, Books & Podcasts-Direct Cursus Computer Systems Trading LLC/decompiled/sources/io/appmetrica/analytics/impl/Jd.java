package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.impl.Jd;

/* loaded from: classes5.dex */
public final class Jd {
    public int a = 5;
    public final C0215e b;

    public Jd(InterfaceC0389k0 interfaceC0389k0) {
        this.b = new C0215e(new C0201dd(interfaceC0389k0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C0215e c0215e = this.b;
        c0215e.a.add(new InterfaceC0158c() { // from class: f2f
            @Override // io.appmetrica.analytics.impl.InterfaceC0158c
            public final void onAppNotResponding() {
                Jd.b(AnrListener.this);
            }
        });
    }
}
