package com.squareup.cash.family.familyhub.backend.real.sync;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class TargetEntityManager$TargetEntityEvent$Refresh {
    public final boolean clearCache;

    public TargetEntityManager$TargetEntityEvent$Refresh(boolean z) {
        this.clearCache = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TargetEntityManager$TargetEntityEvent$Refresh) && this.clearCache == ((TargetEntityManager$TargetEntityEvent$Refresh) obj).clearCache;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.clearCache);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("Refresh(clearCache=", ")", this.clearCache);
    }
}
