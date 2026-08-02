package androidx.glance.session;

import android.os.PowerManager;

/* loaded from: classes3.dex */
public final class Api23Impl {
    public static final Api23Impl INSTANCE = new Api23Impl();

    public final boolean isIdle(PowerManager powerManager) {
        return powerManager.isDeviceIdleMode();
    }
}
