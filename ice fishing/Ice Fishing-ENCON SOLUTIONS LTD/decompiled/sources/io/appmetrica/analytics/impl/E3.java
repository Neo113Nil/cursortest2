package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* loaded from: classes.dex */
public final class E3 extends SimpleThreadSafeToggle {

    /* renamed from: a, reason: collision with root package name */
    public final Ze f4339a;

    public E3(Ze ze) {
        super(ze.e(), "[ClientApiTrackingStatusToggle]");
        this.f4339a = ze;
    }

    public final void a(boolean z2) {
        updateState(z2);
        this.f4339a.f(z2);
    }
}
