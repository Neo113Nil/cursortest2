package com.squareup.cash.nearby.backend;

import com.squareup.cash.nearby.backend.ble.RealBleManager;
import com.squareup.cash.util.clock.AndroidClock;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class RealNearbyAdvertiser {
    public final RealBleManager bleManager;
    public final AndroidClock clock;
    public boolean isScanning;
    public final LinkedHashMap activeAdvertisements = new LinkedHashMap();
    public final LinkedHashMap listeners = new LinkedHashMap();

    public RealNearbyAdvertiser(RealBleManager realBleManager, AndroidClock androidClock) {
        this.bleManager = realBleManager;
        this.clock = androidClock;
    }
}
