package io.appmetrica.analytics.impl;

import h1.C0239i;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;

/* loaded from: classes.dex */
public final class Rb extends kotlin.jvm.internal.j implements t1.l {

    /* renamed from: a, reason: collision with root package name */
    public static final Rb f4994a = new Rb();

    public Rb() {
        super(1);
    }

    @Override // t1.l
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return C0239i.f3393a;
    }
}
