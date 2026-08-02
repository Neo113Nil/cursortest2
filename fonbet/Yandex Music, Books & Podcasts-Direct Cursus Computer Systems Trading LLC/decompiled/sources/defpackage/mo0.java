package defpackage;

import android.os.PowerManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class mo0 {
    public static final mo0 a = new mo0();

    public final boolean a(@NotNull PowerManager powerManager) {
        return powerManager.isLowPowerStandbyEnabled() || powerManager.isDeviceLightIdleMode();
    }
}
