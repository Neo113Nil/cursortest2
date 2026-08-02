package io.appmetrica.analytics.impl;

import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class Hd extends Lambda implements tls {
    public static final Hd a = new Hd();

    public Hd() {
        super(1);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return zy11.a;
    }
}
