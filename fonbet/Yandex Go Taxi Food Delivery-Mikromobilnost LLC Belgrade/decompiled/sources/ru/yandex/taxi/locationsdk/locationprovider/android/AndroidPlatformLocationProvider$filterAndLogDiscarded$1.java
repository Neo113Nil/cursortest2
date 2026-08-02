package ru.yandex.taxi.locationsdk.locationprovider.android;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference0Impl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class AndroidPlatformLocationProvider$filterAndLogDiscarded$1 extends PropertyReference0Impl {
    @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
    public final Object get() {
        ((a) this.receiver).getClass();
        return Long.valueOf(SystemClock.elapsedRealtimeNanos());
    }
}
