package com.squareup.cash.family.familyhub.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class DependentControlViewEvent$P2PEvent$AllowlistToggleChanged implements DependentControlViewEvent {
    public final boolean enable;

    public DependentControlViewEvent$P2PEvent$AllowlistToggleChanged(boolean z) {
        this.enable = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DependentControlViewEvent$P2PEvent$AllowlistToggleChanged) && this.enable == ((DependentControlViewEvent$P2PEvent$AllowlistToggleChanged) obj).enable;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enable);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("AllowlistToggleChanged(enable=", ")", this.enable);
    }
}
