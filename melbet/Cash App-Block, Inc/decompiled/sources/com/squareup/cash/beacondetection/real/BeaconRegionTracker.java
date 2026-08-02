package com.squareup.cash.beacondetection.real;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final class BeaconRegionTracker {
    public final Function0 clock;
    public final long exitTimeoutMs;
    public boolean inRegion;
    public Long lastDetectionTime;

    /* renamed from: com.squareup.cash.beacondetection.real.BeaconRegionTracker$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public BeaconRegionTracker() {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        this.exitTimeoutMs = 30000L;
        this.clock = anonymousClass1;
    }

    public final synchronized BeaconRegionTracker$Event$RegionEnter onBeaconDetected() {
        long longValue = ((Number) this.clock.invoke()).longValue();
        Long l = this.lastDetectionTime;
        this.lastDetectionTime = Long.valueOf(longValue);
        if (!this.inRegion) {
            this.inRegion = true;
            return BeaconRegionTracker$Event$RegionEnter.INSTANCE;
        }
        if (l == null || longValue - l.longValue() <= this.exitTimeoutMs) {
            return null;
        }
        return BeaconRegionTracker$Event$RegionEnter.INSTANCE;
    }

    public final synchronized void reset() {
        this.inRegion = false;
        this.lastDetectionTime = null;
    }
}
