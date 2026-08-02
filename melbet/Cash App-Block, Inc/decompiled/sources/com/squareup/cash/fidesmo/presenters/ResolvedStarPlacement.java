package com.squareup.cash.fidesmo.presenters;

import com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ResolvedStarPlacement {
    public final ScanningStarPlacement placement;
    public final StarPlacementSource source;

    public ResolvedStarPlacement(ScanningStarPlacement scanningStarPlacement, StarPlacementSource starPlacementSource) {
        scanningStarPlacement.getClass();
        this.placement = scanningStarPlacement;
        this.source = starPlacementSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedStarPlacement)) {
            return false;
        }
        ResolvedStarPlacement resolvedStarPlacement = (ResolvedStarPlacement) obj;
        return Intrinsics.areEqual(this.placement, resolvedStarPlacement.placement) && this.source == resolvedStarPlacement.source;
    }

    public final int hashCode() {
        return this.source.hashCode() + (this.placement.hashCode() * 31);
    }

    public final String toString() {
        return "ResolvedStarPlacement(placement=" + this.placement + ", source=" + this.source + ")";
    }
}
