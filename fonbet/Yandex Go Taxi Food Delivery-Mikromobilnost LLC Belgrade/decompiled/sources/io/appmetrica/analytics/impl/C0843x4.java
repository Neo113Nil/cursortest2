package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* renamed from: io.appmetrica.analytics.impl.x4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0843x4 extends SimpleThreadSafeToggle {
    public final Lh a;

    public C0843x4(Lh lh) {
        super(lh.e(), "[ClientApiTrackingStatusToggle]");
        this.a = lh;
    }

    public final void a(boolean z) {
        updateState(z);
        this.a.f(z);
    }
}
