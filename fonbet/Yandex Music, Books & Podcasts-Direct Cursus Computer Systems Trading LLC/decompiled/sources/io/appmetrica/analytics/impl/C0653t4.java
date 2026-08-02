package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.t4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0653t4 extends SimpleThreadSafeToggle {
    public final C0724vh a;

    public C0653t4(@NotNull C0724vh c0724vh) {
        super(c0724vh.e(), "[ClientApiTrackingStatusToggle]");
        this.a = c0724vh;
    }

    public final void a(boolean z) {
        updateState(z);
        this.a.f(z);
    }
}
