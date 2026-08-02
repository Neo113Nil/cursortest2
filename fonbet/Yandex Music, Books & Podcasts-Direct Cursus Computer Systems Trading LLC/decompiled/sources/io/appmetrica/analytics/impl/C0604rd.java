package io.appmetrica.analytics.impl;

import defpackage.uif;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.rd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0604rd extends uif implements Function1 {
    public static final C0604rd a = new C0604rd();

    public C0604rd() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return Unit.a;
    }
}
