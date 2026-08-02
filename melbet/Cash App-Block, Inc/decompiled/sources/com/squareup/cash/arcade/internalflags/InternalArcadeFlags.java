package com.squareup.cash.arcade.internalflags;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class InternalArcadeFlags {
    public static final InternalArcadeFlags Default = new InternalArcadeFlags(false);
    public final boolean hapticsImprovementsEnabled;

    public InternalArcadeFlags(boolean z) {
        this.hapticsImprovementsEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InternalArcadeFlags) && this.hapticsImprovementsEnabled == ((InternalArcadeFlags) obj).hapticsImprovementsEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hapticsImprovementsEnabled);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("InternalArcadeFlags(hapticsImprovementsEnabled=", ")", this.hapticsImprovementsEnabled);
    }
}
