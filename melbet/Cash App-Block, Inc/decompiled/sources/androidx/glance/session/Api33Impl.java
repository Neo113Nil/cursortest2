package androidx.glance.session;

import android.os.PowerManager;

/* loaded from: classes3.dex */
public final class Api33Impl {
    public static final Api33Impl INSTANCE = new Api33Impl();

    public final boolean isLightIdleOrLowPowerStandby(PowerManager powerManager) {
        return powerManager.isLowPowerStandbyEnabled() || powerManager.isDeviceLightIdleMode();
    }
}
