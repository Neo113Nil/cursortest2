package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0928a2 extends SimpleThreadSafeToggle implements J0 {
    public C0928a2() {
        super(false, "[RemoteConfigBasedTrackingStatusToggle]");
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.J0
    public final void a(C0933c c0933c) {
        boolean z;
        I0 i0 = c0933c.b;
        if (!i0.a && !i0.b && !i0.e) {
            C0981r0 c0981r0 = c0933c.c;
            if (!c0981r0.a && !c0981r0.b && !c0981r0.d) {
                z = false;
                updateState(z);
            }
        }
        z = true;
        updateState(z);
    }
}
