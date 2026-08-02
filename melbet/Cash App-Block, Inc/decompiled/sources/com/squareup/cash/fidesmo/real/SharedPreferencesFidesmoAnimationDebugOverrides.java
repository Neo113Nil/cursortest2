package com.squareup.cash.fidesmo.real;

import android.content.SharedPreferences;
import com.squareup.cash.fidesmo.api.FidesmoAnimationDebugOverrides;
import com.squareup.cash.fidesmo.api.FidesmoAnimationLocationOverride;
import com.squareup.cash.fidesmo.api.FidesmoAnimationShapeOverride;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class SharedPreferencesFidesmoAnimationDebugOverrides implements FidesmoAnimationDebugOverrides {
    public final SharedPreferences preferences;

    public SharedPreferencesFidesmoAnimationDebugOverrides(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.preferences = sharedPreferences;
    }

    @Override // com.squareup.cash.fidesmo.api.FidesmoAnimationDebugOverrides
    public final FidesmoAnimationLocationOverride locationOverride() {
        Object failure;
        Object obj = FidesmoAnimationLocationOverride.DEFAULT;
        String string2 = this.preferences.getString("fidesmo_animation_location_override", null);
        if (string2 != null) {
            try {
                Result.Companion companion = Result.Companion;
                failure = FidesmoAnimationLocationOverride.valueOf(string2);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            if (!(failure instanceof Result.Failure)) {
                obj = failure;
            }
            obj = (Enum) obj;
        }
        return (FidesmoAnimationLocationOverride) obj;
    }

    @Override // com.squareup.cash.fidesmo.api.FidesmoAnimationDebugOverrides
    public final FidesmoAnimationShapeOverride shapeOverride() {
        Object failure;
        Object obj = FidesmoAnimationShapeOverride.DEFAULT;
        String string2 = this.preferences.getString("fidesmo_animation_shape_override", null);
        if (string2 != null) {
            try {
                Result.Companion companion = Result.Companion;
                failure = FidesmoAnimationShapeOverride.valueOf(string2);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            if (!(failure instanceof Result.Failure)) {
                obj = failure;
            }
            obj = (Enum) obj;
        }
        return (FidesmoAnimationShapeOverride) obj;
    }
}
