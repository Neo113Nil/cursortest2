package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483ic {

    /* renamed from: a, reason: collision with root package name */
    public int f6185a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final C0366e f6186b;

    public C0483ic(InterfaceC0419g0 interfaceC0419g0) {
        this.f6186b = new C0366e(new Db(interfaceC0419g0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C0366e c0366e = this.f6186b;
        c0366e.f5852a.add(new InterfaceC0315c() { // from class: io.appmetrica.analytics.impl.Xo
            @Override // io.appmetrica.analytics.impl.InterfaceC0315c
            public final void onAppNotResponding() {
                C0483ic.b(AnrListener.this);
            }
        });
    }
}
