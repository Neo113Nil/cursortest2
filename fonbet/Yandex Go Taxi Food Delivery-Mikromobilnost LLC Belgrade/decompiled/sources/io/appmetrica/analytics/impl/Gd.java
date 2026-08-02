package io.appmetrica.analytics.impl;

import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class Gd extends Lambda implements tls {
    public static final Gd a = new Gd();

    public Gd() {
        super(1);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).startLocationTracking();
        return zy11.a;
    }
}
