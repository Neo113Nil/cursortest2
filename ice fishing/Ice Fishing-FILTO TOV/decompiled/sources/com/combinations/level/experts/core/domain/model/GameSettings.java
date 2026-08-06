package com.combinations.level.experts.core.domain.model;

import defpackage.mr0;
import defpackage.wj;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class GameSettings {
    public static final int $stable = 0;
    private final boolean animationsEnabled;
    private final boolean hapticsEnabled;
    private final boolean timerVisible;

    public /* synthetic */ GameSettings(boolean z, boolean z2, boolean z3, int i, wj wjVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }

    public static /* synthetic */ GameSettings copy$default(GameSettings gameSettings, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = gameSettings.hapticsEnabled;
        }
        if ((i & 2) != 0) {
            z2 = gameSettings.animationsEnabled;
        }
        if ((i & 4) != 0) {
            z3 = gameSettings.timerVisible;
        }
        return gameSettings.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.hapticsEnabled;
    }

    public final boolean component2() {
        return this.animationsEnabled;
    }

    public final boolean component3() {
        return this.timerVisible;
    }

    public final GameSettings copy(boolean z, boolean z2, boolean z3) {
        return new GameSettings(z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameSettings)) {
            return false;
        }
        GameSettings gameSettings = (GameSettings) obj;
        return this.hapticsEnabled == gameSettings.hapticsEnabled && this.animationsEnabled == gameSettings.animationsEnabled && this.timerVisible == gameSettings.timerVisible;
    }

    public final boolean getAnimationsEnabled() {
        return this.animationsEnabled;
    }

    public final boolean getHapticsEnabled() {
        return this.hapticsEnabled;
    }

    public final boolean getTimerVisible() {
        return this.timerVisible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.timerVisible) + mr0.xqGvceK5x(Boolean.hashCode(this.hapticsEnabled) * 31, 31, this.animationsEnabled);
    }

    public String toString() {
        return "GameSettings(hapticsEnabled=" + this.hapticsEnabled + ", animationsEnabled=" + this.animationsEnabled + ", timerVisible=" + this.timerVisible + ")";
    }

    public GameSettings(boolean z, boolean z2, boolean z3) {
        this.hapticsEnabled = z;
        this.animationsEnabled = z2;
        this.timerVisible = z3;
    }

    public GameSettings() {
        this(false, false, false, 7, null);
    }
}
