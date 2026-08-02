package defpackage;

import android.os.PowerManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ho0 {
    public static final ho0 a = new ho0();

    public final boolean a(@NotNull PowerManager powerManager) {
        return powerManager.isDeviceIdleMode();
    }
}
