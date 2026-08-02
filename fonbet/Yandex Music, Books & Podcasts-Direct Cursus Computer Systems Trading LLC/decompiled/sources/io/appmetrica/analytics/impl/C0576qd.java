package io.appmetrica.analytics.impl;

import defpackage.uif;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0576qd extends uif implements Function1 {
    public static final C0576qd a = new C0576qd();

    public C0576qd() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).startLocationTracking();
        return Unit.a;
    }
}
