package com.squareup.cash.arcade.components.haptic;

import android.os.Vibrator;
import com.squareup.cash.arcade.Haptics;

/* loaded from: classes.dex */
public final class RealHapticVibrator {
    public final Vibrator vibrator;

    public final boolean equals(Object obj) {
        if (obj instanceof RealHapticVibrator) {
            return this.vibrator.equals(((RealHapticVibrator) obj).vibrator);
        }
        return false;
    }

    public final int hashCode() {
        return this.vibrator.hashCode();
    }

    public final String toString() {
        return "RealHapticVibrator(vibrator=" + this.vibrator + ")";
    }

    public final void vibrate(Haptics.VibrationEffectFactory vibrationEffectFactory) {
        vibrationEffectFactory.getClass();
        this.vibrator.vibrate(vibrationEffectFactory.create());
    }
}
