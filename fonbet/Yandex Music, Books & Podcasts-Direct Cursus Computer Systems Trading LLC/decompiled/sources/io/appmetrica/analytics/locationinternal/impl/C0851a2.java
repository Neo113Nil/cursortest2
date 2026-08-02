package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0851a2 extends SimpleThreadSafeToggle implements J0 {
    public C0851a2() {
        super(false, "[RemoteConfigBasedTrackingStatusToggle]");
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.J0
    public final void a(@NotNull C0856c c0856c) {
        boolean z;
        I0 i0 = c0856c.b;
        if (!i0.a && !i0.b && !i0.e) {
            C0906r0 c0906r0 = c0856c.c;
            if (!c0906r0.a && !c0906r0.b && !c0906r0.d) {
                z = false;
                updateState(z);
            }
        }
        z = true;
        updateState(z);
    }
}
